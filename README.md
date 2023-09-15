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
- http://localhost:8080/struts2-spring-jpa-0.0.17-SNAPSHOT/index
- http://localhost:8080/struts2-spring-jpa-0.0.17-SNAPSHOT/home
- http://localhost:8080/struts2-spring-jpa-0.0.17-SNAPSHOT/userSingle?userId={id}
- [userList - struts2_tags](http://localhost:8080/struts2-spring-jpa-0.0.17-SNAPSHOT/userList)
- http://localhost:8080/struts2-spring-jpa-0.0.17-SNAPSHOT/userDel?userId={id}
- http://localhost:8080/struts2-spring-jpa-0.0.17-SNAPSHOT/userInsert
- http://localhost:8080/struts2-spring-jpa-0.0.17-SNAPSHOT/userUpdate?userName={value}&userId={id}
- http://localhost:8080/struts2-spring-jpa-0.0.17-SNAPSHOT/trainList?month={number}&trainNum={number}


# About Memcached
- [安装memcached](https://tdtc-hrb.github.io/csdn/post/ops_memcached_ubuntu/)
