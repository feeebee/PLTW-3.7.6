import java.util.ArrayList;
public class SortingAlgorithms {
      /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  //ArrayList <Integer> intThing = new ArrayList<Integer>();

  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
  for (int i = 0; i < intList.size()-1; i++){
    int minIndex= i;
    for(int searchIndex = i+1; searchIndex<intList.size(); searchIndex++){
      if(intList.get(searchIndex)< intList.get(minIndex)){
        minIndex = searchIndex;
      }
      int temp = intList.get(i);
      int min = intList.get(minIndex);
      intList.set(i, min);
      intList.set(minIndex, temp);
    }
  }
  return intList;
}
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
/**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  for(int i =1; i<intList.size(); i++ ){
    int toSort = intList.get(i);
    int prevIndex = i-1;
    while (prevIndex >= 0)  
    {
      // Create an int variable to hold the sorted value. 
      int sortedValue = intList.get(prevIndex);
      
      // Check if the sorted value is greater than the value to sort
      if (sortedValue > toSort) 
      {
        // If so, switch the values at indexes prevIndex and prevIndex + 1
        intList.set(prevIndex + 1, sortedValue);
        intList.set(prevIndex, toSort); 
      }
      prevIndex--;
    }
  }
  
  return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    for (int i = 0; i < doubleList.size()-1; i++){
      int minIndex= i;
      for(int searchIndex = i+1; searchIndex<doubleList.size(); searchIndex++){
        if(doubleList.get(searchIndex)< doubleList.get(minIndex)){
          minIndex = searchIndex;
        }
        double temp = doubleList.get(i);
        double min = doubleList.get(minIndex);
        doubleList.set(i, min);
        doubleList.set(minIndex, temp);
      }
    }
    
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    for(int i =1; i<doubleList.size(); i++ ){
      double toSort = doubleList.get(i);
      int prevIndex = i-1;
      while (prevIndex >= 0)  
      {
        // Create an int variable to hold the sorted value. 
        double sortedValue = doubleList.get(prevIndex);
        
        // Check if the sorted value is greater than the value to sort
        if (sortedValue > toSort) 
        {
          // If so, switch the values at indexes prevIndex and prevIndex + 1
          doubleList.set(prevIndex + 1, sortedValue);
          doubleList.set(prevIndex, toSort); 
        }
        prevIndex--;
      }
    }
    
    return doubleList;
  }
}
