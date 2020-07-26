package homeworkAll.homework08;

/**
 * JavaAdvanced
 * 26.07.20 19: 03
 */
public enum Type {//enum - нумерованный список
    VIP(1),
    SINGLE(2),
    DOUBLE(3),
    TRIPLE(4);

    private int type;

    Type(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
