package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.CNPJ;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingAgentIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BankingAgentIdentification extends CNPJ  {
  @JsonProperty("corporationName")
  private String corporationName = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("isUnderestablishment")
  private Boolean isUnderestablishment = null;

  public BankingAgentIdentification corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  /**
   * Get corporationName
   * @return corporationName
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=100)   public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public BankingAgentIdentification groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=100)   public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public BankingAgentIdentification isUnderestablishment(Boolean isUnderestablishment) {
    this.isUnderestablishment = isUnderestablishment;
    return this;
  }

  /**
   * Indicador do Correspondente Bancário ser um Substabelecimento (são empresas  que foram contratadas por um correspondente bancário para prestar serviços. A empresa substabelecida é tratada como um correspondente do banco e tem praticamente os mesmos direitos e obrigações que possui o correspondente direto)
   * @return isUnderestablishment
  **/
  @ApiModelProperty(value = "Indicador do Correspondente Bancário ser um Substabelecimento (são empresas  que foram contratadas por um correspondente bancário para prestar serviços. A empresa substabelecida é tratada como um correspondente do banco e tem praticamente os mesmos direitos e obrigações que possui o correspondente direto)")
  
    public Boolean isIsUnderestablishment() {
    return isUnderestablishment;
  }

  public void setIsUnderestablishment(Boolean isUnderestablishment) {
    this.isUnderestablishment = isUnderestablishment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingAgentIdentification bankingAgentIdentification = (BankingAgentIdentification) o;
    return Objects.equals(this.corporationName, bankingAgentIdentification.corporationName) &&
        Objects.equals(this.groupName, bankingAgentIdentification.groupName) &&
        Objects.equals(this.isUnderestablishment, bankingAgentIdentification.isUnderestablishment) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationName, groupName, isUnderestablishment, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingAgentIdentification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    corporationName: ").append(toIndentedString(corporationName)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    isUnderestablishment: ").append(toIndentedString(isUnderestablishment)).append("\n");
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
