package ru.mirea.lab6.exs12;

import java.util.ArrayList;
import java.util.List;

public class CustomStringBuilder {
    private StringBuilder stringBuilder;
    private List<Command> commandHistory;

    public CustomStringBuilder() {
        stringBuilder = new StringBuilder();
        commandHistory = new ArrayList<>();
    }

    public void append(String text) {
        AppendCommand appendCommand = new AppendCommand(text);
        appendCommand.execute(stringBuilder);
        commandHistory.add(appendCommand);
    }

    public void delete(int start, int end) {
        String deletedText = stringBuilder.substring(start, end);
        DeleteCommand deleteCommand = new DeleteCommand(start, end, deletedText);
        deleteCommand.execute(stringBuilder);
        commandHistory.add(deleteCommand);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            int lastIndex = commandHistory.size() - 1;
            Command lastCommand = commandHistory.get(lastIndex);
            commandHistory.remove(lastIndex);

            if (lastCommand instanceof UndoCommand) {
                lastCommand.execute(stringBuilder);
            }
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        CustomStringBuilder customStringBuilder = new CustomStringBuilder();

        customStringBuilder.append("Hello, ");
        customStringBuilder.append("world!");

        System.out.println(customStringBuilder.toString());

        customStringBuilder.delete(5, 12);
        System.out.println(customStringBuilder.toString());

        customStringBuilder.undo();
        System.out.println(customStringBuilder.toString());
    }
}