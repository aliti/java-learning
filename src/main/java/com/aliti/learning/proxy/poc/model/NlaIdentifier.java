package com.aliti.learning.proxy.poc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NlaIdentifier implements INlaIdentifier {

  private String activationGroupRevisionId;

  public boolean isLessor() {
    return activationGroupRevisionId.contains("lessor");
  }

  public boolean isLessee() {
    return activationGroupRevisionId.contains("lessee");
  }

}
