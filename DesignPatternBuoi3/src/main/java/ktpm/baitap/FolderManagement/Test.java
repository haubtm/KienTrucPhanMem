package ktpm.baitap.FolderManagement;

public class Test {
    public static void main(String[] args) {
        // Tạo thư mục gốc
        Directory root = new Directory("Root");

        // Tạo thư mục con
        Directory folderA = new Directory("Folder A");
        Directory folderB = new Directory("Folder B");

        // Tạo tập tin
        File file1 = new File("File1.txt", 20);
        File file2 = new File("File2.txt", 50);
        File file3 = new File("File3.txt", 30);

        // Xây dựng cấu trúc thư mục
        folderA.add(file1);
        folderA.add(file2);

        folderB.add(file3);

        root.add(folderA);
        root.add(folderB);

        // Hiển thị cấu trúc thư mục
        root.display();
    }
}
