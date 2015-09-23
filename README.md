Swing Common Dialogs
========

Java Swing Common Dialogs, by <a href="josh.wiechman@gmail.com">Wiechman, Joshua</a>

For more information please see [the website][1].


## Getting started


Download [the latest JAR][2] or

Maven:

```xml
<dependency>
  <groupId>io.github.rampantlions</groupId>
  <artifactId>Swing</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
```

Gradle:
```groovy
compile 'io.github.rampantlions.SwingCommonDialogs:0.0.1-SNAPSHOT'
```

Ivy:
```xml
<dependency org="io.github.rampantlions" name="SwingCommonDialogs" rev="0.0.1-SNAPSHOT" />
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

For bugs, questions and discussions please use the [Github Issues]( https://github.com/RampantLions/SwingCommonDialogs/issues).


##License


    Copyright 2014 RampantLions.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


 [1]: https://github.com/RampantLions/SwingCommonDialogs/
 [2]: https://github.com/RampantLions/maven/tree/gh-pages/releases/io/github/rampantlions/SwingCommonDialogs/0.0.1-SNAPSHOT
 [snap]: https://github.com/RampantLions/maven/tree/gh-pages/releases/io/github/rampantlions/SwingCommonDialogs/0.0.1-SNAPSHOT