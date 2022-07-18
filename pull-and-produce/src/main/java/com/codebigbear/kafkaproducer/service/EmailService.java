package com.codebigbear.kafkaproducer.service;

import com.codebigbear.kafkaproducer.model.UserEntity;
import com.codebigbear.kafkaproducer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.*;
 
@Service
public class EmailService {
     
    @Autowired
    UserRepository repository;
     
	@Cacheable(value="users", key ="#pageNo")
    public List<UserEntity> getAllUsers(String CategoryCode, Integer pageNo, Integer pageSize)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize);
 
        Page<UserEntity> pagedResult = repository.findUserEntitiesByCategoryCode(CategoryCode,paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<UserEntity>();
        }
    }
     
}
