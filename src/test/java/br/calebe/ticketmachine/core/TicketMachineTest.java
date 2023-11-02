package br.calebe.ticketmachine.core;

import org.junit.Test;
import static org.junit.Assert.*;

class TicketMachineTest {

    @Test
    void testConstructor() {
        TicketMachine machine = new TicketMachine(50);
        assertEquals(0, machine.getSaldo());
    }

    @Test
    void testInserirInvalido() {
        TicketMachine machine = new TicketMachine(50);
        assertThrows(PapelMoedaInvalidaException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                machine.inserir(3); // Valor inválido
            }
        });
    }

    @Test
    void testImprimirSaldoInsuficiente() {
        TicketMachine machine = new TicketMachine(50);
        assertThrows(SaldoInsuficienteException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                machine.imprimir();
            }
        });
    }
}
