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
import com.isagog.kg.model.KnowledgeElement;
import com.isagog.kg.model.Relation;
import com.isagog.kg.model.RelationalConcept;
import com.isagog.kg.model.RelationalStatement;
import com.isagog.kg.model.Situation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Unary Relational classifier
 */
@ApiModel(description = "Unary Relational classifier")
@JsonPropertyOrder({
  RelationalConcept.JSON_PROPERTY_RELATION,
  RelationalConcept.JSON_PROPERTY_RESTRICTION,
  RelationalConcept.JSON_PROPERTY_QUANTIFIER
})
@JsonTypeName("RelationalConcept")
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

public class RelationalConcept extends KnowledgeElement {
  public static final String JSON_PROPERTY_RELATION = "relation";
  private String relation;

  public static final String JSON_PROPERTY_RESTRICTION = "restriction";
  private String restriction;

  /**
   * Gets or Sets quantifier
   */
  public enum QuantifierEnum {
    SOME("SOME"),
    
    ALL("ALL"),
    
    ATLEAST1("ATLEAST1"),
    
    ATMOST1("ATMOST1");

    private String value;

    QuantifierEnum(String value) {
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
    public static QuantifierEnum fromValue(String value) {
      for (QuantifierEnum b : QuantifierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_QUANTIFIER = "quantifier";
  private QuantifierEnum quantifier;


  public RelationalConcept relation(String relation) {
    
    this.relation = relation;
    return this;
  }

   /**
   * Get relation
   * @return relation
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RELATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRelation() {
    return relation;
  }


  public void setRelation(String relation) {
    this.relation = relation;
  }


  public RelationalConcept restriction(String restriction) {
    
    this.restriction = restriction;
    return this;
  }

   /**
   * Get restriction
   * @return restriction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRestriction() {
    return restriction;
  }


  public void setRestriction(String restriction) {
    this.restriction = restriction;
  }


  public RelationalConcept quantifier(QuantifierEnum quantifier) {
    
    this.quantifier = quantifier;
    return this;
  }

   /**
   * Get quantifier
   * @return quantifier
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_QUANTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public QuantifierEnum getQuantifier() {
    return quantifier;
  }


  public void setQuantifier(QuantifierEnum quantifier) {
    this.quantifier = quantifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationalConcept relationalConcept = (RelationalConcept) o;
    return Objects.equals(this.relation, relationalConcept.relation) &&
        Objects.equals(this.restriction, relationalConcept.restriction) &&
        Objects.equals(this.quantifier, relationalConcept.quantifier) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relation, restriction, quantifier, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationalConcept {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    restriction: ").append(toIndentedString(restriction)).append("\n");
    sb.append("    quantifier: ").append(toIndentedString(quantifier)).append("\n");
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

