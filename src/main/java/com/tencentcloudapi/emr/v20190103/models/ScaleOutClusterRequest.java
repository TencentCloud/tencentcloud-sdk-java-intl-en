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

public class ScaleOutClusterRequest extends AbstractModel {

    /**
    * <p>Node billing mode. Valid values:</p><li>PREPAID: prepaid, that is, yearly/monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly basis</li><li>SPOTPAID: spot billing (for Task nodes only)</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Type and number of nodes for the scale-out.</p>
    */
    @SerializedName("ScaleOutNodeConfig")
    @Expose
    private ScaleOutNodeConfig ScaleOutNodeConfig;

    /**
    * <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>Parameter settings related to yearly/monthly subscription. This parameter can be used to specify the purchase duration of a yearly/monthly subscription instance, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode of the specified instance is prepaid.</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
    */
    @SerializedName("ScriptBootstrapActionConfig")
    @Expose
    private ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig;

    /**
    * <p>To scale out deployment services, new nodes will inherit the services deployed on the current node type by default. The deployment service includes default optional services. This parameter is supported only when optional services are used. For example, if existing task nodes have HDFS, YARN, and impala deployed, when using the API to scale out Task nodes without deploying impala, fill in only HDFS and YARN for the deployment service. For details, see <a href="https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1">Component Name Mapping Table</a>.</p>
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * <p>Deployment processes. By default, all processes of the scaled‑out service are deployed. Deployment processes can be modified. For example, if the deployed services for the current task node are HDFS, YARN, and impala, the default deployment services are DataNode, NodeManager, and ImpalaServer. If you need to modify deployment process information, the deployment processes can be DataNode, NodeManager, and ImpalaServerCoordinator or DataNode, NodeManager, and ImpalaServerExecutor. For details, see <a href="https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1">Process Name Mapping Table</a>.</p>
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the DisasterRecoverGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a>.</p>
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
    @SerializedName("HardwareSourceType")
    @Expose
    private String HardwareSourceType;

    /**
    * <p>Pod-related resource information.</p>
    */
    @SerializedName("PodSpecInfo")
    @Expose
    private PodSpecInfo PodSpecInfo;

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
    * <p>YARN node label specified for the scale-out.</p>
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * <p>Whether to start the service after a scale-out. Default value: false. Valid values:</p><li>true: yes</li><li>false: no</li>
    */
    @SerializedName("EnableStartServiceFlag")
    @Expose
    private Boolean EnableStartServiceFlag;

    /**
    * <p>Specification settings.</p>
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NodeResourceSpec ResourceSpec;

    /**
    * <p>AZ to which the instance belongs, for example, ap-guangzhou-1. This parameter can be obtained from the Zone field in the response of <a href="https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1">DescribeZones</a>.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Subnet. The subnet used during cluster creation is selected by default.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Configuration group specified for the scale-out.</p>
    */
    @SerializedName("ScaleOutServiceConfGroupsInfo")
    @Expose
    private ScaleOutServiceConfGroupsInfo [] ScaleOutServiceConfGroupsInfo;

    /**
    * <p>Node flag information, which is currently only provided for the Terraform platform.</p>
    */
    @SerializedName("NodeMarks")
    @Expose
    private NodeMark NodeMarks;

    /**
    * <p>Name of the compute group specified for the scale-out.</p>
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
     * Get <p>Node billing mode. Valid values:</p><li>PREPAID: prepaid, that is, yearly/monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly basis</li><li>SPOTPAID: spot billing (for Task nodes only)</li> 
     * @return InstanceChargeType <p>Node billing mode. Valid values:</p><li>PREPAID: prepaid, that is, yearly/monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly basis</li><li>SPOTPAID: spot billing (for Task nodes only)</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Node billing mode. Valid values:</p><li>PREPAID: prepaid, that is, yearly/monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly basis</li><li>SPOTPAID: spot billing (for Task nodes only)</li>
     * @param InstanceChargeType <p>Node billing mode. Valid values:</p><li>PREPAID: prepaid, that is, yearly/monthly subscription</li><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly basis</li><li>SPOTPAID: spot billing (for Task nodes only)</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return InstanceId <p>Cluster ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param InstanceId <p>Cluster ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Type and number of nodes for the scale-out.</p> 
     * @return ScaleOutNodeConfig <p>Type and number of nodes for the scale-out.</p>
     */
    public ScaleOutNodeConfig getScaleOutNodeConfig() {
        return this.ScaleOutNodeConfig;
    }

    /**
     * Set <p>Type and number of nodes for the scale-out.</p>
     * @param ScaleOutNodeConfig <p>Type and number of nodes for the scale-out.</p>
     */
    public void setScaleOutNodeConfig(ScaleOutNodeConfig ScaleOutNodeConfig) {
        this.ScaleOutNodeConfig = ScaleOutNodeConfig;
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
     * Get <p>Parameter settings related to yearly/monthly subscription. This parameter can be used to specify the purchase duration of a yearly/monthly subscription instance, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode of the specified instance is prepaid.</p> 
     * @return InstanceChargePrepaid <p>Parameter settings related to yearly/monthly subscription. This parameter can be used to specify the purchase duration of a yearly/monthly subscription instance, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode of the specified instance is prepaid.</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>Parameter settings related to yearly/monthly subscription. This parameter can be used to specify the purchase duration of a yearly/monthly subscription instance, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode of the specified instance is prepaid.</p>
     * @param InstanceChargePrepaid <p>Parameter settings related to yearly/monthly subscription. This parameter can be used to specify the purchase duration of a yearly/monthly subscription instance, whether to enable auto-renewal, and other attributes. This parameter is required if the billing mode of the specified instance is prepaid.</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p> 
     * @return ScriptBootstrapActionConfig <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
     */
    public ScriptBootstrapActionConfig [] getScriptBootstrapActionConfig() {
        return this.ScriptBootstrapActionConfig;
    }

    /**
     * Set <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
     * @param ScriptBootstrapActionConfig <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
     */
    public void setScriptBootstrapActionConfig(ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig) {
        this.ScriptBootstrapActionConfig = ScriptBootstrapActionConfig;
    }

    /**
     * Get <p>To scale out deployment services, new nodes will inherit the services deployed on the current node type by default. The deployment service includes default optional services. This parameter is supported only when optional services are used. For example, if existing task nodes have HDFS, YARN, and impala deployed, when using the API to scale out Task nodes without deploying impala, fill in only HDFS and YARN for the deployment service. For details, see <a href="https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1">Component Name Mapping Table</a>.</p> 
     * @return SoftDeployInfo <p>To scale out deployment services, new nodes will inherit the services deployed on the current node type by default. The deployment service includes default optional services. This parameter is supported only when optional services are used. For example, if existing task nodes have HDFS, YARN, and impala deployed, when using the API to scale out Task nodes without deploying impala, fill in only HDFS and YARN for the deployment service. For details, see <a href="https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1">Component Name Mapping Table</a>.</p>
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set <p>To scale out deployment services, new nodes will inherit the services deployed on the current node type by default. The deployment service includes default optional services. This parameter is supported only when optional services are used. For example, if existing task nodes have HDFS, YARN, and impala deployed, when using the API to scale out Task nodes without deploying impala, fill in only HDFS and YARN for the deployment service. For details, see <a href="https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1">Component Name Mapping Table</a>.</p>
     * @param SoftDeployInfo <p>To scale out deployment services, new nodes will inherit the services deployed on the current node type by default. The deployment service includes default optional services. This parameter is supported only when optional services are used. For example, if existing task nodes have HDFS, YARN, and impala deployed, when using the API to scale out Task nodes without deploying impala, fill in only HDFS and YARN for the deployment service. For details, see <a href="https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1">Component Name Mapping Table</a>.</p>
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get <p>Deployment processes. By default, all processes of the scaled‑out service are deployed. Deployment processes can be modified. For example, if the deployed services for the current task node are HDFS, YARN, and impala, the default deployment services are DataNode, NodeManager, and ImpalaServer. If you need to modify deployment process information, the deployment processes can be DataNode, NodeManager, and ImpalaServerCoordinator or DataNode, NodeManager, and ImpalaServerExecutor. For details, see <a href="https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1">Process Name Mapping Table</a>.</p> 
     * @return ServiceNodeInfo <p>Deployment processes. By default, all processes of the scaled‑out service are deployed. Deployment processes can be modified. For example, if the deployed services for the current task node are HDFS, YARN, and impala, the default deployment services are DataNode, NodeManager, and ImpalaServer. If you need to modify deployment process information, the deployment processes can be DataNode, NodeManager, and ImpalaServerCoordinator or DataNode, NodeManager, and ImpalaServerExecutor. For details, see <a href="https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1">Process Name Mapping Table</a>.</p>
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set <p>Deployment processes. By default, all processes of the scaled‑out service are deployed. Deployment processes can be modified. For example, if the deployed services for the current task node are HDFS, YARN, and impala, the default deployment services are DataNode, NodeManager, and ImpalaServer. If you need to modify deployment process information, the deployment processes can be DataNode, NodeManager, and ImpalaServerCoordinator or DataNode, NodeManager, and ImpalaServerExecutor. For details, see <a href="https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1">Process Name Mapping Table</a>.</p>
     * @param ServiceNodeInfo <p>Deployment processes. By default, all processes of the scaled‑out service are deployed. Deployment processes can be modified. For example, if the deployed services for the current task node are HDFS, YARN, and impala, the default deployment services are DataNode, NodeManager, and ImpalaServer. If you need to modify deployment process information, the deployment processes can be DataNode, NodeManager, and ImpalaServerCoordinator or DataNode, NodeManager, and ImpalaServerExecutor. For details, see <a href="https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1">Process Name Mapping Table</a>.</p>
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the DisasterRecoverGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a>.</p> 
     * @return DisasterRecoverGroupIds <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the DisasterRecoverGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a>.</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the DisasterRecoverGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a>.</p>
     * @param DisasterRecoverGroupIds <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the DisasterRecoverGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1">DescribeDisasterRecoverGroups</a>.</p>
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
     * @return HardwareSourceType <p>Resource type selected for the scale-out. Valid values: &quot;HOST&quot;, &quot;POD&quot;, and &quot;MNode&quot;. HOST indicates ordinary CVM resources, POD indicates resources provided by a TKE cluster or an EKS cluster, and MNode indicates fully managed resources.</p>
     */
    public String getHardwareSourceType() {
        return this.HardwareSourceType;
    }

    /**
     * Set <p>Resource type selected for the scale-out. Valid values: &quot;HOST&quot;, &quot;POD&quot;, and &quot;MNode&quot;. HOST indicates ordinary CVM resources, POD indicates resources provided by a TKE cluster or an EKS cluster, and MNode indicates fully managed resources.</p>
     * @param HardwareSourceType <p>Resource type selected for the scale-out. Valid values: &quot;HOST&quot;, &quot;POD&quot;, and &quot;MNode&quot;. HOST indicates ordinary CVM resources, POD indicates resources provided by a TKE cluster or an EKS cluster, and MNode indicates fully managed resources.</p>
     */
    public void setHardwareSourceType(String HardwareSourceType) {
        this.HardwareSourceType = HardwareSourceType;
    }

    /**
     * Get <p>Pod-related resource information.</p> 
     * @return PodSpecInfo <p>Pod-related resource information.</p>
     */
    public PodSpecInfo getPodSpecInfo() {
        return this.PodSpecInfo;
    }

    /**
     * Set <p>Pod-related resource information.</p>
     * @param PodSpecInfo <p>Pod-related resource information.</p>
     */
    public void setPodSpecInfo(PodSpecInfo PodSpecInfo) {
        this.PodSpecInfo = PodSpecInfo;
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
     * Get <p>YARN node label specified for the scale-out.</p> 
     * @return YarnNodeLabel <p>YARN node label specified for the scale-out.</p>
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set <p>YARN node label specified for the scale-out.</p>
     * @param YarnNodeLabel <p>YARN node label specified for the scale-out.</p>
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get <p>Whether to start the service after a scale-out. Default value: false. Valid values:</p><li>true: yes</li><li>false: no</li> 
     * @return EnableStartServiceFlag <p>Whether to start the service after a scale-out. Default value: false. Valid values:</p><li>true: yes</li><li>false: no</li>
     */
    public Boolean getEnableStartServiceFlag() {
        return this.EnableStartServiceFlag;
    }

    /**
     * Set <p>Whether to start the service after a scale-out. Default value: false. Valid values:</p><li>true: yes</li><li>false: no</li>
     * @param EnableStartServiceFlag <p>Whether to start the service after a scale-out. Default value: false. Valid values:</p><li>true: yes</li><li>false: no</li>
     */
    public void setEnableStartServiceFlag(Boolean EnableStartServiceFlag) {
        this.EnableStartServiceFlag = EnableStartServiceFlag;
    }

    /**
     * Get <p>Specification settings.</p> 
     * @return ResourceSpec <p>Specification settings.</p>
     */
    public NodeResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set <p>Specification settings.</p>
     * @param ResourceSpec <p>Specification settings.</p>
     */
    public void setResourceSpec(NodeResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get <p>AZ to which the instance belongs, for example, ap-guangzhou-1. This parameter can be obtained from the Zone field in the response of <a href="https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1">DescribeZones</a>.</p> 
     * @return Zone <p>AZ to which the instance belongs, for example, ap-guangzhou-1. This parameter can be obtained from the Zone field in the response of <a href="https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1">DescribeZones</a>.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ to which the instance belongs, for example, ap-guangzhou-1. This parameter can be obtained from the Zone field in the response of <a href="https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1">DescribeZones</a>.</p>
     * @param Zone <p>AZ to which the instance belongs, for example, ap-guangzhou-1. This parameter can be obtained from the Zone field in the response of <a href="https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1">DescribeZones</a>.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
     * Get <p>Configuration group specified for the scale-out.</p> 
     * @return ScaleOutServiceConfGroupsInfo <p>Configuration group specified for the scale-out.</p>
     */
    public ScaleOutServiceConfGroupsInfo [] getScaleOutServiceConfGroupsInfo() {
        return this.ScaleOutServiceConfGroupsInfo;
    }

    /**
     * Set <p>Configuration group specified for the scale-out.</p>
     * @param ScaleOutServiceConfGroupsInfo <p>Configuration group specified for the scale-out.</p>
     */
    public void setScaleOutServiceConfGroupsInfo(ScaleOutServiceConfGroupsInfo [] ScaleOutServiceConfGroupsInfo) {
        this.ScaleOutServiceConfGroupsInfo = ScaleOutServiceConfGroupsInfo;
    }

    /**
     * Get <p>Node flag information, which is currently only provided for the Terraform platform.</p> 
     * @return NodeMarks <p>Node flag information, which is currently only provided for the Terraform platform.</p>
     */
    public NodeMark getNodeMarks() {
        return this.NodeMarks;
    }

    /**
     * Set <p>Node flag information, which is currently only provided for the Terraform platform.</p>
     * @param NodeMarks <p>Node flag information, which is currently only provided for the Terraform platform.</p>
     */
    public void setNodeMarks(NodeMark NodeMarks) {
        this.NodeMarks = NodeMarks;
    }

    /**
     * Get <p>Name of the compute group specified for the scale-out.</p> 
     * @return WarehouseName <p>Name of the compute group specified for the scale-out.</p>
     */
    public String getWarehouseName() {
        return this.WarehouseName;
    }

    /**
     * Set <p>Name of the compute group specified for the scale-out.</p>
     * @param WarehouseName <p>Name of the compute group specified for the scale-out.</p>
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

    public ScaleOutClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutClusterRequest(ScaleOutClusterRequest source) {
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ScaleOutNodeConfig != null) {
            this.ScaleOutNodeConfig = new ScaleOutNodeConfig(source.ScaleOutNodeConfig);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.ScriptBootstrapActionConfig != null) {
            this.ScriptBootstrapActionConfig = new ScriptBootstrapActionConfig[source.ScriptBootstrapActionConfig.length];
            for (int i = 0; i < source.ScriptBootstrapActionConfig.length; i++) {
                this.ScriptBootstrapActionConfig[i] = new ScriptBootstrapActionConfig(source.ScriptBootstrapActionConfig[i]);
            }
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
        if (source.HardwareSourceType != null) {
            this.HardwareSourceType = new String(source.HardwareSourceType);
        }
        if (source.PodSpecInfo != null) {
            this.PodSpecInfo = new PodSpecInfo(source.PodSpecInfo);
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
        if (source.EnableStartServiceFlag != null) {
            this.EnableStartServiceFlag = new Boolean(source.EnableStartServiceFlag);
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new NodeResourceSpec(source.ResourceSpec);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ScaleOutServiceConfGroupsInfo != null) {
            this.ScaleOutServiceConfGroupsInfo = new ScaleOutServiceConfGroupsInfo[source.ScaleOutServiceConfGroupsInfo.length];
            for (int i = 0; i < source.ScaleOutServiceConfGroupsInfo.length; i++) {
                this.ScaleOutServiceConfGroupsInfo[i] = new ScaleOutServiceConfGroupsInfo(source.ScaleOutServiceConfGroupsInfo[i]);
            }
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
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "ScaleOutNodeConfig.", this.ScaleOutNodeConfig);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamArrayObj(map, prefix + "ScriptBootstrapActionConfig.", this.ScriptBootstrapActionConfig);
        this.setParamArraySimple(map, prefix + "SoftDeployInfo.", this.SoftDeployInfo);
        this.setParamArraySimple(map, prefix + "ServiceNodeInfo.", this.ServiceNodeInfo);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HardwareSourceType", this.HardwareSourceType);
        this.setParamObj(map, prefix + "PodSpecInfo.", this.PodSpecInfo);
        this.setParamSimple(map, prefix + "ClickHouseClusterName", this.ClickHouseClusterName);
        this.setParamSimple(map, prefix + "ClickHouseClusterType", this.ClickHouseClusterType);
        this.setParamSimple(map, prefix + "YarnNodeLabel", this.YarnNodeLabel);
        this.setParamSimple(map, prefix + "EnableStartServiceFlag", this.EnableStartServiceFlag);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "ScaleOutServiceConfGroupsInfo.", this.ScaleOutServiceConfGroupsInfo);
        this.setParamObj(map, prefix + "NodeMarks.", this.NodeMarks);
        this.setParamSimple(map, prefix + "WarehouseName", this.WarehouseName);
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);

    }
}

