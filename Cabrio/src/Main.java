public class Main {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("a4", "audi",true,true);
        cabrio.setRoofIsOpen(false);
        System.out.println(cabrio.isRoofIsOpen());
    }
}
