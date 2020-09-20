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
import com.isagog.kg.model.Frame;
import com.isagog.kg.model.KnowledgeAnnotation;
import com.isagog.kg.model.LinguisticStatement;
import com.isagog.kg.model.Query;
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
 * Managed Knowledge Element
 */
@ApiModel(description = "Managed Knowledge Element")
@JsonPropertyOrder({
  KnowledgeElement.JSON_PROPERTY_ID,
  KnowledgeElement.JSON_PROPERTY_KTYPE,
  KnowledgeElement.JSON_PROPERTY_ANNOTATIONS
})
@JsonTypeName("KnowledgeElement")
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
  @JsonSubTypes.Type(value = Frame.class, name = "Frame"),
  @JsonSubTypes.Type(value = LinguisticStatement.class, name = "LinguisticStatement"),
  @JsonSubTypes.Type(value = Query.class, name = "Query"),
  @JsonSubTypes.Type(value = Relation.class, name = "Relation"),
  @JsonSubTypes.Type(value = RelationalConcept.class, name = "RelationalConcept"),
  @JsonSubTypes.Type(value = RelationalStatement.class, name = "RelationalStatement"),
  @JsonSubTypes.Type(value = Situation.class, name = "Situation"),
  @JsonSubTypes.Type(value = Statement.class, name = "Statement"),
})

public class KnowledgeElement {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Gets or Sets ktype
   */
  public enum KtypeEnum {
    ATOMICCONCEPT("AtomicConcept"),
    
    RELATIONALCONCEPT("RelationalConcept"),
    
    ATTRIBUTIVECONCEPT("AttributiveConcept"),
    
    RELATION("Relation"),
    
    ENTITY("Entity"),
    
    CONCEPTSTATEMENT("ConceptStatement"),
    
    ENTITYSTATEMENT("EntityStatement"),
    
    CLASSIFICATIONSTATEMENT("ClassificationStatement"),
    
    RELATIONALSTATEMENT("RelationalStatement"),
    
    ATTRIBUTIVESTATEMENT("AttributiveStatement"),
    
    SITUATION("Situation");

    private String value;

    KtypeEnum(String value) {
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
    public static KtypeEnum fromValue(String value) {
      for (KtypeEnum b : KtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_KTYPE = "ktype";
  protected KtypeEnum ktype;

  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<KnowledgeAnnotation> annotations = null;


  public KnowledgeElement id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public KnowledgeElement ktype(KtypeEnum ktype) {
    
    this.ktype = ktype;
    return this;
  }

   /**
   * Get ktype
   * @return ktype
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_KTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KtypeEnum getKtype() {
    return ktype;
  }


  public void setKtype(KtypeEnum ktype) {
    this.ktype = ktype;
  }


  public KnowledgeElement annotations(List<KnowledgeAnnotation> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public KnowledgeElement addAnnotationsItem(KnowledgeAnnotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<KnowledgeAnnotation>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<KnowledgeAnnotation> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(List<KnowledgeAnnotation> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeElement knowledgeElement = (KnowledgeElement) o;
    return Objects.equals(this.id, knowledgeElement.id) &&
        Objects.equals(this.ktype, knowledgeElement.ktype) &&
        Objects.equals(this.annotations, knowledgeElement.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ktype, annotations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ktype: ").append(toIndentedString(ktype)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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

