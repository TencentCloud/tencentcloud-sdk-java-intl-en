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

public class DescribeCrossBorderComplianceRequest extends AbstractModel{

    /**
    * (Exact match) Service provider. Valid values: `UNICOM`.
    */
    @SerializedName("ServiceProvider")
    @Expose
    private String ServiceProvider;

    /**
    * (Exact match) ID of compliance review request.
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * (Fuzzy match) Company name.
    */
    @SerializedName("Company")
    @Expose
    private String Company;

    /**
    * (Fuzzy match) Unified Social Credit Code.
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * (Fuzzy match) Legal person.
    */
    @SerializedName("LegalPerson")
    @Expose
    private String LegalPerson;

    /**
    * (Fuzzy match) Issuing authority.
    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
    * (Fuzzy match) Business address.
    */
    @SerializedName("BusinessAddress")
    @Expose
    private String BusinessAddress;

    /**
    * (Exact match) Zip code.
    */
    @SerializedName("PostCode")
    @Expose
    private Long PostCode;

    /**
    * (Fuzzy match) Operator.
    */
    @SerializedName("Manager")
    @Expose
    private String Manager;

    /**
    * (Exact match) Operator ID card number.
    */
    @SerializedName("ManagerId")
    @Expose
    private String ManagerId;

    /**
    * (Fuzzy match) Operator address.
    */
    @SerializedName("ManagerAddress")
    @Expose
    private String ManagerAddress;

    /**
    * (Exact match) Operator phone number.
    */
    @SerializedName("ManagerTelephone")
    @Expose
    private String ManagerTelephone;

    /**
    * (Exact match) Email.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * (Exact match) Service start date, such as `2020-07-28`.
    */
    @SerializedName("ServiceStartDate")
    @Expose
    private String ServiceStartDate;

    /**
    * (Exact match) Service end date, such as `2020-07-28`.
    */
    @SerializedName("ServiceEndDate")
    @Expose
    private String ServiceEndDate;

    /**
    * (Exact match) Status. Valid values: `PENDING`, `APPROVED`, and `DENY`.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get (Exact match) Service provider. Valid values: `UNICOM`. 
     * @return ServiceProvider (Exact match) Service provider. Valid values: `UNICOM`.
     */
    public String getServiceProvider() {
        return this.ServiceProvider;
    }

    /**
     * Set (Exact match) Service provider. Valid values: `UNICOM`.
     * @param ServiceProvider (Exact match) Service provider. Valid values: `UNICOM`.
     */
    public void setServiceProvider(String ServiceProvider) {
        this.ServiceProvider = ServiceProvider;
    }

    /**
     * Get (Exact match) ID of compliance review request. 
     * @return ComplianceId (Exact match) ID of compliance review request.
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set (Exact match) ID of compliance review request.
     * @param ComplianceId (Exact match) ID of compliance review request.
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get (Fuzzy match) Company name. 
     * @return Company (Fuzzy match) Company name.
     */
    public String getCompany() {
        return this.Company;
    }

    /**
     * Set (Fuzzy match) Company name.
     * @param Company (Fuzzy match) Company name.
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    /**
     * Get (Fuzzy match) Unified Social Credit Code. 
     * @return UniformSocialCreditCode (Fuzzy match) Unified Social Credit Code.
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set (Fuzzy match) Unified Social Credit Code.
     * @param UniformSocialCreditCode (Fuzzy match) Unified Social Credit Code.
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get (Fuzzy match) Legal person. 
     * @return LegalPerson (Fuzzy match) Legal person.
     */
    public String getLegalPerson() {
        return this.LegalPerson;
    }

    /**
     * Set (Fuzzy match) Legal person.
     * @param LegalPerson (Fuzzy match) Legal person.
     */
    public void setLegalPerson(String LegalPerson) {
        this.LegalPerson = LegalPerson;
    }

    /**
     * Get (Fuzzy match) Issuing authority. 
     * @return IssuingAuthority (Fuzzy match) Issuing authority.
     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set (Fuzzy match) Issuing authority.
     * @param IssuingAuthority (Fuzzy match) Issuing authority.
     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
    }

    /**
     * Get (Fuzzy match) Business address. 
     * @return BusinessAddress (Fuzzy match) Business address.
     */
    public String getBusinessAddress() {
        return this.BusinessAddress;
    }

    /**
     * Set (Fuzzy match) Business address.
     * @param BusinessAddress (Fuzzy match) Business address.
     */
    public void setBusinessAddress(String BusinessAddress) {
        this.BusinessAddress = BusinessAddress;
    }

    /**
     * Get (Exact match) Zip code. 
     * @return PostCode (Exact match) Zip code.
     */
    public Long getPostCode() {
        return this.PostCode;
    }

    /**
     * Set (Exact match) Zip code.
     * @param PostCode (Exact match) Zip code.
     */
    public void setPostCode(Long PostCode) {
        this.PostCode = PostCode;
    }

    /**
     * Get (Fuzzy match) Operator. 
     * @return Manager (Fuzzy match) Operator.
     */
    public String getManager() {
        return this.Manager;
    }

    /**
     * Set (Fuzzy match) Operator.
     * @param Manager (Fuzzy match) Operator.
     */
    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    /**
     * Get (Exact match) Operator ID card number. 
     * @return ManagerId (Exact match) Operator ID card number.
     */
    public String getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set (Exact match) Operator ID card number.
     * @param ManagerId (Exact match) Operator ID card number.
     */
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get (Fuzzy match) Operator address. 
     * @return ManagerAddress (Fuzzy match) Operator address.
     */
    public String getManagerAddress() {
        return this.ManagerAddress;
    }

    /**
     * Set (Fuzzy match) Operator address.
     * @param ManagerAddress (Fuzzy match) Operator address.
     */
    public void setManagerAddress(String ManagerAddress) {
        this.ManagerAddress = ManagerAddress;
    }

    /**
     * Get (Exact match) Operator phone number. 
     * @return ManagerTelephone (Exact match) Operator phone number.
     */
    public String getManagerTelephone() {
        return this.ManagerTelephone;
    }

    /**
     * Set (Exact match) Operator phone number.
     * @param ManagerTelephone (Exact match) Operator phone number.
     */
    public void setManagerTelephone(String ManagerTelephone) {
        this.ManagerTelephone = ManagerTelephone;
    }

    /**
     * Get (Exact match) Email. 
     * @return Email (Exact match) Email.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set (Exact match) Email.
     * @param Email (Exact match) Email.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get (Exact match) Service start date, such as `2020-07-28`. 
     * @return ServiceStartDate (Exact match) Service start date, such as `2020-07-28`.
     */
    public String getServiceStartDate() {
        return this.ServiceStartDate;
    }

    /**
     * Set (Exact match) Service start date, such as `2020-07-28`.
     * @param ServiceStartDate (Exact match) Service start date, such as `2020-07-28`.
     */
    public void setServiceStartDate(String ServiceStartDate) {
        this.ServiceStartDate = ServiceStartDate;
    }

    /**
     * Get (Exact match) Service end date, such as `2020-07-28`. 
     * @return ServiceEndDate (Exact match) Service end date, such as `2020-07-28`.
     */
    public String getServiceEndDate() {
        return this.ServiceEndDate;
    }

    /**
     * Set (Exact match) Service end date, such as `2020-07-28`.
     * @param ServiceEndDate (Exact match) Service end date, such as `2020-07-28`.
     */
    public void setServiceEndDate(String ServiceEndDate) {
        this.ServiceEndDate = ServiceEndDate;
    }

    /**
     * Get (Exact match) Status. Valid values: `PENDING`, `APPROVED`, and `DENY`. 
     * @return State (Exact match) Status. Valid values: `PENDING`, `APPROVED`, and `DENY`.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set (Exact match) Status. Valid values: `PENDING`, `APPROVED`, and `DENY`.
     * @param State (Exact match) Status. Valid values: `PENDING`, `APPROVED`, and `DENY`.
     */
    public void setState(String State) {
        this.State = State;
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
        this.setParamSimple(map, prefix + "BusinessAddress", this.BusinessAddress);
        this.setParamSimple(map, prefix + "PostCode", this.PostCode);
        this.setParamSimple(map, prefix + "Manager", this.Manager);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "ManagerAddress", this.ManagerAddress);
        this.setParamSimple(map, prefix + "ManagerTelephone", this.ManagerTelephone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ServiceStartDate", this.ServiceStartDate);
        this.setParamSimple(map, prefix + "ServiceEndDate", this.ServiceEndDate);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

