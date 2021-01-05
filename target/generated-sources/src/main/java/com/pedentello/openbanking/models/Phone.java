package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Phone
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class Phone   {
  /**
   * Identificação do Tipo de telefone da dependência. p.ex.FIXO, MOVEL.
   */
  public enum TypeEnum {
    FIXO("FIXO"),
    
    MOVEL("MOVEL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("countryCallingCode")
  private String countryCallingCode = null;

  @JsonProperty("areaCode")
  private String areaCode = null;

  @JsonProperty("number")
  private String number = null;

  public Phone type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Identificação do Tipo de telefone da dependência. p.ex.FIXO, MOVEL.
   * @return type
  **/
  @ApiModelProperty(example = "FIXO", value = "Identificação do Tipo de telefone da dependência. p.ex.FIXO, MOVEL.")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Phone countryCallingCode(String countryCallingCode) {
    this.countryCallingCode = countryCallingCode;
    return this;
  }

  /**
   * Número de DDI (Discagem Direta Internacional) para  telefone de acesso ao Canal - se houver. p.ex. '55'
   * @return countryCallingCode
  **/
  @ApiModelProperty(example = "55", value = "Número de DDI (Discagem Direta Internacional) para  telefone de acesso ao Canal - se houver. p.ex. '55'")
  
  @Pattern(regexp="^\\d{2}$") @Size(max=2)   public String getCountryCallingCode() {
    return countryCallingCode;
  }

  public void setCountryCallingCode(String countryCallingCode) {
    this.countryCallingCode = countryCallingCode;
  }

  public Phone areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  /**
   * Número de DDD (Discagem Direta à Distância) do telefone da dependência - se houver. p.ex. '19'
   * @return areaCode
  **/
  @ApiModelProperty(example = "19", value = "Número de DDD (Discagem Direta à Distância) do telefone da dependência - se houver. p.ex. '19'")
  
  @Pattern(regexp="^\\d{2}$") @Size(max=2)   public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public Phone number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Número de telefone da dependência - se houver
   * @return number
  **/
  @ApiModelProperty(example = "35721199", value = "Número de telefone da dependência - se houver")
  
  @Pattern(regexp="^([0-9]{8,11})$") @Size(max=11)   public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return Objects.equals(this.type, phone.type) &&
        Objects.equals(this.countryCallingCode, phone.countryCallingCode) &&
        Objects.equals(this.areaCode, phone.areaCode) &&
        Objects.equals(this.number, phone.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, countryCallingCode, areaCode, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    countryCallingCode: ").append(toIndentedString(countryCallingCode)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
