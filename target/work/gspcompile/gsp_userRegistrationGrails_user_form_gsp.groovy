import com.imaginea.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_userRegistrationGrails_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userInstance, field: 'firstName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("user.firstName.label"),'default':("First Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("firstName"),'required':(""),'value':(userInstance?.firstName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'middleName', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("user.middleName.label"),'default':("Middle Name")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("middleName"),'value':(userInstance?.middleName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'lastName', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("user.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("lastName"),'required':(""),'value':(userInstance?.lastName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'email', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("user.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['type':("email"),'name':("email"),'required':(""),'value':(userInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'phoneNo', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("user.phoneNo.label"),'default':("Phone No")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("phoneNo"),'required':(""),'value':(userInstance?.phoneNo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'addresses', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("user.addresses.label"),'default':("Addresses")],-1)
printHtmlPart(10)
for( a in (userInstance?.addresses) ) {
printHtmlPart(11)
createTagBody(2, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',58,['controller':("address"),'action':("show"),'id':(a.id)],2)
printHtmlPart(12)
}
printHtmlPart(13)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'address.label', default: 'Address')]))
})
invokeTag('link','g',61,['controller':("address"),'action':("create"),'params':(['user.id': userInstance?.id])],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1442549596000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
