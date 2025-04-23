package examenSegundoTrimestre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class INTEGRACION_JuanJoseZamoraBernal {
	
	// Pruebas de Integración.
	@Test
	void testRealizarPedido() {
		Instituto ins = new Instituto(10);
		ins.agregarDepartamento("Informática", 5000);
		
		// Intenta realizar un pedido.
		boolean resultado = ins.realizarPedido("Informática", 2000);
		
		assertTrue(resultado); // Se espera que el resultado sea true si el pedido se realiza correctamente.
	}

}
