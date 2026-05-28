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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWxNFCResultResponse extends AbstractModel {

    /**
    * <p>NFC billing result code. Each successful NFC read is billed once (duplicate billing does not occur for repeated pull of the same NFC request). Permissible range of billing result codes:<br>  0: Read successful, billed<br>-1: Read fail, free of charge</p>
    */
    @SerializedName("ResultCode")
    @Expose
    private String ResultCode;

    /**
    * <p>Identity card number</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * <p>name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Portrait photo in the document</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Picture")
    @Expose
    private String Picture;

    /**
    * <p>Front photo of the identity document (portrait side)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdCardFrontImg")
    @Expose
    private String IdCardFrontImg;

    /**
    * <p>Photo of the back of an identity document (national emblem side)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdCardBackImg")
    @Expose
    private String IdCardBackImg;

    /**
    * <p>Date of birth</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BirthDate")
    @Expose
    private String BirthDate;

    /**
    * <p>Validity start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>Validity end time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>Ethnicity</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * <p>Gender</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>Document type</p><p>Enumeration value:</p><ul><li>01: ID card</li><li>03: Chinese passport</li><li>06: Hong Kong and Macau travel permit</li><li>07: Taiwan travel permit</li><li>08: Foreign passport</li><li>13: Permanent residence permit for foreigners</li><li>14: Residence Permit for Hong Kong (China), Macao (China), and Taiwan (China) residents</li><li>15: Return Home Permit</li><li>16: Travel permit for Chinese mainland residents to Taiwan (China)</li><li>99: Other documents</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdType")
    @Expose
    private String IdType;

    /**
    * <p>English name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * <p>Issuing authority</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SigningOrganization")
    @Expose
    private String SigningOrganization;

    /**
    * <p>Residence Permit for residents of Hong Kong (China), Macao (China) and Taiwan (China), passport number</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OtherIdNum")
    @Expose
    private String OtherIdNum;

    /**
    * <p>Travel document nationality</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * <p>Characters 29 to 42 in the second line of the machine-readable zone of the travel document</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PersonalNumber")
    @Expose
    private String PersonalNumber;

    /**
    * <p>Verification result of the document</p><ul><li>JSON format as follows: {"result_issuer":"issuer certificate legitimacy verification result","result_paper":"Document security object legitimacy verification result","result_data":"data tampering prevention verification result","result_chip":"chip replication prevention verification result"}. - Value ranges from 0 to 3: 0: verified, 1: verification failed, 2: unverified, 3: partially passed. When all four verification results are 0, it means the document is genuine.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckMRTD")
    @Expose
    private String CheckMRTD;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>NFC billing result code. Each successful NFC read is billed once (duplicate billing does not occur for repeated pull of the same NFC request). Permissible range of billing result codes:<br>  0: Read successful, billed<br>-1: Read fail, free of charge</p> 
     * @return ResultCode <p>NFC billing result code. Each successful NFC read is billed once (duplicate billing does not occur for repeated pull of the same NFC request). Permissible range of billing result codes:<br>  0: Read successful, billed<br>-1: Read fail, free of charge</p>
     */
    public String getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set <p>NFC billing result code. Each successful NFC read is billed once (duplicate billing does not occur for repeated pull of the same NFC request). Permissible range of billing result codes:<br>  0: Read successful, billed<br>-1: Read fail, free of charge</p>
     * @param ResultCode <p>NFC billing result code. Each successful NFC read is billed once (duplicate billing does not occur for repeated pull of the same NFC request). Permissible range of billing result codes:<br>  0: Read successful, billed<br>-1: Read fail, free of charge</p>
     */
    public void setResultCode(String ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get <p>Identity card number</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdNum <p>Identity card number</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set <p>Identity card number</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdNum <p>Identity card number</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get <p>name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name <p>name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name <p>name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Portrait photo in the document</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Picture <p>Portrait photo in the document</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPicture() {
        return this.Picture;
    }

    /**
     * Set <p>Portrait photo in the document</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Picture <p>Portrait photo in the document</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    /**
     * Get <p>Front photo of the identity document (portrait side)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdCardFrontImg <p>Front photo of the identity document (portrait side)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdCardFrontImg() {
        return this.IdCardFrontImg;
    }

    /**
     * Set <p>Front photo of the identity document (portrait side)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdCardFrontImg <p>Front photo of the identity document (portrait side)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdCardFrontImg(String IdCardFrontImg) {
        this.IdCardFrontImg = IdCardFrontImg;
    }

    /**
     * Get <p>Photo of the back of an identity document (national emblem side)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdCardBackImg <p>Photo of the back of an identity document (national emblem side)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdCardBackImg() {
        return this.IdCardBackImg;
    }

    /**
     * Set <p>Photo of the back of an identity document (national emblem side)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdCardBackImg <p>Photo of the back of an identity document (national emblem side)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdCardBackImg(String IdCardBackImg) {
        this.IdCardBackImg = IdCardBackImg;
    }

    /**
     * Get <p>Date of birth</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BirthDate <p>Date of birth</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthDate() {
        return this.BirthDate;
    }

    /**
     * Set <p>Date of birth</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BirthDate <p>Date of birth</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * Get <p>Validity start time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BeginTime <p>Validity start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>Validity start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BeginTime <p>Validity start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>Validity end time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime <p>Validity end time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Validity end time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime <p>Validity end time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>Ethnicity</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nation <p>Ethnicity</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set <p>Ethnicity</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nation <p>Ethnicity</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get <p>Gender</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex <p>Gender</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>Gender</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex <p>Gender</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>Document type</p><p>Enumeration value:</p><ul><li>01: ID card</li><li>03: Chinese passport</li><li>06: Hong Kong and Macau travel permit</li><li>07: Taiwan travel permit</li><li>08: Foreign passport</li><li>13: Permanent residence permit for foreigners</li><li>14: Residence Permit for Hong Kong (China), Macao (China), and Taiwan (China) residents</li><li>15: Return Home Permit</li><li>16: Travel permit for Chinese mainland residents to Taiwan (China)</li><li>99: Other documents</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdType <p>Document type</p><p>Enumeration value:</p><ul><li>01: ID card</li><li>03: Chinese passport</li><li>06: Hong Kong and Macau travel permit</li><li>07: Taiwan travel permit</li><li>08: Foreign passport</li><li>13: Permanent residence permit for foreigners</li><li>14: Residence Permit for Hong Kong (China), Macao (China), and Taiwan (China) residents</li><li>15: Return Home Permit</li><li>16: Travel permit for Chinese mainland residents to Taiwan (China)</li><li>99: Other documents</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdType() {
        return this.IdType;
    }

    /**
     * Set <p>Document type</p><p>Enumeration value:</p><ul><li>01: ID card</li><li>03: Chinese passport</li><li>06: Hong Kong and Macau travel permit</li><li>07: Taiwan travel permit</li><li>08: Foreign passport</li><li>13: Permanent residence permit for foreigners</li><li>14: Residence Permit for Hong Kong (China), Macao (China), and Taiwan (China) residents</li><li>15: Return Home Permit</li><li>16: Travel permit for Chinese mainland residents to Taiwan (China)</li><li>99: Other documents</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdType <p>Document type</p><p>Enumeration value:</p><ul><li>01: ID card</li><li>03: Chinese passport</li><li>06: Hong Kong and Macau travel permit</li><li>07: Taiwan travel permit</li><li>08: Foreign passport</li><li>13: Permanent residence permit for foreigners</li><li>14: Residence Permit for Hong Kong (China), Macao (China), and Taiwan (China) residents</li><li>15: Return Home Permit</li><li>16: Travel permit for Chinese mainland residents to Taiwan (China)</li><li>99: Other documents</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    /**
     * Get <p>English name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnName <p>English name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set <p>English name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnName <p>English name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get <p>Issuing authority</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SigningOrganization <p>Issuing authority</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSigningOrganization() {
        return this.SigningOrganization;
    }

    /**
     * Set <p>Issuing authority</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SigningOrganization <p>Issuing authority</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSigningOrganization(String SigningOrganization) {
        this.SigningOrganization = SigningOrganization;
    }

    /**
     * Get <p>Residence Permit for residents of Hong Kong (China), Macao (China) and Taiwan (China), passport number</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OtherIdNum <p>Residence Permit for residents of Hong Kong (China), Macao (China) and Taiwan (China), passport number</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOtherIdNum() {
        return this.OtherIdNum;
    }

    /**
     * Set <p>Residence Permit for residents of Hong Kong (China), Macao (China) and Taiwan (China), passport number</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OtherIdNum <p>Residence Permit for residents of Hong Kong (China), Macao (China) and Taiwan (China), passport number</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOtherIdNum(String OtherIdNum) {
        this.OtherIdNum = OtherIdNum;
    }

    /**
     * Get <p>Travel document nationality</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nationality <p>Travel document nationality</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set <p>Travel document nationality</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nationality <p>Travel document nationality</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get <p>Characters 29 to 42 in the second line of the machine-readable zone of the travel document</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PersonalNumber <p>Characters 29 to 42 in the second line of the machine-readable zone of the travel document</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPersonalNumber() {
        return this.PersonalNumber;
    }

    /**
     * Set <p>Characters 29 to 42 in the second line of the machine-readable zone of the travel document</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PersonalNumber <p>Characters 29 to 42 in the second line of the machine-readable zone of the travel document</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPersonalNumber(String PersonalNumber) {
        this.PersonalNumber = PersonalNumber;
    }

    /**
     * Get <p>Verification result of the document</p><ul><li>JSON format as follows: {"result_issuer":"issuer certificate legitimacy verification result","result_paper":"Document security object legitimacy verification result","result_data":"data tampering prevention verification result","result_chip":"chip replication prevention verification result"}. - Value ranges from 0 to 3: 0: verified, 1: verification failed, 2: unverified, 3: partially passed. When all four verification results are 0, it means the document is genuine.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckMRTD <p>Verification result of the document</p><ul><li>JSON format as follows: {"result_issuer":"issuer certificate legitimacy verification result","result_paper":"Document security object legitimacy verification result","result_data":"data tampering prevention verification result","result_chip":"chip replication prevention verification result"}. - Value ranges from 0 to 3: 0: verified, 1: verification failed, 2: unverified, 3: partially passed. When all four verification results are 0, it means the document is genuine.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCheckMRTD() {
        return this.CheckMRTD;
    }

    /**
     * Set <p>Verification result of the document</p><ul><li>JSON format as follows: {"result_issuer":"issuer certificate legitimacy verification result","result_paper":"Document security object legitimacy verification result","result_data":"data tampering prevention verification result","result_chip":"chip replication prevention verification result"}. - Value ranges from 0 to 3: 0: verified, 1: verification failed, 2: unverified, 3: partially passed. When all four verification results are 0, it means the document is genuine.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckMRTD <p>Verification result of the document</p><ul><li>JSON format as follows: {"result_issuer":"issuer certificate legitimacy verification result","result_paper":"Document security object legitimacy verification result","result_data":"data tampering prevention verification result","result_chip":"chip replication prevention verification result"}. - Value ranges from 0 to 3: 0: verified, 1: verification failed, 2: unverified, 3: partially passed. When all four verification results are 0, it means the document is genuine.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckMRTD(String CheckMRTD) {
        this.CheckMRTD = CheckMRTD;
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

    public GetWxNFCResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWxNFCResultResponse(GetWxNFCResultResponse source) {
        if (source.ResultCode != null) {
            this.ResultCode = new String(source.ResultCode);
        }
        if (source.IdNum != null) {
            this.IdNum = new String(source.IdNum);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Picture != null) {
            this.Picture = new String(source.Picture);
        }
        if (source.IdCardFrontImg != null) {
            this.IdCardFrontImg = new String(source.IdCardFrontImg);
        }
        if (source.IdCardBackImg != null) {
            this.IdCardBackImg = new String(source.IdCardBackImg);
        }
        if (source.BirthDate != null) {
            this.BirthDate = new String(source.BirthDate);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.IdType != null) {
            this.IdType = new String(source.IdType);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.SigningOrganization != null) {
            this.SigningOrganization = new String(source.SigningOrganization);
        }
        if (source.OtherIdNum != null) {
            this.OtherIdNum = new String(source.OtherIdNum);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.PersonalNumber != null) {
            this.PersonalNumber = new String(source.PersonalNumber);
        }
        if (source.CheckMRTD != null) {
            this.CheckMRTD = new String(source.CheckMRTD);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Picture", this.Picture);
        this.setParamSimple(map, prefix + "IdCardFrontImg", this.IdCardFrontImg);
        this.setParamSimple(map, prefix + "IdCardBackImg", this.IdCardBackImg);
        this.setParamSimple(map, prefix + "BirthDate", this.BirthDate);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "SigningOrganization", this.SigningOrganization);
        this.setParamSimple(map, prefix + "OtherIdNum", this.OtherIdNum);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "PersonalNumber", this.PersonalNumber);
        this.setParamSimple(map, prefix + "CheckMRTD", this.CheckMRTD);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

