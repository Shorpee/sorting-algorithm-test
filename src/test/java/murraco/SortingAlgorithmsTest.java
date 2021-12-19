package murraco;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingAlgorithmsTest {

  @Test
  public void testBubbleSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testInsertionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testSelectionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    SelectionSort.selectionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testMergeSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    MergeSort.mergeSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testHeapsort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Heapsort.heapSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testQuicksort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Quicksort.quickSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }


  @Test
  public void shouldPickPivotWithinRange() {
    int start;
    int end;
    int index;
    for( int i = 0; i< 10; i++){
      start = (int) Math.random() * 50;
      end = (int) (Math.random() * (100 - start)) + start;
      index = Quicksort.pickPivotIndex(start,end);
      assertTrue(index >= start && index <= end);
    }
  }

  @Test
  public void shouldThrowNullPointerException() {
    final Integer[] data = null;
    assertThrows(NullPointerException.class, () -> {
      Quicksort.quickSort(data);
    });
  }

  @Test
  public void shouldReturnIntType() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Quicksort.quickSort(data);
    assertEquals("Integer[]", data.getClass().getSimpleName());
  }



//  @Test
//  public void shouldSortTooLargeNumber() {
//    final Integer[] dataSelection = {4, 3, 0, 11, 7, 2147483648, 15, 12, 99, 1};
//    SelectionSort.selectionSort(dataSelection);
//    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99,2147483648]", Arrays.toString(dataSelection));
//    final Integer[] dataInsertion = {4, 3, 0, 11, 7, 2147483648, 15, 12, 99, 1};
//    InsertionSort.insertionSort(dataInsertion);
//    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99,2147483648]", Arrays.toString(dataInsertion));
//    final Integer[] dataBubble = {4, 3, 0, 11, 7, 2147483648, 15, 12, 99, 1};
//    BubbleSort.bubbleSort(dataBubble);
//    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99,2147483648]", Arrays.toString(dataBubble));
//    final Integer[] dataMerge = {4, 3, 0, 11, 7, 2147483648, 15, 12, 99, 1};
//    MergeSort.mergeSort(dataMerge);
//    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99,2147483648]", Arrays.toString(dataMerge));
//    final Integer[] dataHeap = {4, 3, 0, 11, 7, 2147483648, 15, 12, 99, 1};
//    Heapsort.heapSort(dataHeap);
//    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99,2147483648]", Arrays.toString(dataHeap));
//    final Integer[] dataQuick = {4, 3, 0, 11, 7, 2147483648, 15, 12, 99, 1};
//    Quicksort.quickSort(dataQuick);
//    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99,2147483648]", Arrays.toString(dataQuick));
//  }

  @Test
  public void shouldSortLargeNumber() {
    final Integer[] dataSelection = {4, 3, 0, 11, 7, 2147483647, 15, 12, 99, 1};
    SelectionSort.selectionSort(dataSelection);
    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99, 2147483647]", Arrays.toString(dataSelection));
    final Integer[] dataInsertion = {4, 3, 0, 11, 7, 2147483647, 15, 12, 99, 1};
    InsertionSort.insertionSort(dataInsertion);
    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99, 2147483647]", Arrays.toString(dataInsertion));
    final Integer[] dataBubble = {4, 3, 0, 11, 7, 2147483647, 15, 12, 99, 1};
    BubbleSort.bubbleSort(dataBubble);
    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99, 2147483647]", Arrays.toString(dataBubble));
    final Integer[] dataMerge = {4, 3, 0, 11, 7, 2147483647, 15, 12, 99, 1};
    MergeSort.mergeSort(dataMerge);
    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99, 2147483647]", Arrays.toString(dataMerge));
    final Integer[] dataHeap = {4, 3, 0, 11, 7, 2147483647, 15, 12, 99, 1};
    Heapsort.heapSort(dataHeap);
    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99, 2147483647]", Arrays.toString(dataHeap));
    final Integer[] dataQuick = {4, 3, 0, 11, 7, 2147483647, 15, 12, 99, 1};
    Quicksort.quickSort(dataQuick);
    assertEquals("[0, 1, 3, 4, 7, 11, 12, 15, 99, 2147483647]", Arrays.toString(dataQuick));
  }

  @Test
  public void shouldSortTooSmallNumber() {
    final Integer[] dataSelection = {4, 3, 0, 11, 7, -2147483648, 15, 12, 99, 1};
    SelectionSort.selectionSort(dataSelection);
    assertEquals("[-2147483648, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataSelection));
    final Integer[] dataInsertion = {4, 3, 0, 11, 7, -2147483648, 15, 12, 99, 1};
    InsertionSort.insertionSort(dataInsertion);
    assertEquals("[-2147483648, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataInsertion));
    final Integer[] dataBubble = {4, 3, 0, 11, 7, -2147483648, 15, 12, 99, 1};
    BubbleSort.bubbleSort(dataBubble);
    assertEquals("[-2147483648, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataBubble));
    final Integer[] dataMerge = {4, 3, 0, 11, 7, -2147483648, 15, 12, 99, 1};
    MergeSort.mergeSort(dataMerge);
    assertEquals("[-2147483648, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataMerge));
    final Integer[] dataHeap = {4, 3, 0, 11, 7, -2147483648, 15, 12, 99, 1};
    Heapsort.heapSort(dataHeap);
    assertEquals("[-2147483648, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataHeap));
    final Integer[] dataQuick = {4, 3, 0, 11, 7, -2147483648, 15, 12, 99, 1};
    Quicksort.quickSort(dataQuick);
    assertEquals("[-2147483648, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataQuick));
  }

  @Test
  public void shouldSortSmallNumber() {
    final Integer[] dataSelection = {4, 3, 0, 11, 7, -2147483647, 15, 12, 99, 1};
    SelectionSort.selectionSort(dataSelection);
    assertEquals("[-2147483647, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataSelection));
    final Integer[] dataInsertion = {4, 3, 0, 11, 7, -2147483647, 15, 12, 99, 1};
    InsertionSort.insertionSort(dataInsertion);
    assertEquals("[-2147483647, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataInsertion));
    final Integer[] dataBubble = {4, 3, 0, 11, 7, -2147483647, 15, 12, 99, 1};
    BubbleSort.bubbleSort(dataBubble);
    assertEquals("[-2147483647, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataBubble));
    final Integer[] dataMerge = {4, 3, 0, 11, 7, -2147483647, 15, 12, 99, 1};
    MergeSort.mergeSort(dataMerge);
    assertEquals("[-2147483647, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataMerge));
    final Integer[] dataHeap = {4, 3, 0, 11, 7, -2147483647, 15, 12, 99, 1};
    Heapsort.heapSort(dataHeap);
    assertEquals("[-2147483647, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataHeap));
    final Integer[] dataQuick = {4, 3, 0, 11, 7, -2147483647, 15, 12, 99, 1};
    Quicksort.quickSort(dataQuick);
    assertEquals("[-2147483647, 0, 1, 3, 4, 7, 11, 12, 15, 99]", Arrays.toString(dataQuick));
  }

  @Test
  public  void shouldSortNegative() {
    final Integer[] dataSelection = {-4, -3, 0, -11, -7, -5, -15, -12, -99, -1};
    SelectionSort.selectionSort(dataSelection);
    assertEquals("[-99, -15, -12, -11, -7, -5, -4, -3, -1, 0]", Arrays.toString(dataSelection));
    final Integer[] dataInsertion = {-4, -3, 0, -11, -7, -5, -15, -12, -99, -1};
    InsertionSort.insertionSort(dataInsertion);
    assertEquals("[-99, -15, -12, -11, -7, -5, -4, -3, -1, 0]", Arrays.toString(dataInsertion));
    final Integer[] dataBubble = {-4, -3, 0, -11, -7, -5, -15, -12, -99, -1};
    BubbleSort.bubbleSort(dataBubble);
    assertEquals("[-99, -15, -12, -11, -7, -5, -4, -3, -1, 0]", Arrays.toString(dataBubble));
    final Integer[] dataMerge = {-4, -3, 0, -11, -7, -5, -15, -12, -99, -1};
    MergeSort.mergeSort(dataMerge);
    assertEquals("[-99, -15, -12, -11, -7, -5, -4, -3, -1, 0]", Arrays.toString(dataMerge));
    final Integer[] dataHeap = {-4, -3, 0, -11, -7, -5, -15, -12, -99, -1};
    Heapsort.heapSort(dataHeap);
    assertEquals("[-99, -15, -12, -11, -7, -5, -4, -3, -1, 0]", Arrays.toString(dataHeap));
    final Integer[] dataQuick = {-4, -3, 0, -11, -7, -5, -15, -12, -99, -1};
    Quicksort.quickSort(dataQuick);
    assertEquals("[-99, -15, -12, -11, -7, -5, -4, -3, -1, 0]", Arrays.toString(dataQuick));
  }

  @Test
  public  void shouldSortArraywithBiggestFirst() {
    final Integer[] dataSelection = {99, 4, 3, 0, 11, 7, 5, 15, 12, 1};
    SelectionSort.selectionSort(dataSelection);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataSelection));
    final Integer[] dataInsertion = {99, 4, 3, 0, 11, 7, 5, 15, 12, 1};
    InsertionSort.insertionSort(dataInsertion);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataInsertion));
    final Integer[] dataBubble = {99, 4, 3, 0, 11, 7, 5, 15, 12, 1};
    BubbleSort.bubbleSort(dataBubble);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataBubble));
    final Integer[] dataMerge = {99, 4, 3, 0, 11, 7, 5, 15, 12, 1};
    MergeSort.mergeSort(dataMerge);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataMerge));
    final Integer[] dataHeap = {99, 4, 3, 0, 11, 7, 5, 15, 12, 1};
    Heapsort.heapSort(dataHeap);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataHeap));
    final Integer[] dataQuick = {99, 4, 3, 0, 11, 7, 5, 15, 12, 1};
    Quicksort.quickSort(dataQuick);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataQuick));
  }

  @Test
  public  void shouldSortArraywithBiggestLast() {
    final Integer[] dataSelection = {4, 3, 0, 11, 7, 5, 15, 12, 1, 99};
    SelectionSort.selectionSort(dataSelection);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataSelection));
    final Integer[] dataInsertion = {4, 3, 0, 11, 7, 5, 15, 12, 1, 99};
    InsertionSort.insertionSort(dataInsertion);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataInsertion));
    final Integer[] dataBubble = {4, 3, 0, 11, 7, 5, 15, 12, 1, 99};
    BubbleSort.bubbleSort(dataBubble);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataBubble));
    final Integer[] dataMerge = {4, 3, 0, 11, 7, 5, 15, 12, 1, 99};
    MergeSort.mergeSort(dataMerge);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataMerge));
    final Integer[] dataHeap = {4, 3, 0, 11, 7, 5, 15, 12, 1, 99};
    Heapsort.heapSort(dataHeap);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataHeap));
    final Integer[] dataQuick = {4, 3, 0, 11, 7, 5, 15, 12, 1, 99};
    Quicksort.quickSort(dataQuick);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(dataQuick));
  }

}
