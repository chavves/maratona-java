package maratona.java.javacore.Kenum.dominio;

public enum TipoPagamento{
    CREDITO("Cartão de Crédito") {
        @Override
        public double calcularDesconto(double valor) {

            return valor * 0.05;
        }
    },
    DEBITO("Cartão de Débito") {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    };

        private final String descricao;

    TipoPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double calcularDesconto(double valor);
}