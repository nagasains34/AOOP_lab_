package Pkg;

class SoundSystemAdapter implements RemoteControl {
    private BoseSoundSystem soundSystem;

    public SoundSystemAdapter(BoseSoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    @Override
    public void powerOn() {
        soundSystem.powerOnSystem();
    }

    @Override
    public void powerOff() {
        soundSystem.powerOffSystem();
    }

    @Override
    public void volumeUp() {
        soundSystem.raiseVolume();
    }

    @Override
    public void volumeDown() {
        soundSystem.lowerVolume();
    }
}
