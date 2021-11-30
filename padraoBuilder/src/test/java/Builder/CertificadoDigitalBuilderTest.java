package Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CertificadoDigitalBuilderTest {

    @Test
    void deveRetornarExcecaoParaCertificadoSemProtocolo() {
        try {
            CertificadoDigitalBuilder certificadoDigitalBuilder = new CertificadoDigitalBuilder();
            CertificadoDigital certificado =  certificadoDigitalBuilder
                    .setNome("Carlos")
                    .setCpf("12345678910")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Protocolo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCertificadoSemNome() {
        try {
            CertificadoDigitalBuilder certificadoDigitalBuilder = new CertificadoDigitalBuilder();
            CertificadoDigital certificado =  certificadoDigitalBuilder
                    .setProtocolo(100005689)
                    .setCpf("12345678910")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCertificadoSemCpf() {
        try {
            CertificadoDigitalBuilder certificadoDigitalBuilder = new CertificadoDigitalBuilder();
            CertificadoDigital certificado =  certificadoDigitalBuilder
                    .setProtocolo(100005689)
                    .setCpf("Carlos")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpf inválido", e.getMessage());
        }
    }



}