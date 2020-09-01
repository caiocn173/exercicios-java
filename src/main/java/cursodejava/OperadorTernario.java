package cursodejava;

public class OperadorTernario {
    public static void main(String[] args) {

        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2) ? 0:1;
        System.out.println(r);


        n1 = 14;
        n2 = 8;
        r = (n1>n2) ? 0:1;
        System.out.println(r);

        n1 = 14;
        n2 = 8;
        r = (n1>n2) ? n1:n2;
        System.out.println(r);

        n1 = 14;
        n2 = 18;
        r = (n1>n2) ? n1:n2;
        System.out.println(r);

        n1 = 14;
        n2 = 18;
        r = (n1>n2) ? n1+n2:n1-n2;
        System.out.println(r);

        n1 = 14;
        n2 = 8;
        r = (n1>n2) ? n1+n2:n1-n2;
        System.out.println(r);
    }
}
