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

public class OrganizationServiceAssignMember extends AbstractModel {

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
    * Uin of the delegated admin.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Name of the delegated admin.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
    * Activation status. Valid values: 0 (the service has no activation status), 1 (activated), 2 (not activated).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsageStatus")
    @Expose
    private Long UsageStatus;

    /**
    * Delegation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Management scope of the delegated admin. Valid values: 1 (all members), 2 (partial members).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManagementScope")
    @Expose
    private Long ManagementScope;

    /**
    * Uin list of managed members. This parameter is valid when ManagementScope is 2.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManagementScopeMembers")
    @Expose
    private MemberMainInfo [] ManagementScopeMembers;

    /**
    * ID list of the managed departments. This parameter is valid when ManagementScope is 2.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ManagementScopeNodes")
    @Expose
    private NodeMainInfo [] ManagementScopeNodes;

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
     * Get Uin of the delegated admin.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberUin Uin of the delegated admin.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Uin of the delegated admin.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberUin Uin of the delegated admin.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Name of the delegated admin.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberName Name of the delegated admin.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set Name of the delegated admin.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberName Name of the delegated admin.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    /**
     * Get Activation status. Valid values: 0 (the service has no activation status), 1 (activated), 2 (not activated).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UsageStatus Activation status. Valid values: 0 (the service has no activation status), 1 (activated), 2 (not activated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUsageStatus() {
        return this.UsageStatus;
    }

    /**
     * Set Activation status. Valid values: 0 (the service has no activation status), 1 (activated), 2 (not activated).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UsageStatus Activation status. Valid values: 0 (the service has no activation status), 1 (activated), 2 (not activated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsageStatus(Long UsageStatus) {
        this.UsageStatus = UsageStatus;
    }

    /**
     * Get Delegation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Delegation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Delegation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Delegation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Management scope of the delegated admin. Valid values: 1 (all members), 2 (partial members).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManagementScope Management scope of the delegated admin. Valid values: 1 (all members), 2 (partial members).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getManagementScope() {
        return this.ManagementScope;
    }

    /**
     * Set Management scope of the delegated admin. Valid values: 1 (all members), 2 (partial members).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManagementScope Management scope of the delegated admin. Valid values: 1 (all members), 2 (partial members).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManagementScope(Long ManagementScope) {
        this.ManagementScope = ManagementScope;
    }

    /**
     * Get Uin list of managed members. This parameter is valid when ManagementScope is 2.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManagementScopeMembers Uin list of managed members. This parameter is valid when ManagementScope is 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MemberMainInfo [] getManagementScopeMembers() {
        return this.ManagementScopeMembers;
    }

    /**
     * Set Uin list of managed members. This parameter is valid when ManagementScope is 2.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManagementScopeMembers Uin list of managed members. This parameter is valid when ManagementScope is 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManagementScopeMembers(MemberMainInfo [] ManagementScopeMembers) {
        this.ManagementScopeMembers = ManagementScopeMembers;
    }

    /**
     * Get ID list of the managed departments. This parameter is valid when ManagementScope is 2.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ManagementScopeNodes ID list of the managed departments. This parameter is valid when ManagementScope is 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeMainInfo [] getManagementScopeNodes() {
        return this.ManagementScopeNodes;
    }

    /**
     * Set ID list of the managed departments. This parameter is valid when ManagementScope is 2.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ManagementScopeNodes ID list of the managed departments. This parameter is valid when ManagementScope is 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setManagementScopeNodes(NodeMainInfo [] ManagementScopeNodes) {
        this.ManagementScopeNodes = ManagementScopeNodes;
    }

    public OrganizationServiceAssignMember() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationServiceAssignMember(OrganizationServiceAssignMember source) {
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
        if (source.UsageStatus != null) {
            this.UsageStatus = new Long(source.UsageStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ManagementScope != null) {
            this.ManagementScope = new Long(source.ManagementScope);
        }
        if (source.ManagementScopeMembers != null) {
            this.ManagementScopeMembers = new MemberMainInfo[source.ManagementScopeMembers.length];
            for (int i = 0; i < source.ManagementScopeMembers.length; i++) {
                this.ManagementScopeMembers[i] = new MemberMainInfo(source.ManagementScopeMembers[i]);
            }
        }
        if (source.ManagementScopeNodes != null) {
            this.ManagementScopeNodes = new NodeMainInfo[source.ManagementScopeNodes.length];
            for (int i = 0; i < source.ManagementScopeNodes.length; i++) {
                this.ManagementScopeNodes[i] = new NodeMainInfo(source.ManagementScopeNodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);
        this.setParamSimple(map, prefix + "UsageStatus", this.UsageStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ManagementScope", this.ManagementScope);
        this.setParamArrayObj(map, prefix + "ManagementScopeMembers.", this.ManagementScopeMembers);
        this.setParamArrayObj(map, prefix + "ManagementScopeNodes.", this.ManagementScopeNodes);

    }
}

