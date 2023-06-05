# Hotel
## Tabla de contenidos
- [Descripción](#descripción)
- [Requisitos](#requisitos)
- [Configuracion de la base de datos](#configuracion-de-la-base-de-datos)
- [Ejecucion de la aplicacion](#ejecucion-de-la-aplicacion)
- [Swagger](#swagger)
- [Estructura](#estructura)

### Descripción
Este proyecto es un sistema de gestión de hoteles desarrollado en Java utilizando el framework Spring Boot y la persistencia de datos con JPA (Java Persistence API). Proporciona funcionalidades para administrar la información de los hoteles, como agregar nuevos hoteles, buscar hoteles por nombre y obtener una lista de todos los hoteles disponibles.

### Requisitos

Antes de ejecutar este proyecto, asegúrate de tener instalado lo siguiente:

- Java JDK 8 o superior.
- Maven.
- Swagger 2.9.2  
- MySQL Driver
- Spring Data JPA
- Spring Web

### Configuracion de la base de datos

Antes de ejecutar la aplicación, debes configurar la conexión a la base de datos en el archivo application.properties ubicado en la carpeta src/main/resources. Asegúrate de proporcionar la URL, el nombre de usuario y la contraseña correctos para tu base de datos.

```Java

spring.datasource.url=jdbc:mysql://localhost:3306/nombre_basedatos
spring.datasource.username=usuario
spring.datasource.password=contraseña

```
   
### Ejecucion de la aplicacion

Para ejecutar la terminal sigue estos pasos:
- Abre un terminal o linea de comandos
- Navega hasta la carpeta raiz del proyecto
- Ejecuta el siguiente comando:
   ```Java 

   mvn spring-boot:run 
   
   ```
- La aplicación se ejecutará y estará disponible en la siguiente URL: http://localhost:8500.


### Swagger

La API del sistema de gestión de hoteles está documentada con Swagger. Puedes acceder a la documentación desde la siguiente URL: http://localhost:8500/swagger-ui.html. La documentación describe todos los endpoints disponibles, sus parámetros y respuestas correspondientes.

### Estructura

El proyecto sigue una estructura MVC (Modelo-Vista-Controlador) y consta de los siguientes paquetes y clases principales:
+ ***com.curso.model:*** Este paquete contiene la clase Hotel, que representa la entidad de un hotel con sus atributos y métodos de acceso.
+ ***com.curso.dao:*** Este paquete contiene la interfaz HotelDao, que extiende la interfaz JpaRepository de Spring Data JPA y proporciona métodos para acceder a los datos de la entidad Hotel.
+ ***com.curso.service:*** Este paquete contiene la interfaz HotelService y su implementación HotelServiceImpl, que definen y proporcionan métodos para la lógica de negocio relacionada con los hoteles.
+ ***com.curso.controller:*** Este paquete contiene la clase HotelController, que es el controlador REST que gestiona los endpoints relacionados con los hoteles.
+ ***com.curso.inicio:*** Este paquete contiene la clase principal Application, que inicia la aplicación Spring Boot. También incluye la clase SwaggerConfig, que configura Swagger para la generación de documentación de la API.

     
    
    
    
