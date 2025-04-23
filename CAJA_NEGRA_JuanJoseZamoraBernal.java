package examenSegundoTrimestre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CAJA_NEGRA_JuanJoseZamoraBernal {
	
	// Prueba de Valores Límite.
	@Test
	void testMontoLimiteSuperior() {
		Departamento dep = new Departamento(null, 0);
		boolean resultado = dep.procesarPedido(Double.MAX_VALUE);
		assertFalse(resultado, "Error al procesar el pedido con el valor máximo posible del monto.");
	}
	
	@Test
	void testMontoLimiteInferior() {
		Departamento dep = new Departamento(null, 1);
		boolean resultado = dep.procesarPedido(Double.MIN_VALUE);
		assertTrue(resultado, "Error al procesar el pedido con el valor mínimo posible del monto.");
	}
	
	@Test
	void testMontoLimiteIgual() {
		Departamento dep = new Departamento(null, 5);
		boolean resultado = dep.procesarPedido(5);
		assertTrue(resultado, "Error, el pedido no excede el presupuesto.");
	}
	
	// Pruebas de Equivalencia.
	@Test
	void testEquivalenciaMontoExcedido() {
		Departamento dep = new Departamento(null, 0);
		boolean resultado = dep.procesarPedido(5);
		assertFalse(resultado, "Error, el pedido excede el presupuesto.");
	}
	
	@Test
	void testEquivalenciaMontoValido() {
		Departamento dep = new Departamento(null, 10);
		boolean resultado = dep.procesarPedido(5);
		assertTrue(resultado, "Error, el pedido no excede el presupuesto.");
	}

}
