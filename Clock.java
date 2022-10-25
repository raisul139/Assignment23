public class Clock
{
    String AlarmHour;
    String AlarmMinute;

    public String getAlarmHour()
    {
        String hours=java.time.LocalTime.now().toString().substring(0,2);
        return hours;
    }

    public String getAlarmMinute()
    {
        String min=java.time.LocalTime.now().toString().substring(3,5);
        return min;
    }
    public String getTime()
    {
        String time=getAlarmHour()+":"+getAlarmMinute();
        return time;
    }

    public void  setAlarm(String hour,String minute)
    {
        AlarmHour=hour;
        AlarmMinute=minute;
    }

}

