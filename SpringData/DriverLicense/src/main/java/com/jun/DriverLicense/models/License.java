package com.jun.DriverLicense.models;


import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")
public class License {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expiration_date;
    private String state;
    private Date createdAt;
    private Date updatedAt;
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;
    private String number;
    private static Long counter = (long) 0;
    
    public Long getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getExpiration_date() {
		return expiration_date;
	}

	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public License() {
        
    }
    
    public License(String state, Person person, Date expiration_date) {
    		this.expiration_date = expiration_date;
        this.state = state;
        this.person = person;
        this.number = generateNumber();
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
    
    public static String generateNumber() {
    		counter++;
    		String counterS = counter.toString();
    		String count = "";
    		for(int i = 0; i < (6 - counterS.length()); i ++) {
    			count += "0";
    		}
    		count += counterS;
    		return count;
    }
    
}
