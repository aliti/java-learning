package com.aliti.learning.proxy.poc;

import com.aliti.learning.proxy.poc.model.INlaIdentifier;
import com.aliti.learning.proxy.poc.service.IScheduleService;
import com.aliti.learning.proxy.poc.service.LesseeScheduleService;
import com.aliti.learning.proxy.poc.service.LessorScheduleService;
import com.aliti.learning.proxy.poc.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.stream.Stream;

@Configuration
public class NlaServiceProxy {

  @Autowired
  LessorScheduleService lessorScheduleService;
  @Autowired
  LesseeScheduleService lesseeScheduleService;

  @Bean
  public IScheduleService scheduleService() {
    return (IScheduleService) Proxy.newProxyInstance(
        ScheduleService.class.getClassLoader(),
        new Class[] {IScheduleService.class},
        new NlaServiceHandle(lessorScheduleService, lesseeScheduleService));
  }

  private static class NlaServiceHandle implements InvocationHandler {

    private final Object lessorService;
    private final Object lesseeService;

    public NlaServiceHandle(Object lessorService, Object lesseeService) {
      this.lesseeService = lesseeService;
      this.lessorService= lessorService;
    }

    @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      if (args == null) {
        //Assuming if no args are provided then the method implementation is in the parent abstract class so we can call either lessor or lessee service
        return method.invoke(lessorService);
      }

      // Find the identifier in your args
      INlaIdentifier identifier = (INlaIdentifier) Stream.of(args).filter(arg -> arg instanceof INlaIdentifier).findFirst().orElse(null);
      if (identifier == null) {
        //Assuming if no identifier is provided then the method implementation is in the parent abstract class so we can call either lessor or lessee service
        return method.invoke(lessorService, args);
      }

      // Based on identifier figure out lessor/lessee
      Object service = identifier.isLessor() ? lessorService : lesseeService;

      // based on the service instance call the implementation of the "method" with args and return
      Method actualMethod = Arrays.stream(service.getClass().getMethods()).filter(m -> m.getName().equals(method.getName())).findFirst().orElse(null);
      if (actualMethod == null) {
        //Assuming if the method does not exist on the implementation then the method implementation is in the parent abstract class so we can call the original method
        return method.invoke(service, args);
      }

      return actualMethod.invoke(service, args);
    }
  }

}
