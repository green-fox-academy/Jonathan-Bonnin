public class Sharpie {

    String color;
    float width;
    float ink;

    Sharpie(String color, float width){
        this.color = color;
        this.width = width;
        this.ink = 100;
    }

    void use(){
        ink -= 0.01;
    }
}
