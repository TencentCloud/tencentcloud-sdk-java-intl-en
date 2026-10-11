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

public class LoadAutoScaleStrategy extends AbstractModel {

    /**
    * Rule ID.
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Rule name.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Cooldown time for a rule to take effect.
    */
    @SerializedName("CalmDownTime")
    @Expose
    private Long CalmDownTime;

    /**
    * Scaling action. Valid values: 1 (scale-out) and 2 (scale-in).
    */
    @SerializedName("ScaleAction")
    @Expose
    private Long ScaleAction;

    /**
    * Number of scaling items each time the rule takes effect.
    */
    @SerializedName("ScaleNum")
    @Expose
    private Long ScaleNum;

    /**
    * Metric processing method. Valid values: 1 (MAX), 2 (MIN), and 3 (AVG).
    */
    @SerializedName("ProcessMethod")
    @Expose
    private Long ProcessMethod;

    /**
    * Rule priority, which is invalid during addition. By default, the auto-increment rule is used.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Rule status. Valid values: 1 (enabled) and 3 (disabled).
    */
    @SerializedName("StrategyStatus")
    @Expose
    private Long StrategyStatus;

    /**
    * YARN node label specified for the rule-based scale-out.
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * Effective time of the rule.
    */
    @SerializedName("PeriodValid")
    @Expose
    private String PeriodValid;

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
    * List of node deployment services, for example, ["HDFS-3.1.2","YARN-3.1.2"].
    */
    @SerializedName("SoftDeployDesc")
    @Expose
    private String [] SoftDeployDesc;

    /**
    * Startup process list, for example, ["NodeManager"].
    */
    @SerializedName("ServiceNodeDesc")
    @Expose
    private String ServiceNodeDesc;

    /**
    * Startup process list.
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * List of services deployed on the node. Valid values: HDFS and YARN. For details, see [Mapping Table for Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * Multi-metric triggering condition.
    */
    @SerializedName("LoadMetricsConditions")
    @Expose
    private LoadMetricsConditions LoadMetricsConditions;

    /**
    * Scaling group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Soft. Example value: yarn.
    */
    @SerializedName("Soft")
    @Expose
    private String Soft;

    /**
    * Task protection time.
    */
    @SerializedName("GraceDownProtectTime")
    @Expose
    private Long GraceDownProtectTime;

    /**
     * Get Rule ID. 
     * @return StrategyId Rule ID.
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Rule ID.
     * @param StrategyId Rule ID.
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Rule name. 
     * @return StrategyName Rule name.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Rule name.
     * @param StrategyName Rule name.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Cooldown time for a rule to take effect. 
     * @return CalmDownTime Cooldown time for a rule to take effect.
     */
    public Long getCalmDownTime() {
        return this.CalmDownTime;
    }

    /**
     * Set Cooldown time for a rule to take effect.
     * @param CalmDownTime Cooldown time for a rule to take effect.
     */
    public void setCalmDownTime(Long CalmDownTime) {
        this.CalmDownTime = CalmDownTime;
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
     * Get Number of scaling items each time the rule takes effect. 
     * @return ScaleNum Number of scaling items each time the rule takes effect.
     */
    public Long getScaleNum() {
        return this.ScaleNum;
    }

    /**
     * Set Number of scaling items each time the rule takes effect.
     * @param ScaleNum Number of scaling items each time the rule takes effect.
     */
    public void setScaleNum(Long ScaleNum) {
        this.ScaleNum = ScaleNum;
    }

    /**
     * Get Metric processing method. Valid values: 1 (MAX), 2 (MIN), and 3 (AVG). 
     * @return ProcessMethod Metric processing method. Valid values: 1 (MAX), 2 (MIN), and 3 (AVG).
     */
    public Long getProcessMethod() {
        return this.ProcessMethod;
    }

    /**
     * Set Metric processing method. Valid values: 1 (MAX), 2 (MIN), and 3 (AVG).
     * @param ProcessMethod Metric processing method. Valid values: 1 (MAX), 2 (MIN), and 3 (AVG).
     */
    public void setProcessMethod(Long ProcessMethod) {
        this.ProcessMethod = ProcessMethod;
    }

    /**
     * Get Rule priority, which is invalid during addition. By default, the auto-increment rule is used. 
     * @return Priority Rule priority, which is invalid during addition. By default, the auto-increment rule is used.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Rule priority, which is invalid during addition. By default, the auto-increment rule is used.
     * @param Priority Rule priority, which is invalid during addition. By default, the auto-increment rule is used.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Rule status. Valid values: 1 (enabled) and 3 (disabled). 
     * @return StrategyStatus Rule status. Valid values: 1 (enabled) and 3 (disabled).
     */
    public Long getStrategyStatus() {
        return this.StrategyStatus;
    }

    /**
     * Set Rule status. Valid values: 1 (enabled) and 3 (disabled).
     * @param StrategyStatus Rule status. Valid values: 1 (enabled) and 3 (disabled).
     */
    public void setStrategyStatus(Long StrategyStatus) {
        this.StrategyStatus = StrategyStatus;
    }

    /**
     * Get YARN node label specified for the rule-based scale-out. 
     * @return YarnNodeLabel YARN node label specified for the rule-based scale-out.
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set YARN node label specified for the rule-based scale-out.
     * @param YarnNodeLabel YARN node label specified for the rule-based scale-out.
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get Effective time of the rule. 
     * @return PeriodValid Effective time of the rule.
     */
    public String getPeriodValid() {
        return this.PeriodValid;
    }

    /**
     * Set Effective time of the rule.
     * @param PeriodValid Effective time of the rule.
     */
    public void setPeriodValid(String PeriodValid) {
        this.PeriodValid = PeriodValid;
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
     * Get List of node deployment services, for example, ["HDFS-3.1.2","YARN-3.1.2"]. 
     * @return SoftDeployDesc List of node deployment services, for example, ["HDFS-3.1.2","YARN-3.1.2"].
     */
    public String [] getSoftDeployDesc() {
        return this.SoftDeployDesc;
    }

    /**
     * Set List of node deployment services, for example, ["HDFS-3.1.2","YARN-3.1.2"].
     * @param SoftDeployDesc List of node deployment services, for example, ["HDFS-3.1.2","YARN-3.1.2"].
     */
    public void setSoftDeployDesc(String [] SoftDeployDesc) {
        this.SoftDeployDesc = SoftDeployDesc;
    }

    /**
     * Get Startup process list, for example, ["NodeManager"]. 
     * @return ServiceNodeDesc Startup process list, for example, ["NodeManager"].
     */
    public String getServiceNodeDesc() {
        return this.ServiceNodeDesc;
    }

    /**
     * Set Startup process list, for example, ["NodeManager"].
     * @param ServiceNodeDesc Startup process list, for example, ["NodeManager"].
     */
    public void setServiceNodeDesc(String ServiceNodeDesc) {
        this.ServiceNodeDesc = ServiceNodeDesc;
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
     * Get Multi-metric triggering condition. 
     * @return LoadMetricsConditions Multi-metric triggering condition.
     */
    public LoadMetricsConditions getLoadMetricsConditions() {
        return this.LoadMetricsConditions;
    }

    /**
     * Set Multi-metric triggering condition.
     * @param LoadMetricsConditions Multi-metric triggering condition.
     */
    public void setLoadMetricsConditions(LoadMetricsConditions LoadMetricsConditions) {
        this.LoadMetricsConditions = LoadMetricsConditions;
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
     * Get Soft. Example value: yarn. 
     * @return Soft Soft. Example value: yarn.
     */
    public String getSoft() {
        return this.Soft;
    }

    /**
     * Set Soft. Example value: yarn.
     * @param Soft Soft. Example value: yarn.
     */
    public void setSoft(String Soft) {
        this.Soft = Soft;
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

    public LoadAutoScaleStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadAutoScaleStrategy(LoadAutoScaleStrategy source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.CalmDownTime != null) {
            this.CalmDownTime = new Long(source.CalmDownTime);
        }
        if (source.ScaleAction != null) {
            this.ScaleAction = new Long(source.ScaleAction);
        }
        if (source.ScaleNum != null) {
            this.ScaleNum = new Long(source.ScaleNum);
        }
        if (source.ProcessMethod != null) {
            this.ProcessMethod = new Long(source.ProcessMethod);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.StrategyStatus != null) {
            this.StrategyStatus = new Long(source.StrategyStatus);
        }
        if (source.YarnNodeLabel != null) {
            this.YarnNodeLabel = new String(source.YarnNodeLabel);
        }
        if (source.PeriodValid != null) {
            this.PeriodValid = new String(source.PeriodValid);
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
        if (source.SoftDeployDesc != null) {
            this.SoftDeployDesc = new String[source.SoftDeployDesc.length];
            for (int i = 0; i < source.SoftDeployDesc.length; i++) {
                this.SoftDeployDesc[i] = new String(source.SoftDeployDesc[i]);
            }
        }
        if (source.ServiceNodeDesc != null) {
            this.ServiceNodeDesc = new String(source.ServiceNodeDesc);
        }
        if (source.ServiceNodeInfo != null) {
            this.ServiceNodeInfo = new Long[source.ServiceNodeInfo.length];
            for (int i = 0; i < source.ServiceNodeInfo.length; i++) {
                this.ServiceNodeInfo[i] = new Long(source.ServiceNodeInfo[i]);
            }
        }
        if (source.SoftDeployInfo != null) {
            this.SoftDeployInfo = new Long[source.SoftDeployInfo.length];
            for (int i = 0; i < source.SoftDeployInfo.length; i++) {
                this.SoftDeployInfo[i] = new Long(source.SoftDeployInfo[i]);
            }
        }
        if (source.LoadMetricsConditions != null) {
            this.LoadMetricsConditions = new LoadMetricsConditions(source.LoadMetricsConditions);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Soft != null) {
            this.Soft = new String(source.Soft);
        }
        if (source.GraceDownProtectTime != null) {
            this.GraceDownProtectTime = new Long(source.GraceDownProtectTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "CalmDownTime", this.CalmDownTime);
        this.setParamSimple(map, prefix + "ScaleAction", this.ScaleAction);
        this.setParamSimple(map, prefix + "ScaleNum", this.ScaleNum);
        this.setParamSimple(map, prefix + "ProcessMethod", this.ProcessMethod);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "StrategyStatus", this.StrategyStatus);
        this.setParamSimple(map, prefix + "YarnNodeLabel", this.YarnNodeLabel);
        this.setParamSimple(map, prefix + "PeriodValid", this.PeriodValid);
        this.setParamSimple(map, prefix + "GraceDownFlag", this.GraceDownFlag);
        this.setParamSimple(map, prefix + "GraceDownTime", this.GraceDownTime);
        this.setParamSimple(map, prefix + "GraceDownProtectFlag", this.GraceDownProtectFlag);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ConfigGroupAssigned", this.ConfigGroupAssigned);
        this.setParamSimple(map, prefix + "MeasureMethod", this.MeasureMethod);
        this.setParamArraySimple(map, prefix + "SoftDeployDesc.", this.SoftDeployDesc);
        this.setParamSimple(map, prefix + "ServiceNodeDesc", this.ServiceNodeDesc);
        this.setParamArraySimple(map, prefix + "ServiceNodeInfo.", this.ServiceNodeInfo);
        this.setParamArraySimple(map, prefix + "SoftDeployInfo.", this.SoftDeployInfo);
        this.setParamObj(map, prefix + "LoadMetricsConditions.", this.LoadMetricsConditions);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Soft", this.Soft);
        this.setParamSimple(map, prefix + "GraceDownProtectTime", this.GraceDownProtectTime);

    }
}

