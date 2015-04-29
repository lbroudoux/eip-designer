# eip-designer

A Sirius designer for Enterprise Integration Patterns (see http://www.enterpriseintegrationpatterns.com/ for introduction of what are EIP). It allows you to design integration routes using the common patterns and vocabulary used within Enterprise Application Integration or Enterprise Services Bus solutions.

Here's an overview of the design perspective :

![overview](https://raw.githubusercontent.com/lbroudoux/eip-designer/master/assets/eip-designer.png)  

Moreover designing routes, the goal of EIP Designer is also to give : 
* acceleration to realization by allowing generation of routes skeleton for common integration frameworks such as [Spring Integration](http://projects.spring.io/spring-integration/) or [Apache Camel](http://camel.apache.org),
* control onto final realization by providing parsers and comparators able to check that development was done "respecting original spirit". 

Finally, we aim to provide adapters and bridges to allow the usage of EIP Designer from a more generic and abstract design solution such as a TOGAF or a Archimate Designer. Those one presenting the notion of Services and Services dependencies without a mean of describing orchestration process or integration routes ... everything we thought EIP is great as ! 


## Build Status

Travis CI [![Build Status](https://travis-ci.org/lbroudoux/eip-designer.png?branch=master)](https://travis-ci.org/lbroudoux/eip-designer)


## Installation

EIP Designer is currently in development mode and thus should be either be : 
* built from sources to get distributable and installable binary packages or,
* directly imported into Eclipse workbench for local tests.

### Pre-requisites

EIP Designer needs at least Eclipse Luna SR1 with modeling stuffs. We recommend you using directly the _Modeling Tools_ distribution of Eclipse available from [download page](http://www.eclipse.org/downloads/).

After having installed and ran Eclipse, you also need to add Sirius 2.0. See the download page on [http://www.eclipse.org/sirius](http://www.eclipse.org/sirius/download.html) on how to add Sirius to your Eclipse modeling installation.

### Build from sources

In order to build from sources, you'll need Apache Maven (version >= 3.0). After having cloned the Github repository, just go to the repository root and run :

```
$ mvn clean install
```
This should build and install all binary plugins into your Maven local repository under the `com.github.lbroudoux.dsl.eip` group / sub directories.

### Import into Eclipse

After having cloned the Github repository, just launch Eclipse and do a regular projet import (_Import...  > Existing Projects into Workspace_) of all the projects located under `/plugins` and `/features` directories.  

Now just launch a new `Run As... > Eclipse Application` to launch a new Workbench containing all imported plugins.


## Usage

### Designer

More to come soon...

### Generators

More to come soon...

### Parsers and comparators

More to come soon...

### Bridges

More to come soon...


## License

```
This software is licensed under the Apache 2 license, quoted below.

Copyright 2015 Laurent Broudoux

Licensed under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```




