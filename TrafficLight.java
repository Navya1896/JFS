//4. Write a Java program to create class called "TrafficLight" with attributes for color and
// duration,and methods to change the color and check for red or green.
//Hint : The above class has two private attributes: ‘color’ and ‘duration’.
// A constructor initializes these attributes with the values passed as arguments,
//and getter and setter methods to access and modify these attributes.
//It also has methods to change the ‘color’, and to check if the light is red or green.

public class TrafficLight {
    private String color;
    private double duration;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public TrafficLight(String color, double duration) {
        this.color = color;
        this.duration = duration;
    }
    public String changeColor(String color, double duration){
        if(color.equalsIgnoreCase("Red") && duration == 00.00){
            setColor("Green");
        }
        else {
            setColor("Red");
        }
        return color;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("Red", 00.00);
        System.out.println("The TrafficLight details:- ");
        String changedColor = trafficLight.changeColor(trafficLight.color, trafficLight.duration);
        System.out.println("Color:- "+trafficLight.color);
        System.out.println("Changed Color:- "+ changedColor);
        System.out.println("Duration:- "+trafficLight.duration);

    }
}
