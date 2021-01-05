/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.pedentello.openbanking.api;

import com.pedentello.openbanking.models.ResponseSharedAutomatedTellerMachinesList;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
@Api(value = "shared-automated-teller-machines", description = "the shared-automated-teller-machines API")
public interface SharedAutomatedTellerMachinesApi {

    @ApiOperation(value = "Obtém a lista de terminais compartilhados de autoatendimento.", nickname = "getSharedAutomatedTellerMachines", notes = "Método para obter a lista de terminais compartilhados de autoatendimento da instituição financeira.", response = ResponseSharedAutomatedTellerMachinesList.class, tags={ "Channels", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Lista de terminais compartilhados de autoatendimento obtida com sucesso.", response = ResponseSharedAutomatedTellerMachinesList.class) })
    @RequestMapping(value = "/shared-automated-teller-machines",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ResponseSharedAutomatedTellerMachinesList> getSharedAutomatedTellerMachines();

}
