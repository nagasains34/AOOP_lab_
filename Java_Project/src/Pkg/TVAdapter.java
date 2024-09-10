package Pkg;

class TVAdapter implements RemoteControl {
    private SonyTV tv;

    public TVAdapter(SonyTV tv) {
        this.tv = tv;
    }

    @Override
    public void powerOn() {
        tv.turnOn();
    }

    @Override
    public void powerOff() {
        tv.turnOff();
    }

    @Override
    public void volumeUp() {
        tv.increaseVolume();
    }

    @Override
    public void volumeDown() {
        tv.decreaseVolume();
    }
}
