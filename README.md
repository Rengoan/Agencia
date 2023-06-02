# Agencia
## Tabla de contenidos
- [Descripción](#descripción)
- [Uso](#uso)
- [Swagger](#swagger)

### Descripción
Se trata de 3 proyectos de microservicios realizados con springboot y una base de datos. Estos proyectos interaccionan entre si para ofrecer el servicio de una agencia.

### Uso
Para poder utilizar estos proyectos en su conjunto debes crearte 3 poyectos Spring Starter de la version 2.7.6(Esta version es necesaria para que funcione Swagger) con las siguientes caracteristicas:
- Java 8
- Maven
- Dependencias:
  - Swagger 2.9.2  
  - MySQL Driver
  - Spring Data JPA
  - Spring Web

Despues de añadir estas caracteristicas a tu proyecto, puedes crearte una base de datos llamada agencia con 3 tablas, vuelo,hotel y reserva.
Los campos de las tablas puedes comprobarlo en el paquete model de cada proyecto.
Cuando termines estos pasos, puedes copiarte el proyecto. 
Comprueba en el archivo properties que los datos de la conexion y base de datos estan correctos y los puertos no estan ocupados.
A continuacion arranca los 3 proyectos y haz las comprobaciones utilizando postman y las urls que indico en las clases controller.

### Swagger
- Vuelo -> http://localhost:8088/swagger-ui.html
- Reserva -> http://localhost:9090/swagger-ui.html
- Hotel -> http://localhost:8500/swagger-ui.html

