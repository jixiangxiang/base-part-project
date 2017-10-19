# base-part-project
spring boot mybatis druid redis

#### 基于spring boot 集成 mybatis，druid，redis，利用注解的方式整合的web基础开发项目
***
#### 内部使用restcontroll，写了查询接口，用mysql数据库，用mybatis和druid来进行，并且在service使用了redis做了缓存
#### resources下面的aviation.sql 是初始化数据库的脚本，使用的mysql数据库
  `Redis服务器地址`
  
  `spring.redis.host=localhost`
  
  `Redis服务器连接端口`
  
  `spring.redis.port=6379`
#### 运行起来项目后访问`localhost:8080/druid/` 可以看到druid的监控数据

#### 后续会继续更新一些相关的基础配置
