package com.codebigbear.kafkaproducer.repository;

import com.codebigbear.kafkaproducer.model.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
 
@Repository
public interface UserRepository
        extends JpaRepository<UserEntity, Long> {

@Query(value= "SELECT * FROM UserEntity WHERE categorycode= ?1 ORDER BY /*#pageable*/",countQuery = " SELECT count(*) FROM USERS where categorycode = ?1",nativeQuery = true)
Page<UserEntity> findUserEntitiesByCategoryCode(String categorycode, Pageable pageable);
 
}
