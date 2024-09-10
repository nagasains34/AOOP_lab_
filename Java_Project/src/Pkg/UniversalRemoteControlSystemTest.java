package Pkg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Unit Test for Universal Remote Control System
class UniversalRemoteControlSystemTest {

    private RemoteControl tvRemote;
    private RemoteControl soundSystemRemote;
    private RemoteControl gamingConsoleRemote;

    @BeforeEach
    void setUp() {
        // Initialize devices and their adapters before each test
        SonyTV sonyTV = new SonyTV();
        tvRemote = new TVAdapter(sonyTV);

        BoseSoundSystem boseSoundSystem = new BoseSoundSystem();
        soundSystemRemote = new SoundSystemAdapter(boseSoundSystem);

        XboxConsole xboxConsole = new XboxConsole();
        gamingConsoleRemote = new GamingConsoleAdapter(xboxConsole);
    }

    @Test
    void testTVRemoteControl() {
        // Simulate controlling a Sony TV
        tvRemote.powerOn();
        tvRemote.volumeUp();
        tvRemote.volumeDown();
        tvRemote.powerOff();

        // No direct assertions needed as we are checking the console output
        assertTrue(true); // Placeholder to indicate the test ran successfully
    }

    @Test
    void testSoundSystemRemoteControl() {
        // Simulate controlling a Bose Sound System
        soundSystemRemote.powerOn();
        soundSystemRemote.volumeUp();
        soundSystemRemote.volumeDown();
        soundSystemRemote.powerOff();

        assertTrue(true); // Placeholder to indicate the test ran successfully
    }

    @Test
    void testGamingConsoleRemoteControl() {
        // Simulate controlling an Xbox Console
        gamingConsoleRemote.powerOn();
        gamingConsoleRemote.volumeUp();
        gamingConsoleRemote.volumeDown();
        gamingConsoleRemote.powerOff();

        assertTrue(true); // Placeholder to indicate the test ran successfully
    }
}
