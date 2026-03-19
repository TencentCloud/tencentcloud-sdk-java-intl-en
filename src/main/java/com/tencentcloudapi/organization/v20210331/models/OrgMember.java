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

public class OrgMember extends AbstractModel {

    /**
    * Member UIN.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Member name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Member type. Invite: invited, Create: created.
    */
    @SerializedName("MemberType")
    @Expose
    private String MemberType;

    /**
    * Relationship policy type.
    */
    @SerializedName("OrgPolicyType")
    @Expose
    private String OrgPolicyType;

    /**
    * Relational policy name.
    */
    @SerializedName("OrgPolicyName")
    @Expose
    private String OrgPolicyName;

    /**
    * Relationship policy permission.
    */
    @SerializedName("OrgPermission")
    @Expose
    private OrgPermission [] OrgPermission;

    /**
    * Node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * Node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update date
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether to allow a member to exit. Valid values: Allow, Denied.
    */
    @SerializedName("IsAllowQuit")
    @Expose
    private String IsAllowQuit;

    /**
    * Proxy payer UIN.
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * Proxy payer name.
    */
    @SerializedName("PayName")
    @Expose
    private String PayName;

    /**
    * Admin identity.
    */
    @SerializedName("OrgIdentity")
    @Expose
    private MemberIdentity [] OrgIdentity;

    /**
    * Security information binding status  Unbound: Unbound, to be activated: Valid, binding succeeded: Success, binding Failed: Failed.
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * Member's permission status. Valid values: Confirmed, UnConfirmed.
    */
    @SerializedName("PermissionStatus")
    @Expose
    private String PermissionStatus;

    /**
    * Member tag list.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Tencent cloud nickname.
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
     * Get Member UIN. 
     * @return MemberUin Member UIN.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Member UIN.
     * @param MemberUin Member UIN.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get Member name. 
     * @return Name Member name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Member name.
     * @param Name Member name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Member type. Invite: invited, Create: created. 
     * @return MemberType Member type. Invite: invited, Create: created.
     */
    public String getMemberType() {
        return this.MemberType;
    }

    /**
     * Set Member type. Invite: invited, Create: created.
     * @param MemberType Member type. Invite: invited, Create: created.
     */
    public void setMemberType(String MemberType) {
        this.MemberType = MemberType;
    }

    /**
     * Get Relationship policy type. 
     * @return OrgPolicyType Relationship policy type.
     */
    public String getOrgPolicyType() {
        return this.OrgPolicyType;
    }

    /**
     * Set Relationship policy type.
     * @param OrgPolicyType Relationship policy type.
     */
    public void setOrgPolicyType(String OrgPolicyType) {
        this.OrgPolicyType = OrgPolicyType;
    }

    /**
     * Get Relational policy name. 
     * @return OrgPolicyName Relational policy name.
     */
    public String getOrgPolicyName() {
        return this.OrgPolicyName;
    }

    /**
     * Set Relational policy name.
     * @param OrgPolicyName Relational policy name.
     */
    public void setOrgPolicyName(String OrgPolicyName) {
        this.OrgPolicyName = OrgPolicyName;
    }

    /**
     * Get Relationship policy permission. 
     * @return OrgPermission Relationship policy permission.
     */
    public OrgPermission [] getOrgPermission() {
        return this.OrgPermission;
    }

    /**
     * Set Relationship policy permission.
     * @param OrgPermission Relationship policy permission.
     */
    public void setOrgPermission(OrgPermission [] OrgPermission) {
        this.OrgPermission = OrgPermission;
    }

    /**
     * Get Node ID. 
     * @return NodeId Node ID.
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID.
     * @param NodeId Node ID.
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node name. 
     * @return NodeName Node name.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name.
     * @param NodeName Node name.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update date 
     * @return UpdateTime Update date
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update date
     * @param UpdateTime Update date
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether to allow a member to exit. Valid values: Allow, Denied. 
     * @return IsAllowQuit Whether to allow a member to exit. Valid values: Allow, Denied.
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set Whether to allow a member to exit. Valid values: Allow, Denied.
     * @param IsAllowQuit Whether to allow a member to exit. Valid values: Allow, Denied.
     */
    public void setIsAllowQuit(String IsAllowQuit) {
        this.IsAllowQuit = IsAllowQuit;
    }

    /**
     * Get Proxy payer UIN. 
     * @return PayUin Proxy payer UIN.
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set Proxy payer UIN.
     * @param PayUin Proxy payer UIN.
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get Proxy payer name. 
     * @return PayName Proxy payer name.
     */
    public String getPayName() {
        return this.PayName;
    }

    /**
     * Set Proxy payer name.
     * @param PayName Proxy payer name.
     */
    public void setPayName(String PayName) {
        this.PayName = PayName;
    }

    /**
     * Get Admin identity. 
     * @return OrgIdentity Admin identity.
     */
    public MemberIdentity [] getOrgIdentity() {
        return this.OrgIdentity;
    }

    /**
     * Set Admin identity.
     * @param OrgIdentity Admin identity.
     */
    public void setOrgIdentity(MemberIdentity [] OrgIdentity) {
        this.OrgIdentity = OrgIdentity;
    }

    /**
     * Get Security information binding status  Unbound: Unbound, to be activated: Valid, binding succeeded: Success, binding Failed: Failed. 
     * @return BindStatus Security information binding status  Unbound: Unbound, to be activated: Valid, binding succeeded: Success, binding Failed: Failed.
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set Security information binding status  Unbound: Unbound, to be activated: Valid, binding succeeded: Success, binding Failed: Failed.
     * @param BindStatus Security information binding status  Unbound: Unbound, to be activated: Valid, binding succeeded: Success, binding Failed: Failed.
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get Member's permission status. Valid values: Confirmed, UnConfirmed. 
     * @return PermissionStatus Member's permission status. Valid values: Confirmed, UnConfirmed.
     */
    public String getPermissionStatus() {
        return this.PermissionStatus;
    }

    /**
     * Set Member's permission status. Valid values: Confirmed, UnConfirmed.
     * @param PermissionStatus Member's permission status. Valid values: Confirmed, UnConfirmed.
     */
    public void setPermissionStatus(String PermissionStatus) {
        this.PermissionStatus = PermissionStatus;
    }

    /**
     * Get Member tag list. 
     * @return Tags Member tag list.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Member tag list.
     * @param Tags Member tag list.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Tencent cloud nickname. 
     * @return NickName Tencent cloud nickname.
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Tencent cloud nickname.
     * @param NickName Tencent cloud nickname.
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NickName", this.NickName);

    }
}

