package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.pedentello.openbanking.models.GeographicCoordinates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SharedAutomatedTellerMachinesPostalAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class SharedAutomatedTellerMachinesPostalAddress   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  @JsonProperty("districtName")
  private String districtName = null;

  @JsonProperty("townName")
  private String townName = null;

  @JsonProperty("ibgeCode")
  private String ibgeCode = null;

  /**
   * Enumeração referente a cada sigla da unidade da federação que identifica o estado ou o distrito federal, no qual o endereço está localizado. p.ex. 'AC'. São consideradas apenas as siglas para os estados brasileiros
   */
  public enum CountrySubDivisionEnum {
    AC("AC"),
    
    AL("AL"),
    
    AP("AP"),
    
    AM("AM"),
    
    BA("BA"),
    
    CE("CE"),
    
    DF("DF"),
    
    ES("ES"),
    
    GO("GO"),
    
    MA("MA"),
    
    MT("MT"),
    
    MS("MS"),
    
    MG("MG"),
    
    PA("PA"),
    
    PB("PB"),
    
    PR("PR"),
    
    PE("PE"),
    
    PI("PI"),
    
    RJ("RJ"),
    
    RN("RN"),
    
    RS("RS"),
    
    RO("RO"),
    
    RR("RR"),
    
    SC("SC"),
    
    SP("SP"),
    
    SE("SE"),
    
    TO("TO");

    private String value;

    CountrySubDivisionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CountrySubDivisionEnum fromValue(String text) {
      for (CountrySubDivisionEnum b : CountrySubDivisionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("countrySubDivision")
  private CountrySubDivisionEnum countrySubDivision = null;

  @JsonProperty("postCode")
  private String postCode = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("geographicCoordinates")
  private GeographicCoordinates geographicCoordinates = null;

  public SharedAutomatedTellerMachinesPostalAddress address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Deverá trazer toda a informação referente ao endereço da dependência informada: Tipo de logradouro + Nome do logradouro + Número do Logradouro (se não existir usar ' s/n') + complemento (se houver), como, p.ex.: 'R Diamatina, 59, bloco 35, fundos' 'Praça da Boa Vontade s/n'
   * @return address
  **/
  @ApiModelProperty(example = "Av Naburo Ykesaki, 1270", value = "Deverá trazer toda a informação referente ao endereço da dependência informada: Tipo de logradouro + Nome do logradouro + Número do Logradouro (se não existir usar ' s/n') + complemento (se houver), como, p.ex.: 'R Diamatina, 59, bloco 35, fundos' 'Praça da Boa Vontade s/n'")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=150)   public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public SharedAutomatedTellerMachinesPostalAddress additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Complemento
   * @return additionalInfo
  **/
  @ApiModelProperty(example = "Fundos", value = "Complemento")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=30)   public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public SharedAutomatedTellerMachinesPostalAddress districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

  /**
   * Bairro é uma comunidade ou região localizada em uma cidade ou município de acordo com as suas subdivisões geográficas. p.ex: 'Paraíso'
   * @return districtName
  **/
  @ApiModelProperty(example = "Centro", value = "Bairro é uma comunidade ou região localizada em uma cidade ou município de acordo com as suas subdivisões geográficas. p.ex: 'Paraíso'")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=50)   public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public SharedAutomatedTellerMachinesPostalAddress townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Localidade: O nome da localidade corresponde à designação da cidade ou município no qual o endereço está localizado. p.ex. 'São Paulo'
   * @return townName
  **/
  @ApiModelProperty(example = "Marília", value = "Localidade: O nome da localidade corresponde à designação da cidade ou município no qual o endereço está localizado. p.ex. 'São Paulo'")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=50)   public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public SharedAutomatedTellerMachinesPostalAddress ibgeCode(String ibgeCode) {
    this.ibgeCode = ibgeCode;
    return this;
  }

  /**
   * Código IBGE do município
   * @return ibgeCode
  **/
  @ApiModelProperty(example = "3515890", value = "Código IBGE do município")
  
  @Pattern(regexp="\\d{7}") @Size(max=7)   public String getIbgeCode() {
    return ibgeCode;
  }

  public void setIbgeCode(String ibgeCode) {
    this.ibgeCode = ibgeCode;
  }

  public SharedAutomatedTellerMachinesPostalAddress countrySubDivision(CountrySubDivisionEnum countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Enumeração referente a cada sigla da unidade da federação que identifica o estado ou o distrito federal, no qual o endereço está localizado. p.ex. 'AC'. São consideradas apenas as siglas para os estados brasileiros
   * @return countrySubDivision
  **/
  @ApiModelProperty(example = "SP", value = "Enumeração referente a cada sigla da unidade da federação que identifica o estado ou o distrito federal, no qual o endereço está localizado. p.ex. 'AC'. São consideradas apenas as siglas para os estados brasileiros")
  
    public CountrySubDivisionEnum getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(CountrySubDivisionEnum countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public SharedAutomatedTellerMachinesPostalAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Código de Endereçamento Postal
   * @return postCode
  **/
  @ApiModelProperty(example = "17500001", value = "Código de Endereçamento Postal")
  
  @Pattern(regexp="(\\d{8})|^NA$") @Size(max=8)   public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public SharedAutomatedTellerMachinesPostalAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nome do país
   * @return country
  **/
  @ApiModelProperty(example = "Brasil", value = "Nome do país")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=80)   public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SharedAutomatedTellerMachinesPostalAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Código do país
   * @return countryCode
  **/
  @ApiModelProperty(example = "BRA", value = "Código do país")
  
    public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public SharedAutomatedTellerMachinesPostalAddress geographicCoordinates(GeographicCoordinates geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
    return this;
  }

  /**
   * Get geographicCoordinates
   * @return geographicCoordinates
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GeographicCoordinates getGeographicCoordinates() {
    return geographicCoordinates;
  }

  public void setGeographicCoordinates(GeographicCoordinates geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAutomatedTellerMachinesPostalAddress sharedAutomatedTellerMachinesPostalAddress = (SharedAutomatedTellerMachinesPostalAddress) o;
    return Objects.equals(this.address, sharedAutomatedTellerMachinesPostalAddress.address) &&
        Objects.equals(this.additionalInfo, sharedAutomatedTellerMachinesPostalAddress.additionalInfo) &&
        Objects.equals(this.districtName, sharedAutomatedTellerMachinesPostalAddress.districtName) &&
        Objects.equals(this.townName, sharedAutomatedTellerMachinesPostalAddress.townName) &&
        Objects.equals(this.ibgeCode, sharedAutomatedTellerMachinesPostalAddress.ibgeCode) &&
        Objects.equals(this.countrySubDivision, sharedAutomatedTellerMachinesPostalAddress.countrySubDivision) &&
        Objects.equals(this.postCode, sharedAutomatedTellerMachinesPostalAddress.postCode) &&
        Objects.equals(this.country, sharedAutomatedTellerMachinesPostalAddress.country) &&
        Objects.equals(this.countryCode, sharedAutomatedTellerMachinesPostalAddress.countryCode) &&
        Objects.equals(this.geographicCoordinates, sharedAutomatedTellerMachinesPostalAddress.geographicCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, additionalInfo, districtName, townName, ibgeCode, countrySubDivision, postCode, country, countryCode, geographicCoordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAutomatedTellerMachinesPostalAddress {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    ibgeCode: ").append(toIndentedString(ibgeCode)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    geographicCoordinates: ").append(toIndentedString(geographicCoordinates)).append("\n");
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
