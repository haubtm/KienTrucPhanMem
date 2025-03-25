package ktpm.baitap.Task;

class TeamMember implements TaskObserver {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    // Cập nhật thông tin khi trạng thái công việc thay đổi
    @Override
    public void update(String taskName, String status) {
        System.out.println("📢 Thành viên " + name + " nhận thông báo: Công việc \"" + taskName + "\" đã chuyển sang trạng thái: " + status);
    }
}

