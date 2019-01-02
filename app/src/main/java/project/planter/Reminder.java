package project.planter;

class Reminder {
    /**
     * The plant attached to the reminder.
     */
    private Plant plant;
    private int pictureId;
    private String time;
    private String date;
    private String waterFreq;
    private String fertFreq;
    // TODO: add frequency for watering and fertilizer

    Reminder(Plant plant, int pictureId, String time, String date) {
        this.plant = plant;
        this.pictureId = pictureId;
        this.time = time;
        this.date = date;
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

    String getDate() {
        return date;
    }

    void setDate(String date) {
        this.date = date;
    }

    String getWaterFreq() {
        return waterFreq;
    }

    void setWaterFreq(String waterFreq) {
        this.waterFreq = waterFreq;
    }

    String getFertFreq() {
        return fertFreq;
    }

    void setFertFreq(String fertFreq) {
        this.fertFreq = fertFreq;
    }

}
