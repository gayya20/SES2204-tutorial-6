import scala.io.StdIn.readInt;
import scala.io.StdIn.readLine;

object CeasarCipher{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 

    def encryption(a: Int): Unit = { 
        
        print("Shift By: ")

        val shift = (readInt()*a + alphabet.size) % alphabet.size  
         
        val inputText =readLine("Secret Message: ").toUpperCase() 

        val outputText = inputText.map( (c: Char) => { 
 
            val x = alphabet.indexOf(c)

            //If the c char is in our alphabet then we encrypt it 
            //If it is not then we leave it be.
            if (x == -1){
                c
            }
            else{
                alphabet((x + shift) % alphabet.size)
                } 
        });
 
        println("Message :"+outputText);

    } 
    def main(args: Array[String]) :Unit={

        println("  1  Encryption \n  2  Decryption ")
        
        print("Enter option:")
        val x: Int = readInt();
        x match
            case 1 => encryption(1);
            case 2 => encryption(-1); 
            case _ => println("Invalid entry")

    }
}