package org.example;

import org.mapstruct.factory.Mappers;

public class Main {

  public static void main(String[] args) throws CheckedException {

    Mapper mapper = Mappers.getMapper(Mapper.class);
    EnumOut mapped = mapper.map(null);
    System.out.println(mapped);
  }
}
