public class Aventurero{
    private String nombreAventurero;
    private int hpActuales;
    private int golpeMaximos;
    private int danoBase;
    private int numeroPociones;

    private final int pocion = 20;

    public Aventurero(String nombreAventurero, int hpActuales, int golpeMaximos, int danoBase, int numeroPociones){
        this.nombreAventurero = nombreAventurero;
        this.hpActuales = hpActuales;
        this.golpeMaximos = golpeMaximos;
        this.danoBase = danoBase;
        this.numeroPociones= numeroPociones;
    }

    public String getNombreAventurero(){
        return this.nombreAventurero;
    }
    public int getHpActuales(){
        return this.hpActuales;
    }

    public void setHpActuales(int hpActuales) {
        this.hpActuales = hpActuales;
    }
    
    public int getGolpeMaximos(){
        return this.golpeMaximos;
    }
    public int getDanoBase(){
        return this.danoBase;
    }
    public int getNumeroPociones(){
        return this.numeroPociones;
    }

    public void recibirDano(int danio) {

    }

    public void atacar(Enemigo objetivo){
        
    }
}