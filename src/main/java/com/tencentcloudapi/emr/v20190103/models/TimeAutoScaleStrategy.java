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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeAutoScaleStrategy extends AbstractModel {

    /**
    * Policy name, which is unique within one cluster.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Cooldown time after the policy is triggered, during which auto scaling cannot be triggered.
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * Scaling action. Valid values: 1 (scale-out) and 2 (scale-in).
    */
    @SerializedName("ScaleAction")
    @Expose
    private Long ScaleAction;

    /**
    * Number of scaling operations.
    */
    @SerializedName("ScaleNum")
    @Expose
    private Long ScaleNum;

    /**
    * (Required) Rule status. Valid values: 1 (valid), 2 (invalid), and 3 (suspended).
    */
    @SerializedName("StrategyStatus")
    @Expose
    private Long StrategyStatus;

    /**
    * Rule priority. A smaller value indicates a higher priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * When multiple rules are triggered at the same time and some are not really executed, retries are performed within this time range.
    */
    @SerializedName("RetryValidTime")
    @Expose
    private Long RetryValidTime;

    /**
    * Time scaling repetition policy.
    */
    @SerializedName("RepeatStrategy")
    @Expose
    private RepeatStrategy RepeatStrategy;

    /**
    * Unique policy ID.
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Graceful scale-in switch.
    */
    @SerializedName("GraceDownFlag")
    @Expose
    private Boolean GraceDownFlag;

    /**
    * Graceful scale-in wait time.
    */
    @SerializedName("GraceDownTime")
    @Expose
    private Long GraceDownTime;

    /**
    * Whether to enable task protection.
    */
    @SerializedName("GraceDownProtectFlag")
    @Expose
    private Boolean GraceDownProtectFlag;

    /**
    * Bound tag list.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Preset configuration group.
    */
    @SerializedName("ConfigGroupAssigned")
    @Expose
    private String ConfigGroupAssigned;

    /**
    * Calculation method for scaled‑out resources. Valid values: "DEFAULT", "INSTANCE", "CPU", and "MEMORYGB".
"DEFAULT" indicates the default calculation method, which is identical to "INSTANCE".
"INSTANCE" indicates the calculation method based on nodes. This is the default method.
"CPU" indicates the calculation method based on the number of cores of the machine.
"MEMORYGB" indicates the calculation method based on the memory size of the machine.
    */
    @SerializedName("MeasureMethod")
    @Expose
    private String MeasureMethod;

    /**
    * Termination policy. "DEFAULT" indicates the default policy with which the scale-in is triggered by using scale-in rules. "TIMING" indicates scheduled termination.
    */
    @SerializedName("TerminatePolicy")
    @Expose
    private String TerminatePolicy;

    /**
    * Maximum usage time. The minimum value is 1 hour, and the maximum value is 24 hours.
    */
    @SerializedName("MaxUse")
    @Expose
    private Long MaxUse;

    /**
    * List of services deployed on the node. Valid values: HDFS and YARN. For details, see [Mapping Table for Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * Startup process list.
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * Compensatory scale-out. Valid values: 0 (disabled) and 1 (enabled).
    */
    @SerializedName("CompensateFlag")
    @Expose
    private Long CompensateFlag;

    /**
    * Scaling group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Pod tag for the graceful scale-in business. Nodes are scaled in when the Pod mentioned above is not found on the node or the graceful scale-in time has elapsed.
    */
    @SerializedName("GraceDownLabel")
    @Expose
    private TkeLabel [] GraceDownLabel;

    /**
    * Task protection time.
    */
    @SerializedName("GraceDownProtectTime")
    @Expose
    private Long GraceDownProtectTime;

    /**
     * Get Policy name, which is unique within one cluster. 
     * @return StrategyName Policy name, which is unique within one cluster.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name, which is unique within one cluster.
     * @param StrategyName Policy name, which is unique within one cluster.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Cooldown time after the policy is triggered, during which auto scaling cannot be triggered. 
     * @return IntervalTime Cooldown time after the policy is triggered, during which auto scaling cannot be triggered.
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set Cooldown time after the policy is triggered, during which auto scaling cannot be triggered.
     * @param IntervalTime Cooldown time after the policy is triggered, during which auto scaling cannot be triggered.
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get Scaling action. Valid values: 1 (scale-out) and 2 (scale-in). 
     * @return ScaleAction Scaling action. Valid values: 1 (scale-out) and 2 (scale-in).
     */
    public Long getScaleAction() {
        return this.ScaleAction;
    }

    /**
     * Set Scaling action. Valid values: 1 (scale-out) and 2 (scale-in).
     * @param ScaleAction Scaling action. Valid values: 1 (scale-out) and 2 (scale-in).
     */
    public void setScaleAction(Long ScaleAction) {
        this.ScaleAction = ScaleAction;
    }

    /**
     * Get Number of scaling operations. 
     * @return ScaleNum Number of scaling operations.
     */
    public Long getScaleNum() {
        return this.ScaleNum;
    }

    /**
     * Set Number of scaling operations.
     * @param ScaleNum Number of scaling operations.
     */
    public void setScaleNum(Long ScaleNum) {
        this.ScaleNum = ScaleNum;
    }

    /**
     * Get (Required) Rule status. Valid values: 1 (valid), 2 (invalid), and 3 (suspended). 
     * @return StrategyStatus (Required) Rule status. Valid values: 1 (valid), 2 (invalid), and 3 (suspended).
     */
    public Long getStrategyStatus() {
        return this.StrategyStatus;
    }

    /**
     * Set (Required) Rule status. Valid values: 1 (valid), 2 (invalid), and 3 (suspended).
     * @param StrategyStatus (Required) Rule status. Valid values: 1 (valid), 2 (invalid), and 3 (suspended).
     */
    public void setStrategyStatus(Long StrategyStatus) {
        this.StrategyStatus = StrategyStatus;
    }

    /**
     * Get Rule priority. A smaller value indicates a higher priority. 
     * @return Priority Rule priority. A smaller value indicates a higher priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Rule priority. A smaller value indicates a higher priority.
     * @param Priority Rule priority. A smaller value indicates a higher priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get When multiple rules are triggered at the same time and some are not really executed, retries are performed within this time range. 
     * @return RetryValidTime When multiple rules are triggered at the same time and some are not really executed, retries are performed within this time range.
     */
    public Long getRetryValidTime() {
        return this.RetryValidTime;
    }

    /**
     * Set When multiple rules are triggered at the same time and some are not really executed, retries are performed within this time range.
     * @param RetryValidTime When multiple rules are triggered at the same time and some are not really executed, retries are performed within this time range.
     */
    public void setRetryValidTime(Long RetryValidTime) {
        this.RetryValidTime = RetryValidTime;
    }

    /**
     * Get Time scaling repetition policy. 
     * @return RepeatStrategy Time scaling repetition policy.
     */
    public RepeatStrategy getRepeatStrategy() {
        return this.RepeatStrategy;
    }

    /**
     * Set Time scaling repetition policy.
     * @param RepeatStrategy Time scaling repetition policy.
     */
    public void setRepeatStrategy(RepeatStrategy RepeatStrategy) {
        this.RepeatStrategy = RepeatStrategy;
    }

    /**
     * Get Unique policy ID. 
     * @return StrategyId Unique policy ID.
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Unique policy ID.
     * @param StrategyId Unique policy ID.
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Graceful scale-in switch. 
     * @return GraceDownFlag Graceful scale-in switch.
     */
    public Boolean getGraceDownFlag() {
        return this.GraceDownFlag;
    }

    /**
     * Set Graceful scale-in switch.
     * @param GraceDownFlag Graceful scale-in switch.
     */
    public void setGraceDownFlag(Boolean GraceDownFlag) {
        this.GraceDownFlag = GraceDownFlag;
    }

    /**
     * Get Graceful scale-in wait time. 
     * @return GraceDownTime Graceful scale-in wait time.
     */
    public Long getGraceDownTime() {
        return this.GraceDownTime;
    }

    /**
     * Set Graceful scale-in wait time.
     * @param GraceDownTime Graceful scale-in wait time.
     */
    public void setGraceDownTime(Long GraceDownTime) {
        this.GraceDownTime = GraceDownTime;
    }

    /**
     * Get Whether to enable task protection. 
     * @return GraceDownProtectFlag Whether to enable task protection.
     */
    public Boolean getGraceDownProtectFlag() {
        return this.GraceDownProtectFlag;
    }

    /**
     * Set Whether to enable task protection.
     * @param GraceDownProtectFlag Whether to enable task protection.
     */
    public void setGraceDownProtectFlag(Boolean GraceDownProtectFlag) {
        this.GraceDownProtectFlag = GraceDownProtectFlag;
    }

    /**
     * Get Bound tag list. 
     * @return Tags Bound tag list.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Bound tag list.
     * @param Tags Bound tag list.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Preset configuration group. 
     * @return ConfigGroupAssigned Preset configuration group.
     */
    public String getConfigGroupAssigned() {
        return this.ConfigGroupAssigned;
    }

    /**
     * Set Preset configuration group.
     * @param ConfigGroupAssigned Preset configuration group.
     */
    public void setConfigGroupAssigned(String ConfigGroupAssigned) {
        this.ConfigGroupAssigned = ConfigGroupAssigned;
    }

    /**
     * Get Calculation method for scaled‑out resources. Valid values: "DEFAULT", "INSTANCE", "CPU", and "MEMORYGB".
"DEFAULT" indicates the default calculation method, which is identical to "INSTANCE".
"INSTANCE" indicates the calculation method based on nodes. This is the default method.
"CPU" indicates the calculation method based on the number of cores of the machine.
"MEMORYGB" indicates the calculation method based on the memory size of the machine. 
     * @return MeasureMethod Calculation method for scaled‑out resources. Valid values: "DEFAULT", "INSTANCE", "CPU", and "MEMORYGB".
"DEFAULT" indicates the default calculation method, which is identical to "INSTANCE".
"INSTANCE" indicates the calculation method based on nodes. This is the default method.
"CPU" indicates the calculation method based on the number of cores of the machine.
"MEMORYGB" indicates the calculation method based on the memory size of the machine.
     */
    public String getMeasureMethod() {
        return this.MeasureMethod;
    }

    /**
     * Set Calculation method for scaled‑out resources. Valid values: "DEFAULT", "INSTANCE", "CPU", and "MEMORYGB".
"DEFAULT" indicates the default calculation method, which is identical to "INSTANCE".
"INSTANCE" indicates the calculation method based on nodes. This is the default method.
"CPU" indicates the calculation method based on the number of cores of the machine.
"MEMORYGB" indicates the calculation method based on the memory size of the machine.
     * @param MeasureMethod Calculation method for scaled‑out resources. Valid values: "DEFAULT", "INSTANCE", "CPU", and "MEMORYGB".
"DEFAULT" indicates the default calculation method, which is identical to "INSTANCE".
"INSTANCE" indicates the calculation method based on nodes. This is the default method.
"CPU" indicates the calculation method based on the number of cores of the machine.
"MEMORYGB" indicates the calculation method based on the memory size of the machine.
     */
    public void setMeasureMethod(String MeasureMethod) {
        this.MeasureMethod = MeasureMethod;
    }

    /**
     * Get Termination policy. "DEFAULT" indicates the default policy with which the scale-in is triggered by using scale-in rules. "TIMING" indicates scheduled termination. 
     * @return TerminatePolicy Termination policy. "DEFAULT" indicates the default policy with which the scale-in is triggered by using scale-in rules. "TIMING" indicates scheduled termination.
     */
    public String getTerminatePolicy() {
        return this.TerminatePolicy;
    }

    /**
     * Set Termination policy. "DEFAULT" indicates the default policy with which the scale-in is triggered by using scale-in rules. "TIMING" indicates scheduled termination.
     * @param TerminatePolicy Termination policy. "DEFAULT" indicates the default policy with which the scale-in is triggered by using scale-in rules. "TIMING" indicates scheduled termination.
     */
    public void setTerminatePolicy(String TerminatePolicy) {
        this.TerminatePolicy = TerminatePolicy;
    }

    /**
     * Get Maximum usage time. The minimum value is 1 hour, and the maximum value is 24 hours. 
     * @return MaxUse Maximum usage time. The minimum value is 1 hour, and the maximum value is 24 hours.
     */
    public Long getMaxUse() {
        return this.MaxUse;
    }

    /**
     * Set Maximum usage time. The minimum value is 1 hour, and the maximum value is 24 hours.
     * @param MaxUse Maximum usage time. The minimum value is 1 hour, and the maximum value is 24 hours.
     */
    public void setMaxUse(Long MaxUse) {
        this.MaxUse = MaxUse;
    }

    /**
     * Get List of services deployed on the node. Valid values: HDFS and YARN. For details, see [Mapping Table for Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1). 
     * @return SoftDeployInfo List of services deployed on the node. Valid values: HDFS and YARN. For details, see [Mapping Table for Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set List of services deployed on the node. Valid values: HDFS and YARN. For details, see [Mapping Table for Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
     * @param SoftDeployInfo List of services deployed on the node. Valid values: HDFS and YARN. For details, see [Mapping Table for Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get Startup process list. 
     * @return ServiceNodeInfo Startup process list.
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set Startup process list.
     * @param ServiceNodeInfo Startup process list.
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get Compensatory scale-out. Valid values: 0 (disabled) and 1 (enabled). 
     * @return CompensateFlag Compensatory scale-out. Valid values: 0 (disabled) and 1 (enabled).
     */
    public Long getCompensateFlag() {
        return this.CompensateFlag;
    }

    /**
     * Set Compensatory scale-out. Valid values: 0 (disabled) and 1 (enabled).
     * @param CompensateFlag Compensatory scale-out. Valid values: 0 (disabled) and 1 (enabled).
     */
    public void setCompensateFlag(Long CompensateFlag) {
        this.CompensateFlag = CompensateFlag;
    }

    /**
     * Get Scaling group ID. 
     * @return GroupId Scaling group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Scaling group ID.
     * @param GroupId Scaling group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Pod tag for the graceful scale-in business. Nodes are scaled in when the Pod mentioned above is not found on the node or the graceful scale-in time has elapsed. 
     * @return GraceDownLabel Pod tag for the graceful scale-in business. Nodes are scaled in when the Pod mentioned above is not found on the node or the graceful scale-in time has elapsed.
     */
    public TkeLabel [] getGraceDownLabel() {
        return this.GraceDownLabel;
    }

    /**
     * Set Pod tag for the graceful scale-in business. Nodes are scaled in when the Pod mentioned above is not found on the node or the graceful scale-in time has elapsed.
     * @param GraceDownLabel Pod tag for the graceful scale-in business. Nodes are scaled in when the Pod mentioned above is not found on the node or the graceful scale-in time has elapsed.
     */
    public void setGraceDownLabel(TkeLabel [] GraceDownLabel) {
        this.GraceDownLabel = GraceDownLabel;
    }

    /**
     * Get Task protection time. 
     * @return GraceDownProtectTime Task protection time.
     */
    public Long getGraceDownProtectTime() {
        return this.GraceDownProtectTime;
    }

    /**
     * Set Task protection time.
     * @param GraceDownProtectTime Task protection time.
     */
    public void setGraceDownProtectTime(Long GraceDownProtectTime) {
        this.GraceDownProtectTime = GraceDownProtectTime;
    }

    public TimeAutoScaleStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeAutoScaleStrategy(TimeAutoScaleStrategy source) {
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.ScaleAction != null) {
            this.ScaleAction = new Long(source.ScaleAction);
        }
        if (source.ScaleNum != null) {
            this.ScaleNum = new Long(source.ScaleNum);
        }
        if (source.StrategyStatus != null) {
            this.StrategyStatus = new Long(source.StrategyStatus);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.RetryValidTime != null) {
            this.RetryValidTime = new Long(source.RetryValidTime);
        }
        if (source.RepeatStrategy != null) {
            this.RepeatStrategy = new RepeatStrategy(source.RepeatStrategy);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.GraceDownFlag != null) {
            this.GraceDownFlag = new Boolean(source.GraceDownFlag);
        }
        if (source.GraceDownTime != null) {
            this.GraceDownTime = new Long(source.GraceDownTime);
        }
        if (source.GraceDownProtectFlag != null) {
            this.GraceDownProtectFlag = new Boolean(source.GraceDownProtectFlag);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ConfigGroupAssigned != null) {
            this.ConfigGroupAssigned = new String(source.ConfigGroupAssigned);
        }
        if (source.MeasureMethod != null) {
            this.MeasureMethod = new String(source.MeasureMethod);
        }
        if (source.TerminatePolicy != null) {
            this.TerminatePolicy = new String(source.TerminatePolicy);
        }
        if (source.MaxUse != null) {
            this.MaxUse = new Long(source.MaxUse);
        }
        if (source.SoftDeployInfo != null) {
            this.SoftDeployInfo = new Long[source.SoftDeployInfo.length];
            for (int i = 0; i < source.SoftDeployInfo.length; i++) {
                this.SoftDeployInfo[i] = new Long(source.SoftDeployInfo[i]);
            }
        }
        if (source.ServiceNodeInfo != null) {
            this.ServiceNodeInfo = new Long[source.ServiceNodeInfo.length];
            for (int i = 0; i < source.ServiceNodeInfo.length; i++) {
                this.ServiceNodeInfo[i] = new Long(source.ServiceNodeInfo[i]);
            }
        }
        if (source.CompensateFlag != null) {
            this.CompensateFlag = new Long(source.CompensateFlag);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GraceDownLabel != null) {
            this.GraceDownLabel = new TkeLabel[source.GraceDownLabel.length];
            for (int i = 0; i < source.GraceDownLabel.length; i++) {
                this.GraceDownLabel[i] = new TkeLabel(source.GraceDownLabel[i]);
            }
        }
        if (source.GraceDownProtectTime != null) {
            this.GraceDownProtectTime = new Long(source.GraceDownProtectTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "ScaleAction", this.ScaleAction);
        this.setParamSimple(map, prefix + "ScaleNum", this.ScaleNum);
        this.setParamSimple(map, prefix + "StrategyStatus", this.StrategyStatus);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "RetryValidTime", this.RetryValidTime);
        this.setParamObj(map, prefix + "RepeatStrategy.", this.RepeatStrategy);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "GraceDownFlag", this.GraceDownFlag);
        this.setParamSimple(map, prefix + "GraceDownTime", this.GraceDownTime);
        this.setParamSimple(map, prefix + "GraceDownProtectFlag", this.GraceDownProtectFlag);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ConfigGroupAssigned", this.ConfigGroupAssigned);
        this.setParamSimple(map, prefix + "MeasureMethod", this.MeasureMethod);
        this.setParamSimple(map, prefix + "TerminatePolicy", this.TerminatePolicy);
        this.setParamSimple(map, prefix + "MaxUse", this.MaxUse);
        this.setParamArraySimple(map, prefix + "SoftDeployInfo.", this.SoftDeployInfo);
        this.setParamArraySimple(map, prefix + "ServiceNodeInfo.", this.ServiceNodeInfo);
        this.setParamSimple(map, prefix + "CompensateFlag", this.CompensateFlag);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "GraceDownLabel.", this.GraceDownLabel);
        this.setParamSimple(map, prefix + "GraceDownProtectTime", this.GraceDownProtectTime);

    }
}

