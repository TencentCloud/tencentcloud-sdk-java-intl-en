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
    * Cooling time after policy trigger, during which auto scaling cannot be triggered.
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * Scaling action. 1: scale-out, 2: scale-in.
    */
    @SerializedName("ScaleAction")
    @Expose
    private Long ScaleAction;

    /**
    * Scaling amount.
    */
    @SerializedName("ScaleNum")
    @Expose
    private Long ScaleNum;

    /**
    * Rule status. 1: valid; 2: invalid; 3: suspended. This field is required.
    */
    @SerializedName("StrategyStatus")
    @Expose
    private Long StrategyStatus;

    /**
    * Rule priority. The smaller value indicates the higher priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * When multiple rules are triggered at the same time and some are not really executed, retries will be performed within this time range.
    */
    @SerializedName("RetryValidTime")
    @Expose
    private Long RetryValidTime;

    /**
    * Time scaling repetition policy

Note: This field may return null, indicating that no valid values can be obtained.
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
    * Bound tag list

Note: This field may return null, indicating that no valid values can be obtained.
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
    * Calculation method of scale-out resources. Valid values: "DEFAULT","INSTANCE", "CPU" and "MEMORYGB".
"DEFAULT" indicates the default method, which is the same as "INSTANCE".
"INSTANCE" indicates calculation based on nodes (default mode).
"CPU" indicates calculation based on the quantity of cores of the machine.
"MEMORYGB" indicates calculation based on the memory size of the machine.
    */
    @SerializedName("MeasureMethod")
    @Expose
    private String MeasureMethod;

    /**
    * Termination policy. "DEFAULT" denotes the default policy, which indicates that scale-in is triggered by scale-in rules. "TIMING" denotes timed destruction.
    */
    @SerializedName("TerminatePolicy")
    @Expose
    private String TerminatePolicy;

    /**
    * Maximum use time in seconds. The minimum value is 1 hour, and the maximum is 24 hours.
    */
    @SerializedName("MaxUse")
    @Expose
    private Long MaxUse;

    /**
    * Node deployment service list. Fill in only HDFS and YARN. For details, see [Mapping Table for Component Names](https://intl.cloud.tencent.com/document/product/589/98760?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * Startup process list

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * Compensatory scale-out. 0: disable, 1: enable.
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
    * Graceful scale-in business pod tag. Nodes are scaled in when the pod mentioned above is not found on the node or the graceful scale-in time is passed.
    */
    @SerializedName("GraceDownLabel")
    @Expose
    private TkeLabel [] GraceDownLabel;

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
     * Get Cooling time after policy trigger, during which auto scaling cannot be triggered. 
     * @return IntervalTime Cooling time after policy trigger, during which auto scaling cannot be triggered.
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set Cooling time after policy trigger, during which auto scaling cannot be triggered.
     * @param IntervalTime Cooling time after policy trigger, during which auto scaling cannot be triggered.
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get Scaling action. 1: scale-out, 2: scale-in. 
     * @return ScaleAction Scaling action. 1: scale-out, 2: scale-in.
     */
    public Long getScaleAction() {
        return this.ScaleAction;
    }

    /**
     * Set Scaling action. 1: scale-out, 2: scale-in.
     * @param ScaleAction Scaling action. 1: scale-out, 2: scale-in.
     */
    public void setScaleAction(Long ScaleAction) {
        this.ScaleAction = ScaleAction;
    }

    /**
     * Get Scaling amount. 
     * @return ScaleNum Scaling amount.
     */
    public Long getScaleNum() {
        return this.ScaleNum;
    }

    /**
     * Set Scaling amount.
     * @param ScaleNum Scaling amount.
     */
    public void setScaleNum(Long ScaleNum) {
        this.ScaleNum = ScaleNum;
    }

    /**
     * Get Rule status. 1: valid; 2: invalid; 3: suspended. This field is required. 
     * @return StrategyStatus Rule status. 1: valid; 2: invalid; 3: suspended. This field is required.
     */
    public Long getStrategyStatus() {
        return this.StrategyStatus;
    }

    /**
     * Set Rule status. 1: valid; 2: invalid; 3: suspended. This field is required.
     * @param StrategyStatus Rule status. 1: valid; 2: invalid; 3: suspended. This field is required.
     */
    public void setStrategyStatus(Long StrategyStatus) {
        this.StrategyStatus = StrategyStatus;
    }

    /**
     * Get Rule priority. The smaller value indicates the higher priority. 
     * @return Priority Rule priority. The smaller value indicates the higher priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Rule priority. The smaller value indicates the higher priority.
     * @param Priority Rule priority. The smaller value indicates the higher priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get When multiple rules are triggered at the same time and some are not really executed, retries will be performed within this time range. 
     * @return RetryValidTime When multiple rules are triggered at the same time and some are not really executed, retries will be performed within this time range.
     */
    public Long getRetryValidTime() {
        return this.RetryValidTime;
    }

    /**
     * Set When multiple rules are triggered at the same time and some are not really executed, retries will be performed within this time range.
     * @param RetryValidTime When multiple rules are triggered at the same time and some are not really executed, retries will be performed within this time range.
     */
    public void setRetryValidTime(Long RetryValidTime) {
        this.RetryValidTime = RetryValidTime;
    }

    /**
     * Get Time scaling repetition policy

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RepeatStrategy Time scaling repetition policy

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RepeatStrategy getRepeatStrategy() {
        return this.RepeatStrategy;
    }

    /**
     * Set Time scaling repetition policy

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RepeatStrategy Time scaling repetition policy

Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Bound tag list

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Bound tag list

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Bound tag list

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Bound tag list

Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Calculation method of scale-out resources. Valid values: "DEFAULT","INSTANCE", "CPU" and "MEMORYGB".
"DEFAULT" indicates the default method, which is the same as "INSTANCE".
"INSTANCE" indicates calculation based on nodes (default mode).
"CPU" indicates calculation based on the quantity of cores of the machine.
"MEMORYGB" indicates calculation based on the memory size of the machine. 
     * @return MeasureMethod Calculation method of scale-out resources. Valid values: "DEFAULT","INSTANCE", "CPU" and "MEMORYGB".
"DEFAULT" indicates the default method, which is the same as "INSTANCE".
"INSTANCE" indicates calculation based on nodes (default mode).
"CPU" indicates calculation based on the quantity of cores of the machine.
"MEMORYGB" indicates calculation based on the memory size of the machine.
     */
    public String getMeasureMethod() {
        return this.MeasureMethod;
    }

    /**
     * Set Calculation method of scale-out resources. Valid values: "DEFAULT","INSTANCE", "CPU" and "MEMORYGB".
"DEFAULT" indicates the default method, which is the same as "INSTANCE".
"INSTANCE" indicates calculation based on nodes (default mode).
"CPU" indicates calculation based on the quantity of cores of the machine.
"MEMORYGB" indicates calculation based on the memory size of the machine.
     * @param MeasureMethod Calculation method of scale-out resources. Valid values: "DEFAULT","INSTANCE", "CPU" and "MEMORYGB".
"DEFAULT" indicates the default method, which is the same as "INSTANCE".
"INSTANCE" indicates calculation based on nodes (default mode).
"CPU" indicates calculation based on the quantity of cores of the machine.
"MEMORYGB" indicates calculation based on the memory size of the machine.
     */
    public void setMeasureMethod(String MeasureMethod) {
        this.MeasureMethod = MeasureMethod;
    }

    /**
     * Get Termination policy. "DEFAULT" denotes the default policy, which indicates that scale-in is triggered by scale-in rules. "TIMING" denotes timed destruction. 
     * @return TerminatePolicy Termination policy. "DEFAULT" denotes the default policy, which indicates that scale-in is triggered by scale-in rules. "TIMING" denotes timed destruction.
     */
    public String getTerminatePolicy() {
        return this.TerminatePolicy;
    }

    /**
     * Set Termination policy. "DEFAULT" denotes the default policy, which indicates that scale-in is triggered by scale-in rules. "TIMING" denotes timed destruction.
     * @param TerminatePolicy Termination policy. "DEFAULT" denotes the default policy, which indicates that scale-in is triggered by scale-in rules. "TIMING" denotes timed destruction.
     */
    public void setTerminatePolicy(String TerminatePolicy) {
        this.TerminatePolicy = TerminatePolicy;
    }

    /**
     * Get Maximum use time in seconds. The minimum value is 1 hour, and the maximum is 24 hours. 
     * @return MaxUse Maximum use time in seconds. The minimum value is 1 hour, and the maximum is 24 hours.
     */
    public Long getMaxUse() {
        return this.MaxUse;
    }

    /**
     * Set Maximum use time in seconds. The minimum value is 1 hour, and the maximum is 24 hours.
     * @param MaxUse Maximum use time in seconds. The minimum value is 1 hour, and the maximum is 24 hours.
     */
    public void setMaxUse(Long MaxUse) {
        this.MaxUse = MaxUse;
    }

    /**
     * Get Node deployment service list. Fill in only HDFS and YARN. For details, see [Mapping Table for Component Names](https://intl.cloud.tencent.com/document/product/589/98760?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SoftDeployInfo Node deployment service list. Fill in only HDFS and YARN. For details, see [Mapping Table for Component Names](https://intl.cloud.tencent.com/document/product/589/98760?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set Node deployment service list. Fill in only HDFS and YARN. For details, see [Mapping Table for Component Names](https://intl.cloud.tencent.com/document/product/589/98760?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SoftDeployInfo Node deployment service list. Fill in only HDFS and YARN. For details, see [Mapping Table for Component Names](https://intl.cloud.tencent.com/document/product/589/98760?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get Startup process list

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceNodeInfo Startup process list

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set Startup process list

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceNodeInfo Startup process list

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get Compensatory scale-out. 0: disable, 1: enable. 
     * @return CompensateFlag Compensatory scale-out. 0: disable, 1: enable.
     */
    public Long getCompensateFlag() {
        return this.CompensateFlag;
    }

    /**
     * Set Compensatory scale-out. 0: disable, 1: enable.
     * @param CompensateFlag Compensatory scale-out. 0: disable, 1: enable.
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
     * Get Graceful scale-in business pod tag. Nodes are scaled in when the pod mentioned above is not found on the node or the graceful scale-in time is passed. 
     * @return GraceDownLabel Graceful scale-in business pod tag. Nodes are scaled in when the pod mentioned above is not found on the node or the graceful scale-in time is passed.
     */
    public TkeLabel [] getGraceDownLabel() {
        return this.GraceDownLabel;
    }

    /**
     * Set Graceful scale-in business pod tag. Nodes are scaled in when the pod mentioned above is not found on the node or the graceful scale-in time is passed.
     * @param GraceDownLabel Graceful scale-in business pod tag. Nodes are scaled in when the pod mentioned above is not found on the node or the graceful scale-in time is passed.
     */
    public void setGraceDownLabel(TkeLabel [] GraceDownLabel) {
        this.GraceDownLabel = GraceDownLabel;
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

    }
}

