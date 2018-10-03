public class Week03Day03 {

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




}
