scala-Workshop: Basics
======================

I. What is this all about?
--------------------------
Scala is a programming language, which tries to bring together object oriented programming with functional programming.
It's more and more used to realize high availabe and scalable systems and it's the driving language for Reactive Programming (Akka, Play), 
Big Data Processing (Spark), ...

This workshop introduces in the basics of Scala: We will learn interactively about 

* Types, Variables
* Methods
* Pattern Matching
* Loops und Control Structures
* Collection API

... and we will apply our new knowledge to send out bots in [Scalatron](https://scalatron.github.io/).

II. Front-Up Preparations
-------------------------

As this is a notebook class, you should try to set up your machine before we start with the actual workshop.

There are 2 options to do so:

* Option1: Install Scala and IntelliJ (an Integrated Development Environment (IDE)) directly on your computer
* Option2: Install Virtualbox on your computer, download an already prepared Ubuntu-Box and run it

*Attention*:
The IDE must be IntelliJ (not e.g. ScalaIDE, Eclipse...), because the worksheets only run under IntelliJ!

Here a description, how both options work, in more detail:

### Option 1 - the hard way
0. Install
    - [Java 8 (JDK!)](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
    - [Scala Simple Build Tool (SBT)](http://www.scala-sbt.org/download.html)
 
1. [Scala Workshop Sources and Documentation](https://github.com/plipp/informatica-scala-2016):<br>
    check it out: `git clone git@github.com:plipp/informatica-scala-2016.git`
    or          : `git clone https://github.com/plipp/informatica-scala-2016.git`

2. [IntelliJ IDEA 2016.1 Help /Installing and Launching](https://www.jetbrains.com/help/idea/2016.1/installing-and-launching.html?search=install#d1790162e138)
   Please also install the featured Scala Plugin

3. If you already have installed IntelliJ, but not the Scala Plugin: 
   [Install it now!](http://stackoverflow.com/questions/26767463/intellij-14-create-import-a-scala-sbt-project)
   (This also should work for IntelliJ-2016)
   
4. Import the scala workshop project into IntelliJ: `informatica-scala-2016/build.sbt`
   ... can take some time as it downloads the whole internet ...

5. Expected Result: Worksheets (*.sc) and tests can directly be run in IntelliJ

6. TODO Getting Started with Scalatron ...

#### Troubleshooting

1. If IntelliJ is too slow<br>
    - play with IntelliJ-vm-memory-allocation-configuration in `$IDEA_HOME/bin/idea64.vmoptions`, e.g. <br>
    ```
    -Xms512m
    -Xmx1750m
    ```

### Option 2 - the easy(ier) way

TODO: Install Virtualbox + image

### Further Links about IntelliJ for Scala

- https://www.jetbrains.com/help/idea/2016.1/scala.html

III. This workshop
------------------
We walk through the basics of Scala by

- [Scalatron-Bot-](./src/main/scala/Bot.scala) and 
- [Worksheet](./src/main/worksheets/01_01_variables.sc) examples.

The guided tour can be found in the documentation directory [tutorial](./docs/tutorial/01-GettingStarted.md)



IV. Help for Self-Help
------------------------------

### Scalatron

- [Scalatron Game Rules](https://github.com/plipp/scalatron/blob/master/Scalatron/doc/markdown/Scalatron%20Game%20Rules.md)
- [Scalatron Game Protocol](https://github.com/plipp/scalatron/blob/master/Scalatron/doc/markdown/Scalatron%20Protocol.md)

### Scala

- [Scala CheatSheet by Scalatron](TODO)

- [Scala CheatSheet Typesafe with GOOD-BAD](http://docs.scala-lang.org/cheatsheets/?_ga=1.39644259.1946458768.1438599324)
- [Scala CheatSheet Coursera](https://github.com/lampepfl/progfun-wiki/blob/gh-pages/CheatSheet.md)

- [Scala Glossary Typesafe](http://docs.scala-lang.org/glossary/?_ga=1.237881024.1946458768.1438599324)

- [Scala-Api-Documentation](http://www.scala-lang.org/api/current/#package)


- REPL (=Read Evaluate Print Loop): *$>sbt console*
- IntelliJ-Worksheets


V. Next Steps in Scala
----------------------

### Resources
- [Lightbend (former Typesafe): eBooks, Webinars, Videos ...](https://www.lightbend.com/)
- Another Introduction: [Scala School!](http://twitter.github.io/scala_school/)
- Inspired by Effective Java: [Effective Scala](http://twitter.github.io/effectivescala)

### Free Books
- Very Fast way (2012): [Scala for the Impatient](http://www.horstmann.com/scala/index.html)
- Comprehensive Guide: [The Neophyte's Guide to Scala](http://danielwestheide.com/scala/neophytes.html)
- Cookbook: [Online-Site for *Scala Cookbook*](http://alvinalexander.com/scala)
- Leading Authority: Martin Odersky, quite theoretical: [Programming in Scala (2013)](http://www.artima.com/shop/programming_in_scala_2ed), [free Online-Version (2008)](http://www.artima.com/pins1ed/)

### MOOC
- [Functional Programming Principles in Scala](https://www.coursera.org/course/progfun)
- [Functional Programming in Scala Specialization](https://www.coursera.org/specializations/scala)

### Playground
- [Scala Koans](http://scala-exercises.47deg.com/)
- [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/)


X. TODO
------------------
- Minimize dev-Gameboard

- Rename 'ControlFunction' to 'Bot' ??? No - because of all the documentation...

- Do we need info about
    - markdown --> link
    - git --> Tutoriallink
    - what else???