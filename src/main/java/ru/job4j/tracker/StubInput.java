package ru.job4j.tracker;

public class StubInput implements Input {
    private int position = 0;
    private String[] answers;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(answers[position++]);
    }
}
