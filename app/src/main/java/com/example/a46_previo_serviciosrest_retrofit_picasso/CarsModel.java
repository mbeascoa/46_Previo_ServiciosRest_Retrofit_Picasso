package com.example.a46_previo_serviciosrest_retrofit_picasso;

public class CarsModel {
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("image")
    @Expose
    private String image;
    public String getId() { return id;}
    public void setId(String id) { this.id = id;}
    public String getName() { return name;}
    public void setName(String name) { this.name = name;}
    public String getDesc() { return desc;}
    public void setDesc(String desc) { this.desc = desc;}
    public String getImage() { return image;}
    public void setImage(String image) { this.image = image;}
}
