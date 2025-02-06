package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
// @ToString // Day 2
public class Staff {
  private String name;
  private int age;

  // Day2
  @Override
  public String toString() {
    return this.name + " " + this.age;
  }
}