import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();

    }

    public void addJoke(String joke){

        jokes.add(joke);
    }

    public String drawJoke(){
        System.out.println("Drawing a joke.");

        if(jokes.isEmpty()){
           return ("Jokes are in short supply.");
        } else{
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            String draww = jokes.get(index);
            System.out.println(draww);
            return draww;
        }

    }

    public void printJokes(){
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
