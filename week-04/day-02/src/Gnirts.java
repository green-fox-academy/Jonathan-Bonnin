public class Gnirts implements CharSequence {
    String str;

    Gnirts(String str){
        this.str = str;
    }

    @Override
    public char charAt(int index){
        return str.charAt(str.length()-1-index);
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
