
public class Screen_saver_version_1_0_1_Direction {

    private String horizontal_direction;
    private String vertical_direction;

    public Screen_saver_version_1_0_1_Direction(String horizontal, String vertical){
        horizontal_direction=horizontal;
        vertical_direction=vertical;
    }

    public void setHorizontalDirection(String horizontal) {
        horizontal_direction = horizontal;
    }

    public void setVerticalDirection(String vertical){
        vertical_direction=vertical;
    }

    public String getHorizontalDirection(){
        return horizontal_direction;
    }

    public String getVerticalDirection(){
        return vertical_direction;
    }
}
