/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import base.BaseFunction;
import view.Dialog;
import view.Main;

/**
 *
 * @author hantr
 */
public class Function {

    public static final String cmd_prompt = "cmd";
    public static final String cmd_powershell = "powershell.exe";
    public static final String path_usb_command = "cd /d H:\\ps";

    /**
     * Collect Network Status
     */
    public static String networkStatus() throws InterruptedException {
        String way = cmd_prompt;
        String command = "ipconfig";
        String path = Main.path.getText() + "\\" + Main.trang_thai_mang_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        BaseFunction.dialog("Trạng thái mạng", path);

        return path;

    }

    /**
     * Collect opening port information
     */
    public static String openingPort() {
        String way = cmd_prompt;
        String command = "netstat -nao | find \"LISTEN\"";
        String path = Main.path.getText() + "\\" + Main.cong_duoc_mo_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        BaseFunction.dialog("Các cổng được mở", path);

        return path;

    }

    /**
     * Collect established connection list
     */
    public static String establishedConnection() {
        String way = cmd_prompt;
        String command = "netstat -nao | find \"ESTABLISHED\"";
        String path = Main.path.getText() + "\\" + Main.ket_noi_thiet_lap.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Collect Router Table
     */
    public static String routerTable() {
        String way = cmd_prompt;
        String command = "route PRINT";
        String path = Main.path.getText() + "\\" + Main.bang_dinh_tuyen_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Collect data in ports
     */
    public static String dataPort() {
        String way = cmd_prompt;
        String command = "netstat -nao";
        String path = Main.path.getText() + "\\" + Main.du_lieu_qua_cong_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Collect process list
     */
    public static String processList() {
        String way = cmd_prompt;
        String command1 = path_usb_command;
        String command2 = "pslist";
        String path = Main.path.getText() + "\\" + Main.tien_trinh.getText() + ".txt";
        BaseFunction.baseFunction2(way, command1, command2, path);
        return path;

    }

    /**
     * Collect user log in information
     */
    public static String userLogIn() {
        String way = cmd_prompt;
        String command1 = path_usb_command;
        String command2 = "psloglist Security";
        String path = Main.path.getText() + "\\" + Main.nguoi_dung_dang_nhap_fn.getText() + ".txt";
        BaseFunction.baseFunction2(way, command1, command2, path);
        return path;

    }

    /**
     * Hàm đọc thông tin cấu hình mạng
     */
    public static String networkConfiguration() {
        String way = cmd_powershell;
        String command = "Get-WmiObject -Class Win32_NetworkAdapterConfiguration -Filter IPEnabled=TRUE -ComputerName . | Select-Object -Property [a-z]* -ExcludeProperty IPX*,WINS*";
        String path = Main.path.getText() + "\\" + Main.cau_hinh_mang_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Hàm thu thập network information
     */
    public static String networkInformation() {
        String way = cmd_prompt;
        String command = "nbtstat -n";
        String path = Main.path.getText() + "\\" + Main.thong_tin_mang_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Hàm thu thập clipboard content
     */
    public static String clipboardContent() {
        String way = cmd_powershell;
        String command = "Get-Clipboard";
        String path = Main.path.getText() + "\\" + Main.clipboard_content_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Ham thu thap process information
     */
    public static String processInfor() {
        String way = cmd_prompt;
        String command = "tasklist";
        String path = Main.path.getText() + "\\" + Main.process_info_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Ham thu thap cac phien dang nhap dang hoat dong
     */
    public static String loginSession() {
        String way = cmd_prompt;
        String command = "logonsessions";
        String path = Main.path.getText() + "\\" + Main.phien_dang_nhap_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Ham thu thap du lieu handle process
     */
    public static String handleProcess() {
        String way = cmd_prompt;
        String command = "handle windows\\system";
        String path = Main.path.getText() + "\\" + Main.handle_process_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Hàm đọc thông tin cấu hình máy tính
     */
    public static String systemInfor() {
        String way = cmd_prompt;
        String command = "systeminfo";
        String path = Main.path.getText() + "\\" + Main.cau_hinh_may_tinh_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Hàm đọc danh sách tệp hệ thống
     */
    public static String fileSystem() {
        String way = cmd_prompt;
        String command = "driverquery | find \"File System\"";
        String path = Main.path.getText() + "\\" + Main.tep_he_thong_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Ham thu thap du lieu registry
     */
    public static String registry() {
        String way = cmd_prompt;
        String command = "regedit /E";
        String path = Main.path.getText() + "\\" + Main.registry_fn.getText() + ".reg";
        BaseFunction.baseFunction3(way, command, path);
        return path;

    }

    /**
     * Hàm đọc lịch sử trình duyệt
     */
    public static String browserHistory() {
        String way = cmd_prompt;
        String command = "ipconfig /displaydns";
        String path = Main.path.getText() + "\\" + Main.lich_su_trinh_duyet_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Ham doc thong tin cac tep gan day
     */
    public static String recentFile() {
        String way = cmd_prompt;
        String command1 = path_usb_command;
        String command2 = "OpenSaveFilesView /stext";
        String path = Main.path.getText() + "\\" + Main.tep_gan_day_fn.getText() + ".txt";
        BaseFunction.baseFunction4(way, command1, command2, path);
        return path;
    }

    /**
     * Hàm đọc toàn bộ event log
     */
    public static String exportEventLog() {
        String way = cmd_prompt;
        String command1 = path_usb_command;
        String command2 = "psloglist";
        String path = Main.path.getText() + "\\" + Main.eventlog_fn.getText() + ".txt";
        BaseFunction.baseFunction2(way, command1, command2, path);
        return path;

    }

    /**
     * Hàm đọc danh sách các file đang mở Note : cần mở được power shell as
     * admin
     */
    public static String getOpeningFile() {
        String way = cmd_powershell;
        String command1 = "Start-Process powershell -Verb runAs";
        String command2 = "Get-SMBOpenFile";
        String path = Main.path.getText() + "\\" + Main.tep_dang_mo_fn.getText() + ".txt";
        BaseFunction.baseFunction2(way, command1, command2, path);
        return path;

    }

    /**
     * Hàm thu thập service information
     */
    public static String serviceInfo() {
        String way = cmd_prompt;
        String command1 = path_usb_command;
        String command2 = "psService";
        String path = Main.path.getText() + "\\" + Main.thong_tin_dich_vu_fn.getText() + ".txt";
        BaseFunction.baseFunction2(way, command1, command2, path);
        return path;

    }

    /**
     * Ham thu thap thong tin driver
     */
    public static String driverInfo() {
        String way = cmd_prompt;
        String command = "driverquery";
        String path = Main.path.getText() + "\\" + Main.thong_tin_driver_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Ham thu thap dump info on cache
     */
    public static String dumpCache() {
        String way = cmd_prompt;
        String command = "coreinfo -l";
        String path = Main.path.getText() + "\\" + Main.dump_cache_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Hàm thu thập ngày và giờ hệ thống
     */
    public static String dateAndTime() {
        String way = cmd_prompt;
        String command = "date | time";
        String path = Main.path.getText() + "\\" + Main.ngay_gio_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Ham thu thap lich su cmd
     */
    public static String cmdHistory() {
        String way = cmd_prompt;
        String command = "doskey /history";
        String path = Main.path.getText() + "\\" + Main.ngay_gio_fn.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Ham thu thap do phan giai dong ho
     */
    public static String clockres() {
        String way = cmd_prompt;
        String command = "clockres";
        String path = Main.path.getText() + "\\" + Main.phan_giai_dh.getText() + ".txt";
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Ham thu thap ma nhan dang bao mat
     */
    public static String identificationCode() {
        String way = cmd_prompt;
        String command1 = path_usb_command;
        String command2 = "psGetsid";
        String path = Main.path.getText() + "\\" + Main.ma_nhan_dang_fn.getText() + ".txt";
        BaseFunction.baseFunction2(way, command1, command2, path);
        return path;
    }

}
