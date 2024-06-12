package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.hateoas.RepresentationModel;

import java.util.*;
import jakarta.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * BusinessAttributes
 */

@JsonTypeName("Business_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.5.0")
public class BusinessAttributes extends RepresentationModel<BusinessAttributes>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String byAppointmentOnly;

  private String acceptsInsurance;

  private String businessAcceptsCreditCards;

  private String wiFi;

  private String goodForKids;

  private String bikeParking;

  private String businessParking;

  private String alcohol;

  private String restaurantsDelivery;

  private String ambience;

  private String restaurantsReservations;

  private String restaurantsTakeOut;

  private String noiseLevel;

  private String goodForMeal;

  private String caters;

  private String hasTV;

  private String wheelchairAccessible;

  private String happyHour;

  private String restaurantsPriceRange2;

  private String driveThru;

  private String dogsAllowed;

  private String businessAcceptsBitcoin;

  private String outdoorSeating;

  private String restaurantsAttire;

  private String restaurantsTableService;

  private String restaurantsGoodForGroups;

  private String music;

  private String bestNights;

  private String coatCheck;

  private String goodForDancing;

  private String smoking;

  private String BYOB;

  private String corkage;

  private String hairSpecializesIn;

  private String byOBCorkage;

  private String dietaryRestrictions;

  private String agesAllowed;

  private String open24Hours;

  private String restaurantsCounterService;

  public BusinessAttributes byAppointmentOnly(String byAppointmentOnly) {
    this.byAppointmentOnly = byAppointmentOnly;
    return this;
  }

  /**
   * Get byAppointmentOnly
   * @return byAppointmentOnly
  */
  
  @Schema(name = "ByAppointmentOnly", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ByAppointmentOnly")
  public String getByAppointmentOnly() {
    return byAppointmentOnly;
  }

  public void setByAppointmentOnly(String byAppointmentOnly) {
    this.byAppointmentOnly = byAppointmentOnly;
  }

  public BusinessAttributes acceptsInsurance(String acceptsInsurance) {
    this.acceptsInsurance = acceptsInsurance;
    return this;
  }

  /**
   * Get acceptsInsurance
   * @return acceptsInsurance
  */
  
  @Schema(name = "AcceptsInsurance", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AcceptsInsurance")
  public String getAcceptsInsurance() {
    return acceptsInsurance;
  }

  public void setAcceptsInsurance(String acceptsInsurance) {
    this.acceptsInsurance = acceptsInsurance;
  }

  public BusinessAttributes businessAcceptsCreditCards(String businessAcceptsCreditCards) {
    this.businessAcceptsCreditCards = businessAcceptsCreditCards;
    return this;
  }

  /**
   * Get businessAcceptsCreditCards
   * @return businessAcceptsCreditCards
  */
  
  @Schema(name = "BusinessAcceptsCreditCards", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BusinessAcceptsCreditCards")
  public String getBusinessAcceptsCreditCards() {
    return businessAcceptsCreditCards;
  }

  public void setBusinessAcceptsCreditCards(String businessAcceptsCreditCards) {
    this.businessAcceptsCreditCards = businessAcceptsCreditCards;
  }

  public BusinessAttributes wiFi(String wiFi) {
    this.wiFi = wiFi;
    return this;
  }

  /**
   * Get wiFi
   * @return wiFi
  */
  
  @Schema(name = "WiFi", example = "'free'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WiFi")
  public String getWiFi() {
    return wiFi;
  }

  public void setWiFi(String wiFi) {
    this.wiFi = wiFi;
  }

  public BusinessAttributes goodForKids(String goodForKids) {
    this.goodForKids = goodForKids;
    return this;
  }

  /**
   * Get goodForKids
   * @return goodForKids
  */
  
  @Schema(name = "GoodForKids", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GoodForKids")
  public String getGoodForKids() {
    return goodForKids;
  }

  public void setGoodForKids(String goodForKids) {
    this.goodForKids = goodForKids;
  }

  public BusinessAttributes bikeParking(String bikeParking) {
    this.bikeParking = bikeParking;
    return this;
  }

  /**
   * Get bikeParking
   * @return bikeParking
  */
  
  @Schema(name = "BikeParking", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BikeParking")
  public String getBikeParking() {
    return bikeParking;
  }

  public void setBikeParking(String bikeParking) {
    this.bikeParking = bikeParking;
  }

  public BusinessAttributes businessParking(String businessParking) {
    this.businessParking = businessParking;
    return this;
  }

  /**
   * Get businessParking
   * @return businessParking
  */
  
  @Schema(name = "BusinessParking", example = "{'garage': False, 'street': False, 'validated': False, 'lot': True, 'valet': False}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BusinessParking")
  public String getBusinessParking() {
    return businessParking;
  }

  public void setBusinessParking(String businessParking) {
    this.businessParking = businessParking;
  }

  public BusinessAttributes alcohol(String alcohol) {
    this.alcohol = alcohol;
    return this;
  }

  /**
   * Get alcohol
   * @return alcohol
  */
  
  @Schema(name = "Alcohol", example = "u'full_bar'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Alcohol")
  public String getAlcohol() {
    return alcohol;
  }

  public void setAlcohol(String alcohol) {
    this.alcohol = alcohol;
  }

  public BusinessAttributes restaurantsDelivery(String restaurantsDelivery) {
    this.restaurantsDelivery = restaurantsDelivery;
    return this;
  }

  /**
   * Get restaurantsDelivery
   * @return restaurantsDelivery
  */
  
  @Schema(name = "RestaurantsDelivery", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestaurantsDelivery")
  public String getRestaurantsDelivery() {
    return restaurantsDelivery;
  }

  public void setRestaurantsDelivery(String restaurantsDelivery) {
    this.restaurantsDelivery = restaurantsDelivery;
  }

  public BusinessAttributes ambience(String ambience) {
    this.ambience = ambience;
    return this;
  }

  /**
   * Get ambience
   * @return ambience
  */
  
  @Schema(name = "Ambience", example = "{'touristy': False, 'hipster': False, 'romantic': False, 'divey': False, 'intimate': False, 'trendy': False, 'upscale': False, 'classy': False, 'casual': False}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ambience")
  public String getAmbience() {
    return ambience;
  }

  public void setAmbience(String ambience) {
    this.ambience = ambience;
  }

  public BusinessAttributes restaurantsReservations(String restaurantsReservations) {
    this.restaurantsReservations = restaurantsReservations;
    return this;
  }

  /**
   * Get restaurantsReservations
   * @return restaurantsReservations
  */
  
  @Schema(name = "RestaurantsReservations", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestaurantsReservations")
  public String getRestaurantsReservations() {
    return restaurantsReservations;
  }

  public void setRestaurantsReservations(String restaurantsReservations) {
    this.restaurantsReservations = restaurantsReservations;
  }

  public BusinessAttributes restaurantsTakeOut(String restaurantsTakeOut) {
    this.restaurantsTakeOut = restaurantsTakeOut;
    return this;
  }

  /**
   * Get restaurantsTakeOut
   * @return restaurantsTakeOut
  */
  
  @Schema(name = "RestaurantsTakeOut", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestaurantsTakeOut")
  public String getRestaurantsTakeOut() {
    return restaurantsTakeOut;
  }

  public void setRestaurantsTakeOut(String restaurantsTakeOut) {
    this.restaurantsTakeOut = restaurantsTakeOut;
  }

  public BusinessAttributes noiseLevel(String noiseLevel) {
    this.noiseLevel = noiseLevel;
    return this;
  }

  /**
   * Get noiseLevel
   * @return noiseLevel
  */
  
  @Schema(name = "NoiseLevel", example = "u'average'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NoiseLevel")
  public String getNoiseLevel() {
    return noiseLevel;
  }

  public void setNoiseLevel(String noiseLevel) {
    this.noiseLevel = noiseLevel;
  }

  public BusinessAttributes goodForMeal(String goodForMeal) {
    this.goodForMeal = goodForMeal;
    return this;
  }

  /**
   * Get goodForMeal
   * @return goodForMeal
  */
  
  @Schema(name = "GoodForMeal", example = "{'dessert': False, 'latenight': False, 'lunch': False, 'dinner': False, 'brunch': False, 'breakfast': False}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GoodForMeal")
  public String getGoodForMeal() {
    return goodForMeal;
  }

  public void setGoodForMeal(String goodForMeal) {
    this.goodForMeal = goodForMeal;
  }

  public BusinessAttributes caters(String caters) {
    this.caters = caters;
    return this;
  }

  /**
   * Get caters
   * @return caters
  */
  
  @Schema(name = "Caters", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Caters")
  public String getCaters() {
    return caters;
  }

  public void setCaters(String caters) {
    this.caters = caters;
  }

  public BusinessAttributes hasTV(String hasTV) {
    this.hasTV = hasTV;
    return this;
  }

  /**
   * Get hasTV
   * @return hasTV
  */
  
  @Schema(name = "HasTV", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasTV")
  public String getHasTV() {
    return hasTV;
  }

  public void setHasTV(String hasTV) {
    this.hasTV = hasTV;
  }

  public BusinessAttributes wheelchairAccessible(String wheelchairAccessible) {
    this.wheelchairAccessible = wheelchairAccessible;
    return this;
  }

  /**
   * Get wheelchairAccessible
   * @return wheelchairAccessible
  */
  
  @Schema(name = "WheelchairAccessible", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WheelchairAccessible")
  public String getWheelchairAccessible() {
    return wheelchairAccessible;
  }

  public void setWheelchairAccessible(String wheelchairAccessible) {
    this.wheelchairAccessible = wheelchairAccessible;
  }

  public BusinessAttributes happyHour(String happyHour) {
    this.happyHour = happyHour;
    return this;
  }

  /**
   * Get happyHour
   * @return happyHour
  */
  
  @Schema(name = "HappyHour", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HappyHour")
  public String getHappyHour() {
    return happyHour;
  }

  public void setHappyHour(String happyHour) {
    this.happyHour = happyHour;
  }

  public BusinessAttributes restaurantsPriceRange2(String restaurantsPriceRange2) {
    this.restaurantsPriceRange2 = restaurantsPriceRange2;
    return this;
  }

  /**
   * Get restaurantsPriceRange2
   * @return restaurantsPriceRange2
  */
  
  @Schema(name = "RestaurantsPriceRange2", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestaurantsPriceRange2")
  public String getRestaurantsPriceRange2() {
    return restaurantsPriceRange2;
  }

  public void setRestaurantsPriceRange2(String restaurantsPriceRange2) {
    this.restaurantsPriceRange2 = restaurantsPriceRange2;
  }

  public BusinessAttributes driveThru(String driveThru) {
    this.driveThru = driveThru;
    return this;
  }

  /**
   * Get driveThru
   * @return driveThru
  */
  
  @Schema(name = "DriveThru", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DriveThru")
  public String getDriveThru() {
    return driveThru;
  }

  public void setDriveThru(String driveThru) {
    this.driveThru = driveThru;
  }

  public BusinessAttributes dogsAllowed(String dogsAllowed) {
    this.dogsAllowed = dogsAllowed;
    return this;
  }

  /**
   * Get dogsAllowed
   * @return dogsAllowed
  */
  
  @Schema(name = "DogsAllowed", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DogsAllowed")
  public String getDogsAllowed() {
    return dogsAllowed;
  }

  public void setDogsAllowed(String dogsAllowed) {
    this.dogsAllowed = dogsAllowed;
  }

  public BusinessAttributes businessAcceptsBitcoin(String businessAcceptsBitcoin) {
    this.businessAcceptsBitcoin = businessAcceptsBitcoin;
    return this;
  }

  /**
   * Get businessAcceptsBitcoin
   * @return businessAcceptsBitcoin
  */
  
  @Schema(name = "BusinessAcceptsBitcoin", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BusinessAcceptsBitcoin")
  public String getBusinessAcceptsBitcoin() {
    return businessAcceptsBitcoin;
  }

  public void setBusinessAcceptsBitcoin(String businessAcceptsBitcoin) {
    this.businessAcceptsBitcoin = businessAcceptsBitcoin;
  }

  public BusinessAttributes outdoorSeating(String outdoorSeating) {
    this.outdoorSeating = outdoorSeating;
    return this;
  }

  /**
   * Get outdoorSeating
   * @return outdoorSeating
  */
  
  @Schema(name = "OutdoorSeating", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OutdoorSeating")
  public String getOutdoorSeating() {
    return outdoorSeating;
  }

  public void setOutdoorSeating(String outdoorSeating) {
    this.outdoorSeating = outdoorSeating;
  }

  public BusinessAttributes restaurantsAttire(String restaurantsAttire) {
    this.restaurantsAttire = restaurantsAttire;
    return this;
  }

  /**
   * Get restaurantsAttire
   * @return restaurantsAttire
  */
  
  @Schema(name = "RestaurantsAttire", example = "u'casual'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestaurantsAttire")
  public String getRestaurantsAttire() {
    return restaurantsAttire;
  }

  public void setRestaurantsAttire(String restaurantsAttire) {
    this.restaurantsAttire = restaurantsAttire;
  }

  public BusinessAttributes restaurantsTableService(String restaurantsTableService) {
    this.restaurantsTableService = restaurantsTableService;
    return this;
  }

  /**
   * Get restaurantsTableService
   * @return restaurantsTableService
  */
  
  @Schema(name = "RestaurantsTableService", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestaurantsTableService")
  public String getRestaurantsTableService() {
    return restaurantsTableService;
  }

  public void setRestaurantsTableService(String restaurantsTableService) {
    this.restaurantsTableService = restaurantsTableService;
  }

  public BusinessAttributes restaurantsGoodForGroups(String restaurantsGoodForGroups) {
    this.restaurantsGoodForGroups = restaurantsGoodForGroups;
    return this;
  }

  /**
   * Get restaurantsGoodForGroups
   * @return restaurantsGoodForGroups
  */
  
  @Schema(name = "RestaurantsGoodForGroups", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestaurantsGoodForGroups")
  public String getRestaurantsGoodForGroups() {
    return restaurantsGoodForGroups;
  }

  public void setRestaurantsGoodForGroups(String restaurantsGoodForGroups) {
    this.restaurantsGoodForGroups = restaurantsGoodForGroups;
  }

  public BusinessAttributes music(String music) {
    this.music = music;
    return this;
  }

  /**
   * Get music
   * @return music
  */
  
  @Schema(name = "Music", example = "{'dj': False, 'background_music': False, 'no_music': False, 'jukebox': None, 'live': False, 'video': False, 'karaoke': None}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Music")
  public String getMusic() {
    return music;
  }

  public void setMusic(String music) {
    this.music = music;
  }

  public BusinessAttributes bestNights(String bestNights) {
    this.bestNights = bestNights;
    return this;
  }

  /**
   * Get bestNights
   * @return bestNights
  */
  
  @Schema(name = "BestNights", example = "{'monday': False, 'tuesday': False, 'friday': False, 'wednesday': False, 'thursday': False, 'sunday': False, 'saturday': False}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BestNights")
  public String getBestNights() {
    return bestNights;
  }

  public void setBestNights(String bestNights) {
    this.bestNights = bestNights;
  }

  public BusinessAttributes coatCheck(String coatCheck) {
    this.coatCheck = coatCheck;
    return this;
  }

  /**
   * Get coatCheck
   * @return coatCheck
  */
  
  @Schema(name = "CoatCheck", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CoatCheck")
  public String getCoatCheck() {
    return coatCheck;
  }

  public void setCoatCheck(String coatCheck) {
    this.coatCheck = coatCheck;
  }

  public BusinessAttributes goodForDancing(String goodForDancing) {
    this.goodForDancing = goodForDancing;
    return this;
  }

  /**
   * Get goodForDancing
   * @return goodForDancing
  */
  
  @Schema(name = "GoodForDancing", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GoodForDancing")
  public String getGoodForDancing() {
    return goodForDancing;
  }

  public void setGoodForDancing(String goodForDancing) {
    this.goodForDancing = goodForDancing;
  }

  public BusinessAttributes smoking(String smoking) {
    this.smoking = smoking;
    return this;
  }

  /**
   * Get smoking
   * @return smoking
  */
  
  @Schema(name = "Smoking", example = "u'no'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Smoking")
  public String getSmoking() {
    return smoking;
  }

  public void setSmoking(String smoking) {
    this.smoking = smoking;
  }

  public BusinessAttributes BYOB(String BYOB) {
    this.BYOB = BYOB;
    return this;
  }

  /**
   * Get BYOB
   * @return BYOB
  */
  
  @Schema(name = "BYOB", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BYOB")
  public String getBYOB() {
    return BYOB;
  }

  public void setBYOB(String BYOB) {
    this.BYOB = BYOB;
  }

  public BusinessAttributes corkage(String corkage) {
    this.corkage = corkage;
    return this;
  }

  /**
   * Get corkage
   * @return corkage
  */
  
  @Schema(name = "Corkage", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Corkage")
  public String getCorkage() {
    return corkage;
  }

  public void setCorkage(String corkage) {
    this.corkage = corkage;
  }

  public BusinessAttributes hairSpecializesIn(String hairSpecializesIn) {
    this.hairSpecializesIn = hairSpecializesIn;
    return this;
  }

  /**
   * Get hairSpecializesIn
   * @return hairSpecializesIn
  */
  
  @Schema(name = "HairSpecializesIn", example = "{'straightperms': True, 'coloring': True, 'extensions': False, 'africanamerican': False, 'curly': True, 'kids': True, 'perms': True, 'asian': True}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HairSpecializesIn")
  public String getHairSpecializesIn() {
    return hairSpecializesIn;
  }

  public void setHairSpecializesIn(String hairSpecializesIn) {
    this.hairSpecializesIn = hairSpecializesIn;
  }

  public BusinessAttributes byOBCorkage(String byOBCorkage) {
    this.byOBCorkage = byOBCorkage;
    return this;
  }

  /**
   * Get byOBCorkage
   * @return byOBCorkage
  */
  
  @Schema(name = "BYOBCorkage", example = "'no'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BYOBCorkage")
  public String getByOBCorkage() {
    return byOBCorkage;
  }

  public void setByOBCorkage(String byOBCorkage) {
    this.byOBCorkage = byOBCorkage;
  }

  public BusinessAttributes dietaryRestrictions(String dietaryRestrictions) {
    this.dietaryRestrictions = dietaryRestrictions;
    return this;
  }

  /**
   * Get dietaryRestrictions
   * @return dietaryRestrictions
  */
  
  @Schema(name = "DietaryRestrictions", example = "{'dairy-free': False, 'gluten-free': False, 'vegan': True, 'kosher': False, 'halal': False, 'soy-free': False, 'vegetarian': True}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DietaryRestrictions")
  public String getDietaryRestrictions() {
    return dietaryRestrictions;
  }

  public void setDietaryRestrictions(String dietaryRestrictions) {
    this.dietaryRestrictions = dietaryRestrictions;
  }

  public BusinessAttributes agesAllowed(String agesAllowed) {
    this.agesAllowed = agesAllowed;
    return this;
  }

  /**
   * Get agesAllowed
   * @return agesAllowed
  */
  
  @Schema(name = "AgesAllowed", example = "u'allages'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AgesAllowed")
  public String getAgesAllowed() {
    return agesAllowed;
  }

  public void setAgesAllowed(String agesAllowed) {
    this.agesAllowed = agesAllowed;
  }

  public BusinessAttributes open24Hours(String open24Hours) {
    this.open24Hours = open24Hours;
    return this;
  }

  /**
   * Get open24Hours
   * @return open24Hours
  */
  
  @Schema(name = "Open24Hours", example = "False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Open24Hours")
  public String getOpen24Hours() {
    return open24Hours;
  }

  public void setOpen24Hours(String open24Hours) {
    this.open24Hours = open24Hours;
  }

  public BusinessAttributes restaurantsCounterService(String restaurantsCounterService) {
    this.restaurantsCounterService = restaurantsCounterService;
    return this;
  }

  /**
   * Get restaurantsCounterService
   * @return restaurantsCounterService
  */
  
  @Schema(name = "RestaurantsCounterService", example = "True", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestaurantsCounterService")
  public String getRestaurantsCounterService() {
    return restaurantsCounterService;
  }

  public void setRestaurantsCounterService(String restaurantsCounterService) {
    this.restaurantsCounterService = restaurantsCounterService;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public BusinessAttributes putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAttributes businessAttributes = (BusinessAttributes) o;
    return Objects.equals(this.byAppointmentOnly, businessAttributes.byAppointmentOnly) &&
        Objects.equals(this.acceptsInsurance, businessAttributes.acceptsInsurance) &&
        Objects.equals(this.businessAcceptsCreditCards, businessAttributes.businessAcceptsCreditCards) &&
        Objects.equals(this.wiFi, businessAttributes.wiFi) &&
        Objects.equals(this.goodForKids, businessAttributes.goodForKids) &&
        Objects.equals(this.bikeParking, businessAttributes.bikeParking) &&
        Objects.equals(this.businessParking, businessAttributes.businessParking) &&
        Objects.equals(this.alcohol, businessAttributes.alcohol) &&
        Objects.equals(this.restaurantsDelivery, businessAttributes.restaurantsDelivery) &&
        Objects.equals(this.ambience, businessAttributes.ambience) &&
        Objects.equals(this.restaurantsReservations, businessAttributes.restaurantsReservations) &&
        Objects.equals(this.restaurantsTakeOut, businessAttributes.restaurantsTakeOut) &&
        Objects.equals(this.noiseLevel, businessAttributes.noiseLevel) &&
        Objects.equals(this.goodForMeal, businessAttributes.goodForMeal) &&
        Objects.equals(this.caters, businessAttributes.caters) &&
        Objects.equals(this.hasTV, businessAttributes.hasTV) &&
        Objects.equals(this.wheelchairAccessible, businessAttributes.wheelchairAccessible) &&
        Objects.equals(this.happyHour, businessAttributes.happyHour) &&
        Objects.equals(this.restaurantsPriceRange2, businessAttributes.restaurantsPriceRange2) &&
        Objects.equals(this.driveThru, businessAttributes.driveThru) &&
        Objects.equals(this.dogsAllowed, businessAttributes.dogsAllowed) &&
        Objects.equals(this.businessAcceptsBitcoin, businessAttributes.businessAcceptsBitcoin) &&
        Objects.equals(this.outdoorSeating, businessAttributes.outdoorSeating) &&
        Objects.equals(this.restaurantsAttire, businessAttributes.restaurantsAttire) &&
        Objects.equals(this.restaurantsTableService, businessAttributes.restaurantsTableService) &&
        Objects.equals(this.restaurantsGoodForGroups, businessAttributes.restaurantsGoodForGroups) &&
        Objects.equals(this.music, businessAttributes.music) &&
        Objects.equals(this.bestNights, businessAttributes.bestNights) &&
        Objects.equals(this.coatCheck, businessAttributes.coatCheck) &&
        Objects.equals(this.goodForDancing, businessAttributes.goodForDancing) &&
        Objects.equals(this.smoking, businessAttributes.smoking) &&
        Objects.equals(this.BYOB, businessAttributes.BYOB) &&
        Objects.equals(this.corkage, businessAttributes.corkage) &&
        Objects.equals(this.hairSpecializesIn, businessAttributes.hairSpecializesIn) &&
        Objects.equals(this.byOBCorkage, businessAttributes.byOBCorkage) &&
        Objects.equals(this.dietaryRestrictions, businessAttributes.dietaryRestrictions) &&
        Objects.equals(this.agesAllowed, businessAttributes.agesAllowed) &&
        Objects.equals(this.open24Hours, businessAttributes.open24Hours) &&
        Objects.equals(this.restaurantsCounterService, businessAttributes.restaurantsCounterService) &&
    Objects.equals(this.additionalProperties, businessAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byAppointmentOnly, acceptsInsurance, businessAcceptsCreditCards, wiFi, goodForKids, bikeParking, businessParking, alcohol, restaurantsDelivery, ambience, restaurantsReservations, restaurantsTakeOut, noiseLevel, goodForMeal, caters, hasTV, wheelchairAccessible, happyHour, restaurantsPriceRange2, driveThru, dogsAllowed, businessAcceptsBitcoin, outdoorSeating, restaurantsAttire, restaurantsTableService, restaurantsGoodForGroups, music, bestNights, coatCheck, goodForDancing, smoking, BYOB, corkage, hairSpecializesIn, byOBCorkage, dietaryRestrictions, agesAllowed, open24Hours, restaurantsCounterService, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAttributes {\n");
    sb.append("    byAppointmentOnly: ").append(toIndentedString(byAppointmentOnly)).append("\n");
    sb.append("    acceptsInsurance: ").append(toIndentedString(acceptsInsurance)).append("\n");
    sb.append("    businessAcceptsCreditCards: ").append(toIndentedString(businessAcceptsCreditCards)).append("\n");
    sb.append("    wiFi: ").append(toIndentedString(wiFi)).append("\n");
    sb.append("    goodForKids: ").append(toIndentedString(goodForKids)).append("\n");
    sb.append("    bikeParking: ").append(toIndentedString(bikeParking)).append("\n");
    sb.append("    businessParking: ").append(toIndentedString(businessParking)).append("\n");
    sb.append("    alcohol: ").append(toIndentedString(alcohol)).append("\n");
    sb.append("    restaurantsDelivery: ").append(toIndentedString(restaurantsDelivery)).append("\n");
    sb.append("    ambience: ").append(toIndentedString(ambience)).append("\n");
    sb.append("    restaurantsReservations: ").append(toIndentedString(restaurantsReservations)).append("\n");
    sb.append("    restaurantsTakeOut: ").append(toIndentedString(restaurantsTakeOut)).append("\n");
    sb.append("    noiseLevel: ").append(toIndentedString(noiseLevel)).append("\n");
    sb.append("    goodForMeal: ").append(toIndentedString(goodForMeal)).append("\n");
    sb.append("    caters: ").append(toIndentedString(caters)).append("\n");
    sb.append("    hasTV: ").append(toIndentedString(hasTV)).append("\n");
    sb.append("    wheelchairAccessible: ").append(toIndentedString(wheelchairAccessible)).append("\n");
    sb.append("    happyHour: ").append(toIndentedString(happyHour)).append("\n");
    sb.append("    restaurantsPriceRange2: ").append(toIndentedString(restaurantsPriceRange2)).append("\n");
    sb.append("    driveThru: ").append(toIndentedString(driveThru)).append("\n");
    sb.append("    dogsAllowed: ").append(toIndentedString(dogsAllowed)).append("\n");
    sb.append("    businessAcceptsBitcoin: ").append(toIndentedString(businessAcceptsBitcoin)).append("\n");
    sb.append("    outdoorSeating: ").append(toIndentedString(outdoorSeating)).append("\n");
    sb.append("    restaurantsAttire: ").append(toIndentedString(restaurantsAttire)).append("\n");
    sb.append("    restaurantsTableService: ").append(toIndentedString(restaurantsTableService)).append("\n");
    sb.append("    restaurantsGoodForGroups: ").append(toIndentedString(restaurantsGoodForGroups)).append("\n");
    sb.append("    music: ").append(toIndentedString(music)).append("\n");
    sb.append("    bestNights: ").append(toIndentedString(bestNights)).append("\n");
    sb.append("    coatCheck: ").append(toIndentedString(coatCheck)).append("\n");
    sb.append("    goodForDancing: ").append(toIndentedString(goodForDancing)).append("\n");
    sb.append("    smoking: ").append(toIndentedString(smoking)).append("\n");
    sb.append("    BYOB: ").append(toIndentedString(BYOB)).append("\n");
    sb.append("    corkage: ").append(toIndentedString(corkage)).append("\n");
    sb.append("    hairSpecializesIn: ").append(toIndentedString(hairSpecializesIn)).append("\n");
    sb.append("    byOBCorkage: ").append(toIndentedString(byOBCorkage)).append("\n");
    sb.append("    dietaryRestrictions: ").append(toIndentedString(dietaryRestrictions)).append("\n");
    sb.append("    agesAllowed: ").append(toIndentedString(agesAllowed)).append("\n");
    sb.append("    open24Hours: ").append(toIndentedString(open24Hours)).append("\n");
    sb.append("    restaurantsCounterService: ").append(toIndentedString(restaurantsCounterService)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

