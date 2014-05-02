package permute;

import java.util.ArrayList;
import java.util.List;

/**
 This program tests the permutation generator.
 */
public class PermutationTester_TwoElement
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("e");
        list.add("a");
//        list.add("t");
        PermutationGenerator<String> generator = new PermutationGenerator<String>(list);
        ArrayList<List<String>> permutations = generator.getPermutations();
        System.out.println(permutations.get(0));
        System.out.println("Expected: [e,a]");
        System.out.println(permutations.get(1));
        System.out.println("Expected: [a,e]");
        System.out.println(permutations.size());
        System.out.println("Expected: 2");
    }
}