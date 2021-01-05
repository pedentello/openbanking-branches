package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.pedentello.openbanking.models.PhoneChannelPhone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhoneChannelIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class PhoneChannelIdentification   {
  /**
   *  Tipo de canal telefônico de atendimento:  * `CENTRAL_TELEFONICA`  * `SAC`  * `OUVIDORIA`  * `OUTROS`
   */
  public enum TypeEnum {
    CENTRAL_TELEFONICA("CENTRAL_TELEFONICA"),
    
    SAC("SAC"),
    
    OUVIDORIA("OUVIDORIA"),
    
    OUTROS("OUTROS");

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

  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  @JsonProperty("phones")
  @Valid
  private List<PhoneChannelPhone> phones = null;

  public PhoneChannelIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   *  Tipo de canal telefônico de atendimento:  * `CENTRAL_TELEFONICA`  * `SAC`  * `OUVIDORIA`  * `OUTROS`
   * @return type
  **/
  @ApiModelProperty(example = "OUVIDORIA", required = true, value = " Tipo de canal telefônico de atendimento:  * `CENTRAL_TELEFONICA`  * `SAC`  * `OUVIDORIA`  * `OUTROS`")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PhoneChannelIdentification additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Campo de texto livre para descrever informações complementateres sobre canais telefônicos. De preenchimento obrigatório quando o tipo de canal de atendimento telefônico selecionado for \"OUTROS\"
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "Campo de texto livre para descrever informações complementateres sobre canais telefônicos. De preenchimento obrigatório quando o tipo de canal de atendimento telefônico selecionado for \"OUTROS\"")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=300)   public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public PhoneChannelIdentification phones(List<PhoneChannelPhone> phones) {
    this.phones = phones;
    return this;
  }

  public PhoneChannelIdentification addPhonesItem(PhoneChannelPhone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<PhoneChannelPhone>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Lista de telefones do Canal de Atendimento
   * @return phones
  **/
  @ApiModelProperty(value = "Lista de telefones do Canal de Atendimento")
      @Valid
  @Size(min=1)   public List<PhoneChannelPhone> getPhones() {
    return phones;
  }

  public void setPhones(List<PhoneChannelPhone> phones) {
    this.phones = phones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneChannelIdentification phoneChannelIdentification = (PhoneChannelIdentification) o;
    return Objects.equals(this.type, phoneChannelIdentification.type) &&
        Objects.equals(this.additionalInfo, phoneChannelIdentification.additionalInfo) &&
        Objects.equals(this.phones, phoneChannelIdentification.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, additionalInfo, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChannelIdentification {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
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
