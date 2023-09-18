Struts2 Spring JPA
===============

Projects based on [demo jpa](https://github.com/xiaobin80/demo-jpa-spring-boot2-mysql).    
  with JTA(Atomikos-Hibernat4) + JPA

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
| | | |____jta.properties    
| | | |____log4j2.xml    
| | | |____struts.xml     
| | |        
| | |____webapp        
| | | |____views       
| | | |____WEB-INF        
| | | | |____web.xml        
| | | |____index.html        
|____pom.xml           


# Deployment
```
javax.servlet.* include v2.5, v3.1.0, v4.0.1
```
Struts2:
- [v2.5.x](https://struts.apache.org/announce-2020.html)    
The 2.5.x series of the Apache Struts framework has a minimum requirement of the following specification versions:    
Servlet API 2.4, JSP API 2.0, and Java 7.


## Step 1
war package
```
mvn clean
```

```
mvn compile
```

```
mvn package -DskipTests
```


## Step 2
- http://localhost:8080/struts2-spring-jpa-0.0.18-M1/index
- http://localhost:8080/struts2-spring-jpa-0.0.18-M1/home
- http://localhost:8080/struts2-spring-jpa-0.0.18-M1/userSingle?userId={id}
- [userList - struts2_tags](http://localhost:8080/struts2-spring-jpa-0.0.18-M1/userList)
- http://localhost:8080/struts2-spring-jpa-0.0.18-M1/userDel?userId={id}
- http://localhost:8080/struts2-spring-jpa-0.0.18-M1/userInsert
- http://localhost:8080/struts2-spring-jpa-0.0.18-M1/userUpdate?userName={value}&userId={id}
- http://localhost:8080/struts2-spring-jpa-0.0.18-M1/trainList?month={number}&trainNum={number}


# About Memcached
- [安装memcached](https://tdtc-hrb.github.io/csdn/post/ops_memcached_ubuntu/)
