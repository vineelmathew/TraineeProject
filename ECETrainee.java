public class ECETrainee extends Trainee {
    private String devices;
    public ECETrainee(int id, String name,String devices) {
        super(id, name);
        this.devices=devices;
    }

    public String getDevices() {
        return devices;
    }

    public void setDevices(String devices) {
        this.devices = devices;
    }
}

