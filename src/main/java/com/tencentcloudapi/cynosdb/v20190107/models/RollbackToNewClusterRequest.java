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
    * AZ.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * During rollback, pass in the source cluster ID to find the source pool ID.
    */
    @SerializedName("OriginalClusterId")
    @Expose
    private String OriginalClusterId;

    /**
    * VPC ID.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Subnet ID.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * The cluster name should contain fewer than 64 characters. Valid values for each character: uppercase/lowercase letters, digits, and special characters ('-', '_', and '.').
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Rolls back by snapshot, which indicates snapshotId; rolls back by time point, which indicates queryId. When the value of queryId is 0, it indicates that the validity of the time point needs to be verified.
    */
    @SerializedName("RollbackId")
    @Expose
    private Long RollbackId;

    /**
    * Rolls back by time point, which indicates the specified time; rolls back by snapshot, which indicates the snapshot time.
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * Whether to select promo vouchers automatically. 1: yes; 0: no. The default value is 0.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Information about the tag array to be bound during cluster creation.
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Database type. When the value of DbType is MYSQL, the valid values are NORMAL and SERVERLESS (the default value is NORMAL).
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * This parameter is required when the value of DbMode is SEVERLESS. For the settings of the minimum CPU value, refer to the value returned by the DescribeServerlessInstanceSpecs API for the valid value.
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * This parameter is required when the value of DbMode is SEVERLESS. For the settings of the maximum CPU value, refer to the value returned by the DescribeServerlessInstanceSpecs API for the valid value.
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * Specifies whether the cluster is automatically paused when the value of DbMode is SEVERLESS. Valid values: yes; no. The default value is yes.
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * Specifies the delay for automatic cluster pause (in seconds) when the value of DbMode is SEVERLESS. Value range: [600, 691200]. The default value is 600.
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * Security group ID array.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Alarm policy ID array.
    */
    @SerializedName("AlarmPolicyIds")
    @Expose
    private String [] AlarmPolicyIds;

    /**
    * Parameter array. The character_set_server (utf8 | latin1 | gbk | utf8mb4) is currently supported. lower_case_table_names: 1 - case-insensitive; 0 - case-sensitive.
    */
    @SerializedName("ClusterParams")
    @Expose
    private ParamItem [] ClusterParams;

    /**
    * Parameter template ID, which can be obtained through the DescribeParamTemplates API.
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * Instance initialization configuration information, which is mainly used for selecting different instance specifications during cluster purchase.
    */
    @SerializedName("InstanceInitInfos")
    @Expose
    private InstanceInitInfo [] InstanceInitInfos;

    /**
    * 0 - place an order and pay; 1 - place an order.
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * Compute node billing mode: 0 - pay-as-you-go; 1 - prepaid.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Time.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Unit.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Rollback database information.
    */
    @SerializedName("RollbackDatabases")
    @Expose
    private RollbackDatabase [] RollbackDatabases;

    /**
    * Rollback table information.
    */
    @SerializedName("RollbackTables")
    @Expose
    private RollbackTable [] RollbackTables;

    /**
    * Source read-only instance information.
    */
    @SerializedName("OriginalROInstanceList")
    @Expose
    private String [] OriginalROInstanceList;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Whether to enable archiving. Valid values: yes; no. The default value is yes.
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
     * Get AZ. 
     * @return Zone AZ.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ.
     * @param Zone AZ.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get During rollback, pass in the source cluster ID to find the source pool ID. 
     * @return OriginalClusterId During rollback, pass in the source cluster ID to find the source pool ID.
     */
    public String getOriginalClusterId() {
        return this.OriginalClusterId;
    }

    /**
     * Set During rollback, pass in the source cluster ID to find the source pool ID.
     * @param OriginalClusterId During rollback, pass in the source cluster ID to find the source pool ID.
     */
    public void setOriginalClusterId(String OriginalClusterId) {
        this.OriginalClusterId = OriginalClusterId;
    }

    /**
     * Get VPC ID. 
     * @return UniqVpcId VPC ID.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID.
     * @param UniqVpcId VPC ID.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Subnet ID. 
     * @return UniqSubnetId Subnet ID.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet ID.
     * @param UniqSubnetId Subnet ID.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get The cluster name should contain fewer than 64 characters. Valid values for each character: uppercase/lowercase letters, digits, and special characters ('-', '_', and '.'). 
     * @return ClusterName The cluster name should contain fewer than 64 characters. Valid values for each character: uppercase/lowercase letters, digits, and special characters ('-', '_', and '.').
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set The cluster name should contain fewer than 64 characters. Valid values for each character: uppercase/lowercase letters, digits, and special characters ('-', '_', and '.').
     * @param ClusterName The cluster name should contain fewer than 64 characters. Valid values for each character: uppercase/lowercase letters, digits, and special characters ('-', '_', and '.').
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Rolls back by snapshot, which indicates snapshotId; rolls back by time point, which indicates queryId. When the value of queryId is 0, it indicates that the validity of the time point needs to be verified. 
     * @return RollbackId Rolls back by snapshot, which indicates snapshotId; rolls back by time point, which indicates queryId. When the value of queryId is 0, it indicates that the validity of the time point needs to be verified.
     */
    public Long getRollbackId() {
        return this.RollbackId;
    }

    /**
     * Set Rolls back by snapshot, which indicates snapshotId; rolls back by time point, which indicates queryId. When the value of queryId is 0, it indicates that the validity of the time point needs to be verified.
     * @param RollbackId Rolls back by snapshot, which indicates snapshotId; rolls back by time point, which indicates queryId. When the value of queryId is 0, it indicates that the validity of the time point needs to be verified.
     */
    public void setRollbackId(Long RollbackId) {
        this.RollbackId = RollbackId;
    }

    /**
     * Get Rolls back by time point, which indicates the specified time; rolls back by snapshot, which indicates the snapshot time. 
     * @return ExpectTime Rolls back by time point, which indicates the specified time; rolls back by snapshot, which indicates the snapshot time.
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set Rolls back by time point, which indicates the specified time; rolls back by snapshot, which indicates the snapshot time.
     * @param ExpectTime Rolls back by time point, which indicates the specified time; rolls back by snapshot, which indicates the snapshot time.
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get Whether to select promo vouchers automatically. 1: yes; 0: no. The default value is 0. 
     * @return AutoVoucher Whether to select promo vouchers automatically. 1: yes; 0: no. The default value is 0.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to select promo vouchers automatically. 1: yes; 0: no. The default value is 0.
     * @param AutoVoucher Whether to select promo vouchers automatically. 1: yes; 0: no. The default value is 0.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Information about the tag array to be bound during cluster creation. 
     * @return ResourceTags Information about the tag array to be bound during cluster creation.
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Information about the tag array to be bound during cluster creation.
     * @param ResourceTags Information about the tag array to be bound during cluster creation.
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Database type. When the value of DbType is MYSQL, the valid values are NORMAL and SERVERLESS (the default value is NORMAL). 
     * @return DbMode Database type. When the value of DbType is MYSQL, the valid values are NORMAL and SERVERLESS (the default value is NORMAL).
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Database type. When the value of DbType is MYSQL, the valid values are NORMAL and SERVERLESS (the default value is NORMAL).
     * @param DbMode Database type. When the value of DbType is MYSQL, the valid values are NORMAL and SERVERLESS (the default value is NORMAL).
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get This parameter is required when the value of DbMode is SEVERLESS. For the settings of the minimum CPU value, refer to the value returned by the DescribeServerlessInstanceSpecs API for the valid value. 
     * @return MinCpu This parameter is required when the value of DbMode is SEVERLESS. For the settings of the minimum CPU value, refer to the value returned by the DescribeServerlessInstanceSpecs API for the valid value.
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set This parameter is required when the value of DbMode is SEVERLESS. For the settings of the minimum CPU value, refer to the value returned by the DescribeServerlessInstanceSpecs API for the valid value.
     * @param MinCpu This parameter is required when the value of DbMode is SEVERLESS. For the settings of the minimum CPU value, refer to the value returned by the DescribeServerlessInstanceSpecs API for the valid value.
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get This parameter is required when the value of DbMode is SEVERLESS. For the settings of the maximum CPU value, refer to the value returned by the DescribeServerlessInstanceSpecs API for the valid value. 
     * @return MaxCpu This parameter is required when the value of DbMode is SEVERLESS. For the settings of the maximum CPU value, refer to the value returned by the DescribeServerlessInstanceSpecs API for the valid value.
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set This parameter is required when the value of DbMode is SEVERLESS. For the settings of the maximum CPU value, refer to the value returned by the DescribeServerlessInstanceSpecs API for the valid value.
     * @param MaxCpu This parameter is required when the value of DbMode is SEVERLESS. For the settings of the maximum CPU value, refer to the value returned by the DescribeServerlessInstanceSpecs API for the valid value.
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get Specifies whether the cluster is automatically paused when the value of DbMode is SEVERLESS. Valid values: yes; no. The default value is yes. 
     * @return AutoPause Specifies whether the cluster is automatically paused when the value of DbMode is SEVERLESS. Valid values: yes; no. The default value is yes.
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set Specifies whether the cluster is automatically paused when the value of DbMode is SEVERLESS. Valid values: yes; no. The default value is yes.
     * @param AutoPause Specifies whether the cluster is automatically paused when the value of DbMode is SEVERLESS. Valid values: yes; no. The default value is yes.
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get Specifies the delay for automatic cluster pause (in seconds) when the value of DbMode is SEVERLESS. Value range: [600, 691200]. The default value is 600. 
     * @return AutoPauseDelay Specifies the delay for automatic cluster pause (in seconds) when the value of DbMode is SEVERLESS. Value range: [600, 691200]. The default value is 600.
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set Specifies the delay for automatic cluster pause (in seconds) when the value of DbMode is SEVERLESS. Value range: [600, 691200]. The default value is 600.
     * @param AutoPauseDelay Specifies the delay for automatic cluster pause (in seconds) when the value of DbMode is SEVERLESS. Value range: [600, 691200]. The default value is 600.
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get Security group ID array. 
     * @return SecurityGroupIds Security group ID array.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID array.
     * @param SecurityGroupIds Security group ID array.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Alarm policy ID array. 
     * @return AlarmPolicyIds Alarm policy ID array.
     */
    public String [] getAlarmPolicyIds() {
        return this.AlarmPolicyIds;
    }

    /**
     * Set Alarm policy ID array.
     * @param AlarmPolicyIds Alarm policy ID array.
     */
    public void setAlarmPolicyIds(String [] AlarmPolicyIds) {
        this.AlarmPolicyIds = AlarmPolicyIds;
    }

    /**
     * Get Parameter array. The character_set_server (utf8 | latin1 | gbk | utf8mb4) is currently supported. lower_case_table_names: 1 - case-insensitive; 0 - case-sensitive. 
     * @return ClusterParams Parameter array. The character_set_server (utf8 | latin1 | gbk | utf8mb4) is currently supported. lower_case_table_names: 1 - case-insensitive; 0 - case-sensitive.
     */
    public ParamItem [] getClusterParams() {
        return this.ClusterParams;
    }

    /**
     * Set Parameter array. The character_set_server (utf8 | latin1 | gbk | utf8mb4) is currently supported. lower_case_table_names: 1 - case-insensitive; 0 - case-sensitive.
     * @param ClusterParams Parameter array. The character_set_server (utf8 | latin1 | gbk | utf8mb4) is currently supported. lower_case_table_names: 1 - case-insensitive; 0 - case-sensitive.
     */
    public void setClusterParams(ParamItem [] ClusterParams) {
        this.ClusterParams = ClusterParams;
    }

    /**
     * Get Parameter template ID, which can be obtained through the DescribeParamTemplates API. 
     * @return ParamTemplateId Parameter template ID, which can be obtained through the DescribeParamTemplates API.
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set Parameter template ID, which can be obtained through the DescribeParamTemplates API.
     * @param ParamTemplateId Parameter template ID, which can be obtained through the DescribeParamTemplates API.
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get Instance initialization configuration information, which is mainly used for selecting different instance specifications during cluster purchase. 
     * @return InstanceInitInfos Instance initialization configuration information, which is mainly used for selecting different instance specifications during cluster purchase.
     */
    public InstanceInitInfo [] getInstanceInitInfos() {
        return this.InstanceInitInfos;
    }

    /**
     * Set Instance initialization configuration information, which is mainly used for selecting different instance specifications during cluster purchase.
     * @param InstanceInitInfos Instance initialization configuration information, which is mainly used for selecting different instance specifications during cluster purchase.
     */
    public void setInstanceInitInfos(InstanceInitInfo [] InstanceInitInfos) {
        this.InstanceInitInfos = InstanceInitInfos;
    }

    /**
     * Get 0 - place an order and pay; 1 - place an order. 
     * @return DealMode 0 - place an order and pay; 1 - place an order.
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set 0 - place an order and pay; 1 - place an order.
     * @param DealMode 0 - place an order and pay; 1 - place an order.
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get Compute node billing mode: 0 - pay-as-you-go; 1 - prepaid. 
     * @return PayMode Compute node billing mode: 0 - pay-as-you-go; 1 - prepaid.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Compute node billing mode: 0 - pay-as-you-go; 1 - prepaid.
     * @param PayMode Compute node billing mode: 0 - pay-as-you-go; 1 - prepaid.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Time. 
     * @return TimeSpan Time.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Time.
     * @param TimeSpan Time.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Unit. 
     * @return TimeUnit Unit.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Unit.
     * @param TimeUnit Unit.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Rollback database information. 
     * @return RollbackDatabases Rollback database information.
     */
    public RollbackDatabase [] getRollbackDatabases() {
        return this.RollbackDatabases;
    }

    /**
     * Set Rollback database information.
     * @param RollbackDatabases Rollback database information.
     */
    public void setRollbackDatabases(RollbackDatabase [] RollbackDatabases) {
        this.RollbackDatabases = RollbackDatabases;
    }

    /**
     * Get Rollback table information. 
     * @return RollbackTables Rollback table information.
     */
    public RollbackTable [] getRollbackTables() {
        return this.RollbackTables;
    }

    /**
     * Set Rollback table information.
     * @param RollbackTables Rollback table information.
     */
    public void setRollbackTables(RollbackTable [] RollbackTables) {
        this.RollbackTables = RollbackTables;
    }

    /**
     * Get Source read-only instance information. 
     * @return OriginalROInstanceList Source read-only instance information.
     */
    public String [] getOriginalROInstanceList() {
        return this.OriginalROInstanceList;
    }

    /**
     * Set Source read-only instance information.
     * @param OriginalROInstanceList Source read-only instance information.
     */
    public void setOriginalROInstanceList(String [] OriginalROInstanceList) {
        this.OriginalROInstanceList = OriginalROInstanceList;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Whether to enable archiving. Valid values: yes; no. The default value is yes. 
     * @return AutoArchive Whether to enable archiving. Valid values: yes; no. The default value is yes.
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set Whether to enable archiving. Valid values: yes; no. The default value is yes.
     * @param AutoArchive Whether to enable archiving. Valid values: yes; no. The default value is yes.
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
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

    }
}

