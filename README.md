Basic `todolist` app.
There are two `Dockerfiles`, one with `New Relic` built-in app and one without.
`NewRelic` version should only be used by developers interested in `New Relic`

Jenkins is setup in https://jenkins.wings.software/view/all/job/todolist/job/todolist-war-docker-pusher/ to:
1. run `mvn clean compile war:war` to generate the `target/todolist.war`
1. build and push regular Docker `wingsplugins/todolist:latest` image to https://hub.docker.com/r/wingsplugins/todolist/tags/
1. build and push `New Relic` Docker image `wingsplugins/todolist:newrelic`
 
