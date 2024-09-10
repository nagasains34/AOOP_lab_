package Pkg;

public class UniversalRemoteControlSystem {
    public static void main(String[] args) {
        // Sony TV controlled by the Universal Remote
        SonyTV sonyTV = new SonyTV();
        RemoteControl tvRemote = new TVAdapter(sonyTV);

        // Bose Sound System controlled by the Universal Remote
        BoseSoundSystem boseSoundSystem = new BoseSoundSystem();
        RemoteControl soundSystemRemote = new SoundSystemAdapter(boseSoundSystem);

        // Xbox Console controlled by the Universal Remote
        XboxConsole xboxConsole = new XboxConsole();
        RemoteControl gamingConsoleRemote = new GamingConsoleAdapter(xboxConsole);

        // Control the TV
        System.out.println("Controlling Sony TV:");
        tvRemote.powerOn();
        tvRemote.volumeUp();
        tvRemote.volumeDown();
        tvRemote.powerOff();

        // Control the Sound System
        System.out.println("\nControlling Bose Sound System:");
        soundSystemRemote.powerOn();
        soundSystemRemote.volumeUp();
        soundSystemRemote.volumeDown();
        soundSystemRemote.powerOff();

        // Control the Gaming Console
        System.out.println("\nControlling Xbox Console:");
        gamingConsoleRemote.powerOn();
        gamingConsoleRemote.volumeUp();
        gamingConsoleRemote.volumeDown();
        gamingConsoleRemote.powerOff();
    }
}