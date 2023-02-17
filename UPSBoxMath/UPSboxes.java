package UPSBoxMath;
import java.util.Scanner;

/*
 Hey everybody, if you want me to explain any of this I will happily do so
 Here is the gist of it:

Criteria to meet:
    1. Item must fit all three dimensions of the box
    2. The least volume most be used (given a 2 inch leeway)

It basically just cycles through all the boxes listed here to find the smallest one that fits it

 */

public class UPSboxes {
    //sets up an array of box objects
    public static Box[] GenerateBoxes(){
        //array declaration
        Box[] boxes = new Box[66];
        //index incrementor
        int x = 0;
        //box inputs
        boxes[x] = new Box("6x6x6", "Basic cubed box", 6, 6, 6, false);
        x++;
        boxes[x] = new Box("6x6x6", "Basic cubed box", 6, 6, 4, true);
        x++;
        boxes[x] = new Box("8x8x8","Basic cubed box", 8, 8, 8, false);
        x++;
        boxes[x] = new Box("8x8x8","Basic cubed box", 8, 8, 6, true);
        x++;
        boxes[x] = new Box("8x8x8","Basic cubed box", 8, 8, 4, true);
        x++;
        boxes[x] = new Box("10x10x10","Basic cubed box", 10, 10, 10, false);
        x++;
        boxes[x] = new Box("10x10x10","Basic cubed box", 10, 10, 8, true);
        x++;
        boxes[x] = new Box("10x10x10","Basic cubed box", 10, 10, 6, true);
        x++;
        boxes[x] = new Box("12x12x12","Basic cubed box", 12, 12, 12, false);
        x++;
        boxes[x] = new Box("12x12x12","Basic cubed box", 12, 12, 10, true);
        x++;
        boxes[x] = new Box("12x12x12","Basic cubed box", 12, 12, 8, true);
        x++;
        boxes[x] = new Box("12x12x12","Basic cubed box", 12, 12, 6, true);
        x++;
        boxes[x] = new Box("12x12x48", "Medium Golf Box", 48, 12, 12, false);
        x++;
        boxes[x] = new Box("14x14x14","Basic cubed box", 14, 14, 14, false);
        x++;
        boxes[x] = new Box("14x14x14","Basic cubed box", 14, 14, 12, true);
        x++;
        boxes[x] = new Box("14x14x14","Basic cubed box", 14, 14, 10, true);
        x++;
        boxes[x] = new Box("16x16x16","Basic cubed box", 16, 16, 16, false);
        x++;
        boxes[x] = new Box("16x16x16","Basic cubed box", 16, 16, 14, true);
        x++;
        boxes[x] = new Box("16x16x16","Basic cubed box", 16, 16, 12, true);
        x++;
        boxes[x] = new Box("16x16x16","Basic cubed box", 16, 16, 10, true);
        x++;
        boxes[x] = new Box("16x16x8","Basic cubed box", 16, 16, 8, false);
        x++;
        boxes[x] = new Box("16x16x4","Basic cubed box", 16, 16, 4, false);
        x++;
        boxes[x] = new Box("18x18x18","Basic cubed box", 18, 18, 18, false);
        x++;
        boxes[x] = new Box("18x18x18","Basic cubed box", 18, 18, 16, true);
        x++;
        boxes[x] = new Box("18x18x18","Basic cubed box", 18, 18, 14, true);
        x++;
        boxes[x] = new Box("18x18x18","Basic cubed box", 18, 18, 12, true);
        x++;
        boxes[x] = new Box("18x18x18","Basic cubed box", 18, 18, 10, true);
        x++;
        boxes[x] = new Box("20x20x20","Basic cubed box", 20, 20, 20, false);
        x++;
        boxes[x] = new Box("20x20x20","Basic cubed box", 20, 20, 18, true);
        x++;
        boxes[x] = new Box("20x20x20","Basic cubed box", 20, 20, 16, true);
        x++;
        boxes[x] = new Box("20x20x20","Basic cubed box", 20, 20, 14, true);
        x++;
        boxes[x] = new Box("20x20x20","Basic cubed box", 20, 20, 12, true);
        x++;
        boxes[x] = new Box("20x20x20","Basic cubed box", 20, 20, 10, true);
        x++;
        boxes[x] = new Box("20x12x12","Basic cubed box", 20, 12, 12, false);
        x++;
        boxes[x] = new Box("20x15x15","Basic cubed box", 20, 15, 15, false);
        x++;
        boxes[x] = new Box("24x24x24","Basic cubed box", 24, 24, 24, false);
        x++;
        boxes[x] = new Box("15x12x10", "Multi-purpose box", 15, 12, 10, false);
        x++;
        boxes[x] = new Box("15x12x10", "Multi-purpose box", 15, 12, 8, true);
        x++;
        boxes[x] = new Box("15x12x10", "Multi-purpose box", 15, 12, 6, true);
        x++;
        boxes[x] = new Box("12x12x6","Multi-purpose box", 12, 12, 6, false);
        x++;
        boxes[x] = new Box("12x10x6","Multi-purpose box", 12, 10, 6, false);
        x++;
        boxes[x] = new Box("17x17x8", "Laptop box", 17, 17, 8, false);
        x++;
        boxes[x] = new Box("24x18x18", "Sandle Box", 24, 18, 18, false);
        x++;
        boxes[x] = new Box("24x24x18","Sandle Box", 24, 24, 18, false);
        x++;
        boxes[x] = new Box("20x20x12","Multi-purpose box", 20, 20, 12, false);
        x++;
        boxes[x] = new Box("17x11x8","Multi-purpose box", 17, 11, 8, false);
        x++;
        boxes[x] = new Box("20x12x12","Multi-purpose box", 20, 12, 12, false);
        x++;
        boxes[x] = new Box("6x6x48", "Long Things Box", 48, 6, 6, false);
        x++;
        boxes[x] = new Box("10x10x48","Long Things Box", 48, 10, 10, false);
        x++;
        boxes[x] = new Box("15x15x48","Long Things Box", 48, 15, 15, false);
        x++;
        boxes[x] = new Box("10x10x40", "Lamp box", 40, 10, 10, false);
        x++;
        boxes[x] = new Box("30x24x6","Picture frame box", 30, 24, 6, false);
        x++;
        boxes[x] = new Box("36x8x30","Picture frame box", 36, 8, 30, false);
        x++;
        boxes[x] = new Box("30x30x17","Multi-purpose box", 30, 30, 17, false);
        x++;
        boxes[x] = new Box("30x17x16","Multi-purpose box", 30, 17, 16, false);
        x++;
        boxes[x] = new Box("30x6x24","Picture frame box", 30, 24, 6, false);
        x++;
        boxes[x] = new Box("24x6x18","Picture frame box", 24, 18, 6, false);
        x++;
        boxes[x] = new Box("24x10x31","Picture frame box", 31, 24, 10, false);
        x++;
        boxes[x] = new Box("48x6x38","Picture frame box", 48, 38, 6, false);
        x++;
        boxes[x] = new Box("35x5.5x44","Picture frame box", 44, 35, 5.5, false);
        x++;
        boxes[x] = new Box("18x18x28", "dish pack box", 28, 18, 18, false);
        x++;
        boxes[x] = new Box("24x18x39", "wardrobe box", 39, 24, 18, false);
        x++;
        boxes[x] = new Box("20x10x50 (Guitar Box)", "DW box", 50, 20, 10, false);
        x++;
        boxes[x] = new Box("40x8x50 (Picture Frame)", "DW box", 50, 40, 8, false);
        x++;
        boxes[x] = new Box("42x8x60","DW box", 60, 42, 8, false);
        x++;
        //imaginary giant box
        boxes[x] = new Box("N/A", "", 100, 100, 100, false);
        
        //method output
        return boxes;
    }
    
    //this is my magnum opus
    public static Box findBox(double x, double y, double z, Box[] possibleBoxes){
        //imaginary giant box as baseline
        int boxNumber = 65;
        //cycles through all possible boxes
        for(int i = 0 ; i<66 ; i++){
            //checks if item fits all dimensions of a box
            if(possibleBoxes[i].x >= x && possibleBoxes[i].y >= y && possibleBoxes[i].z >= z){
                //checks if it is the smallest avaliable box
                if(possibleBoxes[i].v < possibleBoxes[boxNumber].v){
                    //if its the smallest, selects it
                    boxNumber = i;
                }
            }
        }
        //gives you the box
        return possibleBoxes[boxNumber];
    }

    public static void main(String[] args){
        //calls box array
        Box[] possibleBoxes = GenerateBoxes();
        //detects user input
        Scanner reader = new Scanner(System.in);

        //takes in user input
        System.out.println("Please enter item dimensions in descending order");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("x:");
        //adds 2 inches of leeway to each dimension
        int itemX = Integer.parseInt(reader.nextLine()) + 2;
        System.out.print("y:");
        int itemY = Integer.parseInt(reader.nextLine()) + 2;
        System.out.print("z:");
        int itemZ = Integer.parseInt(reader.nextLine()) + 2;

        reader.close();

        System.out.println("Your item (with 2 inch leeway) is " + itemX + "x" + itemY + "x" + itemZ);

        //finds correct box
        Box winner = findBox(itemX, itemY, itemZ, possibleBoxes);
        //failsafe for edge cases
        if(winner.name == "N/A"){
            System.out.println("We do not have a box this size");
        }
        //final answer
        else{
            System.out.println("The most efficient box is a " + winner.name + " " + winner.type);
            if(winner.cutDown == true){
                System.out.println("This should be cut down to a " + (int)winner.x + "x" + (int)winner.y + "x" + (int)winner.z);
            }
        }
    }
}
