package ktpm.baitap.Adapter;

public class Test {
    public static void main(String[] args) {
        // Hệ thống XML
        XMLService xmlService = new XMLService();

        // Adapter giúp hệ thống XML nhận dữ liệu JSON
        JSONService adapter = new XMLToJSONAdapter(xmlService);

        // Dữ liệu JSON đầu vào
        String jsonData = "{ \"name\": \"Alice\", \"age\": 25, \"city\": \"New York\" }";

        System.out.println("📢 Hệ thống JSON nhận dữ liệu:\n" + jsonData);
        // Gửi dữ liệu JSON đến Adapter (Nó sẽ tự động chuyển thành XML)
        adapter.receiveJSON(jsonData);
    }
}
