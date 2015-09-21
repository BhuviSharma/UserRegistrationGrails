package com.imaginea

import javax.annotation.Resources;
import javax.validation.Validator;
//import grails.rest.*


//@Resource(uri='/address')

class Address {
	
	static belongsTo = [user:User]
	
	int id
	String city
	String state
	String country
	String zip
	
	static mapping = {
		
		table 'ADDRESS'
		id column:'ADDRESS_ID'
		city column:'CITY'
		state column:'STATE'
		country column:'COUNTRY'
		zip column:'ZIP'
		
	}
	
	static constraints = {
		city blank:true
		state blank:true
		country blank:true
		zip (blank:true, matches : /(^\d{6}$)|(^\d{3}-\d{3}$)/)
	}
}
