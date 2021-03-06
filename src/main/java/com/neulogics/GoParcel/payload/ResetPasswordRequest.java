package com.neulogics.GoParcel.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



public class ResetPasswordRequest {
		@NotBlank
	    @Size(max = 40)
	    @Email
	    private String email;

	 public ResetPasswordRequest() {
			
		}
	 
	public ResetPasswordRequest(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	 
}
