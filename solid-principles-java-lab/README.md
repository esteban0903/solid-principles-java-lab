# solid-principles-java-lab

## Integrantes
- Esteban Aguilera Contreras
- Carlos David Barrero
- Daniel Alejandro Diaz

## Punto 1 - Single Responsibility Principle (SRP)
Antes: `Invoice` mezclaba datos, calculo, impresion y persistencia.

Despues: separamos responsabilidades en clases dedicadas:
- Datos: `Invoice`
- Calculo: `InvoiceCalculator`
- Impresion: `InvoicePrinter`
- Persistencia: `InvoiceRepository`

Patrones aplicados:
- SRP (separacion de responsabilidades) en las clases anteriores.
- Single Responsibility por clase, cada una con un motivo de cambio.

## Punto 2 - Open/Closed Principle (OCP)
Antes: `DiscountCalculator` dependia de `if/else` por tipo de cliente.

Despues: usamos una interfaz `DiscountStrategy` y estrategias concretas:
- `RegularDiscountStrategy`
- `VipDiscountStrategy`

Patrones aplicados:
- Strategy: cada regla de descuento es una estrategia independiente.
- OCP: para agregar un nuevo descuento, se crea otra estrategia sin modificar codigo existente.

## Punto 3 - Liskov Substitution Principle (LSP)
Antes: `Car` definía los métodos `drive()` y `refuel()`. `ElectricCar` heredaba de `Car` pero no podía usar `refuel()`, lanzando una excepción. Esto rompía el principio de sustitución, ya que no todas las subclases podían comportarse como la clase base.

Despues: separamos los comportamientos en interfaces específicas según la funcionalidad:
- Conducir: `Drivable`
- Repostar combustible: `Refuelable`
- Recargar batería: `Rechargeable`

Patrones aplicados:
- Liskov Substitution Principle (LSP), permitiendo que las clases puedan sustituir correctamente a sus abstracciones sin romper el comportamiento esperado.
- Interface Segregation Principle (ISP), dividiendo responsabilidades en interfaces pequeñas y específicas.


## Punto 4 - Interface Segregation Principle (ISP)

Antes: La interfaz `Worker` obligaba a todas las clases a implementar los métodos `work()` y `eat()`, aunque no todos los trabajadores necesitaban ambos comportamientos. En el caso de `Developer`, el método `eat()` no era necesario y terminaba lanzando una excepción, generando una implementación forzada e incorrecta.

Despues: se dividió la interfaz en interfaces más pequeñas y específicas según el comportamiento:
- Trabajo: `Workable`
- Alimentacion: `Eatable`

Cada clase implementa unicamente las interfaces que realmente necesita, evitando metodos innecesarios y eliminando implementaciones forzadas.

Patrones aplicados:
- Interface Segregation Principle (ISP), dividiendo una interfaz grande en interfaces ms pequeñas y especIficas para evitar que las clases dependan de metodos que no utilizan.
- Liskov Substitution Principle (LSP), asegurando que ninguna clase tenga que lanzar excepciones por mEtodos que no puede soportar.