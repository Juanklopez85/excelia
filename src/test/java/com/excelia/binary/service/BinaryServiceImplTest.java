package com.excelia.binary.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BinaryServiceImplTest {


  @InjectMocks
  private BinaryServiceImpl binaryServiceImpl;

  @Test
  void GivenIntegerList_WhenBinarySort_ThenReturnOrderedList() {
    // When
    List<Integer> sortedList = binaryServiceImpl.binarySort(Arrays.asList(7, 2, 1, 9, 5, 3, 8, 25, 42));

    // Then
    assertThat(sortedList).isNotEmpty().hasSize(9).containsExactly(1, 2, 8, 3, 5, 9, 7, 25, 42);
  }
}