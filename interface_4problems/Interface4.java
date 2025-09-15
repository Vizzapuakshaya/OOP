/*A smart home system manages various devices. Define an interface SmartDevice with methods to turn the device on, turn it off, and get its current status. Implement two classes:

SmartLight – simulates turning on/off a light and reporting its status.

SmartFan – simulates turning on/off a fan and reporting its status.

In the main program, create an array of SmartDevice references, control each device, and display its status after each action.*/



package interface_4problems;

interface SmartDevice {
 void turnOn();
 void turnOff();
 String getStatus();
}

class SmartLight implements SmartDevice {
 private boolean isOn = false;

 @Override
 public void turnOn() {
     isOn = true;
     System.out.println("Smart Light is turned ON.");
 }

 @Override
 public void turnOff() {
     isOn = false;
     System.out.println("Smart Light is turned OFF.");
 }

 @Override
 public String getStatus() {
     return isOn ? "Smart Light is ON" : "Smart Light is OFF";
 }
}


class SmartFan implements SmartDevice {
 private boolean isOn = false;

 @Override
 public void turnOn() {
     isOn = true;
     System.out.println("Smart Fan is turned ON.");
 }

 @Override
 public void turnOff() {
     isOn = false;
     System.out.println("Smart Fan is turned OFF.");
 }

 @Override
 public String getStatus() {
     return isOn ? "Smart Fan is ON" : "Smart Fan is OFF";
 }
}


public class Interface4{
 public static void main(String[] args) {
    
     SmartDevice[] devices = new SmartDevice[2];
     devices[0] = new SmartLight();
     devices[1] = new SmartFan();

 
     for (SmartDevice device : devices) {
         device.turnOn();
         System.out.println("Status: " + device.getStatus());

         device.turnOff();
         System.out.println("Status: " + device.getStatus());
         System.out.println("---------------------------");
     }
 }
}

