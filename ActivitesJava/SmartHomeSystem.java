// =========================================================================
// 1. ABSTRACTION
// We use an abstract parent class to define a blueprint for all smart devices.
// It hides the complex implementation details and ensures all child classes 
// share a standard structure, but cannot be instantiated on its own.
// =========================================================================
abstract class SmartDevice {
    
    // =========================================================================
    // 2. ENCAPSULATION
    // Attributes are set to 'private' to protect the internal state of the object.
    // They can only be accessed or modified through public getter/setter methods.
    // (Contains at least 3 private attributes as requested).
    // =========================================================================
    private String deviceId;
    private String deviceName;
    private boolean isPoweredOn;

    public SmartDevice(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.isPoweredOn = false; // Devices start powered off by default
    }

    // Public getters to safely access encapsulated private data
    public String getDeviceName() {
        return deviceName;
    }

    public boolean isPoweredOn() {
        return isPoweredOn;
    }

    // Inherited method: This method will be shared by all child classes
    public void togglePower() {
        isPoweredOn = !isPoweredOn;
        System.out.println(deviceName + " power state is now: " + (isPoweredOn ? "ON" : "OFF"));
    }

    // Abstract method: Forces all child classes to define their own specific behavior
    public abstract void performPrimaryFunction();
}

// =========================================================================
// 3. INHERITANCE
// The SmartLight class 'extends' SmartDevice, inheriting its attributes 
// (like deviceName) and methods (like togglePower()), avoiding code duplication.
// =========================================================================
class SmartLight extends SmartDevice {
    private int brightnessLevel;

    public SmartLight(String deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.brightnessLevel = 100;
    }

    // =========================================================================
    // 4. POLYMORPHISM
    // We override the inherited abstract method. The method signature is exactly 
    // the same across all devices, but it behaves specifically as a light here.
    // =========================================================================
    @Override
    public void performPrimaryFunction() {
        if (isPoweredOn()) {
            System.out.println("-> [LIGHT ACTUATOR] " + getDeviceName() + " is illuminating the room at " + brightnessLevel + "% brightness.");
        } else {
            System.out.println("-> [ERROR] Cannot illuminate. " + getDeviceName() + " is currently OFF.");
        }
    }
}

// =========================================================================
// 3. INHERITANCE (Second Child Class)
// =========================================================================
class SmartThermostat extends SmartDevice {
    private double targetTemperature;

    public SmartThermostat(String deviceId, String deviceName, double targetTemperature) {
        super(deviceId, deviceName);
        this.targetTemperature = targetTemperature;
    }

    // =========================================================================
    // 4. POLYMORPHISM (Second Override)
    // The same performPrimaryFunction() method call triggers a completely 
    // different behavior for a Thermostat compared to a Light.
    // =========================================================================
    @Override
    public void performPrimaryFunction() {
        if (isPoweredOn()) {
            System.out.println("-> [HVAC CONTROLLER] " + getDeviceName() + " is regulating the room temperature to " + targetTemperature + "°C.");
        } else {
            System.out.println("-> [ERROR] Cannot regulate temperature. " + getDeviceName() + " is currently OFF.");
        }
    }
}

// Main execution class
public class SmartHomeSystem {
    public static void main(String[] args) {
        System.out.println("=== INITIALIZING SMART HOME SYSTEM ===\n");

        // Creating at least 1 object for each child class
        SmartLight livingRoomLight = new SmartLight("LGT-001", "Living Room Main Light");
        SmartThermostat hallwayThermostat = new SmartThermostat("THM-001", "Hallway Nest Thermostat", 22.5);

        // Demonstrating Inherited Method (togglePower)
        System.out.println("--- Booting up devices ---");
        livingRoomLight.togglePower();
        hallwayThermostat.togglePower();

        // Demonstrating Polymorphism (performPrimaryFunction)
        System.out.println("\n--- Executing Device Primary Functions ---");
        livingRoomLight.performPrimaryFunction();
        hallwayThermostat.performPrimaryFunction();

        // Demonstrating state change and behavior blocking
        System.out.println("\n--- Shutting Down Living Room Light ---");
        livingRoomLight.togglePower();
        livingRoomLight.performPrimaryFunction(); // Will trigger the OFF state error message
        
        System.out.println("\n=== SYSTEM OFFLINE ===");
    }
}