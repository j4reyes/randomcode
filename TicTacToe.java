/*
A program to play tic tac toe with yourself or another 
Creator: Jacov Reyes
Source problem: Random thought


*/import java.util.Scanner;
class TicTacToe{

    public static void main(String[] badoop){
        //All initialization
        Scanner input = new Scanner(System.in);
            String[][] DisplayArray = new String[3][3];
            int isBoardFinished = 0;
            boolean inputCorrect = false; boolean check = false; boolean test = false;
            int horizontal = 0; int vertical = 0; int spot = 0;
            String playerTurn = "O"; String repeat = "";
        //This for loop adds an empty space to the multidimensional array
        while(true){
        for(int j = 0; j<=2;j++){
            for(int k = 0; k<=2;k++){
                DisplayArray[j][k] = " ";
            }
        }
        while(isBoardFinished < 9){
            //Displays the board, is the initial display before everything else
    for(int j = 0;j<=2;j++){
        System.out.printf(" %s | %s | %s  %d%n", DisplayArray[j][0],DisplayArray[j][1],DisplayArray[j][2],j+1);
        if(j<=1){
    System.out.println("-----------");
    }
        else{
    System.out.println(" 1   2   3");
        }
    }
            //Intakes spot to place it at
            System.out.println("Please input your move");
            inputCorrect = false;
            while(inputCorrect == false){
            if(!input.hasNextInt()){
                System.out.println("Not a number, please input again");
                input.next();
            }
            else{
            spot = input.nextInt();
            if(spot <=10){
            System.out.println("Must be a number greater than 10");
            }
            else{
            spot = spot - 11;
            horizontal = spot % 10;
            vertical = spot / 10;
            if(horizontal <=2 && vertical <=2){
                if(DisplayArray[vertical][horizontal]==" "){
                inputCorrect = true;
                }
                else{
                System.out.println("There's already a move there");
                }
            }
            else{
            System.out.println("False input, please input again");
            }
            }
        }
    }
    //Switches between O's and X's
        if(playerTurn.equals("O")){
            DisplayArray[vertical][horizontal] = "O";
            playerTurn = "X";
        }
        else if(playerTurn.equals("X")){
            DisplayArray[vertical][horizontal] = "X";
            playerTurn = "O";
        }

    //Checks for win in columns and rows
    for(int j=0;j<=2;j++){
    if(DisplayArray[j][0].equals(DisplayArray[j][1]) && DisplayArray[j][1].equals(DisplayArray[j][2]) && (DisplayArray[j][0].equals("X")||DisplayArray[j][0].equals("O"))){check = true;}
        }
    for(int j=0;j<=2;j++){
    if(DisplayArray[0][j].equals(DisplayArray[1][j]) && DisplayArray[1][j].equals(DisplayArray[2][j]) && (DisplayArray[0][j].equals("X")||DisplayArray[0][j].equals("O"))){check = true;}
        }
    for(int j=0;j<=2;j++){
    if(DisplayArray[0][0].equals(DisplayArray[1][1]) && DisplayArray[1][1].equals(DisplayArray[2][2]) && (DisplayArray[0][0].equals("X")||DisplayArray[0][0].equals("O"))){check = true;}
        }
    for(int j=0;j<=2;j++){
    if(DisplayArray[0][2].equals(DisplayArray[1][1]) && DisplayArray[1][1].equals(DisplayArray[2][0]) && (DisplayArray[0][2].equals("X")||DisplayArray[0][2].equals("O"))){check = true;}
        }
    if(check == true){
        break;
    }

    isBoardFinished++;
        }
        //Displays the final board with who won
        for(int j = 0;j<=2;j++){
            System.out.printf(" %s | %s | %s  %d%n", DisplayArray[j][0],DisplayArray[j][1],DisplayArray[j][2],j+1);
            if(j<=1){
        System.out.println("-----------");
        }
            else{
        System.out.println(" 1   2   3");
            }
        }
        if(playerTurn.equals("O")){
            DisplayArray[vertical][horizontal] = "O";
            playerTurn = "X";
        }
        else if(playerTurn.equals("X")){
            DisplayArray[vertical][horizontal] = "X";
            playerTurn = "O";
        }
        System.out.printf("The board is finished, %s wins!%n", playerTurn);
        System.out.println("Would you like to play again? Type yes or no.");
        input.nextLine();
        repeat = input.nextLine();
        while(!repeat.equalsIgnoreCase("yes")&&!repeat.equalsIgnoreCase("no")){
            System.out.println("That's not an answer");
            repeat = input.nextLine();
        }
        if(repeat.equalsIgnoreCase("yes")){
            System.out.println("Hello again!");
        }
        else if(repeat.equalsIgnoreCase("no")){
            System.out.println("See you then!");
            break;
        }
    }
}
}