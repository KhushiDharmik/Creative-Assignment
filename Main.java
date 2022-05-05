import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
public class Main {  
    private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException    {  
       do{        
        System.out.print("========= Welcome Beyblade Shop ============ \n");  
        System.out.print("            1. Attack Type    \n");  
        System.out.print("            2. Attack Type with better forge disc.   \n"); 
        System.out.print("            3. Attack Type with better performance tip.         \n");
        System.out.print("            4. Defense Type    \n");  
        System.out.print("            5. Defense Type with better forge disc.\n"); 
        System.out.print("            6. Defense Type with better performance tip.        \n");
        System.out.print("            7. Stamina Type    \n");  
        System.out.print("            8. Stamina Type with better forge disc.\n"); 
        System.out.print("            9. Stamina Type with better performance tip.        \n");
        System.out.print("            10. Balance Type    \n"); 
        System.out.print("            11. Balance Type with better forge disc.\n");  
        System.out.print("            12. Balance Type with better performance tip.        \n");
        System.out.print("            13. Exit.        \n");  
        System.out.print("Enter your choice: ");  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        choice=Integer.parseInt(br.readLine());  
        switch (choice) {  
        case 1:{   
                 AttackType at=new AttackType();  
              System.out.println(at.description());  
              System.out.println(at.cost());  
              System.out.println("LET IT RIP!!!!");  
            }  
            break;  
              
                case 2:{  
                Beyblade b1=new ForgeDisc((Beyblade) new AttackType());  
                    System.out.println(b1.description());  
                System.out.println( b1.cost());
                System.out.println("LET IT RIP!!!!");  
        }  
            break;
                
     case 3:{  
             Beyblade b2=new PerformanceTip((Beyblade) new AttackType());  
                     System.out.println(b2.description());  
                    System.out.println( b2.cost()); 
                    System.out.println("LET IT RIP!!!!");  
              }  
            break;    
            case 4:{   
                 DefenseType dt=new DefenseType();  
              System.out.println(dt.description());  
              System.out.println(dt.cost());  
              System.out.println("LET IT RIP!!!!");  
            }  
            break;  
    case 5:{  
             Beyblade b3=new ForgeDisc((Beyblade) new DefenseType());  
                     System.out.println(b3.description());  
                    System.out.println( b3.cost());
                    System.out.println("LET IT RIP!!!!");  
              }  
            break; 
    case 6:{  
             Beyblade b4=new PerformanceTip((Beyblade) new DefenseType());  
                     System.out.println(b4.description());  
                    System.out.println( b4.cost()); 
                    System.out.println("LET IT RIP!!!!");
    }
            break;
            case 7:{   
                 StaminaType at=new StaminaType();  
              System.out.println(at.description());  
              System.out.println(at.cost());  
              System.out.println("LET IT RIP!!!!");  
            }  
            break;  
    case 8:{  
             Beyblade b5=new ForgeDisc((Beyblade) new StaminaType());  
                     System.out.println(b5.description());  
                    System.out.println( b5.cost()); 
                    System.out.println("LET IT RIP!!!!");  
    }   
            break; 
    case 9:{  
             Beyblade b6=new PerformanceTip((Beyblade) new StaminaType());  
                     System.out.println(b6.description());  
                    System.out.println( b6.cost()); 
                    System.out.println("LET IT RIP!!!!");  
    }
            break; 
            case 10:{   
                 BalanceType at=new BalanceType();  
              System.out.println(at.description());  
              System.out.println(at.cost());  
              System.out.println("LET IT RIP!!!!");  
            }  
            break;  
    case 11:{  
             Beyblade b7=new ForgeDisc((Beyblade) new BalanceType());  
                     System.out.println(b7.description());  
                    System.out.println( b7.cost()); 
                    System.out.println("LET IT RIP!!!!");  
    }
            break; 
    case 12:{  
             Beyblade b8=new PerformanceTip((Beyblade) new BalanceType());  
                     System.out.println(b8.description());  
                    System.out.println( b8.cost()); 
                   System.out.println("LET IT RIP!!!!");  
    }
            break; 
              
         default:{    
            System.out.println("Other than these no options available");  
        }         
    return;  
     }//end of switch  
          
}while(choice!=4);  
    }  
}
