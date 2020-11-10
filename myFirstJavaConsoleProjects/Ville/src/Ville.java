
public class Ville {
    // Les Attributs
    private String nomVille;
    private int nombreHabitants;
    private int[] precipitationMensuel;
    private int[] temperatureMensuel;


    // Constructeur
    public Ville(String nomVille, int nombreHabitants, int[] precipitationMensuel, int[] temperatureMensuel)
    {
        this.nomVille = nomVille;
        this.nombreHabitants = nombreHabitants;
        this.precipitationMensuel = precipitationMensuel;
        this.temperatureMensuel = temperatureMensuel;
    }

    //Getters&Setters
    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(int nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }

    public int[] getPrecipitationMensuel() {
        return precipitationMensuel;
    }

    public void setPrecipitationMensuel(int[] precipitationMensuel) {
        this.precipitationMensuel = precipitationMensuel;
    }

    public int[] getTemperatureMensuel() {
        return temperatureMensuel;
    }

    public void setTemperatureMensuel(int[] temperatureMensuel) {
        this.temperatureMensuel = temperatureMensuel;
    }

    // Les Méthodes
	/* ---- we don't need a parameter be cause it is an attribut inside the main
	 					if it is extern you need a parameter! ---- */
    public float moyennePrecipitation() {
        float sommePrecipitation = 0;
        for (int precipitation : precipitationMensuel)
        {
            sommePrecipitation = sommePrecipitation + precipitation;
        }
        return sommePrecipitation / 12;
    }

    public float moyenneTemperature() {
        float sommeTemperature = 0;
        for (int temperature : temperatureMensuel)
        {
            sommeTemperature = sommeTemperature + temperature;
        }
        return  sommeTemperature / 12;
    }

    public int maximumPrecipitation( ) {
        int precipitationMaximum = 0;
        for ( int precipitation : precipitationMensuel ) {
            if ( precipitation > precipitationMaximum ) {
                precipitationMaximum = precipitation;
            }
        } return precipitationMaximum;
    }

    public int maximumTemperature( ) {
        int temperatureMaximum = -100;
        for ( int temperature : temperatureMensuel ) {
            if ( temperature > temperatureMaximum ) {
                temperatureMaximum = temperature;
            }
        } return temperatureMaximum;
    }


    // La méthode toString
    @Override
    public String toString() {
        return "Ville [nomVille=" + nomVille + ", nombreHabitants=" + nombreHabitants + ", La Moyenne Precipitation : "
                + String.format("%.2f", moyennePrecipitation()) + ", La Moyenne Temperature : " + String.format("%.2f", moyenneTemperature()) + "]";

    }
}
