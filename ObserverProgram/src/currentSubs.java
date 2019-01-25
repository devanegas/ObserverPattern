public class currentSubs implements Observer, DisplaySubs{

    private int pewdsCache;
    private int tseriesCache;
    private Subject YoutubeData;


    public currentSubs(Subject youtubeData){
        this.YoutubeData = youtubeData;
        youtubeData.registerObserver(this);
    }

    public void update(int pewds, int tseries) {
        this.pewdsCache = pewds;
        this. tseriesCache = tseries;
        display();
    }

    public void display() {
        System.out.println("\nPewdiepie has now: " + pewdsCache + " subscribers" );
        System.out.println("T-Series went down to " + tseriesCache + " subscribers!.");
        System.out.println("Thanks for your help!");

    }

}
