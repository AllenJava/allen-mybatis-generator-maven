**项目说明** 
使用 mybatis generator maven插件 自动生成代码

**使用说明** 
1.在pom.xml配置 mybatis-generator插件
<!-- mybatis-generator START -->
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>1.3.7</version>
    <configuration>
        <!--允许移动生成的文件 -->
        <verbose>true</verbose>
        <!--允许覆盖生成的文件 -->
        <overwrite>true</overwrite>
        <!--generatorConfig.xml文件 位置-->
        <configurationFile>src/main/resources/mybatis/generator/generatorConfig.xml</configurationFile>
    </configuration>
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.47</version>
        </dependency>
    </dependencies>
</plugin>
<!-- mybatis-generator END -->

2.resource/mybatis/generator目录创建generatorConfig.xml文件
详细见文件内容。

3.在Maven build使用命令执行生成代码：mybatis-generator:generate

4.包目录dao,entity目录的代码为自动生成；resource/mybatis/mapper目录的xx.xml为自动生成。每次执行mybatis-generator:generate命令会覆盖之前生成的代码（平时开发不需要去改动），因此自定义的代码可以放在包目录dao.ext下，自定义的xxxMapper.xml文件可以放在resource/mybatis/mapper/ext目录，防止被覆盖，例如项目中的：
ActivityInfoExtendMapper.java类
ActivityInfoExtendMapper.xml文件
