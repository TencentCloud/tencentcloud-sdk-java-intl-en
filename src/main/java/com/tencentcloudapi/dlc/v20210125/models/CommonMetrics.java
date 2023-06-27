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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMetrics extends AbstractModel{

    /**
    * 
    */
    @SerializedName("CreateTaskTime")
    @Expose
    private Float CreateTaskTime;

    /**
    * 
    */
    @SerializedName("ProcessTime")
    @Expose
    private Float ProcessTime;

    /**
    * 
    */
    @SerializedName("QueueTime")
    @Expose
    private Float QueueTime;

    /**
    * 
    */
    @SerializedName("ExecutionTime")
    @Expose
    private Float ExecutionTime;

    /**
    * 
    */
    @SerializedName("IsResultCacheHit")
    @Expose
    private Boolean IsResultCacheHit;

    /**
    * 
    */
    @SerializedName("MatchedMVBytes")
    @Expose
    private Long MatchedMVBytes;

    /**
    * 
    */
    @SerializedName("MatchedMVs")
    @Expose
    private String MatchedMVs;

    /**
    * 
    */
    @SerializedName("AffectedBytes")
    @Expose
    private String AffectedBytes;

    /**
    * 
    */
    @SerializedName("AffectedRows")
    @Expose
    private Long AffectedRows;

    /**
    * 
    */
    @SerializedName("ProcessedBytes")
    @Expose
    private Long ProcessedBytes;

    /**
    * 
    */
    @SerializedName("ProcessedRows")
    @Expose
    private Long ProcessedRows;

    /**
     * Get  
     * @return CreateTaskTime 
     */
    public Float getCreateTaskTime() {
        return this.CreateTaskTime;
    }

    /**
     * Set 
     * @param CreateTaskTime 
     */
    public void setCreateTaskTime(Float CreateTaskTime) {
        this.CreateTaskTime = CreateTaskTime;
    }

    /**
     * Get  
     * @return ProcessTime 
     */
    public Float getProcessTime() {
        return this.ProcessTime;
    }

    /**
     * Set 
     * @param ProcessTime 
     */
    public void setProcessTime(Float ProcessTime) {
        this.ProcessTime = ProcessTime;
    }

    /**
     * Get  
     * @return QueueTime 
     */
    public Float getQueueTime() {
        return this.QueueTime;
    }

    /**
     * Set 
     * @param QueueTime 
     */
    public void setQueueTime(Float QueueTime) {
        this.QueueTime = QueueTime;
    }

    /**
     * Get  
     * @return ExecutionTime 
     */
    public Float getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set 
     * @param ExecutionTime 
     */
    public void setExecutionTime(Float ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get  
     * @return IsResultCacheHit 
     */
    public Boolean getIsResultCacheHit() {
        return this.IsResultCacheHit;
    }

    /**
     * Set 
     * @param IsResultCacheHit 
     */
    public void setIsResultCacheHit(Boolean IsResultCacheHit) {
        this.IsResultCacheHit = IsResultCacheHit;
    }

    /**
     * Get  
     * @return MatchedMVBytes 
     */
    public Long getMatchedMVBytes() {
        return this.MatchedMVBytes;
    }

    /**
     * Set 
     * @param MatchedMVBytes 
     */
    public void setMatchedMVBytes(Long MatchedMVBytes) {
        this.MatchedMVBytes = MatchedMVBytes;
    }

    /**
     * Get  
     * @return MatchedMVs 
     */
    public String getMatchedMVs() {
        return this.MatchedMVs;
    }

    /**
     * Set 
     * @param MatchedMVs 
     */
    public void setMatchedMVs(String MatchedMVs) {
        this.MatchedMVs = MatchedMVs;
    }

    /**
     * Get  
     * @return AffectedBytes 
     */
    public String getAffectedBytes() {
        return this.AffectedBytes;
    }

    /**
     * Set 
     * @param AffectedBytes 
     */
    public void setAffectedBytes(String AffectedBytes) {
        this.AffectedBytes = AffectedBytes;
    }

    /**
     * Get  
     * @return AffectedRows 
     */
    public Long getAffectedRows() {
        return this.AffectedRows;
    }

    /**
     * Set 
     * @param AffectedRows 
     */
    public void setAffectedRows(Long AffectedRows) {
        this.AffectedRows = AffectedRows;
    }

    /**
     * Get  
     * @return ProcessedBytes 
     */
    public Long getProcessedBytes() {
        return this.ProcessedBytes;
    }

    /**
     * Set 
     * @param ProcessedBytes 
     */
    public void setProcessedBytes(Long ProcessedBytes) {
        this.ProcessedBytes = ProcessedBytes;
    }

    /**
     * Get  
     * @return ProcessedRows 
     */
    public Long getProcessedRows() {
        return this.ProcessedRows;
    }

    /**
     * Set 
     * @param ProcessedRows 
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

