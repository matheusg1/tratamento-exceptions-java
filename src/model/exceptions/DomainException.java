package model.exceptions;

public class DomainException extends RuntimeException /*Exception*/{
    public DomainException(String msg){
        super(msg);
    }
}
