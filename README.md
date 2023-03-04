# Proyecto Integrador Portfolio Web Backend
## Tabla de contenidos
1. [Resumen](#resumen)
2. [Desarrollo](#desarrollo)
3. [Tecnologías](#tecnologias)
4. [Visualización](#visualizacion)
5. [Agradecimientos](#agradecimientos)



## Resumen

Proyecto integrador que muestra una aplicación full stack incluyendo: datos personales, estudios cursados, experiencia laboral, conocimiento de las tecnologías y mucho más.


### ¿Qué incluye?

Este proyecto final es parte del curso Argentina Programa: Yo Programo, diseñado de forma autogestionada.
Se desarrolla una **web principal** que puede ser visualizada por cualquier usuario y una web de admin, estilo **dashboard** al cual se accede con usuario y contraseña definidos en la base de datos, y en el cual se puede realizar CRUD (Create-Read-Update-Delete) de datos en los formularios creados.



## Desarrollo

Se implementa como arquitectura distribuida. El contenido de la misma es:
 * **Frontend**: Diseño de interfaz de usuario que muestra la info. Para mayor info, haga click [aquí](https://github.com/mariemelendez88/PortfolioFrontEnd).
 * **Base de datos**: que almacena los datos mencionados. Para mayor info, haga click [aquí](https://github.com/mariemelendez88/PortfolioDatabase).
 * **Backend**: APIs necesarias para proveer a través de internet la información.
![Image text](https://i.ibb.co/LYPRjwG/Arquitectura.png)


### BackEnd

Este repositorio desarrolla la segunda parte **BackEnd**.
Para ello se incluyen varias ramas dentro del repo, que tiene las etapas necesarias para seguir la evolución del proyecto desde que se inició hasta que fue implementado.

a. [Repo Master](https://github.com/mariemelendez88/PortfolioBackEnd/tree/master): incluye el desarrollo de todo el proyecto, rama que se asoció a Netbeans y se hacía la actualización usando los famosos tres comandos de github, es decir: (i)```git add .```, (ii)```git commit -m "message"``` y (iii)```git push```. Comandos que tiene el menú del proyecto y facilitó el uso evitando así tener que abrir terminales asociadas.

b. [Repo Backup](https://github.com/mariemelendez88/PortfolioBackEnd/tree/backup): permitió guardar una copia del proyecto cada vez que se cargaba a github, de manera tal que si se cometía un error en el master, se tenía como volver atrás eliminando la rama master y creandola de nuevo con la info y archivos de este repo.

c. Pruebas de implementación con el frontend:

* [main](https://github.com/mariemelendez88/PortfolioBackEnd): Repo final implementado en la arquitectura distribuida.

Una vez desarrollado el backend, se realizó el despliegue en **Render**, utilizando las herramientas del curso, creando así el archivo Dockerfile y revisando que se creara lo necesario, para guardar en github y deployar. Se logró al tercer intento, puesto que tenía instalado en la pc jdk17 y se realizó una actualización a jdk19, lo que permitió que sí se cargara al repo remoto la info completa de la rama, para poder deployar.


## Tecnologías

Las tecnologías y lenguajes utilizados en el ***backend*** se listan a continuación:
* [Java](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html), Versión 19
* [Netbeans](https://netbeans.apache.org/download/nb15/), Versión 15


## Visualización

El repo backend se puede ubicar en el siguiente [link](https://portfoliobackend-ab8p.onrender.com). 

Dicho link fue sustituido en los servicios del frontend para poder hacer la conexión correspondiente.


## Agradecimientos
**A Dios** que me permitió entrar en este gran mundo del saber, pues la programación requiere tiempo y esfuerzo.

**A mi mom y mi familia** que me han apoyado, y siempre están a mi lado en todo lo que hago! Gracias ma

**A ProgramaTK** gracias Gaby, Cintia, Heber, Migue, Karin, Celi... Me llevo gratos recuerdos porque no fue posible sin los meets de los martes y jueves más el super express.

**A todas...** aquellas personas que estuvieron en este camino.
