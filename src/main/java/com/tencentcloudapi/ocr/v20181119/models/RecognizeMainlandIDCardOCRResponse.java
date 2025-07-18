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

public class RecognizeMainlandIDCardOCRResponse extends AbstractModel {

    /**
    * Name((portrait side))
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sex((portrait side))
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Nation((portrait side))
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * Brithday((portrait side))
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * Address(portrait side)
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * ID number (portrait side)
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * Card authority(national emblem side)
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * Card valid date (national emblem side)
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * Portrait image base64
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
    * ID card photo cropping results base64
    */
    @SerializedName("IdCardImage")
    @Expose
    private String IdCardImage;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Name((portrait side)) 
     * @return Name Name((portrait side))
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name((portrait side))
     * @param Name Name((portrait side))
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Sex((portrait side)) 
     * @return Sex Sex((portrait side))
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Sex((portrait side))
     * @param Sex Sex((portrait side))
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Nation((portrait side)) 
     * @return Nation Nation((portrait side))
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set Nation((portrait side))
     * @param Nation Nation((portrait side))
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get Brithday((portrait side)) 
     * @return Birth Brithday((portrait side))
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set Brithday((portrait side))
     * @param Birth Brithday((portrait side))
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get Address(portrait side) 
     * @return Address Address(portrait side)
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address(portrait side)
     * @param Address Address(portrait side)
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get ID number (portrait side) 
     * @return IdNum ID number (portrait side)
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set ID number (portrait side)
     * @param IdNum ID number (portrait side)
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get Card authority(national emblem side) 
     * @return Authority Card authority(national emblem side)
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set Card authority(national emblem side)
     * @param Authority Card authority(national emblem side)
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get Card valid date (national emblem side) 
     * @return ValidDate Card valid date (national emblem side)
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set Card valid date (national emblem side)
     * @param ValidDate Card valid date (national emblem side)
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled. 
     * @return WarnCardInfos Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
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
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     * @param WarnCardInfos Card Warning Information

-9101 Alarm for covered certificate,
-9102 Alarm for photocopied certificate,
-9103 Alarm for photographed certificate,
-9104 Alarm for PS certificate,
-9107 Alarm for reflective certificate,
-9108 Alarm for blurry image,
-9109 This capability is not enabled.
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
    }

    /**
     * Get Portrait image base64 
     * @return PortraitImage Portrait image base64
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set Portrait image base64
     * @param PortraitImage Portrait image base64
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    /**
     * Get ID card photo cropping results base64 
     * @return IdCardImage ID card photo cropping results base64
     */
    public String getIdCardImage() {
        return this.IdCardImage;
    }

    /**
     * Set ID card photo cropping results base64
     * @param IdCardImage ID card photo cropping results base64
     */
    public void setIdCardImage(String IdCardImage) {
        this.IdCardImage = IdCardImage;
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

    public RecognizeMainlandIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeMainlandIDCardOCRResponse(RecognizeMainlandIDCardOCRResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.Birth != null) {
            this.Birth = new String(source.Birth);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.IdNum != null) {
            this.IdNum = new String(source.IdNum);
        }
        if (source.Authority != null) {
            this.Authority = new String(source.Authority);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.WarnCardInfos != null) {
            this.WarnCardInfos = new Long[source.WarnCardInfos.length];
            for (int i = 0; i < source.WarnCardInfos.length; i++) {
                this.WarnCardInfos[i] = new Long(source.WarnCardInfos[i]);
            }
        }
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
        if (source.IdCardImage != null) {
            this.IdCardImage = new String(source.IdCardImage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Authority", this.Authority);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamArraySimple(map, prefix + "WarnCardInfos.", this.WarnCardInfos);
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);
        this.setParamSimple(map, prefix + "IdCardImage", this.IdCardImage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

