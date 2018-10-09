public class Domino implements Comparable {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public int compareTo(Object o){
        Domino d = (Domino) o;
        if(values[0] > d.values[0]){
            return 1;
        } else if(values[0] < d.values[0]){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }
}