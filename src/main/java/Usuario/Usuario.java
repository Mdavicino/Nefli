package Usuario;

import reproductor.ReproductorNefli;
import video.Video;
import video.VideoReproduccion;

import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
  private List<VideoReproduccion> videosReproduccion;

  public List<VideoReproduccion> getVideosPendientes(){
    return videosReproduccion
        .stream()
        .filter(videoRep -> videoRep.estaPendiente())
        .collect(Collectors.toList());
  }

  public void retomarReproduccion(VideoReproduccion videoAContinuar){
    ReproductorNefli.getInstance().reproducir(videoAContinuar.getId(), videoAContinuar.getMinutoActual());
  }

  public void iniciarReproduccion(Video video){
    videosReproduccion.add(new VideoReproduccion(video, 0));
    ReproductorNefli.getInstance().reproducir(video.getId(), 0);
  }

}
