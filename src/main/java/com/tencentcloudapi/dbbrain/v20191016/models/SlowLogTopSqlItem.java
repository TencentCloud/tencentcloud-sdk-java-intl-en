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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogTopSqlItem extends AbstractModel{

    /**
    * Total SQL lock wait time
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * Maximum lock wait time
    */
    @SerializedName("LockTimeMax")
    @Expose
    private Float LockTimeMax;

    /**
    * Minimum lock wait time
    */
    @SerializedName("LockTimeMin")
    @Expose
    private Float LockTimeMin;

    /**
    * Total number of scanned rows
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * Maximum number of scanned rows
    */
    @SerializedName("RowsExaminedMax")
    @Expose
    private Long RowsExaminedMax;

    /**
    * Minimum number of scanned rows
    */
    @SerializedName("RowsExaminedMin")
    @Expose
    private Long RowsExaminedMin;

    /**
    * Total duration
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * Maximum execution time
    */
    @SerializedName("QueryTimeMax")
    @Expose
    private Float QueryTimeMax;

    /**
    * Minimum execution time
    */
    @SerializedName("QueryTimeMin")
    @Expose
    private Float QueryTimeMin;

    /**
    * Total number of returned rows
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * Maximum number of returned rows
    */
    @SerializedName("RowsSentMax")
    @Expose
    private Long RowsSentMax;

    /**
    * Minimum number of returned rows
    */
    @SerializedName("RowsSentMin")
    @Expose
    private Long RowsSentMin;

    /**
    * Number of executions
    */
    @SerializedName("ExecTimes")
    @Expose
    private Long ExecTimes;

    /**
    * SQL template
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * SQL with parameter (random)
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * Schema
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * Ratio of total duration
    */
    @SerializedName("QueryTimeRatio")
    @Expose
    private Float QueryTimeRatio;

    /**
    * Ratio of total SQL lock wait time
    */
    @SerializedName("LockTimeRatio")
    @Expose
    private Float LockTimeRatio;

    /**
    * Ratio of total number of scanned rows
    */
    @SerializedName("RowsExaminedRatio")
    @Expose
    private Float RowsExaminedRatio;

    /**
    * Ratio of total number of returned rows
    */
    @SerializedName("RowsSentRatio")
    @Expose
    private Float RowsSentRatio;

    /**
     * Get Total SQL lock wait time 
     * @return LockTime Total SQL lock wait time
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set Total SQL lock wait time
     * @param LockTime Total SQL lock wait time
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get Maximum lock wait time 
     * @return LockTimeMax Maximum lock wait time
     */
    public Float getLockTimeMax() {
        return this.LockTimeMax;
    }

    /**
     * Set Maximum lock wait time
     * @param LockTimeMax Maximum lock wait time
     */
    public void setLockTimeMax(Float LockTimeMax) {
        this.LockTimeMax = LockTimeMax;
    }

    /**
     * Get Minimum lock wait time 
     * @return LockTimeMin Minimum lock wait time
     */
    public Float getLockTimeMin() {
        return this.LockTimeMin;
    }

    /**
     * Set Minimum lock wait time
     * @param LockTimeMin Minimum lock wait time
     */
    public void setLockTimeMin(Float LockTimeMin) {
        this.LockTimeMin = LockTimeMin;
    }

    /**
     * Get Total number of scanned rows 
     * @return RowsExamined Total number of scanned rows
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set Total number of scanned rows
     * @param RowsExamined Total number of scanned rows
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get Maximum number of scanned rows 
     * @return RowsExaminedMax Maximum number of scanned rows
     */
    public Long getRowsExaminedMax() {
        return this.RowsExaminedMax;
    }

    /**
     * Set Maximum number of scanned rows
     * @param RowsExaminedMax Maximum number of scanned rows
     */
    public void setRowsExaminedMax(Long RowsExaminedMax) {
        this.RowsExaminedMax = RowsExaminedMax;
    }

    /**
     * Get Minimum number of scanned rows 
     * @return RowsExaminedMin Minimum number of scanned rows
     */
    public Long getRowsExaminedMin() {
        return this.RowsExaminedMin;
    }

    /**
     * Set Minimum number of scanned rows
     * @param RowsExaminedMin Minimum number of scanned rows
     */
    public void setRowsExaminedMin(Long RowsExaminedMin) {
        this.RowsExaminedMin = RowsExaminedMin;
    }

    /**
     * Get Total duration 
     * @return QueryTime Total duration
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Total duration
     * @param QueryTime Total duration
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get Maximum execution time 
     * @return QueryTimeMax Maximum execution time
     */
    public Float getQueryTimeMax() {
        return this.QueryTimeMax;
    }

    /**
     * Set Maximum execution time
     * @param QueryTimeMax Maximum execution time
     */
    public void setQueryTimeMax(Float QueryTimeMax) {
        this.QueryTimeMax = QueryTimeMax;
    }

    /**
     * Get Minimum execution time 
     * @return QueryTimeMin Minimum execution time
     */
    public Float getQueryTimeMin() {
        return this.QueryTimeMin;
    }

    /**
     * Set Minimum execution time
     * @param QueryTimeMin Minimum execution time
     */
    public void setQueryTimeMin(Float QueryTimeMin) {
        this.QueryTimeMin = QueryTimeMin;
    }

    /**
     * Get Total number of returned rows 
     * @return RowsSent Total number of returned rows
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set Total number of returned rows
     * @param RowsSent Total number of returned rows
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get Maximum number of returned rows 
     * @return RowsSentMax Maximum number of returned rows
     */
    public Long getRowsSentMax() {
        return this.RowsSentMax;
    }

    /**
     * Set Maximum number of returned rows
     * @param RowsSentMax Maximum number of returned rows
     */
    public void setRowsSentMax(Long RowsSentMax) {
        this.RowsSentMax = RowsSentMax;
    }

    /**
     * Get Minimum number of returned rows 
     * @return RowsSentMin Minimum number of returned rows
     */
    public Long getRowsSentMin() {
        return this.RowsSentMin;
    }

    /**
     * Set Minimum number of returned rows
     * @param RowsSentMin Minimum number of returned rows
     */
    public void setRowsSentMin(Long RowsSentMin) {
        this.RowsSentMin = RowsSentMin;
    }

    /**
     * Get Number of executions 
     * @return ExecTimes Number of executions
     */
    public Long getExecTimes() {
        return this.ExecTimes;
    }

    /**
     * Set Number of executions
     * @param ExecTimes Number of executions
     */
    public void setExecTimes(Long ExecTimes) {
        this.ExecTimes = ExecTimes;
    }

    /**
     * Get SQL template 
     * @return SqlTemplate SQL template
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set SQL template
     * @param SqlTemplate SQL template
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get SQL with parameter (random) 
     * @return SqlText SQL with parameter (random)
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set SQL with parameter (random)
     * @param SqlText SQL with parameter (random)
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get Schema 
     * @return Schema Schema
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set Schema
     * @param Schema Schema
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get Ratio of total duration 
     * @return QueryTimeRatio Ratio of total duration
     */
    public Float getQueryTimeRatio() {
        return this.QueryTimeRatio;
    }

    /**
     * Set Ratio of total duration
     * @param QueryTimeRatio Ratio of total duration
     */
    public void setQueryTimeRatio(Float QueryTimeRatio) {
        this.QueryTimeRatio = QueryTimeRatio;
    }

    /**
     * Get Ratio of total SQL lock wait time 
     * @return LockTimeRatio Ratio of total SQL lock wait time
     */
    public Float getLockTimeRatio() {
        return this.LockTimeRatio;
    }

    /**
     * Set Ratio of total SQL lock wait time
     * @param LockTimeRatio Ratio of total SQL lock wait time
     */
    public void setLockTimeRatio(Float LockTimeRatio) {
        this.LockTimeRatio = LockTimeRatio;
    }

    /**
     * Get Ratio of total number of scanned rows 
     * @return RowsExaminedRatio Ratio of total number of scanned rows
     */
    public Float getRowsExaminedRatio() {
        return this.RowsExaminedRatio;
    }

    /**
     * Set Ratio of total number of scanned rows
     * @param RowsExaminedRatio Ratio of total number of scanned rows
     */
    public void setRowsExaminedRatio(Float RowsExaminedRatio) {
        this.RowsExaminedRatio = RowsExaminedRatio;
    }

    /**
     * Get Ratio of total number of returned rows 
     * @return RowsSentRatio Ratio of total number of returned rows
     */
    public Float getRowsSentRatio() {
        return this.RowsSentRatio;
    }

    /**
     * Set Ratio of total number of returned rows
     * @param RowsSentRatio Ratio of total number of returned rows
     */
    public void setRowsSentRatio(Float RowsSentRatio) {
        this.RowsSentRatio = RowsSentRatio;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "LockTimeMax", this.LockTimeMax);
        this.setParamSimple(map, prefix + "LockTimeMin", this.LockTimeMin);
        this.setParamSimple(map, prefix + "RowsExamined", this.RowsExamined);
        this.setParamSimple(map, prefix + "RowsExaminedMax", this.RowsExaminedMax);
        this.setParamSimple(map, prefix + "RowsExaminedMin", this.RowsExaminedMin);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "QueryTimeMax", this.QueryTimeMax);
        this.setParamSimple(map, prefix + "QueryTimeMin", this.QueryTimeMin);
        this.setParamSimple(map, prefix + "RowsSent", this.RowsSent);
        this.setParamSimple(map, prefix + "RowsSentMax", this.RowsSentMax);
        this.setParamSimple(map, prefix + "RowsSentMin", this.RowsSentMin);
        this.setParamSimple(map, prefix + "ExecTimes", this.ExecTimes);
        this.setParamSimple(map, prefix + "SqlTemplate", this.SqlTemplate);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "QueryTimeRatio", this.QueryTimeRatio);
        this.setParamSimple(map, prefix + "LockTimeRatio", this.LockTimeRatio);
        this.setParamSimple(map, prefix + "RowsExaminedRatio", this.RowsExaminedRatio);
        this.setParamSimple(map, prefix + "RowsSentRatio", this.RowsSentRatio);

    }
}

