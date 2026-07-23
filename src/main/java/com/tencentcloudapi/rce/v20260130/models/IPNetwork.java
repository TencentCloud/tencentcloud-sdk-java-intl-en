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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPNetwork extends AbstractModel {

    /**
    * <p>Internet service provider</p>
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * <p>Autonomous system number</p>
    */
    @SerializedName("ASN")
    @Expose
    private String ASN;

    /**
    * <p>IP registration organization name</p>
    */
    @SerializedName("Organization")
    @Expose
    private String Organization;

    /**
    * <p>Whether it is a reserved IP address</p>
    */
    @SerializedName("IsReserved")
    @Expose
    private Boolean IsReserved;

    /**
    * <p>Whether it is a gateway IP address</p>
    */
    @SerializedName("IsGateway")
    @Expose
    private Boolean IsGateway;

    /**
    * <p>Whether it belongs to an anycast network</p>
    */
    @SerializedName("IsAnycast")
    @Expose
    private Boolean IsAnycast;

    /**
    * <p>Whether it is from a mobile network</p>
    */
    @SerializedName("IsMobile")
    @Expose
    private Boolean IsMobile;

    /**
    * <p>Whether it is a dynamic IP address</p>
    */
    @SerializedName("IsDynamic")
    @Expose
    private Boolean IsDynamic;

    /**
    * <p>Whether it is a network egress</p>
    */
    @SerializedName("IsEgress")
    @Expose
    private Boolean IsEgress;

    /**
    * <p>Whether it is used for domain name resolution</p>
    */
    @SerializedName("IsDNS")
    @Expose
    private Boolean IsDNS;

    /**
    * <p>Whether it is an educational institution</p>
    */
    @SerializedName("IsEducation")
    @Expose
    private Boolean IsEducation;

    /**
    * <p>Whether it is an organization</p>
    */
    @SerializedName("IsInstitution")
    @Expose
    private Boolean IsInstitution;

    /**
    * <p>Whether it is an enterprise dedicated line</p>
    */
    @SerializedName("IsCompany")
    @Expose
    private Boolean IsCompany;

    /**
    * <p>Whether it is a residence broadband connection</p>
    */
    @SerializedName("IsResidence")
    @Expose
    private Boolean IsResidence;

    /**
    * <p>Whether it is cloud service</p>
    */
    @SerializedName("IsCloudService")
    @Expose
    private Boolean IsCloudService;

    /**
    * <p>Whether it is infrastructure</p>
    */
    @SerializedName("IsInfrastructure")
    @Expose
    private Boolean IsInfrastructure;

    /**
    * <p>Whether it is an mail exchange service</p>
    */
    @SerializedName("IsMXServer")
    @Expose
    private Boolean IsMXServer;

    /**
     * Get <p>Internet service provider</p> 
     * @return ISP <p>Internet service provider</p>
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set <p>Internet service provider</p>
     * @param ISP <p>Internet service provider</p>
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get <p>Autonomous system number</p> 
     * @return ASN <p>Autonomous system number</p>
     */
    public String getASN() {
        return this.ASN;
    }

    /**
     * Set <p>Autonomous system number</p>
     * @param ASN <p>Autonomous system number</p>
     */
    public void setASN(String ASN) {
        this.ASN = ASN;
    }

    /**
     * Get <p>IP registration organization name</p> 
     * @return Organization <p>IP registration organization name</p>
     */
    public String getOrganization() {
        return this.Organization;
    }

    /**
     * Set <p>IP registration organization name</p>
     * @param Organization <p>IP registration organization name</p>
     */
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

    /**
     * Get <p>Whether it is a reserved IP address</p> 
     * @return IsReserved <p>Whether it is a reserved IP address</p>
     */
    public Boolean getIsReserved() {
        return this.IsReserved;
    }

    /**
     * Set <p>Whether it is a reserved IP address</p>
     * @param IsReserved <p>Whether it is a reserved IP address</p>
     */
    public void setIsReserved(Boolean IsReserved) {
        this.IsReserved = IsReserved;
    }

    /**
     * Get <p>Whether it is a gateway IP address</p> 
     * @return IsGateway <p>Whether it is a gateway IP address</p>
     */
    public Boolean getIsGateway() {
        return this.IsGateway;
    }

    /**
     * Set <p>Whether it is a gateway IP address</p>
     * @param IsGateway <p>Whether it is a gateway IP address</p>
     */
    public void setIsGateway(Boolean IsGateway) {
        this.IsGateway = IsGateway;
    }

    /**
     * Get <p>Whether it belongs to an anycast network</p> 
     * @return IsAnycast <p>Whether it belongs to an anycast network</p>
     */
    public Boolean getIsAnycast() {
        return this.IsAnycast;
    }

    /**
     * Set <p>Whether it belongs to an anycast network</p>
     * @param IsAnycast <p>Whether it belongs to an anycast network</p>
     */
    public void setIsAnycast(Boolean IsAnycast) {
        this.IsAnycast = IsAnycast;
    }

    /**
     * Get <p>Whether it is from a mobile network</p> 
     * @return IsMobile <p>Whether it is from a mobile network</p>
     */
    public Boolean getIsMobile() {
        return this.IsMobile;
    }

    /**
     * Set <p>Whether it is from a mobile network</p>
     * @param IsMobile <p>Whether it is from a mobile network</p>
     */
    public void setIsMobile(Boolean IsMobile) {
        this.IsMobile = IsMobile;
    }

    /**
     * Get <p>Whether it is a dynamic IP address</p> 
     * @return IsDynamic <p>Whether it is a dynamic IP address</p>
     */
    public Boolean getIsDynamic() {
        return this.IsDynamic;
    }

    /**
     * Set <p>Whether it is a dynamic IP address</p>
     * @param IsDynamic <p>Whether it is a dynamic IP address</p>
     */
    public void setIsDynamic(Boolean IsDynamic) {
        this.IsDynamic = IsDynamic;
    }

    /**
     * Get <p>Whether it is a network egress</p> 
     * @return IsEgress <p>Whether it is a network egress</p>
     */
    public Boolean getIsEgress() {
        return this.IsEgress;
    }

    /**
     * Set <p>Whether it is a network egress</p>
     * @param IsEgress <p>Whether it is a network egress</p>
     */
    public void setIsEgress(Boolean IsEgress) {
        this.IsEgress = IsEgress;
    }

    /**
     * Get <p>Whether it is used for domain name resolution</p> 
     * @return IsDNS <p>Whether it is used for domain name resolution</p>
     */
    public Boolean getIsDNS() {
        return this.IsDNS;
    }

    /**
     * Set <p>Whether it is used for domain name resolution</p>
     * @param IsDNS <p>Whether it is used for domain name resolution</p>
     */
    public void setIsDNS(Boolean IsDNS) {
        this.IsDNS = IsDNS;
    }

    /**
     * Get <p>Whether it is an educational institution</p> 
     * @return IsEducation <p>Whether it is an educational institution</p>
     */
    public Boolean getIsEducation() {
        return this.IsEducation;
    }

    /**
     * Set <p>Whether it is an educational institution</p>
     * @param IsEducation <p>Whether it is an educational institution</p>
     */
    public void setIsEducation(Boolean IsEducation) {
        this.IsEducation = IsEducation;
    }

    /**
     * Get <p>Whether it is an organization</p> 
     * @return IsInstitution <p>Whether it is an organization</p>
     */
    public Boolean getIsInstitution() {
        return this.IsInstitution;
    }

    /**
     * Set <p>Whether it is an organization</p>
     * @param IsInstitution <p>Whether it is an organization</p>
     */
    public void setIsInstitution(Boolean IsInstitution) {
        this.IsInstitution = IsInstitution;
    }

    /**
     * Get <p>Whether it is an enterprise dedicated line</p> 
     * @return IsCompany <p>Whether it is an enterprise dedicated line</p>
     */
    public Boolean getIsCompany() {
        return this.IsCompany;
    }

    /**
     * Set <p>Whether it is an enterprise dedicated line</p>
     * @param IsCompany <p>Whether it is an enterprise dedicated line</p>
     */
    public void setIsCompany(Boolean IsCompany) {
        this.IsCompany = IsCompany;
    }

    /**
     * Get <p>Whether it is a residence broadband connection</p> 
     * @return IsResidence <p>Whether it is a residence broadband connection</p>
     */
    public Boolean getIsResidence() {
        return this.IsResidence;
    }

    /**
     * Set <p>Whether it is a residence broadband connection</p>
     * @param IsResidence <p>Whether it is a residence broadband connection</p>
     */
    public void setIsResidence(Boolean IsResidence) {
        this.IsResidence = IsResidence;
    }

    /**
     * Get <p>Whether it is cloud service</p> 
     * @return IsCloudService <p>Whether it is cloud service</p>
     */
    public Boolean getIsCloudService() {
        return this.IsCloudService;
    }

    /**
     * Set <p>Whether it is cloud service</p>
     * @param IsCloudService <p>Whether it is cloud service</p>
     */
    public void setIsCloudService(Boolean IsCloudService) {
        this.IsCloudService = IsCloudService;
    }

    /**
     * Get <p>Whether it is infrastructure</p> 
     * @return IsInfrastructure <p>Whether it is infrastructure</p>
     */
    public Boolean getIsInfrastructure() {
        return this.IsInfrastructure;
    }

    /**
     * Set <p>Whether it is infrastructure</p>
     * @param IsInfrastructure <p>Whether it is infrastructure</p>
     */
    public void setIsInfrastructure(Boolean IsInfrastructure) {
        this.IsInfrastructure = IsInfrastructure;
    }

    /**
     * Get <p>Whether it is an mail exchange service</p> 
     * @return IsMXServer <p>Whether it is an mail exchange service</p>
     */
    public Boolean getIsMXServer() {
        return this.IsMXServer;
    }

    /**
     * Set <p>Whether it is an mail exchange service</p>
     * @param IsMXServer <p>Whether it is an mail exchange service</p>
     */
    public void setIsMXServer(Boolean IsMXServer) {
        this.IsMXServer = IsMXServer;
    }

    public IPNetwork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPNetwork(IPNetwork source) {
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.ASN != null) {
            this.ASN = new String(source.ASN);
        }
        if (source.Organization != null) {
            this.Organization = new String(source.Organization);
        }
        if (source.IsReserved != null) {
            this.IsReserved = new Boolean(source.IsReserved);
        }
        if (source.IsGateway != null) {
            this.IsGateway = new Boolean(source.IsGateway);
        }
        if (source.IsAnycast != null) {
            this.IsAnycast = new Boolean(source.IsAnycast);
        }
        if (source.IsMobile != null) {
            this.IsMobile = new Boolean(source.IsMobile);
        }
        if (source.IsDynamic != null) {
            this.IsDynamic = new Boolean(source.IsDynamic);
        }
        if (source.IsEgress != null) {
            this.IsEgress = new Boolean(source.IsEgress);
        }
        if (source.IsDNS != null) {
            this.IsDNS = new Boolean(source.IsDNS);
        }
        if (source.IsEducation != null) {
            this.IsEducation = new Boolean(source.IsEducation);
        }
        if (source.IsInstitution != null) {
            this.IsInstitution = new Boolean(source.IsInstitution);
        }
        if (source.IsCompany != null) {
            this.IsCompany = new Boolean(source.IsCompany);
        }
        if (source.IsResidence != null) {
            this.IsResidence = new Boolean(source.IsResidence);
        }
        if (source.IsCloudService != null) {
            this.IsCloudService = new Boolean(source.IsCloudService);
        }
        if (source.IsInfrastructure != null) {
            this.IsInfrastructure = new Boolean(source.IsInfrastructure);
        }
        if (source.IsMXServer != null) {
            this.IsMXServer = new Boolean(source.IsMXServer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamSimple(map, prefix + "ASN", this.ASN);
        this.setParamSimple(map, prefix + "Organization", this.Organization);
        this.setParamSimple(map, prefix + "IsReserved", this.IsReserved);
        this.setParamSimple(map, prefix + "IsGateway", this.IsGateway);
        this.setParamSimple(map, prefix + "IsAnycast", this.IsAnycast);
        this.setParamSimple(map, prefix + "IsMobile", this.IsMobile);
        this.setParamSimple(map, prefix + "IsDynamic", this.IsDynamic);
        this.setParamSimple(map, prefix + "IsEgress", this.IsEgress);
        this.setParamSimple(map, prefix + "IsDNS", this.IsDNS);
        this.setParamSimple(map, prefix + "IsEducation", this.IsEducation);
        this.setParamSimple(map, prefix + "IsInstitution", this.IsInstitution);
        this.setParamSimple(map, prefix + "IsCompany", this.IsCompany);
        this.setParamSimple(map, prefix + "IsResidence", this.IsResidence);
        this.setParamSimple(map, prefix + "IsCloudService", this.IsCloudService);
        this.setParamSimple(map, prefix + "IsInfrastructure", this.IsInfrastructure);
        this.setParamSimple(map, prefix + "IsMXServer", this.IsMXServer);

    }
}

