# Table of Contents

1. [About the project](#About-the-project)
   * [About the data](#about-the-data)
2. [What does it do?](#what-does-it-do)
    * [Spring Batch](#spring-batch)
    * [Open API Specification](#open-api-specification)
3. [How to use docker-compose.yml](#how-to-use-the-docker-composeyml)
4. [Contribute](#contribute)
5. [License](#license)
6. [Contact](#contact)

# About the project

Welcome to our Yelp Analysis project! 

This is a non-commercial research project that aims to analyze
and draw insights from the comprehensive dataset provided by Yelp,
which you can access here: 

https://www.kaggle.com/datasets/yelp-dataset/yelp-dataset

or here:

https://www.yelp.com/dataset

## About the data
Yelp has given 5 files where each line contains a single record in JSON format.
Something that is missing is a published [JSON schema](https://json-schema.org/) that describes the definitions
of what is allowed to appear in the properties of any given JSON. A schema like this will eliminate any
ambiguity about the data. (i.e. we can know when any given data is invalid by definition or if our interpretation of
the data is wrong)

For example, a single JSON record from `yelp_academic_dataset_business.json` appears to have
a `attributes` key in the property. The `attributes` property very clearly is of `object` type
(i.e. it can contain properties), but there is no documentation provided by Yelp that
enumerates the valid/expected properties and what they look like. It does make intuitive sense that 
`attributes` is made to be an object, because it is very easy to include a brand-new attribute about
the business at any time.

The Yelp [documentation](https://www.yelp.com/dataset/documentation/main) for this data has the following:
```json
// object, business attributes to values. note: some attribute values might be objects
    "attributes": {
        "RestaurantsTakeOut": true,
        "BusinessParking": {
            "garage": false,
            "street": true,
            "validated": false,
            "lot": false,
            "valet": false
        },
    },
```

Therefore, `attribute` can contain any `key` name with it's `value` being
data type (e.g. string, number, another object...). Java/Kotlin, Spring, and **Jackson** (Spring's default JSON serialization/deserialization library)
are perfectly capable of handling this type of dynamic data. Take a look at the data type that was given
to attributes in the model [Business.kt](src/main/java/com/mpc/data/yelputil/model/Business.kt):
```kotlin
    val attributes: Map<String, Any>?
```
Business.kt represents the "blueprint" for how to construct and interact with a Business instance.
All the Business JSONs will each be loaded into an object of this class and offer the same fields/capabilities.
You can see that attributes is loaded into a map of key-value pairs. This supports a key name that could be anything
and a value that could be any object.

The Open API Specification calls this key-value map a [dictionary](https://swagger.io/docs/specification/data-models/dictionaries/),
and it is capable of handling data with this behavior. There is an upcoming section giving the big picture of what
Open API Specification is. It would be nice if our API reported some of the "known" properties that can appear in 
`attributes`. 

This is the basis for the first data analysis: [Enumerate Business Attributes](docs/BUSSINESS-ATTRIBUTES.md)

## What does it do?
The current purpose of this code is to learn and practice coding. Especially with Java, Kotlin, and Spring.
The following subsections will explain the technology being used in this project.

### Spring Batch

### Open API Specification
[Open API Specification]() offers brilliant tools for rapid development of REST API servers.
The key idea is you can describe the entire API from a single YAML file.

Maybe this is a place to learn if you like to read documentation:

https://swagger.io/docs/specification/about/

There is a large collection of code generators available here:

https://github.com/OpenAPITools/openapi-generator/tree/7bc2a660658766175a0fcde8e77c1b475bc970e6/docs/generators

By the way, **It is totally free!** This repository is demonstrating its use.

It is actually possible to use swagger.io to display the swagger docs for us, without needing to start the application server.
The following link shows the Swagger UI docs for the API this server offers.

**[REST API for yelp-analysis Services](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/zowe/docs-site/docs-staging/api_definitions/datasets.json)**


## How to use the docker-compose.yml

To run our application in a containerized development environment, we provide a `docker-compose.yml` file. Here's a step-by-step guide on how to use this:

**Step 1:** Make sure Docker Desktop is installed on your machine. If it's not, you can download it from the official Docker website.

**Step 2:** Open the directory where the `docker-compose.yml` file resides in your terminal (PowerShell or Command Prompt on Windows).

**Step 3:** Run the following command: `docker compose up -d`.

This command will tell Docker to download and provision all necessary resources as described in the `docker-compose.yml` file, including setting up and running the necessary containers for the services defined in the file in the detached mode.

## Contribute

Feel free to contribute to this project by issuing a pull request. Any improvements or features you can offer to the project are welcome!

## License

This project is open-source and available under the MIT License.

## Contact

If you have any questions or would like more information about the project, please reach out!