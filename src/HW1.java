 
public class HW1 {
    public static void main(String[] args) {
      System.out.print("         size       Merge      Quick        Selection        Bubble ");
      for (int i = 60000; i <= 360000; i += 60000) {
        start(i);
      }
    }
    public static void start(int length) {
      int[] list = new int[length];
      int spacing = 12;
      for (int i = 0; i < list.length; i++) {
        list[i] = (int)(Math.random() * 1000000);
      }
      System.out.print("\n");
      System.out.printf("\n%" + spacing + "d", length);
      int[] list2 = new int[length];
      System.arraycopy(list, 0, list2, 0, list.length);
      long startTime = System.currentTimeMillis();
      Merge(list2);
      long endTime = System.currentTimeMillis();
      long executionTime = endTime - startTime;
      System.out.printf("%" + spacing + "d", executionTime);
      list2 = new int[length];
      System.arraycopy(list, 0, list2, 0, list.length);
      startTime = System.currentTimeMillis();
      Quick(list2);
      endTime  = System.currentTimeMillis();
      executionTime = endTime  - startTime;
      System.out.printf("%" + spacing + "d", executionTime);
      list2 = new int[length];
      System.arraycopy(list, 0, list2, 0, list.length);
      startTime = System.currentTimeMillis();
      selection(list2);
      endTime  = System.currentTimeMillis();
      executionTime = endTime  - startTime;
      System.out.printf("%" + spacing + "d", executionTime);
      list2 = new int[length];
      System.arraycopy(list, 0, list2, 0, list.length);
      startTime = System.currentTimeMillis();
      Bubble(list2);
      endTime  = System.currentTimeMillis();
      executionTime = endTime  - startTime;
      System.out.printf("%" + spacing + "d", executionTime);
    }

    public static void Merge(int[] list) {
      if (list.length > 1) {
        int[] listHalf = new int[list.length / 2];
        System.arraycopy(list, 0, listHalf, 0, list.length / 2);
        Merge(listHalf);
        int semiLength = list.length - list.length / 2;
        int[] semilist = new int[semiLength];
        System.arraycopy(list, list.length / 2, semilist, 0,
            semiLength);
        Merge(listHalf, semilist, list);
      }
    }
  
    public static void Merge(int[] list1, int[] list2, int[] temporary) {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;
      while (var1 < list1.length && var2 < list2.length) {
        if (list1[var1] < list2[var2])
          temporary[var3++] = list1[var1++];
        else
          temporary[var3++] = list2[var2++];
      }
      while (var1 < list1.length)
        temporary[var3++] = list1[var1++];
  
      while (var2 < list2.length)
        temporary[var3++] = list2[var2++];
    }

    public static void Quick(int[] list) {
      Quick(list, 0, list.length - 1);
    }
  
    private static void Quick(int[] list, int first, int last) {
      if (last > first ) {
        int LastDetector = partof(list, first, last);
        Quick(list, first, LastDetector - 1);
        Quick(list, LastDetector + 1, last);
      }
    }
  
    private static int partof(int[] list, int fina, int last) {
      int detector = list[fina];
      int lower = fina + 1;
      int higher = last ;
      while (higher > lower) {
        while (lower <= higher && list[lower] <= detector)
          lower++;
        while (lower <= higher && list[higher] > detector)
        higher--;
        if (higher > lower) {
          int temporary = list[higher];
          list[higher] = list[lower];
          list[lower] = temporary;
        }
      }
  
      while (higher > fina && list[higher] >= detector)
        higher--;
      if (detector > list[higher]) {
        list[fina] = list[higher];
        list[higher] = detector;
        return higher;
      } else {
        return fina;
      }
    }
  
    public static void selection(int[] list) {
      for (int i = 0; i < list.length - 1; i++) {
        int min = list[i];
        int minIndex = i;
        for (int j = i + 1; j < list.length; j++) {
          if (min > list[j]) {
            min = list[j];
            minIndex = j;
          }
        }
        if (minIndex != i) {
          list[minIndex] = list[i];
          list[i] = min;
        }
      }
    }
  
    public static void Bubble(int[] list) {
      boolean keep = true;
      for (int i = 1; i < list.length && keep; i++) {
        keep = false;
        for (int j = 0; j < list.length - i; j++) {
          if (list[j] > list[j + 1]) {
            int temp = list[j];
            list[j] = list[j + 1];
            list[j + 1] = temp;
            keep = true;
          }
        }
      }
    }}       
  