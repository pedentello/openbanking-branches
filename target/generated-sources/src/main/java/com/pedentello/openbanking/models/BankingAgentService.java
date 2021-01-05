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
 * BankingAgentService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BankingAgentService   {
  /**
   * Relação dos Nomes de serviços prestados pelo Correspondente
   */
  public enum NameEnum {
    RECEPCAO_ENCAMINHAMENTO_PROPOSTAS_ABERTURA_CONTAS_DEPOSITOS_VISTA_PRAZO_POUPANCA_MANTIDOS_INSTITUICAO_CONTRATANTE("RECEPCAO_ENCAMINHAMENTO_PROPOSTAS_ABERTURA_CONTAS_DEPOSITOS_VISTA_PRAZO_POUPANCA_MANTIDOS_INSTITUICAO_CONTRATANTE"),
    
    REALIZACAO_RECEBIMENTOS_PAGAMENTOS_TRANSFERENCIAS_ELETRONICAS_VISANDO_MOVIMENTACAO_CONTAS_DEPOSITOS_TITULARIDADE_CLIENTES_MANTIDAS_INSTITUICAO_CONTRATANTE("REALIZACAO_RECEBIMENTOS_PAGAMENTOS_TRANSFERENCIAS_ELETRONICAS_VISANDO_MOVIMENTACAO_CONTAS_DEPOSITOS_TITULARIDADE_CLIENTES_MANTIDAS_INSTITUICAO_CONTRATANTE"),
    
    RECEBIMENTOS_PAGAMENTOS_QUALQUER_NATUREZA_OUTRAS_ATIVIDADES_DECORRENTES_EXECUCAO_CONTRATOS_CONVENIOS_PRESTACAO_SERVICOS("RECEBIMENTOS_PAGAMENTOS_QUALQUER_NATUREZA_OUTRAS_ATIVIDADES_DECORRENTES_EXECUCAO_CONTRATOS_CONVENIOS_PRESTACAO_SERVICOS"),
    
    EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGAMENTO_CURSADAS_INTERMEDIO_INSTITUICAO_CONTRATANTE_SOLICITACAO_CLIENTES_USUARIOS("EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGAMENTO_CURSADAS_INTERMEDIO_INSTITUICAO_CONTRATANTE_SOLICITACAO_CLIENTES_USUARIOS"),
    
    RECEPCAO_ENCAMINHAMENTO_PROPOSTAS_OPERACAO_CREDITO_ARRENDAMENTO_MERCANTIL_CONCESSAO_INSTITUICAO_CONTRATANTE("RECEPCAO_ENCAMINHAMENTO_PROPOSTAS_OPERACAO_CREDITO_ARRENDAMENTO_MERCANTIL_CONCESSAO_INSTITUICAO_CONTRATANTE"),
    
    RECEBIMENTOS_PAGAMENTOS_RELACIONADOS_LETRAS_CAMBIO_ACEITE_INSTITUICAO_CONTRATANTE("RECEBIMENTOS_PAGAMENTOS_RELACIONADOS_LETRAS_CAMBIO_ACEITE_INSTITUICAO_CONTRATANTE"),
    
    RECEPCAO_ENCAMINHAMENTO_PROPOSTAS_FORNECIMENTO_CARTAO_CREDITO_RESPONSABILIDADE_INSTITUICAO_CONTRATANTE("RECEPCAO_ENCAMINHAMENTO_PROPOSTAS_FORNECIMENTO_CARTAO_CREDITO_RESPONSABILIDADE_INSTITUICAO_CONTRATANTE"),
    
    REALIZACAO_OPERACOES_CAMBIO_RESPONSABILIDADE_INSTITUICAO_CONTRATANTE("REALIZACAO_OPERACOES_CAMBIO_RESPONSABILIDADE_INSTITUICAO_CONTRATANTE"),
    
    OUTROS("OUTROS");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("name")
  private NameEnum name = null;

  /**
   * > Relação dos Códigos relativos aos serviços prestados pelo Correspondente  * `RECEBE_ENCAMINHA_PROPOSTAS_ABERTURA_CONTAS` - Recepção e encaminhamento de propostas de abertura de contas  * `REALIZA_RECEBIMENTOS_PAGAMENTOS_TRANSFERENCIAS_ELETRONICAS` - Realização de recebimentos, pagamentos e transferências eletrônicas  * `RECEBIMENTOS_PAGAMENTOS_QUALQUER_NATUREZA_EXECUCAO_CONTRATOS_CONVENIO` - Recebimentos e pagamentos de qualquer natureza  * `EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGAMENTO` - Execução ativa e passiva de ordens de pagamento  * `RECEBE_ENCAMINHA_PROPOSTAS_CREDITO_ARRENDAMENTO_MERCANTIL` - Recepção e encaminhamento de propostas de operações de crédito e de arrendamento mercantil  * `RECEBE_PAGAMENTOS_RELACIONADOS_LETRAS_CAMBIO_ACEITE_INSTITUICAO` - Recebimento e pagamentos relacionados a letras de câmbio de aceite da instituição  * `RECEBE_ENCAMINHA_PROPOSTAS_FORNECIMENTO_CARTAO_CREDITO` - Recepção e encaminhamento de propostas de fornecimento de cartões de crédito  * `REALIZA_OPERACOES_CAMBIO` - Realização de operações de câmbio  * `OUTROS` - Outros
   */
  public enum CodeEnum {
    RECEBE_ENCAMINHA_PROPOSTAS_ABERTURA_CONTAS("RECEBE_ENCAMINHA_PROPOSTAS_ABERTURA_CONTAS"),
    
    REALIZA_RECEBIMENTOS_PAGAMENTOS_TRANSFERENCIAS_ELETRONICAS("REALIZA_RECEBIMENTOS_PAGAMENTOS_TRANSFERENCIAS_ELETRONICAS"),
    
    RECEBIMENTOS_PAGAMENTOS_QUALQUER_NATUREZA_EXECUCAO_CONTRATOS_CONVENIO("RECEBIMENTOS_PAGAMENTOS_QUALQUER_NATUREZA_EXECUCAO_CONTRATOS_CONVENIO"),
    
    EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGAMENTO("EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGAMENTO"),
    
    RECEBE_ENCAMINHA_PROPOSTAS_CREDITO_ARRENDAMENTO_MERCANTIL("RECEBE_ENCAMINHA_PROPOSTAS_CREDITO_ARRENDAMENTO_MERCANTIL"),
    
    RECEBE_PAGAMENTOS_RELACIONADOS_LETRAS_CAMBIO_ACEITE_INSTITUICAO("RECEBE_PAGAMENTOS_RELACIONADOS_LETRAS_CAMBIO_ACEITE_INSTITUICAO"),
    
    RECEBE_ENCAMINHA_PROPOSTAS_FORNECIMENTO_CARTAO_CREDITO("RECEBE_ENCAMINHA_PROPOSTAS_FORNECIMENTO_CARTAO_CREDITO"),
    
    REALIZA_OPERACOES_CAMBIO("REALIZA_OPERACOES_CAMBIO"),
    
    OUTROS("OUTROS");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("code")
  private CodeEnum code = null;

  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  public BankingAgentService name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Relação dos Nomes de serviços prestados pelo Correspondente
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Relação dos Nomes de serviços prestados pelo Correspondente")
      @NotNull

    public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public BankingAgentService code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * > Relação dos Códigos relativos aos serviços prestados pelo Correspondente  * `RECEBE_ENCAMINHA_PROPOSTAS_ABERTURA_CONTAS` - Recepção e encaminhamento de propostas de abertura de contas  * `REALIZA_RECEBIMENTOS_PAGAMENTOS_TRANSFERENCIAS_ELETRONICAS` - Realização de recebimentos, pagamentos e transferências eletrônicas  * `RECEBIMENTOS_PAGAMENTOS_QUALQUER_NATUREZA_EXECUCAO_CONTRATOS_CONVENIO` - Recebimentos e pagamentos de qualquer natureza  * `EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGAMENTO` - Execução ativa e passiva de ordens de pagamento  * `RECEBE_ENCAMINHA_PROPOSTAS_CREDITO_ARRENDAMENTO_MERCANTIL` - Recepção e encaminhamento de propostas de operações de crédito e de arrendamento mercantil  * `RECEBE_PAGAMENTOS_RELACIONADOS_LETRAS_CAMBIO_ACEITE_INSTITUICAO` - Recebimento e pagamentos relacionados a letras de câmbio de aceite da instituição  * `RECEBE_ENCAMINHA_PROPOSTAS_FORNECIMENTO_CARTAO_CREDITO` - Recepção e encaminhamento de propostas de fornecimento de cartões de crédito  * `REALIZA_OPERACOES_CAMBIO` - Realização de operações de câmbio  * `OUTROS` - Outros
   * @return code
  **/
  @ApiModelProperty(required = true, value = "> Relação dos Códigos relativos aos serviços prestados pelo Correspondente  * `RECEBE_ENCAMINHA_PROPOSTAS_ABERTURA_CONTAS` - Recepção e encaminhamento de propostas de abertura de contas  * `REALIZA_RECEBIMENTOS_PAGAMENTOS_TRANSFERENCIAS_ELETRONICAS` - Realização de recebimentos, pagamentos e transferências eletrônicas  * `RECEBIMENTOS_PAGAMENTOS_QUALQUER_NATUREZA_EXECUCAO_CONTRATOS_CONVENIO` - Recebimentos e pagamentos de qualquer natureza  * `EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGAMENTO` - Execução ativa e passiva de ordens de pagamento  * `RECEBE_ENCAMINHA_PROPOSTAS_CREDITO_ARRENDAMENTO_MERCANTIL` - Recepção e encaminhamento de propostas de operações de crédito e de arrendamento mercantil  * `RECEBE_PAGAMENTOS_RELACIONADOS_LETRAS_CAMBIO_ACEITE_INSTITUICAO` - Recebimento e pagamentos relacionados a letras de câmbio de aceite da instituição  * `RECEBE_ENCAMINHA_PROPOSTAS_FORNECIMENTO_CARTAO_CREDITO` - Recepção e encaminhamento de propostas de fornecimento de cartões de crédito  * `REALIZA_OPERACOES_CAMBIO` - Realização de operações de câmbio  * `OUTROS` - Outros")
      @NotNull

    public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public BankingAgentService additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Campo aberto para detalhamento
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "Campo aberto para detalhamento")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=2000)   public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingAgentService bankingAgentService = (BankingAgentService) o;
    return Objects.equals(this.name, bankingAgentService.name) &&
        Objects.equals(this.code, bankingAgentService.code) &&
        Objects.equals(this.additionalInfo, bankingAgentService.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingAgentService {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
