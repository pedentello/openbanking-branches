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
 * SharedAutomatedTellerMachinesAvailabilityStandards
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class SharedAutomatedTellerMachinesAvailabilityStandards   {
  /**
   * Dia da semana de abertura
   */
  public enum WeekdayEnum {
    DOMINGO("DOMINGO"),
    
    SEGUNDA_FEIRA("SEGUNDA_FEIRA"),
    
    TERCA_FEIRA("TERCA_FEIRA"),
    
    QUARTA_FEIRA("QUARTA_FEIRA"),
    
    QUINTA_FEIRA("QUINTA_FEIRA"),
    
    SEXTA_FEIRA("SEXTA_FEIRA"),
    
    SABADO("SABADO");

    private String value;

    WeekdayEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WeekdayEnum fromValue(String text) {
      for (WeekdayEnum b : WeekdayEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("weekday")
  private WeekdayEnum weekday = null;

  @JsonProperty("openingTime")
  private String openingTime = null;

  @JsonProperty("closingTime")
  private String closingTime = null;

  public SharedAutomatedTellerMachinesAvailabilityStandards weekday(WeekdayEnum weekday) {
    this.weekday = weekday;
    return this;
  }

  /**
   * Dia da semana de abertura
   * @return weekday
  **/
  @ApiModelProperty(example = "SEGUNDA_FEIRA", value = "Dia da semana de abertura")
  
    public WeekdayEnum getWeekday() {
    return weekday;
  }

  public void setWeekday(WeekdayEnum weekday) {
    this.weekday = weekday;
  }

  public SharedAutomatedTellerMachinesAvailabilityStandards openingTime(String openingTime) {
    this.openingTime = openingTime;
    return this;
  }

  /**
   * Horário de abertura (UTC)
   * @return openingTime
  **/
  @ApiModelProperty(example = "10:00:57Z", value = "Horário de abertura (UTC)")
  
  @Pattern(regexp="^(?:[01]\\d|2[0123]):(?:[012345]\\d):(?:[012345]\\d)|Z$|^NA$") @Size(max=13)   public String getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(String openingTime) {
    this.openingTime = openingTime;
  }

  public SharedAutomatedTellerMachinesAvailabilityStandards closingTime(String closingTime) {
    this.closingTime = closingTime;
    return this;
  }

  /**
   * Horário de fechamento (UTC)
   * @return closingTime
  **/
  @ApiModelProperty(example = "16:00:57Z", value = "Horário de fechamento (UTC)")
  
  @Pattern(regexp="^(?:[01]\\d|2[0123]):(?:[012345]\\d):(?:[012345]\\d)|Z$|^NA$") @Size(max=13)   public String getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(String closingTime) {
    this.closingTime = closingTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAutomatedTellerMachinesAvailabilityStandards sharedAutomatedTellerMachinesAvailabilityStandards = (SharedAutomatedTellerMachinesAvailabilityStandards) o;
    return Objects.equals(this.weekday, sharedAutomatedTellerMachinesAvailabilityStandards.weekday) &&
        Objects.equals(this.openingTime, sharedAutomatedTellerMachinesAvailabilityStandards.openingTime) &&
        Objects.equals(this.closingTime, sharedAutomatedTellerMachinesAvailabilityStandards.closingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekday, openingTime, closingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAutomatedTellerMachinesAvailabilityStandards {\n");
    
    sb.append("    weekday: ").append(toIndentedString(weekday)).append("\n");
    sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
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
