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

public class HmtResidentPermitOCRResponse extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Gender
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Date of birth
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * Address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * ID card number
    */
    @SerializedName("IdCardNo")
    @Expose
    private String IdCardNo;

    /**
    * 0: Front side.
1: Back side.
    */
    @SerializedName("CardType")
    @Expose
    private Long CardType;

    /**
    * Validity period
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * Issuing authority
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * Number of issues
    */
    @SerializedName("VisaNum")
    @Expose
    private String VisaNum;

    /**
    * Permit number
    */
    @SerializedName("PassNo")
    @Expose
    private String PassNo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Gender 
     * @return Sex Gender
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender
     * @param Sex Gender
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Date of birth 
     * @return Birth Date of birth
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * Set Date of birth
     * @param Birth Date of birth
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * Get Address 
     * @return Address Address
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
     * @param Address Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get ID card number 
     * @return IdCardNo ID card number
     */
    public String getIdCardNo() {
        return this.IdCardNo;
    }

    /**
     * Set ID card number
     * @param IdCardNo ID card number
     */
    public void setIdCardNo(String IdCardNo) {
        this.IdCardNo = IdCardNo;
    }

    /**
     * Get 0: Front side.
1: Back side. 
     * @return CardType 0: Front side.
1: Back side.
     */
    public Long getCardType() {
        return this.CardType;
    }

    /**
     * Set 0: Front side.
1: Back side.
     * @param CardType 0: Front side.
1: Back side.
     */
    public void setCardType(Long CardType) {
        this.CardType = CardType;
    }

    /**
     * Get Validity period 
     * @return ValidDate Validity period
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set Validity period
     * @param ValidDate Validity period
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get Issuing authority 
     * @return Authority Issuing authority
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set Issuing authority
     * @param Authority Issuing authority
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get Number of issues 
     * @return VisaNum Number of issues
     */
    public String getVisaNum() {
        return this.VisaNum;
    }

    /**
     * Set Number of issues
     * @param VisaNum Number of issues
     */
    public void setVisaNum(String VisaNum) {
        this.VisaNum = VisaNum;
    }

    /**
     * Get Permit number 
     * @return PassNo Permit number
     */
    public String getPassNo() {
        return this.PassNo;
    }

    /**
     * Set Permit number
     * @param PassNo Permit number
     */
    public void setPassNo(String PassNo) {
        this.PassNo = PassNo;
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

    public HmtResidentPermitOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HmtResidentPermitOCRResponse(HmtResidentPermitOCRResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Birth != null) {
            this.Birth = new String(source.Birth);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.IdCardNo != null) {
            this.IdCardNo = new String(source.IdCardNo);
        }
        if (source.CardType != null) {
            this.CardType = new Long(source.CardType);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.Authority != null) {
            this.Authority = new String(source.Authority);
        }
        if (source.VisaNum != null) {
            this.VisaNum = new String(source.VisaNum);
        }
        if (source.PassNo != null) {
            this.PassNo = new String(source.PassNo);
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
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IdCardNo", this.IdCardNo);
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "Authority", this.Authority);
        this.setParamSimple(map, prefix + "VisaNum", this.VisaNum);
        this.setParamSimple(map, prefix + "PassNo", this.PassNo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

