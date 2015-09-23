Common Dialogs
========

Java Swing Common Dialogs, by <a href="josh.wiechman@gmail.com">Wiechman, Joshua</a>

For more information please see [the website][1].

* [Documentation](http://docs.paralleluniverse.co/comsat/)
* [Javadoc](http://docs.paralleluniverse.co/comsat/javadoc)


## Getting started


Download [the latest JAR][2] or

Maven:

```xml
<dependency>
  <groupId>com.paypal.jwiechman.utilities</groupId>
  <artifactId>CommonDialogs</artifactId>
  <version>0.0.3-SNAPSHOT</version>
</dependency>
```

Gradle:
```groovy
compile 'com.paypal.jwiechman.CommonDialogs:0.0.3-SNAPSHOT'
```

Ivy:
```xml
<dependency org="com.paypal.jwiechman.utilities" name="CommonDialogs" rev="0.0.3-SNAPSHOT" />
```
Snapshots of the development version are available in [Sonatype's `snapshots` repository][snap].


Usage
--------

### Example
```java
LoginView.show();
LoginView.waitUntilClosed();
String username = LoginView.getUser();
String password = LoginView.getPassword(); 
```

## Bugs and Feedback

For bugs, questions and discussions please use the [Github Issues](https://github.paypal.com/jwiechman/CommonDialogs/issues).


##License


    Copyright 2014 PayPal, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


 [1]: https://github.paypal.com/jwiechman/CommonDialogs/
 [2]: http://nexus.paypal.com/nexus/content/repositories/snapshots/com/paypal/jwiechman/CommonDialogs/0.0.3-SNAPSHOT/
 [snap]: http://nexus.paypal.com/nexus/content/repositories/snapshots/com/paypal/jwiechman/utilities/CommonDialogs/0.0.3-SNAPSHOT/