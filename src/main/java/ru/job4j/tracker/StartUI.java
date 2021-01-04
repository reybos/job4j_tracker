package ru.job4j.tracker;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Store tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            try {
                run = actions.get(select).execute(input, tracker);
            } catch (SQLException e) {
                out.println("Ошибка в базе данных");
                run = false;
            }
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        for (int i = 0; i < actions.size(); i++) {
            out.println(i + ". " + actions.get(i).name());
        }
    }

    public static void main(String[] args) {
        Output out = new ConsoleOutput();
        Input input = new ValidateInput(new ConsoleInput(), out);
        try (Store tracker = new MemTracker()) {
            tracker.init();
            List<UserAction> actions = new ArrayList<>();
            actions.add(new CreateAction(out));
            actions.add(new ShowAllAction(out));
            actions.add(new EditAction(out));
            actions.add(new DeleteAction(out));
            actions.add(new FindByIdAction(out));
            actions.add(new FindByNameAction(out));
//            actions.add(new GCTestAction(out));
            actions.add(new ExitAction());
            new StartUI(out).init(input, tracker, actions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
