package maratona.java.javacore.Kenum.test;

import maratona.java.javacore.Kenum.dominio.Cliente;
import maratona.java.javacore.Kenum.dominio.TipoCliente;
import maratona.java.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Seu Barriga", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO );
        Cliente c2 = new Cliente("Seu Madruga", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getDescricao());
        TipoCliente tipoCliente1 = TipoCliente.porNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente1);
    }
}
