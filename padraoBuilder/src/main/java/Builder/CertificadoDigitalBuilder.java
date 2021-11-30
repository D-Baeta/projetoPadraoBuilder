package Builder;

import java.util.Date;

public class CertificadoDigitalBuilder {

    private CertificadoDigital certific;

    public CertificadoDigitalBuilder(){
        certific = new CertificadoDigital();
    }

    public CertificadoDigital build() {
        if(certific.getProtocolo() == 0){
            throw new IllegalArgumentException("Erro na geração de Protocolo");
        }

        if(certific.getNome().equals("")){
            throw new IllegalArgumentException("Nome Inválido");
        }

        if(!validaCpf(certific.getCpf())){
            throw new IllegalArgumentException("cpf inválido");
        }
        return certific;
    }

    private Boolean validaCpf(String cpf){
        if (cpf.length() != 11) {
            return false;
        }
        return true;
    }


    public CertificadoDigitalBuilder setProtocolo(int protocolo) {
        certific.setProtocolo();
        return this;
    }


    public CertificadoDigitalBuilder setDataDaCompra(Date dataDaCompra) {
        certific.setDataDaCompra(dataDaCompra);
        return this;
    }


    public CertificadoDigitalBuilder setValidade(Date validade) {
        certific.setValidade(validade);
        return this;
    }


    public CertificadoDigitalBuilder setStatus(String status) {
        certific.setStatus(status);
        return this;
    }


    public CertificadoDigitalBuilder setCpf(String cpf) {
        certific.setCpf(cpf);
        return this;
    }

    public CertificadoDigitalBuilder setNome(String nome) {
        certific.setNome(nome);
        return this;
    }


    public CertificadoDigitalBuilder setDataDeNascimento(Date dataDeNascimento) {
        certific.setDataDeNascimento(dataDeNascimento);
        return this;
    }



    public CertificadoDigitalBuilder setEmail(String email) {
        certific.setEmail(email);
        return this;
    }



    public CertificadoDigitalBuilder setCelular(String celular) {
        certific.setCelular(celular);
        return this;
    }



    public CertificadoDigitalBuilder setLocalDeCompra(String localDeCompra) {
        certific.setLocalDeCompra(localDeCompra);
        return this;
    }



    public CertificadoDigitalBuilder setVendedor(String vendedor) {
        certific.setVendedor(vendedor);
        return this;
    }



    public CertificadoDigitalBuilder setEmissaoOnline(Boolean emissaoOnline) {
        certific.setEmissaoOnline(emissaoOnline);
        return this;
    }


    public CertificadoDigitalBuilder setCsr(String csr) {
        certific.setCsr(csr);
        return this;
    }




}
