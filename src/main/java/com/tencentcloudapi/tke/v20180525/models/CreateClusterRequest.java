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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel{

    /**
    * Container networking configuration information for the cluster
    */
    @SerializedName("ClusterCIDRSettings")
    @Expose
    private ClusterCIDRSettings ClusterCIDRSettings;

    /**
    * Cluster type. Managed cluster: MANAGED_CLUSTER; self-deployed cluster: INDEPENDENT_CLUSTER.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

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
    * Configuration information of an existing instance
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
     * Get Configuration information of an existing instance 
     * @return ExistedInstancesForNode Configuration information of an existing instance
     */
    public ExistedInstancesForNode [] getExistedInstancesForNode() {
        return this.ExistedInstancesForNode;
    }

    /**
     * Set Configuration information of an existing instance
     * @param ExistedInstancesForNode Configuration information of an existing instance
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterCIDRSettings.", this.ClusterCIDRSettings);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArrayObj(map, prefix + "RunInstancesForNode.", this.RunInstancesForNode);
        this.setParamObj(map, prefix + "ClusterBasicSettings.", this.ClusterBasicSettings);
        this.setParamObj(map, prefix + "ClusterAdvancedSettings.", this.ClusterAdvancedSettings);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamArrayObj(map, prefix + "ExistedInstancesForNode.", this.ExistedInstancesForNode);
        this.setParamArrayObj(map, prefix + "InstanceDataDiskMountSettings.", this.InstanceDataDiskMountSettings);

    }
}

