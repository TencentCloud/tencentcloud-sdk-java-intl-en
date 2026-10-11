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

public class ScaleOutInstanceRequest extends AbstractModel {

    /**
    * <p>Time unit for the scale-out. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>Scale-out duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>Bootstrap script settings.</p>
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSettings [] PreExecutedFileSettings;

    /**
    * <p>Number of Task nodes to be scaled out.</p>
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * <p>Number of scale-out Core nodes.</p>
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * <p>Processes, which are not required during the scale-out.</p>
    */
    @SerializedName("UnNecessaryNodeList")
    @Expose
    private Long [] UnNecessaryNodeList;

    /**
    * <p>Number of Router nodes to be scaled out.</p>
    */
    @SerializedName("RouterCount")
    @Expose
    private Long RouterCount;

    /**
    * <p>Deployed service.</p><li>SoftDeployInfo and ServiceNodeInfo are parameters in the same group and are mutually exclusive with UnNecessaryNodeList.</li><li>It is recommended to use SoftDeployInfo and ServiceNodeInfo together.</li>
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * <p>Started process.</p>
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * <p>List of dispersed placement group IDs. Currently, only one ID is supported.</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>List of tags bound to nodes for the scale-out.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Resource type selected for the scale-out. Valid values: &quot;HOST&quot;, &quot;POD&quot;, and &quot;MNode&quot;. HOST indicates ordinary CVM resources, POD indicates resources provided by a TKE cluster or an EKS cluster, and MNode indicates fully managed resources.</p>
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * <p>Pod specifications and source information, which are specified when Pod resources are used for the scale-out.</p>
    */
    @SerializedName("PodSpec")
    @Expose
    private PodSpec PodSpec;

    /**
    * <p>Machine group name selected for the ClickHouse cluster scale-out.</p>
    */
    @SerializedName("ClickHouseClusterName")
    @Expose
    private String ClickHouseClusterName;

    /**
    * <p>Machine group type selected for the ClickHouse cluster scale-out. Valid values: new (adds a group) and old (selects an existing group).</p>
    */
    @SerializedName("ClickHouseClusterType")
    @Expose
    private String ClickHouseClusterType;

    /**
    * <p>YARN node label specified for the rule-based scale-out.</p>
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * <p>Pod custom permission and parameter.</p>
    */
    @SerializedName("PodParameter")
    @Expose
    private PodParameter PodParameter;

    /**
    * <p>Number of Master nodes for the scale-out.<br>When a ClickHouse cluster is used for the scale-out, this parameter does not take effect.<br>When a Kafka cluster is used for the scale-out, this parameter does not take effect.<br>When HardwareResourceType is set to POD, this parameter does not take effect.</p>
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * <p>Whether the service is started after the scale-out. Valid values: true (yes) and false (no).</p>
    */
    @SerializedName("StartServiceAfterScaleOut")
    @Expose
    private String StartServiceAfterScaleOut;

    /**
    * <p>AZ. The primary AZ of the cluster is selected by default.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>Subnet. The subnet used during cluster creation is selected by default.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Preset configuration group.</p>
    */
    @SerializedName("ScaleOutServiceConfAssign")
    @Expose
    private String ScaleOutServiceConfAssign;

    /**
    * <p>Auto-renewal. Valid values: 0 (disabled) and 1 (enabled).</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>Type. Valid values: ComputeResource and EMR. Default value: EMR. If this parameter is set to EMR, InstanceId takes effect. If this parameter is set to ComputeResource, ComputeResourceId is used.</p>
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * <p>Computing resource ID.</p>
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
    * <p>Advanced settings of computing resources.</p>
    */
    @SerializedName("ComputeResourceAdvanceParams")
    @Expose
    private ComputeResourceAdvanceParams ComputeResourceAdvanceParams;

    /**
    * <p>Node tag information, which is currently only provided for the Terraform platform.</p>
    */
    @SerializedName("NodeMarks")
    @Expose
    private NodeMark NodeMarks;

    /**
    * <p>Compute group specified for the scale-out.</p>
    */
    @SerializedName("WarehouseName")
    @Expose
    private String WarehouseName;

    /**
    * <p>Partition of a partition placement group.</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
     * Get <p>Time unit for the scale-out. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li> 
     * @return TimeUnit <p>Time unit for the scale-out. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>Time unit for the scale-out. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     * @param TimeUnit <p>Time unit for the scale-out. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>Scale-out duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li> 
     * @return TimeSpan <p>Scale-out duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>Scale-out duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
     * @param TimeSpan <p>Scale-out duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li> 
     * @return PayMode <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
     * @param PayMode <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p> 
     * @return ClientToken <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p>
     * @param ClientToken <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>Bootstrap script settings.</p> 
     * @return PreExecutedFileSettings <p>Bootstrap script settings.</p>
     */
    public PreExecuteFileSettings [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * Set <p>Bootstrap script settings.</p>
     * @param PreExecutedFileSettings <p>Bootstrap script settings.</p>
     */
    public void setPreExecutedFileSettings(PreExecuteFileSettings [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    /**
     * Get <p>Number of Task nodes to be scaled out.</p> 
     * @return TaskCount <p>Number of Task nodes to be scaled out.</p>
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set <p>Number of Task nodes to be scaled out.</p>
     * @param TaskCount <p>Number of Task nodes to be scaled out.</p>
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get <p>Number of scale-out Core nodes.</p> 
     * @return CoreCount <p>Number of scale-out Core nodes.</p>
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set <p>Number of scale-out Core nodes.</p>
     * @param CoreCount <p>Number of scale-out Core nodes.</p>
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get <p>Processes, which are not required during the scale-out.</p> 
     * @return UnNecessaryNodeList <p>Processes, which are not required during the scale-out.</p>
     */
    public Long [] getUnNecessaryNodeList() {
        return this.UnNecessaryNodeList;
    }

    /**
     * Set <p>Processes, which are not required during the scale-out.</p>
     * @param UnNecessaryNodeList <p>Processes, which are not required during the scale-out.</p>
     */
    public void setUnNecessaryNodeList(Long [] UnNecessaryNodeList) {
        this.UnNecessaryNodeList = UnNecessaryNodeList;
    }

    /**
     * Get <p>Number of Router nodes to be scaled out.</p> 
     * @return RouterCount <p>Number of Router nodes to be scaled out.</p>
     */
    public Long getRouterCount() {
        return this.RouterCount;
    }

    /**
     * Set <p>Number of Router nodes to be scaled out.</p>
     * @param RouterCount <p>Number of Router nodes to be scaled out.</p>
     */
    public void setRouterCount(Long RouterCount) {
        this.RouterCount = RouterCount;
    }

    /**
     * Get <p>Deployed service.</p><li>SoftDeployInfo and ServiceNodeInfo are parameters in the same group and are mutually exclusive with UnNecessaryNodeList.</li><li>It is recommended to use SoftDeployInfo and ServiceNodeInfo together.</li> 
     * @return SoftDeployInfo <p>Deployed service.</p><li>SoftDeployInfo and ServiceNodeInfo are parameters in the same group and are mutually exclusive with UnNecessaryNodeList.</li><li>It is recommended to use SoftDeployInfo and ServiceNodeInfo together.</li>
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set <p>Deployed service.</p><li>SoftDeployInfo and ServiceNodeInfo are parameters in the same group and are mutually exclusive with UnNecessaryNodeList.</li><li>It is recommended to use SoftDeployInfo and ServiceNodeInfo together.</li>
     * @param SoftDeployInfo <p>Deployed service.</p><li>SoftDeployInfo and ServiceNodeInfo are parameters in the same group and are mutually exclusive with UnNecessaryNodeList.</li><li>It is recommended to use SoftDeployInfo and ServiceNodeInfo together.</li>
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get <p>Started process.</p> 
     * @return ServiceNodeInfo <p>Started process.</p>
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set <p>Started process.</p>
     * @param ServiceNodeInfo <p>Started process.</p>
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get <p>List of dispersed placement group IDs. Currently, only one ID is supported.</p> 
     * @return DisasterRecoverGroupIds <p>List of dispersed placement group IDs. Currently, only one ID is supported.</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>List of dispersed placement group IDs. Currently, only one ID is supported.</p>
     * @param DisasterRecoverGroupIds <p>List of dispersed placement group IDs. Currently, only one ID is supported.</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>List of tags bound to nodes for the scale-out.</p> 
     * @return Tags <p>List of tags bound to nodes for the scale-out.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>List of tags bound to nodes for the scale-out.</p>
     * @param Tags <p>List of tags bound to nodes for the scale-out.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Resource type selected for the scale-out. Valid values: &quot;HOST&quot;, &quot;POD&quot;, and &quot;MNode&quot;. HOST indicates ordinary CVM resources, POD indicates resources provided by a TKE cluster or an EKS cluster, and MNode indicates fully managed resources.</p> 
     * @return HardwareResourceType <p>Resource type selected for the scale-out. Valid values: &quot;HOST&quot;, &quot;POD&quot;, and &quot;MNode&quot;. HOST indicates ordinary CVM resources, POD indicates resources provided by a TKE cluster or an EKS cluster, and MNode indicates fully managed resources.</p>
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set <p>Resource type selected for the scale-out. Valid values: &quot;HOST&quot;, &quot;POD&quot;, and &quot;MNode&quot;. HOST indicates ordinary CVM resources, POD indicates resources provided by a TKE cluster or an EKS cluster, and MNode indicates fully managed resources.</p>
     * @param HardwareResourceType <p>Resource type selected for the scale-out. Valid values: &quot;HOST&quot;, &quot;POD&quot;, and &quot;MNode&quot;. HOST indicates ordinary CVM resources, POD indicates resources provided by a TKE cluster or an EKS cluster, and MNode indicates fully managed resources.</p>
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get <p>Pod specifications and source information, which are specified when Pod resources are used for the scale-out.</p> 
     * @return PodSpec <p>Pod specifications and source information, which are specified when Pod resources are used for the scale-out.</p>
     */
    public PodSpec getPodSpec() {
        return this.PodSpec;
    }

    /**
     * Set <p>Pod specifications and source information, which are specified when Pod resources are used for the scale-out.</p>
     * @param PodSpec <p>Pod specifications and source information, which are specified when Pod resources are used for the scale-out.</p>
     */
    public void setPodSpec(PodSpec PodSpec) {
        this.PodSpec = PodSpec;
    }

    /**
     * Get <p>Machine group name selected for the ClickHouse cluster scale-out.</p> 
     * @return ClickHouseClusterName <p>Machine group name selected for the ClickHouse cluster scale-out.</p>
     */
    public String getClickHouseClusterName() {
        return this.ClickHouseClusterName;
    }

    /**
     * Set <p>Machine group name selected for the ClickHouse cluster scale-out.</p>
     * @param ClickHouseClusterName <p>Machine group name selected for the ClickHouse cluster scale-out.</p>
     */
    public void setClickHouseClusterName(String ClickHouseClusterName) {
        this.ClickHouseClusterName = ClickHouseClusterName;
    }

    /**
     * Get <p>Machine group type selected for the ClickHouse cluster scale-out. Valid values: new (adds a group) and old (selects an existing group).</p> 
     * @return ClickHouseClusterType <p>Machine group type selected for the ClickHouse cluster scale-out. Valid values: new (adds a group) and old (selects an existing group).</p>
     */
    public String getClickHouseClusterType() {
        return this.ClickHouseClusterType;
    }

    /**
     * Set <p>Machine group type selected for the ClickHouse cluster scale-out. Valid values: new (adds a group) and old (selects an existing group).</p>
     * @param ClickHouseClusterType <p>Machine group type selected for the ClickHouse cluster scale-out. Valid values: new (adds a group) and old (selects an existing group).</p>
     */
    public void setClickHouseClusterType(String ClickHouseClusterType) {
        this.ClickHouseClusterType = ClickHouseClusterType;
    }

    /**
     * Get <p>YARN node label specified for the rule-based scale-out.</p> 
     * @return YarnNodeLabel <p>YARN node label specified for the rule-based scale-out.</p>
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set <p>YARN node label specified for the rule-based scale-out.</p>
     * @param YarnNodeLabel <p>YARN node label specified for the rule-based scale-out.</p>
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get <p>Pod custom permission and parameter.</p> 
     * @return PodParameter <p>Pod custom permission and parameter.</p>
     */
    public PodParameter getPodParameter() {
        return this.PodParameter;
    }

    /**
     * Set <p>Pod custom permission and parameter.</p>
     * @param PodParameter <p>Pod custom permission and parameter.</p>
     */
    public void setPodParameter(PodParameter PodParameter) {
        this.PodParameter = PodParameter;
    }

    /**
     * Get <p>Number of Master nodes for the scale-out.<br>When a ClickHouse cluster is used for the scale-out, this parameter does not take effect.<br>When a Kafka cluster is used for the scale-out, this parameter does not take effect.<br>When HardwareResourceType is set to POD, this parameter does not take effect.</p> 
     * @return MasterCount <p>Number of Master nodes for the scale-out.<br>When a ClickHouse cluster is used for the scale-out, this parameter does not take effect.<br>When a Kafka cluster is used for the scale-out, this parameter does not take effect.<br>When HardwareResourceType is set to POD, this parameter does not take effect.</p>
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set <p>Number of Master nodes for the scale-out.<br>When a ClickHouse cluster is used for the scale-out, this parameter does not take effect.<br>When a Kafka cluster is used for the scale-out, this parameter does not take effect.<br>When HardwareResourceType is set to POD, this parameter does not take effect.</p>
     * @param MasterCount <p>Number of Master nodes for the scale-out.<br>When a ClickHouse cluster is used for the scale-out, this parameter does not take effect.<br>When a Kafka cluster is used for the scale-out, this parameter does not take effect.<br>When HardwareResourceType is set to POD, this parameter does not take effect.</p>
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get <p>Whether the service is started after the scale-out. Valid values: true (yes) and false (no).</p> 
     * @return StartServiceAfterScaleOut <p>Whether the service is started after the scale-out. Valid values: true (yes) and false (no).</p>
     */
    public String getStartServiceAfterScaleOut() {
        return this.StartServiceAfterScaleOut;
    }

    /**
     * Set <p>Whether the service is started after the scale-out. Valid values: true (yes) and false (no).</p>
     * @param StartServiceAfterScaleOut <p>Whether the service is started after the scale-out. Valid values: true (yes) and false (no).</p>
     */
    public void setStartServiceAfterScaleOut(String StartServiceAfterScaleOut) {
        this.StartServiceAfterScaleOut = StartServiceAfterScaleOut;
    }

    /**
     * Get <p>AZ. The primary AZ of the cluster is selected by default.</p> 
     * @return ZoneId <p>AZ. The primary AZ of the cluster is selected by default.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>AZ. The primary AZ of the cluster is selected by default.</p>
     * @param ZoneId <p>AZ. The primary AZ of the cluster is selected by default.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Subnet. The subnet used during cluster creation is selected by default.</p> 
     * @return SubnetId <p>Subnet. The subnet used during cluster creation is selected by default.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet. The subnet used during cluster creation is selected by default.</p>
     * @param SubnetId <p>Subnet. The subnet used during cluster creation is selected by default.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Preset configuration group.</p> 
     * @return ScaleOutServiceConfAssign <p>Preset configuration group.</p>
     */
    public String getScaleOutServiceConfAssign() {
        return this.ScaleOutServiceConfAssign;
    }

    /**
     * Set <p>Preset configuration group.</p>
     * @param ScaleOutServiceConfAssign <p>Preset configuration group.</p>
     */
    public void setScaleOutServiceConfAssign(String ScaleOutServiceConfAssign) {
        this.ScaleOutServiceConfAssign = ScaleOutServiceConfAssign;
    }

    /**
     * Get <p>Auto-renewal. Valid values: 0 (disabled) and 1 (enabled).</p> 
     * @return AutoRenew <p>Auto-renewal. Valid values: 0 (disabled) and 1 (enabled).</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>Auto-renewal. Valid values: 0 (disabled) and 1 (enabled).</p>
     * @param AutoRenew <p>Auto-renewal. Valid values: 0 (disabled) and 1 (enabled).</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>Type. Valid values: ComputeResource and EMR. Default value: EMR. If this parameter is set to EMR, InstanceId takes effect. If this parameter is set to ComputeResource, ComputeResourceId is used.</p> 
     * @return ResourceBaseType <p>Type. Valid values: ComputeResource and EMR. Default value: EMR. If this parameter is set to EMR, InstanceId takes effect. If this parameter is set to ComputeResource, ComputeResourceId is used.</p>
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set <p>Type. Valid values: ComputeResource and EMR. Default value: EMR. If this parameter is set to EMR, InstanceId takes effect. If this parameter is set to ComputeResource, ComputeResourceId is used.</p>
     * @param ResourceBaseType <p>Type. Valid values: ComputeResource and EMR. Default value: EMR. If this parameter is set to EMR, InstanceId takes effect. If this parameter is set to ComputeResource, ComputeResourceId is used.</p>
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get <p>Computing resource ID.</p> 
     * @return ComputeResourceId <p>Computing resource ID.</p>
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set <p>Computing resource ID.</p>
     * @param ComputeResourceId <p>Computing resource ID.</p>
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
    }

    /**
     * Get <p>Advanced settings of computing resources.</p> 
     * @return ComputeResourceAdvanceParams <p>Advanced settings of computing resources.</p>
     */
    public ComputeResourceAdvanceParams getComputeResourceAdvanceParams() {
        return this.ComputeResourceAdvanceParams;
    }

    /**
     * Set <p>Advanced settings of computing resources.</p>
     * @param ComputeResourceAdvanceParams <p>Advanced settings of computing resources.</p>
     */
    public void setComputeResourceAdvanceParams(ComputeResourceAdvanceParams ComputeResourceAdvanceParams) {
        this.ComputeResourceAdvanceParams = ComputeResourceAdvanceParams;
    }

    /**
     * Get <p>Node tag information, which is currently only provided for the Terraform platform.</p> 
     * @return NodeMarks <p>Node tag information, which is currently only provided for the Terraform platform.</p>
     */
    public NodeMark getNodeMarks() {
        return this.NodeMarks;
    }

    /**
     * Set <p>Node tag information, which is currently only provided for the Terraform platform.</p>
     * @param NodeMarks <p>Node tag information, which is currently only provided for the Terraform platform.</p>
     */
    public void setNodeMarks(NodeMark NodeMarks) {
        this.NodeMarks = NodeMarks;
    }

    /**
     * Get <p>Compute group specified for the scale-out.</p> 
     * @return WarehouseName <p>Compute group specified for the scale-out.</p>
     */
    public String getWarehouseName() {
        return this.WarehouseName;
    }

    /**
     * Set <p>Compute group specified for the scale-out.</p>
     * @param WarehouseName <p>Compute group specified for the scale-out.</p>
     */
    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    /**
     * Get <p>Partition of a partition placement group.</p> 
     * @return PartitionNumber <p>Partition of a partition placement group.</p>
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <p>Partition of a partition placement group.</p>
     * @param PartitionNumber <p>Partition of a partition placement group.</p>
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
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
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ScaleOutServiceConfAssign != null) {
            this.ScaleOutServiceConfAssign = new String(source.ScaleOutServiceConfAssign);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.ResourceBaseType != null) {
            this.ResourceBaseType = new String(source.ResourceBaseType);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
        if (source.ComputeResourceAdvanceParams != null) {
            this.ComputeResourceAdvanceParams = new ComputeResourceAdvanceParams(source.ComputeResourceAdvanceParams);
        }
        if (source.NodeMarks != null) {
            this.NodeMarks = new NodeMark(source.NodeMarks);
        }
        if (source.WarehouseName != null) {
            this.WarehouseName = new String(source.WarehouseName);
        }
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ScaleOutServiceConfAssign", this.ScaleOutServiceConfAssign);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);
        this.setParamObj(map, prefix + "ComputeResourceAdvanceParams.", this.ComputeResourceAdvanceParams);
        this.setParamObj(map, prefix + "NodeMarks.", this.NodeMarks);
        this.setParamSimple(map, prefix + "WarehouseName", this.WarehouseName);
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);

    }
}

