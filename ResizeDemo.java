class ResizeDemo{
    public static void main(String[] args){
        Rectangle rec = new Rectangle(15, 10);

        System.out.println("Original Dimensions: ");
        rec.displayInfo();
        
        rec.resizeHeight(10);
        rec.resizeWidth(20);

        System.out.println("Updated Dimensions: ");
        rec.displayInfo();
    }


}




interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);

}

class Rectangle implements Resizable{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width= width;
        this.height= height;
    }

    @Override
    public void resizeWidth(int width){
        this.width=width;
        System.out.println("Resized WIdth to :"+ width);
    }

    @Override
    public void resizeHeight(int height){
        this.height= height;
        System.out.println("Resized Height to : " + height);
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void displayInfo(){
        System.out.println("Rectangle Width: "+ width + ",Height" + height);
    }
}