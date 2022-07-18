package com.codebigbear.kafkaproducer.controller;

import com.codebigbear.avro.Email;
import com.codebigbear.kafkaproducer.model.UserEntity;
import com.codebigbear.kafkaproducer.producer.Sender;
import com.codebigbear.kafkaproducer.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
 
@RestController
@RequestMapping("/EmailCampaign")
public class EmailController
{
    @Autowired
    EmailService service;

    @Autowired
    Sender sender;

 
    @GetMapping
    public ResponseEntity<List<UserEntity>> getAlluserEmails(
                        @RequestHeader(name="customerCategoryCode") String CategoryCode,
                      @RequestHeader(name="campaignTemplateId") Integer templateId,
                        @RequestParam(defaultValue = "0") Integer pageNo)
    {
        List<UserEntity> list = service.getAllUsers(CategoryCode, pageNo, 5000);
      list.forEach(userEntity ->{
  Email email = new Email();
  email.setEmailId(userEntity.getEmail());
  email.setTemplateId(templateId);
  sender.send(email);
});
        return new ResponseEntity<List<EmployeeEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
  
}
