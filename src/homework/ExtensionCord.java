package homework;
import java.util.ArrayList;
import java.util.List;

// i do not know how "prelungitor" is spelled in english, i'm sorry, this is what google translate suggested :)

public class ExtensionCord {
 
	private List<ElectricalDevice> connectedToExtensionCord = new ArrayList<ElectricalDevice>();
	
	void electricalDeviceConnectedToMe(ElectricalDevice electricalDevice) {
		connectedToExtensionCord.add(electricalDevice);
	}
	
	public void isPowered(boolean action) {
		//boolean powered;
		if(action == true) {
			System.out.println("The extension cord is powered.");
			
			for(ElectricalDevice electricalDevice: this.connectedToExtensionCord) 
		     	electricalDevice.receiveNotificationFromExtensionCord();
		}
		else
			System.out.println("The extension cord is not powered.");
	
	    
	    
	}
}
