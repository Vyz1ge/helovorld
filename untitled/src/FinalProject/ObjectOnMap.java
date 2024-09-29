package FinalProject;

public enum ObjectOnMap {
    VOID("⬜"),VOID_BOMB("\uD83D\uDFE6"),SHIP("\uD83D\uDEA2"),SHIP_BOMB("❌"),BORDER("\t");
    private String form;
    ObjectOnMap(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return form;
    }
}
