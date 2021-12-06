package model;

public class InvokeConvertor {
    Command command;
    
    public InvokeConvertor(Command newCommand){
        command = newCommand;
    }

    public double convert(double val){
        return command.execute(val);
    }


    
}
