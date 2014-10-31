/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jplayground;

/**
 *
 * @author georgvogiatzis
 */
public class LateConstant
{
  public static final int     HUBBLE;
  public        final String  ISBN;

  static
  {
    HUBBLE = new java.util.Scanner(
      LateConstant.class.getResourceAsStream("hubble-constant.txt")).nextInt();
  }

  public LateConstant()
  {
    ISBN = "3572100100";
  }

  public static void main( String[] args )
  {
    System.out.println( HUBBLE );                      // 77
    System.out.println( new LateConstant().ISBN );     // 3572100100
  }
}