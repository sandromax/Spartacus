package io.sandromax.layers;

public class Project extends Layer{
    /**
     * Physical address
     */
    private String location;

    public Project(String name) {
        super(name);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String newName) {
        super.setName(newName);
    }

    public String getLocation() {
        return location;
    }
}
