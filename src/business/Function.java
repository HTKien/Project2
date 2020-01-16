/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import presentation.screen.Main;
import static presentation.screen.Main.bang1;
import static presentation.screen.Main.bang2;
import presentation.screen.TaoMoi;

/**
 *
 * @author hantr
 */
public class Function {

    public static final String cmd_prompt = "cmd";
    public static final String cmd_powershell = "powershell.exe";
    //public static final String path_usb_command = "cd /d H:\\ps";
    public static final  String path_usb_command = "cd /d C:\\Project2\\src\\libraries";

    /**
     * Collect Network Status
     */
    public static String networkStatus() throws InterruptedException {
        String way = cmd_prompt;
        String command = "ipconfig";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(0, 2).toString() + bang1.getValueAt(0, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Collect opening port information
     */
    public static String openingPort() {
        String way = cmd_prompt;
        String command = "netstat -nao | find \"LISTEN\"";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(1, 2).toString() + bang1.getValueAt(1, 3).toString();

        BaseFunction.baseFunction(way, command, path);

        return path;

    }

    /**
     * Collect established connection list
     */
    public static String establishedConnection() {
        String way = cmd_prompt;
        String command = "netstat -nao | find \"ESTABLISHED\"";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(2, 2).toString() + bang1.getValueAt(2, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Collect Router Table
     */
    public static String routerTable() {
        String way = cmd_prompt;
        String command = "route PRINT";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(3, 2).toString() + bang1.getValueAt(3, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Collect data in ports
     */
    public static String dataPort() {
        String way = cmd_prompt;
        String command = "netstat -nao";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(4, 2).toString() + bang1.getValueAt(4, 3).toString();
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
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(5, 2).toString() + bang1.getValueAt(5, 3).toString();
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
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(6, 2).toString() + bang1.getValueAt(6, 3).toString();
        BaseFunction.baseFunction2(way, command1, command2, path);
        return path;

    }

    /**
     * Hàm đọc thông tin cấu hình mạng
     */
    public static String networkConfiguration() {
        String way = cmd_powershell;
        String command = "Get-WmiObject -Class Win32_NetworkAdapterConfiguration -Filter IPEnabled=TRUE -ComputerName . | Select-Object -Property [a-z]* -ExcludeProperty IPX*,WINS*";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(7, 2).toString() + bang1.getValueAt(7, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Hàm thu thập network information
     */
    public static String networkInformation() {
        String way = cmd_prompt;
        String command = "nbtstat -n";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(8, 2).toString() + bang1.getValueAt(8, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Hàm thu thập clipboard content
     */
    public static String clipboardContent() {
        String way = cmd_powershell;
        String command = "Get-Clipboard";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(9, 2).toString() + bang1.getValueAt(9, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Ham thu thap process information
     */
    public static String processInfor() {
        String way = cmd_prompt;
        String command = "tasklist";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(10, 2).toString() + bang1.getValueAt(10, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Ham thu thap cac phien dang nhap dang hoat dong
     */
    public static String loginSession() {
        String way = cmd_prompt;
        String command = "logonsessions";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(11, 2).toString() + bang1.getValueAt(11, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Ham thu thap du lieu handle process
     */
    public static String handleProcess() {
        String way = cmd_prompt;
        String command = "handle windows\\system";
        String path = TaoMoi.diachi.getText() + "\\" + bang1.getValueAt(12, 2).toString() + bang1.getValueAt(12, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    //NON-VOLATILE:
    /**
     * Hàm đọc thông tin cấu hình máy tính
     */
    public static String systemInfor() {
        String way = cmd_prompt;
        String command = "systeminfo";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(0, 2).toString() + bang2.getValueAt(0, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Hàm đọc danh sách tệp hệ thống
     */
    public static String fileSystem() {
        String way = cmd_prompt;
        String command = "driverquery | find \"File System\"";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(1, 2).toString() + bang2.getValueAt(1, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Ham thu thap du lieu registry
     */
    public static String registry() {
        String way = cmd_prompt;
        String command = "regedit /E";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(2, 2).toString() + bang2.getValueAt(2, 3).toString();
        BaseFunction.baseFunction3(way, command, path);
        return path;

    }

    /**
     * Hàm đọc lịch sử trình duyệt
     */
    public static String browserHistory() {
        String way = cmd_prompt;
        String command = "ipconfig /displaydns";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(3, 2).toString() + bang2.getValueAt(3, 3).toString();
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
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(4, 2).toString() + bang2.getValueAt(4, 3).toString();
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
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(5, 2).toString() + bang2.getValueAt(5, 3).toString();
        BaseFunction.baseFunction2(way, command1, command2, path);
        return path;

    }

    /**
     * Hàm đọc danh sách các file đang mở Note : cần mở được power shell as
     * admin
     */
    public static String getOpeningFile() {
        String way = cmd_powershell;
        String command = "Get-SMBOpenFile";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(6, 2).toString() + bang2.getValueAt(6, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;

    }

    /**
     * Hàm thu thập service information
     */
    public static String serviceInfo() {
        String way = cmd_prompt;
        String command1 = path_usb_command;
        String command2 = "psService";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(7, 2).toString() + bang2.getValueAt(7, 3).toString();
        BaseFunction.baseFunction2(way, command1, command2, path);
        return path;

    }

    /**
     * Ham thu thap thong tin driver
     */
    public static String driverInfo() {
        String way = cmd_prompt;
        String command = "driverquery";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(8, 2).toString() + bang2.getValueAt(8, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;
    }
//
//    /**
//     * Ham thu thap dump info on cache
//     */
//    public static String dumpCache() {
//        String way = cmd_prompt;
//        String command = "coreinfo -l";
//        String path = Main.path.getText() + "\\" + Main.dump_cache_fn.getText() + ".txt";
//        BaseFunction.baseFunction(way, command, path);
//        return path;
//    }
//
//    /**
//     * Hàm thu thập ngày và giờ hệ thống
//     */
//    public static String dateAndTime() {
//        String way = cmd_prompt;
//        String command = "date | time";
//        String path = Main.path.getText() + "\\" + Main.ngay_gio_fn.getText() + ".txt";
//        BaseFunction.baseFunction(way, command, path);
//        return path;
//
//    }
//

    /**
     * Ham thu thap lich su cmd
     */
    public static String cmdHistory() {
        String way = cmd_prompt;
        String command = "doskey /history";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(10, 2).toString() + bang2.getValueAt(10, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Ham thu thap trinh dieu khien he thong tep:
     */
    public static String fileControl() {
        String way = cmd_prompt;
        String command1 = path_usb_command;
        String command2 = "pipelist";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(11, 2).toString() + bang2.getValueAt(11, 3).toString();
        BaseFunction.baseFunction2(way, command1, command2, path);
        return path;

    }

    /**
     * Ham thu thap listDLL
     */
    public static String listDLL() {
        String way = cmd_prompt;
        String command = "listdlls -r";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(12, 2).toString() + bang2.getValueAt(12, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Ham thu thap ngay he thong
     */
    public static String dateSystem() {
        String way = cmd_prompt;
        String command = "date";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(14, 2).toString() + bang2.getValueAt(14, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;
    }

    /**
     * Ham thu thap gio he thong
     */
    public static String timeSystem() {
        String way = cmd_prompt;
        String command = "time";
        String path = TaoMoi.diachi.getText() + "\\" + bang2.getValueAt(15, 2).toString() + bang2.getValueAt(15, 3).toString();
        BaseFunction.baseFunction(way, command, path);
        return path;
    }
//
//    /**
//     * Ham thu thap do phan giai dong ho
//     */
//    public static String clockres() {
//        String way = cmd_prompt;
//        String command = "clockres";
//        String path = Main.path.getText() + "\\" + Main.phan_giai_dh.getText() + ".txt";
//        BaseFunction.baseFunction(way, command, path);
//        return path;
//    }
//
//    /**
//     * Ham thu thap ma nhan dang bao mat
//     */
//    public static String identificationCode() {
//        String way = cmd_prompt;
//        String command1 = path_usb_command;
//        String command2 = "psGetsid";
//        String path = Main.path.getText() + "\\" + Main.ma_nhan_dang_fn.getText() + ".txt";
//        BaseFunction.baseFunction2(way, command1, command2, path);
//        return path;
//    }

}
