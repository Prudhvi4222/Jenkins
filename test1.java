I have two classes. When the I put class TapeDeckTestDrive first on the text editor, it runs fine. When I put the TestDrive class first, it gives the error that it can't find the main class. Why is this?

class TapeDeck {
    boolean canRecord = false;
    void playTape(){
        System.out.println("tape playing");
    }
    void recordTape(){
        System.out.println("tape recording");
    }
}

class TapeDeckcTestDrive{
    public static void main(String[] args){
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
ERROR ON THIS FORMAT

VS

FOLLOWING WORKS FINE:

class TapeDeckcTestDrive{
    public static void main(String[] args){
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}

class TapeDeck {
    boolean canRecord = false;
    void playTape(){
        System.out.println("tape playing");
    }
    void recordTape(){
        System.out.println("tape recording");
    }
}
