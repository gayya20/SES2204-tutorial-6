import scala.io.StdIn.readInt;
import scala.io.StdIn.readLine;

object CeasarCipher{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    def encryption(): Unit = {

        print("Shift By : ")
        val shift = (readInt() + alphabet.size) % alphabet.size
        val input = readLine("Secret Message: ").toUpperCase() 

        val output = input.map( (ch: Char) => {

            val newCh = alphabet.indexOf(ch)

            if (newCh == -1){
                ch
            }
            else{
                alphabet((newCh + shift) % alphabet.size)
            } 
        })

        println("Encrypted Message :"+ output);
    }

    def decryption(): Unit = {

        print("Shift By : ")
        val shift = (readInt() + alphabet.size) % alphabet.size
        val input = readLine("Secret Message: ").toUpperCase()

        val output = input.map( (ch: Char) => {

            val newCh = alphabet.indexOf(ch)

            if (newCh == -1){
                ch
            }
            else{
                alphabet((newCh - shift) % alphabet.size)
            } 
        })

        println("Decrypted Message :"+ output);
    }

    def main(args: Array[String]) :Unit={

        println("What do you want : ")
        println("\tTo Encrypt => 1 \n\tTo Decrypt => 2")
        print("Enter option:")
        val x: Int = readInt();

        x match
            case 1 => encryption();
            case 2 => decryption(); 
            case _ => println("Invalid entry")

    }


}
