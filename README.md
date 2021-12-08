# spring-boot-book-seller




### Endpoints

### Sign-up
```
POST 'http://localhost:8080/api/authentication/sign-up' 
'Content-Type: application/json' 
{

    "name":"name",
    "username":"username",
    "password":"password"
}

```
### Sign-in
```
POST 'http://localhost:8080/api/authentication/sign-in' \
'Content-Type: application/json' \
 '{

    "username":"username",
    "password":"password"
}'
```
### Make-admin
```
PUT 'http://localhost:8080/api/internal/make-admin/admin'
header 'Authorization: Bearer InternalApiKey1234!'
```


### Save-book
```
POST 'http://localhost:8080/api/book' 
Authorization: Bearer ... admin 
Content-Type: application/json' 

 {
"title":"test book 2",
"price":"20",
"description":"test description 2",
"author":"test author 2"
}
```

### Delete-book
```

 DELETE 'http://localhost:8080/api/book/2'
 Authorization: Bearer ... admin 

```
### Get-all-book
```
GET 'http://localhost:8080/api/book'

```

### Save-purchase
```
POST 'http://localhost:8080/api/purchase-history' 
Authorization: Bearer ... user or admin 
Content-Type: application/json' 
{
"userId": 4,
"bookId": 1,
"price": 10

}

```

### Get-user-purchases
```
GET 'http://localhost:8080/api/purchase-history' 
Authorization: Bearer ... user or admin
```
