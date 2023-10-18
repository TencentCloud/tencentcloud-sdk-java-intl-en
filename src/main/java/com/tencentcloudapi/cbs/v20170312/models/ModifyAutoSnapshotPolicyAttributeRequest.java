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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoSnapshotPolicyAttributeRequest extends AbstractModel {

    /**
    * Scheduled snapshot policy ID.
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * Whether or not the scheduled snapshot policy is activated. FALSE: Not activated. TRUE: Activated. The default value is TRUE.
    */
    @SerializedName("IsActivated")
    @Expose
    private Boolean IsActivated;

    /**
    * Whether the snapshot created by this scheduled snapshot policy is retained permanently. FALSE: Not retained permanently. TRUE: Retained permanently. The default value is FALSE.
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * The name of the scheduled snapshot policy to be created. If it is left empty, the default is 'Not named'. The maximum length cannot exceed 60 bytes.
    */
    @SerializedName("AutoSnapshotPolicyName")
    @Expose
    private String AutoSnapshotPolicyName;

    /**
    * The policy for executing the scheduled snapshot.
    */
    @SerializedName("Policy")
    @Expose
    private Policy [] Policy;

    /**
    * Number of days to retain the snapshots created according to this scheduled snapshot policy. If this parameter is specified, `IsPermanent` cannot be specified as `TRUE`; otherwise, they will conflict with each other.
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
     * Get Scheduled snapshot policy ID. 
     * @return AutoSnapshotPolicyId Scheduled snapshot policy ID.
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set Scheduled snapshot policy ID.
     * @param AutoSnapshotPolicyId Scheduled snapshot policy ID.
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get Whether or not the scheduled snapshot policy is activated. FALSE: Not activated. TRUE: Activated. The default value is TRUE. 
     * @return IsActivated Whether or not the scheduled snapshot policy is activated. FALSE: Not activated. TRUE: Activated. The default value is TRUE.
     */
    public Boolean getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set Whether or not the scheduled snapshot policy is activated. FALSE: Not activated. TRUE: Activated. The default value is TRUE.
     * @param IsActivated Whether or not the scheduled snapshot policy is activated. FALSE: Not activated. TRUE: Activated. The default value is TRUE.
     */
    public void setIsActivated(Boolean IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get Whether the snapshot created by this scheduled snapshot policy is retained permanently. FALSE: Not retained permanently. TRUE: Retained permanently. The default value is FALSE. 
     * @return IsPermanent Whether the snapshot created by this scheduled snapshot policy is retained permanently. FALSE: Not retained permanently. TRUE: Retained permanently. The default value is FALSE.
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set Whether the snapshot created by this scheduled snapshot policy is retained permanently. FALSE: Not retained permanently. TRUE: Retained permanently. The default value is FALSE.
     * @param IsPermanent Whether the snapshot created by this scheduled snapshot policy is retained permanently. FALSE: Not retained permanently. TRUE: Retained permanently. The default value is FALSE.
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get The name of the scheduled snapshot policy to be created. If it is left empty, the default is 'Not named'. The maximum length cannot exceed 60 bytes. 
     * @return AutoSnapshotPolicyName The name of the scheduled snapshot policy to be created. If it is left empty, the default is 'Not named'. The maximum length cannot exceed 60 bytes.
     */
    public String getAutoSnapshotPolicyName() {
        return this.AutoSnapshotPolicyName;
    }

    /**
     * Set The name of the scheduled snapshot policy to be created. If it is left empty, the default is 'Not named'. The maximum length cannot exceed 60 bytes.
     * @param AutoSnapshotPolicyName The name of the scheduled snapshot policy to be created. If it is left empty, the default is 'Not named'. The maximum length cannot exceed 60 bytes.
     */
    public void setAutoSnapshotPolicyName(String AutoSnapshotPolicyName) {
        this.AutoSnapshotPolicyName = AutoSnapshotPolicyName;
    }

    /**
     * Get The policy for executing the scheduled snapshot. 
     * @return Policy The policy for executing the scheduled snapshot.
     */
    public Policy [] getPolicy() {
        return this.Policy;
    }

    /**
     * Set The policy for executing the scheduled snapshot.
     * @param Policy The policy for executing the scheduled snapshot.
     */
    public void setPolicy(Policy [] Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Number of days to retain the snapshots created according to this scheduled snapshot policy. If this parameter is specified, `IsPermanent` cannot be specified as `TRUE`; otherwise, they will conflict with each other. 
     * @return RetentionDays Number of days to retain the snapshots created according to this scheduled snapshot policy. If this parameter is specified, `IsPermanent` cannot be specified as `TRUE`; otherwise, they will conflict with each other.
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set Number of days to retain the snapshots created according to this scheduled snapshot policy. If this parameter is specified, `IsPermanent` cannot be specified as `TRUE`; otherwise, they will conflict with each other.
     * @param RetentionDays Number of days to retain the snapshots created according to this scheduled snapshot policy. If this parameter is specified, `IsPermanent` cannot be specified as `TRUE`; otherwise, they will conflict with each other.
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    public ModifyAutoSnapshotPolicyAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoSnapshotPolicyAttributeRequest(ModifyAutoSnapshotPolicyAttributeRequest source) {
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.IsActivated != null) {
            this.IsActivated = new Boolean(source.IsActivated);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.AutoSnapshotPolicyName != null) {
            this.AutoSnapshotPolicyName = new String(source.AutoSnapshotPolicyName);
        }
        if (source.Policy != null) {
            this.Policy = new Policy[source.Policy.length];
            for (int i = 0; i < source.Policy.length; i++) {
                this.Policy[i] = new Policy(source.Policy[i]);
            }
        }
        if (source.RetentionDays != null) {
            this.RetentionDays = new Long(source.RetentionDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyName", this.AutoSnapshotPolicyName);
        this.setParamArrayObj(map, prefix + "Policy.", this.Policy);
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);

    }
}

