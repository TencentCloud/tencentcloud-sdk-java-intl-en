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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceUpgradeTypeRequest extends AbstractModel {

    /**
    * <p>Instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>The number of CPU cores of the target instance. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable CPU range of the instance.</p>
    */
    @SerializedName("DstCpu")
    @Expose
    private Float DstCpu;

    /**
    * <p>Target instance memory size, measurement unit: MB. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable memory size range of the instance.</p>
    */
    @SerializedName("DstMemory")
    @Expose
    private Long DstMemory;

    /**
    * <p>Target instance disk size, unit: GB. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable disk size range of the instance.</p>
    */
    @SerializedName("DstDisk")
    @Expose
    private Long DstDisk;

    /**
    * <p>Target instance database version. Available values: 5.6, 5.7, 8.0.</p>
    */
    @SerializedName("DstVersion")
    @Expose
    private String DstVersion;

    /**
    * <p>Deployment model of the target instance. Defaults to 0. Supported values include: 0 - means single availability zone, 1 - means multi-availability zone.</p>
    */
    @SerializedName("DstDeployMode")
    @Expose
    private Long DstDeployMode;

    /**
    * <p>Replication type of the target instance. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
    */
    @SerializedName("DstProtectMode")
    @Expose
    private Long DstProtectMode;

    /**
    * <p>AZ ID of the standby instance 1 of the target instance. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the availability zone ID.</p>
    */
    @SerializedName("DstSlaveZone")
    @Expose
    private Long DstSlaveZone;

    /**
    * <p>AZ ID of the standby instance 2. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the AZ ID.</p>
    */
    @SerializedName("DstBackupZone")
    @Expose
    private Long DstBackupZone;

    /**
    * <p>Target instance type. Supported values include: "CUSTOM" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "ONTKE" - ONTKE single-node instance, "CLOUD_NATIVE_CLUSTER" - standard type for CLOUD disk, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced type for CLOUD disk.</p>
    */
    @SerializedName("DstCdbType")
    @Expose
    private String DstCdbType;

    /**
    * <p>Primary availability zone ID of the target instance. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the AZ ID.</p>
    */
    @SerializedName("DstZoneId")
    @Expose
    private Long DstZoneId;

    /**
    * <p>Node distribution of CDB instances in the dedicated cluster.</p>
    */
    @SerializedName("NodeDistribution")
    @Expose
    private NodeDistribution NodeDistribution;

    /**
    * <p>Topology configuration for cloud disk edition nodes. Nodeld information can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/105116?from_cn_redirect=1">DescribeClusterInfo</a> API.</p>
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
    * <p>AZ ID of the standby instance 3 in the target instance. Use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the availability zone ID.</p>
    */
    @SerializedName("DstFourthZone")
    @Expose
    private Long DstFourthZone;

    /**
     * Get <p>Instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p> 
     * @return InstanceId <p>Instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     * @param InstanceId <p>Instance ID, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1">DescribeDBInstances</a> API.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>The number of CPU cores of the target instance. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable CPU range of the instance.</p> 
     * @return DstCpu <p>The number of CPU cores of the target instance. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable CPU range of the instance.</p>
     */
    public Float getDstCpu() {
        return this.DstCpu;
    }

    /**
     * Set <p>The number of CPU cores of the target instance. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable CPU range of the instance.</p>
     * @param DstCpu <p>The number of CPU cores of the target instance. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable CPU range of the instance.</p>
     */
    public void setDstCpu(Float DstCpu) {
        this.DstCpu = DstCpu;
    }

    /**
     * Get <p>Target instance memory size, measurement unit: MB. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable memory size range of the instance.</p> 
     * @return DstMemory <p>Target instance memory size, measurement unit: MB. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable memory size range of the instance.</p>
     */
    public Long getDstMemory() {
        return this.DstMemory;
    }

    /**
     * Set <p>Target instance memory size, measurement unit: MB. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable memory size range of the instance.</p>
     * @param DstMemory <p>Target instance memory size, measurement unit: MB. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable memory size range of the instance.</p>
     */
    public void setDstMemory(Long DstMemory) {
        this.DstMemory = DstMemory;
    }

    /**
     * Get <p>Target instance disk size, unit: GB. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable disk size range of the instance.</p> 
     * @return DstDisk <p>Target instance disk size, unit: GB. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable disk size range of the instance.</p>
     */
    public Long getDstDisk() {
        return this.DstDisk;
    }

    /**
     * Set <p>Target instance disk size, unit: GB. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable disk size range of the instance.</p>
     * @param DstDisk <p>Target instance disk size, unit: GB. To ensure the input value is valid, please use <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> to get the saleable disk size range of the instance.</p>
     */
    public void setDstDisk(Long DstDisk) {
        this.DstDisk = DstDisk;
    }

    /**
     * Get <p>Target instance database version. Available values: 5.6, 5.7, 8.0.</p> 
     * @return DstVersion <p>Target instance database version. Available values: 5.6, 5.7, 8.0.</p>
     */
    public String getDstVersion() {
        return this.DstVersion;
    }

    /**
     * Set <p>Target instance database version. Available values: 5.6, 5.7, 8.0.</p>
     * @param DstVersion <p>Target instance database version. Available values: 5.6, 5.7, 8.0.</p>
     */
    public void setDstVersion(String DstVersion) {
        this.DstVersion = DstVersion;
    }

    /**
     * Get <p>Deployment model of the target instance. Defaults to 0. Supported values include: 0 - means single availability zone, 1 - means multi-availability zone.</p> 
     * @return DstDeployMode <p>Deployment model of the target instance. Defaults to 0. Supported values include: 0 - means single availability zone, 1 - means multi-availability zone.</p>
     */
    public Long getDstDeployMode() {
        return this.DstDeployMode;
    }

    /**
     * Set <p>Deployment model of the target instance. Defaults to 0. Supported values include: 0 - means single availability zone, 1 - means multi-availability zone.</p>
     * @param DstDeployMode <p>Deployment model of the target instance. Defaults to 0. Supported values include: 0 - means single availability zone, 1 - means multi-availability zone.</p>
     */
    public void setDstDeployMode(Long DstDeployMode) {
        this.DstDeployMode = DstDeployMode;
    }

    /**
     * Get <p>Replication type of the target instance. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p> 
     * @return DstProtectMode <p>Replication type of the target instance. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
     */
    public Long getDstProtectMode() {
        return this.DstProtectMode;
    }

    /**
     * Set <p>Replication type of the target instance. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
     * @param DstProtectMode <p>Replication type of the target instance. Supported values include: 0 - means async replication, 1 - means semi-sync replication, 2 - means strong sync replication.</p>
     */
    public void setDstProtectMode(Long DstProtectMode) {
        this.DstProtectMode = DstProtectMode;
    }

    /**
     * Get <p>AZ ID of the standby instance 1 of the target instance. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the availability zone ID.</p> 
     * @return DstSlaveZone <p>AZ ID of the standby instance 1 of the target instance. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the availability zone ID.</p>
     */
    public Long getDstSlaveZone() {
        return this.DstSlaveZone;
    }

    /**
     * Set <p>AZ ID of the standby instance 1 of the target instance. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the availability zone ID.</p>
     * @param DstSlaveZone <p>AZ ID of the standby instance 1 of the target instance. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the availability zone ID.</p>
     */
    public void setDstSlaveZone(Long DstSlaveZone) {
        this.DstSlaveZone = DstSlaveZone;
    }

    /**
     * Get <p>AZ ID of the standby instance 2. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the AZ ID.</p> 
     * @return DstBackupZone <p>AZ ID of the standby instance 2. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the AZ ID.</p>
     */
    public Long getDstBackupZone() {
        return this.DstBackupZone;
    }

    /**
     * Set <p>AZ ID of the standby instance 2. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the AZ ID.</p>
     * @param DstBackupZone <p>AZ ID of the standby instance 2. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the AZ ID.</p>
     */
    public void setDstBackupZone(Long DstBackupZone) {
        this.DstBackupZone = DstBackupZone;
    }

    /**
     * Get <p>Target instance type. Supported values include: "CUSTOM" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "ONTKE" - ONTKE single-node instance, "CLOUD_NATIVE_CLUSTER" - standard type for CLOUD disk, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced type for CLOUD disk.</p> 
     * @return DstCdbType <p>Target instance type. Supported values include: "CUSTOM" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "ONTKE" - ONTKE single-node instance, "CLOUD_NATIVE_CLUSTER" - standard type for CLOUD disk, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced type for CLOUD disk.</p>
     */
    public String getDstCdbType() {
        return this.DstCdbType;
    }

    /**
     * Set <p>Target instance type. Supported values include: "CUSTOM" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "ONTKE" - ONTKE single-node instance, "CLOUD_NATIVE_CLUSTER" - standard type for CLOUD disk, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced type for CLOUD disk.</p>
     * @param DstCdbType <p>Target instance type. Supported values include: "CUSTOM" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "ONTKE" - ONTKE single-node instance, "CLOUD_NATIVE_CLUSTER" - standard type for CLOUD disk, "CLOUD_NATIVE_CLUSTER_EXCLUSIVE" - enhanced type for CLOUD disk.</p>
     */
    public void setDstCdbType(String DstCdbType) {
        this.DstCdbType = DstCdbType;
    }

    /**
     * Get <p>Primary availability zone ID of the target instance. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the AZ ID.</p> 
     * @return DstZoneId <p>Primary availability zone ID of the target instance. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the AZ ID.</p>
     */
    public Long getDstZoneId() {
        return this.DstZoneId;
    }

    /**
     * Set <p>Primary availability zone ID of the target instance. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the AZ ID.</p>
     * @param DstZoneId <p>Primary availability zone ID of the target instance. You can use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the AZ ID.</p>
     */
    public void setDstZoneId(Long DstZoneId) {
        this.DstZoneId = DstZoneId;
    }

    /**
     * Get <p>Node distribution of CDB instances in the dedicated cluster.</p> 
     * @return NodeDistribution <p>Node distribution of CDB instances in the dedicated cluster.</p>
     */
    public NodeDistribution getNodeDistribution() {
        return this.NodeDistribution;
    }

    /**
     * Set <p>Node distribution of CDB instances in the dedicated cluster.</p>
     * @param NodeDistribution <p>Node distribution of CDB instances in the dedicated cluster.</p>
     */
    public void setNodeDistribution(NodeDistribution NodeDistribution) {
        this.NodeDistribution = NodeDistribution;
    }

    /**
     * Get <p>Topology configuration for cloud disk edition nodes. Nodeld information can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/105116?from_cn_redirect=1">DescribeClusterInfo</a> API.</p> 
     * @return ClusterTopology <p>Topology configuration for cloud disk edition nodes. Nodeld information can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/105116?from_cn_redirect=1">DescribeClusterInfo</a> API.</p>
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set <p>Topology configuration for cloud disk edition nodes. Nodeld information can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/105116?from_cn_redirect=1">DescribeClusterInfo</a> API.</p>
     * @param ClusterTopology <p>Topology configuration for cloud disk edition nodes. Nodeld information can be obtained through the <a href="https://www.tencentcloud.com/document/api/236/105116?from_cn_redirect=1">DescribeClusterInfo</a> API.</p>
     */
    public void setClusterTopology(ClusterTopology ClusterTopology) {
        this.ClusterTopology = ClusterTopology;
    }

    /**
     * Get <p>AZ ID of the standby instance 3 in the target instance. Use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the availability zone ID.</p> 
     * @return DstFourthZone <p>AZ ID of the standby instance 3 in the target instance. Use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the availability zone ID.</p>
     */
    public Long getDstFourthZone() {
        return this.DstFourthZone;
    }

    /**
     * Set <p>AZ ID of the standby instance 3 in the target instance. Use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the availability zone ID.</p>
     * @param DstFourthZone <p>AZ ID of the standby instance 3 in the target instance. Use the <a href="https://www.tencentcloud.com/document/product/236/80281?from_cn_redirect=1">DescribeCdbZoneConfig</a> API to obtain the availability zone ID.</p>
     */
    public void setDstFourthZone(Long DstFourthZone) {
        this.DstFourthZone = DstFourthZone;
    }

    public DescribeInstanceUpgradeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceUpgradeTypeRequest(DescribeInstanceUpgradeTypeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DstCpu != null) {
            this.DstCpu = new Float(source.DstCpu);
        }
        if (source.DstMemory != null) {
            this.DstMemory = new Long(source.DstMemory);
        }
        if (source.DstDisk != null) {
            this.DstDisk = new Long(source.DstDisk);
        }
        if (source.DstVersion != null) {
            this.DstVersion = new String(source.DstVersion);
        }
        if (source.DstDeployMode != null) {
            this.DstDeployMode = new Long(source.DstDeployMode);
        }
        if (source.DstProtectMode != null) {
            this.DstProtectMode = new Long(source.DstProtectMode);
        }
        if (source.DstSlaveZone != null) {
            this.DstSlaveZone = new Long(source.DstSlaveZone);
        }
        if (source.DstBackupZone != null) {
            this.DstBackupZone = new Long(source.DstBackupZone);
        }
        if (source.DstCdbType != null) {
            this.DstCdbType = new String(source.DstCdbType);
        }
        if (source.DstZoneId != null) {
            this.DstZoneId = new Long(source.DstZoneId);
        }
        if (source.NodeDistribution != null) {
            this.NodeDistribution = new NodeDistribution(source.NodeDistribution);
        }
        if (source.ClusterTopology != null) {
            this.ClusterTopology = new ClusterTopology(source.ClusterTopology);
        }
        if (source.DstFourthZone != null) {
            this.DstFourthZone = new Long(source.DstFourthZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DstCpu", this.DstCpu);
        this.setParamSimple(map, prefix + "DstMemory", this.DstMemory);
        this.setParamSimple(map, prefix + "DstDisk", this.DstDisk);
        this.setParamSimple(map, prefix + "DstVersion", this.DstVersion);
        this.setParamSimple(map, prefix + "DstDeployMode", this.DstDeployMode);
        this.setParamSimple(map, prefix + "DstProtectMode", this.DstProtectMode);
        this.setParamSimple(map, prefix + "DstSlaveZone", this.DstSlaveZone);
        this.setParamSimple(map, prefix + "DstBackupZone", this.DstBackupZone);
        this.setParamSimple(map, prefix + "DstCdbType", this.DstCdbType);
        this.setParamSimple(map, prefix + "DstZoneId", this.DstZoneId);
        this.setParamObj(map, prefix + "NodeDistribution.", this.NodeDistribution);
        this.setParamObj(map, prefix + "ClusterTopology.", this.ClusterTopology);
        this.setParamSimple(map, prefix + "DstFourthZone", this.DstFourthZone);

    }
}

