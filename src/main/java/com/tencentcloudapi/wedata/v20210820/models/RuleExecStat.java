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

public class RuleExecStat extends AbstractModel {

    /**
    * Total Rule Executions
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * Quarter-over-quarter total rule executions
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastTotalCnt")
    @Expose
    private Long LastTotalCnt;

    /**
    * Percentage of total rule executions
    */
    @SerializedName("TotalCntRatio")
    @Expose
    private Float TotalCntRatio;

    /**
    * Quarter-over-quarter change in total rule executions
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastTotalCntRatio")
    @Expose
    private Float LastTotalCntRatio;

    /**
    * Number of rule triggers
    */
    @SerializedName("TriggerCnt")
    @Expose
    private Long TriggerCnt;

    /**
    * Quarter-over-quarter number of rule triggers
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastTriggerCnt")
    @Expose
    private Long LastTriggerCnt;

    /**
    * Percentage of triggers in total
    */
    @SerializedName("TriggerCntRatio")
    @Expose
    private Float TriggerCntRatio;

    /**
    * Quarter-over-quarter change in rule triggers
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastTriggerCntRatio")
    @Expose
    private Float LastTriggerCntRatio;

    /**
    * Number of rule alerts
    */
    @SerializedName("AlarmCnt")
    @Expose
    private Long AlarmCnt;

    /**
    * Quarter-over-quarter number of rule alerts
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastAlarmCnt")
    @Expose
    private Long LastAlarmCnt;

    /**
    * Percentage of alerts in total
    */
    @SerializedName("AlarmCntRatio")
    @Expose
    private Float AlarmCntRatio;

    /**
    * Quarter-over-quarter change in alert numbers
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastAlarmCntRatio")
    @Expose
    private Float LastAlarmCntRatio;

    /**
    * Number of block occurrences
    */
    @SerializedName("PipelineCnt")
    @Expose
    private Long PipelineCnt;

    /**
    * Quarter-over-quarter number of block occurrences
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastPipelineCnt")
    @Expose
    private Long LastPipelineCnt;

    /**
    * Percentage of blocks in total
    */
    @SerializedName("PipelineCntRatio")
    @Expose
    private Float PipelineCntRatio;

    /**
    * Quarter-over-quarter change in block occurrences
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastPipelineCntRatio")
    @Expose
    private Float LastPipelineCntRatio;

    /**
     * Get Total Rule Executions 
     * @return TotalCnt Total Rule Executions
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set Total Rule Executions
     * @param TotalCnt Total Rule Executions
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get Quarter-over-quarter total rule executions
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastTotalCnt Quarter-over-quarter total rule executions
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLastTotalCnt() {
        return this.LastTotalCnt;
    }

    /**
     * Set Quarter-over-quarter total rule executions
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastTotalCnt Quarter-over-quarter total rule executions
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastTotalCnt(Long LastTotalCnt) {
        this.LastTotalCnt = LastTotalCnt;
    }

    /**
     * Get Percentage of total rule executions 
     * @return TotalCntRatio Percentage of total rule executions
     */
    public Float getTotalCntRatio() {
        return this.TotalCntRatio;
    }

    /**
     * Set Percentage of total rule executions
     * @param TotalCntRatio Percentage of total rule executions
     */
    public void setTotalCntRatio(Float TotalCntRatio) {
        this.TotalCntRatio = TotalCntRatio;
    }

    /**
     * Get Quarter-over-quarter change in total rule executions
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastTotalCntRatio Quarter-over-quarter change in total rule executions
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getLastTotalCntRatio() {
        return this.LastTotalCntRatio;
    }

    /**
     * Set Quarter-over-quarter change in total rule executions
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastTotalCntRatio Quarter-over-quarter change in total rule executions
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastTotalCntRatio(Float LastTotalCntRatio) {
        this.LastTotalCntRatio = LastTotalCntRatio;
    }

    /**
     * Get Number of rule triggers 
     * @return TriggerCnt Number of rule triggers
     */
    public Long getTriggerCnt() {
        return this.TriggerCnt;
    }

    /**
     * Set Number of rule triggers
     * @param TriggerCnt Number of rule triggers
     */
    public void setTriggerCnt(Long TriggerCnt) {
        this.TriggerCnt = TriggerCnt;
    }

    /**
     * Get Quarter-over-quarter number of rule triggers
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastTriggerCnt Quarter-over-quarter number of rule triggers
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLastTriggerCnt() {
        return this.LastTriggerCnt;
    }

    /**
     * Set Quarter-over-quarter number of rule triggers
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastTriggerCnt Quarter-over-quarter number of rule triggers
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastTriggerCnt(Long LastTriggerCnt) {
        this.LastTriggerCnt = LastTriggerCnt;
    }

    /**
     * Get Percentage of triggers in total 
     * @return TriggerCntRatio Percentage of triggers in total
     */
    public Float getTriggerCntRatio() {
        return this.TriggerCntRatio;
    }

    /**
     * Set Percentage of triggers in total
     * @param TriggerCntRatio Percentage of triggers in total
     */
    public void setTriggerCntRatio(Float TriggerCntRatio) {
        this.TriggerCntRatio = TriggerCntRatio;
    }

    /**
     * Get Quarter-over-quarter change in rule triggers
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastTriggerCntRatio Quarter-over-quarter change in rule triggers
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getLastTriggerCntRatio() {
        return this.LastTriggerCntRatio;
    }

    /**
     * Set Quarter-over-quarter change in rule triggers
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastTriggerCntRatio Quarter-over-quarter change in rule triggers
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastTriggerCntRatio(Float LastTriggerCntRatio) {
        this.LastTriggerCntRatio = LastTriggerCntRatio;
    }

    /**
     * Get Number of rule alerts 
     * @return AlarmCnt Number of rule alerts
     */
    public Long getAlarmCnt() {
        return this.AlarmCnt;
    }

    /**
     * Set Number of rule alerts
     * @param AlarmCnt Number of rule alerts
     */
    public void setAlarmCnt(Long AlarmCnt) {
        this.AlarmCnt = AlarmCnt;
    }

    /**
     * Get Quarter-over-quarter number of rule alerts
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastAlarmCnt Quarter-over-quarter number of rule alerts
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLastAlarmCnt() {
        return this.LastAlarmCnt;
    }

    /**
     * Set Quarter-over-quarter number of rule alerts
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastAlarmCnt Quarter-over-quarter number of rule alerts
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastAlarmCnt(Long LastAlarmCnt) {
        this.LastAlarmCnt = LastAlarmCnt;
    }

    /**
     * Get Percentage of alerts in total 
     * @return AlarmCntRatio Percentage of alerts in total
     */
    public Float getAlarmCntRatio() {
        return this.AlarmCntRatio;
    }

    /**
     * Set Percentage of alerts in total
     * @param AlarmCntRatio Percentage of alerts in total
     */
    public void setAlarmCntRatio(Float AlarmCntRatio) {
        this.AlarmCntRatio = AlarmCntRatio;
    }

    /**
     * Get Quarter-over-quarter change in alert numbers
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastAlarmCntRatio Quarter-over-quarter change in alert numbers
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getLastAlarmCntRatio() {
        return this.LastAlarmCntRatio;
    }

    /**
     * Set Quarter-over-quarter change in alert numbers
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastAlarmCntRatio Quarter-over-quarter change in alert numbers
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastAlarmCntRatio(Float LastAlarmCntRatio) {
        this.LastAlarmCntRatio = LastAlarmCntRatio;
    }

    /**
     * Get Number of block occurrences 
     * @return PipelineCnt Number of block occurrences
     */
    public Long getPipelineCnt() {
        return this.PipelineCnt;
    }

    /**
     * Set Number of block occurrences
     * @param PipelineCnt Number of block occurrences
     */
    public void setPipelineCnt(Long PipelineCnt) {
        this.PipelineCnt = PipelineCnt;
    }

    /**
     * Get Quarter-over-quarter number of block occurrences
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastPipelineCnt Quarter-over-quarter number of block occurrences
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLastPipelineCnt() {
        return this.LastPipelineCnt;
    }

    /**
     * Set Quarter-over-quarter number of block occurrences
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastPipelineCnt Quarter-over-quarter number of block occurrences
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastPipelineCnt(Long LastPipelineCnt) {
        this.LastPipelineCnt = LastPipelineCnt;
    }

    /**
     * Get Percentage of blocks in total 
     * @return PipelineCntRatio Percentage of blocks in total
     */
    public Float getPipelineCntRatio() {
        return this.PipelineCntRatio;
    }

    /**
     * Set Percentage of blocks in total
     * @param PipelineCntRatio Percentage of blocks in total
     */
    public void setPipelineCntRatio(Float PipelineCntRatio) {
        this.PipelineCntRatio = PipelineCntRatio;
    }

    /**
     * Get Quarter-over-quarter change in block occurrences
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LastPipelineCntRatio Quarter-over-quarter change in block occurrences
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getLastPipelineCntRatio() {
        return this.LastPipelineCntRatio;
    }

    /**
     * Set Quarter-over-quarter change in block occurrences
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LastPipelineCntRatio Quarter-over-quarter change in block occurrences
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastPipelineCntRatio(Float LastPipelineCntRatio) {
        this.LastPipelineCntRatio = LastPipelineCntRatio;
    }

    public RuleExecStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExecStat(RuleExecStat source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.LastTotalCnt != null) {
            this.LastTotalCnt = new Long(source.LastTotalCnt);
        }
        if (source.TotalCntRatio != null) {
            this.TotalCntRatio = new Float(source.TotalCntRatio);
        }
        if (source.LastTotalCntRatio != null) {
            this.LastTotalCntRatio = new Float(source.LastTotalCntRatio);
        }
        if (source.TriggerCnt != null) {
            this.TriggerCnt = new Long(source.TriggerCnt);
        }
        if (source.LastTriggerCnt != null) {
            this.LastTriggerCnt = new Long(source.LastTriggerCnt);
        }
        if (source.TriggerCntRatio != null) {
            this.TriggerCntRatio = new Float(source.TriggerCntRatio);
        }
        if (source.LastTriggerCntRatio != null) {
            this.LastTriggerCntRatio = new Float(source.LastTriggerCntRatio);
        }
        if (source.AlarmCnt != null) {
            this.AlarmCnt = new Long(source.AlarmCnt);
        }
        if (source.LastAlarmCnt != null) {
            this.LastAlarmCnt = new Long(source.LastAlarmCnt);
        }
        if (source.AlarmCntRatio != null) {
            this.AlarmCntRatio = new Float(source.AlarmCntRatio);
        }
        if (source.LastAlarmCntRatio != null) {
            this.LastAlarmCntRatio = new Float(source.LastAlarmCntRatio);
        }
        if (source.PipelineCnt != null) {
            this.PipelineCnt = new Long(source.PipelineCnt);
        }
        if (source.LastPipelineCnt != null) {
            this.LastPipelineCnt = new Long(source.LastPipelineCnt);
        }
        if (source.PipelineCntRatio != null) {
            this.PipelineCntRatio = new Float(source.PipelineCntRatio);
        }
        if (source.LastPipelineCntRatio != null) {
            this.LastPipelineCntRatio = new Float(source.LastPipelineCntRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamSimple(map, prefix + "LastTotalCnt", this.LastTotalCnt);
        this.setParamSimple(map, prefix + "TotalCntRatio", this.TotalCntRatio);
        this.setParamSimple(map, prefix + "LastTotalCntRatio", this.LastTotalCntRatio);
        this.setParamSimple(map, prefix + "TriggerCnt", this.TriggerCnt);
        this.setParamSimple(map, prefix + "LastTriggerCnt", this.LastTriggerCnt);
        this.setParamSimple(map, prefix + "TriggerCntRatio", this.TriggerCntRatio);
        this.setParamSimple(map, prefix + "LastTriggerCntRatio", this.LastTriggerCntRatio);
        this.setParamSimple(map, prefix + "AlarmCnt", this.AlarmCnt);
        this.setParamSimple(map, prefix + "LastAlarmCnt", this.LastAlarmCnt);
        this.setParamSimple(map, prefix + "AlarmCntRatio", this.AlarmCntRatio);
        this.setParamSimple(map, prefix + "LastAlarmCntRatio", this.LastAlarmCntRatio);
        this.setParamSimple(map, prefix + "PipelineCnt", this.PipelineCnt);
        this.setParamSimple(map, prefix + "LastPipelineCnt", this.LastPipelineCnt);
        this.setParamSimple(map, prefix + "PipelineCntRatio", this.PipelineCntRatio);
        this.setParamSimple(map, prefix + "LastPipelineCntRatio", this.LastPipelineCntRatio);

    }
}

