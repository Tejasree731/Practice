package Deepskilling.DesignPatterns.Proxy;

public class RealImage implements Image{
    String filename;
    public RealImage(String filename){
        this.filename=filename;
        loadImage();
    }
    public void loadImage(){
        System.out.println("Loading Image...");
    }
    @Override
    public void display(){
        System.out.println("Image Displayed!");
    }
}
