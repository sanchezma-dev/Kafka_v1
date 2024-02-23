
![My Skills](https://skillicons.dev/icons?i=kotlin&theme=light) 
# Ejemplo de kafka con kotlin

Prueba para enviar un mensaje kafka desde un productor a un consumidor.
Para ello, en el ejemplo, desde el controller de usuario, se enviará el mensaje kafka y este será recogido por el consumer 'NotificacionKafka' que estará escuchando el topic.


## Comando para despliegue de kafka
Situados en la carpeta bin/windows

Ejecutar en este orden

```bash
  zookeeper-server-start.bat ..\..\config\zookeeper.properties

```

```bash
  kafka-server-start.bat ../../config/server.properties

```

