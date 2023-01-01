package com.mt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
	private String userid;
	private String userpwd;
	private String username;
	private String usertel;
	private String useremail;
}
