package com.example.demo.Entity;



import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "holidays")
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate holidayDate;
    private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getHolidayDate() {
		return holidayDate;
	}
	public void setHolidayDate(LocalDate holidayDate) {
		this.holidayDate = holidayDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Holiday(Long id, LocalDate holidayDate, String description) {
		super();
		this.id = id;
		this.holidayDate = holidayDate;
		this.description = description;
	}
	
	
	public Holiday() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    
    
}
