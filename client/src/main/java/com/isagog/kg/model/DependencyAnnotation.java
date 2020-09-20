/*
 * Isagog Knowledge Graph Service
 * Isagog Knowledge Graph Service API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: ks-api@isagog.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.isagog.kg.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.isagog.kg.model.DependencyAnnotation;
import com.isagog.kg.model.EntityAnnotation;
import com.isagog.kg.model.GrammarAnnotation;
import com.isagog.kg.model.RelationAnnotation;
import com.isagog.kg.model.Support;
import com.isagog.kg.model.SyntaxAnnotation;
import com.isagog.kg.model.TextAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Token dependency
 */
@ApiModel(description = "Token dependency")
@JsonPropertyOrder({
  DependencyAnnotation.JSON_PROPERTY_GOVERNOR,
  DependencyAnnotation.JSON_PROPERTY_DEPENDENT
})
@JsonTypeName("DependencyAnnotation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T08:48:02.229570400+02:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "atype", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = DependencyAnnotation.class, name = "DependencyAnnotation"),
  @JsonSubTypes.Type(value = EntityAnnotation.class, name = "EntityAnnotation"),
  @JsonSubTypes.Type(value = GrammarAnnotation.class, name = "GrammarAnnotation"),
  @JsonSubTypes.Type(value = RelationAnnotation.class, name = "RelationAnnotation"),
  @JsonSubTypes.Type(value = SyntaxAnnotation.class, name = "SyntaxAnnotation"),
})

public class DependencyAnnotation extends TextAnnotation {
  public static final String JSON_PROPERTY_GOVERNOR = "governor";
  private Integer governor;

  public static final String JSON_PROPERTY_DEPENDENT = "dependent";
  private Integer dependent;


  public DependencyAnnotation governor(Integer governor) {
    
    this.governor = governor;
    return this;
  }

   /**
   * Index of the governor token annotation
   * @return governor
  **/
  @ApiModelProperty(required = true, value = "Index of the governor token annotation")
  @JsonProperty(JSON_PROPERTY_GOVERNOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getGovernor() {
    return governor;
  }


  public void setGovernor(Integer governor) {
    this.governor = governor;
  }


  public DependencyAnnotation dependent(Integer dependent) {
    
    this.dependent = dependent;
    return this;
  }

   /**
   * Index of the dependent token annotation
   * @return dependent
  **/
  @ApiModelProperty(required = true, value = "Index of the dependent token annotation")
  @JsonProperty(JSON_PROPERTY_DEPENDENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDependent() {
    return dependent;
  }


  public void setDependent(Integer dependent) {
    this.dependent = dependent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyAnnotation dependencyAnnotation = (DependencyAnnotation) o;
    return Objects.equals(this.governor, dependencyAnnotation.governor) &&
        Objects.equals(this.dependent, dependencyAnnotation.dependent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(governor, dependent, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    governor: ").append(toIndentedString(governor)).append("\n");
    sb.append("    dependent: ").append(toIndentedString(dependent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

