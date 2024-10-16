interface Device {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void setVolume(int volume);
}

class TVDevice implements Device {
    public void powerOn() {
        System.out.println("TV is powered on.");
    }

    public void powerOff() {
        System.out.println("TV is powered off.");
    }

    public void setChannel(int channel) {
        System.out.println("TV channel set to " + channel);
    }

    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}

class DVDDevice implements Device {
    public void powerOn() {
        System.out.println("DVD player is powered on.");
    }

    public void powerOff() {
        System.out.println("DVD player is powered off.");
    }

    public void setChannel(int channel) {
        System.out.println("DVD channel set to " + channel);
    }

    public void setVolume(int volume) {
        System.out.println("DVD volume set to " + volume);
    }
}

abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void powerOn();
    public abstract void powerOff();
}

class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    public void powerOn() {
        device.powerOn();
    }

    public void powerOff() {
        device.powerOff();
    }
}

class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void powerOn() {
        device.powerOn();
        device.setVolume(20);
    }

    public void powerOff() {
        device.powerOff();
    }

    public void mute() {
        System.out.println("Muting the device.");
        device.setVolume(0);
    }
}

class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl remote = new BasicRemote(tv);
        remote.powerOn();
        remote.powerOff();

        Device dvd = new DVDDevice();
        RemoteControl advancedRemote = new AdvancedRemote(dvd);
        advancedRemote.powerOn();
        ((AdvancedRemote) advancedRemote).mute();
        advancedRemote.powerOff();
    }
}
