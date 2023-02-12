package enumexam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static enumexam.KpopGroup.*;

public enum EntertainmentGroup {
    SM("SM엔터테인먼트", Arrays.asList(HOT, SES, BOA, TVXQ,
            SUPER_JUNIOR, GIRLS_GENERATION, SHINEE, SHINEE,
            REDVELVET, NCT, AESPA
    )),
    JYP("JYP엔터테인먼트", Arrays.asList(TWICE, ITZY, NMIXX)),
    YG("YG엔터테인먼트", Arrays.asList(WINNER, BLACKPINK)),
    HYBE("HYBE엔터테인먼트",Arrays.asList(BTS, LESSERAFIM)),
    ADOR("ADOR엔터테인먼트",Arrays.asList(NEWJEANS)),
    STARSHIP("스타쉽엔터테인먼트",Arrays.asList(IVE)),
    EMPTY("없음", Collections.EMPTY_LIST);

    private String enterGroup;
    private List<KpopGroup> artist;

    /**
     *
     * @param enterGroup
     * @param artist
     */
    EntertainmentGroup(String enterGroup, List<KpopGroup> artist) {
        this.enterGroup = enterGroup;
        this.artist = artist;
    }

    public String getEnterGroup() {
        return enterGroup;
    }

    public static EntertainmentGroup findByEnterType(KpopGroup kpopGroup) {
        return Arrays.stream(EntertainmentGroup.values())
                .filter(enterGroup -> enterGroup.hasKpopGroup(kpopGroup))
                .findAny()
                .orElse(EMPTY);
    }

    public boolean hasKpopGroup(KpopGroup kpopGroup) {
        return artist.stream()
                .anyMatch(group -> group == kpopGroup);
    }
}
