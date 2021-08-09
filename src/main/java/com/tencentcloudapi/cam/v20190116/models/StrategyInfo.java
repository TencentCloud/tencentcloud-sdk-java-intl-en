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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StrategyInfo extends AbstractModel{

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Time policy created
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Policy type. 1: Custom policy; 2: Preset policy
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Policy description
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * How the policy was created: 1: Via console; 2: Via syntax
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * Number of associated users
    */
    @SerializedName("Attachments")
    @Expose
    private Long Attachments;

    /**
    * Product associated with the policy
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * This value should not be null when querying whether a marked entity has been associated with a policy. 0 indicates that no policy has been associated, while 1 indicates that a policy has been associated
    */
    @SerializedName("IsAttached")
    @Expose
    private Long IsAttached;

    /**
    * Queries if the policy has been deactivated
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Deactived")
    @Expose
    private Long Deactived;

    /**
    * List of deprecated products
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeactivedDetail")
    @Expose
    private String [] DeactivedDetail;

    /**
    * The deletion task identifier used to check the deletion status of the service-linked role
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsServiceLinkedPolicy")
    @Expose
    private Long IsServiceLinkedPolicy;

    /**
    * The number of entities associated with the policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AttachEntityCount")
    @Expose
    private Long AttachEntityCount;

    /**
    * The number of entities associated with the permission boundary.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AttachEntityBoundaryCount")
    @Expose
    private Long AttachEntityBoundaryCount;

    /**
    * The last editted time.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy name 
     * @return PolicyName Policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
     * @param PolicyName Policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Time policy created
Note: This field may return null, indicating that no valid value was found. 
     * @return AddTime Time policy created
Note: This field may return null, indicating that no valid value was found.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Time policy created
Note: This field may return null, indicating that no valid value was found.
     * @param AddTime Time policy created
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Policy type. 1: Custom policy; 2: Preset policy 
     * @return Type Policy type. 1: Custom policy; 2: Preset policy
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Policy type. 1: Custom policy; 2: Preset policy
     * @param Type Policy type. 1: Custom policy; 2: Preset policy
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Policy description
Note: This field may return null, indicating that no valid value was found. 
     * @return Description Policy description
Note: This field may return null, indicating that no valid value was found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description
Note: This field may return null, indicating that no valid value was found.
     * @param Description Policy description
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get How the policy was created: 1: Via console; 2: Via syntax 
     * @return CreateMode How the policy was created: 1: Via console; 2: Via syntax
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set How the policy was created: 1: Via console; 2: Via syntax
     * @param CreateMode How the policy was created: 1: Via console; 2: Via syntax
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Get Number of associated users 
     * @return Attachments Number of associated users
     */
    public Long getAttachments() {
        return this.Attachments;
    }

    /**
     * Set Number of associated users
     * @param Attachments Number of associated users
     */
    public void setAttachments(Long Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get Product associated with the policy
Note: This field may return null, indicating that no valid value was found. 
     * @return ServiceType Product associated with the policy
Note: This field may return null, indicating that no valid value was found.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Product associated with the policy
Note: This field may return null, indicating that no valid value was found.
     * @param ServiceType Product associated with the policy
Note: This field may return null, indicating that no valid value was found.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get This value should not be null when querying whether a marked entity has been associated with a policy. 0 indicates that no policy has been associated, while 1 indicates that a policy has been associated 
     * @return IsAttached This value should not be null when querying whether a marked entity has been associated with a policy. 0 indicates that no policy has been associated, while 1 indicates that a policy has been associated
     */
    public Long getIsAttached() {
        return this.IsAttached;
    }

    /**
     * Set This value should not be null when querying whether a marked entity has been associated with a policy. 0 indicates that no policy has been associated, while 1 indicates that a policy has been associated
     * @param IsAttached This value should not be null when querying whether a marked entity has been associated with a policy. 0 indicates that no policy has been associated, while 1 indicates that a policy has been associated
     */
    public void setIsAttached(Long IsAttached) {
        this.IsAttached = IsAttached;
    }

    /**
     * Get Queries if the policy has been deactivated
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Deactived Queries if the policy has been deactivated
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDeactived() {
        return this.Deactived;
    }

    /**
     * Set Queries if the policy has been deactivated
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Deactived Queries if the policy has been deactivated
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeactived(Long Deactived) {
        this.Deactived = Deactived;
    }

    /**
     * Get List of deprecated products
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeactivedDetail List of deprecated products
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDeactivedDetail() {
        return this.DeactivedDetail;
    }

    /**
     * Set List of deprecated products
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeactivedDetail List of deprecated products
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeactivedDetail(String [] DeactivedDetail) {
        this.DeactivedDetail = DeactivedDetail;
    }

    /**
     * Get The deletion task identifier used to check the deletion status of the service-linked role
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsServiceLinkedPolicy The deletion task identifier used to check the deletion status of the service-linked role
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsServiceLinkedPolicy() {
        return this.IsServiceLinkedPolicy;
    }

    /**
     * Set The deletion task identifier used to check the deletion status of the service-linked role
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsServiceLinkedPolicy The deletion task identifier used to check the deletion status of the service-linked role
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsServiceLinkedPolicy(Long IsServiceLinkedPolicy) {
        this.IsServiceLinkedPolicy = IsServiceLinkedPolicy;
    }

    /**
     * Get The number of entities associated with the policy.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AttachEntityCount The number of entities associated with the policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getAttachEntityCount() {
        return this.AttachEntityCount;
    }

    /**
     * Set The number of entities associated with the policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AttachEntityCount The number of entities associated with the policy.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAttachEntityCount(Long AttachEntityCount) {
        this.AttachEntityCount = AttachEntityCount;
    }

    /**
     * Get The number of entities associated with the permission boundary.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AttachEntityBoundaryCount The number of entities associated with the permission boundary.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getAttachEntityBoundaryCount() {
        return this.AttachEntityBoundaryCount;
    }

    /**
     * Set The number of entities associated with the permission boundary.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AttachEntityBoundaryCount The number of entities associated with the permission boundary.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAttachEntityBoundaryCount(Long AttachEntityBoundaryCount) {
        this.AttachEntityBoundaryCount = AttachEntityBoundaryCount;
    }

    /**
     * Get The last editted time.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return UpdateTime The last editted time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last editted time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param UpdateTime The last editted time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public StrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrategyInfo(StrategyInfo source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateMode != null) {
            this.CreateMode = new Long(source.CreateMode);
        }
        if (source.Attachments != null) {
            this.Attachments = new Long(source.Attachments);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.IsAttached != null) {
            this.IsAttached = new Long(source.IsAttached);
        }
        if (source.Deactived != null) {
            this.Deactived = new Long(source.Deactived);
        }
        if (source.DeactivedDetail != null) {
            this.DeactivedDetail = new String[source.DeactivedDetail.length];
            for (int i = 0; i < source.DeactivedDetail.length; i++) {
                this.DeactivedDetail[i] = new String(source.DeactivedDetail[i]);
            }
        }
        if (source.IsServiceLinkedPolicy != null) {
            this.IsServiceLinkedPolicy = new Long(source.IsServiceLinkedPolicy);
        }
        if (source.AttachEntityCount != null) {
            this.AttachEntityCount = new Long(source.AttachEntityCount);
        }
        if (source.AttachEntityBoundaryCount != null) {
            this.AttachEntityBoundaryCount = new Long(source.AttachEntityBoundaryCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "Attachments", this.Attachments);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "IsAttached", this.IsAttached);
        this.setParamSimple(map, prefix + "Deactived", this.Deactived);
        this.setParamArraySimple(map, prefix + "DeactivedDetail.", this.DeactivedDetail);
        this.setParamSimple(map, prefix + "IsServiceLinkedPolicy", this.IsServiceLinkedPolicy);
        this.setParamSimple(map, prefix + "AttachEntityCount", this.AttachEntityCount);
        this.setParamSimple(map, prefix + "AttachEntityBoundaryCount", this.AttachEntityBoundaryCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

