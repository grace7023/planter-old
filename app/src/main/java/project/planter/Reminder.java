package project.planter;

public class Reminder {
    /**
     * The plant attached to the reminder.
     */
    private Plant plant;
    private String time;
    private int pictureId;
    // TODO: add frequency for watering and fertilizer

    Reminder(Plant plant, String time, int pictureId) {
        this.plant = plant;
        this.time = time;
        this.pictureId = pictureId;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
