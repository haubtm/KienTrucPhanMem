package ktpm.baitap.FolderManagement;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    // Thêm tập tin hoặc thư mục con
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    // Xóa tập tin hoặc thư mục con
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void display() {
        System.out.println("📂 Directory: " + name + " (Total Size: " + getSize() + " KB)");
        for (FileSystemComponent component : children) {
            component.display();
        }
    }
}
