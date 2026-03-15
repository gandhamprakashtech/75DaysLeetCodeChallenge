class Solution {
  public List<Integer> findDisappearedNumbers(int[] numss) {
    List<Integer> ans = new ArrayList<>();

    for (final int num : numss) {
      final int index = Math.abs(num) - 1;
      numss[index] = -Math.abs(numss[index]);
    }

    for (int i = 0; i < numss.length; ++i)
      if (numss[i] > 0)
        ans.add(i + 1);

    return ans;
  }
}