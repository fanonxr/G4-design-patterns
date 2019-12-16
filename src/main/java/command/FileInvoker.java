package command;

/** Invoker is a simple class that encapsulates the Command
 * and passes the request to the command object to process it. */
public class FileInvoker {

  public Command command;
  /* takes in the command or a list of commands */
  public FileInvoker(Command c) {
    this.command = c;
  }

  /**
   * will execute the type of command from the invoker */
  public void execute() {
    this.command.execute();
  }
}
