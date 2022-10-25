public class WorldClock extends Clock{
    int timeZone=0;
    public WorldClock(int timezone)
    {
        super();
        this.timeZone=timezone;
    }

    public String getHours(){
        String Hours=String.valueOf(Integer.parseInt(super.getAlarmHour())+timeZone);
        return Hours;
    }
}
