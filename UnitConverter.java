import java.util.HashMap;
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Double> conversionFactors = new HashMap<String, Double>();
        conversionFactors.put("meters", 1.0);
        conversionFactors.put("feet", 3.28084);
        conversionFactors.put("inches", 39.3701);
        conversionFactors.put("centimeters", 100.0);
        conversionFactors.put("kilometers", 0.001);
        conversionFactors.put("miles", 0.000621371);
        conversionFactors.put("pounds", 2.20462);
        conversionFactors.put("kilograms", 1.0);
        conversionFactors.put("ounces", 35.274);
        conversionFactors.put("grams", 1000.0);

        System.out.println("Welcome to the Unit Converter!");
        System.out.println("Please enter the value you want to convert:");
        double value = input.nextDouble();
        input.nextLine();

        System.out.println("Please select the unit of the value you entered:");
        System.out.println("1. Meters");
        System.out.println("2. Feet");
        System.out.println("3. Inches");
        System.out.println("4. Centimeters");
        System.out.println("5. Kilometers");
        System.out.println("6. Miles");
        System.out.println("7. Pounds");
        System.out.println("8. Kilograms");
        System.out.println("9. Ounces");
        System.out.println("10. Grams");

        int fromUnitIndex = input.nextInt();
        input.nextLine();

        String fromUnit = getUnit(fromUnitIndex);

        System.out.println("Please select the unit you want to convert to:");

        int toUnitIndex = input.nextInt();
        input.nextLine();

        String toUnit = getUnit(toUnitIndex);

        double fromFactor = conversionFactors.get(fromUnit);
        double toFactor = conversionFactors.get(toUnit);

        double result = value * (toFactor / fromFactor);

        System.out.printf("%.2f %s is equal to %.2f %s.\n", value, fromUnit, result, toUnit);
    }

    public static String getUnit(int index) {
        switch(index) {
            case 1: return "meters";
            case 2: return "feet";
            case 3: return "inches";
            case 4: return "centimeters";
            case 5: return "kilometers";
            case 6: return "miles";
            case 7: return "pounds";
            case 8: return "kilograms";
            case 9: return "ounces";
            case 10: return "grams";
            default: return "";
        }
    }
}
