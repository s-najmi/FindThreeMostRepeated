public class Main {
    public static void main(String[] args) {
        Input inp = new Input();
        String inputString = inp.enterString();

        CheckInp checkInp=new CheckInp(inputString);
        checkInp.checkRunner();
    }
}
