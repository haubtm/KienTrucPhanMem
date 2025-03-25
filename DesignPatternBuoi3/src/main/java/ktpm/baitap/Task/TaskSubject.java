package ktpm.baitap.Task;

public interface TaskSubject {
    void register(TaskObserver observer);  // Đăng ký thành viên nhóm
    void remove(TaskObserver observer);    // Hủy đăng ký
    void notifyObservers();                // Thông báo đến thành viên nhóm
}
