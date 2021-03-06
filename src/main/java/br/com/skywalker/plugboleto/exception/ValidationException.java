package br.com.skywalker.plugboleto.exception;

import br.com.skywalker.plugboleto.util.GenericErrorResponse;
import lombok.Getter;

@Getter

public class ValidationException extends Exception {
    private GenericErrorResponse error;

    public ValidationException(String message, GenericErrorResponse error){
        super(message);
        this.error = error;
    }
}
