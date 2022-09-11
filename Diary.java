import java.util.List;

public class Diary{
    private List<Training> trainingList;
}

class Training {
    private String typeOfTraining;
    private String date;
    private List<Exercise> exerciseList;
    private List<Time> timeList;
    private double weather;
    private String location;
    private String mileage;
    private String description;
    private String feelings;
    private String body;

    public String getTypeOfTraining() {
        return typeOfTraining;
    }
    public void setTypeOfTraining(String typeOfTraining) {
        this.typeOfTraining = typeOfTraining;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public double getWeather() {
        return weather;
    }
    public void setWeather(double weather) {
        this.weather = weather;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getMileage() {
        return mileage;
    }
    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getFeelings() {
        return feelings;
    }
    public void setFeelings(String feelings) {
        this.feelings = feelings;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
}

class Exercise{
    private String nameOfExercise;
    private double distance;

    public String getNameOfExercise() {
        return nameOfExercise;
    }

    public void setNameOfExercise(String nameOfExercise) {
        this.nameOfExercise = nameOfExercise;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}

class Time{
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}