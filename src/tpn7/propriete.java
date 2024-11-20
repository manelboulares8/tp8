package tpn7;
public abstract class propriete{
	private int id;
	private personne responsable;
	private String adresse;
	private double surface;
	
	public propriete(int id,personne responsable, String adresse, double surface){
		this.id = id;
        this.responsable = responsable;
        this.adresse = adresse;
        this.surface = surface;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public personne getResponsable() {
        return responsable;
    }

    public void setResponsable(personne responsable) {
        this.responsable = responsable;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }
    public String toString() {
		return "Propriete :\n" +
           "  id: " + id + "\n" +
           "  Responsable: " + responsable + "\n" +
           "  Adresse: '" + adresse + "'\n" +
           "  Surface: " + surface + " m2\n"
           ;
	}
    public abstract double calculImpot();
}