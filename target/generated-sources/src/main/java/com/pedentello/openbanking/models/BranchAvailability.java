package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.BranchAvailabilityStandards;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchAvailability
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BranchAvailability   {
  @JsonProperty("standards")
  @Valid
  private List<BranchAvailabilityStandards> standards = new ArrayList<BranchAvailabilityStandards>();

  @JsonProperty("exception")
  private String exception = null;

  @JsonProperty("isPublicAccessAllowed")
  private Boolean isPublicAccessAllowed = null;

  public BranchAvailability standards(List<BranchAvailabilityStandards> standards) {
    this.standards = standards;
    return this;
  }

  public BranchAvailability addStandardsItem(BranchAvailabilityStandards standardsItem) {
    this.standards.add(standardsItem);
    return this;
  }

  /**
   * Lista disponibilidade padrão da depêndencia por dias da semana
   * @return standards
  **/
  @ApiModelProperty(required = true, value = "Lista disponibilidade padrão da depêndencia por dias da semana")
      @NotNull
    @Valid
  @Size(min=1,max=7)   public List<BranchAvailabilityStandards> getStandards() {
    return standards;
  }

  public void setStandards(List<BranchAvailabilityStandards> standards) {
    this.standards = standards;
  }

  public BranchAvailability exception(String exception) {
    this.exception = exception;
    return this;
  }

  /**
   * Em campo texto devem ser registradas todas as Exceções para o não atendimento.
   * @return exception
  **/
  @ApiModelProperty(required = true, value = "Em campo texto devem ser registradas todas as Exceções para o não atendimento.")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=2000)   public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }

  public BranchAvailability isPublicAccessAllowed(Boolean isPublicAccessAllowed) {
    this.isPublicAccessAllowed = isPublicAccessAllowed;
    return this;
  }

  /**
   * Indica se a instalação da Dependência tem acesso restrito a clientes.
   * @return isPublicAccessAllowed
  **/
  @ApiModelProperty(value = "Indica se a instalação da Dependência tem acesso restrito a clientes.")
  
    public Boolean isIsPublicAccessAllowed() {
    return isPublicAccessAllowed;
  }

  public void setIsPublicAccessAllowed(Boolean isPublicAccessAllowed) {
    this.isPublicAccessAllowed = isPublicAccessAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchAvailability branchAvailability = (BranchAvailability) o;
    return Objects.equals(this.standards, branchAvailability.standards) &&
        Objects.equals(this.exception, branchAvailability.exception) &&
        Objects.equals(this.isPublicAccessAllowed, branchAvailability.isPublicAccessAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standards, exception, isPublicAccessAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchAvailability {\n");
    
    sb.append("    standards: ").append(toIndentedString(standards)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    isPublicAccessAllowed: ").append(toIndentedString(isPublicAccessAllowed)).append("\n");
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
