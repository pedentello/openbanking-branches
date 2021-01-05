package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.BankingAgentsContractor;
import com.pedentello.openbanking.models.CNPJ;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingAgentsCompanies
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BankingAgentsCompanies extends CNPJ  {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("contractors")
  @Valid
  private List<BankingAgentsContractor> contractors = new ArrayList<BankingAgentsContractor>();

  public BankingAgentsCompanies name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome da Instituição, pertencente à marca, responsável pelo Correspondente Bancário no país.
   * @return name
  **/
  @ApiModelProperty(example = "Empresa da Organização A", required = true, value = "Nome da Instituição, pertencente à marca, responsável pelo Correspondente Bancário no país.")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=80)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingAgentsCompanies contractors(List<BankingAgentsContractor> contractors) {
    this.contractors = contractors;
    return this;
  }

  public BankingAgentsCompanies addContractorsItem(BankingAgentsContractor contractorsItem) {
    this.contractors.add(contractorsItem);
    return this;
  }

  /**
   * Relação de informações de um contratante do serviço de correspondente.
   * @return contractors
  **/
  @ApiModelProperty(required = true, value = "Relação de informações de um contratante do serviço de correspondente.")
      @NotNull
    @Valid
  @Size(min=1)   public List<BankingAgentsContractor> getContractors() {
    return contractors;
  }

  public void setContractors(List<BankingAgentsContractor> contractors) {
    this.contractors = contractors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingAgentsCompanies bankingAgentsCompanies = (BankingAgentsCompanies) o;
    return Objects.equals(this.name, bankingAgentsCompanies.name) &&
        Objects.equals(this.contractors, bankingAgentsCompanies.contractors) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contractors, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingAgentsCompanies {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contractors: ").append(toIndentedString(contractors)).append("\n");
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
