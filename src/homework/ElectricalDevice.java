package homework;

public class ElectricalDevice {

	private ExtensionCord extensionCord;
	
	public void isConnected(ExtensionCord extensionCord) {
		this.extensionCord = extensionCord;
		this.extensionCord.electricalDeviceConnectedToMe(this);
	}
	
	public void receiveNotificationFromExtensionCord() {
		System.out.println("Notification received! Extension cord is powered.");
	}
}
