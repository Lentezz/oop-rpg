package com.example.ooprpg.command.comands;

import com.example.ooprpg.command.Command;

public class ContinueGame implements Command {
    @Override
    public void execute() {
        Command c = new StartGame();
        c.execute();
    }
}
