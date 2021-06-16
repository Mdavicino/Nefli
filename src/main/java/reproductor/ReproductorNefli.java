package reproductor;

public class ReproductorNefli {
  private static Reproductor reproductor;
  private static ReproductorNefli instance;

  public ReproductorNefli(Reproductor reproductor) {
    this.reproductor = reproductor;
  }

  public static void initInstance(Reproductor reproductor){
    instance = new ReproductorNefli(reproductor);
  }

  public static ReproductorNefli getInstance(){
    return instance;
  }

  public void reproducir(int id, double minutoActual) {
    reproductor.play(id, minutoActual);
  }
}
