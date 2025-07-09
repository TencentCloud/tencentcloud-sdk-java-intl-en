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

public class RuleGroupExecResult extends AbstractModel {

    /**
    * Rule Group Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleGroupExecId")
    @Expose
    private Long RuleGroupExecId;

    /**
    * Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * Execution Trigger Type (1: Manual Trigger, 2: In-process Scheduling Trigger, 3: Periodic Scheduling Trigger)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * Execution time yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecTime")
    @Expose
    private String ExecTime;

    /**
    * Execution Status (1. Submitted, 2. Under detection, 3. Normal, 4. Abnormal)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Number of Exceptional Rules
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmRuleCount")
    @Expose
    private Long AlarmRuleCount;

    /**
    * Total Number of Rules
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalRuleCount")
    @Expose
    private Long TotalRuleCount;

    /**
    * Source Table Responsible Person
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * Source Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Database ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Permission Availability
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Permission")
    @Expose
    private Boolean Permission;

    /**
    * Execution Details, Scheduling Plan, or Associated Production Task ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecDetail")
    @Expose
    private String ExecDetail;

    /**
    * Actual Execution Engine
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * Rule Execution Result
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleExecResultVOList")
    @Expose
    private RuleExecResult [] RuleExecResultVOList;

    /**
     * Get Rule Group Execution ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleGroupExecId Rule Group Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleGroupExecId() {
        return this.RuleGroupExecId;
    }

    /**
     * Set Rule Group Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleGroupExecId Rule Group Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleGroupExecId(Long RuleGroupExecId) {
        this.RuleGroupExecId = RuleGroupExecId;
    }

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
     * Get Execution Trigger Type (1: Manual Trigger, 2: In-process Scheduling Trigger, 3: Periodic Scheduling Trigger)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TriggerType Execution Trigger Type (1: Manual Trigger, 2: In-process Scheduling Trigger, 3: Periodic Scheduling Trigger)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Execution Trigger Type (1: Manual Trigger, 2: In-process Scheduling Trigger, 3: Periodic Scheduling Trigger)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TriggerType Execution Trigger Type (1: Manual Trigger, 2: In-process Scheduling Trigger, 3: Periodic Scheduling Trigger)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Execution time yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecTime Execution time yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set Execution time yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecTime Execution time yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecTime(String ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get Execution Status (1. Submitted, 2. Under detection, 3. Normal, 4. Abnormal)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Execution Status (1. Submitted, 2. Under detection, 3. Normal, 4. Abnormal)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Execution Status (1. Submitted, 2. Under detection, 3. Normal, 4. Abnormal)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Status Execution Status (1. Submitted, 2. Under detection, 3. Normal, 4. Abnormal)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Number of Exceptional Rules
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmRuleCount Number of Exceptional Rules
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getAlarmRuleCount() {
        return this.AlarmRuleCount;
    }

    /**
     * Set Number of Exceptional Rules
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmRuleCount Number of Exceptional Rules
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmRuleCount(Long AlarmRuleCount) {
        this.AlarmRuleCount = AlarmRuleCount;
    }

    /**
     * Get Total Number of Rules
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalRuleCount Total Number of Rules
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalRuleCount() {
        return this.TotalRuleCount;
    }

    /**
     * Set Total Number of Rules
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalRuleCount Total Number of Rules
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalRuleCount(Long TotalRuleCount) {
        this.TotalRuleCount = TotalRuleCount;
    }

    /**
     * Get Source Table Responsible Person
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableOwnerName Source Table Responsible Person
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set Source Table Responsible Person
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableOwnerName Source Table Responsible Person
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get Source Table Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Source Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Source Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Source Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableId Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableId Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
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
     * Get Data Source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Permission Availability
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Permission Permission Availability
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getPermission() {
        return this.Permission;
    }

    /**
     * Set Permission Availability
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Permission Permission Availability
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPermission(Boolean Permission) {
        this.Permission = Permission;
    }

    /**
     * Get Execution Details, Scheduling Plan, or Associated Production Task ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecDetail Execution Details, Scheduling Plan, or Associated Production Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecDetail() {
        return this.ExecDetail;
    }

    /**
     * Set Execution Details, Scheduling Plan, or Associated Production Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecDetail Execution Details, Scheduling Plan, or Associated Production Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecDetail(String ExecDetail) {
        this.ExecDetail = ExecDetail;
    }

    /**
     * Get Actual Execution Engine
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EngineType Actual Execution Engine
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Actual Execution Engine
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EngineType Actual Execution Engine
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get Rule Execution Result
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleExecResultVOList Rule Execution Result
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleExecResult [] getRuleExecResultVOList() {
        return this.RuleExecResultVOList;
    }

    /**
     * Set Rule Execution Result
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleExecResultVOList Rule Execution Result
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleExecResultVOList(RuleExecResult [] RuleExecResultVOList) {
        this.RuleExecResultVOList = RuleExecResultVOList;
    }

    public RuleGroupExecResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupExecResult(RuleGroupExecResult source) {
        if (source.RuleGroupExecId != null) {
            this.RuleGroupExecId = new Long(source.RuleGroupExecId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new String(source.ExecTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AlarmRuleCount != null) {
            this.AlarmRuleCount = new Long(source.AlarmRuleCount);
        }
        if (source.TotalRuleCount != null) {
            this.TotalRuleCount = new Long(source.TotalRuleCount);
        }
        if (source.TableOwnerName != null) {
            this.TableOwnerName = new String(source.TableOwnerName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.Permission != null) {
            this.Permission = new Boolean(source.Permission);
        }
        if (source.ExecDetail != null) {
            this.ExecDetail = new String(source.ExecDetail);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.RuleExecResultVOList != null) {
            this.RuleExecResultVOList = new RuleExecResult[source.RuleExecResultVOList.length];
            for (int i = 0; i < source.RuleExecResultVOList.length; i++) {
                this.RuleExecResultVOList[i] = new RuleExecResult(source.RuleExecResultVOList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupExecId", this.RuleGroupExecId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AlarmRuleCount", this.AlarmRuleCount);
        this.setParamSimple(map, prefix + "TotalRuleCount", this.TotalRuleCount);
        this.setParamSimple(map, prefix + "TableOwnerName", this.TableOwnerName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "ExecDetail", this.ExecDetail);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamArrayObj(map, prefix + "RuleExecResultVOList.", this.RuleExecResultVOList);

    }
}

