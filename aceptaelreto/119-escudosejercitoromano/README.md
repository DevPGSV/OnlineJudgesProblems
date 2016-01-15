# [Escudos del ejército romano] (https://www.aceptaelreto.com/problem/statement.php?id=119)

Son famosas las formaciones que el antiguo ejército romano utilizaba para entrar en batalla. En esas formaciones, los legionarios se agrupaban en una figura geométrica (normalmente un rectángulo) y protegían tanto los flancos como la parte superior utilizando escudos. Los legionarios que ocupaban posiciones interiores cubrían la parte superior colocando el escudo sobre su cabeza, mientras que los que ocupaban los flancos llevaban dos y hasta tres escudos: uno para proteger la parte superior y uno o dos escudos (si estaban en la esquina) para proteger los laterales. Con esta formación, todos los legionarios quedaban protegidos por los escudos y eran muy difíciles de vencer.

Cuenta la historia que existió un general que estableció que la mejor figura para la formación no era la rectangular sino la cuadrada, de forma que el número de filas y columnas de legionarios coincidía. El problema al que se enfrentaba este general era decidir en cuántas formaciones (y de qué tamaño) debía separar su ejército para que:
 
 * No quedara ningún legionario fuera de una formación (aunque admitía formaciones de un único legionario).
 * Se minimizara el número de escudos necesarios para protegerlos.
 
 Nuestro general, después de hacer muchos cálculos, decidió que la mejor manera de que estas dos condiciones se cumpliesen era comenzar haciendo el cuadrado más grande posible con sus legionarios. Con los que le quedasen libres volvía a repetir la operación, y así hasta que no quedasen legionarios que formar.

Por ejemplo, si el número de legionarios en el ejército era 35, la manera utilizada por el general para hacer la formación consistía en un cuadrado de 25 legionarios (5×5), otro de 9 (3×3) y otro de 1 (1×1):

```
* * * * *				
* * * * *		* * *		
* * * * *		* * *		*
* * * * *		* * *		
* * * * *
```

Esta formación requería un total de 71 escudos.

## Entrada
La entrada estará compuesta de múltiples casos de prueba, cada uno en una línea.

Cada caso de prueba indicará el número de legionarios en el ejército que se quiere poner en formación (un ejército tiene como mucho diez millones de legionarios). La entrada terminará con un ejército de cero legionarios, que no provocará salida.

## Salida
Para cada caso de prueba se escribirá una línea que indicará el número de escudos mínimo que necesitamos para cumplir las restricciones del general.

## Entrada de ejemplo
```
35
20
10
0
```
## Salida de ejemplo
```
71
44
26
```
