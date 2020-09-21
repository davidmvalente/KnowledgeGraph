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
import com.isagog.kg.model.AtomicConcept;
import com.isagog.kg.model.Attribute;
import com.isagog.kg.model.AttributiveConcept;
import com.isagog.kg.model.AttributiveStatement;
import com.isagog.kg.model.ClassificationStatement;
import com.isagog.kg.model.ConceptStatement;
import com.isagog.kg.model.Entity;
import com.isagog.kg.model.EntityStatement;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.Relation;
import com.isagog.kg.model.RelationalConcept;
import com.isagog.kg.model.RelationalStatement;
import com.isagog.kg.model.Situation;
import com.isagog.kg.model.Statement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Natural language statement
 */
@ApiModel(description = "Natural language statement")
@JsonPropertyOrder({
  LinguisticStatement.JSON_PROPERTY_UTTERANCE
})
@JsonTypeName("LinguisticStatement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-20T08:48:02.229570400+02:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "ktype", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AtomicConcept.class, name = "AtomicConcept"),
  @JsonSubTypes.Type(value = Attribute.class, name = "Attribute"),
  @JsonSubTypes.Type(value = AttributiveConcept.class, name = "AttributiveConcept"),
  @JsonSubTypes.Type(value = AttributiveStatement.class, name = "AttributiveStatement"),
  @JsonSubTypes.Type(value = ClassificationStatement.class, name = "ClassificationStatement"),
  @JsonSubTypes.Type(value = ConceptStatement.class, name = "ConceptStatement"),
  @JsonSubTypes.Type(value = Entity.class, name = "Entity"),
  @JsonSubTypes.Type(value = EntityStatement.class, name = "EntityStatement"),
  @JsonSubTypes.Type(value = Relation.class, name = "Relation"),
  @JsonSubTypes.Type(value = RelationalConcept.class, name = "RelationalConcept"),
  @JsonSubTypes.Type(value = RelationalStatement.class, name = "RelationalStatement"),
  @JsonSubTypes.Type(value = Situation.class, name = "Situation"),
})

public class LinguisticStatement extends Statement {
  public static final String JSON_PROPERTY_UTTERANCE = "utterance";
  private byte[] utterance;


  public LinguisticStatement utterance(byte[] utterance) {
    
    this.utterance = utterance;
    return this;
  }

   /**
   * Utterance
   * @return utterance
  **/
  @ApiModelProperty(required = true, value = "Utterance")
  @JsonProperty(JSON_PROPERTY_UTTERANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public byte[] getUtterance() {
    return utterance;
  }


  public void setUtterance(byte[] utterance) {
    this.utterance = utterance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinguisticStatement linguisticStatement = (LinguisticStatement) o;
    return Arrays.equals(this.utterance, linguisticStatement.utterance) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(utterance), super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinguisticStatement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    utterance: ").append(toIndentedString(utterance)).append("\n");
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
