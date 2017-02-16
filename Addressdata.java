//********************************************************************
//  StudentBody.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an aggregate class.
//********************************************************************

public class Addressdata
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {


      // Address [] contacts = new Address [10];
        Address school = new Address ("800 Lancaster Ave.", "Villanova","PA", 19085);
        Address rHome = new Address ("4 Privet Drive", "Lynchburg","OH",60123);
        Address mHome = new Address ("1203 Main Street", "Euclid", "OH",60156);
        Address ken   = new Address ("915 Elm Street", "Homewood", "IL", 60424);
        Address dj   = new Address ("915 Maple Ave", "Homewood", "IL", 60518);
        Address Homes   = new Address ("221 B Baker Street", "London", "UK", 60518);
        Address Bob   = new Address ("124 Conch Street", "Bikini Bottom", "US", 61245);
        Address Ned   = new Address ("740 Evergreen Terrace", "Springfield", "US", 78204);
        Address Ed   = new Address ("9764 Jeopardy Lane","Chicago", "IL", 60678);


       Address [] contacts = {school,rHome,mHome,ken, dj, Homes,Bob,Ned,Ed};
       for (Address me : contacts){
        System.out.println(me.hash());
        System.out.print("-"+((int)(me.hash())%30)+"\n");
        }
//         System.out.println("\n\n");
//          for (int i = 0; i<contacts.length;i++){
//           System.out.println(contacts[i].hash());
//         
//         }


        Address [] hasha = new Address[contacts.length*4];
        for (int i = 0; i<contacts.length;i++){
        
           // hasha[i*2] = contacts[i];
            hasha[contacts[i].hash()%30] = contacts[i];
        
        }
        
        for (Address me2 : hasha){
        System.out.println(me2);
        
        }
       //Sort the Addresses

       
       //take given data to get hash number
       String hash1 = contacts[3].toString();

        int hash2 = 0;
       for( int i = 0; i<hash1.length();i++)
       {
            hash2 += hash1.charAt(i);
        }

       
        





   }
}
