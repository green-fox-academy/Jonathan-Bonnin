import java.util.ArrayList;
import java.util.List;

public class Week03Day03 {

    public static void main(String[] args) {
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
