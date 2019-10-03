import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;

import java.util.List;

public class CPF {

    private String numero;

    public CPF(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean validar() {

        CPFValidator validar = new CPFValidator();
        List<ValidationMessage> erros = validar.invalidMessagesFor(numero);

        return erros.isEmpty();
    }
}
