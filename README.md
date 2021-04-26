# challengeelder-javabackend

## Url de Heroku: https://javabackend-challenge.herokuapp.com/operation/getRateOperation

## Introducción

Se ha solicitado el diseño de un sistema para procesar operaciones con tarjetas de
crédito para una organización. Dicho sistema debe disponer de un módulo que permita con las
siguientes consideraciones, desarrollar un aplicativo:

- Una tarjeta se identifica de acuerdo a la marca, número de tarjeta, cardholder
(nombre y apellido) y fecha de vencimiento.

- Una operación es válida en el sistema si la persona que opera en el mismo consume
menos de 1000 pesos.

- Una tarjeta es válida para operar si su fecha de vencimiento es mayor al presente
día.

- Hoy en día, existen tres marcas de tarjeta de crédito, a saber: “VISA”, “NARA”,
“AMEX” y es posible que en los siguientes meses existan nuevas marcas. Cada marca
tiene un modo de calcular una tasa por el servicio que es desde 0.3% hasta 5%, a saber:

1. Tasa VISA = año / mes (Ejemplo: 20/12)

2. Tasa NARA = dia del mes *0.5 (Ejemplo: 27 * 0.5)

3. Tasa AMEX = mes*0.1 (Ejemplo: 9*0.1)

### Ejercitación

2) Implementar una API REST, que responda y reciba en formato JSON, que permita
consultar la tasa de una operación, informando marca de la tarjeta e importe.

- Hostear solución en algún cloud computing libre e indicar URL

**IMPORTANTE**: Compartir código en GIT con la solución de ambos ejercicios
