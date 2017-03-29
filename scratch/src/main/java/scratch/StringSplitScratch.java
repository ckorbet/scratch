package scratch;

public class StringSplitScratch {

    public static final void main(final String[] args) {
        // TODO Auto-generated method stub
        // MIRRORED FUND FOR C942 UNDER PLM 14428

        final String[] splited = "MIRRORED FUND FOR C942 UNDER PLM 14428".split("PLM");
        final String id = splited[1].trim();
        System.out.println(splited);
        System.out.println(id);
    }

}
