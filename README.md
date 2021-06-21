## Technology Stack
FrameWork: "Spring"

FrontEnd: "Vue.js"

DB: AWS Aurora

Source Management: Git,Github

Design Management Tool: Figma


## Desigin Prototype

https://www.figma.com/proto/tNhlOh3qKlPWdLxbH6TVHH/Untitled?page-id=0%3A1&node-id=1%3A2&viewport=941%2C278%2C0.581944465637207&scaling=min-zoom

## How to build   
```
./mvnw clean
./mvnw package
./mvnw spring-boot:run
```
refer https://spring.pleiades.io/guides/gs/maven/


## About managing style(CSS)  
Using sass(Dart-sass) in order to write css more simply and easily.
scss files are present in `src/main/resources/assets/stylesheets`.
These files are transpile to pure css files in `src/main/resources/static/css`.
For compile ,please run command below.

```
./mvnw generate-resources
yarn run scss
```
To shotdown compile server, please execute `Ctrl + C`

## Collaborator
[furudeK](https://github.com/furudeK)

[Sa-wA3](https://github.com/Sa-wA3)
