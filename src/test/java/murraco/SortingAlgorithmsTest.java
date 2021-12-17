package murraco;

import java.util.Arrays;

import org.junit.Test;

import murraco.BubbleSort;
import murraco.Heapsort;
import murraco.InsertionSort;
import murraco.MergeSort;
import murraco.Quicksort;
import murraco.SelectionSort;

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

//  @Test
//  public void shouldPickPivotWithinRange() {
//    final  int start = 1;
//    final int end = 5;
//    final int index = Quicksort.pickPivotIndex(start, end);
//    assertTrue(index >= start && index <= end);
//  }

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
//    Quicksort.quickSort(data);
    assertThrows(NullPointerException.class, () -> {
      Quicksort.quickSort(data);
    });
  }
//    pass a null value to each of the algorithms
//  should use AssertThrows

  //shouldReturnTheRightType


  @Test
  public void shouldReturnIntType() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Quicksort.quickSort(data);
    assertTrue();
  }
  //assertTrue arr.int =
}
