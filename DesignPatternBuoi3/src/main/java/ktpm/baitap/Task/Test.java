package ktpm.baitap.Task;

public class Test {
    public static void main(String[] args) {
        // Tạo công việc
        Task task1 = new Task("Viết báo cáo", "To Do");
        Task task2 = new Task("Phát triển tính năng đăng nhập", "To Do");

        // Tạo thành viên nhóm
        TeamMember alice = new TeamMember("Alice");
        TeamMember bob = new TeamMember("Bob");

        // Thành viên đăng ký theo dõi công việc
        task1.register(alice);
        task1.register(bob);

        task2.register(alice);

        // Thay đổi trạng thái công việc
        task1.setStatus("In Progress");
        task2.setStatus("Done");

        // Thành viên Bob hủy theo dõi công việc "Viết báo cáo"
        task1.remove(bob);

        // Tiếp tục thay đổi trạng thái
        task1.setStatus("Done");
    }
}
