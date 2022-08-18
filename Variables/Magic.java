public class Magic {
    public static void main(String[] args) {
        // Assigning the original number
        // int myNumber = 154;
        // int stepOne = myNumber * myNumber;
        // int stepTwo = stepOne + myNumber;
        // int stepThree = stepTwo / myNumber;
        // int stepFour = stepThree + 17;
        // int stepFive = stepFour - myNumber;
        // int stepSix = stepFive / 6;
        // System.out.println(stepSix);
        int myNumber = 11;
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        System.out.println(magicNumber);
    }
}
