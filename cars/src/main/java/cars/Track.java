package cars;

/**
 * Created by jiri.peinlich on 20/01/2016.
 */
public class Track {

    public enum TrackElement{
        START,
        EMPTY,
        OBSTACLE,
        FINISH
    }

    final TrackElement [][] track;

    public Track(TrackElement[][] track) {
        this.track = track;
    }

    public TrackElement element(int x,int y){
        return track[x][y];
    }
    public TrackElement element(Coordinate coordinate) {
        return element(coordinate.getX(),coordinate.getY());
    }

}
