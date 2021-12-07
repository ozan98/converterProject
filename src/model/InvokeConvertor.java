/**
 * The invoker class of the command design pattern. This class asks the command to perform the request that is make by the client.
 * The request is made by first recieving the command. This is done in the constructor. The construtor takes a command as a parameter
 * and this command is to be executed. The command is executed with the convert method. This method is implemented by calling the execute method
 * in the command class that is associated with.
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
