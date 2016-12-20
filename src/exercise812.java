/**
 * Created by Praktika on 20.12.2016.
 */
public class exercise812 {
 public static void main(String[] args) {
int[] scores = {1, 2};
histogram(scores);
 }
 public static int[] histogram(int[] scores) {
  int[] counts = new int[100];
  for (int score : scores) {
   counts[score]++;
     }
     return scores;
   }
 }