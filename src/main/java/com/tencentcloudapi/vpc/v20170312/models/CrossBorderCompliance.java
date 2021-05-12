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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossBorderCompliance extends AbstractModel{

    /**
    * Service provider. Valid values: `UNICOM`.
    */
    @SerializedName("ServiceProvider")
    @Expose
    private String ServiceProvider;

    /**
    * ID of compliance review request.
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * Full company name.
    */
    @SerializedName("Company")
    @Expose
    private String Company;

    /**
    * Unified Social Credit Code.
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * Legal person.
    */
    @SerializedName("LegalPerson")
    @Expose
    private String LegalPerson;

    /**
    * Issuing authority.
    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
    * Business license.
    */
    @SerializedName("BusinessLicense")
    @Expose
    private String BusinessLicense;

    /**
    * Business address.
    */
    @SerializedName("BusinessAddress")
    @Expose
    private String BusinessAddress;

    /**
    * Zip code.
    */
    @SerializedName("PostCode")
    @Expose
    private Long PostCode;

    /**
    * Operator.
    */
    @SerializedName("Manager")
    @Expose
    private String Manager;

    /**
    * Operator ID card number.
    */
    @SerializedName("ManagerId")
    @Expose
    private String ManagerId;

    /**
    * Operator ID card.
    */
    @SerializedName("ManagerIdCard")
    @Expose
    private String ManagerIdCard;

    /**
    * Operator address.
    */
    @SerializedName("ManagerAddress")
    @Expose
    private String ManagerAddress;

    /**
    * Operator phone number.
    */
    @SerializedName("ManagerTelephone")
    @Expose
    private String ManagerTelephone;

    /**
    * Email.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Service handling form.
    */
    @SerializedName("ServiceHandlingForm")
    @Expose
    private String ServiceHandlingForm;

    /**
    * Authorization letter.
    */
    @SerializedName("AuthorizationLetter")
    @Expose
    private String AuthorizationLetter;

    /**
    * Information security commitment.
    */
    @SerializedName("SafetyCommitment")
    @Expose
    private String SafetyCommitment;

    /**
    * Service start date.
    */
    @SerializedName("ServiceStartDate")
    @Expose
    private String ServiceStartDate;

    /**
    * Service end date.
    */
    @SerializedName("ServiceEndDate")
    @Expose
    private String ServiceEndDate;

    /**
    * Status. Valid values: `PENDING`, `APPROVED`, and `DENY`.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Creation time of the review form.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Service provider. Valid values: `UNICOM`. 
     * @return ServiceProvider Service provider. Valid values: `UNICOM`.
     */
    public String getServiceProvider() {
        return this.ServiceProvider;
    }

    /**
     * Set Service provider. Valid values: `UNICOM`.
     * @param ServiceProvider Service provider. Valid values: `UNICOM`.
     */
    public void setServiceProvider(String ServiceProvider) {
        this.ServiceProvider = ServiceProvider;
    }

    /**
     * Get ID of compliance review request. 
     * @return ComplianceId ID of compliance review request.
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set ID of compliance review request.
     * @param ComplianceId ID of compliance review request.
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get Full company name. 
     * @return Company Full company name.
     */
    public String getCompany() {
        return this.Company;
    }

    /**
     * Set Full company name.
     * @param Company Full company name.
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    /**
     * Get Unified Social Credit Code. 
     * @return UniformSocialCreditCode Unified Social Credit Code.
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set Unified Social Credit Code.
     * @param UniformSocialCreditCode Unified Social Credit Code.
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get Legal person. 
     * @return LegalPerson Legal person.
     */
    public String getLegalPerson() {
        return this.LegalPerson;
    }

    /**
     * Set Legal person.
     * @param LegalPerson Legal person.
     */
    public void setLegalPerson(String LegalPerson) {
        this.LegalPerson = LegalPerson;
    }

    /**
     * Get Issuing authority. 
     * @return IssuingAuthority Issuing authority.
     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set Issuing authority.
     * @param IssuingAuthority Issuing authority.
     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
    }

    /**
     * Get Business license. 
     * @return BusinessLicense Business license.
     */
    public String getBusinessLicense() {
        return this.BusinessLicense;
    }

    /**
     * Set Business license.
     * @param BusinessLicense Business license.
     */
    public void setBusinessLicense(String BusinessLicense) {
        this.BusinessLicense = BusinessLicense;
    }

    /**
     * Get Business address. 
     * @return BusinessAddress Business address.
     */
    public String getBusinessAddress() {
        return this.BusinessAddress;
    }

    /**
     * Set Business address.
     * @param BusinessAddress Business address.
     */
    public void setBusinessAddress(String BusinessAddress) {
        this.BusinessAddress = BusinessAddress;
    }

    /**
     * Get Zip code. 
     * @return PostCode Zip code.
     */
    public Long getPostCode() {
        return this.PostCode;
    }

    /**
     * Set Zip code.
     * @param PostCode Zip code.
     */
    public void setPostCode(Long PostCode) {
        this.PostCode = PostCode;
    }

    /**
     * Get Operator. 
     * @return Manager Operator.
     */
    public String getManager() {
        return this.Manager;
    }

    /**
     * Set Operator.
     * @param Manager Operator.
     */
    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    /**
     * Get Operator ID card number. 
     * @return ManagerId Operator ID card number.
     */
    public String getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set Operator ID card number.
     * @param ManagerId Operator ID card number.
     */
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get Operator ID card. 
     * @return ManagerIdCard Operator ID card.
     */
    public String getManagerIdCard() {
        return this.ManagerIdCard;
    }

    /**
     * Set Operator ID card.
     * @param ManagerIdCard Operator ID card.
     */
    public void setManagerIdCard(String ManagerIdCard) {
        this.ManagerIdCard = ManagerIdCard;
    }

    /**
     * Get Operator address. 
     * @return ManagerAddress Operator address.
     */
    public String getManagerAddress() {
        return this.ManagerAddress;
    }

    /**
     * Set Operator address.
     * @param ManagerAddress Operator address.
     */
    public void setManagerAddress(String ManagerAddress) {
        this.ManagerAddress = ManagerAddress;
    }

    /**
     * Get Operator phone number. 
     * @return ManagerTelephone Operator phone number.
     */
    public String getManagerTelephone() {
        return this.ManagerTelephone;
    }

    /**
     * Set Operator phone number.
     * @param ManagerTelephone Operator phone number.
     */
    public void setManagerTelephone(String ManagerTelephone) {
        this.ManagerTelephone = ManagerTelephone;
    }

    /**
     * Get Email. 
     * @return Email Email.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email.
     * @param Email Email.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Service handling form. 
     * @return ServiceHandlingForm Service handling form.
     */
    public String getServiceHandlingForm() {
        return this.ServiceHandlingForm;
    }

    /**
     * Set Service handling form.
     * @param ServiceHandlingForm Service handling form.
     */
    public void setServiceHandlingForm(String ServiceHandlingForm) {
        this.ServiceHandlingForm = ServiceHandlingForm;
    }

    /**
     * Get Authorization letter. 
     * @return AuthorizationLetter Authorization letter.
     */
    public String getAuthorizationLetter() {
        return this.AuthorizationLetter;
    }

    /**
     * Set Authorization letter.
     * @param AuthorizationLetter Authorization letter.
     */
    public void setAuthorizationLetter(String AuthorizationLetter) {
        this.AuthorizationLetter = AuthorizationLetter;
    }

    /**
     * Get Information security commitment. 
     * @return SafetyCommitment Information security commitment.
     */
    public String getSafetyCommitment() {
        return this.SafetyCommitment;
    }

    /**
     * Set Information security commitment.
     * @param SafetyCommitment Information security commitment.
     */
    public void setSafetyCommitment(String SafetyCommitment) {
        this.SafetyCommitment = SafetyCommitment;
    }

    /**
     * Get Service start date. 
     * @return ServiceStartDate Service start date.
     */
    public String getServiceStartDate() {
        return this.ServiceStartDate;
    }

    /**
     * Set Service start date.
     * @param ServiceStartDate Service start date.
     */
    public void setServiceStartDate(String ServiceStartDate) {
        this.ServiceStartDate = ServiceStartDate;
    }

    /**
     * Get Service end date. 
     * @return ServiceEndDate Service end date.
     */
    public String getServiceEndDate() {
        return this.ServiceEndDate;
    }

    /**
     * Set Service end date.
     * @param ServiceEndDate Service end date.
     */
    public void setServiceEndDate(String ServiceEndDate) {
        this.ServiceEndDate = ServiceEndDate;
    }

    /**
     * Get Status. Valid values: `PENDING`, `APPROVED`, and `DENY`. 
     * @return State Status. Valid values: `PENDING`, `APPROVED`, and `DENY`.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Status. Valid values: `PENDING`, `APPROVED`, and `DENY`.
     * @param State Status. Valid values: `PENDING`, `APPROVED`, and `DENY`.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Creation time of the review form. 
     * @return CreatedTime Creation time of the review form.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time of the review form.
     * @param CreatedTime Creation time of the review form.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public CrossBorderCompliance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossBorderCompliance(CrossBorderCompliance source) {
        if (source.ServiceProvider != null) {
            this.ServiceProvider = new String(source.ServiceProvider);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.Company != null) {
            this.Company = new String(source.Company);
        }
        if (source.UniformSocialCreditCode != null) {
            this.UniformSocialCreditCode = new String(source.UniformSocialCreditCode);
        }
        if (source.LegalPerson != null) {
            this.LegalPerson = new String(source.LegalPerson);
        }
        if (source.IssuingAuthority != null) {
            this.IssuingAuthority = new String(source.IssuingAuthority);
        }
        if (source.BusinessLicense != null) {
            this.BusinessLicense = new String(source.BusinessLicense);
        }
        if (source.BusinessAddress != null) {
            this.BusinessAddress = new String(source.BusinessAddress);
        }
        if (source.PostCode != null) {
            this.PostCode = new Long(source.PostCode);
        }
        if (source.Manager != null) {
            this.Manager = new String(source.Manager);
        }
        if (source.ManagerId != null) {
            this.ManagerId = new String(source.ManagerId);
        }
        if (source.ManagerIdCard != null) {
            this.ManagerIdCard = new String(source.ManagerIdCard);
        }
        if (source.ManagerAddress != null) {
            this.ManagerAddress = new String(source.ManagerAddress);
        }
        if (source.ManagerTelephone != null) {
            this.ManagerTelephone = new String(source.ManagerTelephone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.ServiceHandlingForm != null) {
            this.ServiceHandlingForm = new String(source.ServiceHandlingForm);
        }
        if (source.AuthorizationLetter != null) {
            this.AuthorizationLetter = new String(source.AuthorizationLetter);
        }
        if (source.SafetyCommitment != null) {
            this.SafetyCommitment = new String(source.SafetyCommitment);
        }
        if (source.ServiceStartDate != null) {
            this.ServiceStartDate = new String(source.ServiceStartDate);
        }
        if (source.ServiceEndDate != null) {
            this.ServiceEndDate = new String(source.ServiceEndDate);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceProvider", this.ServiceProvider);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "Company", this.Company);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "LegalPerson", this.LegalPerson);
        this.setParamSimple(map, prefix + "IssuingAuthority", this.IssuingAuthority);
        this.setParamSimple(map, prefix + "BusinessLicense", this.BusinessLicense);
        this.setParamSimple(map, prefix + "BusinessAddress", this.BusinessAddress);
        this.setParamSimple(map, prefix + "PostCode", this.PostCode);
        this.setParamSimple(map, prefix + "Manager", this.Manager);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "ManagerIdCard", this.ManagerIdCard);
        this.setParamSimple(map, prefix + "ManagerAddress", this.ManagerAddress);
        this.setParamSimple(map, prefix + "ManagerTelephone", this.ManagerTelephone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ServiceHandlingForm", this.ServiceHandlingForm);
        this.setParamSimple(map, prefix + "AuthorizationLetter", this.AuthorizationLetter);
        this.setParamSimple(map, prefix + "SafetyCommitment", this.SafetyCommitment);
        this.setParamSimple(map, prefix + "ServiceStartDate", this.ServiceStartDate);
        this.setParamSimple(map, prefix + "ServiceEndDate", this.ServiceEndDate);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

