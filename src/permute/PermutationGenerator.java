package permute;

import java.util.ArrayList;
import java.util.List;

/**
   This class generates permutations of a word.
*/
public class PermutationGenerator<E>
{
   private List<E> input;
  
	/**
      Constructs a permutation generator.
      @param input the word to permute
   */
   public PermutationGenerator(List<E> input)
   {
      this.input = input;
   }

   /**
      Gets all permutations of a given word.
   */
   public ArrayList<List<E>> getPermutations()
   {

  	 ArrayList<List<E>> result = new ArrayList<List<E>>();

       //Empty list, -> return Empty ArrayList
       if(input.size() == 0){
           return result;
       }

      // Single Element in List -> add to result and return
      if (input.size() == 1)
      {
         result.add(input);
         return result;
      }

      // Loop through all elements
      for (int i = 0; i < input.size(); i++)
      {
          //Create a new ArrayList from Element i+1 - size
          List<E> shorterList = new ArrayList<E>();

          for (int j = 0; j < i; j++){
              shorterList.add(input.get(j));
          }

          for (int j = i+1; j < input.size(); j++){
              shorterList.add(input.get(j));
          }

         // Generate all permutations of the shorterList word
         PermutationGenerator<E> shorterPermutationGenerator = new PermutationGenerator<E>(shorterList);
         ArrayList<List<E>> shorterListPermutations = shorterPermutationGenerator.getPermutations();

        // Add the removed element to the front of each permutation of the shorter list
         for (List<E> s : shorterListPermutations)
         {
            s.add(0, input.get(i));
            result.add(s);
         }
      }
      // Return all permutations
      return result;
   }

}
