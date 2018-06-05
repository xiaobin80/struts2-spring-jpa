Struts2 Spring4 JPA
===============

Projects based on springBootJpa.
    
[demo jpa](https://github.com/xiaobin80/demo-jpa-spring-boot2-mysql)


	/**
	 * Built with MyEclipse 2017 Stable 2.0
	 * JTA(Atomikos-Hibernat4) + JPA
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
| | | |____dataAccessContext-jta.xml    
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
     http://localhost:8080/struts2-spring4-jpa/index    
     http://localhost:8080/struts2-spring4-jpa/home    
     http://localhost:8080/struts2-spring4-jpa/userSingle?userId={id}    
     [userList - struts2_tags](http://localhost:8080/struts2-spring4-jpa/userList)        
     http://localhost:8080/struts2-spring4-jpa/userDel?userId={id}    
     http://localhost:8080/struts2-spring4-jpa/userInsert    
     http://localhost:8080/struts2-spring4-jpa/userUpdate?userName={value}&userId={id}    
     http://localhost:8080/struts2-spring4-jpa/trainList?month={number}&trainNum={number}    
             
