package exercism.lasagna;

public class Lasagna {

    private int expectedMinutesInOvenVal;
    private int minutesToPrepareOneLayer;

    public Lasagna() {
        this.expectedMinutesInOvenVal = 40;
        this.minutesToPrepareOneLayer = 2;
    }

    // define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return expectedMinutesInOvenVal;
    }

    // define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven) {
        return this.expectedMinutesInOven() - minutesInOven;
    }

    // define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numLayers) {
        return this.minutesToPrepareOneLayer * numLayers;
    }

    // define the 'totalTimeInMinutes()'

    public int totalTimeInMinutes(int numLayers, int minutesInOven) {
        int preparationMinutes = this.preparationTimeInMinutes(numLayers);
        return preparationMinutes + minutesInOven;
    }
}