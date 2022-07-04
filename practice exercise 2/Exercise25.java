import java.util.Scanner;;

public class Exercise25 {
    float a = 17.27f;
    float b = 237.7f;
    
    public float dueTemperature(float humidity, float temperature){
        float func =  (a * temperature) / (b + temperature) + (float) Math.log(humidity);
        float duePoint =  (b * func) / (a - func);
        return duePoint;
    }
    public static void main(String[] args) {
        float humidity, temperature;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter relative humidity (0 to 1): ");
        humidity = scn.nextFloat();
        System.out.print("Enter the temperature in degree celcius: ");
        temperature = scn.nextFloat();
        scn.close();

        if(humidity > 1 ){
            System.out.println("Invalid humidity");
            System.exit(1);
        }
        Exercise25 ex = new Exercise25();
        float duePoint = ex.dueTemperature(humidity, temperature);
        System.out.println("Due point is " + duePoint + " degree celcius.");
    }    
}
