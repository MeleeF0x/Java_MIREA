package bikeproject;

public interface MountainParts {
    final String TERRAIN = "off_road";
    String getType();
    void setType(String newValue);
    String getSuspension();
    void setSuspension(String newValue);
}
