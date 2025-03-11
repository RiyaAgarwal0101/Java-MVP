package com.example.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import java.util.List;
@Document(collection = "training_centers")
public class TrainingCenter {
   @Id
   private String id;
   
   @NotBlank(message = "Center Name is required")
   @Size(max = 40, message = "Center Name should be less than 40 characters")
   private String centerName;
   
   @NotBlank(message = "Center Code is required")
   @Size(min = 12, max = 12, message = "Center Code must be exactly 12 characters")
   @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Center Code should be alphanumeric")
   private String centerCode;
   
   private Address address;
   
   private int studentCapacity;
   
   private List<String> coursesOffered;
   
   private long createdOn;
   
   @Email(message = "Invalid email")
   private String contactEmail;
   
   @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
   private String contactPhone;
   // Getters and Setters
   public String getId() {
       return id;
   }
   public void setId(String id) {
       this.id = id;
   }
   public String getCenterName() {
       return centerName;
   }
   public void setCenterName(String centerName) {
       this.centerName = centerName;
   }
   public String getCenterCode() {
       return centerCode;
   }
   public void setCenterCode(String centerCode) {
       this.centerCode = centerCode;
   }
   public Address getAddress() {
       return address;
   }
   public void setAddress(Address address) {
       this.address = address;
   }
   public int getStudentCapacity() {
       return studentCapacity;
   }
   public void setStudentCapacity(int studentCapacity) {
       this.studentCapacity = studentCapacity;
   }
   public List<String> getCoursesOffered() {
       return coursesOffered;
   }
   public void setCoursesOffered(List<String> coursesOffered) {
       this.coursesOffered = coursesOffered;
   }
   public long getCreatedOn() {
       return createdOn;
   }
   public void setCreatedOn(long createdOn) {
       this.createdOn = createdOn;
   }
   public String getContactEmail() {
       return contactEmail;
   }
   public void setContactEmail(String contactEmail) {
       this.contactEmail = contactEmail;
   }
   public String getContactPhone() {
       return contactPhone;
   }
   public void setContactPhone(String contactPhone) {
       this.contactPhone = contactPhone;
   }
}
class Address {
   private String detailedAddress;
   private String city;
   private String state;
   private String pincode;
   // Getters and Setters
   public String getDetailedAddress() {
	   return detailedAddress;
	   }
	   public void setDetailedAddress(String detailedAddress) {
	   this.detailedAddress = detailedAddress;
	   }
	   public String getCity() {
	   return city;
	   }
	   public void setCity(String city) {
	   this.city = city;
	   }
	   public String getState() {
	   return state;
	   }
	   public void setState(String state) {
	   this.state = state;
	   }
	   public String getPincode() {
	   return pincode;
	   }
	   public void setPincode(String pincode) {
	   this.pincode = pincode;
	   }
	   }

