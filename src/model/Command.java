/**
 * interface that represent all command objects
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
