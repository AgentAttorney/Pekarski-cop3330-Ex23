package Ex23;
import java.util.Scanner;

import static java.lang.System.exit;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example23 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Car silent? Y or N. ");
        String silent = input.next();
        if(silent.equals("Y")) {
            System.out.print("Are batteries corroded? ");
            String corroded = input.next();
            if (corroded.equals("Y")) {
                System.out.print("Clean the terminals. ");
                exit(0);
            } else if (corroded.equals("N")) {
                System.out.print("Replace the cables. ");
                exit(0);
            }
        }
        else if (silent.equals("N"))
        {
            System.out.print("Does car make slicking noise? ");
            String slick = input.next();
            if(slick.equals("Y"))
            {
                System.out.print("Replace the battery. ");
                exit(0);
            }
            else if(slick.equals("N"))
            {
                System.out.print("Does the car crank but not start? ");
                String crank = input.next();
                if(crank.equals("Y"))
                {
                    System.out.print("Check the spark plug connections. ");
                    exit(0);
                }
                else if(crank.equals("N"))
                {
                    System.out.print("Does the engine die abruptly when starting? ");
                    String die = input.next();
                    if(die.equals("Y")) {
                        System.out.print("Does your car have fuel injection? ");
                        String inject_fuel = input.next();
                        if (inject_fuel.equals("Y")) {
                            System.out.print("Get it in for service, scrooge.");
                            exit(0);
                        } else if (inject_fuel.equals("N")) {
                            System.out.print("Make sure the choke closes and opens right.");
                            exit(0);
                        }
                    }
                    else if(die.equals("N"))
                    {
                        System.out.print("Impossible. Perhaps the archives are incomplete.");
                        exit(0);
                    }
                    }
                }
            }
        }
        }

