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

public class ApplyOcrTokenRequest extends AbstractModel {

    /**
    * Country code. ISO 3166-1 Alpha-3 country/region code standard.
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Supported countries/regions and document types:

Mainland China: ID_CARD, PERMIT
Hong Kong: ID_CARD
Macao: ID_CARD
Hong Kong/Macao/Taiwan: MAINLAND_PERMIT, HMT_RESIDENT_PERMIT
Thailand: ID_CARD, THA_PINK_CARD
Indonesia: ID_CARD
Malaysia: ID_CARD
Singapore: ID_CARD
Philippines: PHL_UMID, PHL_VOTE_ID, PHL_TIN_ID, PHL_SSS_ID, DRIVING_LICENSE
Any country/region: PASSPORT
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * SDK-generated device-related encryption configuration information.
    */
    @SerializedName("EncryptedConfig")
    @Expose
    private String EncryptedConfig;

    /**
    * <p>Whether to extract the portrait image from the document. false by default</p><p>Default value: false</p>
    */
    @SerializedName("ReturnHeadImage")
    @Expose
    private Boolean ReturnHeadImage;

    /**
    * <p>Maximum number of token retries</p><p>Value range: [1, 5]</p><p>Default value: 3</p>
    */
    @SerializedName("RetryLimit")
    @Expose
    private Long RetryLimit;

    /**
    * <p>SDK capture mode</p><p>Enumeration values:</p><ul><li>OCR_DETECT_MANUAL: Photo recognition mode. The system performs recognition after you tap to take a photo.</li><li>OCR_DETECT_AUTO_MANUAL: Automatic recognition mode. The system recognizes automatically, and you can switch to photo recognition after a recognition timeout.</li><li>OCR_DETECT_AUTO: Pure automatic recognition mode. The system recognizes automatically, and you cannot switch to photo recognition after a recognition timeout.</li><li>OCR_DETECT_AUTO_MULTI: Pure automatic recognition mode (multiple images). The system turns on the flash and automatically collects multiple document photos.</li></ul><p>Default value: OCR_DETECT_AUTO_MANUAL</p>
    */
    @SerializedName("OcrModeType")
    @Expose
    private String OcrModeType;

    /**
    * <p>Whether to allow uploading gallery images for recognition.</p><p>Default value: true</p>
    */
    @SerializedName("AllowUploadPhoto")
    @Expose
    private Boolean AllowUploadPhoto;

    /**
    * <p>Whether to enable ID card photo cropping (remove extra edges outside the document and automatically correct the shooting angle). It is false by default and only applicable to Mainland ID cards.</p><p>Default value: false</p>
    */
    @SerializedName("CropIdCard")
    @Expose
    private Boolean CropIdCard;

    /**
    * <p>SDK-supported recognition version mode</p><p>Enumeration values:</p><ul><li>BASIC: Basic version</li><li>ENHANCED: Enhanced version</li></ul><p>Default value: BASIC</p>
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
    * OCR automatic capture mode timeout (ms).
Value range: [5000, 180000].
Default value: 20000.
If the value is below 5000, it is set to 5000; if above 180000, it is set to 180000.
    */
    @SerializedName("OcrAutoDetectTimeout")
    @Expose
    private Long OcrAutoDetectTimeout;

    /**
     * Get Country code. ISO 3166-1 Alpha-3 country/region code standard. 
     * @return Nationality Country code. ISO 3166-1 Alpha-3 country/region code standard.
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Country code. ISO 3166-1 Alpha-3 country/region code standard.
     * @param Nationality Country code. ISO 3166-1 Alpha-3 country/region code standard.
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Supported countries/regions and document types:

Mainland China: ID_CARD, PERMIT
Hong Kong: ID_CARD
Macao: ID_CARD
Hong Kong/Macao/Taiwan: MAINLAND_PERMIT, HMT_RESIDENT_PERMIT
Thailand: ID_CARD, THA_PINK_CARD
Indonesia: ID_CARD
Malaysia: ID_CARD
Singapore: ID_CARD
Philippines: PHL_UMID, PHL_VOTE_ID, PHL_TIN_ID, PHL_SSS_ID, DRIVING_LICENSE
Any country/region: PASSPORT 
     * @return CardType Supported countries/regions and document types:

Mainland China: ID_CARD, PERMIT
Hong Kong: ID_CARD
Macao: ID_CARD
Hong Kong/Macao/Taiwan: MAINLAND_PERMIT, HMT_RESIDENT_PERMIT
Thailand: ID_CARD, THA_PINK_CARD
Indonesia: ID_CARD
Malaysia: ID_CARD
Singapore: ID_CARD
Philippines: PHL_UMID, PHL_VOTE_ID, PHL_TIN_ID, PHL_SSS_ID, DRIVING_LICENSE
Any country/region: PASSPORT
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set Supported countries/regions and document types:

Mainland China: ID_CARD, PERMIT
Hong Kong: ID_CARD
Macao: ID_CARD
Hong Kong/Macao/Taiwan: MAINLAND_PERMIT, HMT_RESIDENT_PERMIT
Thailand: ID_CARD, THA_PINK_CARD
Indonesia: ID_CARD
Malaysia: ID_CARD
Singapore: ID_CARD
Philippines: PHL_UMID, PHL_VOTE_ID, PHL_TIN_ID, PHL_SSS_ID, DRIVING_LICENSE
Any country/region: PASSPORT
     * @param CardType Supported countries/regions and document types:

Mainland China: ID_CARD, PERMIT
Hong Kong: ID_CARD
Macao: ID_CARD
Hong Kong/Macao/Taiwan: MAINLAND_PERMIT, HMT_RESIDENT_PERMIT
Thailand: ID_CARD, THA_PINK_CARD
Indonesia: ID_CARD
Malaysia: ID_CARD
Singapore: ID_CARD
Philippines: PHL_UMID, PHL_VOTE_ID, PHL_TIN_ID, PHL_SSS_ID, DRIVING_LICENSE
Any country/region: PASSPORT
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get SDK-generated device-related encryption configuration information. 
     * @return EncryptedConfig SDK-generated device-related encryption configuration information.
     */
    public String getEncryptedConfig() {
        return this.EncryptedConfig;
    }

    /**
     * Set SDK-generated device-related encryption configuration information.
     * @param EncryptedConfig SDK-generated device-related encryption configuration information.
     */
    public void setEncryptedConfig(String EncryptedConfig) {
        this.EncryptedConfig = EncryptedConfig;
    }

    /**
     * Get <p>Whether to extract the portrait image from the document. false by default</p><p>Default value: false</p> 
     * @return ReturnHeadImage <p>Whether to extract the portrait image from the document. false by default</p><p>Default value: false</p>
     */
    public Boolean getReturnHeadImage() {
        return this.ReturnHeadImage;
    }

    /**
     * Set <p>Whether to extract the portrait image from the document. false by default</p><p>Default value: false</p>
     * @param ReturnHeadImage <p>Whether to extract the portrait image from the document. false by default</p><p>Default value: false</p>
     */
    public void setReturnHeadImage(Boolean ReturnHeadImage) {
        this.ReturnHeadImage = ReturnHeadImage;
    }

    /**
     * Get <p>Maximum number of token retries</p><p>Value range: [1, 5]</p><p>Default value: 3</p> 
     * @return RetryLimit <p>Maximum number of token retries</p><p>Value range: [1, 5]</p><p>Default value: 3</p>
     */
    public Long getRetryLimit() {
        return this.RetryLimit;
    }

    /**
     * Set <p>Maximum number of token retries</p><p>Value range: [1, 5]</p><p>Default value: 3</p>
     * @param RetryLimit <p>Maximum number of token retries</p><p>Value range: [1, 5]</p><p>Default value: 3</p>
     */
    public void setRetryLimit(Long RetryLimit) {
        this.RetryLimit = RetryLimit;
    }

    /**
     * Get <p>SDK capture mode</p><p>Enumeration values:</p><ul><li>OCR_DETECT_MANUAL: Photo recognition mode. The system performs recognition after you tap to take a photo.</li><li>OCR_DETECT_AUTO_MANUAL: Automatic recognition mode. The system recognizes automatically, and you can switch to photo recognition after a recognition timeout.</li><li>OCR_DETECT_AUTO: Pure automatic recognition mode. The system recognizes automatically, and you cannot switch to photo recognition after a recognition timeout.</li><li>OCR_DETECT_AUTO_MULTI: Pure automatic recognition mode (multiple images). The system turns on the flash and automatically collects multiple document photos.</li></ul><p>Default value: OCR_DETECT_AUTO_MANUAL</p> 
     * @return OcrModeType <p>SDK capture mode</p><p>Enumeration values:</p><ul><li>OCR_DETECT_MANUAL: Photo recognition mode. The system performs recognition after you tap to take a photo.</li><li>OCR_DETECT_AUTO_MANUAL: Automatic recognition mode. The system recognizes automatically, and you can switch to photo recognition after a recognition timeout.</li><li>OCR_DETECT_AUTO: Pure automatic recognition mode. The system recognizes automatically, and you cannot switch to photo recognition after a recognition timeout.</li><li>OCR_DETECT_AUTO_MULTI: Pure automatic recognition mode (multiple images). The system turns on the flash and automatically collects multiple document photos.</li></ul><p>Default value: OCR_DETECT_AUTO_MANUAL</p>
     */
    public String getOcrModeType() {
        return this.OcrModeType;
    }

    /**
     * Set <p>SDK capture mode</p><p>Enumeration values:</p><ul><li>OCR_DETECT_MANUAL: Photo recognition mode. The system performs recognition after you tap to take a photo.</li><li>OCR_DETECT_AUTO_MANUAL: Automatic recognition mode. The system recognizes automatically, and you can switch to photo recognition after a recognition timeout.</li><li>OCR_DETECT_AUTO: Pure automatic recognition mode. The system recognizes automatically, and you cannot switch to photo recognition after a recognition timeout.</li><li>OCR_DETECT_AUTO_MULTI: Pure automatic recognition mode (multiple images). The system turns on the flash and automatically collects multiple document photos.</li></ul><p>Default value: OCR_DETECT_AUTO_MANUAL</p>
     * @param OcrModeType <p>SDK capture mode</p><p>Enumeration values:</p><ul><li>OCR_DETECT_MANUAL: Photo recognition mode. The system performs recognition after you tap to take a photo.</li><li>OCR_DETECT_AUTO_MANUAL: Automatic recognition mode. The system recognizes automatically, and you can switch to photo recognition after a recognition timeout.</li><li>OCR_DETECT_AUTO: Pure automatic recognition mode. The system recognizes automatically, and you cannot switch to photo recognition after a recognition timeout.</li><li>OCR_DETECT_AUTO_MULTI: Pure automatic recognition mode (multiple images). The system turns on the flash and automatically collects multiple document photos.</li></ul><p>Default value: OCR_DETECT_AUTO_MANUAL</p>
     */
    public void setOcrModeType(String OcrModeType) {
        this.OcrModeType = OcrModeType;
    }

    /**
     * Get <p>Whether to allow uploading gallery images for recognition.</p><p>Default value: true</p> 
     * @return AllowUploadPhoto <p>Whether to allow uploading gallery images for recognition.</p><p>Default value: true</p>
     */
    public Boolean getAllowUploadPhoto() {
        return this.AllowUploadPhoto;
    }

    /**
     * Set <p>Whether to allow uploading gallery images for recognition.</p><p>Default value: true</p>
     * @param AllowUploadPhoto <p>Whether to allow uploading gallery images for recognition.</p><p>Default value: true</p>
     */
    public void setAllowUploadPhoto(Boolean AllowUploadPhoto) {
        this.AllowUploadPhoto = AllowUploadPhoto;
    }

    /**
     * Get <p>Whether to enable ID card photo cropping (remove extra edges outside the document and automatically correct the shooting angle). It is false by default and only applicable to Mainland ID cards.</p><p>Default value: false</p> 
     * @return CropIdCard <p>Whether to enable ID card photo cropping (remove extra edges outside the document and automatically correct the shooting angle). It is false by default and only applicable to Mainland ID cards.</p><p>Default value: false</p>
     */
    public Boolean getCropIdCard() {
        return this.CropIdCard;
    }

    /**
     * Set <p>Whether to enable ID card photo cropping (remove extra edges outside the document and automatically correct the shooting angle). It is false by default and only applicable to Mainland ID cards.</p><p>Default value: false</p>
     * @param CropIdCard <p>Whether to enable ID card photo cropping (remove extra edges outside the document and automatically correct the shooting angle). It is false by default and only applicable to Mainland ID cards.</p><p>Default value: false</p>
     */
    public void setCropIdCard(Boolean CropIdCard) {
        this.CropIdCard = CropIdCard;
    }

    /**
     * Get <p>SDK-supported recognition version mode</p><p>Enumeration values:</p><ul><li>BASIC: Basic version</li><li>ENHANCED: Enhanced version</li></ul><p>Default value: BASIC</p> 
     * @return SdkVersion <p>SDK-supported recognition version mode</p><p>Enumeration values:</p><ul><li>BASIC: Basic version</li><li>ENHANCED: Enhanced version</li></ul><p>Default value: BASIC</p>
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set <p>SDK-supported recognition version mode</p><p>Enumeration values:</p><ul><li>BASIC: Basic version</li><li>ENHANCED: Enhanced version</li></ul><p>Default value: BASIC</p>
     * @param SdkVersion <p>SDK-supported recognition version mode</p><p>Enumeration values:</p><ul><li>BASIC: Basic version</li><li>ENHANCED: Enhanced version</li></ul><p>Default value: BASIC</p>
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
    }

    /**
     * Get OCR automatic capture mode timeout (ms).
Value range: [5000, 180000].
Default value: 20000.
If the value is below 5000, it is set to 5000; if above 180000, it is set to 180000. 
     * @return OcrAutoDetectTimeout OCR automatic capture mode timeout (ms).
Value range: [5000, 180000].
Default value: 20000.
If the value is below 5000, it is set to 5000; if above 180000, it is set to 180000.
     */
    public Long getOcrAutoDetectTimeout() {
        return this.OcrAutoDetectTimeout;
    }

    /**
     * Set OCR automatic capture mode timeout (ms).
Value range: [5000, 180000].
Default value: 20000.
If the value is below 5000, it is set to 5000; if above 180000, it is set to 180000.
     * @param OcrAutoDetectTimeout OCR automatic capture mode timeout (ms).
Value range: [5000, 180000].
Default value: 20000.
If the value is below 5000, it is set to 5000; if above 180000, it is set to 180000.
     */
    public void setOcrAutoDetectTimeout(Long OcrAutoDetectTimeout) {
        this.OcrAutoDetectTimeout = OcrAutoDetectTimeout;
    }

    public ApplyOcrTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyOcrTokenRequest(ApplyOcrTokenRequest source) {
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.CardType != null) {
            this.CardType = new String(source.CardType);
        }
        if (source.EncryptedConfig != null) {
            this.EncryptedConfig = new String(source.EncryptedConfig);
        }
        if (source.ReturnHeadImage != null) {
            this.ReturnHeadImage = new Boolean(source.ReturnHeadImage);
        }
        if (source.RetryLimit != null) {
            this.RetryLimit = new Long(source.RetryLimit);
        }
        if (source.OcrModeType != null) {
            this.OcrModeType = new String(source.OcrModeType);
        }
        if (source.AllowUploadPhoto != null) {
            this.AllowUploadPhoto = new Boolean(source.AllowUploadPhoto);
        }
        if (source.CropIdCard != null) {
            this.CropIdCard = new Boolean(source.CropIdCard);
        }
        if (source.SdkVersion != null) {
            this.SdkVersion = new String(source.SdkVersion);
        }
        if (source.OcrAutoDetectTimeout != null) {
            this.OcrAutoDetectTimeout = new Long(source.OcrAutoDetectTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "EncryptedConfig", this.EncryptedConfig);
        this.setParamSimple(map, prefix + "ReturnHeadImage", this.ReturnHeadImage);
        this.setParamSimple(map, prefix + "RetryLimit", this.RetryLimit);
        this.setParamSimple(map, prefix + "OcrModeType", this.OcrModeType);
        this.setParamSimple(map, prefix + "AllowUploadPhoto", this.AllowUploadPhoto);
        this.setParamSimple(map, prefix + "CropIdCard", this.CropIdCard);
        this.setParamSimple(map, prefix + "SdkVersion", this.SdkVersion);
        this.setParamSimple(map, prefix + "OcrAutoDetectTimeout", this.OcrAutoDetectTimeout);

    }
}

