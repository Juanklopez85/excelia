package com.excelia.binary.service;

import java.util.List;

public class BinaryServiceImpl implements BinaryService {

  @Override
  public List<Integer> binarySort(final List<Integer> list) {
    list.sort((a, b) -> {
      int compare = Integer.compare(Integer.bitCount(a), Integer.bitCount(b));
      if (compare == 0) {
        return Integer.compare(a, b);
      }
      return compare;
    });
    return list;
  }
}
