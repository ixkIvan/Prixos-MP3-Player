/**
 * This class is the invoker class for the command pattern
 * @author Isabella Sturm
 */
public class DeviceButton{
   // attributes
   private Command aCommand;
   
   /*
    * Constuctor for device button
    */
   public DeviceButton(Command aCommand) {
		this.aCommand = aCommand;
	}
   
   /*
    * Method to execute command of a button
    */
	public void press() {
		aCommand.execute();
	}
	
}