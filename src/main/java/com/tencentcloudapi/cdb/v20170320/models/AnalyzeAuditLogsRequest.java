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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyzeAuditLogsRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time of the log to be analyzed in the format of `2023-02-16 00:00:20`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the log to be analyzed in the format of `2023-02-16 00:00:20`.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Sorting conditions for aggregation dimension
    */
    @SerializedName("AggregationConditions")
    @Expose
    private AggregationCondition [] AggregationConditions;

    /**
    * The result set of the audit log filtered by this condition is set as the analysis Log.
    */
    @SerializedName("AuditLogFilter")
    @Expose
    private AuditLogFilter AuditLogFilter;

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
     * Get Start time of the log to be analyzed in the format of `2023-02-16 00:00:20`. 
     * @return StartTime Start time of the log to be analyzed in the format of `2023-02-16 00:00:20`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the log to be analyzed in the format of `2023-02-16 00:00:20`.
     * @param StartTime Start time of the log to be analyzed in the format of `2023-02-16 00:00:20`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the log to be analyzed in the format of `2023-02-16 00:00:20`. 
     * @return EndTime End time of the log to be analyzed in the format of `2023-02-16 00:00:20`.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the log to be analyzed in the format of `2023-02-16 00:00:20`.
     * @param EndTime End time of the log to be analyzed in the format of `2023-02-16 00:00:20`.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Sorting conditions for aggregation dimension 
     * @return AggregationConditions Sorting conditions for aggregation dimension
     */
    public AggregationCondition [] getAggregationConditions() {
        return this.AggregationConditions;
    }

    /**
     * Set Sorting conditions for aggregation dimension
     * @param AggregationConditions Sorting conditions for aggregation dimension
     */
    public void setAggregationConditions(AggregationCondition [] AggregationConditions) {
        this.AggregationConditions = AggregationConditions;
    }

    /**
     * Get The result set of the audit log filtered by this condition is set as the analysis Log. 
     * @return AuditLogFilter The result set of the audit log filtered by this condition is set as the analysis Log.
     */
    public AuditLogFilter getAuditLogFilter() {
        return this.AuditLogFilter;
    }

    /**
     * Set The result set of the audit log filtered by this condition is set as the analysis Log.
     * @param AuditLogFilter The result set of the audit log filtered by this condition is set as the analysis Log.
     */
    public void setAuditLogFilter(AuditLogFilter AuditLogFilter) {
        this.AuditLogFilter = AuditLogFilter;
    }

    public AnalyzeAuditLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyzeAuditLogsRequest(AnalyzeAuditLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AggregationConditions != null) {
            this.AggregationConditions = new AggregationCondition[source.AggregationConditions.length];
            for (int i = 0; i < source.AggregationConditions.length; i++) {
                this.AggregationConditions[i] = new AggregationCondition(source.AggregationConditions[i]);
            }
        }
        if (source.AuditLogFilter != null) {
            this.AuditLogFilter = new AuditLogFilter(source.AuditLogFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "AggregationConditions.", this.AggregationConditions);
        this.setParamObj(map, prefix + "AuditLogFilter.", this.AuditLogFilter);

    }
}

