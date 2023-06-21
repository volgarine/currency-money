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

[![](https://lh3.googleusercontent.com/pw/AJFCJaX3jjiGplQtb9tHctSVQ3zfd5_4NB4zm6sSpeEC-94_30QMw1PDxS9HkSqVXFSY65KCpoSVDVHZ941QihD5svPfZ5K-rwQlAF2YJ5zq8CnHzU71RmJs0N3N8mUjpV58XweO_jrO0HyH8GrrS-7X09dS935KvbrXXJSSHFu5mAF8kr1-1DKdeUBo5LpMEiIJzT7LV88qBuXU6s96qodH8DEqDmUYz3gkzBaPC0y3nVGiOTW2GHGhlWCYQ-dugnqeSqEXIFMTWMaFgkV_MRvFxqyEEHap8lnWAUBvDf3YQn5fjd2QoOh1-tnViAt7SWFGqyF0cWarbXBwwiFQ_2rfHtXif6lr3B2D5lypo5lK2tcf-uFKcBJtIn9T-5qDkfFJryQiLqGL5VQ3srf44VFFNK-tJIuZtzbYQ3ne2it81-Yk-pELM79Gjc84FBayY2QoWvXLxxQo_mMlICdm_N0n5lNESwvvit6lkQKE4xDkfvmENcHFupb8aNzoV5LFZAom5YXUp5bqs7Cih3xaeoisxLbBk--5YA7bfae4LGZUZgOjnFYDWsR6uRwEwbXsEY6d_gXSCVN6-eI7GiGC_mAK-pP0iEFzK0JOzs-yAL1tgPUtTKbL-PMtRQe5SEPNswjumyiVUyKxfVmWQM6mXk5QTPaQguySHjrtAzYn_J5IFCMFAC9BfNU6-1dzhHD4XIysqS4EJB2qrQ80cE4_1bmOa-ROyy8ETGyOl51rXDK73aOIl9r8BadDZ8zWA-9ir4E64C0ysP2-JDV2VUIs3w56mRqmyK3W08GOTUDofVAe-M-OwZaY12774a1hY4Mr664FeIZBJ19p3ZT9K_yW3ctWe3mNmo5PGV48I9J1mtWMqO7j-4DE5M8Io3Nhr_R0RlWeLm5XrJmsL7pKo8lwc0OA2g=w298-h729-s-no?authuser=0)](https://www.volgarine.com.br)

![java-currency-money-app](https://github.com/volgarine/currency-money/assets/120597785/84ab71a1-9e10-48e6-8d7d-9577d1b0f39d)


