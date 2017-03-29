package scratch;

public class BooleanComparator {

    public static final void main(final String args[]) {
        System.out.println("FALSE || FALSE: " + (false || false));
        System.out.println("FALSE && FALSE: " + (false && false));
        System.out.println("FALSE || TRUE : " + (false || true));
        System.out.println("FALSE && FALSE: " + (false && true));
        System.out.println("TRUE  || TRUE : " + (true || true));
        System.out.println("TRUE  && TRUE : " + (true && true));
        System.out.println("TRUE  || FALSE: " + (true || false));
        System.out.println("TRUE  && FALSE: " + (true && false));
    }

}
