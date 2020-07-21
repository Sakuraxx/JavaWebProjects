# LoveMovie

这个Web项目是一个电影资讯查看和影评分享的网站。

主要有五个板块，主页、选电影、电影排行榜、影评和个人主页。还包括一个管理后台来管理用户、电影信息、影评和审核被举报的影评。

## 项目配置与运行

电影网站项目使用**SSM**框架搭建，即web层（表现层）使用SpringMVC，业务层使用Spring，而持久层使用MyBatis框架。整个项目使用Maven进行依赖管理。

导入项目后修改两个配置文件的内容，便可以运行（当然在这之前要导入数据库）。

1. 在`/LoveMovie/src/main/resources/mysql.properties`中要修改数据库的用户名和密码；

2. 在`/LoveMovie/src/main/resources/generatorConfig.xml`中修改为

   ```xml
   <classPathEntry
   		location="D:\apache-tomcat-9.0.12\lib\mysql-connector-java-5.1.36-bin.jar" />
   ```

   为你的项目使用的mysql jar包所在位置。

   项目中mapper包下的持久层接口对应的xml文件使用的是自动生成器生成的。（这个需要自行搜索配置一下）

## 主页

主页主要为部分电影咨询和影评的推荐。

![lovemovie_index1](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_index1.png)

![lovemovie_index2](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_index2.png)

![lovemovie_index3](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_index3.png)![lovemovie_index4](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_index4.png)

## 选电影

设置各种分类使得用户可以对电影进行筛选，并设置搜索框使得用户可以按照演员、导演、电影名以及语言对电影进行搜索。

![lovemovie_selectmovie01](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_selectmovie01.png)![lovemovie_selectmovie02](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_selectmovie02.png)

### 搜索电影

![lovemovie_selectmovie03](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_selectmovie03.png)

![lovemovie_search](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_search.png)

### 电影详情

![lovemovie_movieDetail01](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_movieDetail01.png)![lovemovie_movieDetail02](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_movieDetail02.png)![lovemovie_movieDetail03](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_movieDetail03.png)

### 写影评

用户登录后，对电影进行写影评

![lovemovie_login](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_login.png)

![lovemovie_wrtiteComment](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_wrtiteComment.png)

![lovemovie_wrtiteComment02](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_wrtiteComment02.png)

## 电影排行榜

提供新片排行榜和经典top10

![lovemovie_rank01](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_rank01.png)![lovemovie_rank02](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_rank02.png)

## 影评

显示最受欢迎、热门影评和新片影评。

![lovemovie_comments01](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_comments01.png)![lovemovie_comments02](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_comments02.png)

### 影评详情

![lovemovie_commentsDetail01](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_commentsDetail01.png)![lovemovie_commentsDetail02](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_commentsDetail02.png)

## 个人主页

![lovemovie_uesr](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_uesr.png)

![lovemovie_user02](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_user02.png)

## 后台管理

![lovemovie_manage](https://myworld7-cnblog-img.oss-cn-beijing.aliyuncs.com/img/lovemovie_manage.png)

# 小结

本README.md是对电影网站的整体展示，日后空闲再分析这个小项目的搭建过程。
