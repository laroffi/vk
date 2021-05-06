package domain.attachment;

public class AllManager {

    private BlockManager[] managers;
    public String generate() {
        for (AllManager manager:managers) {
            String block = manager.generateBlock();
            // some logic
            return null;
        }
    }

}
