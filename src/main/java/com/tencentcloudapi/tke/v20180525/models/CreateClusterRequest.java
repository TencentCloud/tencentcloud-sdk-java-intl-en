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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel {

    /**
    * Cluster type. Managed cluster: MANAGED_CLUSTER; self-deployed cluster: INDEPENDENT_CLUSTER.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Container networking configuration information for the cluster
    */
    @SerializedName("ClusterCIDRSettings")
    @Expose
    private ClusterCIDRSettings ClusterCIDRSettings;

    /**
    * Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the API for [creating a CVM instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1).
    */
    @SerializedName("RunInstancesForNode")
    @Expose
    private RunInstancesForNode [] RunInstancesForNode;

    /**
    * Basic configuration information of the cluster
    */
    @SerializedName("ClusterBasicSettings")
    @Expose
    private ClusterBasicSettings ClusterBasicSettings;

    /**
    * Advanced configuration information of the cluster
    */
    @SerializedName("ClusterAdvancedSettings")
    @Expose
    private ClusterAdvancedSettings ClusterAdvancedSettings;

    /**
    * Advanced configuration information of the node
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * The configuration information for existing instances. All instances must be in the same VPC. Up to 100 instances are allowed in one VPC. Spot instances are not supported.
    */
    @SerializedName("ExistedInstancesForNode")
    @Expose
    private ExistedInstancesForNode [] ExistedInstancesForNode;

    /**
    * CVM type and the corresponding data disk mounting configuration information.
    */
    @SerializedName("InstanceDataDiskMountSettings")
    @Expose
    private InstanceDataDiskMountSetting [] InstanceDataDiskMountSettings;

    /**
    * Information of the add-on to be installed
    */
    @SerializedName("ExtensionAddons")
    @Expose
    private ExtensionAddon [] ExtensionAddons;

    /**
    * CDC Id
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get Cluster type. Managed cluster: MANAGED_CLUSTER; self-deployed cluster: INDEPENDENT_CLUSTER. 
     * @return ClusterType Cluster type. Managed cluster: MANAGED_CLUSTER; self-deployed cluster: INDEPENDENT_CLUSTER.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. Managed cluster: MANAGED_CLUSTER; self-deployed cluster: INDEPENDENT_CLUSTER.
     * @param ClusterType Cluster type. Managed cluster: MANAGED_CLUSTER; self-deployed cluster: INDEPENDENT_CLUSTER.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Container networking configuration information for the cluster 
     * @return ClusterCIDRSettings Container networking configuration information for the cluster
     */
    public ClusterCIDRSettings getClusterCIDRSettings() {
        return this.ClusterCIDRSettings;
    }

    /**
     * Set Container networking configuration information for the cluster
     * @param ClusterCIDRSettings Container networking configuration information for the cluster
     */
    public void setClusterCIDRSettings(ClusterCIDRSettings ClusterCIDRSettings) {
        this.ClusterCIDRSettings = ClusterCIDRSettings;
    }

    /**
     * Get Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the API for [creating a CVM instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1). 
     * @return RunInstancesForNode Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the API for [creating a CVM instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1).
     */
    public RunInstancesForNode [] getRunInstancesForNode() {
        return this.RunInstancesForNode;
    }

    /**
     * Set Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the API for [creating a CVM instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1).
     * @param RunInstancesForNode Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the API for [creating a CVM instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1).
     */
    public void setRunInstancesForNode(RunInstancesForNode [] RunInstancesForNode) {
        this.RunInstancesForNode = RunInstancesForNode;
    }

    /**
     * Get Basic configuration information of the cluster 
     * @return ClusterBasicSettings Basic configuration information of the cluster
     */
    public ClusterBasicSettings getClusterBasicSettings() {
        return this.ClusterBasicSettings;
    }

    /**
     * Set Basic configuration information of the cluster
     * @param ClusterBasicSettings Basic configuration information of the cluster
     */
    public void setClusterBasicSettings(ClusterBasicSettings ClusterBasicSettings) {
        this.ClusterBasicSettings = ClusterBasicSettings;
    }

    /**
     * Get Advanced configuration information of the cluster 
     * @return ClusterAdvancedSettings Advanced configuration information of the cluster
     */
    public ClusterAdvancedSettings getClusterAdvancedSettings() {
        return this.ClusterAdvancedSettings;
    }

    /**
     * Set Advanced configuration information of the cluster
     * @param ClusterAdvancedSettings Advanced configuration information of the cluster
     */
    public void setClusterAdvancedSettings(ClusterAdvancedSettings ClusterAdvancedSettings) {
        this.ClusterAdvancedSettings = ClusterAdvancedSettings;
    }

    /**
     * Get Advanced configuration information of the node 
     * @return InstanceAdvancedSettings Advanced configuration information of the node
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set Advanced configuration information of the node
     * @param InstanceAdvancedSettings Advanced configuration information of the node
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get The configuration information for existing instances. All instances must be in the same VPC. Up to 100 instances are allowed in one VPC. Spot instances are not supported. 
     * @return ExistedInstancesForNode The configuration information for existing instances. All instances must be in the same VPC. Up to 100 instances are allowed in one VPC. Spot instances are not supported.
     */
    public ExistedInstancesForNode [] getExistedInstancesForNode() {
        return this.ExistedInstancesForNode;
    }

    /**
     * Set The configuration information for existing instances. All instances must be in the same VPC. Up to 100 instances are allowed in one VPC. Spot instances are not supported.
     * @param ExistedInstancesForNode The configuration information for existing instances. All instances must be in the same VPC. Up to 100 instances are allowed in one VPC. Spot instances are not supported.
     */
    public void setExistedInstancesForNode(ExistedInstancesForNode [] ExistedInstancesForNode) {
        this.ExistedInstancesForNode = ExistedInstancesForNode;
    }

    /**
     * Get CVM type and the corresponding data disk mounting configuration information. 
     * @return InstanceDataDiskMountSettings CVM type and the corresponding data disk mounting configuration information.
     */
    public InstanceDataDiskMountSetting [] getInstanceDataDiskMountSettings() {
        return this.InstanceDataDiskMountSettings;
    }

    /**
     * Set CVM type and the corresponding data disk mounting configuration information.
     * @param InstanceDataDiskMountSettings CVM type and the corresponding data disk mounting configuration information.
     */
    public void setInstanceDataDiskMountSettings(InstanceDataDiskMountSetting [] InstanceDataDiskMountSettings) {
        this.InstanceDataDiskMountSettings = InstanceDataDiskMountSettings;
    }

    /**
     * Get Information of the add-on to be installed 
     * @return ExtensionAddons Information of the add-on to be installed
     */
    public ExtensionAddon [] getExtensionAddons() {
        return this.ExtensionAddons;
    }

    /**
     * Set Information of the add-on to be installed
     * @param ExtensionAddons Information of the add-on to be installed
     */
    public void setExtensionAddons(ExtensionAddon [] ExtensionAddons) {
        this.ExtensionAddons = ExtensionAddons;
    }

    /**
     * Get CDC Id 
     * @return CdcId CDC Id
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC Id
     * @param CdcId CDC Id
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterCIDRSettings != null) {
            this.ClusterCIDRSettings = new ClusterCIDRSettings(source.ClusterCIDRSettings);
        }
        if (source.RunInstancesForNode != null) {
            this.RunInstancesForNode = new RunInstancesForNode[source.RunInstancesForNode.length];
            for (int i = 0; i < source.RunInstancesForNode.length; i++) {
                this.RunInstancesForNode[i] = new RunInstancesForNode(source.RunInstancesForNode[i]);
            }
        }
        if (source.ClusterBasicSettings != null) {
            this.ClusterBasicSettings = new ClusterBasicSettings(source.ClusterBasicSettings);
        }
        if (source.ClusterAdvancedSettings != null) {
            this.ClusterAdvancedSettings = new ClusterAdvancedSettings(source.ClusterAdvancedSettings);
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.ExistedInstancesForNode != null) {
            this.ExistedInstancesForNode = new ExistedInstancesForNode[source.ExistedInstancesForNode.length];
            for (int i = 0; i < source.ExistedInstancesForNode.length; i++) {
                this.ExistedInstancesForNode[i] = new ExistedInstancesForNode(source.ExistedInstancesForNode[i]);
            }
        }
        if (source.InstanceDataDiskMountSettings != null) {
            this.InstanceDataDiskMountSettings = new InstanceDataDiskMountSetting[source.InstanceDataDiskMountSettings.length];
            for (int i = 0; i < source.InstanceDataDiskMountSettings.length; i++) {
                this.InstanceDataDiskMountSettings[i] = new InstanceDataDiskMountSetting(source.InstanceDataDiskMountSettings[i]);
            }
        }
        if (source.ExtensionAddons != null) {
            this.ExtensionAddons = new ExtensionAddon[source.ExtensionAddons.length];
            for (int i = 0; i < source.ExtensionAddons.length; i++) {
                this.ExtensionAddons[i] = new ExtensionAddon(source.ExtensionAddons[i]);
            }
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamObj(map, prefix + "ClusterCIDRSettings.", this.ClusterCIDRSettings);
        this.setParamArrayObj(map, prefix + "RunInstancesForNode.", this.RunInstancesForNode);
        this.setParamObj(map, prefix + "ClusterBasicSettings.", this.ClusterBasicSettings);
        this.setParamObj(map, prefix + "ClusterAdvancedSettings.", this.ClusterAdvancedSettings);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamArrayObj(map, prefix + "ExistedInstancesForNode.", this.ExistedInstancesForNode);
        this.setParamArrayObj(map, prefix + "InstanceDataDiskMountSettings.", this.InstanceDataDiskMountSettings);
        this.setParamArrayObj(map, prefix + "ExtensionAddons.", this.ExtensionAddons);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

