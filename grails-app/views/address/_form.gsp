<%@ page import="com.imaginea.Address" %>



<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="address.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="city" required="" value="${addressInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'state', 'error')} required">
	<label for="state">
		<g:message code="address.state.label" default="State" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="state" required="" value="${addressInstance?.state}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'country', 'error')} required">
	<label for="country">
		<g:message code="address.country.label" default="Country" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="country" required="" value="${addressInstance?.country}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'zip', 'error')} required">
	<label for="zip">
		<g:message code="address.zip.label" default="Zip" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="zip" pattern="${addressInstance.constraints.zip.matches}" required="" value="${addressInstance?.zip}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="address.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${com.imaginea.User.list()}" optionKey="id" optionValue="firstName" required="" value="${addressInstance?.user?.id}" class="many-to-one"/>

</div>

