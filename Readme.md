# Examen recuperación MVC
---
Transforma esta aplicación según la arquitectura MVC vista en clase, sin cambiar la funcionalidad

Valoración:

* Clases por separado
* Funcionalidad de la vista (20 puntos)
* Funcionalidad del Controller (20 puntos)
* Utilización de Clase para guardar datos (como la clase Coche utilizada en clase) (20 puntos)
  * Coherencia con la clase Model (10 puntos)
* Realización de commits por cada paso que se realice (10 puntos)
* Comentarios en el código (5 puntos)
* Readme justificando la toma de desición y describiendo los beneficios aportados por el cambio de código (15 puntos)


# Respuestas examen

* Se estructuró el codigo en base a la estrutura MVC para guardar un orden y coherencia en el codigo.
* La clase main no usaba variables generales y tenía las funciones, el menu, etc en un mismo public class
* Se creo la clase *Datos* para guardar las variables que se llenan con la informacion introducida por el usuario
* Se creo la clase Model para codificar las funciones principales edl programa
* En el Controller se hace un llamado a cada funcion de la clase Model
* En la View se realiza el menu que se mostrara por pantalla al usuario cuando inicie el programa, se realiza el bucle *do-while* para realizar propiamente el
menu, y se utiliza un switch case donde cada opcion elegida por el usuario desencadena un *case* que llama a la funcion elegida desde el Controller
* FInalmente la clase *App* tiene el public class *main* donde mediante **View.menu()** el programa compila y se muestra.