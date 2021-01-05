package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.BankingAgent;
import com.pedentello.openbanking.models.CNPJ;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingAgentsContractor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BankingAgentsContractor extends CNPJ  {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("bankingAgents")
  @Valid
  private List<BankingAgent> bankingAgents = null;

  public BankingAgentsContractor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=100)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingAgentsContractor bankingAgents(List<BankingAgent> bankingAgents) {
    this.bankingAgents = bankingAgents;
    return this;
  }

  public BankingAgentsContractor addBankingAgentsItem(BankingAgent bankingAgentsItem) {
    if (this.bankingAgents == null) {
      this.bankingAgents = new ArrayList<BankingAgent>();
    }
    this.bankingAgents.add(bankingAgentsItem);
    return this;
  }

  /**
   * Get bankingAgents
   * @return bankingAgents
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<BankingAgent> getBankingAgents() {
    return bankingAgents;
  }

  public void setBankingAgents(List<BankingAgent> bankingAgents) {
    this.bankingAgents = bankingAgents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingAgentsContractor bankingAgentsContractor = (BankingAgentsContractor) o;
    return Objects.equals(this.name, bankingAgentsContractor.name) &&
        Objects.equals(this.bankingAgents, bankingAgentsContractor.bankingAgents) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bankingAgents, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingAgentsContractor {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bankingAgents: ").append(toIndentedString(bankingAgents)).append("\n");
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
