package permute;

import triangle.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 This program tests the permutation generator.
 */
public class PermutationTester
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("e");
        list.add("a");
        list.add("t");
        PermutationGenerator<String> generator = new PermutationGenerator<String>(list);
        ArrayList<List<String>> permutations = generator.getPermutations();
        System.out.println(permutations.get(0));
        System.out.println("Expected: [e, a, t]");
        System.out.println(permutations.get(1));
        System.out.println("Expected: [e, t, a]");
        System.out.println(permutations.get(2));
        System.out.println("Expected: [a, e, t]");
        System.out.println(permutations.get(3));
        System.out.println(permutations.get(4));
        System.out.println(permutations.get(5));
        System.out.println(permutations.size());
        System.out.println("Expected: 6");

        ArrayList<Triangle> tList = new ArrayList<Triangle>();
        tList.add(new Triangle(12));
        tList.add(new Triangle(16));
        tList.add(new Triangle(24));
        PermutationGenerator<Triangle> tGenerator = new PermutationGenerator<Triangle>(tList);
        ArrayList<List<Triangle>> tPermutations = tGenerator.getPermutations();
        System.out.println(tPermutations.get(0));
        System.out.println(tPermutations.get(1));
        System.out.println(tPermutations.get(2));
        System.out.println(tPermutations.get(3));
        System.out.println(tPermutations.get(4));
        System.out.println(tPermutations.get(5));

    }
}