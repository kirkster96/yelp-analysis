# Spring AI with Ollama

This project contains a web service that will accept HTTP GET requests at
`http://localhost:8080/ai/simple`.

There is optional `message` parameter whose default value is "Tell me a joke".

The response to the request is from an Ollama Service instance.

## Prerequisites

Before using the AI commands, make sure you have taken into account the following considerations.

First, for running locally with Docker, you might want to make sure your GPU 
is being utilized for processing:

https://docs.docker.com/desktop/gpu/


## Learn More
The Spring AI project defines a configuration properties.
You can view what they are and their default values (when it is not specified in application.yaml)
here:

https://docs.spring.io/spring-ai/reference/api/chat/ollama-chat.html#_chat_properties


View Ollama here information here:

https://github.com/ollama/ollama

## Building and running
This repository is setup to use llama3 running on the
ollama docker image. You just need to run this command:

```
docker compose up -d
```
Be aware that llama 3 may take some time to initialize. My desktop took 69 seconds.
```shell
2024-06-01 09:15:14 time=2024-06-01T16:15:14.030Z level=INFO source=server.go:569 msg="llama runner started in 69.72 seconds"
```


## Access the endpoint


To get a response to the default request of "Tell me a joke"

```shell 
curl localhost:8080/ai/simple
```

A sample response is 

```text
Sure, here's a classic one for you:

Why don't scientists trust atoms?

Because they make up everything!
```

Now using the `message` request parameter
```shell
curl --get  --data-urlencode 'message=Tell me a joke about a cow.' localhost:8080/ai/simple 
```

A sample response is

```text
Why did the cow go to space?

Because it wanted to see the mooooon!
```

Alternatively use the [httpie](https://httpie.io/) client
```shell
http localhost:8080/ai/simple message=='Tell me a joke about a cow.'
```
