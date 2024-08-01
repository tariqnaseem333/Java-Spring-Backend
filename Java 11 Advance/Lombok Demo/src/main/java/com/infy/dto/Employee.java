package com.infy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data // generates getters,setters,toString,equals and hashCode() methods
public class Employee {

	@NonNull // ensures that empId field is never null
	private Integer empId;
	private String empName;
	private String emailId;

}
