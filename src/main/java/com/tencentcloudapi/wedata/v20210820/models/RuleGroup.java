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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroup extends AbstractModel {

    /**
    * Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * Data source typeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceType")
    @Expose
    private Long DatasourceType;

    /**
    * Monitoring Type: 1. Not Configured, 2. Associate Production Scheduling, 3. Offline Period Detection
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * Update timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Associated Data Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Associated Data Table Id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Associated Data Table Owner
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * Execution policyNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecStrategy")
    @Expose
    private RuleGroupExecStrategy ExecStrategy;

    /**
    * Execution policyNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Subscription")
    @Expose
    private RuleGroupSubscribe Subscription;

    /**
    * Database ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Permission Granted
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Permission")
    @Expose
    private Boolean Permission;

    /**
    * Number of Rules Configured
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * Monitoring Status
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Boolean MonitorStatus;

    /**
    * Table Leader UserId
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableOwnerUserId")
    @Expose
    private Long TableOwnerUserId;

    /**
    * Instance IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Execution Strategy Configured?
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StrategyConfig")
    @Expose
    private Boolean StrategyConfig;

    /**
    * Execution Strategy Configured?
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubscribeConfig")
    @Expose
    private Boolean SubscribeConfig;

    /**
    * Data Source Environment: 0 or not returned. Undefined, 1. Production, 2. Development
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DsEnvType")
    @Expose
    private Long DsEnvType;

    /**
     * Get Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleGroupId Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleGroupId Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get Data Source IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data Source IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Data Source Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceName Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceName Data Source Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get Data source typeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceType Data source typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set Data source typeNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceType Data source typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceType(Long DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get Monitoring Type: 1. Not Configured, 2. Associate Production Scheduling, 3. Offline Period Detection
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonitorType Monitoring Type: 1. Not Configured, 2. Associate Production Scheduling, 3. Offline Period Detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitoring Type: 1. Not Configured, 2. Associate Production Scheduling, 3. Offline Period Detection
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonitorType Monitoring Type: 1. Not Configured, 2. Associate Production Scheduling, 3. Offline Period Detection
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Update timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Associated Data Table Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Associated Data Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Associated Data Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Associated Data Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Associated Data Table Id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableId Associated Data Table Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Associated Data Table Id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableId Associated Data Table Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Associated Data Table Owner
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableOwnerName Associated Data Table Owner
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set Associated Data Table Owner
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableOwnerName Associated Data Table Owner
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get Execution policyNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecStrategy Execution policyNote: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleGroupExecStrategy getExecStrategy() {
        return this.ExecStrategy;
    }

    /**
     * Set Execution policyNote: This field may return null, indicating that no valid value can be obtained.
     * @param ExecStrategy Execution policyNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecStrategy(RuleGroupExecStrategy ExecStrategy) {
        this.ExecStrategy = ExecStrategy;
    }

    /**
     * Get Execution policyNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Subscription Execution policyNote: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleGroupSubscribe getSubscription() {
        return this.Subscription;
    }

    /**
     * Set Execution policyNote: This field may return null, indicating that no valid value can be obtained.
     * @param Subscription Execution policyNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubscription(RuleGroupSubscribe Subscription) {
        this.Subscription = Subscription;
    }

    /**
     * Get Database ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseId Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseId Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get Database nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Permission Granted
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Permission Permission Granted
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getPermission() {
        return this.Permission;
    }

    /**
     * Set Permission Granted
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Permission Permission Granted
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPermission(Boolean Permission) {
        this.Permission = Permission;
    }

    /**
     * Get Number of Rules Configured
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleCount Number of Rules Configured
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set Number of Rules Configured
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleCount Number of Rules Configured
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get Monitoring Status
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonitorStatus Monitoring Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set Monitoring Status
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonitorStatus Monitoring Status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonitorStatus(Boolean MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get Table Leader UserId
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableOwnerUserId Table Leader UserId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTableOwnerUserId() {
        return this.TableOwnerUserId;
    }

    /**
     * Set Table Leader UserId
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableOwnerUserId Table Leader UserId
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableOwnerUserId(Long TableOwnerUserId) {
        this.TableOwnerUserId = TableOwnerUserId;
    }

    /**
     * Get Instance IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceId Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceId Instance IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Execution Strategy Configured?
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StrategyConfig Execution Strategy Configured?
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getStrategyConfig() {
        return this.StrategyConfig;
    }

    /**
     * Set Execution Strategy Configured?
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StrategyConfig Execution Strategy Configured?
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStrategyConfig(Boolean StrategyConfig) {
        this.StrategyConfig = StrategyConfig;
    }

    /**
     * Get Execution Strategy Configured?
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubscribeConfig Execution Strategy Configured?
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getSubscribeConfig() {
        return this.SubscribeConfig;
    }

    /**
     * Set Execution Strategy Configured?
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubscribeConfig Execution Strategy Configured?
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubscribeConfig(Boolean SubscribeConfig) {
        this.SubscribeConfig = SubscribeConfig;
    }

    /**
     * Get Data Source Environment: 0 or not returned. Undefined, 1. Production, 2. Development
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DsEnvType Data Source Environment: 0 or not returned. Undefined, 1. Production, 2. Development
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDsEnvType() {
        return this.DsEnvType;
    }

    /**
     * Set Data Source Environment: 0 or not returned. Undefined, 1. Production, 2. Development
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DsEnvType Data Source Environment: 0 or not returned. Undefined, 1. Production, 2. Development
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDsEnvType(Long DsEnvType) {
        this.DsEnvType = DsEnvType;
    }

    public RuleGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroup(RuleGroup source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new Long(source.DatasourceType);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableOwnerName != null) {
            this.TableOwnerName = new String(source.TableOwnerName);
        }
        if (source.ExecStrategy != null) {
            this.ExecStrategy = new RuleGroupExecStrategy(source.ExecStrategy);
        }
        if (source.Subscription != null) {
            this.Subscription = new RuleGroupSubscribe(source.Subscription);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Permission != null) {
            this.Permission = new Boolean(source.Permission);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Boolean(source.MonitorStatus);
        }
        if (source.TableOwnerUserId != null) {
            this.TableOwnerUserId = new Long(source.TableOwnerUserId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StrategyConfig != null) {
            this.StrategyConfig = new Boolean(source.StrategyConfig);
        }
        if (source.SubscribeConfig != null) {
            this.SubscribeConfig = new Boolean(source.SubscribeConfig);
        }
        if (source.DsEnvType != null) {
            this.DsEnvType = new Long(source.DsEnvType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableOwnerName", this.TableOwnerName);
        this.setParamObj(map, prefix + "ExecStrategy.", this.ExecStrategy);
        this.setParamObj(map, prefix + "Subscription.", this.Subscription);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "TableOwnerUserId", this.TableOwnerUserId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StrategyConfig", this.StrategyConfig);
        this.setParamSimple(map, prefix + "SubscribeConfig", this.SubscribeConfig);
        this.setParamSimple(map, prefix + "DsEnvType", this.DsEnvType);

    }
}

