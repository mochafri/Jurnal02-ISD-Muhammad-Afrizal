public class Main {

    public static void main(String[] args) {
        TokoABC<ATK> atk = new TokoABC<>(5);
        TokoABC<Bag> bag = new TokoABC<>(5);

        atk.addData(new ATK("A001","Alat Tulis" , "Pencil", 10));
        atk.addData(new ATK("A002","Alat Tulis" , "Pulpen", 10));
        atk.addData(new ATK("B001","Buku" , "Buku A5", 10));
        atk.addData(new ATK("B002","Kertas" , "Ketas A4", 10));
        atk.addData(new ATK("B003","Kertas" , "Karton", 10));
        bag.addData(new Bag("C001","Tas" , "Eiger", 10));
        bag.addData(new Bag("C002","Tempat Pensil" , "Tempat Pensil Atk", 10));
        bag.addData(new Bag("C003","Tas" , "Converse", 10));
        bag.addData(new Bag("C004","Tempat Pensil" , "Fabercastle", 10));
        bag.addData(new Bag("C005","Tempat Pensil" , "Fabercastle Super", 10));

        atk.toString();
        bag.toString();
        System.out.println();
        atk.display();
        bag.display();
        System.out.println();

        atk.setData(0, new ATK("A001", "Buku", "Buku A4", 10));
        atk.display();
        bag.display();
        System.out.println();
        atk.removeData(0);
        atk.display();
        bag.display();
        System.out.println();
    }
}