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
 * SharedAutomatedTellerMachinesIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class SharedAutomatedTellerMachinesIdentification   {
  @JsonProperty("ownerName")
  private String ownerName = null;

  public SharedAutomatedTellerMachinesIdentification ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * Nome do proprietário do terminal de Autoatendimento Compartilhado
   * @return ownerName
  **/
  @ApiModelProperty(example = "João da Silva Santos", value = "Nome do proprietário do terminal de Autoatendimento Compartilhado")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=100)   public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAutomatedTellerMachinesIdentification sharedAutomatedTellerMachinesIdentification = (SharedAutomatedTellerMachinesIdentification) o;
    return Objects.equals(this.ownerName, sharedAutomatedTellerMachinesIdentification.ownerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAutomatedTellerMachinesIdentification {\n");
    
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
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
