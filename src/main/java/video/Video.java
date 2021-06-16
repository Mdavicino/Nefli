package video;

public class Video {
  int idVideo;
  double duracion;

  public Video(int idVideo, double duracion) {
    this.idVideo = idVideo;
    if(duracion <= 0) throw new RuntimeException("La duración debe ser mayor a 0");
    this.duracion = duracion;
  }

  public double getDuracion() {
    return duracion;
  }

  public int getId() {
    return idVideo;
  }
}
