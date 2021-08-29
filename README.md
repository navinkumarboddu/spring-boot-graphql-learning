# spring-boot-graphql-learning
Learning and experimenting GraphQL implementation using Spring Boot

#*What is GraphQL ?*
1. GraphQL is a data query language.
2. It was created by Facebook. 
3. GraphQL provides a new API standard similar to REST.

#*Challenges with REST API:*
1. We get Fixed Response
2. We have to define different methods for provide data based on consumers 
request
3. It causes problem of over or under fetching
4. Rest has different types HTTP methods to allow consumers to get and update the data
5. There is waste i.e. lot of data that has to be collected and transferred over the wire
6. With evolution of your API, it becomes taxing to maintain the business logic

#*Benefits with GraphQL:*
1. We have the flexibity to fetch only limited data for different consumers
2. It provides Query for the API
3. It has methods like Query and Mutation
4. It needs a schema definition

#*What are the benefits of using GraphQL over REST with an example?*
Let’s consider an example to understand the concept better. Consider the example where we are creating a web-service that provides a REST API to manage a collection of films. The client can retrieve the list of films in the collection along with their year of release and other details. The details behind the implementation of this API as well as a demo are available in this GitRepo.

A client using the REST API to get data about the films could either use the /films end-point to get the entire database of films or the /films/<id> to get individual film info. Suppose the client is trying to build a UI that lists, say, only the IDs and names, it still will end-up getting all the fields for all the films. Thus it ends up overfetching data from the server.

An alternate approach could be to design the REST API to return only the IDs from the /films endpoint or to create a new end-point, say, /filmids to return just the IDs. Still, if the client wanted to get all the IDs and names it would have to first visit this end-point, get all the IDs and then visit each end-point to get the names. In this case, the first API call results in underfetching which is why the client makes N additional calls to get the remaining pieces of data. This is the so-called “N+1” problem that is commonly encountered while using REST APIs.

Of course, we can design multiple endpoints providing multiple views of the data. But, we are transferring the concerns of the client into the API implementation, which is not good design. Also, the number of such views could multiply over time and make the service unmaintainable.

GraphQL simplifies this process by getting all the data your app needs in a single request. In GraphQL, the consumers can choose the data that is needed, by having all data in a single endpoint. Thus, the GraphQL server exposes a single endpoint and enables the client to request precisely the data it requires. Requests normally use POST method and use a JSON syntax to describe the data queried for.





#*App Configuration Details*

> Database Configuration
- Downloaded sample movie db from [MySQL link](https://github.com/Narven/movies-api-nodejs/blob/develop/mysql-dump/movies.sql)
- Database schema name : graphQL
- Tables : 
    1. film
    2. actor
    3. film_actor
    
> Add pom.xml with GraphQL dependencies
- <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter</artifactId>
  </dependency>

- <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
  </dependency>

- <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
  </dependency>

- <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <scope>runtime</scope>
  </dependency>

- <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <optional>true</optional>
  </dependency>

- <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
  </dependency>

- For GraphQL

   <dependency>
      <groupId>com.graphql-java</groupId>
      <artifactId>graphql-spring-boot-starter</artifactId>
      <version>5.0.2</version>
  </dependency>

- <dependency>
      <groupId>com.graphql-java</groupId>
      <artifactId>graphql-java-tools</artifactId>
      <version>5.2.4</version>
  </dependency>
- For graphical UI to test GraphQL queries -

  <dependency>
      <groupId>com.graphql-java</groupId>
      <artifactId>graphiql-spring-boot-starter</artifactId>
      <version>5.0.2</version>
  </dependency>