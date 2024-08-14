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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationServiceAssign extends AbstractModel {

    /**
    * Organization service ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * Organization service product name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Whether to support delegation. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAssign")
    @Expose
    private Long IsAssign;

    /**
    * Organization service description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Number of the current delegated admins.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberNum")
    @Expose
    private String MemberNum;

    /**
    * Help documentation.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Document")
    @Expose
    private String Document;

    /**
    * Console path of the organization service product.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsoleUrl")
    @Expose
    private String ConsoleUrl;

    /**
    * Whether to access the usage status. Valid values: 1 (yes), 
 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsUsageStatus")
    @Expose
    private Long IsUsageStatus;

    /**
    * Limit for the number of delegated admins.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanAssignCount")
    @Expose
    private Long CanAssignCount;

    /**
    * Organization service product identifier.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Whether to support organization service authorization. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceGrant")
    @Expose
    private Long ServiceGrant;

    /**
    * Enabling status of organization service authorization. This field is valid when ServiceGrant is 1. Valid values: Enabled, Disabled. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GrantStatus")
    @Expose
    private String GrantStatus;

    /**
    * Whether to support setting the delegated management scope. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSetManagementScope")
    @Expose
    private Long IsSetManagementScope;

    /**
     * Get Organization service ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceId Organization service ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Organization service ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceId Organization service ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Organization service product name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductName Organization service product name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Organization service product name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductName Organization service product name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Whether to support delegation. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsAssign Whether to support delegation. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsAssign() {
        return this.IsAssign;
    }

    /**
     * Set Whether to support delegation. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsAssign Whether to support delegation. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAssign(Long IsAssign) {
        this.IsAssign = IsAssign;
    }

    /**
     * Get Organization service description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Organization service description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Organization service description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Organization service description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Number of the current delegated admins.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberNum Number of the current delegated admins.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMemberNum() {
        return this.MemberNum;
    }

    /**
     * Set Number of the current delegated admins.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberNum Number of the current delegated admins.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberNum(String MemberNum) {
        this.MemberNum = MemberNum;
    }

    /**
     * Get Help documentation.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Document Help documentation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDocument() {
        return this.Document;
    }

    /**
     * Set Help documentation.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Document Help documentation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDocument(String Document) {
        this.Document = Document;
    }

    /**
     * Get Console path of the organization service product.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsoleUrl Console path of the organization service product.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConsoleUrl() {
        return this.ConsoleUrl;
    }

    /**
     * Set Console path of the organization service product.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsoleUrl Console path of the organization service product.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsoleUrl(String ConsoleUrl) {
        this.ConsoleUrl = ConsoleUrl;
    }

    /**
     * Get Whether to access the usage status. Valid values: 1 (yes), 
 2 (no).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsUsageStatus Whether to access the usage status. Valid values: 1 (yes), 
 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsUsageStatus() {
        return this.IsUsageStatus;
    }

    /**
     * Set Whether to access the usage status. Valid values: 1 (yes), 
 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsUsageStatus Whether to access the usage status. Valid values: 1 (yes), 
 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsUsageStatus(Long IsUsageStatus) {
        this.IsUsageStatus = IsUsageStatus;
    }

    /**
     * Get Limit for the number of delegated admins.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CanAssignCount Limit for the number of delegated admins.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCanAssignCount() {
        return this.CanAssignCount;
    }

    /**
     * Set Limit for the number of delegated admins.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CanAssignCount Limit for the number of delegated admins.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCanAssignCount(Long CanAssignCount) {
        this.CanAssignCount = CanAssignCount;
    }

    /**
     * Get Organization service product identifier.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Product Organization service product identifier.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Organization service product identifier.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Product Organization service product identifier.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Whether to support organization service authorization. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceGrant Whether to support organization service authorization. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getServiceGrant() {
        return this.ServiceGrant;
    }

    /**
     * Set Whether to support organization service authorization. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceGrant Whether to support organization service authorization. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceGrant(Long ServiceGrant) {
        this.ServiceGrant = ServiceGrant;
    }

    /**
     * Get Enabling status of organization service authorization. This field is valid when ServiceGrant is 1. Valid values: Enabled, Disabled. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GrantStatus Enabling status of organization service authorization. This field is valid when ServiceGrant is 1. Valid values: Enabled, Disabled. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGrantStatus() {
        return this.GrantStatus;
    }

    /**
     * Set Enabling status of organization service authorization. This field is valid when ServiceGrant is 1. Valid values: Enabled, Disabled. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GrantStatus Enabling status of organization service authorization. This field is valid when ServiceGrant is 1. Valid values: Enabled, Disabled. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGrantStatus(String GrantStatus) {
        this.GrantStatus = GrantStatus;
    }

    /**
     * Get Whether to support setting the delegated management scope. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSetManagementScope Whether to support setting the delegated management scope. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsSetManagementScope() {
        return this.IsSetManagementScope;
    }

    /**
     * Set Whether to support setting the delegated management scope. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSetManagementScope Whether to support setting the delegated management scope. Valid values: 1 (yes), 2 (no).
Note: This field may return null, indicating that no valid values can be obtained.
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

