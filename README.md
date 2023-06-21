# **In this repository I show how to use a Free API from https://fixer.io to convert currency.**

_I live in Canada and I like to know how much the Canadian dollar (CAD) is in Brazilian currency (BRL)._

You can also run with **from terminal (BASH), JSON (Postman)**, but I did it in JAVA as part of my studies to become a JAVA Backend coder.

I ran in Java with IntelliJ IDE.

### **I did it as follows:**
**1)** I registered on https://fixer.io and **I got my Currency API Key**

**2)** I created a project in IntelliJ as follows:
    - File -> New -> Project -> Maven -> Project SDK: corretto-11
    
**3)** I edited the POM.XML file
    - Open POM.xml -> paste snippits -> Reimport All Maven Projects:
    
> <dependencies>
     <dependency>
         <groupId>com.squareup.okhttp3</groupId>
         <artifactId>okhttp</artifactId>
         <version>4.5.0</version>
     </dependency>
</dependencies>

> <properties>
     <maven.compiler.source>11</maven.compiler.source>
     <maven.compiler.target>11</maven.compiler.target>
</properties>

**4)** I created the program - main.java file and customized it as it is in my repository.

# Below is the result:

![java-currency-money-app](https://github.com/volgarine/currency-money/assets/120597785/84ab71a1-9e10-48e6-8d7d-9577d1b0f39d)


