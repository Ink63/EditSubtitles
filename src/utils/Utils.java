/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Ink
 */


public class Utils {

    public final static char SEP1 = ':';
    public final static char SEP2 = ',';
    public final static String SEP3 = " --> ";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static long getTime(int hour, int min, int sec, int ms) {
        return (hour*60*60+min*60+sec)*1000+ms;
    }

    public static long getTime(String time) {
        int hour;
        int min;
        int sec;
        int ms;
        long res = -1;

        String[] ss = time.split(""+SEP1);
        String[] ss2 = ss[2].split(""+SEP2);

        if (ss.length>2) {
            try {
               hour = Integer.parseInt(ss[0]);
               min = Integer.parseInt(ss[1]);
               sec = Integer.parseInt(ss2[0]);
               ms=Integer.parseInt(ss2[1]);
            }
            catch (NumberFormatException e) {
                return -1;
            }
        }
        else return -1;

        res = (hour*60*60+min*60+sec)*1000+ms;
        return res;
    }

    public static String getTime(long time) {

        int hour = (int) time/3600/1000;
        int min = (int) (time - hour*3600*1000)/60/1000;
        int sec = (int) (time - hour*3600*1000-min*60*1000)/1000;
        int ms = (int) (time % 1000);
        StringBuffer res = new StringBuffer(""+hour);

        if (hour<10) res.insert(0,'0');
        res.append(SEP1);
        if (min<10) res.append('0');
        res.append(String.valueOf(min)+SEP1);
        if (sec<10) res.append('0');
        res.append(String.valueOf(sec)+SEP2);
        if (ms<10) res.append("00");
        else if (ms<100) res.append('0');
        res.append(String.valueOf(ms));

        return res.toString();
    }
    
    public static boolean isDigits(String s) {
        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) return false;
        }
        return true;
    }

        
}
