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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationServiceAssign extends AbstractModel {

    /**
    * Organization service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * Organization service product name.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Specifies whether delegation is supported. Valid values: 1: yes; 2: no.
    */
    @SerializedName("IsAssign")
    @Expose
    private Long IsAssign;

    /**
    * Organization service description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Number of delegated administrators.
    */
    @SerializedName("MemberNum")
    @Expose
    private String MemberNum;

    /**
    * Help documentation.
    */
    @SerializedName("Document")
    @Expose
    private String Document;

    /**
    * Path to the console for organization service products.
    */
    @SerializedName("ConsoleUrl")
    @Expose
    private String ConsoleUrl;

    /**
    * Whether to access the usage status. valid values: 1 (yes). 
2: no.
    */
    @SerializedName("IsUsageStatus")
    @Expose
    private Long IsUsageStatus;

    /**
    * Limit on the number of delegated administrators.
    */
    @SerializedName("CanAssignCount")
    @Expose
    private Long CanAssignCount;

    /**
    * Organization service product ID.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Specifies whether organization service authorization is supported. Valid values: 1: yes; 2: no.
    */
    @SerializedName("ServiceGrant")
    @Expose
    private Long ServiceGrant;

    /**
    * Specifies whether organization services are authorized. This field is valid when the value of ServiceGrant is 1. Valid values: Enabled: authorized; Disabled: not authorized. 
    */
    @SerializedName("GrantStatus")
    @Expose
    private String GrantStatus;

    /**
    * Specifies whether the scope of delegated management can be set. Valid values: 1: yes; 2 no.
    */
    @SerializedName("IsSetManagementScope")
    @Expose
    private Long IsSetManagementScope;

    /**
     * Get Organization service ID. 
     * @return ServiceId Organization service ID.
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Organization service ID.
     * @param ServiceId Organization service ID.
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Organization service product name. 
     * @return ProductName Organization service product name.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Organization service product name.
     * @param ProductName Organization service product name.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Specifies whether delegation is supported. Valid values: 1: yes; 2: no. 
     * @return IsAssign Specifies whether delegation is supported. Valid values: 1: yes; 2: no.
     */
    public Long getIsAssign() {
        return this.IsAssign;
    }

    /**
     * Set Specifies whether delegation is supported. Valid values: 1: yes; 2: no.
     * @param IsAssign Specifies whether delegation is supported. Valid values: 1: yes; 2: no.
     */
    public void setIsAssign(Long IsAssign) {
        this.IsAssign = IsAssign;
    }

    /**
     * Get Organization service description. 
     * @return Description Organization service description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Organization service description.
     * @param Description Organization service description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Number of delegated administrators. 
     * @return MemberNum Number of delegated administrators.
     */
    public String getMemberNum() {
        return this.MemberNum;
    }

    /**
     * Set Number of delegated administrators.
     * @param MemberNum Number of delegated administrators.
     */
    public void setMemberNum(String MemberNum) {
        this.MemberNum = MemberNum;
    }

    /**
     * Get Help documentation. 
     * @return Document Help documentation.
     */
    public String getDocument() {
        return this.Document;
    }

    /**
     * Set Help documentation.
     * @param Document Help documentation.
     */
    public void setDocument(String Document) {
        this.Document = Document;
    }

    /**
     * Get Path to the console for organization service products. 
     * @return ConsoleUrl Path to the console for organization service products.
     */
    public String getConsoleUrl() {
        return this.ConsoleUrl;
    }

    /**
     * Set Path to the console for organization service products.
     * @param ConsoleUrl Path to the console for organization service products.
     */
    public void setConsoleUrl(String ConsoleUrl) {
        this.ConsoleUrl = ConsoleUrl;
    }

    /**
     * Get Whether to access the usage status. valid values: 1 (yes). 
2: no. 
     * @return IsUsageStatus Whether to access the usage status. valid values: 1 (yes). 
2: no.
     */
    public Long getIsUsageStatus() {
        return this.IsUsageStatus;
    }

    /**
     * Set Whether to access the usage status. valid values: 1 (yes). 
2: no.
     * @param IsUsageStatus Whether to access the usage status. valid values: 1 (yes). 
2: no.
     */
    public void setIsUsageStatus(Long IsUsageStatus) {
        this.IsUsageStatus = IsUsageStatus;
    }

    /**
     * Get Limit on the number of delegated administrators. 
     * @return CanAssignCount Limit on the number of delegated administrators.
     */
    public Long getCanAssignCount() {
        return this.CanAssignCount;
    }

    /**
     * Set Limit on the number of delegated administrators.
     * @param CanAssignCount Limit on the number of delegated administrators.
     */
    public void setCanAssignCount(Long CanAssignCount) {
        this.CanAssignCount = CanAssignCount;
    }

    /**
     * Get Organization service product ID. 
     * @return Product Organization service product ID.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Organization service product ID.
     * @param Product Organization service product ID.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Specifies whether organization service authorization is supported. Valid values: 1: yes; 2: no. 
     * @return ServiceGrant Specifies whether organization service authorization is supported. Valid values: 1: yes; 2: no.
     */
    public Long getServiceGrant() {
        return this.ServiceGrant;
    }

    /**
     * Set Specifies whether organization service authorization is supported. Valid values: 1: yes; 2: no.
     * @param ServiceGrant Specifies whether organization service authorization is supported. Valid values: 1: yes; 2: no.
     */
    public void setServiceGrant(Long ServiceGrant) {
        this.ServiceGrant = ServiceGrant;
    }

    /**
     * Get Specifies whether organization services are authorized. This field is valid when the value of ServiceGrant is 1. Valid values: Enabled: authorized; Disabled: not authorized.  
     * @return GrantStatus Specifies whether organization services are authorized. This field is valid when the value of ServiceGrant is 1. Valid values: Enabled: authorized; Disabled: not authorized. 
     */
    public String getGrantStatus() {
        return this.GrantStatus;
    }

    /**
     * Set Specifies whether organization services are authorized. This field is valid when the value of ServiceGrant is 1. Valid values: Enabled: authorized; Disabled: not authorized. 
     * @param GrantStatus Specifies whether organization services are authorized. This field is valid when the value of ServiceGrant is 1. Valid values: Enabled: authorized; Disabled: not authorized. 
     */
    public void setGrantStatus(String GrantStatus) {
        this.GrantStatus = GrantStatus;
    }

    /**
     * Get Specifies whether the scope of delegated management can be set. Valid values: 1: yes; 2 no. 
     * @return IsSetManagementScope Specifies whether the scope of delegated management can be set. Valid values: 1: yes; 2 no.
     */
    public Long getIsSetManagementScope() {
        return this.IsSetManagementScope;
    }

    /**
     * Set Specifies whether the scope of delegated management can be set. Valid values: 1: yes; 2 no.
     * @param IsSetManagementScope Specifies whether the scope of delegated management can be set. Valid values: 1: yes; 2 no.
     */
    public void setIsSetManagementScope(Long IsSetManagementScope) {
        this.IsSetManagementScope = IsSetManagementScope;
    }

    public OrganizationServiceAssign() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationServiceAssign(OrganizationServiceAssign source) {
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.IsAssign != null) {
            this.IsAssign = new Long(source.IsAssign);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MemberNum != null) {
            this.MemberNum = new String(source.MemberNum);
        }
        if (source.Document != null) {
            this.Document = new String(source.Document);
        }
        if (source.ConsoleUrl != null) {
            this.ConsoleUrl = new String(source.ConsoleUrl);
        }
        if (source.IsUsageStatus != null) {
            this.IsUsageStatus = new Long(source.IsUsageStatus);
        }
        if (source.CanAssignCount != null) {
            this.CanAssignCount = new Long(source.CanAssignCount);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ServiceGrant != null) {
            this.ServiceGrant = new Long(source.ServiceGrant);
        }
        if (source.GrantStatus != null) {
            this.GrantStatus = new String(source.GrantStatus);
        }
        if (source.IsSetManagementScope != null) {
            this.IsSetManagementScope = new Long(source.IsSetManagementScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "IsAssign", this.IsAssign);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MemberNum", this.MemberNum);
        this.setParamSimple(map, prefix + "Document", this.Document);
        this.setParamSimple(map, prefix + "ConsoleUrl", this.ConsoleUrl);
        this.setParamSimple(map, prefix + "IsUsageStatus", this.IsUsageStatus);
        this.setParamSimple(map, prefix + "CanAssignCount", this.CanAssignCount);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ServiceGrant", this.ServiceGrant);
        this.setParamSimple(map, prefix + "GrantStatus", this.GrantStatus);
        this.setParamSimple(map, prefix + "IsSetManagementScope", this.IsSetManagementScope);

    }
}

