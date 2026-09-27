public enum Week {
    MONDAY("월요일", 1),
    TUESDAY("화요일", 2),
    WEDNESDAY("수요일", 3),
    THURSDAY("목요일", 4),
    FRIDAY("금요일", 5),
    SATURDAY("토요일", 6),
    SUNDAY("일요일", 7);

    public final String name;
    public final int code;

    Week(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
