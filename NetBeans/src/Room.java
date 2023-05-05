import java.util.*;

public class Room { //implements ActionListener {
    
    private String roomName;
    private HashMap<Coordinate, Items> object;
    //Buttons[][] space = new Buttons[6][6];
    private String[][] space = new String[6][6];
    private Point simPoint;
    private Point roomPoint;
    private String lastItem;

    //MainGUI frame = new MainGUI();
    //MainGUI frame;
    public Room(String roomName)
    {
        this.roomName = roomName;
        this.object = new HashMap<Coordinate, Items>();
        this.simPoint = new Point(0, 0);
        this.roomPoint = new Point(0,0);
        this.lastItem = null;
        for(int i = 0; i < 6; i++) 
        {
            for(int j = 0; j < 6; j++)
            {
            // space[i][j] = new Buttons(i,j);
            // // button_panel.add(buttons[i]);
            // space[i][j].setBackground(Color.BLACK);
            // //space[i][i].setFocusable(false);
            // space[i][j].setBounds(500 + j * 100, 50 + i * 100, 100, 100);
            // space[i][j].addActionListener(this);
            // // String text = i + "," + j;
            // // buttons[i][j].setText(text);
            // // System.out.println("i = " + i + " j = " + j);
            // // System.out.println(buttons[i][j].getBounds());
            // frame.add(space[i][j]);
                if((simPoint.getY() == i) && (simPoint.getX() == j))
                {
                    this.space[i][j] = "o";
                }
                else
                {
                    this.space[i][j] = " ";
                }
            }
        }

        // frame.setVisible(true);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Point getRoomPoint() {
        return roomPoint;
    }

    public void setRoomPoint(int x, int y) {
        Point newPoint = new Point(x, y);
        this.roomPoint = newPoint;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public HashMap<Coordinate, Items> getObject() {
        return object;
    }

    public void setObject(HashMap<Coordinate, Items> object) {
        this.object = object;
    }

    public Point getSimPoint() {
        return simPoint;
    }

    public void setSimPoint(int x, int y) {
        
        // remove old point
        this.space[this.simPoint.getY()][this.simPoint.getX()] = this.lastItem;

        // create new point
        Point newPoint = new Point(x, y);
        
        // set new point
        this.space[y][x] = "o";
        this.simPoint = newPoint;
    }

    public void setLastItem(String lastItem) {
        if(lastItem.equalsIgnoreCase("Kasur Single"))
        {
            this.lastItem = "KS";
        }
        else if(lastItem.equalsIgnoreCase("Kasur Queen Size"))
        {
            this.lastItem = "KQS";
        }
        else if(lastItem.equalsIgnoreCase("Kasur King Size"))
        {
            this.lastItem = "KKS";
        }
        else if(lastItem.equalsIgnoreCase("Toilet"))
        {
            this.lastItem = "T";
        }
        else if(lastItem.equalsIgnoreCase("Kompor Gas"))
        {
            this.lastItem = "KG";
        }
        else if(lastItem.equalsIgnoreCase("Kompor Listrik"))
        {
            this.lastItem = "KL";
        }
        else if(lastItem.equalsIgnoreCase("Meja dan Kursi"))
        {
            this.lastItem = "MDK";
        }
        else if(lastItem.equalsIgnoreCase("Jam"))
        {
            this.lastItem = "J";
        }
        else if(lastItem.equalsIgnoreCase("HP"))
        {
            this.lastItem = "HP";
        }
        else if(lastItem.equalsIgnoreCase("Sajadah"))
        {
            this.lastItem = "SJ";
        }
        else if(lastItem.equalsIgnoreCase("Sapu"))
        {
            this.lastItem = "S";
        }
        else if(lastItem.equalsIgnoreCase("TV"))
        {
            this.lastItem = "TV";
        }
        else if(lastItem.equalsIgnoreCase("Laptop"))
        {
            this.lastItem = "L";
        }
        else if(lastItem.equalsIgnoreCase("Shower"))
        {
            this.lastItem = "SHO";
        }
        
    }

    public String getLastItem() {
        return lastItem;
    }

    public Boolean placeObject(Items object) throws Exception
    {
        Scanner input = new Scanner(System.in);
        printSpace();
        System.out.print("\n");
        System.out.println("Dimensi Objek : " + object.getX() + " x " + object.getY());
        System.out.print("\n");
        
        System.out.println("Masukan koordinat x1: ");
        int x1 = input.nextInt();

        // memasukan Koordinat awal benda
        System.out.println("Masukan koordinat y1: ");
        int y1 = input.nextInt();

        // Menghilangkan \n yang tidak terbaca
        input.nextLine();

        // Memasukan Arah Benda
        System.out.println("Masukan arah: ");
        String direction = input.nextLine();

        // Cek apakah Arah benda yang dimasukan sudah benar
        while(!(direction.equalsIgnoreCase("Right") || direction.equalsIgnoreCase("Left") || direction.equalsIgnoreCase("Up") || direction.equalsIgnoreCase("Down")))
        {
            System.out.println("Arah yang diberikan Salah! (Right, Left, Up, Down)");
            System.out.println("Masukan arah: ");
            direction = input.nextLine();
        }
        Coordinate coordinate = new Coordinate(0, 0, 0, 0);

        // persegi panjang orientasi kanan
        if(object.getX() >= object.getY())
        {
            // Orientasi Kanan
            if(direction.equalsIgnoreCase("Right"))
            {
                int x2 = x1 + object.getX();
                int y2 = y1 + object.getY();
                coordinate = new Coordinate(x1, y1, x2, y2);
            }

            // Orientasi Kiri
            else if(direction.equalsIgnoreCase("Left"))
            {
                int x2 = x1 + 1;
                int y2 = y1 + object.getY();
                x1 = x2 - object.getX();
                coordinate = new Coordinate(x1, y1, x2, y2);
            }

            // Orientasi atas
            else if(direction.equalsIgnoreCase("Up"))
            {
                int x2 = x1 + object.getY();
                int y2 = y1 + 1;
                y1 = y2 - object.getX();
                coordinate = new Coordinate(x1, y1, x2, y2);
                //System.out.println(coordinate.getX1() + " " + coordinate.getY1() + " " + coordinate.getX2() + " " + coordinate.getY2());
            }

            // Orientasi bawah
            else if(direction.equalsIgnoreCase("Down"))
            {
                int x2 = x1 + object.getY();
                int y2 = y1 + object.getX();
                coordinate = new Coordinate(x1, y1, x2, y2);
            }
        }

        else if(object.getX() < object.getY())
        {
             // Orientasi Kanan
             if(direction.equalsIgnoreCase("Right"))
             {
                 int x2 = x1 + object.getY();
                 int y2 = y1 + object.getX();
                 coordinate = new Coordinate(x1, y1, x2, y2);
             }
 
             // Orientasi Kiri
             else if(direction.equalsIgnoreCase("Left"))
             {
                 int x2 = x1 + 1;
                 int y2 = y1 + object.getX();
                 x1 = x2 - object.getY(); 
                 coordinate = new Coordinate(x1, y1, x2, y2);
             }
 
             // Orientasi atas
             else if(direction.equalsIgnoreCase("Up"))
             {
                 int x2 = x1 + object.getX();
                 int y2 = y1 + 1;
                 y1 = y2 - object.getY();
                 coordinate = new Coordinate(x1, y1, x2, y2);
                 //System.out.println(coordinate.getX1() + " " + coordinate.getY1() + " " + coordinate.getX2() + " " + coordinate.getY2());
             }
 
             // Orientasi bawah
             else if(direction.equalsIgnoreCase("Down"))
             {
                 int x2 = x1 + object.getX();
                 int y2 = y1 + object.getY();
                 coordinate = new Coordinate(x1, y1, x2, y2);
             }
        }

        if(checkAvailableSpace(coordinate))
        {
            this.object.put(coordinate, object);
            System.out.println(coordinate.getX1() + " " + coordinate.getY1() + " " + coordinate.getX2() + " " + coordinate.getY2());
            String value = object.getName();
            String initial = "";

            // Check Object and create initial

            if(value.equalsIgnoreCase("Kasur Single"))
            {
                initial = "KS";
            }
            else if(value.equalsIgnoreCase("Kasur Queen Size"))
            {
                initial = "KQS";
            }
            else if(value.equalsIgnoreCase("Kasur King Size"))
            {
                initial = "KKS";
            }
            else if(value.equalsIgnoreCase("Toilet"))
            {
                initial = "T";
            }
            else if(value.equalsIgnoreCase("Kompor Gas"))
            {
                initial = "KG";
            }
            else if(value.equalsIgnoreCase("Kompor Listrik"))
            {
                initial = "KL";
            }
            else if(value.equalsIgnoreCase("Meja dan Kursi"))
            {
                initial = "MDK";
            }
            else if(value.equalsIgnoreCase("Jam"))
            {
                initial = "J";
            }
            else if(value.equalsIgnoreCase("HP"))
            {
                initial = "HP";
            }
            else if(value.equalsIgnoreCase("Sajadah"))
            {
                initial = "SJ";
            }
            else if(value.equalsIgnoreCase("Sapu"))
            {
                initial = "S";
            }
            else if(value.equalsIgnoreCase("TV"))
            {
                initial = "TV";
            }
            else if(value.equalsIgnoreCase("Laptop"))
            {
                initial = "L";
            }
            else if(value.equalsIgnoreCase("Shower"))
            {
                initial = "SHO";
            }

            // Input to Matriks
            for(int i = coordinate.getY1(); i < coordinate.getY2(); i++)
            {
                //System.out.println(i);
                for(int j = coordinate.getX1(); j < coordinate.getX2(); j++)
                {
                    //System.out.println(i + " , " + j);
                    //String value = object.getName();
                    
                    if((simPoint.getY() == i) && (simPoint.getX() == j))
                    {
                        this.space[i][j] = "o";
                        if(lastItem == "")
                        {
                            lastItem = initial;
                        } 
                    }
                    else
                    {
                        this.space[i][j] = initial;
                    }

                    // space[i][j].setBackground(color);
                    // space[i][j].setText(name);
                    // space[i][j].setForeground(foregColor);
                    // space[i][j].setIsOccupied(true);
                }
            }

            // Check if lastItem = null
            System.out.println("Berhasil memasukkan " + object.getName());
            return true;
        }
        else
        {
            System.out.println(coordinate.getX1() + " " + coordinate.getY1() + " " + coordinate.getX2() + " " + coordinate.getY2());
            System.out.println("Tidak ada ruang untuk " + object.getName());
            return false;
        }
    }

    public Boolean checkAvailableSpace(Coordinate coordinate)
    {
        // Cek apakah Coordinatenya minus
        if (coordinate.getX1() < 0 || coordinate.getX2() < 0 || coordinate.getY1() < 0 || coordinate.getY2() < 0)
        {
            return false;
        }

        // Cek apakah Coordinatenya lebih dari index
        else if(coordinate.getX1() > 6 || coordinate.getX2() > 6 || coordinate.getY1() > 6 || coordinate.getY2() > 6)
        {
            return false;
        }

        // Aman
        else
        {
            for(int i = coordinate.getY1(); i < coordinate.getY2(); i++)
            {
                for(int j = coordinate.getX1(); j < coordinate.getX2(); j++)
                {
                    if(!this.space[i][j].equalsIgnoreCase(" ") && !this.space[i][j].equalsIgnoreCase("o"))
                    {
                        //System.out.println("Masuk Sini");
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public void printSpace()
    {
        for(int i = 1 ; i <= 13 ; i++)
        {
            if(i%2 == 1)
            {
                printline();
            }
            else
            {
                int k = 0;
                
                for(int j = 0 ; j < 25 ; j++)
                {
                    if(j%4 == 0)
                    {
                        System.out.print("|");
                    }
                    else if(j%4 == 1)
                    {
                        String value = space[i/2 - 1][k];

                        if(value.length() == 3)
                        {
                            System.out.print(value);
                        }
                        else if(value.length() == 2)
                        {
                            System.out.print(value + " ");
                        }
                        else if(value.length() == 1 && (!value.equals("X")))
                        {
                            System.out.print(" " + value + " ");
                        }
                        else
                        {
                            System.out.print("   ");
                        }
                        k++;
                    }
                }
            }
            System.out.println("\n");
        }
    }

    public static void printline()
    {
        char ascii = ' ';
        for(int i =  0 ; i < 25 ; i++){
            if(i == 0 | i == 24 | i%4 == 0)
            {
                ascii = '+';
                System.out.print(ascii);
            }
            else
            {
                ascii = '-';
                System.out.print(ascii);
            }
        }
    }

    public void moveObject(Items object , Coordinate kordinat) throws Exception
    {
        removeFromRoom(object , kordinat);
        Boolean isPlaced = placeObject(object);
        while(!isPlaced)
        {
            isPlaced = placeObject(object);
        }
    }

    public void removeFromRoom(Items Object , Coordinate kordinat)
    {
        Coordinate coordinate = kordinat;
        for(int i = coordinate.getY1(); i < coordinate.getY2(); i++)
            {
                //System.out.println(i);
                for(int j = coordinate.getX1(); j < coordinate.getX2(); j++)
                {
                    
                    this.space[i][j] = " ";
                }
            }
    }

    public void kamusItems()
    {
        System.out.println("Kamus Items : ");
        System.out.println("1. KS : Kasur Single");
        System.out.println("2. KQS : Kasur Queen Size");
        System.out.println("3. KKS : Kasur King Size");
        System.out.println("4. T : Toilet");
        System.out.println("5. KG : Kompor Gas");
        System.out.println("6. KL : Kompor Listrik");
        System.out.println("7. MDK : Meja dan Kursi");
        System.out.println("8. J : Jam");
        System.out.println("9. HP : HP");
        System.out.println("10. SJ : Sajadah");
        System.out.println("11. S : Sapu");
        System.out.println("12. TV : TV");
        System.out.println("13. L : Laptop");
        System.out.println("14. SHO : Shower");
    }


    // public void actionPerformed(ActionEvent e)
    // {   
    //     System.out.println("actionPlaceFurniture = " + frame.getActionPlaceFurniture());
    //     if(frame.getActionPlaceFurniture())
    //     {
    //         for(int i= 0 ; i < 6 ; i++)
    //         {
    //             for(int j = 0 ; j < 6 ; j++)
    //             {
    //                 if(e.getSource() == space[i][j])
    //                 {

    //                     javax.swing.JComboBox<String> Furniture = frame.getFurniture();
    //                     String benda = Furniture.getSelectedItem().toString();

    //                     javax.swing.JComboBox<String> Direction = frame.getDirection();
    //                     String direction = Direction.getSelectedItem().toString();

    //                     int x1 = j;
    //                     int y1 = i;
    //                     Items object = null;
    //                     Color color = null;
    //                     Color foregColor = null;
    //                     if(benda.equals("Kasur Single"))
    //                     {
    //                         object = new Items("Kasur Single");
    //                         color = Color.RED;
    //                         foregColor = Color.BLACK;
    //                     }
    //                     else if(benda.equals("Kasur Queen Size"))
    //                     {
    //                         object = new Items("Kasur Queen Size");
    //                         color = Color.RED;
    //                         foregColor = Color.BLACK;
    //                     }
    //                     else if(benda.equals("Kasur King Size"))
    //                     {
    //                         object = new Items("Kasur King Size");
    //                         color = Color.RED;
    //                         foregColor = Color.BLACK;
    //                     }
    //                     else if(benda.equals("Toilet"))
    //                     {
    //                         object = new Items("Toilet");
    //                         color = Color.BLUE;
    //                         foregColor = Color.WHITE;
    //                     }
    //                     else if(benda.equals("Kompor Gas"))
    //                     {
    //                         object = new Items("Kompor Gas");
    //                         color = Color.BLACK;
    //                         foregColor = Color.WHITE;
    //                     }
    //                     else if(benda.equals("Kompor Listrik"))
    //                     {
    //                         object = new Items("Kompor Listrik");
    //                         color = Color.BLACK;
    //                         foregColor = Color.WHITE;
    //                     }
    //                     else if(benda.equals("Meja dan Kursi"))
    //                     {
    //                         object = new Items("Meja dan Kursi");
    //                         color = new Color(150,75,00);
    //                         foregColor = Color.WHITE;
    //                     }
    //                     else if(benda.equals("Jam"))
    //                     {
    //                         object = new Items("Jam");
    //                         color = new Color(93,156,89);
    //                         foregColor = Color.WHITE;
    //                     }

    //                     placeObject(object , x1 , y1 , direction , color , foregColor , object.getName());

    //                 }
                        
                       
    //             }
    //         }
    //     }
    // }

    public static void main(String[] args) throws Exception
    {
        // MainGUI mainGUI = new MainGUI(); // Create an instance of MainGUI
        // Room room = new Room(null);
        Room room = new Room("Room 1");

        Items objek1 = new Items("Kasur Single");
        //System.out.println("Insert Bed");
        room.placeObject(objek1);

        room.printSpace();
        
        // Create an instance of MainGUI
       

        // Pass mainGUI as an argument to the Room constructor
        //Room room = new Room(mainGUI);

    }
       
}