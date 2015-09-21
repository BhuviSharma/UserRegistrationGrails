package com.imaginea

//import javax.annotation.Resources;
//import javax.validation.Validator;
//import grails.rest.*


//@Resource(uri='/users')
class User {
	
	static hasMany = [addresses: Address]
	
	int id;
	String firstName
	String middleName
	String lastName
	String email
	String phoneNo
	
	static mapping = {
		table 'USER'
		id column:'USER_ID'
		firstName column:'FIRST_NAME'
		middleName column:'MIDDLE_NAME'
		lastName column:'LAST_NAME'
		email column:'EMAIL'
		phoneNo column:'PHONE_NO'
	}
	
	static constraints = {
		firstName blank : false
		middleName (blank:true, nullable : true)
		lastName blank : false
		email (blank : false, email: true)
		phoneNo (blank : false )
	}
}
