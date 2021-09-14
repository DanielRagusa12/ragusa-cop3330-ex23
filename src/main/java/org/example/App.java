package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String answer;
        int third;
        int biggest_num=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        answer = input.next();

        if(answer.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            answer = input.next();

            if(answer.equals("y"))
            {
                System.out.print("Clean terminals and try starting again.");
                System.exit(0);
            }
            else
            {
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }

        }
        else if(answer.equals("n"))
        {
            System.out.print("Does the car make a slicking noise? ");
            answer = input.next();

            if(answer.equals("y"))
            {
                System.out.print("Replace the battery.");
                System.exit(0);
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                answer = input.next();
                if(answer.equals("y"))
                {
                    System.out.print("Check spark plug connections.");
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    answer = input.next();
                    if(answer.equals("y"))
                    {
                        System.out.print("Does you car have fuel injection? ");
                        answer = input.next();
                        if(answer.equals("y"))
                        {
                            System.out.print("Get it in for service.");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.print("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }

                    }
                    else
                    {
                        System.out.print("This should not be possible.");
                        System.exit(0);
                    }
                }

            }

        }



    }

}