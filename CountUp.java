/*
Name:ReverseList
Purpose: Reads in a amount of names and reverse them
Author: Evan Kwak
Date: 2019-11-22
*/

import java.io.*;

public class CountUp
{

    public static void main (String[] args) throws IOException
    {
	BufferedReader kbInput = new BufferedReader (
		new InputStreamReader (System.in));

	//ask for number of names
	System.out.print ("How large is the list? ");
	int count = Integer.parseInt (kbInput.readLine ());
	if (count > 0)
	{
	    String[] names = new String [count];

	    int index = 0;
	    //insert names
	    for (int plusName = 0 ; plusName < count ; plusName++)

		{
		    System.out.println ("Enter the items: ");

			    names [plusName] = (kbInput.readLine ());
		}
	    //display names backwards
	    for (int minusName = count ; minusName >= 1 ; minusName--)
	    {
		System.out.println (names [minusName - 1]);
	    }
	}

	else
	{
	    System.err.println ("please input a higher then 0 number");
	}

    }
}



