package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {
    /**
     * The road that the frogger is on.
     */
    private final Road road;

    private int position;
    private final FroggerID id;

    public Frogger(Road road, int position, FroggerID id) {
        this.road = road;
        this.position = position;
        this.id = id;
    }


    public boolean move(boolean forward) {

        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }
    public boolean recordMyself(Records records) {
        return records.addRecord(id); // илүү concise, encapsulated
    }
    public int getPosition() {
        return position;
    }
    public FroggerID getId() {
        return id;
    }
    

}
