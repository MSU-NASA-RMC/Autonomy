package nasa_rmc.autonomy;

/**
 * Created by atomlinson on 3/31/17.
 */

public interface LogicState {
    void run() throws InterruptedException;
    String getStatus();
}
