public class Principal {
    public static void main(String[] args) {

        CPF cpf = new CPF("446.877.998-50");

        if(cpf.validar()){
            System.out.println("Válido");
        }
        else{
            System.out.println("Inválido");
        }
    }
}