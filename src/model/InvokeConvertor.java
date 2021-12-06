/**
 * The invoker class. Commands to perfom request
 */

package model;

public class InvokeConvertor {
    Command command;
    
    /**
     * Constructor that initilizes a command to be executed 
     * @param newCommand the command that is requested to execute
     */
    public InvokeConvertor(Command newCommand){
        command = newCommand;
    }

    /**
     * Method that performs the requested command
     * @param val value to be converted 
     * @return the converted value
     */
    public double convert(double val){
        return command.execute(val);
    }


    
}
