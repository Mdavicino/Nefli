package video;

public class VideoReproduccion {
  private Video video;
  private double minutoActual;

  public VideoReproduccion(Video video, double minutoActual) {
    this.video = video;
    this.minutoActual = minutoActual;
  }

  public boolean estaPendiente() {
    return minutoActual < video.getDuracion();
  }

  public double getMinutoActual() {
    return minutoActual;
  }

  public Video getVideo() {
    return video;
  }

  public int getId() {
    return video.getId();
  }
}
