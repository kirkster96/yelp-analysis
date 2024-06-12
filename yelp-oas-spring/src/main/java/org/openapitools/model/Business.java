package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BusinessAttributes;
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

@Schema(name = "Business", description = "Contains business data including location data, attributes, and categories.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.5.0")
public class Business extends RepresentationModel<Business>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String businessId;

  private String name;

  private String address;

  private String city;

  private String state;

  private String postalCode;

  private Double latitude;

  private Double longitude;

  private Float stars;

  private Integer reviewCount;

  private Integer isOpen;

  private BusinessAttributes attributes;

  public Business businessId(String businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Get businessId
   * @return businessId
  */
  
  @Schema(name = "business_id", example = "cN8F-BmoHoS9eCqIHMtlHA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business_id")
  public String getBusinessId() {
    return businessId;
  }

  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }

  public Business name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "Example Cafe", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Business address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  
  @Schema(name = "address", example = "1234 Clayton Rd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Business city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", example = "Saint Louis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Business state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", example = "MO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Business postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  */
  
  @Schema(name = "postal_code", example = "45123", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Business latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  */
  
  @Schema(name = "latitude", example = "38.6385628", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Business longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  */
  
  @Schema(name = "longitude", example = "-90.3902411", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Business stars(Float stars) {
    this.stars = stars;
    return this;
  }

  /**
   * Get stars
   * @return stars
  */
  
  @Schema(name = "stars", example = "4.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stars")
  public Float getStars() {
    return stars;
  }

  public void setStars(Float stars) {
    this.stars = stars;
  }

  public Business reviewCount(Integer reviewCount) {
    this.reviewCount = reviewCount;
    return this;
  }

  /**
   * Get reviewCount
   * @return reviewCount
  */
  
  @Schema(name = "review_count", example = "160", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("review_count")
  public Integer getReviewCount() {
    return reviewCount;
  }

  public void setReviewCount(Integer reviewCount) {
    this.reviewCount = reviewCount;
  }

  public Business isOpen(Integer isOpen) {
    this.isOpen = isOpen;
    return this;
  }

  /**
   * Get isOpen
   * @return isOpen
  */
  
  @Schema(name = "is_open", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_open")
  public Integer getIsOpen() {
    return isOpen;
  }

  public void setIsOpen(Integer isOpen) {
    this.isOpen = isOpen;
  }

  public Business attributes(BusinessAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public BusinessAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(BusinessAttributes attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Business business = (Business) o;
    return Objects.equals(this.businessId, business.businessId) &&
        Objects.equals(this.name, business.name) &&
        Objects.equals(this.address, business.address) &&
        Objects.equals(this.city, business.city) &&
        Objects.equals(this.state, business.state) &&
        Objects.equals(this.postalCode, business.postalCode) &&
        Objects.equals(this.latitude, business.latitude) &&
        Objects.equals(this.longitude, business.longitude) &&
        Objects.equals(this.stars, business.stars) &&
        Objects.equals(this.reviewCount, business.reviewCount) &&
        Objects.equals(this.isOpen, business.isOpen) &&
        Objects.equals(this.attributes, business.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, name, address, city, state, postalCode, latitude, longitude, stars, reviewCount, isOpen, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Business {\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    reviewCount: ").append(toIndentedString(reviewCount)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

