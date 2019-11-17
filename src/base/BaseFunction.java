/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.io.PrintWriter;
import view.Dialog;
import view.Progressbar;

/**
 *
 * @author hantr
 */
public class BaseFunction {

    /**
     * Hàm cơ sở để xây dựng thu thập cho tất cả các hàm riêng hàm này chỉ chạy
     * 1 câu lệnh
     */
    public static void baseFunction(String way, String command, String path) {
        Process p;
        try {
            p = Runtime.getRuntime().exec(way);
            new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
            new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
            PrintWriter stdin = new PrintWriter(p.getOutputStream());
            stdin.println(command + " > " + path);
            stdin.close();
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Hàm cơ sở trong đó có hai câu lệnh được chạy
     */
    public static void baseFunction2(String way, String command1, String command2, String path) {
        Process p;
        try {
            p = Runtime.getRuntime().exec(way);
            new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
            new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
            PrintWriter stdin = new PrintWriter(p.getOutputStream());
            stdin.println(command1);
            stdin.println(command2 + " > " + path);
            stdin.close();
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Ham chi thu hien duy nhat 1 cau lenh de xuat, khong thuc hien sao chep ra
     * file txt
     */
    public static void baseFunction3(String way, String command, String path) {
        Process p;
        try {
            p = Runtime.getRuntime().exec(way);
            new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
            new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
            PrintWriter stdin = new PrintWriter(p.getOutputStream());
            stdin.println(command + " " + path);
            stdin.close();
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Ham co di chuyen vao trong thu vien cua usb, nhung khong co >
     */
    public static void baseFunction4(String way, String command1, String command2, String path) {
        Process p;
        try {
            p = Runtime.getRuntime().exec(way);
            new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
            new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
            PrintWriter stdin = new PrintWriter(p.getOutputStream());
            stdin.println(command1);
            stdin.println(command2 + " " + path);
            stdin.close();
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Ham chay thanh loading
     */
    public static void loadingPro() throws InterruptedException {
        Progressbar progressbar = new Progressbar();
        progressbar.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                Progressbar.so.setText(Integer.toString(i)+"%");
            }
        } catch (Exception e) {
        }
    }
    /**
     * Ham hien dialog thong bao
     */
    public static void dialog(String tenThongTin, String diaChiDich){
        (new Dialog()).setVisible(true);
        Dialog.ten_thong_tin.setText("Thu thập thành công "+tenThongTin);
        Dialog.dia_chi_dich.setText(diaChiDich);
    }

}
