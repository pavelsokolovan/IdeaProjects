package access.coockie.main;

import access.coockie.delegation.Detergent;

public class Main {

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
    }
}
