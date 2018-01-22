# Spring 5 CORS Bug

To reproduce:

* Build the project
* Execute "mvn spring-boot:run" from the "backend" module
* Execute "./test.sh" from the root module.

If using Spring 5.0.1, the output is:

```
< HTTP/1.1 200 OK
< Date: Mon, 22 Jan 2018 19:30:18 GMT
< Access-Control-Allow-Origin: http://localhost:3000
< Vary: Origin
< Access-Control-Allow-Methods: GET,HEAD,POST
< Access-Control-Allow-Headers: content-type
< Access-Control-Allow-Credentials: true
< Access-Control-Max-Age: 1800
< Content-Length: 0
```

If using Spring 5.0.2, the output is:

```
< HTTP/1.1 200 OK
< Date: Mon, 22 Jan 2018 19:29:22 GMT
< Vary: Origin
< Access-Control-Allow-Origin: *
< Access-Control-Allow-Methods: GET,HEAD,POST
< Access-Control-Allow-Headers: content-type
< Access-Control-Max-Age: 1800
< Content-Length: 0
```
