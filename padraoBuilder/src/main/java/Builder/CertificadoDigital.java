package Builder;

import java.util.Date;

public class CertificadoDigital {

    private int protocolo;
    private Date dataDaCompra;
    private Date Validade;
    private String status;
    private String cpf;
    private String nome;
    private Date dataDeNascimento;
    private String email;
    private String celular;
    private String localDeCompra;
    private String vendedor;
    private Boolean emissaoOnline;
    private String csr;


    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo() {
        this.protocolo = protocolo;
    }

    public Date getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(Date dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public Date getValidade() {
        return Validade;
    }

    public void setValidade(Date validade) {
        Validade = validade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLocalDeCompra() {
        return localDeCompra;
    }

    public void setLocalDeCompra(String localDeCompra) {
        this.localDeCompra = localDeCompra;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Boolean getEmissaoOnline() {
        return emissaoOnline;
    }

    public void setEmissaoOnline(Boolean emissaoOnline) {
        this.emissaoOnline = emissaoOnline;
    }

    public String getCsr() {
        return csr;
    }

    public void setCsr(String csr) {
        this.csr = csr;
    }

}
