Struts2 Spring4 Hibernate5
===============

Projects based on springBootJpa.
    
http://www.pudn.com/Download/item/id/3418580.html


	/**
	 * Built with MyEclipse 2017 Stable 2.0
	 *
	 */
	 
.        
|____src        
| |____main        
| | |____java        
| | | |____com.example.demo    
| | |____resources    
| | | |____META-INF    
| | | | |____persistence.xml    
| | | |____applicationContext.xml    
| | | |____dataAccessContext-jpa.xml    
| | | |____jdbc.properties    
| | | |____log4j2.xml    
| | | |____struts.xml     
| | |        
| | |____webapp        
| | | |____views       
| | | |____WEB-INF        
| | | | |____web.xml        
| | | |____index.html        
|____pom.xml        
        

Prepare:    
    1. Environment
    Set Maven(M2_home) in System variables.    
    1) Create an M2_HOME System Variable.    
    2) Add%M2_HOME%\bin; to your PATH variable.    
    
    2. Import Project    
    1) Open ME    
    2) Import->Maven->Existing Maven Projects    

Step 1: war       
    1) Export -> WAR file        
    2) Browse - > Save    
    3) Move war file to Jetty webapps    
    

Step 2:    
     http://localhost:8080/struts2-spring4-hibernate5/index    
     http://localhost:8080/struts2-spring4-hibernate5/home    
     http://localhost:8080/struts2-spring4-hibernate5/userSingle?userId={id}    
     [userList - struts2_tags](http://localhost:8080/struts2-spring4-hibernate5/userList)    
     [userDetails - JSTL](http://localhost:8080/struts2-spring4-hibernate5/userDetails)    
     http://localhost:8080/struts2-spring4-hibernate5/userDel?userId={id}    
     http://localhost:8080/struts2-spring4-hibernate5/userinsert    
     http://localhost:8080/struts2-spring4-hibernate5/userUpdate?userName={value}&userId={id}    
             
