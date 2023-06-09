package io.github.microservices.avaliablecredit.application.exception;

public class ErrorRequestCardsException extends RuntimeException{
    public ErrorRequestCardsException(String message) {
        super(message);
    }
}
