/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package librarytest;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PrintCommand;

public class Library {
    public Command giveMeACommandThatDoesSomething() {
        return new PrintCommand("If you see this, the library probably works");
    }

    public boolean someLibraryMethod() {
        return true;
    }
}