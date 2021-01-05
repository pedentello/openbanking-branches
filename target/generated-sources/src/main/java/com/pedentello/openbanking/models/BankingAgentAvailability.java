package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.BankingAgentAvailabilityStandards;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingAgentAvailability
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BankingAgentAvailability   {
  @JsonProperty("standards")
  @Valid
  private List<BankingAgentAvailabilityStandards> standards = null;

  @JsonProperty("exception")
  private String exception = null;

  @JsonProperty("isPublicAccessAllowed")
  private Boolean isPublicAccessAllowed = null;

  public BankingAgentAvailability standards(List<BankingAgentAvailabilityStandards> standards) {
    this.standards = standards;
    return this;
  }

  public BankingAgentAvailability addStandardsItem(BankingAgentAvailabilityStandards standardsItem) {
    if (this.standards == null) {
      this.standards = new ArrayList<BankingAgentAvailabilityStandards>();
    }
    this.standards.add(standardsItem);
    return this;
  }

  /**
   * Get standards
   * @return standards
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<BankingAgentAvailabilityStandards> getStandards() {
    return standards;
  }

  public void setStandards(List<BankingAgentAvailabilityStandards> standards) {
    this.standards = standards;
  }

  public BankingAgentAvailability exception(String exception) {
    this.exception = exception;
    return this;
  }

  /**
   * Get exception
   * @return exception
  **/
  @ApiModelProperty(example = "Exceto feriados municipais, nacionais e estaduais", value = "")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=2000)   public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }

  public BankingAgentAvailability isPublicAccessAllowed(Boolean isPublicAccessAllowed) {
    this.isPublicAccessAllowed = isPublicAccessAllowed;
    return this;
  }

  /**
   * Get isPublicAccessAllowed
   * @return isPublicAccessAllowed
  **/
  @ApiModelProperty(example = "false", value = "")
  
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
    BankingAgentAvailability bankingAgentAvailability = (BankingAgentAvailability) o;
    return Objects.equals(this.standards, bankingAgentAvailability.standards) &&
        Objects.equals(this.exception, bankingAgentAvailability.exception) &&
        Objects.equals(this.isPublicAccessAllowed, bankingAgentAvailability.isPublicAccessAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standards, exception, isPublicAccessAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingAgentAvailability {\n");
    
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
