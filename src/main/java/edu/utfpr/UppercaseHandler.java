package edu.utfpr;

public class UppercaseHandler extends StringFormaterHandler {

    protected NumberHandler nextHandler;

    @Override
    public String handle(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            nextHandler = new NumberHandler();
            return nextHandler.handle(s.toUpperCase());
        }
    }
}
