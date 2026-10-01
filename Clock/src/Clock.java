public class Clock{
    private int min;
    private int hr;
    private int sec;

    public Clock(){
        hr = 0;
        min = 0;
        sec = 0;
    }

    public Clock(int hour, int minu, int secu)
    {
        hr = hour;
        min = minu;
        sec = secu;
    }
    public void setTime(int hours, int minutes, int seconds){
        hr = hours;
        min = minutes;
        sec = seconds;  //Si nuestras variables se llamaran igual, podemos usar this.
        // para referirnos al miembro de la clase.
    }
    public int getMin() {
        return min;
    }

    public int getHr() {
        return hr;
    }

    public int getSec() {
        return sec;
    }

    public void printTime(){
        System.out.println(hr + " : " + min + " : " + sec);
    }

    public void incrementHour(){
        hr++;
    }

    public void incrementMinutes(){
        min++;
    }

    public void incrementSeconds(){
        sec++;
    }

    public boolean equals(Clock otherClock){
        if (hr  == otherClock.hr && min == otherClock.min && sec == otherClock.sec) {
            return true;
        }
        return false;
    }

    public void makeCopy(Clock otherClock){
        otherClock.hr = hr;
        otherClock.min = min;
        otherClock.sec = sec;
    }

    public Clock getCopy(){
        Clock otherClock = new Clock();
        otherClock.hr = hr;
        otherClock.min = min;
        otherClock.sec = sec;

        return otherClock;
    }
}
