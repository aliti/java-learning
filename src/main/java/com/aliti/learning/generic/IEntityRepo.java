package com.aliti.learning.generic;

import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@NoRepositoryBean
public interface IEntityRepo<T, K extends Serializable> extends PagingAndSortingRepository<T, K>, JpaSpecificationExecutor<T> {
}
