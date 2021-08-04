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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutInstanceRequest extends AbstractModel{

    /**
    * Time unit of scale-out. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
<li>m: month. When `PayMode` is 1, `TimeUnit` can only be `m`.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Duration of scale-out, which needs to be used together with `TimeUnit`.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Client token.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Bootstrap script settings.
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSettings [] PreExecutedFileSettings;

    /**
    * Number of task nodes added.
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * Number of core nodes added.
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * Process not required during scale-out.
    */
    @SerializedName("UnNecessaryNodeList")
    @Expose
    private Long [] UnNecessaryNodeList;

    /**
    * Number of router nodes added.
    */
    @SerializedName("RouterCount")
    @Expose
    private Long RouterCount;

    /**
    * Deployed service.
<li>`SoftDeployInfo` and `ServiceNodeInfo` are in the same group and mutually exclusive with `UnNecessaryNodeList`.</li>
<li>The combination of `SoftDeployInfo` and `ServiceNodeInfo` is recommended.</li>
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * Started process.
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * List of spread placement group IDs. Only one can be specified currently.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * List of tags bound to added nodes.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Resource type selected for scaling. Valid values: `host` (general CVM resource), `pod` (resource provided by TKE or EKS cluster)
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * Specified information such as pod specification and source for expansion with pod resources
    */
    @SerializedName("PodSpec")
    @Expose
    private PodSpec PodSpec;

    /**
    * Machine group name selected for ClickHouse cluster scaling-out
    */
    @SerializedName("ClickHouseClusterName")
    @Expose
    private String ClickHouseClusterName;

    /**
    * Machine group type selected for ClickHouse cluster scaling-out. new: creates a group; old: selects an existing group
    */
    @SerializedName("ClickHouseClusterType")
    @Expose
    private String ClickHouseClusterType;

    /**
    * YARN node label specified for rule-based scaling-out
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * Custom pod permission and parameter
    */
    @SerializedName("PodParameter")
    @Expose
    private PodParameter PodParameter;

    /**
    * Number of master nodes to be added
When a ClickHouse cluster is scaled, this parameter does not take effect.
When a Kafka cluster is scaled, this parameter does not take effect.
When `HardwareResourceType` is `pod`, this parameter does not take effect.
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * Whether to start the service after scaling. `true`: yes; `false`: no
    */
    @SerializedName("StartServiceAfterScaleOut")
    @Expose
    private String StartServiceAfterScaleOut;

    /**
     * Get Time unit of scale-out. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
<li>m: month. When `PayMode` is 1, `TimeUnit` can only be `m`.</li> 
     * @return TimeUnit Time unit of scale-out. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
<li>m: month. When `PayMode` is 1, `TimeUnit` can only be `m`.</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit of scale-out. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
<li>m: month. When `PayMode` is 1, `TimeUnit` can only be `m`.</li>
     * @param TimeUnit Time unit of scale-out. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
<li>m: month. When `PayMode` is 1, `TimeUnit` can only be `m`.</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Duration of scale-out, which needs to be used together with `TimeUnit`. 
     * @return TimeSpan Duration of scale-out, which needs to be used together with `TimeUnit`.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Duration of scale-out, which needs to be used together with `TimeUnit`.
     * @param TimeSpan Duration of scale-out, which needs to be used together with `TimeUnit`.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li> 
     * @return PayMode Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     * @param PayMode Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Client token. 
     * @return ClientToken Client token.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Client token.
     * @param ClientToken Client token.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Bootstrap script settings. 
     * @return PreExecutedFileSettings Bootstrap script settings.
     */
    public PreExecuteFileSettings [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * Set Bootstrap script settings.
     * @param PreExecutedFileSettings Bootstrap script settings.
     */
    public void setPreExecutedFileSettings(PreExecuteFileSettings [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    /**
     * Get Number of task nodes added. 
     * @return TaskCount Number of task nodes added.
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Number of task nodes added.
     * @param TaskCount Number of task nodes added.
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get Number of core nodes added. 
     * @return CoreCount Number of core nodes added.
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set Number of core nodes added.
     * @param CoreCount Number of core nodes added.
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get Process not required during scale-out. 
     * @return UnNecessaryNodeList Process not required during scale-out.
     */
    public Long [] getUnNecessaryNodeList() {
        return this.UnNecessaryNodeList;
    }

    /**
     * Set Process not required during scale-out.
     * @param UnNecessaryNodeList Process not required during scale-out.
     */
    public void setUnNecessaryNodeList(Long [] UnNecessaryNodeList) {
        this.UnNecessaryNodeList = UnNecessaryNodeList;
    }

    /**
     * Get Number of router nodes added. 
     * @return RouterCount Number of router nodes added.
     */
    public Long getRouterCount() {
        return this.RouterCount;
    }

    /**
     * Set Number of router nodes added.
     * @param RouterCount Number of router nodes added.
     */
    public void setRouterCount(Long RouterCount) {
        this.RouterCount = RouterCount;
    }

    /**
     * Get Deployed service.
<li>`SoftDeployInfo` and `ServiceNodeInfo` are in the same group and mutually exclusive with `UnNecessaryNodeList`.</li>
<li>The combination of `SoftDeployInfo` and `ServiceNodeInfo` is recommended.</li> 
     * @return SoftDeployInfo Deployed service.
<li>`SoftDeployInfo` and `ServiceNodeInfo` are in the same group and mutually exclusive with `UnNecessaryNodeList`.</li>
<li>The combination of `SoftDeployInfo` and `ServiceNodeInfo` is recommended.</li>
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set Deployed service.
<li>`SoftDeployInfo` and `ServiceNodeInfo` are in the same group and mutually exclusive with `UnNecessaryNodeList`.</li>
<li>The combination of `SoftDeployInfo` and `ServiceNodeInfo` is recommended.</li>
     * @param SoftDeployInfo Deployed service.
<li>`SoftDeployInfo` and `ServiceNodeInfo` are in the same group and mutually exclusive with `UnNecessaryNodeList`.</li>
<li>The combination of `SoftDeployInfo` and `ServiceNodeInfo` is recommended.</li>
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get Started process. 
     * @return ServiceNodeInfo Started process.
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set Started process.
     * @param ServiceNodeInfo Started process.
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get List of spread placement group IDs. Only one can be specified currently. 
     * @return DisasterRecoverGroupIds List of spread placement group IDs. Only one can be specified currently.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set List of spread placement group IDs. Only one can be specified currently.
     * @param DisasterRecoverGroupIds List of spread placement group IDs. Only one can be specified currently.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get List of tags bound to added nodes. 
     * @return Tags List of tags bound to added nodes.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags bound to added nodes.
     * @param Tags List of tags bound to added nodes.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Resource type selected for scaling. Valid values: `host` (general CVM resource), `pod` (resource provided by TKE or EKS cluster) 
     * @return HardwareResourceType Resource type selected for scaling. Valid values: `host` (general CVM resource), `pod` (resource provided by TKE or EKS cluster)
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set Resource type selected for scaling. Valid values: `host` (general CVM resource), `pod` (resource provided by TKE or EKS cluster)
     * @param HardwareResourceType Resource type selected for scaling. Valid values: `host` (general CVM resource), `pod` (resource provided by TKE or EKS cluster)
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get Specified information such as pod specification and source for expansion with pod resources 
     * @return PodSpec Specified information such as pod specification and source for expansion with pod resources
     */
    public PodSpec getPodSpec() {
        return this.PodSpec;
    }

    /**
     * Set Specified information such as pod specification and source for expansion with pod resources
     * @param PodSpec Specified information such as pod specification and source for expansion with pod resources
     */
    public void setPodSpec(PodSpec PodSpec) {
        this.PodSpec = PodSpec;
    }

    /**
     * Get Machine group name selected for ClickHouse cluster scaling-out 
     * @return ClickHouseClusterName Machine group name selected for ClickHouse cluster scaling-out
     */
    public String getClickHouseClusterName() {
        return this.ClickHouseClusterName;
    }

    /**
     * Set Machine group name selected for ClickHouse cluster scaling-out
     * @param ClickHouseClusterName Machine group name selected for ClickHouse cluster scaling-out
     */
    public void setClickHouseClusterName(String ClickHouseClusterName) {
        this.ClickHouseClusterName = ClickHouseClusterName;
    }

    /**
     * Get Machine group type selected for ClickHouse cluster scaling-out. new: creates a group; old: selects an existing group 
     * @return ClickHouseClusterType Machine group type selected for ClickHouse cluster scaling-out. new: creates a group; old: selects an existing group
     */
    public String getClickHouseClusterType() {
        return this.ClickHouseClusterType;
    }

    /**
     * Set Machine group type selected for ClickHouse cluster scaling-out. new: creates a group; old: selects an existing group
     * @param ClickHouseClusterType Machine group type selected for ClickHouse cluster scaling-out. new: creates a group; old: selects an existing group
     */
    public void setClickHouseClusterType(String ClickHouseClusterType) {
        this.ClickHouseClusterType = ClickHouseClusterType;
    }

    /**
     * Get YARN node label specified for rule-based scaling-out 
     * @return YarnNodeLabel YARN node label specified for rule-based scaling-out
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set YARN node label specified for rule-based scaling-out
     * @param YarnNodeLabel YARN node label specified for rule-based scaling-out
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get Custom pod permission and parameter 
     * @return PodParameter Custom pod permission and parameter
     */
    public PodParameter getPodParameter() {
        return this.PodParameter;
    }

    /**
     * Set Custom pod permission and parameter
     * @param PodParameter Custom pod permission and parameter
     */
    public void setPodParameter(PodParameter PodParameter) {
        this.PodParameter = PodParameter;
    }

    /**
     * Get Number of master nodes to be added
When a ClickHouse cluster is scaled, this parameter does not take effect.
When a Kafka cluster is scaled, this parameter does not take effect.
When `HardwareResourceType` is `pod`, this parameter does not take effect. 
     * @return MasterCount Number of master nodes to be added
When a ClickHouse cluster is scaled, this parameter does not take effect.
When a Kafka cluster is scaled, this parameter does not take effect.
When `HardwareResourceType` is `pod`, this parameter does not take effect.
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set Number of master nodes to be added
When a ClickHouse cluster is scaled, this parameter does not take effect.
When a Kafka cluster is scaled, this parameter does not take effect.
When `HardwareResourceType` is `pod`, this parameter does not take effect.
     * @param MasterCount Number of master nodes to be added
When a ClickHouse cluster is scaled, this parameter does not take effect.
When a Kafka cluster is scaled, this parameter does not take effect.
When `HardwareResourceType` is `pod`, this parameter does not take effect.
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get Whether to start the service after scaling. `true`: yes; `false`: no 
     * @return StartServiceAfterScaleOut Whether to start the service after scaling. `true`: yes; `false`: no
     */
    public String getStartServiceAfterScaleOut() {
        return this.StartServiceAfterScaleOut;
    }

    /**
     * Set Whether to start the service after scaling. `true`: yes; `false`: no
     * @param StartServiceAfterScaleOut Whether to start the service after scaling. `true`: yes; `false`: no
     */
    public void setStartServiceAfterScaleOut(String StartServiceAfterScaleOut) {
        this.StartServiceAfterScaleOut = StartServiceAfterScaleOut;
    }

    public ScaleOutInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutInstanceRequest(ScaleOutInstanceRequest source) {
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.PreExecutedFileSettings != null) {
            this.PreExecutedFileSettings = new PreExecuteFileSettings[source.PreExecutedFileSettings.length];
            for (int i = 0; i < source.PreExecutedFileSettings.length; i++) {
                this.PreExecutedFileSettings[i] = new PreExecuteFileSettings(source.PreExecutedFileSettings[i]);
            }
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.CoreCount != null) {
            this.CoreCount = new Long(source.CoreCount);
        }
        if (source.UnNecessaryNodeList != null) {
            this.UnNecessaryNodeList = new Long[source.UnNecessaryNodeList.length];
            for (int i = 0; i < source.UnNecessaryNodeList.length; i++) {
                this.UnNecessaryNodeList[i] = new Long(source.UnNecessaryNodeList[i]);
            }
        }
        if (source.RouterCount != null) {
            this.RouterCount = new Long(source.RouterCount);
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
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HardwareResourceType != null) {
            this.HardwareResourceType = new String(source.HardwareResourceType);
        }
        if (source.PodSpec != null) {
            this.PodSpec = new PodSpec(source.PodSpec);
        }
        if (source.ClickHouseClusterName != null) {
            this.ClickHouseClusterName = new String(source.ClickHouseClusterName);
        }
        if (source.ClickHouseClusterType != null) {
            this.ClickHouseClusterType = new String(source.ClickHouseClusterType);
        }
        if (source.YarnNodeLabel != null) {
            this.YarnNodeLabel = new String(source.YarnNodeLabel);
        }
        if (source.PodParameter != null) {
            this.PodParameter = new PodParameter(source.PodParameter);
        }
        if (source.MasterCount != null) {
            this.MasterCount = new Long(source.MasterCount);
        }
        if (source.StartServiceAfterScaleOut != null) {
            this.StartServiceAfterScaleOut = new String(source.StartServiceAfterScaleOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArrayObj(map, prefix + "PreExecutedFileSettings.", this.PreExecutedFileSettings);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamArraySimple(map, prefix + "UnNecessaryNodeList.", this.UnNecessaryNodeList);
        this.setParamSimple(map, prefix + "RouterCount", this.RouterCount);
        this.setParamArraySimple(map, prefix + "SoftDeployInfo.", this.SoftDeployInfo);
        this.setParamArraySimple(map, prefix + "ServiceNodeInfo.", this.ServiceNodeInfo);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);
        this.setParamObj(map, prefix + "PodSpec.", this.PodSpec);
        this.setParamSimple(map, prefix + "ClickHouseClusterName", this.ClickHouseClusterName);
        this.setParamSimple(map, prefix + "ClickHouseClusterType", this.ClickHouseClusterType);
        this.setParamSimple(map, prefix + "YarnNodeLabel", this.YarnNodeLabel);
        this.setParamObj(map, prefix + "PodParameter.", this.PodParameter);
        this.setParamSimple(map, prefix + "MasterCount", this.MasterCount);
        this.setParamSimple(map, prefix + "StartServiceAfterScaleOut", this.StartServiceAfterScaleOut);

    }
}

