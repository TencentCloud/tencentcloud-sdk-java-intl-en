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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateInstanceRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name (1-50 English letters, Chinese characters, digits, hyphens -, or underscores _)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Abandoned. Please use NodeInfoList.
Number of nodes (2-50).
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * ES configuration item (JSON format string)
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;

    /**
    * Password of the default user elastic (8–16 characters, including at least two of the following: [a-z,A-Z], [0-9], and special characters [-!@#$%&^*+=_:;,.?])
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Public access policy for visualization components (Kibana and Cerebro)
    */
    @SerializedName("EsAcl")
    @Expose
    private EsAcl EsAcl;

    /**
    * Abandoned. Please use NodeInfoList.
Disk size in GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Abandoned. Please use NodeInfoList.
Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Abandoned. Please use NodeInfoList.
Number of dedicated primary nodes (supports only 3 or 5)
    */
    @SerializedName("MasterNodeNum")
    @Expose
    private Long MasterNodeNum;

    /**
    * Abandoned. Please use NodeInfoList.
Dedicated primary node specification<li>ES.S1.SMALL2: 1-core 2GB</li><li>ES.S1.MEDIUM4: 2-core 4GB</li><li>ES.S1.MEDIUM8: 2-core 8GB</li><li>ES.S1.LARGE16: 4-core 16GB</li><li>ES.S1.2XLARGE32: 8-core 32GB</li><li>ES.S1.4XLARGE32: 16-core 32GB</li><li>ES.S1.4XLARGE64: 16-core 64GB</li>
    */
    @SerializedName("MasterNodeType")
    @Expose
    private String MasterNodeType;

    /**
    * Abandoned. Please use NodeInfoList.
Dedicated primary node disk size (in GB. The system default configuration is 50 GB. Customization is temporarily not supported.)
    */
    @SerializedName("MasterNodeDiskSize")
    @Expose
    private Long MasterNodeDiskSize;

    /**
    * Whether to force restart when updating the configuration <li>true: force restart</li><li>false: do not force restart</li>Currently, this needs to be set only when updating EsConfig. The default value is false.
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * COS auto backup information
    */
    @SerializedName("CosBackup")
    @Expose
    private CosBackup CosBackup;

    /**
    * Node information list. You can transmit only the node to be updated and its corresponding specification information. Supported operations include <li>modifying the count of a node type</li><li>modifying the node specification and disk size of a node type</li><li>adding a node type (you need to simultaneously specify the node type, count, specification, disk, and other information)</li>. You can perform only one of the above operations at a time, and the disk type cannot be modified.
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * Public access status of the ES cluster
OPEN: enabled.
-CLOSE: disabled.
    */
    @SerializedName("PublicAccess")
    @Expose
    private String PublicAccess;

    /**
    * Public network access control list
    */
    @SerializedName("EsPublicAcl")
    @Expose
    private EsPublicAcl EsPublicAcl;

    /**
    * Kibana public access status
OPEN: enabled.
-CLOSE: disabled.
    */
    @SerializedName("KibanaPublicAccess")
    @Expose
    private String KibanaPublicAccess;

    /**
    * Kibana internal access status
OPEN: enabled.
-CLOSE: disabled.
    */
    @SerializedName("KibanaPrivateAccess")
    @Expose
    private String KibanaPrivateAccess;

    /**
    * Turn on or off user authentication for the basic version of ES 6.8 and above
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

    /**
    * Kibana private network port
    */
    @SerializedName("KibanaPrivatePort")
    @Expose
    private Long KibanaPrivatePort;

    /**
    * 0: Scale out via blue-green change without restarting the cluster (default) 1: Scale out by unmounting disks with a cluster rolling restart
    */
    @SerializedName("ScaleType")
    @Expose
    private Long ScaleType;

    /**
    * Multi-AZ deployment
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * Scenario template type. -1: not enabled. 1: common. 2: log. 3: search
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * Kibana configuration item (JSON format string)
    */
    @SerializedName("KibanaConfig")
    @Expose
    private String KibanaConfig;

    /**
    * Visualize node configuration
    */
    @SerializedName("WebNodeTypeInfo")
    @Expose
    private WebNodeTypeInfo WebNodeTypeInfo;

    /**
    * Switch to the new network architecture
    */
    @SerializedName("SwitchPrivateLink")
    @Expose
    private String SwitchPrivateLink;

    /**
    * Enable Cerebro
    */
    @SerializedName("EnableCerebro")
    @Expose
    private Boolean EnableCerebro;

    /**
    * Cerebro public access status
OPEN: enabled.
-CLOSE: disabled.
    */
    @SerializedName("CerebroPublicAccess")
    @Expose
    private String CerebroPublicAccess;

    /**
    * Cerebro private network access status
OPEN: enabled.
-CLOSE: disabled.
    */
    @SerializedName("CerebroPrivateAccess")
    @Expose
    private String CerebroPrivateAccess;

    /**
    * Newly-added or modified configuration group information
    */
    @SerializedName("EsConfigSet")
    @Expose
    private EsConfigSetInfo EsConfigSet;

    /**
    * Maintenance time slot.
    */
    @SerializedName("OperationDuration")
    @Expose
    private OperationDurationUpdated OperationDuration;

    /**
    * Whether Alerting public network alert output is enabled:
OPEN: enabled.
-CLOSE: disabled.
    */
    @SerializedName("KibanaAlteringPublicAccess")
    @Expose
    private String KibanaAlteringPublicAccess;

    /**
    * Custom domain name of kibana on the private network
    */
    @SerializedName("KibanaPrivateDomain")
    @Expose
    private String KibanaPrivateDomain;

    /**
    * Custom domain name of cerebro on the private network
    */
    @SerializedName("CerebroPrivateDomain")
    @Expose
    private String CerebroPrivateDomain;

    /**
    * Change to an https cluster. http is selected by default.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Outbound access details of the node

    */
    @SerializedName("OutboundPublicAcls")
    @Expose
    private OutboundPublicAcl [] OutboundPublicAcls;

    /**
    * Outbound access operations of the node
OPEN
-CLOSE: disabled.
    */
    @SerializedName("OutboundPublicAccess")
    @Expose
    private String OutboundPublicAccess;

    /**
    * Parameter for delayed cvm launch
    */
    @SerializedName("CvmDelayOnlineTime")
    @Expose
    private Long CvmDelayOnlineTime;

    /**
    * Number of concurrent shard migrations
    */
    @SerializedName("ShardAllocationConcurrents")
    @Expose
    private Long ShardAllocationConcurrents;

    /**
    * Shard migration concurrency speed
    */
    @SerializedName("ShardAllocationBytes")
    @Expose
    private Long ShardAllocationBytes;

    /**
    * Read-write separation mode: -1: not enabled; 1: local read/write separation; 2: remote read/write separation.
    */
    @SerializedName("ReadWriteMode")
    @Expose
    private Long ReadWriteMode;

    /**
    * Whether to enable the placement group async task
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * Placement group async task maintenance time slot
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

    /**
    * Cluster protection: OPEN: enable, CLOSE: disable
    */
    @SerializedName("EnableDestroyProtection")
    @Expose
    private String EnableDestroyProtection;

    /**
    * Auto capacity expansion parameter
    */
    @SerializedName("AutoScaleDiskInfoList")
    @Expose
    private AutoScaleDiskInfo [] AutoScaleDiskInfoList;

    /**
    * Auto-expansion delete parameter
    */
    @SerializedName("AutoScaleDiskDeleteNodeTypeList")
    @Expose
    private String [] AutoScaleDiskDeleteNodeTypeList;

    /**
    * Other additional configuration, jvm or yml.
    */
    @SerializedName("OtherConfig")
    @Expose
    private OtherConfig OtherConfig;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name (1-50 English letters, Chinese characters, digits, hyphens -, or underscores _) 
     * @return InstanceName Instance name (1-50 English letters, Chinese characters, digits, hyphens -, or underscores _)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name (1-50 English letters, Chinese characters, digits, hyphens -, or underscores _)
     * @param InstanceName Instance name (1-50 English letters, Chinese characters, digits, hyphens -, or underscores _)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Abandoned. Please use NodeInfoList.
Number of nodes (2-50). 
     * @return NodeNum Abandoned. Please use NodeInfoList.
Number of nodes (2-50).
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Abandoned. Please use NodeInfoList.
Number of nodes (2-50).
     * @param NodeNum Abandoned. Please use NodeInfoList.
Number of nodes (2-50).
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get ES configuration item (JSON format string) 
     * @return EsConfig ES configuration item (JSON format string)
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set ES configuration item (JSON format string)
     * @param EsConfig ES configuration item (JSON format string)
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get Password of the default user elastic (8–16 characters, including at least two of the following: [a-z,A-Z], [0-9], and special characters [-!@#$%&^*+=_:;,.?]) 
     * @return Password Password of the default user elastic (8–16 characters, including at least two of the following: [a-z,A-Z], [0-9], and special characters [-!@#$%&^*+=_:;,.?])
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password of the default user elastic (8–16 characters, including at least two of the following: [a-z,A-Z], [0-9], and special characters [-!@#$%&^*+=_:;,.?])
     * @param Password Password of the default user elastic (8–16 characters, including at least two of the following: [a-z,A-Z], [0-9], and special characters [-!@#$%&^*+=_:;,.?])
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Public access policy for visualization components (Kibana and Cerebro) 
     * @return EsAcl Public access policy for visualization components (Kibana and Cerebro)
     */
    public EsAcl getEsAcl() {
        return this.EsAcl;
    }

    /**
     * Set Public access policy for visualization components (Kibana and Cerebro)
     * @param EsAcl Public access policy for visualization components (Kibana and Cerebro)
     */
    public void setEsAcl(EsAcl EsAcl) {
        this.EsAcl = EsAcl;
    }

    /**
     * Get Abandoned. Please use NodeInfoList.
Disk size in GB 
     * @return DiskSize Abandoned. Please use NodeInfoList.
Disk size in GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Abandoned. Please use NodeInfoList.
Disk size in GB
     * @param DiskSize Abandoned. Please use NodeInfoList.
Disk size in GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Abandoned. Please use NodeInfoList.
Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li> 
     * @return NodeType Abandoned. Please use NodeInfoList.
Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Abandoned. Please use NodeInfoList.
Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li>
     * @param NodeType Abandoned. Please use NodeInfoList.
Node specification<li>ES.S1.SMALL2: 1-core 2G</li><li>ES.S1.MEDIUM4: 2-core 4G</li><li>ES.S1.MEDIUM8: 2-core 8G</li><li>ES.S1.LARGE16: 4-core 16G</li><li>ES.S1.2XLARGE32: 8-core 32G</li><li>ES.S1.4XLARGE32: 16-core 32G</li><li>ES.S1.4XLARGE64: 16-core 64G</li>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Abandoned. Please use NodeInfoList.
Number of dedicated primary nodes (supports only 3 or 5) 
     * @return MasterNodeNum Abandoned. Please use NodeInfoList.
Number of dedicated primary nodes (supports only 3 or 5)
     */
    public Long getMasterNodeNum() {
        return this.MasterNodeNum;
    }

    /**
     * Set Abandoned. Please use NodeInfoList.
Number of dedicated primary nodes (supports only 3 or 5)
     * @param MasterNodeNum Abandoned. Please use NodeInfoList.
Number of dedicated primary nodes (supports only 3 or 5)
     */
    public void setMasterNodeNum(Long MasterNodeNum) {
        this.MasterNodeNum = MasterNodeNum;
    }

    /**
     * Get Abandoned. Please use NodeInfoList.
Dedicated primary node specification<li>ES.S1.SMALL2: 1-core 2GB</li><li>ES.S1.MEDIUM4: 2-core 4GB</li><li>ES.S1.MEDIUM8: 2-core 8GB</li><li>ES.S1.LARGE16: 4-core 16GB</li><li>ES.S1.2XLARGE32: 8-core 32GB</li><li>ES.S1.4XLARGE32: 16-core 32GB</li><li>ES.S1.4XLARGE64: 16-core 64GB</li> 
     * @return MasterNodeType Abandoned. Please use NodeInfoList.
Dedicated primary node specification<li>ES.S1.SMALL2: 1-core 2GB</li><li>ES.S1.MEDIUM4: 2-core 4GB</li><li>ES.S1.MEDIUM8: 2-core 8GB</li><li>ES.S1.LARGE16: 4-core 16GB</li><li>ES.S1.2XLARGE32: 8-core 32GB</li><li>ES.S1.4XLARGE32: 16-core 32GB</li><li>ES.S1.4XLARGE64: 16-core 64GB</li>
     */
    public String getMasterNodeType() {
        return this.MasterNodeType;
    }

    /**
     * Set Abandoned. Please use NodeInfoList.
Dedicated primary node specification<li>ES.S1.SMALL2: 1-core 2GB</li><li>ES.S1.MEDIUM4: 2-core 4GB</li><li>ES.S1.MEDIUM8: 2-core 8GB</li><li>ES.S1.LARGE16: 4-core 16GB</li><li>ES.S1.2XLARGE32: 8-core 32GB</li><li>ES.S1.4XLARGE32: 16-core 32GB</li><li>ES.S1.4XLARGE64: 16-core 64GB</li>
     * @param MasterNodeType Abandoned. Please use NodeInfoList.
Dedicated primary node specification<li>ES.S1.SMALL2: 1-core 2GB</li><li>ES.S1.MEDIUM4: 2-core 4GB</li><li>ES.S1.MEDIUM8: 2-core 8GB</li><li>ES.S1.LARGE16: 4-core 16GB</li><li>ES.S1.2XLARGE32: 8-core 32GB</li><li>ES.S1.4XLARGE32: 16-core 32GB</li><li>ES.S1.4XLARGE64: 16-core 64GB</li>
     */
    public void setMasterNodeType(String MasterNodeType) {
        this.MasterNodeType = MasterNodeType;
    }

    /**
     * Get Abandoned. Please use NodeInfoList.
Dedicated primary node disk size (in GB. The system default configuration is 50 GB. Customization is temporarily not supported.) 
     * @return MasterNodeDiskSize Abandoned. Please use NodeInfoList.
Dedicated primary node disk size (in GB. The system default configuration is 50 GB. Customization is temporarily not supported.)
     */
    public Long getMasterNodeDiskSize() {
        return this.MasterNodeDiskSize;
    }

    /**
     * Set Abandoned. Please use NodeInfoList.
Dedicated primary node disk size (in GB. The system default configuration is 50 GB. Customization is temporarily not supported.)
     * @param MasterNodeDiskSize Abandoned. Please use NodeInfoList.
Dedicated primary node disk size (in GB. The system default configuration is 50 GB. Customization is temporarily not supported.)
     */
    public void setMasterNodeDiskSize(Long MasterNodeDiskSize) {
        this.MasterNodeDiskSize = MasterNodeDiskSize;
    }

    /**
     * Get Whether to force restart when updating the configuration <li>true: force restart</li><li>false: do not force restart</li>Currently, this needs to be set only when updating EsConfig. The default value is false. 
     * @return ForceRestart Whether to force restart when updating the configuration <li>true: force restart</li><li>false: do not force restart</li>Currently, this needs to be set only when updating EsConfig. The default value is false.
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set Whether to force restart when updating the configuration <li>true: force restart</li><li>false: do not force restart</li>Currently, this needs to be set only when updating EsConfig. The default value is false.
     * @param ForceRestart Whether to force restart when updating the configuration <li>true: force restart</li><li>false: do not force restart</li>Currently, this needs to be set only when updating EsConfig. The default value is false.
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get COS auto backup information 
     * @return CosBackup COS auto backup information
     */
    public CosBackup getCosBackup() {
        return this.CosBackup;
    }

    /**
     * Set COS auto backup information
     * @param CosBackup COS auto backup information
     */
    public void setCosBackup(CosBackup CosBackup) {
        this.CosBackup = CosBackup;
    }

    /**
     * Get Node information list. You can transmit only the node to be updated and its corresponding specification information. Supported operations include <li>modifying the count of a node type</li><li>modifying the node specification and disk size of a node type</li><li>adding a node type (you need to simultaneously specify the node type, count, specification, disk, and other information)</li>. You can perform only one of the above operations at a time, and the disk type cannot be modified. 
     * @return NodeInfoList Node information list. You can transmit only the node to be updated and its corresponding specification information. Supported operations include <li>modifying the count of a node type</li><li>modifying the node specification and disk size of a node type</li><li>adding a node type (you need to simultaneously specify the node type, count, specification, disk, and other information)</li>. You can perform only one of the above operations at a time, and the disk type cannot be modified.
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set Node information list. You can transmit only the node to be updated and its corresponding specification information. Supported operations include <li>modifying the count of a node type</li><li>modifying the node specification and disk size of a node type</li><li>adding a node type (you need to simultaneously specify the node type, count, specification, disk, and other information)</li>. You can perform only one of the above operations at a time, and the disk type cannot be modified.
     * @param NodeInfoList Node information list. You can transmit only the node to be updated and its corresponding specification information. Supported operations include <li>modifying the count of a node type</li><li>modifying the node specification and disk size of a node type</li><li>adding a node type (you need to simultaneously specify the node type, count, specification, disk, and other information)</li>. You can perform only one of the above operations at a time, and the disk type cannot be modified.
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get Public access status of the ES cluster
OPEN: enabled.
-CLOSE: disabled. 
     * @return PublicAccess Public access status of the ES cluster
OPEN: enabled.
-CLOSE: disabled.
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set Public access status of the ES cluster
OPEN: enabled.
-CLOSE: disabled.
     * @param PublicAccess Public access status of the ES cluster
OPEN: enabled.
-CLOSE: disabled.
     */
    public void setPublicAccess(String PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get Public network access control list 
     * @return EsPublicAcl Public network access control list
     */
    public EsPublicAcl getEsPublicAcl() {
        return this.EsPublicAcl;
    }

    /**
     * Set Public network access control list
     * @param EsPublicAcl Public network access control list
     */
    public void setEsPublicAcl(EsPublicAcl EsPublicAcl) {
        this.EsPublicAcl = EsPublicAcl;
    }

    /**
     * Get Kibana public access status
OPEN: enabled.
-CLOSE: disabled. 
     * @return KibanaPublicAccess Kibana public access status
OPEN: enabled.
-CLOSE: disabled.
     */
    public String getKibanaPublicAccess() {
        return this.KibanaPublicAccess;
    }

    /**
     * Set Kibana public access status
OPEN: enabled.
-CLOSE: disabled.
     * @param KibanaPublicAccess Kibana public access status
OPEN: enabled.
-CLOSE: disabled.
     */
    public void setKibanaPublicAccess(String KibanaPublicAccess) {
        this.KibanaPublicAccess = KibanaPublicAccess;
    }

    /**
     * Get Kibana internal access status
OPEN: enabled.
-CLOSE: disabled. 
     * @return KibanaPrivateAccess Kibana internal access status
OPEN: enabled.
-CLOSE: disabled.
     */
    public String getKibanaPrivateAccess() {
        return this.KibanaPrivateAccess;
    }

    /**
     * Set Kibana internal access status
OPEN: enabled.
-CLOSE: disabled.
     * @param KibanaPrivateAccess Kibana internal access status
OPEN: enabled.
-CLOSE: disabled.
     */
    public void setKibanaPrivateAccess(String KibanaPrivateAccess) {
        this.KibanaPrivateAccess = KibanaPrivateAccess;
    }

    /**
     * Get Turn on or off user authentication for the basic version of ES 6.8 and above 
     * @return BasicSecurityType Turn on or off user authentication for the basic version of ES 6.8 and above
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set Turn on or off user authentication for the basic version of ES 6.8 and above
     * @param BasicSecurityType Turn on or off user authentication for the basic version of ES 6.8 and above
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Get Kibana private network port 
     * @return KibanaPrivatePort Kibana private network port
     */
    public Long getKibanaPrivatePort() {
        return this.KibanaPrivatePort;
    }

    /**
     * Set Kibana private network port
     * @param KibanaPrivatePort Kibana private network port
     */
    public void setKibanaPrivatePort(Long KibanaPrivatePort) {
        this.KibanaPrivatePort = KibanaPrivatePort;
    }

    /**
     * Get 0: Scale out via blue-green change without restarting the cluster (default) 1: Scale out by unmounting disks with a cluster rolling restart 
     * @return ScaleType 0: Scale out via blue-green change without restarting the cluster (default) 1: Scale out by unmounting disks with a cluster rolling restart
     */
    public Long getScaleType() {
        return this.ScaleType;
    }

    /**
     * Set 0: Scale out via blue-green change without restarting the cluster (default) 1: Scale out by unmounting disks with a cluster rolling restart
     * @param ScaleType 0: Scale out via blue-green change without restarting the cluster (default) 1: Scale out by unmounting disks with a cluster rolling restart
     */
    public void setScaleType(Long ScaleType) {
        this.ScaleType = ScaleType;
    }

    /**
     * Get Multi-AZ deployment 
     * @return MultiZoneInfo Multi-AZ deployment
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set Multi-AZ deployment
     * @param MultiZoneInfo Multi-AZ deployment
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get Scenario template type. -1: not enabled. 1: common. 2: log. 3: search 
     * @return SceneType Scenario template type. -1: not enabled. 1: common. 2: log. 3: search
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set Scenario template type. -1: not enabled. 1: common. 2: log. 3: search
     * @param SceneType Scenario template type. -1: not enabled. 1: common. 2: log. 3: search
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get Kibana configuration item (JSON format string) 
     * @return KibanaConfig Kibana configuration item (JSON format string)
     */
    public String getKibanaConfig() {
        return this.KibanaConfig;
    }

    /**
     * Set Kibana configuration item (JSON format string)
     * @param KibanaConfig Kibana configuration item (JSON format string)
     */
    public void setKibanaConfig(String KibanaConfig) {
        this.KibanaConfig = KibanaConfig;
    }

    /**
     * Get Visualize node configuration 
     * @return WebNodeTypeInfo Visualize node configuration
     */
    public WebNodeTypeInfo getWebNodeTypeInfo() {
        return this.WebNodeTypeInfo;
    }

    /**
     * Set Visualize node configuration
     * @param WebNodeTypeInfo Visualize node configuration
     */
    public void setWebNodeTypeInfo(WebNodeTypeInfo WebNodeTypeInfo) {
        this.WebNodeTypeInfo = WebNodeTypeInfo;
    }

    /**
     * Get Switch to the new network architecture 
     * @return SwitchPrivateLink Switch to the new network architecture
     */
    public String getSwitchPrivateLink() {
        return this.SwitchPrivateLink;
    }

    /**
     * Set Switch to the new network architecture
     * @param SwitchPrivateLink Switch to the new network architecture
     */
    public void setSwitchPrivateLink(String SwitchPrivateLink) {
        this.SwitchPrivateLink = SwitchPrivateLink;
    }

    /**
     * Get Enable Cerebro 
     * @return EnableCerebro Enable Cerebro
     */
    public Boolean getEnableCerebro() {
        return this.EnableCerebro;
    }

    /**
     * Set Enable Cerebro
     * @param EnableCerebro Enable Cerebro
     */
    public void setEnableCerebro(Boolean EnableCerebro) {
        this.EnableCerebro = EnableCerebro;
    }

    /**
     * Get Cerebro public access status
OPEN: enabled.
-CLOSE: disabled. 
     * @return CerebroPublicAccess Cerebro public access status
OPEN: enabled.
-CLOSE: disabled.
     */
    public String getCerebroPublicAccess() {
        return this.CerebroPublicAccess;
    }

    /**
     * Set Cerebro public access status
OPEN: enabled.
-CLOSE: disabled.
     * @param CerebroPublicAccess Cerebro public access status
OPEN: enabled.
-CLOSE: disabled.
     */
    public void setCerebroPublicAccess(String CerebroPublicAccess) {
        this.CerebroPublicAccess = CerebroPublicAccess;
    }

    /**
     * Get Cerebro private network access status
OPEN: enabled.
-CLOSE: disabled. 
     * @return CerebroPrivateAccess Cerebro private network access status
OPEN: enabled.
-CLOSE: disabled.
     */
    public String getCerebroPrivateAccess() {
        return this.CerebroPrivateAccess;
    }

    /**
     * Set Cerebro private network access status
OPEN: enabled.
-CLOSE: disabled.
     * @param CerebroPrivateAccess Cerebro private network access status
OPEN: enabled.
-CLOSE: disabled.
     */
    public void setCerebroPrivateAccess(String CerebroPrivateAccess) {
        this.CerebroPrivateAccess = CerebroPrivateAccess;
    }

    /**
     * Get Newly-added or modified configuration group information 
     * @return EsConfigSet Newly-added or modified configuration group information
     */
    public EsConfigSetInfo getEsConfigSet() {
        return this.EsConfigSet;
    }

    /**
     * Set Newly-added or modified configuration group information
     * @param EsConfigSet Newly-added or modified configuration group information
     */
    public void setEsConfigSet(EsConfigSetInfo EsConfigSet) {
        this.EsConfigSet = EsConfigSet;
    }

    /**
     * Get Maintenance time slot. 
     * @return OperationDuration Maintenance time slot.
     */
    public OperationDurationUpdated getOperationDuration() {
        return this.OperationDuration;
    }

    /**
     * Set Maintenance time slot.
     * @param OperationDuration Maintenance time slot.
     */
    public void setOperationDuration(OperationDurationUpdated OperationDuration) {
        this.OperationDuration = OperationDuration;
    }

    /**
     * Get Whether Alerting public network alert output is enabled:
OPEN: enabled.
-CLOSE: disabled. 
     * @return KibanaAlteringPublicAccess Whether Alerting public network alert output is enabled:
OPEN: enabled.
-CLOSE: disabled.
     */
    public String getKibanaAlteringPublicAccess() {
        return this.KibanaAlteringPublicAccess;
    }

    /**
     * Set Whether Alerting public network alert output is enabled:
OPEN: enabled.
-CLOSE: disabled.
     * @param KibanaAlteringPublicAccess Whether Alerting public network alert output is enabled:
OPEN: enabled.
-CLOSE: disabled.
     */
    public void setKibanaAlteringPublicAccess(String KibanaAlteringPublicAccess) {
        this.KibanaAlteringPublicAccess = KibanaAlteringPublicAccess;
    }

    /**
     * Get Custom domain name of kibana on the private network 
     * @return KibanaPrivateDomain Custom domain name of kibana on the private network
     */
    public String getKibanaPrivateDomain() {
        return this.KibanaPrivateDomain;
    }

    /**
     * Set Custom domain name of kibana on the private network
     * @param KibanaPrivateDomain Custom domain name of kibana on the private network
     */
    public void setKibanaPrivateDomain(String KibanaPrivateDomain) {
        this.KibanaPrivateDomain = KibanaPrivateDomain;
    }

    /**
     * Get Custom domain name of cerebro on the private network 
     * @return CerebroPrivateDomain Custom domain name of cerebro on the private network
     */
    public String getCerebroPrivateDomain() {
        return this.CerebroPrivateDomain;
    }

    /**
     * Set Custom domain name of cerebro on the private network
     * @param CerebroPrivateDomain Custom domain name of cerebro on the private network
     */
    public void setCerebroPrivateDomain(String CerebroPrivateDomain) {
        this.CerebroPrivateDomain = CerebroPrivateDomain;
    }

    /**
     * Get Change to an https cluster. http is selected by default. 
     * @return Protocol Change to an https cluster. http is selected by default.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Change to an https cluster. http is selected by default.
     * @param Protocol Change to an https cluster. http is selected by default.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Outbound access details of the node
 
     * @return OutboundPublicAcls Outbound access details of the node

     */
    public OutboundPublicAcl [] getOutboundPublicAcls() {
        return this.OutboundPublicAcls;
    }

    /**
     * Set Outbound access details of the node

     * @param OutboundPublicAcls Outbound access details of the node

     */
    public void setOutboundPublicAcls(OutboundPublicAcl [] OutboundPublicAcls) {
        this.OutboundPublicAcls = OutboundPublicAcls;
    }

    /**
     * Get Outbound access operations of the node
OPEN
-CLOSE: disabled. 
     * @return OutboundPublicAccess Outbound access operations of the node
OPEN
-CLOSE: disabled.
     */
    public String getOutboundPublicAccess() {
        return this.OutboundPublicAccess;
    }

    /**
     * Set Outbound access operations of the node
OPEN
-CLOSE: disabled.
     * @param OutboundPublicAccess Outbound access operations of the node
OPEN
-CLOSE: disabled.
     */
    public void setOutboundPublicAccess(String OutboundPublicAccess) {
        this.OutboundPublicAccess = OutboundPublicAccess;
    }

    /**
     * Get Parameter for delayed cvm launch 
     * @return CvmDelayOnlineTime Parameter for delayed cvm launch
     */
    public Long getCvmDelayOnlineTime() {
        return this.CvmDelayOnlineTime;
    }

    /**
     * Set Parameter for delayed cvm launch
     * @param CvmDelayOnlineTime Parameter for delayed cvm launch
     */
    public void setCvmDelayOnlineTime(Long CvmDelayOnlineTime) {
        this.CvmDelayOnlineTime = CvmDelayOnlineTime;
    }

    /**
     * Get Number of concurrent shard migrations 
     * @return ShardAllocationConcurrents Number of concurrent shard migrations
     */
    public Long getShardAllocationConcurrents() {
        return this.ShardAllocationConcurrents;
    }

    /**
     * Set Number of concurrent shard migrations
     * @param ShardAllocationConcurrents Number of concurrent shard migrations
     */
    public void setShardAllocationConcurrents(Long ShardAllocationConcurrents) {
        this.ShardAllocationConcurrents = ShardAllocationConcurrents;
    }

    /**
     * Get Shard migration concurrency speed 
     * @return ShardAllocationBytes Shard migration concurrency speed
     */
    public Long getShardAllocationBytes() {
        return this.ShardAllocationBytes;
    }

    /**
     * Set Shard migration concurrency speed
     * @param ShardAllocationBytes Shard migration concurrency speed
     */
    public void setShardAllocationBytes(Long ShardAllocationBytes) {
        this.ShardAllocationBytes = ShardAllocationBytes;
    }

    /**
     * Get Read-write separation mode: -1: not enabled; 1: local read/write separation; 2: remote read/write separation. 
     * @return ReadWriteMode Read-write separation mode: -1: not enabled; 1: local read/write separation; 2: remote read/write separation.
     */
    public Long getReadWriteMode() {
        return this.ReadWriteMode;
    }

    /**
     * Set Read-write separation mode: -1: not enabled; 1: local read/write separation; 2: remote read/write separation.
     * @param ReadWriteMode Read-write separation mode: -1: not enabled; 1: local read/write separation; 2: remote read/write separation.
     */
    public void setReadWriteMode(Long ReadWriteMode) {
        this.ReadWriteMode = ReadWriteMode;
    }

    /**
     * Get Whether to enable the placement group async task 
     * @return EnableScheduleRecoverGroup Whether to enable the placement group async task
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set Whether to enable the placement group async task
     * @param EnableScheduleRecoverGroup Whether to enable the placement group async task
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get Placement group async task maintenance time slot 
     * @return EnableScheduleOperationDuration Placement group async task maintenance time slot
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set Placement group async task maintenance time slot
     * @param EnableScheduleOperationDuration Placement group async task maintenance time slot
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
    }

    /**
     * Get Cluster protection: OPEN: enable, CLOSE: disable 
     * @return EnableDestroyProtection Cluster protection: OPEN: enable, CLOSE: disable
     */
    public String getEnableDestroyProtection() {
        return this.EnableDestroyProtection;
    }

    /**
     * Set Cluster protection: OPEN: enable, CLOSE: disable
     * @param EnableDestroyProtection Cluster protection: OPEN: enable, CLOSE: disable
     */
    public void setEnableDestroyProtection(String EnableDestroyProtection) {
        this.EnableDestroyProtection = EnableDestroyProtection;
    }

    /**
     * Get Auto capacity expansion parameter 
     * @return AutoScaleDiskInfoList Auto capacity expansion parameter
     */
    public AutoScaleDiskInfo [] getAutoScaleDiskInfoList() {
        return this.AutoScaleDiskInfoList;
    }

    /**
     * Set Auto capacity expansion parameter
     * @param AutoScaleDiskInfoList Auto capacity expansion parameter
     */
    public void setAutoScaleDiskInfoList(AutoScaleDiskInfo [] AutoScaleDiskInfoList) {
        this.AutoScaleDiskInfoList = AutoScaleDiskInfoList;
    }

    /**
     * Get Auto-expansion delete parameter 
     * @return AutoScaleDiskDeleteNodeTypeList Auto-expansion delete parameter
     */
    public String [] getAutoScaleDiskDeleteNodeTypeList() {
        return this.AutoScaleDiskDeleteNodeTypeList;
    }

    /**
     * Set Auto-expansion delete parameter
     * @param AutoScaleDiskDeleteNodeTypeList Auto-expansion delete parameter
     */
    public void setAutoScaleDiskDeleteNodeTypeList(String [] AutoScaleDiskDeleteNodeTypeList) {
        this.AutoScaleDiskDeleteNodeTypeList = AutoScaleDiskDeleteNodeTypeList;
    }

    /**
     * Get Other additional configuration, jvm or yml. 
     * @return OtherConfig Other additional configuration, jvm or yml.
     */
    public OtherConfig getOtherConfig() {
        return this.OtherConfig;
    }

    /**
     * Set Other additional configuration, jvm or yml.
     * @param OtherConfig Other additional configuration, jvm or yml.
     */
    public void setOtherConfig(OtherConfig OtherConfig) {
        this.OtherConfig = OtherConfig;
    }

    public UpdateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateInstanceRequest(UpdateInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.EsConfig != null) {
            this.EsConfig = new String(source.EsConfig);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EsAcl != null) {
            this.EsAcl = new EsAcl(source.EsAcl);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.MasterNodeNum != null) {
            this.MasterNodeNum = new Long(source.MasterNodeNum);
        }
        if (source.MasterNodeType != null) {
            this.MasterNodeType = new String(source.MasterNodeType);
        }
        if (source.MasterNodeDiskSize != null) {
            this.MasterNodeDiskSize = new Long(source.MasterNodeDiskSize);
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
        if (source.CosBackup != null) {
            this.CosBackup = new CosBackup(source.CosBackup);
        }
        if (source.NodeInfoList != null) {
            this.NodeInfoList = new NodeInfo[source.NodeInfoList.length];
            for (int i = 0; i < source.NodeInfoList.length; i++) {
                this.NodeInfoList[i] = new NodeInfo(source.NodeInfoList[i]);
            }
        }
        if (source.PublicAccess != null) {
            this.PublicAccess = new String(source.PublicAccess);
        }
        if (source.EsPublicAcl != null) {
            this.EsPublicAcl = new EsPublicAcl(source.EsPublicAcl);
        }
        if (source.KibanaPublicAccess != null) {
            this.KibanaPublicAccess = new String(source.KibanaPublicAccess);
        }
        if (source.KibanaPrivateAccess != null) {
            this.KibanaPrivateAccess = new String(source.KibanaPrivateAccess);
        }
        if (source.BasicSecurityType != null) {
            this.BasicSecurityType = new Long(source.BasicSecurityType);
        }
        if (source.KibanaPrivatePort != null) {
            this.KibanaPrivatePort = new Long(source.KibanaPrivatePort);
        }
        if (source.ScaleType != null) {
            this.ScaleType = new Long(source.ScaleType);
        }
        if (source.MultiZoneInfo != null) {
            this.MultiZoneInfo = new ZoneDetail[source.MultiZoneInfo.length];
            for (int i = 0; i < source.MultiZoneInfo.length; i++) {
                this.MultiZoneInfo[i] = new ZoneDetail(source.MultiZoneInfo[i]);
            }
        }
        if (source.SceneType != null) {
            this.SceneType = new Long(source.SceneType);
        }
        if (source.KibanaConfig != null) {
            this.KibanaConfig = new String(source.KibanaConfig);
        }
        if (source.WebNodeTypeInfo != null) {
            this.WebNodeTypeInfo = new WebNodeTypeInfo(source.WebNodeTypeInfo);
        }
        if (source.SwitchPrivateLink != null) {
            this.SwitchPrivateLink = new String(source.SwitchPrivateLink);
        }
        if (source.EnableCerebro != null) {
            this.EnableCerebro = new Boolean(source.EnableCerebro);
        }
        if (source.CerebroPublicAccess != null) {
            this.CerebroPublicAccess = new String(source.CerebroPublicAccess);
        }
        if (source.CerebroPrivateAccess != null) {
            this.CerebroPrivateAccess = new String(source.CerebroPrivateAccess);
        }
        if (source.EsConfigSet != null) {
            this.EsConfigSet = new EsConfigSetInfo(source.EsConfigSet);
        }
        if (source.OperationDuration != null) {
            this.OperationDuration = new OperationDurationUpdated(source.OperationDuration);
        }
        if (source.KibanaAlteringPublicAccess != null) {
            this.KibanaAlteringPublicAccess = new String(source.KibanaAlteringPublicAccess);
        }
        if (source.KibanaPrivateDomain != null) {
            this.KibanaPrivateDomain = new String(source.KibanaPrivateDomain);
        }
        if (source.CerebroPrivateDomain != null) {
            this.CerebroPrivateDomain = new String(source.CerebroPrivateDomain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.OutboundPublicAcls != null) {
            this.OutboundPublicAcls = new OutboundPublicAcl[source.OutboundPublicAcls.length];
            for (int i = 0; i < source.OutboundPublicAcls.length; i++) {
                this.OutboundPublicAcls[i] = new OutboundPublicAcl(source.OutboundPublicAcls[i]);
            }
        }
        if (source.OutboundPublicAccess != null) {
            this.OutboundPublicAccess = new String(source.OutboundPublicAccess);
        }
        if (source.CvmDelayOnlineTime != null) {
            this.CvmDelayOnlineTime = new Long(source.CvmDelayOnlineTime);
        }
        if (source.ShardAllocationConcurrents != null) {
            this.ShardAllocationConcurrents = new Long(source.ShardAllocationConcurrents);
        }
        if (source.ShardAllocationBytes != null) {
            this.ShardAllocationBytes = new Long(source.ShardAllocationBytes);
        }
        if (source.ReadWriteMode != null) {
            this.ReadWriteMode = new Long(source.ReadWriteMode);
        }
        if (source.EnableScheduleRecoverGroup != null) {
            this.EnableScheduleRecoverGroup = new Boolean(source.EnableScheduleRecoverGroup);
        }
        if (source.EnableScheduleOperationDuration != null) {
            this.EnableScheduleOperationDuration = new EnableScheduleOperationDuration(source.EnableScheduleOperationDuration);
        }
        if (source.EnableDestroyProtection != null) {
            this.EnableDestroyProtection = new String(source.EnableDestroyProtection);
        }
        if (source.AutoScaleDiskInfoList != null) {
            this.AutoScaleDiskInfoList = new AutoScaleDiskInfo[source.AutoScaleDiskInfoList.length];
            for (int i = 0; i < source.AutoScaleDiskInfoList.length; i++) {
                this.AutoScaleDiskInfoList[i] = new AutoScaleDiskInfo(source.AutoScaleDiskInfoList[i]);
            }
        }
        if (source.AutoScaleDiskDeleteNodeTypeList != null) {
            this.AutoScaleDiskDeleteNodeTypeList = new String[source.AutoScaleDiskDeleteNodeTypeList.length];
            for (int i = 0; i < source.AutoScaleDiskDeleteNodeTypeList.length; i++) {
                this.AutoScaleDiskDeleteNodeTypeList[i] = new String(source.AutoScaleDiskDeleteNodeTypeList[i]);
            }
        }
        if (source.OtherConfig != null) {
            this.OtherConfig = new OtherConfig(source.OtherConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "EsConfig", this.EsConfig);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "EsAcl.", this.EsAcl);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "MasterNodeNum", this.MasterNodeNum);
        this.setParamSimple(map, prefix + "MasterNodeType", this.MasterNodeType);
        this.setParamSimple(map, prefix + "MasterNodeDiskSize", this.MasterNodeDiskSize);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);
        this.setParamObj(map, prefix + "CosBackup.", this.CosBackup);
        this.setParamArrayObj(map, prefix + "NodeInfoList.", this.NodeInfoList);
        this.setParamSimple(map, prefix + "PublicAccess", this.PublicAccess);
        this.setParamObj(map, prefix + "EsPublicAcl.", this.EsPublicAcl);
        this.setParamSimple(map, prefix + "KibanaPublicAccess", this.KibanaPublicAccess);
        this.setParamSimple(map, prefix + "KibanaPrivateAccess", this.KibanaPrivateAccess);
        this.setParamSimple(map, prefix + "BasicSecurityType", this.BasicSecurityType);
        this.setParamSimple(map, prefix + "KibanaPrivatePort", this.KibanaPrivatePort);
        this.setParamSimple(map, prefix + "ScaleType", this.ScaleType);
        this.setParamArrayObj(map, prefix + "MultiZoneInfo.", this.MultiZoneInfo);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "KibanaConfig", this.KibanaConfig);
        this.setParamObj(map, prefix + "WebNodeTypeInfo.", this.WebNodeTypeInfo);
        this.setParamSimple(map, prefix + "SwitchPrivateLink", this.SwitchPrivateLink);
        this.setParamSimple(map, prefix + "EnableCerebro", this.EnableCerebro);
        this.setParamSimple(map, prefix + "CerebroPublicAccess", this.CerebroPublicAccess);
        this.setParamSimple(map, prefix + "CerebroPrivateAccess", this.CerebroPrivateAccess);
        this.setParamObj(map, prefix + "EsConfigSet.", this.EsConfigSet);
        this.setParamObj(map, prefix + "OperationDuration.", this.OperationDuration);
        this.setParamSimple(map, prefix + "KibanaAlteringPublicAccess", this.KibanaAlteringPublicAccess);
        this.setParamSimple(map, prefix + "KibanaPrivateDomain", this.KibanaPrivateDomain);
        this.setParamSimple(map, prefix + "CerebroPrivateDomain", this.CerebroPrivateDomain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "OutboundPublicAcls.", this.OutboundPublicAcls);
        this.setParamSimple(map, prefix + "OutboundPublicAccess", this.OutboundPublicAccess);
        this.setParamSimple(map, prefix + "CvmDelayOnlineTime", this.CvmDelayOnlineTime);
        this.setParamSimple(map, prefix + "ShardAllocationConcurrents", this.ShardAllocationConcurrents);
        this.setParamSimple(map, prefix + "ShardAllocationBytes", this.ShardAllocationBytes);
        this.setParamSimple(map, prefix + "ReadWriteMode", this.ReadWriteMode);
        this.setParamSimple(map, prefix + "EnableScheduleRecoverGroup", this.EnableScheduleRecoverGroup);
        this.setParamObj(map, prefix + "EnableScheduleOperationDuration.", this.EnableScheduleOperationDuration);
        this.setParamSimple(map, prefix + "EnableDestroyProtection", this.EnableDestroyProtection);
        this.setParamArrayObj(map, prefix + "AutoScaleDiskInfoList.", this.AutoScaleDiskInfoList);
        this.setParamArraySimple(map, prefix + "AutoScaleDiskDeleteNodeTypeList.", this.AutoScaleDiskDeleteNodeTypeList);
        this.setParamObj(map, prefix + "OtherConfig.", this.OtherConfig);

    }
}

