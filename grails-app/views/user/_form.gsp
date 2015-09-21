<%@ page import="com.imaginea.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="user.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${userInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'middleName', 'error')} ">
	<label for="middleName">
		<g:message code="user.middleName.label" default="Middle Name" />
		
	</label>
	<g:textField name="middleName" value="${userInstance?.middleName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="user.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${userInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${userInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'phoneNo', 'error')} required">
	<label for="phoneNo">
		<g:message code="user.phoneNo.label" default="Phone No" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="phoneNo" required="" value="${userInstance?.phoneNo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'addresses', 'error')} ">
	<label for="addresses">
		<g:message code="user.addresses.label" default="Addresses" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${userInstance?.addresses?}" var="a">
    <li><g:link controller="address" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="address" action="create" params="['user.id': userInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'address.label', default: 'Address')])}</g:link>
</li>
</ul>


</div>

