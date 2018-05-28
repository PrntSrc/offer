package netease.spring_2019;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-05-15
 */
public class Alarm {

    private int hour;
    private int minute;

    public Alarm(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return this.hour + " " + this.minute;
    }

    public static void getLastAlarm(int n, Alarm[] alarms, int time, Alarm classAlarm) {
        Alarm ceilAlarm;
        if (classAlarm.minute >= time)
            ceilAlarm = new Alarm(classAlarm.hour, classAlarm.minute - time);
        else
            ceilAlarm = new Alarm(classAlarm.hour - 1, classAlarm.minute + 60 - time);
        Alarm res = new Alarm(0, 0);
        for (Alarm a : alarms) {
            if (a.hour > ceilAlarm.hour || (a.hour == ceilAlarm.hour && a.minute > ceilAlarm.minute)) continue;
            if (a.hour >= res.hour && (a.hour != res.hour || a.minute > res.minute)) {
                res.hour = a.hour;
                res.minute = a.minute;
            }
        }
        System.out.println(res.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Alarm[] alarms = new Alarm[n];
        for (int i = 0; i < n; i++)
            alarms[i] = new Alarm(sc.nextInt(), sc.nextInt());
        int time = sc.nextInt();
        Alarm classAlarm = new Alarm(sc.nextInt(), sc.nextInt());
        getLastAlarm(n, alarms, time, classAlarm);
    }
}
