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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoSnapshotPolicy extends AbstractModel{

    /**
    * The list of cloud disk IDs that the current scheduled snapshot policy is bound to.
    */
    @SerializedName("DiskIdSet")
    @Expose
    private String [] DiskIdSet;

    /**
    * Whether scheduled snapshot policy is activated.
    */
    @SerializedName("IsActivated")
    @Expose
    private Boolean IsActivated;

    /**
    * Scheduled snapshot policy state. Value range:<br><li>NORMAL: Normal<br><li>ISOLATED: Isolated.
    */
    @SerializedName("AutoSnapshotPolicyState")
    @Expose
    private String AutoSnapshotPolicyState;

    /**
    * Whether it is to replicate a snapshot across accounts. `1`: yes, `0`: no.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCopyToRemote")
    @Expose
    private Long IsCopyToRemote;

    /**
    * Whether the snapshot created by this scheduled snapshot policy is retained permanently.
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * The time the scheduled snapshot will be triggered again.
    */
    @SerializedName("NextTriggerTime")
    @Expose
    private String NextTriggerTime;

    /**
    * Scheduled snapshot policy name.
    */
    @SerializedName("AutoSnapshotPolicyName")
    @Expose
    private String AutoSnapshotPolicyName;

    /**
    * Scheduled snapshot policy ID.
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * The policy for executing the scheduled snapshot.
    */
    @SerializedName("Policy")
    @Expose
    private Policy [] Policy;

    /**
    * The time the scheduled snapshot policy was created.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Number of days the snapshot created by this scheduled snapshot policy is retained.
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * ID of the replication target account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CopyToAccountUin")
    @Expose
    private String CopyToAccountUin;

    /**
    * List of IDs of the instances associated with the scheduled snapshot policy.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * The number of months for which the snapshots created by this scheduled snapshot policy can be retained.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetentionMonths")
    @Expose
    private Long RetentionMonths;

    /**
    * The maximum number of snapshots created by this scheduled snapshot policy that can be retained.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetentionAmount")
    @Expose
    private Long RetentionAmount;

    /**
    * Retention policy for scheduled snapshots.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdvancedRetentionPolicy")
    @Expose
    private AdvancedRetentionPolicy AdvancedRetentionPolicy;

    /**
    * 
    */
    @SerializedName("CopyFromAccountUin")
    @Expose
    private String CopyFromAccountUin;

    /**
    * 
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get The list of cloud disk IDs that the current scheduled snapshot policy is bound to. 
     * @return DiskIdSet The list of cloud disk IDs that the current scheduled snapshot policy is bound to.
     */
    public String [] getDiskIdSet() {
        return this.DiskIdSet;
    }

    /**
     * Set The list of cloud disk IDs that the current scheduled snapshot policy is bound to.
     * @param DiskIdSet The list of cloud disk IDs that the current scheduled snapshot policy is bound to.
     */
    public void setDiskIdSet(String [] DiskIdSet) {
        this.DiskIdSet = DiskIdSet;
    }

    /**
     * Get Whether scheduled snapshot policy is activated. 
     * @return IsActivated Whether scheduled snapshot policy is activated.
     */
    public Boolean getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set Whether scheduled snapshot policy is activated.
     * @param IsActivated Whether scheduled snapshot policy is activated.
     */
    public void setIsActivated(Boolean IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get Scheduled snapshot policy state. Value range:<br><li>NORMAL: Normal<br><li>ISOLATED: Isolated. 
     * @return AutoSnapshotPolicyState Scheduled snapshot policy state. Value range:<br><li>NORMAL: Normal<br><li>ISOLATED: Isolated.
     */
    public String getAutoSnapshotPolicyState() {
        return this.AutoSnapshotPolicyState;
    }

    /**
     * Set Scheduled snapshot policy state. Value range:<br><li>NORMAL: Normal<br><li>ISOLATED: Isolated.
     * @param AutoSnapshotPolicyState Scheduled snapshot policy state. Value range:<br><li>NORMAL: Normal<br><li>ISOLATED: Isolated.
     */
    public void setAutoSnapshotPolicyState(String AutoSnapshotPolicyState) {
        this.AutoSnapshotPolicyState = AutoSnapshotPolicyState;
    }

    /**
     * Get Whether it is to replicate a snapshot across accounts. `1`: yes, `0`: no.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsCopyToRemote Whether it is to replicate a snapshot across accounts. `1`: yes, `0`: no.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsCopyToRemote() {
        return this.IsCopyToRemote;
    }

    /**
     * Set Whether it is to replicate a snapshot across accounts. `1`: yes, `0`: no.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsCopyToRemote Whether it is to replicate a snapshot across accounts. `1`: yes, `0`: no.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsCopyToRemote(Long IsCopyToRemote) {
        this.IsCopyToRemote = IsCopyToRemote;
    }

    /**
     * Get Whether the snapshot created by this scheduled snapshot policy is retained permanently. 
     * @return IsPermanent Whether the snapshot created by this scheduled snapshot policy is retained permanently.
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set Whether the snapshot created by this scheduled snapshot policy is retained permanently.
     * @param IsPermanent Whether the snapshot created by this scheduled snapshot policy is retained permanently.
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get The time the scheduled snapshot will be triggered again. 
     * @return NextTriggerTime The time the scheduled snapshot will be triggered again.
     */
    public String getNextTriggerTime() {
        return this.NextTriggerTime;
    }

    /**
     * Set The time the scheduled snapshot will be triggered again.
     * @param NextTriggerTime The time the scheduled snapshot will be triggered again.
     */
    public void setNextTriggerTime(String NextTriggerTime) {
        this.NextTriggerTime = NextTriggerTime;
    }

    /**
     * Get Scheduled snapshot policy name. 
     * @return AutoSnapshotPolicyName Scheduled snapshot policy name.
     */
    public String getAutoSnapshotPolicyName() {
        return this.AutoSnapshotPolicyName;
    }

    /**
     * Set Scheduled snapshot policy name.
     * @param AutoSnapshotPolicyName Scheduled snapshot policy name.
     */
    public void setAutoSnapshotPolicyName(String AutoSnapshotPolicyName) {
        this.AutoSnapshotPolicyName = AutoSnapshotPolicyName;
    }

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
     * Get The time the scheduled snapshot policy was created. 
     * @return CreateTime The time the scheduled snapshot policy was created.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The time the scheduled snapshot policy was created.
     * @param CreateTime The time the scheduled snapshot policy was created.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Number of days the snapshot created by this scheduled snapshot policy is retained. 
     * @return RetentionDays Number of days the snapshot created by this scheduled snapshot policy is retained.
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set Number of days the snapshot created by this scheduled snapshot policy is retained.
     * @param RetentionDays Number of days the snapshot created by this scheduled snapshot policy is retained.
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    /**
     * Get ID of the replication target account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CopyToAccountUin ID of the replication target account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCopyToAccountUin() {
        return this.CopyToAccountUin;
    }

    /**
     * Set ID of the replication target account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CopyToAccountUin ID of the replication target account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCopyToAccountUin(String CopyToAccountUin) {
        this.CopyToAccountUin = CopyToAccountUin;
    }

    /**
     * Get List of IDs of the instances associated with the scheduled snapshot policy.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceIdSet List of IDs of the instances associated with the scheduled snapshot policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set List of IDs of the instances associated with the scheduled snapshot policy.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceIdSet List of IDs of the instances associated with the scheduled snapshot policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get The number of months for which the snapshots created by this scheduled snapshot policy can be retained.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetentionMonths The number of months for which the snapshots created by this scheduled snapshot policy can be retained.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetentionMonths() {
        return this.RetentionMonths;
    }

    /**
     * Set The number of months for which the snapshots created by this scheduled snapshot policy can be retained.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetentionMonths The number of months for which the snapshots created by this scheduled snapshot policy can be retained.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetentionMonths(Long RetentionMonths) {
        this.RetentionMonths = RetentionMonths;
    }

    /**
     * Get The maximum number of snapshots created by this scheduled snapshot policy that can be retained.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetentionAmount The maximum number of snapshots created by this scheduled snapshot policy that can be retained.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetentionAmount() {
        return this.RetentionAmount;
    }

    /**
     * Set The maximum number of snapshots created by this scheduled snapshot policy that can be retained.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetentionAmount The maximum number of snapshots created by this scheduled snapshot policy that can be retained.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetentionAmount(Long RetentionAmount) {
        this.RetentionAmount = RetentionAmount;
    }

    /**
     * Get Retention policy for scheduled snapshots.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdvancedRetentionPolicy Retention policy for scheduled snapshots.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AdvancedRetentionPolicy getAdvancedRetentionPolicy() {
        return this.AdvancedRetentionPolicy;
    }

    /**
     * Set Retention policy for scheduled snapshots.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdvancedRetentionPolicy Retention policy for scheduled snapshots.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdvancedRetentionPolicy(AdvancedRetentionPolicy AdvancedRetentionPolicy) {
        this.AdvancedRetentionPolicy = AdvancedRetentionPolicy;
    }

    /**
     * Get  
     * @return CopyFromAccountUin 
     */
    public String getCopyFromAccountUin() {
        return this.CopyFromAccountUin;
    }

    /**
     * Set 
     * @param CopyFromAccountUin 
     */
    public void setCopyFromAccountUin(String CopyFromAccountUin) {
        this.CopyFromAccountUin = CopyFromAccountUin;
    }

    /**
     * Get  
     * @return Tags 
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 
     * @param Tags 
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public AutoSnapshotPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoSnapshotPolicy(AutoSnapshotPolicy source) {
        if (source.DiskIdSet != null) {
            this.DiskIdSet = new String[source.DiskIdSet.length];
            for (int i = 0; i < source.DiskIdSet.length; i++) {
                this.DiskIdSet[i] = new String(source.DiskIdSet[i]);
            }
        }
        if (source.IsActivated != null) {
            this.IsActivated = new Boolean(source.IsActivated);
        }
        if (source.AutoSnapshotPolicyState != null) {
            this.AutoSnapshotPolicyState = new String(source.AutoSnapshotPolicyState);
        }
        if (source.IsCopyToRemote != null) {
            this.IsCopyToRemote = new Long(source.IsCopyToRemote);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.NextTriggerTime != null) {
            this.NextTriggerTime = new String(source.NextTriggerTime);
        }
        if (source.AutoSnapshotPolicyName != null) {
            this.AutoSnapshotPolicyName = new String(source.AutoSnapshotPolicyName);
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.Policy != null) {
            this.Policy = new Policy[source.Policy.length];
            for (int i = 0; i < source.Policy.length; i++) {
                this.Policy[i] = new Policy(source.Policy[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RetentionDays != null) {
            this.RetentionDays = new Long(source.RetentionDays);
        }
        if (source.CopyToAccountUin != null) {
            this.CopyToAccountUin = new String(source.CopyToAccountUin);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.RetentionMonths != null) {
            this.RetentionMonths = new Long(source.RetentionMonths);
        }
        if (source.RetentionAmount != null) {
            this.RetentionAmount = new Long(source.RetentionAmount);
        }
        if (source.AdvancedRetentionPolicy != null) {
            this.AdvancedRetentionPolicy = new AdvancedRetentionPolicy(source.AdvancedRetentionPolicy);
        }
        if (source.CopyFromAccountUin != null) {
            this.CopyFromAccountUin = new String(source.CopyFromAccountUin);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIdSet.", this.DiskIdSet);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyState", this.AutoSnapshotPolicyState);
        this.setParamSimple(map, prefix + "IsCopyToRemote", this.IsCopyToRemote);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "NextTriggerTime", this.NextTriggerTime);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyName", this.AutoSnapshotPolicyName);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamArrayObj(map, prefix + "Policy.", this.Policy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);
        this.setParamSimple(map, prefix + "CopyToAccountUin", this.CopyToAccountUin);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "RetentionMonths", this.RetentionMonths);
        this.setParamSimple(map, prefix + "RetentionAmount", this.RetentionAmount);
        this.setParamObj(map, prefix + "AdvancedRetentionPolicy.", this.AdvancedRetentionPolicy);
        this.setParamSimple(map, prefix + "CopyFromAccountUin", this.CopyFromAccountUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

