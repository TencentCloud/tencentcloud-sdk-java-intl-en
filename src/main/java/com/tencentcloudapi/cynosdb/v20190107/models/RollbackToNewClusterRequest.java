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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackToNewClusterRequest extends AbstractModel {

    /**
    * <p>AZ.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>During rollback, input the source cluster ID to search for the source poolId</p>
    */
    @SerializedName("OriginalClusterId")
    @Expose
    private String OriginalClusterId;

    /**
    * <p>VPC network ID</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>Subnet ID</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>Cluster name, length less than 64 characters. Each character value ranges from uppercase/lowercase letters, digits, to special symbols ('-', '_', '.').</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Snapshot rollback means snapshotId; point-in-time rollback means queryId. A value of 0 indicates requirement to judge whether the time point is valid.</p>
    */
    @SerializedName("RollbackId")
    @Expose
    private Long RollbackId;

    /**
    * <p>Point-in-time rollback, specified time; snapshot rollback, snapshot time</p>
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * <p>Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>tag Array information that should be bound for cluster creation</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>DB type<br>Selectable when DbType is MYSQL (default NORMAL):</p><li>NORMAL</li><li>SERVERLESS</li>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>Required when DbMode is SEVERLESS<br>Minimum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>Required when DbMode is SEVERLESS:<br>Maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>When DbMode is SEVERLESS, whether to automatically pause within specified clusters. Optional range</p><li>yes</li><li>no</li>Default value: yes
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * <p>When DbMode is SEVERLESS, specify the delay for Cluster Auto-Pause in seconds, optional range [600,691200]<br>Default value: 600</p>
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * <p>Security group id array</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>Alarm policy Id array</p>
    */
    @SerializedName("AlarmPolicyIds")
    @Expose
    private String [] AlarmPolicyIds;

    /**
    * <p>Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names, 1-case-insensitive, 0-case-sensitive.</p>
    */
    @SerializedName("ClusterParams")
    @Expose
    private ParamItem [] ClusterParams;

    /**
    * <p>Parameter template ID. The parameter template ID can be obtained through querying parameter template information DescribeParamTemplates.</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * <p>Instance initialization configuration information is mainly used to select different specification instances during cluster purchase.</p>
    */
    @SerializedName("InstanceInitInfos")
    @Expose
    private InstanceInitInfo [] InstanceInitInfos;

    /**
    * <p>0-Place order and pay 1-Placing order</p>
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * <p>Pay-per-compute-node model: 0-Pay-As-You-Go, 1-Prepayment</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Time</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>Unit</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>Rollback database info</p>
    */
    @SerializedName("RollbackDatabases")
    @Expose
    private RollbackDatabase [] RollbackDatabases;

    /**
    * <p>Roll back table information</p>
    */
    @SerializedName("RollbackTables")
    @Expose
    private RollbackTable [] RollbackTables;

    /**
    * <p>Original ro instance information</p>
    */
    @SerializedName("OriginalROInstanceList")
    @Expose
    private String [] OriginalROInstanceList;

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Whether to enable archive. Optional range <li>yes</li><li>no</li> Default value: yes</p>
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
    * <p>Whether to restore from the saved backup</p>
    */
    @SerializedName("FromSaveBackup")
    @Expose
    private Boolean FromSaveBackup;

    /**
     * Get <p>AZ.</p> 
     * @return Zone <p>AZ.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ.</p>
     * @param Zone <p>AZ.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>During rollback, input the source cluster ID to search for the source poolId</p> 
     * @return OriginalClusterId <p>During rollback, input the source cluster ID to search for the source poolId</p>
     */
    public String getOriginalClusterId() {
        return this.OriginalClusterId;
    }

    /**
     * Set <p>During rollback, input the source cluster ID to search for the source poolId</p>
     * @param OriginalClusterId <p>During rollback, input the source cluster ID to search for the source poolId</p>
     */
    public void setOriginalClusterId(String OriginalClusterId) {
        this.OriginalClusterId = OriginalClusterId;
    }

    /**
     * Get <p>VPC network ID</p> 
     * @return UniqVpcId <p>VPC network ID</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>VPC network ID</p>
     * @param UniqVpcId <p>VPC network ID</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>Subnet ID</p> 
     * @return UniqSubnetId <p>Subnet ID</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>Subnet ID</p>
     * @param UniqSubnetId <p>Subnet ID</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>Cluster name, length less than 64 characters. Each character value ranges from uppercase/lowercase letters, digits, to special symbols ('-', '_', '.').</p> 
     * @return ClusterName <p>Cluster name, length less than 64 characters. Each character value ranges from uppercase/lowercase letters, digits, to special symbols ('-', '_', '.').</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name, length less than 64 characters. Each character value ranges from uppercase/lowercase letters, digits, to special symbols ('-', '_', '.').</p>
     * @param ClusterName <p>Cluster name, length less than 64 characters. Each character value ranges from uppercase/lowercase letters, digits, to special symbols ('-', '_', '.').</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Snapshot rollback means snapshotId; point-in-time rollback means queryId. A value of 0 indicates requirement to judge whether the time point is valid.</p> 
     * @return RollbackId <p>Snapshot rollback means snapshotId; point-in-time rollback means queryId. A value of 0 indicates requirement to judge whether the time point is valid.</p>
     */
    public Long getRollbackId() {
        return this.RollbackId;
    }

    /**
     * Set <p>Snapshot rollback means snapshotId; point-in-time rollback means queryId. A value of 0 indicates requirement to judge whether the time point is valid.</p>
     * @param RollbackId <p>Snapshot rollback means snapshotId; point-in-time rollback means queryId. A value of 0 indicates requirement to judge whether the time point is valid.</p>
     */
    public void setRollbackId(Long RollbackId) {
        this.RollbackId = RollbackId;
    }

    /**
     * Get <p>Point-in-time rollback, specified time; snapshot rollback, snapshot time</p> 
     * @return ExpectTime <p>Point-in-time rollback, specified time; snapshot rollback, snapshot time</p>
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set <p>Point-in-time rollback, specified time; snapshot rollback, snapshot time</p>
     * @param ExpectTime <p>Point-in-time rollback, specified time; snapshot rollback, snapshot time</p>
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get <p>Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.</p> 
     * @return AutoVoucher <p>Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.</p>
     * @param AutoVoucher <p>Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>tag Array information that should be bound for cluster creation</p> 
     * @return ResourceTags <p>tag Array information that should be bound for cluster creation</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>tag Array information that should be bound for cluster creation</p>
     * @param ResourceTags <p>tag Array information that should be bound for cluster creation</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>DB type<br>Selectable when DbType is MYSQL (default NORMAL):</p><li>NORMAL</li><li>SERVERLESS</li> 
     * @return DbMode <p>DB type<br>Selectable when DbType is MYSQL (default NORMAL):</p><li>NORMAL</li><li>SERVERLESS</li>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>DB type<br>Selectable when DbType is MYSQL (default NORMAL):</p><li>NORMAL</li><li>SERVERLESS</li>
     * @param DbMode <p>DB type<br>Selectable when DbType is MYSQL (default NORMAL):</p><li>NORMAL</li><li>SERVERLESS</li>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>Required when DbMode is SEVERLESS<br>Minimum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs</p> 
     * @return MinCpu <p>Required when DbMode is SEVERLESS<br>Minimum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>Required when DbMode is SEVERLESS<br>Minimum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs</p>
     * @param MinCpu <p>Required when DbMode is SEVERLESS<br>Minimum value of cpu. For optional range, see API response of DescribeServerlessInstanceSpecs</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>Required when DbMode is SEVERLESS:<br>Maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p> 
     * @return MaxCpu <p>Required when DbMode is SEVERLESS:<br>Maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>Required when DbMode is SEVERLESS:<br>Maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
     * @param MaxCpu <p>Required when DbMode is SEVERLESS:<br>Maximum value of cpu. For the optional range, see the API response of DescribeServerlessInstanceSpecs.</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>When DbMode is SEVERLESS, whether to automatically pause within specified clusters. Optional range</p><li>yes</li><li>no</li>Default value: yes 
     * @return AutoPause <p>When DbMode is SEVERLESS, whether to automatically pause within specified clusters. Optional range</p><li>yes</li><li>no</li>Default value: yes
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set <p>When DbMode is SEVERLESS, whether to automatically pause within specified clusters. Optional range</p><li>yes</li><li>no</li>Default value: yes
     * @param AutoPause <p>When DbMode is SEVERLESS, whether to automatically pause within specified clusters. Optional range</p><li>yes</li><li>no</li>Default value: yes
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get <p>When DbMode is SEVERLESS, specify the delay for Cluster Auto-Pause in seconds, optional range [600,691200]<br>Default value: 600</p> 
     * @return AutoPauseDelay <p>When DbMode is SEVERLESS, specify the delay for Cluster Auto-Pause in seconds, optional range [600,691200]<br>Default value: 600</p>
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set <p>When DbMode is SEVERLESS, specify the delay for Cluster Auto-Pause in seconds, optional range [600,691200]<br>Default value: 600</p>
     * @param AutoPauseDelay <p>When DbMode is SEVERLESS, specify the delay for Cluster Auto-Pause in seconds, optional range [600,691200]<br>Default value: 600</p>
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get <p>Security group id array</p> 
     * @return SecurityGroupIds <p>Security group id array</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>Security group id array</p>
     * @param SecurityGroupIds <p>Security group id array</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>Alarm policy Id array</p> 
     * @return AlarmPolicyIds <p>Alarm policy Id array</p>
     */
    public String [] getAlarmPolicyIds() {
        return this.AlarmPolicyIds;
    }

    /**
     * Set <p>Alarm policy Id array</p>
     * @param AlarmPolicyIds <p>Alarm policy Id array</p>
     */
    public void setAlarmPolicyIds(String [] AlarmPolicyIds) {
        this.AlarmPolicyIds = AlarmPolicyIds;
    }

    /**
     * Get <p>Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names, 1-case-insensitive, 0-case-sensitive.</p> 
     * @return ClusterParams <p>Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names, 1-case-insensitive, 0-case-sensitive.</p>
     */
    public ParamItem [] getClusterParams() {
        return this.ClusterParams;
    }

    /**
     * Set <p>Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names, 1-case-insensitive, 0-case-sensitive.</p>
     * @param ClusterParams <p>Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names, 1-case-insensitive, 0-case-sensitive.</p>
     */
    public void setClusterParams(ParamItem [] ClusterParams) {
        this.ClusterParams = ClusterParams;
    }

    /**
     * Get <p>Parameter template ID. The parameter template ID can be obtained through querying parameter template information DescribeParamTemplates.</p> 
     * @return ParamTemplateId <p>Parameter template ID. The parameter template ID can be obtained through querying parameter template information DescribeParamTemplates.</p>
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>Parameter template ID. The parameter template ID can be obtained through querying parameter template information DescribeParamTemplates.</p>
     * @param ParamTemplateId <p>Parameter template ID. The parameter template ID can be obtained through querying parameter template information DescribeParamTemplates.</p>
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>Instance initialization configuration information is mainly used to select different specification instances during cluster purchase.</p> 
     * @return InstanceInitInfos <p>Instance initialization configuration information is mainly used to select different specification instances during cluster purchase.</p>
     */
    public InstanceInitInfo [] getInstanceInitInfos() {
        return this.InstanceInitInfos;
    }

    /**
     * Set <p>Instance initialization configuration information is mainly used to select different specification instances during cluster purchase.</p>
     * @param InstanceInitInfos <p>Instance initialization configuration information is mainly used to select different specification instances during cluster purchase.</p>
     */
    public void setInstanceInitInfos(InstanceInitInfo [] InstanceInitInfos) {
        this.InstanceInitInfos = InstanceInitInfos;
    }

    /**
     * Get <p>0-Place order and pay 1-Placing order</p> 
     * @return DealMode <p>0-Place order and pay 1-Placing order</p>
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set <p>0-Place order and pay 1-Placing order</p>
     * @param DealMode <p>0-Place order and pay 1-Placing order</p>
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get <p>Pay-per-compute-node model: 0-Pay-As-You-Go, 1-Prepayment</p> 
     * @return PayMode <p>Pay-per-compute-node model: 0-Pay-As-You-Go, 1-Prepayment</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Pay-per-compute-node model: 0-Pay-As-You-Go, 1-Prepayment</p>
     * @param PayMode <p>Pay-per-compute-node model: 0-Pay-As-You-Go, 1-Prepayment</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Time</p> 
     * @return TimeSpan <p>Time</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>Time</p>
     * @param TimeSpan <p>Time</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>Unit</p> 
     * @return TimeUnit <p>Unit</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>Unit</p>
     * @param TimeUnit <p>Unit</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>Rollback database info</p> 
     * @return RollbackDatabases <p>Rollback database info</p>
     */
    public RollbackDatabase [] getRollbackDatabases() {
        return this.RollbackDatabases;
    }

    /**
     * Set <p>Rollback database info</p>
     * @param RollbackDatabases <p>Rollback database info</p>
     */
    public void setRollbackDatabases(RollbackDatabase [] RollbackDatabases) {
        this.RollbackDatabases = RollbackDatabases;
    }

    /**
     * Get <p>Roll back table information</p> 
     * @return RollbackTables <p>Roll back table information</p>
     */
    public RollbackTable [] getRollbackTables() {
        return this.RollbackTables;
    }

    /**
     * Set <p>Roll back table information</p>
     * @param RollbackTables <p>Roll back table information</p>
     */
    public void setRollbackTables(RollbackTable [] RollbackTables) {
        this.RollbackTables = RollbackTables;
    }

    /**
     * Get <p>Original ro instance information</p> 
     * @return OriginalROInstanceList <p>Original ro instance information</p>
     */
    public String [] getOriginalROInstanceList() {
        return this.OriginalROInstanceList;
    }

    /**
     * Set <p>Original ro instance information</p>
     * @param OriginalROInstanceList <p>Original ro instance information</p>
     */
    public void setOriginalROInstanceList(String [] OriginalROInstanceList) {
        this.OriginalROInstanceList = OriginalROInstanceList;
    }

    /**
     * Get <p>Project ID.</p> 
     * @return ProjectId <p>Project ID.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID.</p>
     * @param ProjectId <p>Project ID.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Whether to enable archive. Optional range <li>yes</li><li>no</li> Default value: yes</p> 
     * @return AutoArchive <p>Whether to enable archive. Optional range <li>yes</li><li>no</li> Default value: yes</p>
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set <p>Whether to enable archive. Optional range <li>yes</li><li>no</li> Default value: yes</p>
     * @param AutoArchive <p>Whether to enable archive. Optional range <li>yes</li><li>no</li> Default value: yes</p>
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
    }

    /**
     * Get <p>Whether to restore from the saved backup</p> 
     * @return FromSaveBackup <p>Whether to restore from the saved backup</p>
     */
    public Boolean getFromSaveBackup() {
        return this.FromSaveBackup;
    }

    /**
     * Set <p>Whether to restore from the saved backup</p>
     * @param FromSaveBackup <p>Whether to restore from the saved backup</p>
     */
    public void setFromSaveBackup(Boolean FromSaveBackup) {
        this.FromSaveBackup = FromSaveBackup;
    }

    public RollbackToNewClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackToNewClusterRequest(RollbackToNewClusterRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.OriginalClusterId != null) {
            this.OriginalClusterId = new String(source.OriginalClusterId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.RollbackId != null) {
            this.RollbackId = new Long(source.RollbackId);
        }
        if (source.ExpectTime != null) {
            this.ExpectTime = new String(source.ExpectTime);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.AutoPause != null) {
            this.AutoPause = new String(source.AutoPause);
        }
        if (source.AutoPauseDelay != null) {
            this.AutoPauseDelay = new Long(source.AutoPauseDelay);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AlarmPolicyIds != null) {
            this.AlarmPolicyIds = new String[source.AlarmPolicyIds.length];
            for (int i = 0; i < source.AlarmPolicyIds.length; i++) {
                this.AlarmPolicyIds[i] = new String(source.AlarmPolicyIds[i]);
            }
        }
        if (source.ClusterParams != null) {
            this.ClusterParams = new ParamItem[source.ClusterParams.length];
            for (int i = 0; i < source.ClusterParams.length; i++) {
                this.ClusterParams[i] = new ParamItem(source.ClusterParams[i]);
            }
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.InstanceInitInfos != null) {
            this.InstanceInitInfos = new InstanceInitInfo[source.InstanceInitInfos.length];
            for (int i = 0; i < source.InstanceInitInfos.length; i++) {
                this.InstanceInitInfos[i] = new InstanceInitInfo(source.InstanceInitInfos[i]);
            }
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.RollbackDatabases != null) {
            this.RollbackDatabases = new RollbackDatabase[source.RollbackDatabases.length];
            for (int i = 0; i < source.RollbackDatabases.length; i++) {
                this.RollbackDatabases[i] = new RollbackDatabase(source.RollbackDatabases[i]);
            }
        }
        if (source.RollbackTables != null) {
            this.RollbackTables = new RollbackTable[source.RollbackTables.length];
            for (int i = 0; i < source.RollbackTables.length; i++) {
                this.RollbackTables[i] = new RollbackTable(source.RollbackTables[i]);
            }
        }
        if (source.OriginalROInstanceList != null) {
            this.OriginalROInstanceList = new String[source.OriginalROInstanceList.length];
            for (int i = 0; i < source.OriginalROInstanceList.length; i++) {
                this.OriginalROInstanceList[i] = new String(source.OriginalROInstanceList[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AutoArchive != null) {
            this.AutoArchive = new String(source.AutoArchive);
        }
        if (source.FromSaveBackup != null) {
            this.FromSaveBackup = new Boolean(source.FromSaveBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "OriginalClusterId", this.OriginalClusterId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RollbackId", this.RollbackId);
        this.setParamSimple(map, prefix + "ExpectTime", this.ExpectTime);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseDelay", this.AutoPauseDelay);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "AlarmPolicyIds.", this.AlarmPolicyIds);
        this.setParamArrayObj(map, prefix + "ClusterParams.", this.ClusterParams);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamArrayObj(map, prefix + "InstanceInitInfos.", this.InstanceInitInfos);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamArrayObj(map, prefix + "RollbackDatabases.", this.RollbackDatabases);
        this.setParamArrayObj(map, prefix + "RollbackTables.", this.RollbackTables);
        this.setParamArraySimple(map, prefix + "OriginalROInstanceList.", this.OriginalROInstanceList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoArchive", this.AutoArchive);
        this.setParamSimple(map, prefix + "FromSaveBackup", this.FromSaveBackup);

    }
}

