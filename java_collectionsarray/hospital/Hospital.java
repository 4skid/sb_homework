package practice.hospital;

import java.text.DecimalFormat;

public class Hospital {
    final static float MIN_TEMP = 32.0F;
    final static float MAX_TEMP = 40.0F;

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemeratures = new float[patientsCount];
        for (int i = 0; i < patientsTemeratures.length; i++) {
            patientsTemeratures[i] = (MIN_TEMP + (MAX_TEMP - MIN_TEMP) * (float) Math.random());
        }
        return patientsTemeratures;
    }

    public static String getReport(float[] temperatureData) {

        String temperatures = "";
        float averageTemp = 0.0F;
        int healthPatientsCount = 0;

        for (float patientsTemerature : temperatureData) {
            if (patientsTemerature >= 36.2F && patientsTemerature <= 36.9F) {
                ++healthPatientsCount;
            }
            averageTemp += patientsTemerature;
            temperatures += String.format("%.1f ", patientsTemerature);
        }
        DecimalFormat df = new DecimalFormat("#.##");
        averageTemp /= temperatureData.length;


        String report =
                "Температуры пациентов: " + temperatures.trim() +
                        "\nСредняя температура: " + df.format(averageTemp) +
                        "\nКоличество здоровых: " + healthPatientsCount;

        return report;
    }
}
