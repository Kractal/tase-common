/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.softsec.tase.common.rpc.domain.app;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum OriginType implements org.apache.thrift.TEnum {
  OFFICIAL_STORE(0),
  UNOFFICIAL_STORE(1),
  USER(2),
  DEVICE(3);

  private final int value;

  private OriginType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static OriginType findByValue(int value) { 
    switch (value) {
      case 0:
        return OFFICIAL_STORE;
      case 1:
        return UNOFFICIAL_STORE;
      case 2:
        return USER;
      case 3:
        return DEVICE;
      default:
        return null;
    }
  }
}
