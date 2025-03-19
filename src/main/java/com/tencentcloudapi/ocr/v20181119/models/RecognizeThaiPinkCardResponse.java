/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class RecognizeThaiPinkCardResponse extends AbstractModel {

    /**
    * Country
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * ID number
    */
    @SerializedName("IDNumber")
    @Expose
    private String IDNumber;

    /**
    * Name in Thai
    */
    @SerializedName("ThaiName")
    @Expose
    private String ThaiName;

    /**
    * Name in English
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * Surname in Thai
    */
    @SerializedName("ThaiSurName")
    @Expose
    private String ThaiSurName;

    /**
    * Date of birth in Thai
    */
    @SerializedName("ThaiDOB")
    @Expose
    private String ThaiDOB;

    /**
    * Date of birth in English
    */
    @SerializedName("EnDOB")
    @Expose
    private String EnDOB;

    /**
    * Photo number
    */
    @SerializedName("PhotoNumber")
    @Expose
    private String PhotoNumber;

    /**
    * Address in Thai
    */
    @SerializedName("ThaiAddress")
    @Expose
    private String ThaiAddress;

    /**
    * Date of issue in Thai
    */
    @SerializedName("ThaiDateOfIssue")
    @Expose
    private String ThaiDateOfIssue;

    /**
    * Date of issue in English
    */
    @SerializedName("DateOfIssue")
    @Expose
    private String DateOfIssue;

    /**
    * Expiration date in Thai
    */
    @SerializedName("ThaiDateOfExpiry")
    @Expose
    private String ThaiDateOfExpiry;

    /**
    * Expiration date in English
    */
    @SerializedName("DateOfExpiry")
    @Expose
    private String DateOfExpiry;

    /**
    * Issuing agency
    */
    @SerializedName("IssuingAgency")
    @Expose
    private String IssuingAgency;

    /**
    * Ref number
    */
    @SerializedName("RefNumber")
    @Expose
    private String RefNumber;

    /**
    * Field confidence:
 { "ID": { "Confidence": 0.9999 }, "ThaiName": { "Confidence": 0.9996 } }
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * Identity photo
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
    * Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Country 
     * @return Country Country
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set Country
     * @param Country Country
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get ID number 
     * @return IDNumber ID number
     */
    public String getIDNumber() {
        return this.IDNumber;
    }

    /**
     * Set ID number
     * @param IDNumber ID number
     */
    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    /**
     * Get Name in Thai 
     * @return ThaiName Name in Thai
     */
    public String getThaiName() {
        return this.ThaiName;
    }

    /**
     * Set Name in Thai
     * @param ThaiName Name in Thai
     */
    public void setThaiName(String ThaiName) {
        this.ThaiName = ThaiName;
    }

    /**
     * Get Name in English 
     * @return EnName Name in English
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set Name in English
     * @param EnName Name in English
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get Surname in Thai 
     * @return ThaiSurName Surname in Thai
     */
    public String getThaiSurName() {
        return this.ThaiSurName;
    }

    /**
     * Set Surname in Thai
     * @param ThaiSurName Surname in Thai
     */
    public void setThaiSurName(String ThaiSurName) {
        this.ThaiSurName = ThaiSurName;
    }

    /**
     * Get Date of birth in Thai 
     * @return ThaiDOB Date of birth in Thai
     */
    public String getThaiDOB() {
        return this.ThaiDOB;
    }

    /**
     * Set Date of birth in Thai
     * @param ThaiDOB Date of birth in Thai
     */
    public void setThaiDOB(String ThaiDOB) {
        this.ThaiDOB = ThaiDOB;
    }

    /**
     * Get Date of birth in English 
     * @return EnDOB Date of birth in English
     */
    public String getEnDOB() {
        return this.EnDOB;
    }

    /**
     * Set Date of birth in English
     * @param EnDOB Date of birth in English
     */
    public void setEnDOB(String EnDOB) {
        this.EnDOB = EnDOB;
    }

    /**
     * Get Photo number 
     * @return PhotoNumber Photo number
     */
    public String getPhotoNumber() {
        return this.PhotoNumber;
    }

    /**
     * Set Photo number
     * @param PhotoNumber Photo number
     */
    public void setPhotoNumber(String PhotoNumber) {
        this.PhotoNumber = PhotoNumber;
    }

    /**
     * Get Address in Thai 
     * @return ThaiAddress Address in Thai
     */
    public String getThaiAddress() {
        return this.ThaiAddress;
    }

    /**
     * Set Address in Thai
     * @param ThaiAddress Address in Thai
     */
    public void setThaiAddress(String ThaiAddress) {
        this.ThaiAddress = ThaiAddress;
    }

    /**
     * Get Date of issue in Thai 
     * @return ThaiDateOfIssue Date of issue in Thai
     */
    public String getThaiDateOfIssue() {
        return this.ThaiDateOfIssue;
    }

    /**
     * Set Date of issue in Thai
     * @param ThaiDateOfIssue Date of issue in Thai
     */
    public void setThaiDateOfIssue(String ThaiDateOfIssue) {
        this.ThaiDateOfIssue = ThaiDateOfIssue;
    }

    /**
     * Get Date of issue in English 
     * @return DateOfIssue Date of issue in English
     */
    public String getDateOfIssue() {
        return this.DateOfIssue;
    }

    /**
     * Set Date of issue in English
     * @param DateOfIssue Date of issue in English
     */
    public void setDateOfIssue(String DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
    }

    /**
     * Get Expiration date in Thai 
     * @return ThaiDateOfExpiry Expiration date in Thai
     */
    public String getThaiDateOfExpiry() {
        return this.ThaiDateOfExpiry;
    }

    /**
     * Set Expiration date in Thai
     * @param ThaiDateOfExpiry Expiration date in Thai
     */
    public void setThaiDateOfExpiry(String ThaiDateOfExpiry) {
        this.ThaiDateOfExpiry = ThaiDateOfExpiry;
    }

    /**
     * Get Expiration date in English 
     * @return DateOfExpiry Expiration date in English
     */
    public String getDateOfExpiry() {
        return this.DateOfExpiry;
    }

    /**
     * Set Expiration date in English
     * @param DateOfExpiry Expiration date in English
     */
    public void setDateOfExpiry(String DateOfExpiry) {
        this.DateOfExpiry = DateOfExpiry;
    }

    /**
     * Get Issuing agency 
     * @return IssuingAgency Issuing agency
     */
    public String getIssuingAgency() {
        return this.IssuingAgency;
    }

    /**
     * Set Issuing agency
     * @param IssuingAgency Issuing agency
     */
    public void setIssuingAgency(String IssuingAgency) {
        this.IssuingAgency = IssuingAgency;
    }

    /**
     * Get Ref number 
     * @return RefNumber Ref number
     */
    public String getRefNumber() {
        return this.RefNumber;
    }

    /**
     * Set Ref number
     * @param RefNumber Ref number
     */
    public void setRefNumber(String RefNumber) {
        this.RefNumber = RefNumber;
    }

    /**
     * Get Field confidence:
 { "ID": { "Confidence": 0.9999 }, "ThaiName": { "Confidence": 0.9996 } } 
     * @return AdvancedInfo Field confidence:
 { "ID": { "Confidence": 0.9999 }, "ThaiName": { "Confidence": 0.9996 } }
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set Field confidence:
 { "ID": { "Confidence": 0.9999 }, "ThaiName": { "Confidence": 0.9996 } }
     * @param AdvancedInfo Field confidence:
 { "ID": { "Confidence": 0.9999 }, "ThaiName": { "Confidence": 0.9996 } }
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get Identity photo 
     * @return PortraitImage Identity photo
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set Identity photo
     * @param PortraitImage Identity photo
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    /**
     * Get Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled. 
     * @return WarnCardInfos Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     * @param WarnCardInfos Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeThaiPinkCardResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeThaiPinkCardResponse(RecognizeThaiPinkCardResponse source) {
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.IDNumber != null) {
            this.IDNumber = new String(source.IDNumber);
        }
        if (source.ThaiName != null) {
            this.ThaiName = new String(source.ThaiName);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.ThaiSurName != null) {
            this.ThaiSurName = new String(source.ThaiSurName);
        }
        if (source.ThaiDOB != null) {
            this.ThaiDOB = new String(source.ThaiDOB);
        }
        if (source.EnDOB != null) {
            this.EnDOB = new String(source.EnDOB);
        }
        if (source.PhotoNumber != null) {
            this.PhotoNumber = new String(source.PhotoNumber);
        }
        if (source.ThaiAddress != null) {
            this.ThaiAddress = new String(source.ThaiAddress);
        }
        if (source.ThaiDateOfIssue != null) {
            this.ThaiDateOfIssue = new String(source.ThaiDateOfIssue);
        }
        if (source.DateOfIssue != null) {
            this.DateOfIssue = new String(source.DateOfIssue);
        }
        if (source.ThaiDateOfExpiry != null) {
            this.ThaiDateOfExpiry = new String(source.ThaiDateOfExpiry);
        }
        if (source.DateOfExpiry != null) {
            this.DateOfExpiry = new String(source.DateOfExpiry);
        }
        if (source.IssuingAgency != null) {
            this.IssuingAgency = new String(source.IssuingAgency);
        }
        if (source.RefNumber != null) {
            this.RefNumber = new String(source.RefNumber);
        }
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
        }
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
        if (source.WarnCardInfos != null) {
            this.WarnCardInfos = new Long[source.WarnCardInfos.length];
            for (int i = 0; i < source.WarnCardInfos.length; i++) {
                this.WarnCardInfos[i] = new Long(source.WarnCardInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "IDNumber", this.IDNumber);
        this.setParamSimple(map, prefix + "ThaiName", this.ThaiName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "ThaiSurName", this.ThaiSurName);
        this.setParamSimple(map, prefix + "ThaiDOB", this.ThaiDOB);
        this.setParamSimple(map, prefix + "EnDOB", this.EnDOB);
        this.setParamSimple(map, prefix + "PhotoNumber", this.PhotoNumber);
        this.setParamSimple(map, prefix + "ThaiAddress", this.ThaiAddress);
        this.setParamSimple(map, prefix + "ThaiDateOfIssue", this.ThaiDateOfIssue);
        this.setParamSimple(map, prefix + "DateOfIssue", this.DateOfIssue);
        this.setParamSimple(map, prefix + "ThaiDateOfExpiry", this.ThaiDateOfExpiry);
        this.setParamSimple(map, prefix + "DateOfExpiry", this.DateOfExpiry);
        this.setParamSimple(map, prefix + "IssuingAgency", this.IssuingAgency);
        this.setParamSimple(map, prefix + "RefNumber", this.RefNumber);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);
        this.setParamArraySimple(map, prefix + "WarnCardInfos.", this.WarnCardInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

