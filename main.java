package sesstion3.Assignment3;

public class main {
    public static void main(String args[]){
        User us = new User();
//        us.TT();
//        us.IN();
        us.IN("Lê Duy Được", "duyduoc03bg@gmail.com", "0342685757", 18, 1.000);

        Room r = new Room();
//        r.INList("2002", "Mỹ Đình 2 - Hà Nội", 19999,"Lê Duy Được\n\tMai Văn Thiện\n\tKhổng Thị Thương");
        r.ThongTin();
        r.CheckAdd();

    }
}
