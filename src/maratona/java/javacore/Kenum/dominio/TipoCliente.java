package maratona.java.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int codigo;
    public final String descricao;

    TipoCliente(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static TipoCliente porNomeRelatorio (String descricao){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getDescricao().equals(descricao)){
                return tipoCliente;
            }


        }
        return null;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
