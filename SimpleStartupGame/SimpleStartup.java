package SimpleStartupGame;

public class SimpleStartup {
    private int[] locationsCells;
    private int numOfHits = 0; 

    public void setLocationsCells(int[] locs){
        locationsCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "miss";
        for (int cell  : locationsCells) {
            if (guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationsCells.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }

}