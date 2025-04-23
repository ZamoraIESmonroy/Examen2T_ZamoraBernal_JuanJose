# Examen2T_ZamoraBernal_JuanJose

Pruebas de Valores Límite: he probado los valores máximos, mínimos e igual que puede tomar el atributo monto y verificado que funciona el método
procesar pedido, esperando el resultado false cuando el monto en su maximo valor supera al presupuesto y esperando true cuando el monto en su mímimo
valor es inferior al presupuesto, y también true cuando el monto y el presupuesto son iguales.

Pruebas de Equivalencia: he probado con valores donde el monto excede el presupuesto y donde el monto es válido. Esperando false cuando excedemos el presupuesto y true cuando es inferior.

Pruebas de Cobertura de Decisiones: evalúo la rama del if-else del método procesar pedido, esperando false en la rama del if y true en la rama del else.

Pruebas de Cobertura de Caminos Independientes: probé dos caminos, uno donde el monto superaba el presupuesto y otro donde el monto era inferior al 
presupuesto, esperando los resultados false y true respectivamente.

Pruebas de Integración: para verificar la integración entre los métodos realizarPedido de la clase Instituto y procesarPedido de la clase Departamento, 
hice una prueba donde Instituto tiene un Departamento "Informática" con un presupues de 5000, donde se realiza un pedido desde ese mismo departamento por
un monto de 2000 esperando como resultado true.