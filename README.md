# cnj-resilience-downstream-a

Simple cloud native java application based on Spring Boot which returns a list of 
[RecommendedItem](src/main/java/group/msg/at/cloud/cloudtrain/core/entity/RecommendedItem.java)s 
for a given user.

The behaviour of the service can be controlled via a 
[SabotageController](src/main/java/group/msg/at/cloud/cloudtrain/adapter/rest/SabotageController.java)
which allows you to apply abnormal behaviour to each invocation.

## Status
![Build status](https://codebuild.eu-west-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoiVy9sU2JuekZEeFRrK1cvZFBkVHJ1WjhTMExiSjJsdDNnSEVUUi90eXpUQ2c3dXF4bk8zSTQ1Zlg4TEdXRGVvVVljNHhtUDBFcjdpa3Nyb1NvcXQwVlg4PSIsIml2UGFyYW1ldGVyU3BlYyI6IlJVWXVmSTg4UG9XQ01GckEiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=main)

## Release information

Check [changelog](changelog.md) for latest version and release information.

## HOW-TO build this application locally

If all prerequisites are met, just run the following Maven command in the project folder:

```shell 
mvn clean verify -P pre-commit-stage
```

Build results: a Docker image containing the showcase application.
