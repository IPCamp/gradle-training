# Gradle introduction

## Basic concepts of Gradle

[What is Gradle?](https://docs.gradle.org/current/userguide/what_is_gradle.html)

* General purpose build tool
* Tasks and their dependencies on each other. A task has
  * inputs
  * actions
  * outputs
* Fixed build phases
  * Initialization
  * Configuration - only those tasks are configured that are selected to be run
  * Execution - only those tasks are run that are selected
* build scripts are code, but mainly declarative (configuration)
* imperative logic - `doLast()`, `doFirst()`
  * Demo by Geri: [source](https://gist.github.com/Gerviba/3dd8888c5e8764e2b81662a0b66a5208)
    - task syntax
    - logger (--info, --debug, --stacktrace)
    - dependsOn, finalizedBy, mustRunAfter, (shouldRunAfter)
    - copy task / templating / delete / download
    - depend on other submodules -> :api:public-api:asseamble
    - dry run: --dry-run

* Groovy/Kotlin
* [Delegation](#delegation-in-groovy)

### Creating a gradle project

```shell
gradle init
```

* Gradle wrapper
  * gradle version used by the project is fixed
  * no need to install it if one starts to work on a project
  * it is possible to create a gradle wrapper bundled with some specific logic in it

### Examples...

### A mistake...

## Multi-project

## Delegation in groovy

## The basic plugin

* Adds lifecycle tasks
* Adds base extension
  * `archivesName`
  * ...

### Lifecycle tasks

* clean
* check
* assemble
* build

## [Java plugin](https://docs.gradle.org/current/userguide/building_java_projects.html)

### Plugin related tasks

* compile
* jar
* processResources

### Source sets

* main
* test
* custom

### [Configurations for dependencies](https://docs.gradle.org/current/userguide/declaring_dependencies.html#sec:what-are-dependency-configurations)

*Note:* script classpath and script dependencies is different from the sourceSets and dependencies above.
Dependencies from repositories can be defined in `buildscript` block.

### Java library plugin

* The `api` dependency

### Java application plugin

* `run` task

## Groovy project setup

Groovy environment should be added as dependency.
