package enumexam;

public enum KpopGroup {

    HOT("H.O.T"),
    SES("S.E.S"),
    BOA("보아"),
    TVXQ("동방신기"),
    SUPER_JUNIOR("슈퍼주니어"),
    GIRLS_GENERATION("소녀시대"),
    SHINEE("샤이니"),
    REDVELVET("레드벨벳"),
    NCT("NCT"),
    AESPA("에스파"),
    TWICE("트와이스"),
    ITZY("있지"),
    NMIXX("엔믹스"),
    WINNER("위너"),
    BLACKPINK("블랙핑크"),
    IVE("아이브"),
    BTS("방탄소년단"),
    LESSERAFIM("르세라핌"),
    NEWJEANS("뉴진스");
    private String group;

    KpopGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }
}
