/**
* 
* @author: Amir Armion 
* 
* @version: V.01
* 
*/
public class ImprovmentForFindingGene 
{

    public void findGene(String dna)
    {
        int startCodon = dna.indexOf("ATG");
        int stopCodon  = dna.indexOf("TAA", startCodon + 3);

        while(stopCodon != -1)
        {
            if((stopCodon - startCodon) % 3 == 0)
            {
                System.out.println("Gene is: " + dna.substring(startCodon + 3, stopCodon));
                stopCodon = -1;
            }
            else
            {
                stopCodon = dna.indexOf("TAA", stopCodon + 1);

                if(stopCodon == -1)
                {
                    System.out.println("No gene found!");
                } 
            }
        }
    }
}
