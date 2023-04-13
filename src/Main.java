public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("26 inc Comp", "Acer", 27,"1540*833");
        MotherBoard theMotherBoard = new MotherBoard("Bj-200", "Asus",4,6, "V24");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherBoard);

//        thePC.getMonitor().drawPixelAt(10,10, "red");
//        thePC.getMotherBoard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
