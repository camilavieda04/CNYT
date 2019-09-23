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
  ### Ejemplo
   sumarComplejos((3,-6),(-8,5))
 
- Producto de  números complejos: Para multiplicar números complejos se aplica la propiedad distributiva sobre la primera parte del primer número complejo sobre el otro número complejo, el resultado es otro número complejo.
  ### Ejemplo
   ProductoComplejos((3,-6),(-8,5))
  
- Resta de  números complejos: La diferencia de dos numeros complejos es otro número complejo tal que su parte real es la diferencia de las partes reales y la parte imaginaria es la diferencia de las partes imaginarias.
  ### Ejemplo
    restarComplejos((3,-6),(-8,5))

- Division de números complejos: Se define la división de dos números complejos a través de la multiplicación por el inverso. 
  ### Ejemplo
    DividirComplejos((3,-6),(-8,5))

- Módulo de números complejos: Se define como la raíz cuadrada de la suma de los cuadrados de la parte entera y la parte imaginaria.
  ### Ejemplo 
    moduloComplejo(3,-6)

- Conjugado de números complejos: El conjugado de un número complejo se obtiene cambiando el signo de su componente imaginaria. 
  ### Ejemplo
    conjugadoComplejo(3,-6)

- Conversión entre representaciones polar y cartesiano de números complejos: La forma polar de un número complejo es otra forma de representar un número complejo consta de dos componentes: módulo y argumento. La forma cartesiana de un número complejo esta conformada por una parte real y otra imaginaria.
  ### Ejemplo
    cartesianoApolar(3,-6)

- Retornar la fase de un número complejo la cual me indicará su posición o ángulo.
  ### Ejemplo
    faseComplejo(3,-6)


### Implementacion de la Version 1

Esta libreria de operaciones entre números complejos fue desarrollada en Java, desarrollamos dos clases principales una llamada Libreria la cual tiene las 4 operaciones básicas entre dos complejos y la clase Complejo en donde realizamos operaciones con un solo complejo.

# Version 2
- Adicion de vectores complejos: La suma de dos vectores complejos es un vector complejo cuya parte real es la suma de las partes reales y cuya parte imaginaria la suma de las partes imaginarias.
  ### Ejemplo
     v1 = [3,2,1]
     
     v2 = [5,4,2]
     
     sumaVectores(v1,v2)
 
- Inversa de vectores complejos: Si el vector V pertenece a un espacio vectorial O debe existir un vector -V en O, tal que V + (-V) = 0.
   ### Ejemplo
      v1 = [3,2,1]
      
      inversa(v1)
  
- Multiplicacion escalar de vectores complejos: Es una aplicacion cuyo dominio es V^2 y su codominio es K, donde  V es un espacio vectorial y K es un conjunto de los escalares respectivos. 
  ### Ejemplo
    v1 = [3,2,1]
    
    a = (3,1)
    
    productoEscalarMatriz(a,v1)
  
- Adicion de matrices complejas: La matriz suma se obtiene sumando los elementos de las dos matrices que ocupan la misma posición.
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    m2 = [[[8,-9],[-1,2]],[[8,5],[3,1]]
    
    sumaMatrizComplejo(m1,m2)

- Inversa de matrices complejas: Una matriz cuadrada A de orden n se dice que es invertible si existe otra matriz cuadrada de orden n, tal que A * A^-1 = A^-1 * A = In.
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    inversa(m1)

- Multiplicación escalar de matrices complejas : Un numero complejo c, y una matriz de complejos A es la atriz cA. Cada elemento de la matriz cA es c veces su elemento correspondiente en A.
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    a = (3,1)
    
    productoEscalarMatriz(a,m1)

- Multiplicación entre matrices complejas: Dos matrices A y B son multiplicables si el numero de columnas de A coincide con el número de filas de B. Cada elemento cij de la matriz producto se obtiene multiplicando cada elemento de la fila i de la matriz A por cada elemento de la columna j de la matriz B y sumándolos.
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    m2 = [[[8,-9],[-1,2]],[[8,5],[3,1]]
    
    multiplicacionMatrices(m1,m2)

- Matriz Transpuesta: La transpuesta de una matriz A se denota como A^T y se obtiene a partir del cambio de sus filas por sus columnas o viceversa.
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    transpuesta(m1)
  
- Matriz Conjugada: Es el resultado de la sustitución de los elementos de una matriz A por sus conjugados. Es decir, la parte imaginaria de cada uno de los elementos de la matriz cambia su signo.
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    conjugada(m1)
  
- Matriz Adjunta: Se obtiene tomando el complejo conjugado de cada uno de sus elementos y despues permutando filas por columnas o viceversa en la matriz. 
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    adjunta(m1)

- Norma de matrices: Para cada espacio de producto interno V, <-,-> podemos definir una norma o longitud tal que | | : V --> R definida como |V| = sqrt(<V,V>).
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    normaMatriz(m1)
  
- Distancia entre matrices: Siendo A y B dos matrices de números complejos y la funcion trace() como la suma de la diagonal de cada una de las matrices, la distancia se define como sqrt(trace((A-B)*(A-B´))).
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    m2 = [[[8,-9],[-1,2]],[[8,5],[3,1]]
    
    distanciaMatriz(m1,m2)

- Matriz Unitaria: Es una matriz compleja U de nxn elementos, que satisface la siguiente condición: U*U = U*U^* = In. Siendo In la matriz identidad y U^* la matriz adjunta. 
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    Unitaria(m1)
    
- Matriz Hermitiana: Es una matriz cuadrada de elementos complejos que tiene la caracteristica de ser igual a su propia adjunta. 
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    Hermitiana(m1)

- Producto Tensor: Recibe dos matrices con una parte real y una imaginaria y retorna el producto tensor.
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    m2 = [[[8,-9],[-1,2]],[[8,5],[3,1]]
    
    productoTensor(m1,m2)
    
- Producto Interno: Dada una matriz se devuelve como resultado su producto interno 
  ### Ejemplo
    m1 = [[[3,2],[5,-2]],[[4,2],[8,4]]]
    
    m2 = [[[8,-9],[-1,2]],[[8,5],[3,1]]
    
    productoInterno(m1,m2)
      
  
### Implementación de la Version 2 

En esta libreria de operaciones entre matrices complejas, se desarrollaron dos clases principales una llamada LibreriaMatrizComplejo donde encontramos todas las operaciones que se nombraron anteriormente entre matrices complejas. Y otra clase llamada MatrizComplejo en donde estan los métodos básicos que se necesitan para desarrollar nuestro programa. 


# Version 3
  - Calcular el estado del sistema despues de n clicks. En este programa el usuario tiene permitido ingresar una matriz booleana en donde describe la forma en la que se mueven las canicas, puede ingresar el estado inicial de cuantas canicas hay en la matriz y tambien puede ingresar el numero de clicks en el que desea ver el estado final del sistema. 
  ### Ejemplo
    m1 = [[[0,0],[0,0]],[[1,0],[0,1]]]

    m2 = [[[6,0],[2,0]],[[1,0],[5,0]]]
    
    clicks = 2
    
    program311(m1,m2,clicks)
    
  -  Calcular el estado del sistema despues de n clicks. En este programa el usuario tiene permitido ingresar una matriz de fracciones en donde describe la forma en la que se mueven las canicas, puede ingresar el estado inicial de cuantas canicas hay en la matriz y tambien puede ingresar el numero de clicks en el que desea ver el estado final del sistema.
  
  ### Ejemplo
    m1= [[[0,0],[0.5,0]],[[0.5,0],[0,0]]]

    m2= [[[1,0],[0,0]],[[0,0],[0,0]]]

    clicks = 2

    program311(m1,m2,clicks)
  
  - Calcula la matriz resultante del experimento. En este programa el usuario tiene permitido ingresar el numero de rendijas, el numero de blancos u objetivos y las probabilidades de que la bala se mueva de cada ranura a cada uno de los blancos.
  
  ### Ejemplo
    r = 2
    b = 2
    program321(r,b)
  
  
 # Experimento de la Doble Rendija: <a href="https://github.com/julianagarzond"> Con la colaboracion de Juliana Garzón Duque </a>
 
Este experimento ha sido uno de los mejores en la física cuántica. Consiste en lanzar fotones o electrones de uno en uno hacia una pantalla, entre la pantalla y el laser hay una lámina con dos rendijas. Intuitivamente pensaríamos que las partículas pasarán por cada una de las dos rendijas y que veriamos dos lineas verticales por cada una de las rendijas, pero forma un montón de rendijas. 

  ### Explicación 
  Este experimento demostró que las particulas cuánticas se comportan como ondas y partículas al mismo tiempo por lo que la       interpretación del experimento es que la partícula cuántica pasa por las 2 rendijas a la vez e interfiere consigo misma,         creando el patrón de interferencia. Al comenzar el experimento los electrones se distribuirán por la rendija de una forma       aparentemente aleatoria, pero al incrementar el número de impactos veremos cómo va formandose el patrón de interferencia. 
  

  ### Procedimiento de Elaboración
  1. Utilizamos los siguientes elementos para la elaboración del montaje: 
      - Laser
      - Aluminio
      - Hoja de Papel
      - 1 Palo de Balso 
      - Silicona
      - Bisturí 
      - Cartón 
      - Cinta 
      - Cartulina Negra 
      
      ![exp1](https://user-images.githubusercontent.com/48154086/65465266-6f0e3580-de21-11e9-9059-c69144aadbdc.jpg) 
      
  2. Realizamos dos cortes paralelos en las laminas de aluminio las cuales serán las rendijas y pegamos las laminas en la hoja        blanca.
      
     ![exp2](https://user-images.githubusercontent.com/48154086/65465267-6f0e3580-de21-11e9-9963-287dea9f32fc.jpg)
  
  3. Tomamos el palo de balso y lo partimos en cuatro pedazos para realizar una base donde se sostendra la hoja blanca con las        rendijas realizadas anteriormente. Y pegamos la base al carton. 
  
  
  4. Utilizamos una caja de madera junto con un pedazo del palo de balso como soporte para el laser. 
    ![exp4](https://user-images.githubusercontent.com/48154086/65465269-6f0e3580-de21-11e9-9221-ab31392a42ba.jpg)
    
  5. De igual forma pegamos el soporte hecho anteriormente al cartón.
    ![exp7](https://user-images.githubusercontent.com/48154086/65465272-6fa6cc00-de21-11e9-8594-185819a114e3.jpg)
 
  6. Colocamos la cartulina negra como pantalla, para visualizar el patrón que se forma.
   ![exp7](https://user-images.githubusercontent.com/48154086/65465272-6fa6cc00-de21-11e9-8594-185819a114e3.jpg)
   
  7. Finalmente prendemos el laser y obtenemos el siguiente resultado:
  
  ![exp10](https://user-images.githubusercontent.com/48154086/65465276-6fa6cc00-de21-11e9-8d45-502430bbe1e0.jpg)
  ![exp11](https://user-images.githubusercontent.com/48154086/65465277-6fa6cc00-de21-11e9-9487-756551e42204.jpg)
  ![exp9](https://user-images.githubusercontent.com/48154086/65465274-6fa6cc00-de21-11e9-885c-dc60fde96470.jpg)
  
  <a href="https://youtu.be/FM4rYew_SzE"> Video de Experimento de Doble Rendija </a>
  

  
  
  
  
  
  
    
    
  
  
  
   
    

  
  
  



  
  
    
    

  
  


