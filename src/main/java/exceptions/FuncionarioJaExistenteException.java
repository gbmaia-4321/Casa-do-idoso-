package exceptions;

public class FuncionarioJaExistenteException extends Exception {
    public FuncionarioJaExistenteException(String msg) {
        super(msg);
    }
}
