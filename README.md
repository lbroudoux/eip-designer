# eip-designer

A Sirius designer for Enterprise Integration Patterns (see http://www.enterpriseintegrationpatterns.com/ for introduction of what are EIP). It allows you to design integration routes using the common patterns and vocabulary used within Enterprise Application Integration or Enterprise Services Bus solutions.

Here's an overview of the design perspective :

![overview](https://raw.githubusercontent.com/lbroudoux/eip-designer/master/assets/eip-designer.png)  

Moreover designing routes, the goal of EIP Designer is also to give : 
* acceleration to realization by allowing generation of route skeletons for common integration frameworks such as [Spring Integration](http://projects.spring.io/spring-integration/) or [Apache Camel](http://camel.apache.org),
* control onto final realization by providing parsers and comparators able to check that development was done respecting "original design". 

Finally, we aim to provide adapters and bridges to allow the usage of EIP Designer from a more generic and abstract design solution such as a TOGAF or a Archimate Designer. Those one presenting the notion of Services and Services dependencies without a mean of describing orchestration process or integration routes ... everything we thought EIP is great at ! 


## Build Status

Current development version is `0.2.1-SNAPSHOT`. [![Build Status](https://travis-ci.org/lbroudoux/eip-designer.png?branch=master)](https://travis-ci.org/lbroudoux/eip-designer)


## Releases

| Versions      | Date          | Update site  |
| ------------- | ------------- | ------------ |
|`0.2.0`      |Aug. 06 2015   |`http://dl.bintray.com/lbroudoux/maven/eip-designer/0.2.0/`|
|`0.1.0`      |Jun. 16 2015   |`http://dl.bintray.com/lbroudoux/maven/eip-designer/0.1.0/`|


## Installation

### Pre-requisites

EIP Designer needs at least Eclipse Luna SR1 with modeling stuffs. We recommend using directly the _Modeling Tools_ distribution of Eclipse available from [download page](http://www.eclipse.org/downloads/).

After having installed and ran Eclipse, you also need to add Sirius 2.0. See the download page on [http://www.eclipse.org/sirius](http://www.eclipse.org/sirius/download.html) on how to add Sirius to your Eclipse modeling installation.

### Released versions

Find the correct update site URL in the above Releases table and just use this URL as an update site into your Eclipse installation within `Install New Software...`. More details on available features are mentionned below when talking about _Usage_, _Generators_ and _Bridges_.

### Development version

Want to live on the edge ? The development version of EIP Designer could either be : 
* built from sources to get distributable and installable binary packages or,
* directly imported into Eclipse workbench for local tests.

For early testers, snapshot P2 repositories are regularly setup and provisioned here: `http://dl.bintray.com/lbroudoux/maven/eip-designer/`. Just use this URL to see if there's a snapshot for current version and use URL as an update site into your Eclipse installation within `Install New Software...`.  

#### Build from sources

In order to build from sources, you'll need Apache Maven (version >= 3.0). After having cloned the Github repository, just go to the repository root and run :

```
$ mvn clean install
```
This should build and install all binary plugins into your Maven local repository under the `com.github.lbroudoux.dsl.eip` group / sub directories.

#### Import into Eclipse

After having cloned the Github repository, just launch Eclipse and do a regular projet import (_Import...  > Existing Projects into Workspace_) of all the projects located under `/plugins` and `/features` directories.  

Now just launch a new `Run As... > Eclipse Application` to launch a new Workbench containing all imported plugins.


## Usage

### Designer

Using designer is rather simple and follow Eclipse Modeling and Sirius guidelines :
* Create a new _Modeling Project_ within your workspace,
* Add to this project a new _Eip Model_ resource (choose _EIP Model_ as the root object for model),
* Update the Viewpoint selection for this project (right-click on project while being into Sirius perspective)

We provide a new viewpoint simply named _Enterprise Integration Patterns_ and applicable when your project contains a `*.eip` resource as shown below.

![viewpoint](https://raw.githubusercontent.com/lbroudoux/eip-designer/master/assets/eip-designer-viewpoint.png)

Your project is now ready !

Designer provides only 2 diagrams :
* A _Routes Catalog_ that just allows you to create and remove Route definitions within your model,
* A _Route Diagram_ that allows you to specify a Route behaviour using the tools and semantics shown in top screenshot.

### Generators

Generators are provided within features dedicated to specific generation target. For now, we have :
* [Spring Integration](http://projects.spring.io/spring-integration/) support provided by the _EIP Designer extension for Spring Integration_ (`com.github.lbroudoux.dsl.eip.spring.feature` feature)
* [Apache Camel](http://camel.apache.org) support provided by the _EIP Designer extension for Apache Camel_ (`com.github.lbroudoux.dsl.eip.camel.feature` feature)

For now, there's no graphical integration plugin defined and you should defined an _Acceleo Application_ and use our generators through the traditional `Run As...` integration.

The main classes for generators are :
* `com.github.lbroudoux.dsl.eip.gen.spring.main.GenerateRoutes` for [Spring Integration](http://projects.spring.io/spring-integration/),
* `com.github.lbroudoux.dsl.eip.gen.camel.main.GenerateXmlRoutes` for [Apache Camel](http://camel.apache.org). We only support routes specification in Xml at time of writing.

### Parsers and comparators

Once features mentioned into _Generators_ section are presents, comparison of implementations files with base model is made available through a new `Compare With EIP Route` context item within the traditional `Compare With...` submenu.

Then, select a Route definition within an EIP Model present into your workspace and you should be able to inspect differences onto a quite standard `Compare` dialog : 
   
![compare](https://raw.githubusercontent.com/lbroudoux/eip-designer/master/assets/eip-designer-compare.png)

### Bridges

One of our goal is also to provide an easy way to integrate EIP Designer with other solutions in order to offer a complementary viewpoint onto system design. For example, you may want to integrate EIP route design features with a Enterprise Architecture related designer in order to offer continuum between Service communication design and Service realization design.

Check our [Wiki documentation](https://github.com/lbroudoux/eip-designer/wiki/How-To-Write-A-Bridge) on how to write a custom bridge !

#### TOGAF Designer

As an example, we provide a bridge for the [TOGAF Designer](http://marketplace.obeonetwork.com/module/togaf) from [Obeo](http://www.obeo.fr). This feature brings you a new contextual menu contribution for designing EIP route from Togaf Information System Service within diagrams as shown below :

![togaf](https://raw.githubusercontent.com/lbroudoux/eip-designer/master/assets/eip-designer-togaf-extension.png)

As soon as you have choosen a target EIP Model as the container for the Service Route design, it initializes a complete EIP design for the Service realization and by bringing in every service dependencies identified within Togaf designer :

![togaf-route](https://raw.githubusercontent.com/lbroudoux/eip-designer/master/assets/eip-designer-togaf-route.png)


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




