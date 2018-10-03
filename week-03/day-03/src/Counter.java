public class Counter {

    int count;
    int initialCount;

    Counter(){
        this(0);
    }

    Counter(int initialCount){
        this.initialCount = initialCount;
        count = initialCount;
    }

    void add(){
        add(1);
    }

    void add(int num){
        count += num;
    }

    int get(){
        return count;
    }

    void reset(){
        count = initialCount;
    }
}
