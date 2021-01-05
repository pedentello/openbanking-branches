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
 * CNPJ
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class CNPJ   {
  @JsonProperty("cnpjNumber")
  private String cnpjNumber = null;

  public CNPJ cnpjNumber(String cnpjNumber) {
    this.cnpjNumber = cnpjNumber;
    return this;
  }

  /**
   * Número completo do CNPJ da instituição
   * @return cnpjNumber
  **/
  @ApiModelProperty(example = "50685362000135", value = "Número completo do CNPJ da instituição")
  
  @Pattern(regexp="^(\\d{14})$|^NA$") @Size(max=14)   public String getCnpjNumber() {
    return cnpjNumber;
  }

  public void setCnpjNumber(String cnpjNumber) {
    this.cnpjNumber = cnpjNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CNPJ CNPJ = (CNPJ) o;
    return Objects.equals(this.cnpjNumber, CNPJ.cnpjNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cnpjNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CNPJ {\n");
    
    sb.append("    cnpjNumber: ").append(toIndentedString(cnpjNumber)).append("\n");
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
