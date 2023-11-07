package edu.utfpr;

public class NumberHandler extends StringFormaterHandler {

    @Override
    public String handle(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            return s.replaceAll("1", "!")
                    .replaceAll("2", "@")
                    .replaceAll("3", "#")
                    .replaceAll("4", "\\$")
                    .replaceAll("5", "%")
                    .replaceAll("6", "^")
                    .replaceAll("7", "&")
                    .replaceAll("8", "*")
                    .replaceAll("9", "(")
                    .replaceAll("0", ")");
        }

    }
}
