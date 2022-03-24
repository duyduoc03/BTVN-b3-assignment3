package sesstion3.Assignment3;

public class Room extends User{
    String tenphong,vitri;
    double giathuephong;
    int n,i;
    String [] danhsach = new String[10];

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public double getGiathuephong() {
        return giathuephong;
    }

    public void setGiathuephong(double giathuephong) {
        this.giathuephong = giathuephong;
    }

    public String[] getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(String[] danhsach) {
        this.danhsach = danhsach;
    }

    public void ThongTin(){
        System.out.println("Nhập Thông Tin Phòng");
        System.out.println("Nhập Tên Phòng: ");
        tenphong = sc.nextLine();
        System.out.println("Nhập Vị Trí: ");
        vitri = sc.nextLine();
        System.out.println("Nhập Giá Thuê Phòng: ");
        giathuephong = sc.nextDouble();
        System.out.println("Nhập Số Người Thuê Phòng: ");
        do {
            n = sc.nextInt();
        }while (n < 1 || n > 5);
        sc.nextLine();
        for (i = 0; i < n; i++){
            System.out.println("Nhập Người Thứ " + (i+1) + " : ");
            danhsach[i] = sc.nextLine();
        }
    }
    public void INList(){
        System.out.println("Thông Tin Phòng");
        System.out.println("Tên Phòng:\t\t" + tenphong);
        System.out.println("Vị Trí:\t\t\t" + vitri);
        System.out.println("Giá Thuê Phòng:\t" + giathuephong);
        System.out.println("Danh Sách Người Đang Thuê Phòng");
        for (i = 0; i < n; i++){
            System.out.println("\t" + danhsach[i]);
        }
    }
    public void INList(String roomname, String position, double price, String list){
        System.out.println("Tên Phòng:\t\t" + roomname);
        System.out.println("Vị Trí:\t\t\t" + position);
        System.out.println("Giá Thuê Phòng:\t" + price);
        System.out.println("Danh Sách Người Đang Thuê Phòng");
        System.out.println("\t" + list);
    }
    public void CheckAdd(){
        super.TT();
        if (sotien < giathuephong){
            System.out.println(name + " Không Đủ Tiền Thuê Phòng!");
            INList();
        }
        else {
            danhsach[n] = name;
            n += 1;
            INList();
        }
    }
}
