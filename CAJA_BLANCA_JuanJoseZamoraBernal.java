package examenSegundoTrimestre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CAJA_BLANCA_JuanJoseZamoraBernal {
	
	// Prueba de Cobertura de Decisiones
	@Test
	void testProcesarPedidoCoberturaDecisiones() {
		Departamento dep = new Departamento(null, 1000);
		assertEquals(false, dep.procesarPedido(1200)); // evalúa la rama del if.
		assertEquals(true, dep.procesarPedido(500)); // evalúa la rama del else.
	}
	
	// Prueba de Cobertura de Caminos Independientes
	@Test
	void testProcesarPedidoCaminosIndependientes() {
		Departamento dep = new Departamento(null, 1000);
		assertEquals(true, dep.procesarPedido(500), "Error, el pedido no excede el presupuesto."); // Camino 1 (monto < presupuesto).
		assertEquals(false, dep.procesarPedido(1200), "Error, el pedido excede el presupuesto."); // Camino 2 (monto > presupuesto).
	}

}
