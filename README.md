# spring-boot-book-seller




### Endpoints

### Sign-up
POST 'http://localhost:8080/api/authentication/sign-up' 
'Content-Type: application/json' 
{

    "name":"name",
    "username":"username",
    "password":"password"
}


### Sign-in
POST 'http://localhost:8080/api/authentication/sign-in' \
'Content-Type: application/json' \
 '{

    "username":"username",
    "password":"password"
}'