package enumerators;

enum Color {
    RED("#FF0000", "c1"), BLUE("#0000FF", "c2"), GREEN("#00FF00", "c3");
    private String code;
    private String s;

    Color(String code, String s) {
        this.code = code;
        this.s = s;
    }

    public String getCode() {
        return code;
    }

    public String getS() {
        return s;
    }
}
