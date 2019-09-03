# Libreria CNYT


Este repositorio fue creado para la materia de Ciencias Naturales y Tecnologia, cuyo objetivo es crear una libreria que permita realizar operaciones entre números complejos desarrollada en Java. 

### ¿Como se instala?

Para instalar esta libreria es necesario tener en cuenta los siguientes pasos:
- Entrar a la carpeta del ordenador donde deseamos descargar la libreria.
- Dar click derecho y dar el click en la opción "Git Bash".
- Utilizar el comando git clone, junto con el link de nuestra libreria (git clone https://github.com/camilavieda04/LibreriaCNYT.git)
- Una vez clonada la libreria, procedemos a abrir un editor de código.
- Finalmente hacemos uso de la libreria.

### ¿Como usar?

Al instalar la libreria encontraremos 2 tipos de carpetas una llamada main/java en donde encontraremos 2 carpetas mas, en una carpeta llamada Complejos encontraremos las clases referidas a operaciones con numeros complejos y en la carpeta MatrizComplejos encontraremos las clases utilizadas con las operaciones en matrices complejas. La otra carpeta principal es test/java en donde tambien encontraremos una clase para las pruebas de numeros complejos y otra clase para las pruebas de las matrices complejas con sus respectivas operaciones.  


### ¿Como probar?

Para probar esta libreria con diferentes casos es necesario tener en cuenta los siguientes pasos:
- Una vez instalada la libreria seguimos la siguiente ruta src -> test/java
- Decidimos que tipo de de operación queremos probar dependiendo si queremos probar operaciones entre numeros complejos o entre matrices complejas.
- Al escoger la operación debemos insertar el número o matriz a probar.
- En la variable resp insertar la respuesta que deberia dar nuestro programa con los parámetros insertados anteriormente.
- Por último damos click en la opción correr de Eclipse y asi probaremos si el caso que insertamos es correcto o no.



# Utilidades


# Version 1

- Suma de números complejos: La suma de dos números complejos es un número complejo cuya parte real es la suma de las partes reales y cuya parte imaginaria es la suma de las partes imaginarias.
- Producto de  números complejos: Para multiplicar números complejos se aplica la propiedad distributiva sobre la primera parte del primer número complejo sobre el otro número complejo, el resultado es otro número complejo.
- Resta de  números complejos: La diferencia de dos numeros complejos es otro número complejo tal que su parte real es la diferencia de las partes reales y la parte imaginaria es la diferencia de las partes imaginarias.
- Division de números complejos: Se define la división de dos números complejos a través de la multiplicación por el inverso. 
- Módulo de números complejos: Se define como la raíz cuadrada de la suma de los cuadrados de la parte entera y la parte imaginaria.
- Conjugado de números complejos: El conjugado de un número complejo se obtiene cambiando el signo de su componente imaginaria. 
- Conversión entre representaciones polar y cartesiano de números complejos: La forma polar de un número complejo es otra forma de representar un número complejo consta de dos componentes: módulo y argumento. La forma cartesiana de un número complejo esta conformada por una parte real y otra imaginaria.
- Retornar la fase de un número complejo la cual me indicará su posición o ángulo.

### Implementacion de la Version 1

Esta libreria de operaciones entre números complejos fue desarrollada en Java, desarrollamos dos clases principales una llamada Libreria la cual tiene las 4 operaciones básicas entre dos complejos y la clase Complejo en donde realizamos operaciones con un solo complejo.

# Version 2
- Adicion de vectores complejos: La suma de dos vectores complejos es un vector complejo cuya parte real es la suma de las partes reales y cuya parte imaginaria la suma de las partes imaginarias.
- Inversa de vectores complejos: Si el vector V pertenece a un espacio vectorial O debe existir un vector -V en O, tal que V + (-V) = 0.
- Multiplicacion escalar de vectores complejos: Es una aplicacion cuyo dominio es V^2 y su codominio es K, donde  V es un espacio vectorial y K es un conjunto de los escalares respectivos. 
- Adicion de matrices complejas: La matriz suma se obtiene sumando los elementos de las dos matrices que ocupan la misma posición.
- Inversa de matrices complejas: Una matriz cuadrada A de orden n se dice que es invertible si existe otra matriz cuadrada de orden n, tal que A * A^-1 = A^-1 * A = In.
- Multiplicación escalar de matrices complejas : Un numero complejo c, y una matriz de complejos A es la atriz cA. Cada elemento de la matriz cA es c veces su elemento correspondiente en A.
- Multiplicación entre matrices complejas: Dos matrices A y B son multiplicables si el numero de columnas de A coincide con el número de filas de B. Cada elemento cij de la matriz producto se obtiene multiplicando cada elemento de la fila i de la matriz A por cada elemento de la columna j de la matriz B y sumándolos.
- Matriz Transpuesta: La transpuesta de una matriz A se denota como A^T y se obtiene a partir del cambio de sus filas por sus columnas o viceversa.
- Matriz Conjugada: Es el resultado de la sustitución de los elementos de una matriz A por sus conjugados. Es decir, la parte imaginaria de cada uno de los elementos de la matriz cambia su signo.
- Matriz Adjunta: Se obtiene tomando el complejo conjugado de cada uno de sus elementos y despues permutando filas por columnas o viceversa en la matriz. 
- Norma de matrices: Para cada espacio de producto interno V, <-,-> podemos definir una norma o longitud tal que | | : V --> R definida como |V| = sqrt(<V,V>).
- Distancia entre matrices: Siendo A y B dos matrices de números complejos y la funcion trace() como la suma de la diagonal de cada una de las matrices, la distancia se define como sqrt(trace((A-B)*(A-B´))).
- Matriz Unitaria: Es una matriz compleja U de nxn elementos, que satisface la siguiente condición: U*U = U*U^* = In. Siendo In la matriz identidad y U^* la matriz adjunta. 
- Matriz Hermitiana: Es una matriz cuadrada de elementos complejos que tiene la caracteristica de ser igual a su propia adjunta. 

### Implementación de la Version 2 

En esta libreria de operaciones entre matrices complejas, se desarrollaron dos clases principales una llamada LibreriaMatrizComplejo donde encontramos todas las operaciones que se nombraron anteriormente entre matrices complejas. Y otra clase llamada MatrizComplejo en donde estan los métodos básicos que se necesitan para desarrollar nuestro programa. 



