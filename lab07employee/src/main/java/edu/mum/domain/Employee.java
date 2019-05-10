package edu.mum.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class Employee  implements Serializable {
    private static final long serialVersionUID = -908L;

	private Long id;
 	@NotBlank          // any characters including "space"
   	@Size(min=4, max=50, message="{Size.name.validation}")
	private String firstName;
	@NotBlank(message="Enter the last name")
	private String lastName;

    @DateTimeFormat(pattern = "MM-dd-yyyy")
  	private Date birthDate;
	
	
//	@NotEmpty            //Gives NO Integer validation exception
 	@NotNull
	private Integer salaryLevel;
	
 	MultipartFile image;
 	
	@Valid
	private Address address;

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Integer getSalaryLevel() {
		return salaryLevel;
	}
	public void setSalaryLevel(Integer salaryLevel) {
		this.salaryLevel = salaryLevel;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}

}
