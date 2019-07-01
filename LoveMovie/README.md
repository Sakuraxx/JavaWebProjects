# LoveMovie

电影咨询查看和影评分享的网站。

主要有四个板块，主页、选电影、电影排行榜和影评。还包括一个管理后台来管理用户、电影信息、影评和审核被举报的影评。

## 项目配置与运行

本项目是一个Spring MVC项目，使用maven进行依赖包管理并使用MyBatis持久层框架。一般情况下装了EclipseEE都可以创建Maven项目，若是不可以创建。就需要安装maven插件，MyBatis也可以在Eclipse安装插件解决（安装教程还需自行搜索）。有了这些条件后，就可以导入本项目。然后还要修改两个配置文件的内容，就可以运行本项目（在导入数据库后）。一是在`/LoveMovie/src/main/resources/mysql.properties`中要修改数据库的用户名和密码；二是在

`/LoveMovie/src/main/resources/generatorConfig.xml`中修改

```java
<classPathEntry
		location="D:\apache-tomcat-9.0.12\lib\mysql-connector-java-5.1.36-bin.jar" />
```

为你的tomcat中mysql jar包所在位置。

## 主页

主页主要为部分电影咨询和影评的推荐。

![lovemovie_index1](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_index1.png)

![lovemovie_index2](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_index2.png)

![lovemovie_index3](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_index3-1561986667133.png)

![lovemovie_index4](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_index4-1561986671659.png)

## 选电影

设置各种分类使得用户可以对电影进行筛选，并设置搜索框使得用户可以按照演员、导演、电影名以及语言对电影进行搜索。

![lovemovie_selectmovie01](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_selectmovie01.png)

![lovemovie_selectmovie02](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_selectmovie02.png)





### 搜索电影



![](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_selectmovie03.png)

![lovemovie_search](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_search.png)

### 电影详情

![lovemovie_movieDetail01](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_movieDetail01.png)

![lovemovie_movieDetail02](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_movieDetail02.png)

![lovemovie_movieDetail03](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_movieDetail03.png)



### 写影评

用户登录后，对电影进行写影评

![lovemovie_login](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_login.png)

![lovemovie_wrtiteComment](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_wrtiteComment.png)

![lovemovie_wrtiteComment02](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_wrtiteComment02.png)

## 电影排行榜

提供新片排行榜和经典top10

![lovemovie_rank01](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_rank01.png)

![lovemovie_rank02](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_rank02.png)

## 影评

显示最受欢迎、热门影评和新片影评。

![lovemovie_comments01](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_comments01.png)

![lovemovie_comments02](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_comments02.png)

### 影评详情

![lovemovie_commentsDetail01](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_commentsDetail01.png)

![lovemovie_commentsDetail02](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_commentsDetail02.png)

## 个人主页

![lovemovie_uesr](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_uesr.png)

![lovemovie_user02](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_user02.png)

## 后台管理

![lovemovie_manage](https://github.com/Sakuraxx/JavaWebProjects/blob/master/LoveMovie/img/lovemovie_manage.png)

