/*
 * Kafka Admin REST API
 * An API to provide REST endpoints for query Kafka for admin operations
 *
 * The version of the OpenAPI document: 0.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.auth.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AclResourceTypeFilter
 */
public enum AclResourceTypeFilter {
  
  ANY("ANY"),
  
  GROUP("GROUP"),
  
  TOPIC("TOPIC"),
  
  CLUSTER("CLUSTER"),
  
  TRANSACTIONAL_ID("TRANSACTIONAL_ID");

  private String value;

  AclResourceTypeFilter(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AclResourceTypeFilter fromValue(String value) {
    for (AclResourceTypeFilter b : AclResourceTypeFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

