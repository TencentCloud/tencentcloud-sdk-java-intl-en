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
    * When Type is HIVE, the value is Hive query ID; when Type is MAPREDUCE, SPARK or TEZ, the value is YarnAppID.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Insight application type. Value values: HIVE, SPARK, MAPREDUCE, and TEZ.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Insight rule ID.
HIVE-ScanManyMeta: too much scanned metadata.
HIVE-ScanManyPartition: large table scanning.
HIVE-SlowCompile: compilation duration too long.
HIVE-UnSuitableConfig: improper parameter.
MAPREDUCE-MapperDataSkew: Map data skew.
MAPREDUCE-MapperMemWaste: MapMemory resource waste.
MAPREDUCE-MapperSlowTask: slow map task.
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded: peak memory exceeded.
MAPREDUCE-ReducerDataSkew: Reduce data skew.
MAPREDUCE-ReducerMemWaste: ReduceMemory resource waste.
MAPREDUCE-ReducerSlowTask: slow reduce task.
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay: scheduling delay.
SPARK-CpuWaste: CPU resource waste.
SPARK-DataSkew: data skew.
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded: peak memory exceeded.
SPARK-MemWaste: Memory resource waste.
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew: scheduling skew.
SPARK-SlowTask: slow task.
TEZ-DataSkew: data skew.
TEZ-MapperDataSkew: Map data skew.
TEZ-ReducerDataSkew: Reduce data skew.
TEZ-TezMemWaste: Memory resource waste.
TEZ-TezSlowTask: slow task.
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
    * Insight rules interpretation.
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
    * Anomaly metrics measure insight severity. Higher values indicate greater severity within the same insight category. Metrics across different insight types cannot be meaningfully compared.
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
    * Scheduling flow, DAG.
    */
    @SerializedName("ScheduleFlowName")
    @Expose
    private String ScheduleFlowName;

    /**
    * A Task node in the scheduling flow.
    */
    @SerializedName("ScheduleTaskName")
    @Expose
    private String ScheduleTaskName;

    /**
    * Core configurations for Yarn tasks.
    */
    @SerializedName("JobConf")
    @Expose
    private String JobConf;

    /**
    * Insight structure information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get When Type is HIVE, the value is Hive query ID; when Type is MAPREDUCE, SPARK or TEZ, the value is YarnAppID. 
     * @return ID When Type is HIVE, the value is Hive query ID; when Type is MAPREDUCE, SPARK or TEZ, the value is YarnAppID.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set When Type is HIVE, the value is Hive query ID; when Type is MAPREDUCE, SPARK or TEZ, the value is YarnAppID.
     * @param ID When Type is HIVE, the value is Hive query ID; when Type is MAPREDUCE, SPARK or TEZ, the value is YarnAppID.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Insight application type. Value values: HIVE, SPARK, MAPREDUCE, and TEZ. 
     * @return Type Insight application type. Value values: HIVE, SPARK, MAPREDUCE, and TEZ.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Insight application type. Value values: HIVE, SPARK, MAPREDUCE, and TEZ.
     * @param Type Insight application type. Value values: HIVE, SPARK, MAPREDUCE, and TEZ.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Insight rule ID.
HIVE-ScanManyMeta: too much scanned metadata.
HIVE-ScanManyPartition: large table scanning.
HIVE-SlowCompile: compilation duration too long.
HIVE-UnSuitableConfig: improper parameter.
MAPREDUCE-MapperDataSkew: Map data skew.
MAPREDUCE-MapperMemWaste: MapMemory resource waste.
MAPREDUCE-MapperSlowTask: slow map task.
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded: peak memory exceeded.
MAPREDUCE-ReducerDataSkew: Reduce data skew.
MAPREDUCE-ReducerMemWaste: ReduceMemory resource waste.
MAPREDUCE-ReducerSlowTask: slow reduce task.
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay: scheduling delay.
SPARK-CpuWaste: CPU resource waste.
SPARK-DataSkew: data skew.
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded: peak memory exceeded.
SPARK-MemWaste: Memory resource waste.
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew: scheduling skew.
SPARK-SlowTask: slow task.
TEZ-DataSkew: data skew.
TEZ-MapperDataSkew: Map data skew.
TEZ-ReducerDataSkew: Reduce data skew.
TEZ-TezMemWaste: Memory resource waste.
TEZ-TezSlowTask: slow task.
TEZ-TezTaskGC:TasksGC 
     * @return RuleID Insight rule ID.
HIVE-ScanManyMeta: too much scanned metadata.
HIVE-ScanManyPartition: large table scanning.
HIVE-SlowCompile: compilation duration too long.
HIVE-UnSuitableConfig: improper parameter.
MAPREDUCE-MapperDataSkew: Map data skew.
MAPREDUCE-MapperMemWaste: MapMemory resource waste.
MAPREDUCE-MapperSlowTask: slow map task.
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded: peak memory exceeded.
MAPREDUCE-ReducerDataSkew: Reduce data skew.
MAPREDUCE-ReducerMemWaste: ReduceMemory resource waste.
MAPREDUCE-ReducerSlowTask: slow reduce task.
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay: scheduling delay.
SPARK-CpuWaste: CPU resource waste.
SPARK-DataSkew: data skew.
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded: peak memory exceeded.
SPARK-MemWaste: Memory resource waste.
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew: scheduling skew.
SPARK-SlowTask: slow task.
TEZ-DataSkew: data skew.
TEZ-MapperDataSkew: Map data skew.
TEZ-ReducerDataSkew: Reduce data skew.
TEZ-TezMemWaste: Memory resource waste.
TEZ-TezSlowTask: slow task.
TEZ-TezTaskGC:TasksGC
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Insight rule ID.
HIVE-ScanManyMeta: too much scanned metadata.
HIVE-ScanManyPartition: large table scanning.
HIVE-SlowCompile: compilation duration too long.
HIVE-UnSuitableConfig: improper parameter.
MAPREDUCE-MapperDataSkew: Map data skew.
MAPREDUCE-MapperMemWaste: MapMemory resource waste.
MAPREDUCE-MapperSlowTask: slow map task.
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded: peak memory exceeded.
MAPREDUCE-ReducerDataSkew: Reduce data skew.
MAPREDUCE-ReducerMemWaste: ReduceMemory resource waste.
MAPREDUCE-ReducerSlowTask: slow reduce task.
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay: scheduling delay.
SPARK-CpuWaste: CPU resource waste.
SPARK-DataSkew: data skew.
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded: peak memory exceeded.
SPARK-MemWaste: Memory resource waste.
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew: scheduling skew.
SPARK-SlowTask: slow task.
TEZ-DataSkew: data skew.
TEZ-MapperDataSkew: Map data skew.
TEZ-ReducerDataSkew: Reduce data skew.
TEZ-TezMemWaste: Memory resource waste.
TEZ-TezSlowTask: slow task.
TEZ-TezTaskGC:TasksGC
     * @param RuleID Insight rule ID.
HIVE-ScanManyMeta: too much scanned metadata.
HIVE-ScanManyPartition: large table scanning.
HIVE-SlowCompile: compilation duration too long.
HIVE-UnSuitableConfig: improper parameter.
MAPREDUCE-MapperDataSkew: Map data skew.
MAPREDUCE-MapperMemWaste: MapMemory resource waste.
MAPREDUCE-MapperSlowTask: slow map task.
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded: peak memory exceeded.
MAPREDUCE-ReducerDataSkew: Reduce data skew.
MAPREDUCE-ReducerMemWaste: ReduceMemory resource waste.
MAPREDUCE-ReducerSlowTask: slow reduce task.
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay: scheduling delay.
SPARK-CpuWaste: CPU resource waste.
SPARK-DataSkew: data skew.
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded: peak memory exceeded.
SPARK-MemWaste: Memory resource waste.
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew: scheduling skew.
SPARK-SlowTask: slow task.
TEZ-DataSkew: data skew.
TEZ-MapperDataSkew: Map data skew.
TEZ-ReducerDataSkew: Reduce data skew.
TEZ-TezMemWaste: Memory resource waste.
TEZ-TezSlowTask: slow task.
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
     * Get Insight rules interpretation. 
     * @return RuleExplain Insight rules interpretation.
     */
    public String getRuleExplain() {
        return this.RuleExplain;
    }

    /**
     * Set Insight rules interpretation.
     * @param RuleExplain Insight rules interpretation.
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
     * Get Anomaly metrics measure insight severity. Higher values indicate greater severity within the same insight category. Metrics across different insight types cannot be meaningfully compared. 
     * @return Value Anomaly metrics measure insight severity. Higher values indicate greater severity within the same insight category. Metrics across different insight types cannot be meaningfully compared.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Anomaly metrics measure insight severity. Higher values indicate greater severity within the same insight category. Metrics across different insight types cannot be meaningfully compared.
     * @param Value Anomaly metrics measure insight severity. Higher values indicate greater severity within the same insight category. Metrics across different insight types cannot be meaningfully compared.
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
     * Get Scheduling flow, DAG. 
     * @return ScheduleFlowName Scheduling flow, DAG.
     */
    public String getScheduleFlowName() {
        return this.ScheduleFlowName;
    }

    /**
     * Set Scheduling flow, DAG.
     * @param ScheduleFlowName Scheduling flow, DAG.
     */
    public void setScheduleFlowName(String ScheduleFlowName) {
        this.ScheduleFlowName = ScheduleFlowName;
    }

    /**
     * Get A Task node in the scheduling flow. 
     * @return ScheduleTaskName A Task node in the scheduling flow.
     */
    public String getScheduleTaskName() {
        return this.ScheduleTaskName;
    }

    /**
     * Set A Task node in the scheduling flow.
     * @param ScheduleTaskName A Task node in the scheduling flow.
     */
    public void setScheduleTaskName(String ScheduleTaskName) {
        this.ScheduleTaskName = ScheduleTaskName;
    }

    /**
     * Get Core configurations for Yarn tasks. 
     * @return JobConf Core configurations for Yarn tasks.
     */
    public String getJobConf() {
        return this.JobConf;
    }

    /**
     * Set Core configurations for Yarn tasks.
     * @param JobConf Core configurations for Yarn tasks.
     */
    public void setJobConf(String JobConf) {
        this.JobConf = JobConf;
    }

    /**
     * Get Insight structure information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Context Insight structure information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Insight structure information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Context Insight structure information.
Note: This field may return null, indicating that no valid values can be obtained.
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

