public class AccessExample {
    public String publicVar = "I am public.";
    protected String protectedVar = "I am protected.";
    String defaultVar = "I am default."; 
    private String privateVar = "I am private.";

    public static void main(String[] args) {
        AccessExample ex = new AccessExample();
        System.out.println(ex.publicVar);
        System.out.println(ex.protectedVar);
        System.out.println(ex.defaultVar);
        System.out.println(ex.privateVar); 
    }
}