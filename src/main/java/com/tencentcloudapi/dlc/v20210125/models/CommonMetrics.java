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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMetrics extends AbstractModel {

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTaskTime")
    @Expose
    private Float CreateTaskTime;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessTime")
    @Expose
    private Float ProcessTime;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueTime")
    @Expose
    private Float QueueTime;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionTime")
    @Expose
    private Float ExecutionTime;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsResultCacheHit")
    @Expose
    private Boolean IsResultCacheHit;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MatchedMVBytes")
    @Expose
    private Long MatchedMVBytes;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MatchedMVs")
    @Expose
    private String MatchedMVs;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AffectedBytes")
    @Expose
    private String AffectedBytes;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AffectedRows")
    @Expose
    private Long AffectedRows;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessedBytes")
    @Expose
    private Long ProcessedBytes;

    /**
    * Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessedRows")
    @Expose
    private Long ProcessedRows;

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTaskTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getCreateTaskTime() {
        return this.CreateTaskTime;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTaskTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTaskTime(Float CreateTaskTime) {
        this.CreateTaskTime = CreateTaskTime;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getProcessTime() {
        return this.ProcessTime;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessTime(Float ProcessTime) {
        this.ProcessTime = ProcessTime;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueueTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getQueueTime() {
        return this.QueueTime;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueueTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueueTime(Float QueueTime) {
        this.QueueTime = QueueTime;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionTime Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionTime(Float ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsResultCacheHit Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsResultCacheHit() {
        return this.IsResultCacheHit;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsResultCacheHit Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsResultCacheHit(Boolean IsResultCacheHit) {
        this.IsResultCacheHit = IsResultCacheHit;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MatchedMVBytes Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMatchedMVBytes() {
        return this.MatchedMVBytes;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param MatchedMVBytes Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMatchedMVBytes(Long MatchedMVBytes) {
        this.MatchedMVBytes = MatchedMVBytes;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MatchedMVs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMatchedMVs() {
        return this.MatchedMVs;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param MatchedMVs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMatchedMVs(String MatchedMVs) {
        this.MatchedMVs = MatchedMVs;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AffectedBytes Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAffectedBytes() {
        return this.AffectedBytes;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param AffectedBytes Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAffectedBytes(String AffectedBytes) {
        this.AffectedBytes = AffectedBytes;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AffectedRows Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAffectedRows() {
        return this.AffectedRows;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param AffectedRows Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAffectedRows(Long AffectedRows) {
        this.AffectedRows = AffectedRows;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessedBytes Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProcessedBytes() {
        return this.ProcessedBytes;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessedBytes Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessedBytes(Long ProcessedBytes) {
        this.ProcessedBytes = ProcessedBytes;
    }

    /**
     * Get Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessedRows Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProcessedRows() {
        return this.ProcessedRows;
    }

    /**
     * Set Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessedRows Note: This field may return null, indicating that no valid values can be obtained.
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

