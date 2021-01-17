import java.text.DecimalFormat;

public class Arrays {
    public static void main(String[] args) {
        float max = 0;
        float min = 0;
        float avgTemp;
        float sumTemp = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        float[] patients = new float[10];

        for (int i = 0; i < patients.length; i++)
        {
            String temperature = decimalFormat.format(34 + (float) Math.random() * 5);
            temperature = temperature.replaceAll(",", ".");
            patients[i] = Float.parseFloat(temperature);

            if (max == 0 || max < patients[i]) {
                max = patients[i];
            }
            if (min == 0 || min > patients[i]) {
                min = patients[i];
            }
        }

        for (Float patient : patients){
            sumTemp += patient;

            System.out.println(patient);
        }
        System.out.println("Минимальная температура: " + min);
        System.out.println("Максимальная температура: " + max);
        System.out.println("Средняя температура: " + sumTemp/10);
    }
}
