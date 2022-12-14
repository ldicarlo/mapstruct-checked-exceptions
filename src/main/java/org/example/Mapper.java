package org.example;

import static org.mapstruct.MappingConstants.NULL;
import static org.mapstruct.MappingConstants.THROW_EXCEPTION;

import org.mapstruct.EnumMapping;
import org.mapstruct.ValueMapping;

@org.mapstruct.Mapper
public interface Mapper {

  @ValueMapping(target = THROW_EXCEPTION, source = NULL)
  @EnumMapping(unexpectedValueMappingException = CheckedException.class)
  EnumOut map(EnumIn enumIn) throws CheckedException;

}
