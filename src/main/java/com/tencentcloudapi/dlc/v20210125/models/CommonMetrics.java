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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMetrics extends AbstractModel {

    /**
    * The task creation time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTaskTime")
    @Expose
    private Float CreateTaskTime;

    /**
    * The processing time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessTime")
    @Expose
    private Float ProcessTime;

    /**
    * The queue time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueTime")
    @Expose
    private Float QueueTime;

    /**
    * The execution duration in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionTime")
    @Expose
    private Float ExecutionTime;

    /**
    * Whether the result cache is hit.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("IsResultCacheHit")
    @Expose
    private Boolean IsResultCacheHit;

    /**
    * The volume of matched materialized views, in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("MatchedMVBytes")
    @Expose
    private Long MatchedMVBytes;

    /**
    * The list of matched materialized views.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("MatchedMVs")
    @Expose
    private String MatchedMVs;

    /**
    * The result data in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("AffectedBytes")
    @Expose
    private String AffectedBytes;

    /**
    * 	The number of rows in the result.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("AffectedRows")
    @Expose
    private Long AffectedRows;

    /**
    * The volume of the data scanned, in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessedBytes")
    @Expose
    private Long ProcessedBytes;

    /**
    * 	The number of scanned rows.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessedRows")
    @Expose
    private Long ProcessedRows;

    /**
     * Get The task creation time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return CreateTaskTime The task creation time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Float getCreateTaskTime() {
        return this.CreateTaskTime;
    }

    /**
     * Set The task creation time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param CreateTaskTime The task creation time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setCreateTaskTime(Float CreateTaskTime) {
        this.CreateTaskTime = CreateTaskTime;
    }

    /**
     * Get The processing time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return ProcessTime The processing time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Float getProcessTime() {
        return this.ProcessTime;
    }

    /**
     * Set The processing time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param ProcessTime The processing time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setProcessTime(Float ProcessTime) {
        this.ProcessTime = ProcessTime;
    }

    /**
     * Get The queue time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return QueueTime The queue time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Float getQueueTime() {
        return this.QueueTime;
    }

    /**
     * Set The queue time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param QueueTime The queue time in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setQueueTime(Float QueueTime) {
        this.QueueTime = QueueTime;
    }

    /**
     * Get The execution duration in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return ExecutionTime The execution duration in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Float getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set The execution duration in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param ExecutionTime The execution duration in ms.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setExecutionTime(Float ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get Whether the result cache is hit.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return IsResultCacheHit Whether the result cache is hit.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Boolean getIsResultCacheHit() {
        return this.IsResultCacheHit;
    }

    /**
     * Set Whether the result cache is hit.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param IsResultCacheHit Whether the result cache is hit.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setIsResultCacheHit(Boolean IsResultCacheHit) {
        this.IsResultCacheHit = IsResultCacheHit;
    }

    /**
     * Get The volume of matched materialized views, in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return MatchedMVBytes The volume of matched materialized views, in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Long getMatchedMVBytes() {
        return this.MatchedMVBytes;
    }

    /**
     * Set The volume of matched materialized views, in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param MatchedMVBytes The volume of matched materialized views, in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setMatchedMVBytes(Long MatchedMVBytes) {
        this.MatchedMVBytes = MatchedMVBytes;
    }

    /**
     * Get The list of matched materialized views.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return MatchedMVs The list of matched materialized views.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getMatchedMVs() {
        return this.MatchedMVs;
    }

    /**
     * Set The list of matched materialized views.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param MatchedMVs The list of matched materialized views.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setMatchedMVs(String MatchedMVs) {
        this.MatchedMVs = MatchedMVs;
    }

    /**
     * Get The result data in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return AffectedBytes The result data in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String getAffectedBytes() {
        return this.AffectedBytes;
    }

    /**
     * Set The result data in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param AffectedBytes The result data in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setAffectedBytes(String AffectedBytes) {
        this.AffectedBytes = AffectedBytes;
    }

    /**
     * Get 	The number of rows in the result.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return AffectedRows 	The number of rows in the result.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Long getAffectedRows() {
        return this.AffectedRows;
    }

    /**
     * Set 	The number of rows in the result.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param AffectedRows 	The number of rows in the result.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setAffectedRows(Long AffectedRows) {
        this.AffectedRows = AffectedRows;
    }

    /**
     * Get The volume of the data scanned, in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return ProcessedBytes The volume of the data scanned, in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Long getProcessedBytes() {
        return this.ProcessedBytes;
    }

    /**
     * Set The volume of the data scanned, in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param ProcessedBytes The volume of the data scanned, in bytes.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setProcessedBytes(Long ProcessedBytes) {
        this.ProcessedBytes = ProcessedBytes;
    }

    /**
     * Get 	The number of scanned rows.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return ProcessedRows 	The number of scanned rows.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public Long getProcessedRows() {
        return this.ProcessedRows;
    }

    /**
     * Set 	The number of scanned rows.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param ProcessedRows 	The number of scanned rows.
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setProcessedRows(Long ProcessedRows) {
        this.ProcessedRows = ProcessedRows;
    }

    public CommonMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonMetrics(CommonMetrics source) {
        if (source.CreateTaskTime != null) {
            this.CreateTaskTime = new Float(source.CreateTaskTime);
        }
        if (source.ProcessTime != null) {
            this.ProcessTime = new Float(source.ProcessTime);
        }
        if (source.QueueTime != null) {
            this.QueueTime = new Float(source.QueueTime);
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new Float(source.ExecutionTime);
        }
        if (source.IsResultCacheHit != null) {
            this.IsResultCacheHit = new Boolean(source.IsResultCacheHit);
        }
        if (source.MatchedMVBytes != null) {
            this.MatchedMVBytes = new Long(source.MatchedMVBytes);
        }
        if (source.MatchedMVs != null) {
            this.MatchedMVs = new String(source.MatchedMVs);
        }
        if (source.AffectedBytes != null) {
            this.AffectedBytes = new String(source.AffectedBytes);
        }
        if (source.AffectedRows != null) {
            this.AffectedRows = new Long(source.AffectedRows);
        }
        if (source.ProcessedBytes != null) {
            this.ProcessedBytes = new Long(source.ProcessedBytes);
        }
        if (source.ProcessedRows != null) {
            this.ProcessedRows = new Long(source.ProcessedRows);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTaskTime", this.CreateTaskTime);
        this.setParamSimple(map, prefix + "ProcessTime", this.ProcessTime);
        this.setParamSimple(map, prefix + "QueueTime", this.QueueTime);
        this.setParamSimple(map, prefix + "ExecutionTime", this.ExecutionTime);
        this.setParamSimple(map, prefix + "IsResultCacheHit", this.IsResultCacheHit);
        this.setParamSimple(map, prefix + "MatchedMVBytes", this.MatchedMVBytes);
        this.setParamSimple(map, prefix + "MatchedMVs", this.MatchedMVs);
        this.setParamSimple(map, prefix + "AffectedBytes", this.AffectedBytes);
        this.setParamSimple(map, prefix + "AffectedRows", this.AffectedRows);
        this.setParamSimple(map, prefix + "ProcessedBytes", this.ProcessedBytes);
        this.setParamSimple(map, prefix + "ProcessedRows", this.ProcessedRows);

    }
}

