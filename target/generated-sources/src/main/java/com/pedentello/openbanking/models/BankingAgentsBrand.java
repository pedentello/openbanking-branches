package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.BankingAgentsCompanies;
import com.pedentello.openbanking.models.Brand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingAgentsBrand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BankingAgentsBrand extends Brand  {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("companies")
  @Valid
  private List<BankingAgentsCompanies> companies = new ArrayList<BankingAgentsCompanies>();

  public BankingAgentsBrand name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome da marca selecionada pela Organização proprietário da dependência (titular).
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome da marca selecionada pela Organização proprietário da dependência (titular).")
      @NotNull

  @Size(max=80)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingAgentsBrand companies(List<BankingAgentsCompanies> companies) {
    this.companies = companies;
    return this;
  }

  public BankingAgentsBrand addCompaniesItem(BankingAgentsCompanies companiesItem) {
    this.companies.add(companiesItem);
    return this;
  }

  /**
   * Lista de instituições pertencentes à marca
   * @return companies
  **/
  @ApiModelProperty(required = true, value = "Lista de instituições pertencentes à marca")
      @NotNull
    @Valid
  @Size(min=1)   public List<BankingAgentsCompanies> getCompanies() {
    return companies;
  }

  public void setCompanies(List<BankingAgentsCompanies> companies) {
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
    BankingAgentsBrand bankingAgentsBrand = (BankingAgentsBrand) o;
    return Objects.equals(this.name, bankingAgentsBrand.name) &&
        Objects.equals(this.companies, bankingAgentsBrand.companies) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, companies, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingAgentsBrand {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
