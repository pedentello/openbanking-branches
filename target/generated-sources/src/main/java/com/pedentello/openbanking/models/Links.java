package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Links
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class Links   {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("first")
  private String first = null;

  @JsonProperty("prev")
  private String prev = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("last")
  private String last = null;

  public Links self(String self) {
    this.self = self;
    return this;
  }

  /**
   * URL da página atualmente requisitada
   * @return self
  **/
  @ApiModelProperty(example = "https://api.banco.com.br/open-banking/channels/v1/<resource>", value = "URL da página atualmente requisitada")
  
    public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Links first(String first) {
    this.first = first;
    return this;
  }

  /**
   * URL da primeira página de registros
   * @return first
  **/
  @ApiModelProperty(example = "https://api.banco.com.br/open-banking/channels/v1/<resource>", value = "URL da primeira página de registros")
  
    public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public Links prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * URL da página anterior de registros
   * @return prev
  **/
  @ApiModelProperty(value = "URL da página anterior de registros")
  
    public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public Links next(String next) {
    this.next = next;
    return this;
  }

  /**
   * URL da próxima página de registros
   * @return next
  **/
  @ApiModelProperty(value = "URL da próxima página de registros")
  
    public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public Links last(String last) {
    this.last = last;
    return this;
  }

  /**
   * URL da última página de registros
   * @return last
  **/
  @ApiModelProperty(example = "https://api.banco.com.br/open-banking/channels/v1/<resource>", value = "URL da última página de registros")
  
    public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.self, links.self) &&
        Objects.equals(this.first, links.first) &&
        Objects.equals(this.prev, links.prev) &&
        Objects.equals(this.next, links.next) &&
        Objects.equals(this.last, links.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
