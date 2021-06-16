package reproductor;

public interface Reproductor {
  boolean play(int idVideo, double minutoInicio);
  void stop();

  void registerOnPlay(PlayListener playListener);
  void registerOnStop(StopListener listener);
  void registerOnFinish(FinishListener listener);
}
