package java_quete_08;

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }
    public boolean isFlying() {
        return flying;
    }
    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        System.out.println(this.getName() + " takes off in the sky.");
        this.flying = true;
    }

    @Override
    public int ascend(int altitude) {
        if(this.flying) {
            System.out.println(this.getName() + " flies upward, altitude: " + altitude);
        } else {
            System.out.println("impossible, " + this.getName() + " didn't take off" );
        }
        return this.altitude = altitude;
    }
    @Override
    public void glide(){
        if(this.flying) {
            System.out.println("glides into the air.");
        } else {
            System.out.println("impossible, " + this.getName() + " didn't take off");
        }
    }

    @Override
    public int descend(int altitude) {
        if(this.flying) {
            System.out.println(this.getName() + " flies downward, altitude: " + altitude);
        } else {
            System.out.println("impossible, " + this.getName() + " didn't take off");
        }
        return this.altitude = altitude;
    }
    @Override
    public void land(){
        if(this.flying && this.altitude == 1) {
            System.out.println(this.getName() + " lands on the ground." );
            this.flying = false;
        } else if (!this.flying) {
            System.out.println("impossible, " + this.getName() + " didn't take off");
        } else {
            System.out.println(this.getName() + " is too high, it can't land.");
        }
    }
}
