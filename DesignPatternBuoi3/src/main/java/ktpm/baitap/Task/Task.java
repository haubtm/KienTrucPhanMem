package ktpm.baitap.Task;

import java.util.ArrayList;
import java.util.List;

class Task implements TaskSubject {
    private String name;
    private String status;
    private List<TaskObserver> observers = new ArrayList<>();

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }

    // Đăng ký thành viên nhóm theo dõi công việc
    @Override
    public void register(TaskObserver observer) {
        observers.add(observer);
    }

    // Hủy đăng ký thành viên nhóm
    @Override
    public void remove(TaskObserver observer) {
        observers.remove(observer);
    }

    // Thông báo đến thành viên nhóm khi trạng thái thay đổi
    @Override
    public void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(name, status);
        }
    }

    // Thay đổi trạng thái công việc
    public void setStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("\n📌 Công việc \"" + name + "\" chuyển sang trạng thái: " + status);
        notifyObservers();
    }
}
