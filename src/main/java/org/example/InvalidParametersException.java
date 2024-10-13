package org.example;

public class InvalidParametersException extends Exception{

    public InvalidParametersException (){
        super();
    }

    public InvalidParametersException(String message) {
        super(message);
    }

}
