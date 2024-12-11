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
- [v6.x](https://struts.apache.org/announce-2022.html)    
The 6.x series of the Apache Struts framework has a minimum requirement of the following specification versions:    
Servlet API 3.1, JSP API 2.1, and Java 8.


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
- http://localhost:8080/struts2-spring-jpa-0.1.5-SNAPSHOT/index
- http://localhost:8080/struts2-spring-jpa-0.1.5-SNAPSHOT/home
- http://localhost:8080/struts2-spring-jpa-0.1.5-SNAPSHOT/userSingle?userId={id}
- [userList - struts2_tags](http://localhost:8080/struts2-spring-jpa-0.1.5-SNAPSHOT/userList)
- http://localhost:8080/struts2-spring-jpa-0.1.5-SNAPSHOT/userDel?userId={id}
- http://localhost:8080/struts2-spring-jpa-0.1.5-SNAPSHOT/userInsert
- http://localhost:8080/struts2-spring-jpa-0.1.5-SNAPSHOT/userUpdate?userName={value}&userId={id}
- http://localhost:8080/struts2-spring-jpa-0.1.5-SNAPSHOT/trainList?month={number}&trainNum={number}


# About Memcached
- [安装memcached](https://tdtc-hrb.github.io/csdn/post/ops_memcached_ubuntu/)
