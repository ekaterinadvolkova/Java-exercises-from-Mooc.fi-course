
public class Team {
    private String  name;
    private int game;
    
    
    
    public void Teams (String name, int games) {  
        this.name=name;
        this.game=games;
    }
    
    public String getName() {
        return name;
    }
    
    public int getGames() {
        return game;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    

    
}
