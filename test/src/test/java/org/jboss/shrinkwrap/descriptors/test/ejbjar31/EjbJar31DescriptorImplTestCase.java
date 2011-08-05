package org.jboss.shrinkwrap.descriptors.test.ejbjar31;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbJar31Descriptor;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.junit.Before;
import org.junit.Test;


public class EjbJar31DescriptorImplTestCase
{
   final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
   
   @Before
   public void init()
   {
      sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
      XMLUnit.setIgnoreWhitespace(true);
      XMLUnit.setIgnoreComments(true);
      XMLUnit.setNormalizeWhitespace(true);
   }
   
   @Test
   public void testGeneratedEjbJarXml() throws Exception
   {  
      EjbJar31Descriptor ejbJarGenerated = create()
            .addDefaultNamespaces()
            .setVersion("3.1")
            .setModuleName("module-name0")
            .setDescription("description0")
            .setDisplayName("display-name0")
            .icon()
               .setSmallIcon("small-icon0")
               .setLargeIcon("large-icon0").up()
            .enterpriseBeans()
               .messageDriven()
                  .setDescription("description1")
                  .setDisplayName("display-name1")
                  .icon()
                     .setSmallIcon("small-icon1")
                     .setLargeIcon("large-icon1").up()
                  .setEjbName("ejb-name0")
                  .setMappedName("mapped-name0")
                  .setEjbClass("ejb-class0")
                  .setMessagingType("messaging-type0")
                  .timeoutMethod()
                     .setMethodName("method-name0")
                     .methodParams()
                        .setMethodParam("method-param0").up().up()
                  .timer()
                     .setDescription("description2")
                     .schedule()
                        .setSecond("second0")
                        .setMinute("minute0")
                        .setHour("hour0")
                        .setDayOfMonth("day-of-month0")
                        .setMonth("month0")
                        .setDayOfWeek("day-of-week0")
                        .setYear("year0").up()
//                     .setStart(sdf.parse("2006-05-04 18:13:51.0"))
//                     .setEnd(sdf.parse("2006-05-04 18:13:51.0"))
                     .timeoutMethod()
                        .setMethodName("method-name1")
                        .methodParams()
                           .setMethodParam("method-param0").up().up()
                     .setPersistent(false)
                     .setTimezone("timezone0")
                     .setInfo("info0").up()
                  .setTransactionType("Bean")
                  .setMessageDestinationType("message-destination-type0")
                  .setMessageDestinationLink("message-destination-link0")
                  .activationConfig()
                     .setDescription("description3")
                     .activationConfigProperty()
                        .setActivationConfigPropertyName("activation-config-property-name0")
                        .setActivationConfigPropertyValue("activation-config-property-value0").up().up()
                  .aroundInvoke()
                     .setClazz("class0")
                     .setMethodName("$").up()
                  .aroundTimeout()
                     .setClazz("class1")
                     .setMethodName("$").up()
                  .envEntry()
                     .setDescription("description4")
                     .setEnvEntryName("env-entry-name0")
                     .setEnvEntryType("env-entry-type0")
                     .setEnvEntryValue("env-entry-value0")
                     .setMappedName("mapped-name1")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class0")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name0").up()
                  .ejbRef()
                     .setDescription("description5")
                     .setEjbRefName("ejb-ref-name0")
                     .setEjbRefType("Entity")
                     .setHome("home0")
                     .setRemote("remote0")
                     .setEjbLink("ejb-link0")
                     .setMappedName("mapped-name2")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class1")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name1").up()
                  .ejbLocalRef()
                     .setDescription("description6")
                     .setEjbRefName("ejb-ref-name1")
                     .setEjbRefType("Entity")
                     .setLocalHome("local-home0")
                     .setLocal("local0")
                     .setEjbLink("ejb-link1")
                     .setMappedName("mapped-name3")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class2")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name2").up()
                  .serviceRef()
                        .setDescription("description7")
                        .setDisplayName("display-name2")
                        .icon()
                           .setSmallIcon("small-icon2")
                           .setLargeIcon("large-icon2").up()
                        .setServiceRefName("service-ref-name0")
                        .setServiceInterface("service-interface0")
                        .setServiceRefType("service-ref-type0")
                        .setWsdlFile("http://www.oxygenxml.com/")
                        .setJaxrpcMappingFile("jaxrpc-mapping-file0")
                        .setServiceQname("qName")
                        .portComponentRef()
                           .setServiceEndpointInterface("service-endpoint-interface0")
                           .setEnableMtom(false)
                           .setMtomThreshold(50)
                           .addressing()
                              .setEnabled(false)
                              .setRequired(false)
                              .setResponses("ANONYMOUS").up()
                           .respectBinding()
                              .setEnabled(false).up()
                           .setPortComponentLink("port-component-link0").up()
                        .handlerChains()
                           .handlerChain()
                              .setProtocolBindings("##a ##a http://www.oxygenxml.com/")
                              .handler()
                                 .setHandlerName("handler-name0")
                                 .setHandlerClass("handler-class0").up().up().up()
                        .setMappedName("mapped-name4")
                        .injectionTarget()
                           .setInjectionTargetClass("injection-target-class3")
                           .setInjectionTargetName("$").up()
                        .setLookupName("lookup-name3").up()                      
                  .resourceRef()
                     .setDescription("description8")
                     .setResRefName("res-ref-name0")
                     .setResType("res-type0")
                     .setResAuth("Application")
                     .setResSharingScope("Shareable")
                     .setMappedName("mapped-name5")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class4")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name4").up()
                  .resourceEnvRef()
                     .setDescription("description9")
                     .setResourceEnvRefName("resource-env-ref-name0")
                     .setResourceEnvRefType("resource-env-ref-type0")
                     .setMappedName("mapped-name6")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class5")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name5").up()
                  .messageDestinationRef()
                     .setDescription("description10")
                     .setMessageDestinationRefName("message-destination-ref-name0")
                     .setMessageDestinationType("message-destination-type1")
                     .setMessageDestinationUsage("Consumes")
                     .setMessageDestinationLink("message-destination-link1")
                     .setMappedName("mapped-name7")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class6")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name6").up()
                  .persistenceContextRef()
                     .setDescription("description11")
                     .setPersistenceContextRefName("persistence-context-ref-name0")            
                     .setPersistenceUnitName("persistence-unit-name0")
                     .setPersistenceContextType("Transaction")
                     .persistenceProperty()
                        .setName("name0")
                        .setValue("value0").up()
                     .setMappedName("mapped-name8")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class7")
                        .setInjectionTargetName("$").up().up()
                   .persistenceUnitRef()
                      .setDescription("description12")
                      .setPersistenceUnitRefName("persistence-unit-ref-name0")
                      .setPersistenceUnitName("persistence-unit-name1")
                      .setMappedName("mapped-name9")
                      .injectionTarget()
                        .setInjectionTargetClass("injection-target-class8")
                        .setInjectionTargetName("$").up().up()
                   .postConstruct()
                      .setLifecycleCallbackClass("lifecycle-callback-class0")
                      .setLifecycleCallbackMethod("$").up()
                   .preDestroy()
                      .setLifecycleCallbackClass("lifecycle-callback-class1")
                      .setLifecycleCallbackMethod("$").up()                   
                   .dataSource()
                      .setDescription("description13")
                      .setName("name1")
                      .setClassName("class-name0")
                      .setServerName("server-name0")
                      .setPortNumber(0)
                      .setDatabaseName("database-name0")
                      .setUrl("jdbc::")
                      .setUser("user0")
                      .setPassword("password0")
                      .property()
                         .setName("name2")
                         .setValue("value1").up()
                      .setLoginTimeout(0)
                      .setTransactional(false)
                      .setIsolationLevel("TRANSACTION_READ_UNCOMMITTED")
                      .setInitialPoolSize(0)
                      .setMaxPoolSize(0)
                      .setMinPoolSize(0)
                      .setMaxIdleTime(0)
                      .setMaxStatements(0).up()
                   .securityRoleRef()
                      .setDescription("description14")
                      .setRoleName("role-name0")
                      .setRoleLink("role-link0").up()
                   .securityIdentity()
                      .setDescription("description15")
                      .runAs()
                         .setDescription("description16")
                         .setRoleName("role-name1").up().up().up().up()
           .interceptors()
              .setDescription("description17")
              .interceptor()
                 .setDescription("description18")
                 .setInterceptorClass("interceptor-class0")
                 .aroundInvoke()
                    .setClazz("class2")
                    .setMethodName("$").up()
                 .aroundTimeout()
                    .setClazz("class3")
                    .setMethodName("$").up()
                 .envEntry()
                     .setDescription("description19")
                     .setEnvEntryName("env-entry-name1")
                     .setEnvEntryType("env-entry-type1")
                     .setEnvEntryValue("env-entry-value1")
                     .setMappedName("mapped-name10")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class9")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name7").up()
                  .ejbRef()
                     .setDescription("description20")
                     .setEjbRefName("ejb-ref-name2")
                     .setEjbRefType("Entity")
                     .setHome("home1")
                     .setRemote("remote1")
                     .setEjbLink("ejb-link2")
                     .setMappedName("mapped-name11")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class10")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name8").up()
                  .ejbLocalRef()
                     .setDescription("description21")
                     .setEjbRefName("ejb-ref-name3")
                     .setEjbRefType("Entity")
                     .setLocalHome("local-home1")
                     .setLocal("local1")
                     .setEjbLink("ejb-link3")
                     .setMappedName("mapped-name12")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class11")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name9").up()
                  .serviceRef()
                        .setDescription("description22")
                        .setDisplayName("display-name3")
                        .icon()
                           .setSmallIcon("small-icon3")
                           .setLargeIcon("large-icon3").up()
                        .setServiceRefName("service-ref-name1")
                        .setServiceInterface("service-interface1")
                        .setServiceRefType("service-ref-type1")
                        .setWsdlFile("http://www.oxygenxml.com/")
                        .setJaxrpcMappingFile("jaxrpc-mapping-file1")
                        .setServiceQname("qName")
                        .portComponentRef()
                           .setServiceEndpointInterface("service-endpoint-interface1")
                           .setEnableMtom(false)
                           .setMtomThreshold(50)
                           .addressing()
                              .setEnabled(false)
                              .setRequired(false)
                              .setResponses("ANONYMOUS").up()
                           .respectBinding()
                              .setEnabled(false).up()
                           .setPortComponentLink("port-component-link1").up()
                        .handler()
                           .setDescription("description23")
                           .setDisplayName("display-name4")
                           .icon()
                              .setSmallIcon("small-icon1")
                              .setLargeIcon("large-icon1").up()
                           .setHandlerName("handler-name1")
                           .setHandlerClass("handler-class1")
                           .initParam()
                              .setParamName("param-name0")
                              .setParamValue("param-value0").up()
                           .setSoapHeader("qName")
                           .setSoapRole("soap-role0")
                           .setPortName("port-name0").up()
                        .setMappedName("mapped-name13")
                        .injectionTarget()
                           .setInjectionTargetClass("injection-target-class12")
                           .setInjectionTargetName("$").up()
                        .setLookupName("lookup-name10").up()
                  .resourceRef()
                     .setDescription("description24")
                     .setResRefName("res-ref-name1")
                     .setResType("res-type1")
                     .setResAuth("Application")
                     .setResSharingScope("Shareable")
                     .setMappedName("mapped-name14")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class13")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name11").up()
                  .resourceEnvRef()
                     .setDescription("description25")
                     .setResourceEnvRefName("resource-env-ref-name1")
                     .setResourceEnvRefType("resource-env-ref-type1")
                     .setMappedName("mapped-name15")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class14")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name12").up()
                  .messageDestinationRef()
                     .setDescription("description26")
                     .setMessageDestinationRefName("message-destination-ref-name1")
                     .setMessageDestinationType("message-destination-type2")
                     .setMessageDestinationUsage("Consumes")
                     .setMessageDestinationLink("message-destination-link2")
                     .setMappedName("mapped-name16")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class15")
                        .setInjectionTargetName("$").up()
                     .setLookupName("lookup-name13").up()
                  .persistenceContextRef()
                     .setDescription("description27")
                     .setPersistenceContextRefName("persistence-context-ref-name1")            
                     .setPersistenceUnitName("persistence-unit-name2")
                     .setPersistenceContextType("Transaction")
                     .persistenceProperty()
                        .setName("name3")
                        .setValue("value2").up()
                     .setMappedName("mapped-name17")
                     .injectionTarget()
                        .setInjectionTargetClass("injection-target-class16")
                        .setInjectionTargetName("$").up().up()
                   .persistenceUnitRef()
                      .setDescription("description28")
                      .setPersistenceUnitRefName("persistence-unit-ref-name1")
                      .setPersistenceUnitName("persistence-unit-name3")
                      .setMappedName("mapped-name18")
                      .injectionTarget()
                        .setInjectionTargetClass("injection-target-class17")
                        .setInjectionTargetName("$").up().up()
                   .postConstruct()
                      .setLifecycleCallbackClass("lifecycle-callback-class2")
                      .setLifecycleCallbackMethod("$").up()
                   .preDestroy()
                      .setLifecycleCallbackClass("lifecycle-callback-class3")
                      .setLifecycleCallbackMethod("$").up()       
                   .dataSource()
                      .setDescription("description29")
                      .setName("name4")
                      .setClassName("class-name1")
                      .setServerName("server-name1")
                      .setPortNumber(0)
                      .setDatabaseName("database-name1")
                      .setUrl("jdbc::")
                      .setUser("user1")
                      .setPassword("password1")
                      .property()
                         .setName("name5")
                         .setValue("value3").up()
                      .setLoginTimeout(0)
                      .setTransactional(false)
                      .setIsolationLevel("TRANSACTION_READ_UNCOMMITTED")
                      .setInitialPoolSize(0)
                      .setMaxPoolSize(0)
                      .setMinPoolSize(0)
                      .setMaxIdleTime(0)
                      .setMaxStatements(0).up()
                   .postActivate()
                      .setLifecycleCallbackClass("lifecycle-callback-class4")
                      .setLifecycleCallbackMethod("$").up() 
                   .prePassivate()
                       .setLifecycleCallbackClass("lifecycle-callback-class5")
                      .setLifecycleCallbackMethod("$").up() .up().up()
             .relationships()
                .setDescription("description30")
                .ejbRelation()
                   .setDescription("description31")
                   .setEjbRelationName("ejb-relation-name0")
                   .ejbRelationshipRole()
                      .setDescription("description32")
                      .setEjbRelationshipRoleName("ejb-relationship-role-name0")
                      .setMultiplicity("One")
                      .relationshipRoleSource()
                         .setDescription("description33")
                         .setEjbName("ejb-name1").up()
                      .cmrField()
                         .setDescription("description34")
                         .setCmrFieldName("cmr-field-name0")
                         .setCmrFieldType("java.util.Collection").up().up()
                   .ejbRelationshipRole()
                      .setDescription("description35")
                      .setEjbRelationshipRoleName("ejb-relationship-role-name1")
                      .setMultiplicity("One")
                      .cascadeDelete()
                      .relationshipRoleSource()
                         .setDescription("description36")
                         .setEjbName("ejb-name2").up()
                      .cmrField()
                         .setDescription("description37")
                         .setCmrFieldName("cmr-field-name1")
                         .setCmrFieldType("java.util.Collection").up().up().up().up()
                .assemblyDescriptor()
                   .securityRole()
                      .setDescription("description38")
                      .setRoleName("role-name2").up()
                   .methodPermission()
                      .setDescription("description39")
                      .unchecked()
                      .method()
                         .setDescription("description40")
                         .setEjbName("ejb-name3")
                         .setMethodIntf("Home")
                         .setMethodName("method-name6")
                         .methodParams()
                            .setMethodParam("method-param1").up().up().up()
                   .containerTransaction()
                      .setDescription("description41")
                      .method()
                         .setDescription("description42")
                         .setEjbName("ejb-name4")
                         .setMethodIntf("Home")
                         .setMethodName("method-name7")
                         .methodParams()
                            .setMethodParam("method-param2").up().up()
                      .setTransAttribute("NotSupported").up()
                   .interceptorBinding()
                      .setDescription("description43")
                      .setEjbName("ejb-name5")
                      .setInterceptorClassList("interceptor-class1")
                      .setExcludeDefaultInterceptors(false)
                      .setExcludeClassInterceptors(false)
                      .method()
                         .setMethodName("method-name8")
                         .methodParams()
                            .setMethodParam("method-param3").up().up().up()
                  .messageDestination()
                     .setDescription("description44")
                     .setDisplayName("display-name5")
                     .icon()
                        .setSmallIcon("small-icon4")
                        .setLargeIcon("large-icon4").up()
                     .setMessageDestinationName("message-destination-name0")
                     .setMappedName("mapped-name19")
                     .setLookupName("lookup-name14").up()
                  .excludeList()
                     .setDescription("description45")
                     .method()
                         .setDescription("description46")
                         .setEjbName("ejb-name6")
                         .setMethodIntf("Home")
                         .setMethodName("method-name9")
                         .methodParams()
                            .setMethodParam("method-param4").up().up().up()
                  .applicationException()
                     .setExceptionClass("exception-class0")
                     .setRollback(false)
                     .setInherited(false).up().up()
              .setEjbClientJar("ejb-client-jar0");                     
      
      String webXmlGenerated = ejbJarGenerated.exportAsString();
      String webXmlOriginal = getResourceContents("src/test/resources/test-gen-ejbjar31.xml");
           
      Diff myDiff = new Diff(webXmlOriginal, webXmlGenerated);
      assertTrue("pieces of XML are similar " + myDiff, myDiff.similar());
      assertTrue("but are they identical? " + myDiff, myDiff.identical());   
   }
   
   @Test
   public void testInterceptors() throws Exception
   {  
      EjbJar31Descriptor ejbJarGenerated = create()
            .addDefaultNamespaces()
            .setVersion("3.1")
            .interceptors()
               .interceptor().setInterceptorClass(" enterprise.annot_ovd_interceptor_ejb.NullChecker ").up()
               .up()
            .assemblyDescriptor()
               .interceptorBinding()
                  .setEjbName("*")
                  .setInterceptorClass(" enterprise.annot_ovd_interceptor_ejb.NullChecker ")
                  .up()
               .interceptorBinding()
                  .setEjbName("StatelessSessionBean")
                  .setExcludeClassInterceptors(true)
                  .method()
                     .setMethodName("isOddNumber")
                  .up()
               .up()
            .up();
      
      String webXmlGenerated = ejbJarGenerated.exportAsString();
      String webXmlOriginal = getResourceContents("src/test/resources/test-orig-ejbjar31.xml");
      
      Diff myDiff = new Diff(webXmlOriginal, webXmlGenerated);
      assertTrue("pieces of XML are similar " + myDiff, myDiff.similar());
      assertTrue("but are they identical? " + myDiff, myDiff.identical());   
   }
   
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private String getResourceContents(String resource) throws Exception
   {
      assert resource != null && resource.length() > 0 : "Resource must be specified";
      final BufferedReader reader = new BufferedReader(new FileReader(resource));
      final StringBuilder builder = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null)
      {
         builder.append(line);
         builder.append("\n");
      }
      return builder.toString();
   }
   
   private EjbJar31Descriptor create()
   {
      return Descriptors.create(EjbJar31Descriptor.class);
   }
   
}
