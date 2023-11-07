package edu.utfpr;

public class SpaceHandler extends StringFormaterHandler {

    protected UppercaseHandler nextHandler;

    @Override
    public String handle(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            nextHandler = new UppercaseHandler();
            return nextHandler.handle(s.replaceAll(" ", ""));

        }
    }
}
