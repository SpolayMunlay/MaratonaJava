package MaratonaJava.Javacore.Kenum.Dominium;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2,"Pessoa Juridica");

    private int VALOR;
    private String NOME_RELATORIO;

    TipoCliente(int VALOR, String NomeRelatorio) {
        this.VALOR = VALOR;
        this.NOME_RELATORIO = NomeRelatorio;
    }

    public static TipoCliente TipoCliente_porNomeRelatorio(String NomeRelatrio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNOME_RELATORIO().equals(NomeRelatrio)){
                return tipoCliente;
            }
        }
    return null;
    }
    TipoCliente (int VALOR){
        this.VALOR = VALOR;
    }
    public int getValor(){
        return VALOR;
    }

    public String getNOME_RELATORIO() {
        return NOME_RELATORIO;
    }

    public void setNOME_RELATORIO(String NOME_RELATORIO) {
        this.NOME_RELATORIO = NOME_RELATORIO;
    }

    public int getVALOR() {
        return VALOR;
    }

    public void setVALOR(int VALOR) {
        this.VALOR = VALOR;
    }
}
