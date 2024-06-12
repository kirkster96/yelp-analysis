package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.hateoas.RepresentationModel;

import java.util.*;
import jakarta.annotation.Generated;

/**
 * Contains business data including location data, attributes, and categories.
 */

@Schema(name = "CheckIn", description = "Contains business data including location data, attributes, and categories.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.5.0")
public class CheckIn extends RepresentationModel<CheckIn>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String businessId;

  private String date;

  public CheckIn businessId(String businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * 22 character business id, maps to business in business.json
   * @return businessId
  */
  
  @Schema(name = "business_id", description = "22 character business id, maps to business in business.json", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business_id")
  public String getBusinessId() {
    return businessId;
  }

  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }

  public CheckIn date(String date) {
    this.date = date;
    return this;
  }

  /**
   * string which is a comma-separated list of timestamps for each checkin, each with format YYYY-MM-DD HH:MM:SS
   * @return date
  */
  
  @Schema(name = "date", description = "string which is a comma-separated list of timestamps for each checkin, each with format YYYY-MM-DD HH:MM:SS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckIn checkIn = (CheckIn) o;
    return Objects.equals(this.businessId, checkIn.businessId) &&
        Objects.equals(this.date, checkIn.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckIn {\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

