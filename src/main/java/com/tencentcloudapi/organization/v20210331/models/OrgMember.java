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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgMember extends AbstractModel{

    /**
    * Member UIN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Member name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Member type. Valid values: `Invite` (invited); `Create` (created).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberType")
    @Expose
    private String MemberType;

    /**
    * Relationship policy type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgPolicyType")
    @Expose
    private String OrgPolicyType;

    /**
    * Relationship policy name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgPolicyName")
    @Expose
    private String OrgPolicyName;

    /**
    * Relationship policy permission
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgPermission")
    @Expose
    private OrgPermission [] OrgPermission;

    /**
    * Node ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * Node name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether the member is allowed to leave. Valid values: `Allow`, `Denied`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAllowQuit")
    @Expose
    private String IsAllowQuit;

    /**
    * Payer UIN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * Payer name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayName")
    @Expose
    private String PayName;

    /**
    * Management identity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgIdentity")
    @Expose
    private MemberIdentity [] OrgIdentity;

    /**
    * Security information binding status. Valid values: `Unbound`, `Valid`, `Success`, `Failed`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * Member permission status. Valid values: `Confirmed`, `UnConfirmed`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PermissionStatus")
    @Expose
    private String PermissionStatus;

    /**
     * Get Member UIN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberUin Member UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Member UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberUin Member UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Member name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Member name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Member name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Member name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Member type. Valid values: `Invite` (invited); `Create` (created).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberType Member type. Valid values: `Invite` (invited); `Create` (created).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMemberType() {
        return this.MemberType;
    }

    /**
     * Set Member type. Valid values: `Invite` (invited); `Create` (created).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberType Member type. Valid values: `Invite` (invited); `Create` (created).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberType(String MemberType) {
        this.MemberType = MemberType;
    }

    /**
     * Get Relationship policy type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgPolicyType Relationship policy type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgPolicyType() {
        return this.OrgPolicyType;
    }

    /**
     * Set Relationship policy type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgPolicyType Relationship policy type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgPolicyType(String OrgPolicyType) {
        this.OrgPolicyType = OrgPolicyType;
    }

    /**
     * Get Relationship policy name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgPolicyName Relationship policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgPolicyName() {
        return this.OrgPolicyName;
    }

    /**
     * Set Relationship policy name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgPolicyName Relationship policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgPolicyName(String OrgPolicyName) {
        this.OrgPolicyName = OrgPolicyName;
    }

    /**
     * Get Relationship policy permission
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgPermission Relationship policy permission
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public OrgPermission [] getOrgPermission() {
        return this.OrgPermission;
    }

    /**
     * Set Relationship policy permission
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgPermission Relationship policy permission
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgPermission(OrgPermission [] OrgPermission) {
        this.OrgPermission = OrgPermission;
    }

    /**
     * Get Node ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeId Node ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeId Node ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeName Node name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeName Node name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether the member is allowed to leave. Valid values: `Allow`, `Denied`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsAllowQuit Whether the member is allowed to leave. Valid values: `Allow`, `Denied`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set Whether the member is allowed to leave. Valid values: `Allow`, `Denied`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsAllowQuit Whether the member is allowed to leave. Valid values: `Allow`, `Denied`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAllowQuit(String IsAllowQuit) {
        this.IsAllowQuit = IsAllowQuit;
    }

    /**
     * Get Payer UIN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayUin Payer UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set Payer UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayUin Payer UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get Payer name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayName Payer name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayName() {
        return this.PayName;
    }

    /**
     * Set Payer name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayName Payer name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayName(String PayName) {
        this.PayName = PayName;
    }

    /**
     * Get Management identity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgIdentity Management identity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MemberIdentity [] getOrgIdentity() {
        return this.OrgIdentity;
    }

    /**
     * Set Management identity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgIdentity Management identity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgIdentity(MemberIdentity [] OrgIdentity) {
        this.OrgIdentity = OrgIdentity;
    }

    /**
     * Get Security information binding status. Valid values: `Unbound`, `Valid`, `Success`, `Failed`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BindStatus Security information binding status. Valid values: `Unbound`, `Valid`, `Success`, `Failed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set Security information binding status. Valid values: `Unbound`, `Valid`, `Success`, `Failed`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BindStatus Security information binding status. Valid values: `Unbound`, `Valid`, `Success`, `Failed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get Member permission status. Valid values: `Confirmed`, `UnConfirmed`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PermissionStatus Member permission status. Valid values: `Confirmed`, `UnConfirmed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPermissionStatus() {
        return this.PermissionStatus;
    }

    /**
     * Set Member permission status. Valid values: `Confirmed`, `UnConfirmed`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PermissionStatus Member permission status. Valid values: `Confirmed`, `UnConfirmed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPermissionStatus(String PermissionStatus) {
        this.PermissionStatus = PermissionStatus;
    }

    public OrgMember() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgMember(OrgMember source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberType != null) {
            this.MemberType = new String(source.MemberType);
        }
        if (source.OrgPolicyType != null) {
            this.OrgPolicyType = new String(source.OrgPolicyType);
        }
        if (source.OrgPolicyName != null) {
            this.OrgPolicyName = new String(source.OrgPolicyName);
        }
        if (source.OrgPermission != null) {
            this.OrgPermission = new OrgPermission[source.OrgPermission.length];
            for (int i = 0; i < source.OrgPermission.length; i++) {
                this.OrgPermission[i] = new OrgPermission(source.OrgPermission[i]);
            }
        }
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsAllowQuit != null) {
            this.IsAllowQuit = new String(source.IsAllowQuit);
        }
        if (source.PayUin != null) {
            this.PayUin = new String(source.PayUin);
        }
        if (source.PayName != null) {
            this.PayName = new String(source.PayName);
        }
        if (source.OrgIdentity != null) {
            this.OrgIdentity = new MemberIdentity[source.OrgIdentity.length];
            for (int i = 0; i < source.OrgIdentity.length; i++) {
                this.OrgIdentity[i] = new MemberIdentity(source.OrgIdentity[i]);
            }
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
        if (source.PermissionStatus != null) {
            this.PermissionStatus = new String(source.PermissionStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MemberType", this.MemberType);
        this.setParamSimple(map, prefix + "OrgPolicyType", this.OrgPolicyType);
        this.setParamSimple(map, prefix + "OrgPolicyName", this.OrgPolicyName);
        this.setParamArrayObj(map, prefix + "OrgPermission.", this.OrgPermission);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsAllowQuit", this.IsAllowQuit);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);
        this.setParamSimple(map, prefix + "PayName", this.PayName);
        this.setParamArrayObj(map, prefix + "OrgIdentity.", this.OrgIdentity);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "PermissionStatus", this.PermissionStatus);

    }
}

