/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeGeneralCardVerificationRequest extends AbstractModel {

    /**
    * Base64 value of the front document image. Supported formats: PNG, JPG, JPEG. The Base64 encoded size shall not exceed 7 MB. One of ImageUrl, ImageBase64, BackImageUrl, BackImageBase64 must be provided. If both URL and Base64 are passed, URL will be used preferentially. Image download timeout is 3 seconds.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * URL address of the front side image of the card. Refer to the description of ImageBase64 for image requirements.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Base64-encoded value of the back side image of the card. Refer to the description of ImageBase64 for image requirements.
    */
    @SerializedName("BackImageBase64")
    @Expose
    private String BackImageBase64;

    /**
    * URL address of the back side image of the card. Refer to the description of ImageBase64 for image requirements.
    */
    @SerializedName("BackImageUrl")
    @Expose
    private String BackImageUrl;

    /**
    * Specifies the target document type for this verification. Each element is a full card type enum in the format {CountryOrRegionCode}_{CardType}, such as THA_ID_CARD and PHL_UMID. For passports, use the single value PASSPORT regardless of the issuing country. Wildcards are supported: * indicates all supported card types, and {CountryCode}_* indicates all card types of a country/region, such as PHL_*. If this parameter is not specified or an empty array is passed, the server performs automatic classification across all supported card types. An unsupported card type returns InvalidParameterValueLimit, and the unsupported values are listed in the error message.
    */
    @SerializedName("CardTypes")
    @Expose
    private String [] CardTypes;

    /**
    * Whether to return the Base64-encoded portrait image of the card. Default: false.
    */
    @SerializedName("ReturnHeadImage")
    @Expose
    private Boolean ReturnHeadImage;

    /**
    * Card verification configuration.
    */
    @SerializedName("VerificationConfig")
    @Expose
    private CardVerificationConfig VerificationConfig;

    /**
     * Get Base64 value of the front document image. Supported formats: PNG, JPG, JPEG. The Base64 encoded size shall not exceed 7 MB. One of ImageUrl, ImageBase64, BackImageUrl, BackImageBase64 must be provided. If both URL and Base64 are passed, URL will be used preferentially. Image download timeout is 3 seconds. 
     * @return ImageBase64 Base64 value of the front document image. Supported formats: PNG, JPG, JPEG. The Base64 encoded size shall not exceed 7 MB. One of ImageUrl, ImageBase64, BackImageUrl, BackImageBase64 must be provided. If both URL and Base64 are passed, URL will be used preferentially. Image download timeout is 3 seconds.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Base64 value of the front document image. Supported formats: PNG, JPG, JPEG. The Base64 encoded size shall not exceed 7 MB. One of ImageUrl, ImageBase64, BackImageUrl, BackImageBase64 must be provided. If both URL and Base64 are passed, URL will be used preferentially. Image download timeout is 3 seconds.
     * @param ImageBase64 Base64 value of the front document image. Supported formats: PNG, JPG, JPEG. The Base64 encoded size shall not exceed 7 MB. One of ImageUrl, ImageBase64, BackImageUrl, BackImageBase64 must be provided. If both URL and Base64 are passed, URL will be used preferentially. Image download timeout is 3 seconds.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get URL address of the front side image of the card. Refer to the description of ImageBase64 for image requirements. 
     * @return ImageUrl URL address of the front side image of the card. Refer to the description of ImageBase64 for image requirements.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set URL address of the front side image of the card. Refer to the description of ImageBase64 for image requirements.
     * @param ImageUrl URL address of the front side image of the card. Refer to the description of ImageBase64 for image requirements.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Base64-encoded value of the back side image of the card. Refer to the description of ImageBase64 for image requirements. 
     * @return BackImageBase64 Base64-encoded value of the back side image of the card. Refer to the description of ImageBase64 for image requirements.
     */
    public String getBackImageBase64() {
        return this.BackImageBase64;
    }

    /**
     * Set Base64-encoded value of the back side image of the card. Refer to the description of ImageBase64 for image requirements.
     * @param BackImageBase64 Base64-encoded value of the back side image of the card. Refer to the description of ImageBase64 for image requirements.
     */
    public void setBackImageBase64(String BackImageBase64) {
        this.BackImageBase64 = BackImageBase64;
    }

    /**
     * Get URL address of the back side image of the card. Refer to the description of ImageBase64 for image requirements. 
     * @return BackImageUrl URL address of the back side image of the card. Refer to the description of ImageBase64 for image requirements.
     */
    public String getBackImageUrl() {
        return this.BackImageUrl;
    }

    /**
     * Set URL address of the back side image of the card. Refer to the description of ImageBase64 for image requirements.
     * @param BackImageUrl URL address of the back side image of the card. Refer to the description of ImageBase64 for image requirements.
     */
    public void setBackImageUrl(String BackImageUrl) {
        this.BackImageUrl = BackImageUrl;
    }

    /**
     * Get Specifies the target document type for this verification. Each element is a full card type enum in the format {CountryOrRegionCode}_{CardType}, such as THA_ID_CARD and PHL_UMID. For passports, use the single value PASSPORT regardless of the issuing country. Wildcards are supported: * indicates all supported card types, and {CountryCode}_* indicates all card types of a country/region, such as PHL_*. If this parameter is not specified or an empty array is passed, the server performs automatic classification across all supported card types. An unsupported card type returns InvalidParameterValueLimit, and the unsupported values are listed in the error message. 
     * @return CardTypes Specifies the target document type for this verification. Each element is a full card type enum in the format {CountryOrRegionCode}_{CardType}, such as THA_ID_CARD and PHL_UMID. For passports, use the single value PASSPORT regardless of the issuing country. Wildcards are supported: * indicates all supported card types, and {CountryCode}_* indicates all card types of a country/region, such as PHL_*. If this parameter is not specified or an empty array is passed, the server performs automatic classification across all supported card types. An unsupported card type returns InvalidParameterValueLimit, and the unsupported values are listed in the error message.
     */
    public String [] getCardTypes() {
        return this.CardTypes;
    }

    /**
     * Set Specifies the target document type for this verification. Each element is a full card type enum in the format {CountryOrRegionCode}_{CardType}, such as THA_ID_CARD and PHL_UMID. For passports, use the single value PASSPORT regardless of the issuing country. Wildcards are supported: * indicates all supported card types, and {CountryCode}_* indicates all card types of a country/region, such as PHL_*. If this parameter is not specified or an empty array is passed, the server performs automatic classification across all supported card types. An unsupported card type returns InvalidParameterValueLimit, and the unsupported values are listed in the error message.
     * @param CardTypes Specifies the target document type for this verification. Each element is a full card type enum in the format {CountryOrRegionCode}_{CardType}, such as THA_ID_CARD and PHL_UMID. For passports, use the single value PASSPORT regardless of the issuing country. Wildcards are supported: * indicates all supported card types, and {CountryCode}_* indicates all card types of a country/region, such as PHL_*. If this parameter is not specified or an empty array is passed, the server performs automatic classification across all supported card types. An unsupported card type returns InvalidParameterValueLimit, and the unsupported values are listed in the error message.
     */
    public void setCardTypes(String [] CardTypes) {
        this.CardTypes = CardTypes;
    }

    /**
     * Get Whether to return the Base64-encoded portrait image of the card. Default: false. 
     * @return ReturnHeadImage Whether to return the Base64-encoded portrait image of the card. Default: false.
     */
    public Boolean getReturnHeadImage() {
        return this.ReturnHeadImage;
    }

    /**
     * Set Whether to return the Base64-encoded portrait image of the card. Default: false.
     * @param ReturnHeadImage Whether to return the Base64-encoded portrait image of the card. Default: false.
     */
    public void setReturnHeadImage(Boolean ReturnHeadImage) {
        this.ReturnHeadImage = ReturnHeadImage;
    }

    /**
     * Get Card verification configuration. 
     * @return VerificationConfig Card verification configuration.
     */
    public CardVerificationConfig getVerificationConfig() {
        return this.VerificationConfig;
    }

    /**
     * Set Card verification configuration.
     * @param VerificationConfig Card verification configuration.
     */
    public void setVerificationConfig(CardVerificationConfig VerificationConfig) {
        this.VerificationConfig = VerificationConfig;
    }

    public RecognizeGeneralCardVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeGeneralCardVerificationRequest(RecognizeGeneralCardVerificationRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.BackImageBase64 != null) {
            this.BackImageBase64 = new String(source.BackImageBase64);
        }
        if (source.BackImageUrl != null) {
            this.BackImageUrl = new String(source.BackImageUrl);
        }
        if (source.CardTypes != null) {
            this.CardTypes = new String[source.CardTypes.length];
            for (int i = 0; i < source.CardTypes.length; i++) {
                this.CardTypes[i] = new String(source.CardTypes[i]);
            }
        }
        if (source.ReturnHeadImage != null) {
            this.ReturnHeadImage = new Boolean(source.ReturnHeadImage);
        }
        if (source.VerificationConfig != null) {
            this.VerificationConfig = new CardVerificationConfig(source.VerificationConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "BackImageBase64", this.BackImageBase64);
        this.setParamSimple(map, prefix + "BackImageUrl", this.BackImageUrl);
        this.setParamArraySimple(map, prefix + "CardTypes.", this.CardTypes);
        this.setParamSimple(map, prefix + "ReturnHeadImage", this.ReturnHeadImage);
        this.setParamObj(map, prefix + "VerificationConfig.", this.VerificationConfig);

    }
}

