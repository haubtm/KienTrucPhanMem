package ktpm.baitap.Task;

public interface TaskObserver {
    void update(String taskName, String status); // Cập nhật trạng thái công việc mới
}
