package ktpm.baitap.Library.ObserverPattern;

public class Employee implements Observer {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("📢 Nhân viên " + name + " nhận thông báo: " + message);
    }
}