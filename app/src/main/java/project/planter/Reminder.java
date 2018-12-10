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

    Plant getPlant() {
        return plant;
    }

    void setPlant(Plant plant) {
        this.plant = plant;
    }

    String getTime() {
        return time;
    }

    void setTime(String time) {
        this.time = time;
    }

    int getPictureId() {
        return pictureId;
    }

    void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
