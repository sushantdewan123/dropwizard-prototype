# dropwizard-prototype
Playing with Dropwizard framework.
A sample application shows how Dropwizard seamlessly integrates and instantiates - Jetty server, jersey framework for RESTful webservices, Jackson for JSON, metrics library.
<br>
<br>
<br>
Introduction
<br>
Dropwizard is a bit of both - framework and a library. It consists of below modules.
<br>
<li> Jetty HTTP Library and embedded HTTP server. Dropwizard uses Jetty HTTP library and uses an embedded HTTP server. Dropwizard is reponsible for spinning and starting that HTTP webserver for you. </li>
<li>Jersey framework (RESTful web framework). JAX-RS reference implementation. JAX-RS is a Java API for RESTful webservices. Supports creating webservices according to RESTful architectural principles.
Jersey is very useful in building RESTful web applications. HTTP requests map to Java Objects.</li>
<li>Jackson for JSON - Object mapper from JSON to Java objects.</li>
<li>Metrics library - Library to get metric insights into your application. Get insights into your code and how it is invoked in staging and production environment.</li>
<li>Guava</li>
<li>Logback (along with slf4j) - logging framework</li>
<li>Hibernate Validator - Reference implementation of Java Bean validation standard.</li>
<br>
<br>
Project structure -
<li> project-api (should contain ‘Representations’). </li>
<li> project-client (consumer of the above representation classes). </li>
<li> project-application (actual application implementation). </li>
<br>
Representation class - The class that is responsible for payload JSON structure.
<br>
Resources class - This class models the resources exposed in your RESTful API using Jersey which is a RESTful web framework.
<br>
