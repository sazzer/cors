#!/bin/bash

curl 'http://localhost:8080/graphql' -v -X OPTIONS -H 'Pragma: no-cache' -H 'Access-Control-Request-Method: POST' -H 'Origin: http://localhost:3000' -H 'Accept-Encoding: gzip, deflate, br' -H 'Accept-Language: en-GB,en;q=0.9,en-US;q=0.8' -H 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36' -H 'Accept: */*' -H 'Cache-Control: no-cache' -H 'Referer: http://localhost:3000/' -H 'Connection: keep-alive' -H 'Access-Control-Request-Headers: content-type' --compressed
