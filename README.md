# Proyecto - Ordenación y Búsqueda

El alumno debe implementar la clase SortingAndSearching<T> para realizar los métodos de ordenación y búsqueda específicados

## Ejecución

Tu programa debería ejecutarse de la siguiente manera:

```
ORDENACION Y BUSQUEDA
=====================

Proporcione el número de elementos:5
Proporcione el elemento 1:3
Proporcione el elemento 2:9
Proporcione el elemento 3:6
Proporcione el elemento 4:1
Proporcione el elemento 5:2

Ordenamiento logaritmico
9 6 3 2 1 

Ordenamiento secuencial
1 2 3 6 9 

Proporcione un numero:10
Busqueda lineal:
No Encontrado

Proporcione un numero:9
Busqueda binaria:
Posicion: 4
```

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: SortingAndSearching
---
classDiagram
      SortingAndSearching: +void selectionSort (T[] data)
      SortingAndSearching: +void insertionSort (T[] data)
      SortingAndSearching: +void bubbleSort (T[] data)
      SortingAndSearching: +void quickSort (T[] data, int min, int max)
      SortingAndSearching: +void mergeSort (T[] data, int min, int max)
      SortingAndSearching: +int linearSearch (T[] data, int min, int max, T target)
      SortingAndSearching: +int binarySearch (T[] data, int min, int max, T target)
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -encoding utf-8 -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -encoding utf-8 -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#testLinearSort()
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)