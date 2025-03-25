package ktpm.baitap.Adapter;

import org.json.JSONObject;
import org.json.XML;
class XMLToJSONAdapter implements JSONService {
    private XMLService xmlService;

    public XMLToJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    // Chuyển đổi JSON thành XML trước khi gửi đến hệ thống XML
    @Override
    public void receiveJSON(String jsonData) {
        System.out.println("\n🔄 Chuyển đổi JSON sang XML...");
        String xmlData = convertJSONtoXML(jsonData);
        xmlService.sendXML(xmlData);
    }

    // Phương thức chuyển đổi JSON sang XML
    private String convertJSONtoXML(String jsonData) {
        JSONObject json = new JSONObject(jsonData);
        return XML.toString(json);
    }

    // Phương thức chuyển đổi XML sang JSON (nếu cần)
    public String convertXMLtoJSON(String xmlData) {
        JSONObject json = XML.toJSONObject(xmlData);
        return json.toString(4);
    }
}
