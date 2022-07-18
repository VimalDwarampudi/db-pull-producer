package com.codebigbear.kafkaproducer.model;

import javax.persistence.*;

@Entity
@Table(name="USER_INFO")
public class UserEntity {

    @Id
    @Column(name="ID")
    private Long id;
    
    @Column(name="CUST_CATG_CODE")
    private String categoryCode;
    
    @Column(name="EMAIL")
    private String email;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode){
		this.categoryCode = categoryCode;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", categoryCode;=" + categoryCode + 
                ", email=" + email   + "]";
    }
}
