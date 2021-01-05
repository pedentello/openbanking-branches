package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.SharedAutomatedTellerMachines;
import com.pedentello.openbanking.models.SharedAutomatedTellerMachinesCompany;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SharedAutomatedTellerMachinesCompanies
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class SharedAutomatedTellerMachinesCompanies extends SharedAutomatedTellerMachinesCompany  {
  @JsonProperty("sharedAutomatedTellerMachines")
  @Valid
  private List<SharedAutomatedTellerMachines> sharedAutomatedTellerMachines = null;

  public SharedAutomatedTellerMachinesCompanies sharedAutomatedTellerMachines(List<SharedAutomatedTellerMachines> sharedAutomatedTellerMachines) {
    this.sharedAutomatedTellerMachines = sharedAutomatedTellerMachines;
    return this;
  }

  public SharedAutomatedTellerMachinesCompanies addSharedAutomatedTellerMachinesItem(SharedAutomatedTellerMachines sharedAutomatedTellerMachinesItem) {
    if (this.sharedAutomatedTellerMachines == null) {
      this.sharedAutomatedTellerMachines = new ArrayList<SharedAutomatedTellerMachines>();
    }
    this.sharedAutomatedTellerMachines.add(sharedAutomatedTellerMachinesItem);
    return this;
  }

  /**
   * Get sharedAutomatedTellerMachines
   * @return sharedAutomatedTellerMachines
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<SharedAutomatedTellerMachines> getSharedAutomatedTellerMachines() {
    return sharedAutomatedTellerMachines;
  }

  public void setSharedAutomatedTellerMachines(List<SharedAutomatedTellerMachines> sharedAutomatedTellerMachines) {
    this.sharedAutomatedTellerMachines = sharedAutomatedTellerMachines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAutomatedTellerMachinesCompanies sharedAutomatedTellerMachinesCompanies = (SharedAutomatedTellerMachinesCompanies) o;
    return Objects.equals(this.sharedAutomatedTellerMachines, sharedAutomatedTellerMachinesCompanies.sharedAutomatedTellerMachines) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedAutomatedTellerMachines, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAutomatedTellerMachinesCompanies {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sharedAutomatedTellerMachines: ").append(toIndentedString(sharedAutomatedTellerMachines)).append("\n");
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
