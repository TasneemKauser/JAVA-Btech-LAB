package Pattern_practice;
class box{
    int width,height ,depth;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getDepth() {
        return depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void Volume(){
        System.out.println("The volume of the box (cuboid) is:Volume = depth * height * width="+depth*height*width);

    }
}
public class assignment_01 {
    public static void main(String[] args) {
        box b=new box();
        b.setDepth(23);
        b.setHeight(12);
        b.setWidth(17);
        System.out.println("The depth of the box is :"+b.getDepth());
        System.out.println("The height of the box is :"+b.getHeight());
        System.out.println("The width of the box is :"+b.getWidth());
        b.Volume();
    }
}
