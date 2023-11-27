package Test;

class MyClass {
    private int x;

    public void setX(int x) {
        // Sử dụng "this" để tham chiếu đến biến thành viên x của lớp
        this.x = x;
    }

    public void printX() {
        // Sử dụng "this" để tham chiếu đến biến thành viên x của lớp
        System.out.println("Giá trị của x: " + this.x);
    }

    public void compareX(int x) {
        // Sử dụng "this" để phân biệt giữa biến đối số x và biến thành viên x
        if (x == this.x) {
            System.out.println("Hai giá trị x bằng nhau.");
        } else {
            System.out.println("Hai giá trị x không bằng nhau.");
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b =  7;
        int c = (a+b)%5*2;
        int d = a++ + ++b;
        System.out.println("tong : " + d);
        MyClass myObject = new MyClass();

        // Gọi phương thức để đặt giá trị cho biến thành viên x
        myObject.setX(10);

        // Gọi phương thức để in ra giá trị của biến thành viên x
        myObject.printX();

        // Gọi phương thức để so sánh giá trị của biến đối số x và biến thành viên x
        myObject.compareX(5);
    }

}
