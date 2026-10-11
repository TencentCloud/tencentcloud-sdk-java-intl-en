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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InsightResult extends AbstractModel {

    /**
    * When Type is set to HIVE, the value is the Hive query ID; when Type is set to MAPREDUCE, SPARK or TEZ, the value is YarnAppID.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Insight application type. Valid values: HIVE, SPARK, MAPREDUCE, and TEZ.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Insight rule ID.
HIVE-ScanManyMeta: excessively large amount of scanned metadata
HIVE-ScanManyPartition: large table scan
HIVE-SlowCompile: excessively long compilation durationHIVE-UnSuitableConfig: improper parameter
MAPREDUCE-MapperDataSkew: Map data skew
MAPREDUCE-MapperMemWaste: MapMemory resource waste
MAPREDUCE-MapperSlowTask: Map slow task
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded: peak memory exceeded
MAPREDUCE-ReducerDataSkew: Reduce data skew
MAPREDUCE-ReducerMemWaste: ReduceMemory resource waste
MAPREDUCE-ReducerSlowTask: Reduce slow task
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay: scheduling delay
SPARK-CpuWaste: CPU resource waste
SPARK-DataSkew: data skew
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded: peak memory exceeded
SPARK-MemWaste: Memory resource waste
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew: scheduling skew
SPARK-SlowTask: slow task
TEZ-DataSkew: data skew
TEZ-MapperDataSkew: Map data skew
TEZ-ReducerDataSkew: Reduce data skew
TEZ-TezMemWaste: Memory resource waste
TEZ-TezSlowTask: slow task
TEZ-TezTaskGC:TasksGC
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * Insight rule name. Refer to the description of RuleID.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Insight rule interpretation.
    */
    @SerializedName("RuleExplain")
    @Expose
    private String RuleExplain;

    /**
    * Details.
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * Recommended message.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Insight anomaly metric value. For insight items of the same type, a larger value indicates higher severity. Insight items of different types are not comparable.
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * Scheduling task execution ID.
    */
    @SerializedName("ScheduleTaskExecID")
    @Expose
    private String ScheduleTaskExecID;

    /**
    * Scheduling flow (DAG).
    */
    @SerializedName("ScheduleFlowName")
    @Expose
    private String ScheduleFlowName;

    /**
    * Task node in the scheduling flow.
    */
    @SerializedName("ScheduleTaskName")
    @Expose
    private String ScheduleTaskName;

    /**
    * Some core configurations of the YARN task.
    */
    @SerializedName("JobConf")
    @Expose
    private String JobConf;

    /**
    * Insight into structured information.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get When Type is set to HIVE, the value is the Hive query ID; when Type is set to MAPREDUCE, SPARK or TEZ, the value is YarnAppID. 
     * @return ID When Type is set to HIVE, the value is the Hive query ID; when Type is set to MAPREDUCE, SPARK or TEZ, the value is YarnAppID.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set When Type is set to HIVE, the value is the Hive query ID; when Type is set to MAPREDUCE, SPARK or TEZ, the value is YarnAppID.
     * @param ID When Type is set to HIVE, the value is the Hive query ID; when Type is set to MAPREDUCE, SPARK or TEZ, the value is YarnAppID.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Insight application type. Valid values: HIVE, SPARK, MAPREDUCE, and TEZ. 
     * @return Type Insight application type. Valid values: HIVE, SPARK, MAPREDUCE, and TEZ.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Insight application type. Valid values: HIVE, SPARK, MAPREDUCE, and TEZ.
     * @param Type Insight application type. Valid values: HIVE, SPARK, MAPREDUCE, and TEZ.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Insight rule ID.
HIVE-ScanManyMeta: excessively large amount of scanned metadata
HIVE-ScanManyPartition: large table scan
HIVE-SlowCompile: excessively long compilation durationHIVE-UnSuitableConfig: improper parameter
MAPREDUCE-MapperDataSkew: Map data skew
MAPREDUCE-MapperMemWaste: MapMemory resource waste
MAPREDUCE-MapperSlowTask: Map slow task
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded: peak memory exceeded
MAPREDUCE-ReducerDataSkew: Reduce data skew
MAPREDUCE-ReducerMemWaste: ReduceMemory resource waste
MAPREDUCE-ReducerSlowTask: Reduce slow task
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay: scheduling delay
SPARK-CpuWaste: CPU resource waste
SPARK-DataSkew: data skew
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded: peak memory exceeded
SPARK-MemWaste: Memory resource waste
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew: scheduling skew
SPARK-SlowTask: slow task
TEZ-DataSkew: data skew
TEZ-MapperDataSkew: Map data skew
TEZ-ReducerDataSkew: Reduce data skew
TEZ-TezMemWaste: Memory resource waste
TEZ-TezSlowTask: slow task
TEZ-TezTaskGC:TasksGC 
     * @return RuleID Insight rule ID.
HIVE-ScanManyMeta: excessively large amount of scanned metadata
HIVE-ScanManyPartition: large table scan
HIVE-SlowCompile: excessively long compilation durationHIVE-UnSuitableConfig: improper parameter
MAPREDUCE-MapperDataSkew: Map data skew
MAPREDUCE-MapperMemWaste: MapMemory resource waste
MAPREDUCE-MapperSlowTask: Map slow task
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded: peak memory exceeded
MAPREDUCE-ReducerDataSkew: Reduce data skew
MAPREDUCE-ReducerMemWaste: ReduceMemory resource waste
MAPREDUCE-ReducerSlowTask: Reduce slow task
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay: scheduling delay
SPARK-CpuWaste: CPU resource waste
SPARK-DataSkew: data skew
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded: peak memory exceeded
SPARK-MemWaste: Memory resource waste
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew: scheduling skew
SPARK-SlowTask: slow task
TEZ-DataSkew: data skew
TEZ-MapperDataSkew: Map data skew
TEZ-ReducerDataSkew: Reduce data skew
TEZ-TezMemWaste: Memory resource waste
TEZ-TezSlowTask: slow task
TEZ-TezTaskGC:TasksGC
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Insight rule ID.
HIVE-ScanManyMeta: excessively large amount of scanned metadata
HIVE-ScanManyPartition: large table scan
HIVE-SlowCompile: excessively long compilation durationHIVE-UnSuitableConfig: improper parameter
MAPREDUCE-MapperDataSkew: Map data skew
MAPREDUCE-MapperMemWaste: MapMemory resource waste
MAPREDUCE-MapperSlowTask: Map slow task
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded: peak memory exceeded
MAPREDUCE-ReducerDataSkew: Reduce data skew
MAPREDUCE-ReducerMemWaste: ReduceMemory resource waste
MAPREDUCE-ReducerSlowTask: Reduce slow task
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay: scheduling delay
SPARK-CpuWaste: CPU resource waste
SPARK-DataSkew: data skew
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded: peak memory exceeded
SPARK-MemWaste: Memory resource waste
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew: scheduling skew
SPARK-SlowTask: slow task
TEZ-DataSkew: data skew
TEZ-MapperDataSkew: Map data skew
TEZ-ReducerDataSkew: Reduce data skew
TEZ-TezMemWaste: Memory resource waste
TEZ-TezSlowTask: slow task
TEZ-TezTaskGC:TasksGC
     * @param RuleID Insight rule ID.
HIVE-ScanManyMeta: excessively large amount of scanned metadata
HIVE-ScanManyPartition: large table scan
HIVE-SlowCompile: excessively long compilation durationHIVE-UnSuitableConfig: improper parameter
MAPREDUCE-MapperDataSkew: Map data skew
MAPREDUCE-MapperMemWaste: MapMemory resource waste
MAPREDUCE-MapperSlowTask: Map slow task
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded: peak memory exceeded
MAPREDUCE-ReducerDataSkew: Reduce data skew
MAPREDUCE-ReducerMemWaste: ReduceMemory resource waste
MAPREDUCE-ReducerSlowTask: Reduce slow task
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay: scheduling delay
SPARK-CpuWaste: CPU resource waste
SPARK-DataSkew: data skew
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded: peak memory exceeded
SPARK-MemWaste: Memory resource waste
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew: scheduling skew
SPARK-SlowTask: slow task
TEZ-DataSkew: data skew
TEZ-MapperDataSkew: Map data skew
TEZ-ReducerDataSkew: Reduce data skew
TEZ-TezMemWaste: Memory resource waste
TEZ-TezSlowTask: slow task
TEZ-TezTaskGC:TasksGC
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Insight rule name. Refer to the description of RuleID. 
     * @return RuleName Insight rule name. Refer to the description of RuleID.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Insight rule name. Refer to the description of RuleID.
     * @param RuleName Insight rule name. Refer to the description of RuleID.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Insight rule interpretation. 
     * @return RuleExplain Insight rule interpretation.
     */
    public String getRuleExplain() {
        return this.RuleExplain;
    }

    /**
     * Set Insight rule interpretation.
     * @param RuleExplain Insight rule interpretation.
     */
    public void setRuleExplain(String RuleExplain) {
        this.RuleExplain = RuleExplain;
    }

    /**
     * Get Details. 
     * @return Detail Details.
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set Details.
     * @param Detail Details.
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Recommended message. 
     * @return Suggestion Recommended message.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Recommended message.
     * @param Suggestion Recommended message.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Insight anomaly metric value. For insight items of the same type, a larger value indicates higher severity. Insight items of different types are not comparable. 
     * @return Value Insight anomaly metric value. For insight items of the same type, a larger value indicates higher severity. Insight items of different types are not comparable.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Insight anomaly metric value. For insight items of the same type, a larger value indicates higher severity. Insight items of different types are not comparable.
     * @param Value Insight anomaly metric value. For insight items of the same type, a larger value indicates higher severity. Insight items of different types are not comparable.
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get Scheduling task execution ID. 
     * @return ScheduleTaskExecID Scheduling task execution ID.
     */
    public String getScheduleTaskExecID() {
        return this.ScheduleTaskExecID;
    }

    /**
     * Set Scheduling task execution ID.
     * @param ScheduleTaskExecID Scheduling task execution ID.
     */
    public void setScheduleTaskExecID(String ScheduleTaskExecID) {
        this.ScheduleTaskExecID = ScheduleTaskExecID;
    }

    /**
     * Get Scheduling flow (DAG). 
     * @return ScheduleFlowName Scheduling flow (DAG).
     */
    public String getScheduleFlowName() {
        return this.ScheduleFlowName;
    }

    /**
     * Set Scheduling flow (DAG).
     * @param ScheduleFlowName Scheduling flow (DAG).
     */
    public void setScheduleFlowName(String ScheduleFlowName) {
        this.ScheduleFlowName = ScheduleFlowName;
    }

    /**
     * Get Task node in the scheduling flow. 
     * @return ScheduleTaskName Task node in the scheduling flow.
     */
    public String getScheduleTaskName() {
        return this.ScheduleTaskName;
    }

    /**
     * Set Task node in the scheduling flow.
     * @param ScheduleTaskName Task node in the scheduling flow.
     */
    public void setScheduleTaskName(String ScheduleTaskName) {
        this.ScheduleTaskName = ScheduleTaskName;
    }

    /**
     * Get Some core configurations of the YARN task. 
     * @return JobConf Some core configurations of the YARN task.
     */
    public String getJobConf() {
        return this.JobConf;
    }

    /**
     * Set Some core configurations of the YARN task.
     * @param JobConf Some core configurations of the YARN task.
     */
    public void setJobConf(String JobConf) {
        this.JobConf = JobConf;
    }

    /**
     * Get Insight into structured information. 
     * @return Context Insight into structured information.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Insight into structured information.
     * @param Context Insight into structured information.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public InsightResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InsightResult(InsightResult source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleExplain != null) {
            this.RuleExplain = new String(source.RuleExplain);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.ScheduleTaskExecID != null) {
            this.ScheduleTaskExecID = new String(source.ScheduleTaskExecID);
        }
        if (source.ScheduleFlowName != null) {
            this.ScheduleFlowName = new String(source.ScheduleFlowName);
        }
        if (source.ScheduleTaskName != null) {
            this.ScheduleTaskName = new String(source.ScheduleTaskName);
        }
        if (source.JobConf != null) {
            this.JobConf = new String(source.JobConf);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleExplain", this.RuleExplain);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ScheduleTaskExecID", this.ScheduleTaskExecID);
        this.setParamSimple(map, prefix + "ScheduleFlowName", this.ScheduleFlowName);
        this.setParamSimple(map, prefix + "ScheduleTaskName", this.ScheduleTaskName);
        this.setParamSimple(map, prefix + "JobConf", this.JobConf);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

