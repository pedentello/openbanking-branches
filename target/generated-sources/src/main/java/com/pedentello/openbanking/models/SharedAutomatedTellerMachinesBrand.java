package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.Brand;
import com.pedentello.openbanking.models.SharedAutomatedTellerMachinesCompanies;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SharedAutomatedTellerMachinesBrand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class SharedAutomatedTellerMachinesBrand extends Brand  {
  @JsonProperty("companies")
  @Valid
  private List<SharedAutomatedTellerMachinesCompanies> companies = null;

  public SharedAutomatedTellerMachinesBrand companies(List<SharedAutomatedTellerMachinesCompanies> companies) {
    this.companies = companies;
    return this;
  }

  public SharedAutomatedTellerMachinesBrand addCompaniesItem(SharedAutomatedTellerMachinesCompanies companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<SharedAutomatedTellerMachinesCompanies>();
    }
    this.companies.add(companiesItem);
    return this;
  }

  /**
   * Lista de instituições pertencentes à marca
   * @return companies
  **/
  @ApiModelProperty(value = "Lista de instituições pertencentes à marca")
      @Valid
    public List<SharedAutomatedTellerMachinesCompanies> getCompanies() {
    return companies;
  }

  public void setCompanies(List<SharedAutomatedTellerMachinesCompanies> companies) {
    this.companies = companies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAutomatedTellerMachinesBrand sharedAutomatedTellerMachinesBrand = (SharedAutomatedTellerMachinesBrand) o;
    return Objects.equals(this.companies, sharedAutomatedTellerMachinesBrand.companies) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companies, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAutomatedTellerMachinesBrand {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
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
