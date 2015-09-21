import com.imaginea.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_userRegistrationGrails_address_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/address/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: addressInstance, field: 'city', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("city"),'required':(""),'value':(addressInstance?.city)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'state', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("address.state.label"),'default':("State")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("state"),'required':(""),'value':(addressInstance?.state)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'country', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("country"),'required':(""),'value':(addressInstance?.country)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'zip', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("address.zip.label"),'default':("Zip")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("zip"),'pattern':(addressInstance.constraints.zip.matches),'required':(""),'value':(addressInstance?.zip)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'user', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("address.user.label"),'default':("User")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("user"),'name':("user.firstName"),'from':(com.imaginea.User.list()),'optionKey':("id"),'optionValue':("firstName"),'required':(""),'value':(addressInstance?.user?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1442570255000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
