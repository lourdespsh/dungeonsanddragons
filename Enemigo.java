public class Enemigo{
    private String nombreEnemigo;
    private int hpActuales;
    private int golpeMaximos;
    private int danoBase;

    //CONSTRUCTORES
    public Enemigo(String nombreEnemigo, int hpActuales, int golpeMaximos, int danoBase){
    this.nombreEnemigo = nombreEnemigo;
    this.golpeMaximos = golpeMaximos;
    this.hpActuales = golpeMaximos;
    this.danoBase = danoBase;
    }

    public String getNombreEnemigo(){
        return this.nombreEnemigo;
    }
    public int getHpActuales(){
        return this.hpActuales;
    }
    public int getGolpeMaximos(){
        return this.golpeMaximos;
    }
    public int getDanoBase(){
        return this.danoBase;
    }

    public void recibirDano (int dano){
        hpActuales -= dano;
        if(hpActuales<0){
            hpActuales = 0;
        }
    }

    public boolean estaDerrotado(){
        /*boolean dañosCero = false;
        if(hpActuales <=0){
            dañosCero = true;
        }
        return dañosCero;*/
        // ES EQUIVALENTE
        return hpActuales <= 0;
    }

    public void atacar(Aventurero aventurero){
        aventurero.recibirDano(this.danoBase);
    }

}


    