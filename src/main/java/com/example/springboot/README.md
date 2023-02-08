This code assumes the existence of a "playground" database in your local mysql instance.

To create it: `mysql -u root -e "CREATE DATABASE playground"`.

To shutdown the instance `curl -X POST http://localhost:8080/actuator/shutdown
`