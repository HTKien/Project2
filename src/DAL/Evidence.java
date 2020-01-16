/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.ArrayList;

/**
 *
 * @author hantr
 */
public class Evidence {

    private Boolean collection;
    private String name;
    private String fileName;
    private String fileType;

    public Evidence() {
    }

    public Evidence(Boolean collection, String name, String fileName, String fileType) {
        this.collection = collection;
        this.name = name;
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public Boolean getCollection() {
        return collection;
    }

    public void setCollection(Boolean collection) {
        this.collection = collection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public static ArrayList<Evidence> listAllVolatile() {
        ArrayList<Evidence> listVolatiles = new ArrayList<Evidence>();
        listVolatiles.add(new Evidence(false, "Trạng thái mạng", "network_status", ".txt"));
        listVolatiles.add(new Evidence(false, "Các cổng được mở", "open_port", ".txt"));
        listVolatiles.add(new Evidence(false, "Các kết nối đã được thiết lập", "established_connection", ".txt"));
        listVolatiles.add(new Evidence(false, "Bảng định tuyến", "router_table", ".txt"));
        listVolatiles.add(new Evidence(false, "Dữ liệu trao đổi qua các cổng", "data_port", ".txt"));
        listVolatiles.add(new Evidence(false, "Các tiến trình đang hoạt động", "process_list", ".txt"));
        listVolatiles.add(new Evidence(false, "Thông tin người dùng đăng nhập", "login_user_information", ".txt"));
        listVolatiles.add(new Evidence(false, "Cấu hình mạng", "network_configuration", ".txt"));
        listVolatiles.add(new Evidence(false, "Thông tin mạng", "network_information", ".txt"));
        listVolatiles.add(new Evidence(false, "Clipboard content", "clipboard_content", ".txt"));
        listVolatiles.add(new Evidence(false, "Process information", "process_information", ".txt"));
        listVolatiles.add(new Evidence(false, "Phiên đăng nhập đang hoạt động", "login_session", ".txt"));
        listVolatiles.add(new Evidence(false, "Handle process", "handle_process", ".txt"));
        listVolatiles.add(new Evidence(false, "Swap file", "swap_file", ".sys"));
        listVolatiles.add(new Evidence(false, "RAM image", "ram_img", ".jpeg"));
        listVolatiles.add(new Evidence(false, "Dump information on caches", "dump_cache", ".txt"));

        return listVolatiles;
    }

    public static ArrayList<Evidence> listAllNonVolatile() {
        ArrayList<Evidence> listNonVolatiles = new ArrayList<>();
        listNonVolatiles.add(new Evidence(false, "Cấu hình máy tính", "computer_configuaration", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Các tệp hệ thống", "list_file_system", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Dữ liệu Registry", "registry_data", ".reg"));
        listNonVolatiles.add(new Evidence(false, "Lịch sử trình duyệt", "browser_history", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Các tệp sử dụng gần đây", "list_recent_file", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Event log", "event_log", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Các tệp đang mở", "list_opening_file", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Service Information", "service_information", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Driver Information", "driver_information", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Key Logger", "key_logger", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Command History", "command_history", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Trình điều khiển hệ thống tệp", "file_control", ".txt"));
        listNonVolatiles.add(new Evidence(false, "List DLL", "list_dll", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Disk Image", "disk_img", ".jpeg"));
        listNonVolatiles.add(new Evidence(false, "Ngày hệ thống", "day_system", ".txt"));
        listNonVolatiles.add(new Evidence(false, "Giờ hệ thống", "date_system", ".txt"));

        return listNonVolatiles;

    }

}
