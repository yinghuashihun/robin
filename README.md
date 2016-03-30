# robin
基于京东的分布式跟踪系统
<h3>一、使用 </h3>
<pre>
<code>
	1、使用命令行编译
	mvn clean install -Dmaven.test.skip=true
	2、将robin-client的jar包放置在应用模块的classpath下
	在应用模块添加依赖即可
   < dependency>
      < groupId>com.dtdream.vanyar< /groupId>
      < artifactId>robin-client< /artifactId>
      < version>1.0-SNAPSHOT< /version>
    < /dependency>
	3、运行robin-collector，robin-manager。
	命令行java -jar **.jar
	4、Tomcat部署robin-web
</code>
</pre>
