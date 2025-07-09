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

public class IDCardOCRResponse extends AbstractModel {

    /**
    * Name (profile photo side)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Gender (profile photo side)
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Ethnicity (profile photo side)
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * Date of birth (profile photo side)
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * Address (profile photo side)
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * ID number (profile photo side)
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * Issuing authority (national emblem side)
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * Validity period (national emblem side)
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * Extended information, which will be returned only when requested. For the input parameters, please see example 3 and example 4.
`IdCard`: Base64-encoded content of the cropped ID card photo, which will be returned if `Config.CropIdCard` is set to `true`.
`Portrait`: Base64-encoded content of the ID photo on the card, which will be returned if `Config.CropPortrait` is set to `true`.

`Quality`: Image quality score, which will be returned if `Config.Quality` is set to `true`. Value range: 0–100. The lower the score, the blurrier the image. The recommended threshold is ≥ 50.
`BorderCodeValue`: Warning threshold score for incomplete ID card borders, which will be returned if `Config.BorderCheckWarn` is set to `true`. Value range: 0–100. The lower the score, the lower the probability of border occlusion. The recommended threshold value is ≤ 50.

`WarnInfos`: Warning information. Warning codes and descriptions are as follows:
-9100: The ID card validity period is invalid.
-9101: The ID card borders are incomplete.
-9102: The ID card image is photocopied.
-9103: The ID card image is spoofed. 
-9104: The ID card is a temporary one. 
-9105: The ID card frame is occluded.
-9106: The ID card image is photoshopped.
-9107: The ID card image has glares.
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Name (profile photo side) 
     * @return Name Name (profile photo side)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name (profile photo side)
     * @param Name Name (profile photo side)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Gender (profile photo side) 
     * @return Sex Gender (profile photo side)
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender (profile photo side)
     * @param Sex Gender (profile photo side)
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Ethnicity (profile photo side) 
     * @return Nation Ethnicity (profile photo side)
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set Ethnicity (profile photo side)
     * @param Nation Ethnicity (profile photo side)
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get Date of birth (profile photo side) 
     * @return Birth Date of birth (profile photo side)
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set Date of birth (profile photo side)
     * @param Birth Date of birth (profile photo side)
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get Address (profile photo side) 
     * @return Address Address (profile photo side)
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address (profile photo side)
     * @param Address Address (profile photo side)
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get ID number (profile photo side) 
     * @return IdNum ID number (profile photo side)
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set ID number (profile photo side)
     * @param IdNum ID number (profile photo side)
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get Issuing authority (national emblem side) 
     * @return Authority Issuing authority (national emblem side)
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set Issuing authority (national emblem side)
     * @param Authority Issuing authority (national emblem side)
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get Validity period (national emblem side) 
     * @return ValidDate Validity period (national emblem side)
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set Validity period (national emblem side)
     * @param ValidDate Validity period (national emblem side)
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get Extended information, which will be returned only when requested. For the input parameters, please see example 3 and example 4.
`IdCard`: Base64-encoded content of the cropped ID card photo, which will be returned if `Config.CropIdCard` is set to `true`.
`Portrait`: Base64-encoded content of the ID photo on the card, which will be returned if `Config.CropPortrait` is set to `true`.

`Quality`: Image quality score, which will be returned if `Config.Quality` is set to `true`. Value range: 0–100. The lower the score, the blurrier the image. The recommended threshold is ≥ 50.
`BorderCodeValue`: Warning threshold score for incomplete ID card borders, which will be returned if `Config.BorderCheckWarn` is set to `true`. Value range: 0–100. The lower the score, the lower the probability of border occlusion. The recommended threshold value is ≤ 50.

`WarnInfos`: Warning information. Warning codes and descriptions are as follows:
-9100: The ID card validity period is invalid.
-9101: The ID card borders are incomplete.
-9102: The ID card image is photocopied.
-9103: The ID card image is spoofed. 
-9104: The ID card is a temporary one. 
-9105: The ID card frame is occluded.
-9106: The ID card image is photoshopped.
-9107: The ID card image has glares. 
     * @return AdvancedInfo Extended information, which will be returned only when requested. For the input parameters, please see example 3 and example 4.
`IdCard`: Base64-encoded content of the cropped ID card photo, which will be returned if `Config.CropIdCard` is set to `true`.
`Portrait`: Base64-encoded content of the ID photo on the card, which will be returned if `Config.CropPortrait` is set to `true`.

`Quality`: Image quality score, which will be returned if `Config.Quality` is set to `true`. Value range: 0–100. The lower the score, the blurrier the image. The recommended threshold is ≥ 50.
`BorderCodeValue`: Warning threshold score for incomplete ID card borders, which will be returned if `Config.BorderCheckWarn` is set to `true`. Value range: 0–100. The lower the score, the lower the probability of border occlusion. The recommended threshold value is ≤ 50.

`WarnInfos`: Warning information. Warning codes and descriptions are as follows:
-9100: The ID card validity period is invalid.
-9101: The ID card borders are incomplete.
-9102: The ID card image is photocopied.
-9103: The ID card image is spoofed. 
-9104: The ID card is a temporary one. 
-9105: The ID card frame is occluded.
-9106: The ID card image is photoshopped.
-9107: The ID card image has glares.
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set Extended information, which will be returned only when requested. For the input parameters, please see example 3 and example 4.
`IdCard`: Base64-encoded content of the cropped ID card photo, which will be returned if `Config.CropIdCard` is set to `true`.
`Portrait`: Base64-encoded content of the ID photo on the card, which will be returned if `Config.CropPortrait` is set to `true`.

`Quality`: Image quality score, which will be returned if `Config.Quality` is set to `true`. Value range: 0–100. The lower the score, the blurrier the image. The recommended threshold is ≥ 50.
`BorderCodeValue`: Warning threshold score for incomplete ID card borders, which will be returned if `Config.BorderCheckWarn` is set to `true`. Value range: 0–100. The lower the score, the lower the probability of border occlusion. The recommended threshold value is ≤ 50.

`WarnInfos`: Warning information. Warning codes and descriptions are as follows:
-9100: The ID card validity period is invalid.
-9101: The ID card borders are incomplete.
-9102: The ID card image is photocopied.
-9103: The ID card image is spoofed. 
-9104: The ID card is a temporary one. 
-9105: The ID card frame is occluded.
-9106: The ID card image is photoshopped.
-9107: The ID card image has glares.
     * @param AdvancedInfo Extended information, which will be returned only when requested. For the input parameters, please see example 3 and example 4.
`IdCard`: Base64-encoded content of the cropped ID card photo, which will be returned if `Config.CropIdCard` is set to `true`.
`Portrait`: Base64-encoded content of the ID photo on the card, which will be returned if `Config.CropPortrait` is set to `true`.

`Quality`: Image quality score, which will be returned if `Config.Quality` is set to `true`. Value range: 0–100. The lower the score, the blurrier the image. The recommended threshold is ≥ 50.
`BorderCodeValue`: Warning threshold score for incomplete ID card borders, which will be returned if `Config.BorderCheckWarn` is set to `true`. Value range: 0–100. The lower the score, the lower the probability of border occlusion. The recommended threshold value is ≤ 50.

`WarnInfos`: Warning information. Warning codes and descriptions are as follows:
-9100: The ID card validity period is invalid.
-9101: The ID card borders are incomplete.
-9102: The ID card image is photocopied.
-9103: The ID card image is spoofed. 
-9104: The ID card is a temporary one. 
-9105: The ID card frame is occluded.
-9106: The ID card image is photoshopped.
-9107: The ID card image has glares.
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public IDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IDCardOCRResponse(IDCardOCRResponse source) {
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
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
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
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

