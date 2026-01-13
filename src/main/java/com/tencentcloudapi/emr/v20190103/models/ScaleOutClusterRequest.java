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
    * The node billing mode. Valid values:
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
<li>`SPOTPAID`: The spot instance mode (for task nodes only).</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Cluster instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Scale-up node type and quantity.
    */
    @SerializedName("ScaleOutNodeConfig")
    @Expose
    private ScaleOutNodeConfig ScaleOutNodeConfig;

    /**
    * Unique random identifier with the time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources again, for example, a9a90aa6-****-****-****-fae36063280.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Setting of parameters related to monthly subscription. Through this parameter, you can specify the duration of purchase for monthly subscription instances, whether to set auto-renewal, and other attributes. This parameter is required when the specified instance is subject to the payment mode of prepaid.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * [Bootstrap Actions](https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1) script settings.
    */
    @SerializedName("ScriptBootstrapActionConfig")
    @Expose
    private ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig;

    /**
    * Scale-out deployment service. New nodes inherit services deployed in the current node type by default, including default optional services. This parameter only supports optional service filling, for example: HDFS, YARN, and Impala have been deployed to existing task nodes. When API is used to scale out the task nodes without deploying Impala, only HDFS and YARN are filled for deployment services. For more details, see [Mapping Table of Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * Deployment process. By default, all scale-out service processes are deployed. Deployment processes can be modified. For example, HDFS, YARN, or Impala has been deployed for the current Task node. The default deployment services include DataNode,NodeManager,ImpalaServer. If users need to modify deployment process information, the deployment process can be DataNode, NodeManager, ImpalaServerCoordinator or DataNode, NodeManager, ImpalaServerExecutor. For more details, see [Mapping Table of Process Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * Spread placement group ID list. Only one can be specified currently.
This parameter can be obtained by calling the DisasterRecoverGroupId field in the return value of the [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1) API.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * List of tags bound to scale-out nodes.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Resource type selected for scale-out with valid values "HOST","POD","MNode", where HOST indicates an ordinary CVM resource, POD indicates a resource provided by the TKE cluster or EKS cluster, and MNode indicates a fully managed resource type.
    */
    @SerializedName("HardwareSourceType")
    @Expose
    private String HardwareSourceType;

    /**
    * Pod-related resource information.
    */
    @SerializedName("PodSpecInfo")
    @Expose
    private PodSpecInfo PodSpecInfo;

    /**
    * Machine group name selected for ClickHouse cluster scale-out.
    */
    @SerializedName("ClickHouseClusterName")
    @Expose
    private String ClickHouseClusterName;

    /**
    * Machine group type selected for ClickHouse cluster scale-out. "New" indicates creating a group type, and "old" indicates using an existing group type.
    */
    @SerializedName("ClickHouseClusterType")
    @Expose
    private String ClickHouseClusterType;

    /**
    * Specified Yarn Node Label for scale-out.
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * Whether to start a service after scale-out (default: false).
<li>true: yes</li>.
<li>false: no</li>.
    */
    @SerializedName("EnableStartServiceFlag")
    @Expose
    private Boolean EnableStartServiceFlag;

    /**
    * Specifications settings.
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NodeResourceSpec ResourceSpec;

    /**
    * Availability zone of the instance, such as ap-guangzhou-1. This parameter can also be obtained from the Zone field in the return value of [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Subnet, which is the subnet at the time of cluster creation by default.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Configuration group specified for scale-out.
    */
    @SerializedName("ScaleOutServiceConfGroupsInfo")
    @Expose
    private ScaleOutServiceConfGroupsInfo [] ScaleOutServiceConfGroupsInfo;

    /**
    * Node tag information: currently used only in Terraform.
    */
    @SerializedName("NodeMarks")
    @Expose
    private NodeMark NodeMarks;

    /**
     * Get The node billing mode. Valid values:
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
<li>`SPOTPAID`: The spot instance mode (for task nodes only).</li> 
     * @return InstanceChargeType The node billing mode. Valid values:
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
<li>`SPOTPAID`: The spot instance mode (for task nodes only).</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set The node billing mode. Valid values:
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
<li>`SPOTPAID`: The spot instance mode (for task nodes only).</li>
     * @param InstanceChargeType The node billing mode. Valid values:
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
<li>`SPOTPAID`: The spot instance mode (for task nodes only).</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Cluster instance ID. 
     * @return InstanceId Cluster instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID.
     * @param InstanceId Cluster instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Scale-up node type and quantity. 
     * @return ScaleOutNodeConfig Scale-up node type and quantity.
     */
    public ScaleOutNodeConfig getScaleOutNodeConfig() {
        return this.ScaleOutNodeConfig;
    }

    /**
     * Set Scale-up node type and quantity.
     * @param ScaleOutNodeConfig Scale-up node type and quantity.
     */
    public void setScaleOutNodeConfig(ScaleOutNodeConfig ScaleOutNodeConfig) {
        this.ScaleOutNodeConfig = ScaleOutNodeConfig;
    }

    /**
     * Get Unique random identifier with the time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources again, for example, a9a90aa6-****-****-****-fae36063280. 
     * @return ClientToken Unique random identifier with the time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources again, for example, a9a90aa6-****-****-****-fae36063280.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Unique random identifier with the time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources again, for example, a9a90aa6-****-****-****-fae36063280.
     * @param ClientToken Unique random identifier with the time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources again, for example, a9a90aa6-****-****-****-fae36063280.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Setting of parameters related to monthly subscription. Through this parameter, you can specify the duration of purchase for monthly subscription instances, whether to set auto-renewal, and other attributes. This parameter is required when the specified instance is subject to the payment mode of prepaid. 
     * @return InstanceChargePrepaid Setting of parameters related to monthly subscription. Through this parameter, you can specify the duration of purchase for monthly subscription instances, whether to set auto-renewal, and other attributes. This parameter is required when the specified instance is subject to the payment mode of prepaid.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Setting of parameters related to monthly subscription. Through this parameter, you can specify the duration of purchase for monthly subscription instances, whether to set auto-renewal, and other attributes. This parameter is required when the specified instance is subject to the payment mode of prepaid.
     * @param InstanceChargePrepaid Setting of parameters related to monthly subscription. Through this parameter, you can specify the duration of purchase for monthly subscription instances, whether to set auto-renewal, and other attributes. This parameter is required when the specified instance is subject to the payment mode of prepaid.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get [Bootstrap Actions](https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1) script settings. 
     * @return ScriptBootstrapActionConfig [Bootstrap Actions](https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1) script settings.
     */
    public ScriptBootstrapActionConfig [] getScriptBootstrapActionConfig() {
        return this.ScriptBootstrapActionConfig;
    }

    /**
     * Set [Bootstrap Actions](https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1) script settings.
     * @param ScriptBootstrapActionConfig [Bootstrap Actions](https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1) script settings.
     */
    public void setScriptBootstrapActionConfig(ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig) {
        this.ScriptBootstrapActionConfig = ScriptBootstrapActionConfig;
    }

    /**
     * Get Scale-out deployment service. New nodes inherit services deployed in the current node type by default, including default optional services. This parameter only supports optional service filling, for example: HDFS, YARN, and Impala have been deployed to existing task nodes. When API is used to scale out the task nodes without deploying Impala, only HDFS and YARN are filled for deployment services. For more details, see [Mapping Table of Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1). 
     * @return SoftDeployInfo Scale-out deployment service. New nodes inherit services deployed in the current node type by default, including default optional services. This parameter only supports optional service filling, for example: HDFS, YARN, and Impala have been deployed to existing task nodes. When API is used to scale out the task nodes without deploying Impala, only HDFS and YARN are filled for deployment services. For more details, see [Mapping Table of Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set Scale-out deployment service. New nodes inherit services deployed in the current node type by default, including default optional services. This parameter only supports optional service filling, for example: HDFS, YARN, and Impala have been deployed to existing task nodes. When API is used to scale out the task nodes without deploying Impala, only HDFS and YARN are filled for deployment services. For more details, see [Mapping Table of Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
     * @param SoftDeployInfo Scale-out deployment service. New nodes inherit services deployed in the current node type by default, including default optional services. This parameter only supports optional service filling, for example: HDFS, YARN, and Impala have been deployed to existing task nodes. When API is used to scale out the task nodes without deploying Impala, only HDFS and YARN are filled for deployment services. For more details, see [Mapping Table of Component Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get Deployment process. By default, all scale-out service processes are deployed. Deployment processes can be modified. For example, HDFS, YARN, or Impala has been deployed for the current Task node. The default deployment services include DataNode,NodeManager,ImpalaServer. If users need to modify deployment process information, the deployment process can be DataNode, NodeManager, ImpalaServerCoordinator or DataNode, NodeManager, ImpalaServerExecutor. For more details, see [Mapping Table of Process Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1). 
     * @return ServiceNodeInfo Deployment process. By default, all scale-out service processes are deployed. Deployment processes can be modified. For example, HDFS, YARN, or Impala has been deployed for the current Task node. The default deployment services include DataNode,NodeManager,ImpalaServer. If users need to modify deployment process information, the deployment process can be DataNode, NodeManager, ImpalaServerCoordinator or DataNode, NodeManager, ImpalaServerExecutor. For more details, see [Mapping Table of Process Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set Deployment process. By default, all scale-out service processes are deployed. Deployment processes can be modified. For example, HDFS, YARN, or Impala has been deployed for the current Task node. The default deployment services include DataNode,NodeManager,ImpalaServer. If users need to modify deployment process information, the deployment process can be DataNode, NodeManager, ImpalaServerCoordinator or DataNode, NodeManager, ImpalaServerExecutor. For more details, see [Mapping Table of Process Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
     * @param ServiceNodeInfo Deployment process. By default, all scale-out service processes are deployed. Deployment processes can be modified. For example, HDFS, YARN, or Impala has been deployed for the current Task node. The default deployment services include DataNode,NodeManager,ImpalaServer. If users need to modify deployment process information, the deployment process can be DataNode, NodeManager, ImpalaServerCoordinator or DataNode, NodeManager, ImpalaServerExecutor. For more details, see [Mapping Table of Process Names](https://www.tencentcloud.com/document/product/589/98760?from_cn_redirect=1).
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get Spread placement group ID list. Only one can be specified currently.
This parameter can be obtained by calling the DisasterRecoverGroupId field in the return value of the [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1) API. 
     * @return DisasterRecoverGroupIds Spread placement group ID list. Only one can be specified currently.
This parameter can be obtained by calling the DisasterRecoverGroupId field in the return value of the [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1) API.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set Spread placement group ID list. Only one can be specified currently.
This parameter can be obtained by calling the DisasterRecoverGroupId field in the return value of the [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1) API.
     * @param DisasterRecoverGroupIds Spread placement group ID list. Only one can be specified currently.
This parameter can be obtained by calling the DisasterRecoverGroupId field in the return value of the [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/document/product/213/17810?from_cn_redirect=1) API.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get List of tags bound to scale-out nodes. 
     * @return Tags List of tags bound to scale-out nodes.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags bound to scale-out nodes.
     * @param Tags List of tags bound to scale-out nodes.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Resource type selected for scale-out with valid values "HOST","POD","MNode", where HOST indicates an ordinary CVM resource, POD indicates a resource provided by the TKE cluster or EKS cluster, and MNode indicates a fully managed resource type. 
     * @return HardwareSourceType Resource type selected for scale-out with valid values "HOST","POD","MNode", where HOST indicates an ordinary CVM resource, POD indicates a resource provided by the TKE cluster or EKS cluster, and MNode indicates a fully managed resource type.
     */
    public String getHardwareSourceType() {
        return this.HardwareSourceType;
    }

    /**
     * Set Resource type selected for scale-out with valid values "HOST","POD","MNode", where HOST indicates an ordinary CVM resource, POD indicates a resource provided by the TKE cluster or EKS cluster, and MNode indicates a fully managed resource type.
     * @param HardwareSourceType Resource type selected for scale-out with valid values "HOST","POD","MNode", where HOST indicates an ordinary CVM resource, POD indicates a resource provided by the TKE cluster or EKS cluster, and MNode indicates a fully managed resource type.
     */
    public void setHardwareSourceType(String HardwareSourceType) {
        this.HardwareSourceType = HardwareSourceType;
    }

    /**
     * Get Pod-related resource information. 
     * @return PodSpecInfo Pod-related resource information.
     */
    public PodSpecInfo getPodSpecInfo() {
        return this.PodSpecInfo;
    }

    /**
     * Set Pod-related resource information.
     * @param PodSpecInfo Pod-related resource information.
     */
    public void setPodSpecInfo(PodSpecInfo PodSpecInfo) {
        this.PodSpecInfo = PodSpecInfo;
    }

    /**
     * Get Machine group name selected for ClickHouse cluster scale-out. 
     * @return ClickHouseClusterName Machine group name selected for ClickHouse cluster scale-out.
     */
    public String getClickHouseClusterName() {
        return this.ClickHouseClusterName;
    }

    /**
     * Set Machine group name selected for ClickHouse cluster scale-out.
     * @param ClickHouseClusterName Machine group name selected for ClickHouse cluster scale-out.
     */
    public void setClickHouseClusterName(String ClickHouseClusterName) {
        this.ClickHouseClusterName = ClickHouseClusterName;
    }

    /**
     * Get Machine group type selected for ClickHouse cluster scale-out. "New" indicates creating a group type, and "old" indicates using an existing group type. 
     * @return ClickHouseClusterType Machine group type selected for ClickHouse cluster scale-out. "New" indicates creating a group type, and "old" indicates using an existing group type.
     */
    public String getClickHouseClusterType() {
        return this.ClickHouseClusterType;
    }

    /**
     * Set Machine group type selected for ClickHouse cluster scale-out. "New" indicates creating a group type, and "old" indicates using an existing group type.
     * @param ClickHouseClusterType Machine group type selected for ClickHouse cluster scale-out. "New" indicates creating a group type, and "old" indicates using an existing group type.
     */
    public void setClickHouseClusterType(String ClickHouseClusterType) {
        this.ClickHouseClusterType = ClickHouseClusterType;
    }

    /**
     * Get Specified Yarn Node Label for scale-out. 
     * @return YarnNodeLabel Specified Yarn Node Label for scale-out.
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set Specified Yarn Node Label for scale-out.
     * @param YarnNodeLabel Specified Yarn Node Label for scale-out.
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get Whether to start a service after scale-out (default: false).
<li>true: yes</li>.
<li>false: no</li>. 
     * @return EnableStartServiceFlag Whether to start a service after scale-out (default: false).
<li>true: yes</li>.
<li>false: no</li>.
     */
    public Boolean getEnableStartServiceFlag() {
        return this.EnableStartServiceFlag;
    }

    /**
     * Set Whether to start a service after scale-out (default: false).
<li>true: yes</li>.
<li>false: no</li>.
     * @param EnableStartServiceFlag Whether to start a service after scale-out (default: false).
<li>true: yes</li>.
<li>false: no</li>.
     */
    public void setEnableStartServiceFlag(Boolean EnableStartServiceFlag) {
        this.EnableStartServiceFlag = EnableStartServiceFlag;
    }

    /**
     * Get Specifications settings. 
     * @return ResourceSpec Specifications settings.
     */
    public NodeResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set Specifications settings.
     * @param ResourceSpec Specifications settings.
     */
    public void setResourceSpec(NodeResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get Availability zone of the instance, such as ap-guangzhou-1. This parameter can also be obtained from the Zone field in the return value of [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1). 
     * @return Zone Availability zone of the instance, such as ap-guangzhou-1. This parameter can also be obtained from the Zone field in the return value of [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone of the instance, such as ap-guangzhou-1. This parameter can also be obtained from the Zone field in the return value of [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
     * @param Zone Availability zone of the instance, such as ap-guangzhou-1. This parameter can also be obtained from the Zone field in the return value of [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Subnet, which is the subnet at the time of cluster creation by default. 
     * @return SubnetId Subnet, which is the subnet at the time of cluster creation by default.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet, which is the subnet at the time of cluster creation by default.
     * @param SubnetId Subnet, which is the subnet at the time of cluster creation by default.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Configuration group specified for scale-out. 
     * @return ScaleOutServiceConfGroupsInfo Configuration group specified for scale-out.
     */
    public ScaleOutServiceConfGroupsInfo [] getScaleOutServiceConfGroupsInfo() {
        return this.ScaleOutServiceConfGroupsInfo;
    }

    /**
     * Set Configuration group specified for scale-out.
     * @param ScaleOutServiceConfGroupsInfo Configuration group specified for scale-out.
     */
    public void setScaleOutServiceConfGroupsInfo(ScaleOutServiceConfGroupsInfo [] ScaleOutServiceConfGroupsInfo) {
        this.ScaleOutServiceConfGroupsInfo = ScaleOutServiceConfGroupsInfo;
    }

    /**
     * Get Node tag information: currently used only in Terraform. 
     * @return NodeMarks Node tag information: currently used only in Terraform.
     */
    public NodeMark getNodeMarks() {
        return this.NodeMarks;
    }

    /**
     * Set Node tag information: currently used only in Terraform.
     * @param NodeMarks Node tag information: currently used only in Terraform.
     */
    public void setNodeMarks(NodeMark NodeMarks) {
        this.NodeMarks = NodeMarks;
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

    }
}

