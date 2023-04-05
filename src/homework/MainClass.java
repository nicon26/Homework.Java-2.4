package homework;
//Mai multe aparate electrice sunt conectate la un prelungitor. Prelungitorul nu este băgat în priză.
//Când prelungitorul este băgat în priză, toate aparatele conectate trebuie să dea un mesaj.

// toate aparatele electrice depind de prelungitor, mai exact de alimentarea acestuia.
public class MainClass {

	public static void main(String[] args) {
     
		ExtensionCord extensionCord1 = new ExtensionCord();
		
		ElectricalDevice electricalDevice1 = new ElectricalDevice();
		ElectricalDevice electricalDevice2 = new ElectricalDevice();
		
		extensionCord1.electricalDeviceConnectedToMe(electricalDevice1);
		extensionCord1.electricalDeviceConnectedToMe(electricalDevice2);
		
		extensionCord1.isPowered(true);
		
	}
}
