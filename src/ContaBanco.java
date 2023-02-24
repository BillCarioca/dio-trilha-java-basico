public class ContaBanco {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaBanco() {
    }

    public ContaBanco(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public String boasVindas(){
        return "Olá "+this.nomeCliente+", obrigado por criar uma conta em nosso banco"
                +", sua agência é "+this.agencia
                +", conta "+this.numero+" e seu saldo "
                +this.saldo+" já está disponível para saque.";
    }
    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "ContaBanco{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
