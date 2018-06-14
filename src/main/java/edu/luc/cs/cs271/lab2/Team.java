package edu.luc.cs.cs271.lab2;
import java.util.Scanner;
import java.lang.String;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;
  String name1 = "USA";


  /** The team's head coach. */
  private String headcoach;
  String headCoach = "Klinsmann";

  /** The team's monetary funding level in thousands of US$. */
  private int funding;
  int funding1 = 500;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
    }
    // TODO validity checking for headcoach
    // TODO validity checking for funding
    this.name = name;
    // TODO complete this constructor
  }

  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {

    // TODO complete this method
    return null;
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // TODO complete this method

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the team name(by country)to pursue searches \n" +
            "for that team");


    ;
    int key = keyboard.nextInt();
    if(key <= 500) {
      System.out.println("USA IS in range of the funding");
    }else{
      System.out.println("USA in NOT in range");
    }
    return -1;
  }
}
