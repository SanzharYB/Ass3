class Light {
    public void turnOn() {
        System.out.println("Lights turned on.");
    }

    public void turnOff() {
        System.out.println("Lights turned off.");
    }
}

class Thermostat {
    public void setTemperature(int temp) {
        System.out.println("Thermostat set to " + temp + " degrees.");
    }
}

class SecuritySystem {
    public void arm() {
        System.out.println("Security system armed.");
    }

    public void disarm() {
        System.out.println("Security system disarmed.");
    }
}

class EntertainmentSystem {
    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}

class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade() {
        light = new Light();
        thermostat = new Thermostat();
        securitySystem = new SecuritySystem();
        entertainmentSystem = new EntertainmentSystem();
    }

    public void leaveHome() {
        light.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
        System.out.println("Leaving home...");
    }

    public void arriveHome() {
        light.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
        System.out.println("Arriving home...");
    }

    public void nightMode() {
        light.turnOff();
        thermostat.setTemperature(20);
        securitySystem.arm();
        System.out.println("Night mode activated.");
    }

    public void movieMode() {
        light.turnOff();
        entertainmentSystem.playMovie("Inception");
        System.out.println("Movie mode activated.");
    }
}

class SmartHomeApp {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();
        smartHome.arriveHome();
        smartHome.movieMode();
        smartHome.nightMode();
    }
}
