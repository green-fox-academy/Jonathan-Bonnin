public class Shifter implements CharSequence {

    String str;
    int howMuchToShift;

    Shifter(String str, int howMuchToShift){
        this.str = str;
        this.howMuchToShift = howMuchToShift % str.length();

    }

    @Override
    public char charAt(int index){

        return index + howMuchToShift < str.length() ? str.charAt(index + howMuchToShift) : str.charAt(index + howMuchToShift - str.length());
    }

    @Override
    public int length(){
        return str.length();
    }

    @Override
    public CharSequence subSequence(int start, int end){
        return str.substring(start, end);
    }
}
