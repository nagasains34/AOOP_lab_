package Pkg;

class GamingConsoleAdapter implements RemoteControl {
    private XboxConsole console;

    public GamingConsoleAdapter(XboxConsole console) {
        this.console = console;
    }

    @Override
    public void powerOn() {
        console.startConsole();
    }

    @Override
    public void powerOff() {
        console.shutdownConsole();
    }

    @Override
    public void volumeUp() {
        console.increaseVolume();
    }

    @Override
    public void volumeDown() {
        console.decreaseVolume();
    }
}
