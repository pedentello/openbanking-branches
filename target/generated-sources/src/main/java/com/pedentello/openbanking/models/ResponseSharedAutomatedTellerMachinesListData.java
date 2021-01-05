package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.SharedAutomatedTellerMachinesBrand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseSharedAutomatedTellerMachinesListData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class ResponseSharedAutomatedTellerMachinesListData   {
  @JsonProperty("brand")
  private SharedAutomatedTellerMachinesBrand brand = null;

  public ResponseSharedAutomatedTellerMachinesListData brand(SharedAutomatedTellerMachinesBrand brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SharedAutomatedTellerMachinesBrand getBrand() {
    return brand;
  }

  public void setBrand(SharedAutomatedTellerMachinesBrand brand) {
    this.brand = brand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseSharedAutomatedTellerMachinesListData responseSharedAutomatedTellerMachinesListData = (ResponseSharedAutomatedTellerMachinesListData) o;
    return Objects.equals(this.brand, responseSharedAutomatedTellerMachinesListData.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSharedAutomatedTellerMachinesListData {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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
