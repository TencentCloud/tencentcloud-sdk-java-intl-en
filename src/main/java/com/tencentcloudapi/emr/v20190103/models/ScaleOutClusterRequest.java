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

public class ScaleOutClusterRequest extends AbstractModel{

    /**
    * The node billing mode. Valid values:
<li>`PREPAID`：The prepaid mode, namely monthly subscription.</li>
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
<li>`SPOTPAID`: The spot instance mode (for task nodes only).</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * The cluster instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The type and number of nodes to be added.
    */
    @SerializedName("ScaleOutNodeConfig")
    @Expose
    private ScaleOutNodeConfig ScaleOutNodeConfig;

    /**
    * A unique random token, which is valid for 5 minutes and needs to be specified by the caller to prevent the client from repeatedly creating resources. An example value is `a9a90aa6-751a-41b6-aad6-fae36063280`.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * The details of the monthly subscription, including the instance period and auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * The [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings.
    */
    @SerializedName("ScriptBootstrapActionConfig")
    @Expose
    private ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig;

    /**
    * The services to be deployed for new nodes. By default, new nodes will inherit all services deployed for the current node type. Deployed services include default optional services. This parameter only supports optional services. For example, if `HDFS`, `YARN`, and `Impala` have been deployed for existing task nodes, only `HDFS` and `YARN` are passed in with this parameter if `Impala` is not deployed during the task node scale-out with API.
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * The processes to be deployed. All processes for services to be added are deployed by default. Deployed processes can be changed. For example, `HDFS`, `YARN`, and `Impala` have been deployed for current task nodes, and default services are `DataNode`, `NodeManager`, and `ImpalaServer`; if you want to change deployed processes, you can set this parameter to `DataNode,NodeManager,ImpalaServerCoordinator` or `DataNode,NodeManager,ImpalaServerExecutor`.
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * The list of spread placement group IDs. Only one can be specified.
You can call the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/product/213/17810?from_cn_redirect=1) API and obtain this parameter from the `DisasterRecoverGroupId` field in the response.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * The list of tags bound to added nodes.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The type of resources to add. Valid values: `host` (general CVM resources) and `pod` (resources provided by a TKE or EKS cluster).
    */
    @SerializedName("HardwareSourceType")
    @Expose
    private String HardwareSourceType;

    /**
    * The pod resource information.
    */
    @SerializedName("PodSpecInfo")
    @Expose
    private PodSpecInfo PodSpecInfo;

    /**
    * The server group name selected for ClickHouse cluster scale-out.
    */
    @SerializedName("ClickHouseClusterName")
    @Expose
    private String ClickHouseClusterName;

    /**
    * The server group type selected for ClickHouse cluster scale-out. Valid values: `new` (create a group) and `old` (select an existing group).
    */
    @SerializedName("ClickHouseClusterType")
    @Expose
    private String ClickHouseClusterType;

    /**
    * The YARN node label specified for scale-out.
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * Whether to start services after scale-out.
<li>`true`: Yes</li>
<li>`false` (default): No</li>
    */
    @SerializedName("EnableStartServiceFlag")
    @Expose
    private Boolean EnableStartServiceFlag;

    /**
    * The spec settings.
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NodeResourceSpec ResourceSpec;

    /**
    * The ID of the AZ where the instance resides, such as `ap-guangzhou-1`. You can call the [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1) API and obtain this ID from the `Zone` field in the response.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The subnet, which defaults to the subnet used when the cluster is created.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get The node billing mode. Valid values:
<li>`PREPAID`：The prepaid mode, namely monthly subscription.</li>
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
<li>`SPOTPAID`: The spot instance mode (for task nodes only).</li> 
     * @return InstanceChargeType The node billing mode. Valid values:
<li>`PREPAID`：The prepaid mode, namely monthly subscription.</li>
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
<li>`SPOTPAID`: The spot instance mode (for task nodes only).</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set The node billing mode. Valid values:
<li>`PREPAID`：The prepaid mode, namely monthly subscription.</li>
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
<li>`SPOTPAID`: The spot instance mode (for task nodes only).</li>
     * @param InstanceChargeType The node billing mode. Valid values:
<li>`PREPAID`：The prepaid mode, namely monthly subscription.</li>
<li>`POSTPAID_BY_HOUR`: The postpaid mode by hour.</li>
<li>`SPOTPAID`: The spot instance mode (for task nodes only).</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get The cluster instance ID. 
     * @return InstanceId The cluster instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The cluster instance ID.
     * @param InstanceId The cluster instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The type and number of nodes to be added. 
     * @return ScaleOutNodeConfig The type and number of nodes to be added.
     */
    public ScaleOutNodeConfig getScaleOutNodeConfig() {
        return this.ScaleOutNodeConfig;
    }

    /**
     * Set The type and number of nodes to be added.
     * @param ScaleOutNodeConfig The type and number of nodes to be added.
     */
    public void setScaleOutNodeConfig(ScaleOutNodeConfig ScaleOutNodeConfig) {
        this.ScaleOutNodeConfig = ScaleOutNodeConfig;
    }

    /**
     * Get A unique random token, which is valid for 5 minutes and needs to be specified by the caller to prevent the client from repeatedly creating resources. An example value is `a9a90aa6-751a-41b6-aad6-fae36063280`. 
     * @return ClientToken A unique random token, which is valid for 5 minutes and needs to be specified by the caller to prevent the client from repeatedly creating resources. An example value is `a9a90aa6-751a-41b6-aad6-fae36063280`.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A unique random token, which is valid for 5 minutes and needs to be specified by the caller to prevent the client from repeatedly creating resources. An example value is `a9a90aa6-751a-41b6-aad6-fae36063280`.
     * @param ClientToken A unique random token, which is valid for 5 minutes and needs to be specified by the caller to prevent the client from repeatedly creating resources. An example value is `a9a90aa6-751a-41b6-aad6-fae36063280`.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get The details of the monthly subscription, including the instance period and auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`. 
     * @return InstanceChargePrepaid The details of the monthly subscription, including the instance period and auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set The details of the monthly subscription, including the instance period and auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`.
     * @param InstanceChargePrepaid The details of the monthly subscription, including the instance period and auto-renewal. It is required if the `InstanceChargeType` is `PREPAID`.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get The [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings. 
     * @return ScriptBootstrapActionConfig The [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings.
     */
    public ScriptBootstrapActionConfig [] getScriptBootstrapActionConfig() {
        return this.ScriptBootstrapActionConfig;
    }

    /**
     * Set The [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings.
     * @param ScriptBootstrapActionConfig The [Bootstrap action](https://intl.cloud.tencent.com/document/product/589/35656?from_cn_redirect=1) script settings.
     */
    public void setScriptBootstrapActionConfig(ScriptBootstrapActionConfig [] ScriptBootstrapActionConfig) {
        this.ScriptBootstrapActionConfig = ScriptBootstrapActionConfig;
    }

    /**
     * Get The services to be deployed for new nodes. By default, new nodes will inherit all services deployed for the current node type. Deployed services include default optional services. This parameter only supports optional services. For example, if `HDFS`, `YARN`, and `Impala` have been deployed for existing task nodes, only `HDFS` and `YARN` are passed in with this parameter if `Impala` is not deployed during the task node scale-out with API. 
     * @return SoftDeployInfo The services to be deployed for new nodes. By default, new nodes will inherit all services deployed for the current node type. Deployed services include default optional services. This parameter only supports optional services. For example, if `HDFS`, `YARN`, and `Impala` have been deployed for existing task nodes, only `HDFS` and `YARN` are passed in with this parameter if `Impala` is not deployed during the task node scale-out with API.
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set The services to be deployed for new nodes. By default, new nodes will inherit all services deployed for the current node type. Deployed services include default optional services. This parameter only supports optional services. For example, if `HDFS`, `YARN`, and `Impala` have been deployed for existing task nodes, only `HDFS` and `YARN` are passed in with this parameter if `Impala` is not deployed during the task node scale-out with API.
     * @param SoftDeployInfo The services to be deployed for new nodes. By default, new nodes will inherit all services deployed for the current node type. Deployed services include default optional services. This parameter only supports optional services. For example, if `HDFS`, `YARN`, and `Impala` have been deployed for existing task nodes, only `HDFS` and `YARN` are passed in with this parameter if `Impala` is not deployed during the task node scale-out with API.
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get The processes to be deployed. All processes for services to be added are deployed by default. Deployed processes can be changed. For example, `HDFS`, `YARN`, and `Impala` have been deployed for current task nodes, and default services are `DataNode`, `NodeManager`, and `ImpalaServer`; if you want to change deployed processes, you can set this parameter to `DataNode,NodeManager,ImpalaServerCoordinator` or `DataNode,NodeManager,ImpalaServerExecutor`. 
     * @return ServiceNodeInfo The processes to be deployed. All processes for services to be added are deployed by default. Deployed processes can be changed. For example, `HDFS`, `YARN`, and `Impala` have been deployed for current task nodes, and default services are `DataNode`, `NodeManager`, and `ImpalaServer`; if you want to change deployed processes, you can set this parameter to `DataNode,NodeManager,ImpalaServerCoordinator` or `DataNode,NodeManager,ImpalaServerExecutor`.
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set The processes to be deployed. All processes for services to be added are deployed by default. Deployed processes can be changed. For example, `HDFS`, `YARN`, and `Impala` have been deployed for current task nodes, and default services are `DataNode`, `NodeManager`, and `ImpalaServer`; if you want to change deployed processes, you can set this parameter to `DataNode,NodeManager,ImpalaServerCoordinator` or `DataNode,NodeManager,ImpalaServerExecutor`.
     * @param ServiceNodeInfo The processes to be deployed. All processes for services to be added are deployed by default. Deployed processes can be changed. For example, `HDFS`, `YARN`, and `Impala` have been deployed for current task nodes, and default services are `DataNode`, `NodeManager`, and `ImpalaServer`; if you want to change deployed processes, you can set this parameter to `DataNode,NodeManager,ImpalaServerCoordinator` or `DataNode,NodeManager,ImpalaServerExecutor`.
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get The list of spread placement group IDs. Only one can be specified.
You can call the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/product/213/17810?from_cn_redirect=1) API and obtain this parameter from the `DisasterRecoverGroupId` field in the response. 
     * @return DisasterRecoverGroupIds The list of spread placement group IDs. Only one can be specified.
You can call the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/product/213/17810?from_cn_redirect=1) API and obtain this parameter from the `DisasterRecoverGroupId` field in the response.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set The list of spread placement group IDs. Only one can be specified.
You can call the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/product/213/17810?from_cn_redirect=1) API and obtain this parameter from the `DisasterRecoverGroupId` field in the response.
     * @param DisasterRecoverGroupIds The list of spread placement group IDs. Only one can be specified.
You can call the [DescribeDisasterRecoverGroups](https://intl.cloud.tencent.com/document/product/213/17810?from_cn_redirect=1) API and obtain this parameter from the `DisasterRecoverGroupId` field in the response.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get The list of tags bound to added nodes. 
     * @return Tags The list of tags bound to added nodes.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set The list of tags bound to added nodes.
     * @param Tags The list of tags bound to added nodes.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The type of resources to add. Valid values: `host` (general CVM resources) and `pod` (resources provided by a TKE or EKS cluster). 
     * @return HardwareSourceType The type of resources to add. Valid values: `host` (general CVM resources) and `pod` (resources provided by a TKE or EKS cluster).
     */
    public String getHardwareSourceType() {
        return this.HardwareSourceType;
    }

    /**
     * Set The type of resources to add. Valid values: `host` (general CVM resources) and `pod` (resources provided by a TKE or EKS cluster).
     * @param HardwareSourceType The type of resources to add. Valid values: `host` (general CVM resources) and `pod` (resources provided by a TKE or EKS cluster).
     */
    public void setHardwareSourceType(String HardwareSourceType) {
        this.HardwareSourceType = HardwareSourceType;
    }

    /**
     * Get The pod resource information. 
     * @return PodSpecInfo The pod resource information.
     */
    public PodSpecInfo getPodSpecInfo() {
        return this.PodSpecInfo;
    }

    /**
     * Set The pod resource information.
     * @param PodSpecInfo The pod resource information.
     */
    public void setPodSpecInfo(PodSpecInfo PodSpecInfo) {
        this.PodSpecInfo = PodSpecInfo;
    }

    /**
     * Get The server group name selected for ClickHouse cluster scale-out. 
     * @return ClickHouseClusterName The server group name selected for ClickHouse cluster scale-out.
     */
    public String getClickHouseClusterName() {
        return this.ClickHouseClusterName;
    }

    /**
     * Set The server group name selected for ClickHouse cluster scale-out.
     * @param ClickHouseClusterName The server group name selected for ClickHouse cluster scale-out.
     */
    public void setClickHouseClusterName(String ClickHouseClusterName) {
        this.ClickHouseClusterName = ClickHouseClusterName;
    }

    /**
     * Get The server group type selected for ClickHouse cluster scale-out. Valid values: `new` (create a group) and `old` (select an existing group). 
     * @return ClickHouseClusterType The server group type selected for ClickHouse cluster scale-out. Valid values: `new` (create a group) and `old` (select an existing group).
     */
    public String getClickHouseClusterType() {
        return this.ClickHouseClusterType;
    }

    /**
     * Set The server group type selected for ClickHouse cluster scale-out. Valid values: `new` (create a group) and `old` (select an existing group).
     * @param ClickHouseClusterType The server group type selected for ClickHouse cluster scale-out. Valid values: `new` (create a group) and `old` (select an existing group).
     */
    public void setClickHouseClusterType(String ClickHouseClusterType) {
        this.ClickHouseClusterType = ClickHouseClusterType;
    }

    /**
     * Get The YARN node label specified for scale-out. 
     * @return YarnNodeLabel The YARN node label specified for scale-out.
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set The YARN node label specified for scale-out.
     * @param YarnNodeLabel The YARN node label specified for scale-out.
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get Whether to start services after scale-out.
<li>`true`: Yes</li>
<li>`false` (default): No</li> 
     * @return EnableStartServiceFlag Whether to start services after scale-out.
<li>`true`: Yes</li>
<li>`false` (default): No</li>
     */
    public Boolean getEnableStartServiceFlag() {
        return this.EnableStartServiceFlag;
    }

    /**
     * Set Whether to start services after scale-out.
<li>`true`: Yes</li>
<li>`false` (default): No</li>
     * @param EnableStartServiceFlag Whether to start services after scale-out.
<li>`true`: Yes</li>
<li>`false` (default): No</li>
     */
    public void setEnableStartServiceFlag(Boolean EnableStartServiceFlag) {
        this.EnableStartServiceFlag = EnableStartServiceFlag;
    }

    /**
     * Get The spec settings. 
     * @return ResourceSpec The spec settings.
     */
    public NodeResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set The spec settings.
     * @param ResourceSpec The spec settings.
     */
    public void setResourceSpec(NodeResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get The ID of the AZ where the instance resides, such as `ap-guangzhou-1`. You can call the [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1) API and obtain this ID from the `Zone` field in the response. 
     * @return Zone The ID of the AZ where the instance resides, such as `ap-guangzhou-1`. You can call the [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1) API and obtain this ID from the `Zone` field in the response.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The ID of the AZ where the instance resides, such as `ap-guangzhou-1`. You can call the [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1) API and obtain this ID from the `Zone` field in the response.
     * @param Zone The ID of the AZ where the instance resides, such as `ap-guangzhou-1`. You can call the [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1) API and obtain this ID from the `Zone` field in the response.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The subnet, which defaults to the subnet used when the cluster is created. 
     * @return SubnetId The subnet, which defaults to the subnet used when the cluster is created.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The subnet, which defaults to the subnet used when the cluster is created.
     * @param SubnetId The subnet, which defaults to the subnet used when the cluster is created.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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

    }
}

