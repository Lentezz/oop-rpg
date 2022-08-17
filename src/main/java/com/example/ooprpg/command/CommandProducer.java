package com.example.ooprpg.command;

import com.example.ooprpg.command.comands.*;

import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;

public class CommandProducer {
    private final Map<CommandPool, Command> commands = new EnumMap<>(CommandPool.class);
    private static final CommandProducer instance = new CommandProducer();

    public CommandProducer(){
        commands.put(CommandPool.NEW_GAME, new NewGame());
        commands.put(CommandPool.MAIN_PAGE, new MainPage());
        commands.put(CommandPool.START_GAME , new StartGame());
        commands.put(CommandPool.CONTINUE , new ContinueGame());
        commands.put(CommandPool.HELICOPTER , new MakeOrder());
        commands.put(CommandPool.LOSE , new Lose());
        commands.put(CommandPool.WIN , new Win());
        commands.put(CommandPool.MAKE_RGR , new RGR());
        commands.put(CommandPool.BUY_DIPLOMA , new BuyDiploma());
        commands.put(CommandPool.OVERSLEEP , new Oversleep());
        commands.put(CommandPool.BUY_A_DIPLOMA , new BuyDiploma());
        commands.put(CommandPool. PLAY_DOTA , new PlayDota());
        commands.put(CommandPool.FALL_ASLEEP , new FallAsleep());
        commands.put(CommandPool.EAT_SHAWARMA , new EatShawarma());
        commands.put(CommandPool.DRINK_TEA , new DrinkTea());
        commands.put(CommandPool.POSTCARDS , new Work());
        commands.put(CommandPool.SING_AT_POLYANA , new Sign());
        commands.put(CommandPool.EPAM , new EPAM());
        commands.put(CommandPool.IT_STEP , new Step() );
    }

    public Command getCommand(String commandName){
        String cmd = commandName.replace(" ", "_").toUpperCase(Locale.ROOT);
        CommandPool name;
        Command command;
        try{
            name = CommandPool.valueOf(cmd);
            return commands.get(name);
        }
        catch (IllegalArgumentException e){
            System.out.println("Error, no such command");
            command = commands.get(CommandPool.MAIN_PAGE);
        }
        return command;
    }
    public static CommandProducer getInstance() {
        return instance;
    }
}
