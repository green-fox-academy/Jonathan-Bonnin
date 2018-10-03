import java.util.ArrayList;
import java.util.List;

public class Week03Day03 {

    public static void main(String[] args) {

        //Create Sharpie class
        //We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
        //When creating one, we need to specify the color and the width
        //Every sharpie is created with a default 100 as inkAmount
        //We can use() the sharpie objects
        //which decreases inkAmount

        System.out.println();

        Sharpie yellowSharpie = new Sharpie("yellow", 4);

        System.out.println(yellowSharpie.ink); // 100

        for (var i = 0; i < 10; i++) {
            yellowSharpie.use();
        }

        System.out.println(yellowSharpie.ink); // 99.89998 ?!

        System.out.println();


        // Create an Animal class
        //        Every animal has a hunger value, which is a whole number
        //        Every animal has a thirst value, which is a whole number
        //        when creating a new animal object these values are created with the default 50 value
        //        Every animal can eat() which decreases their hunger by one
        //        Every animal can drink() which decreases their thirst by one
        //        Every animal can play() which increases both by one

        Animal dog = new Animal();
        System.out.println(dog.hunger); // 50
        System.out.println(dog.thirst); // 50
        dog.eat();
        System.out.println(dog.hunger); // 49
        System.out.println(dog.thirst); // 50
        dog.drink();
        System.out.println(dog.hunger); // 49
        System.out.println(dog.thirst); // 50
        dog.play();
        System.out.println(dog.hunger); // 50
        System.out.println(dog.thirst); // 50




        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing getMilk = new Thing("Get milk");
        Thing rmObstables = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand up");
        Thing eatLunch = new Thing("Eat lunch");

        fleet.add(getMilk);
        fleet.add(rmObstables);
        fleet.add(standUp);
        fleet.add(eatLunch);

        standUp.complete();
        eatLunch.complete();

        System.out.println();

        System.out.println(fleet);

        // You have a `DiceSet` class which has a list for 6 dices
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dices until all of the dices are 6



        DiceSet diceSet = new DiceSet();

        for (int i = 0; i < diceSet.dices.length; i++) {
            while((diceSet.dices[i]) != 6){
                diceSet.reroll(i);
            };
        }

        for (int i = 0; i < diceSet.dices.length; i++) {
            System.out.println(diceSet.dices[i]);
        }

        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...


        for (int i = 0; i < dominoes.size()-1; i++) {
            while (dominoes.get(i).getValues()[1] != dominoes.get(i+1).getValues()[0]){
                dominoes.add(dominoes.get(i+1));
                dominoes.remove(i+1);
            }
        }

        System.out.println();

        System.out.println(dominoes);

        System.out.println();

        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?

        String effectivePokemon = "";

        for (Pokemon pokemon : pokemonOfAsh) {
            if(pokemon.isEffectiveAgainst(wildPokemon)){
                effectivePokemon = pokemon.name;
                break;
            }
        }

        System.out.print("I choose you, " + effectivePokemon);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }



//    Create a BlogPost class that has
//            an authorName
//            a title
//            a text
//            a publicationDate
//            Create a few blog post objects:
//            "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//              Lorem ipsum dolor sit amet.
//            "Wait but why" titled by Tim Urban posted at "2010.10.10."
//              A popular long-form, stick-figure-illustrated blog about almost everything.
//            "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//              Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.

    BlogPost blog1 = new BlogPost("Lorem Ipsum", "John Doe", "2000.05.04.", "Lorem ipsum dolor sit amet.");
    BlogPost blog2 = new BlogPost("Wait but why", "Tim Urban", "2010.10.10.", "A popular long-form, stick-figure-illustrated blog about almost everything.");
    BlogPost blog3 = new BlogPost("One Engineer Is Trying to Get IBM to Reckon With Trump", "William Turton", "2017.03.28.", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");

//    Create a PostIt class that has
//            a backgroundColor
//            a text on it
//            a textColor
//    Create a few example post-it objects:
//    an orange with blue text: "Idea 1"
//    a pink with black text: "Awesome"
//    a yellow with green text: "Superb!"

    PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
    PostIt postIt2 = new PostIt("pink", "Awesome", "black");
    PostIt postIt3 = new PostIt("yellow", "Superb!", "green");
}
