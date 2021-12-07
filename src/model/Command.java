/**
 * interface that represent all command objects. This class declares an interface that handles the execution of 
 * an operation through the execute method. The execute method is defined to return a double value that recieves an input value.
 * this input value is the input from the user that is asked to be converted in the respected unit.
 */

package model;

public interface Command {
    /**
     * method to call the execution of a command
     * @param val argument to be past to the execution
     * @return returns a double value.
     */
    public double execute(double val);
}
