/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Business;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.5.0")
@Validated
@Tag(name = "Businesses", description = "Operations about businesses")
@RequestMapping("${openapi.yelpAnalysis.base-path:}")
public interface BusinessesApi {

    /**
     * GET /businesses/{businessId} : Get business by id
     * Gets a business entity.
     *
     * @param businessId  (required)
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "getBusiness",
        summary = "Get business by id",
        description = "Gets a business entity.",
        tags = { "Businesses" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Business.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/businesses/{businessId}",
        produces = { "application/json" }
    )
    
    ResponseEntity<Business> getBusiness(
        @Parameter(name = "businessId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("businessId") String businessId
    ) throws Exception;

}
