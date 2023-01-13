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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogTopSqlItem extends AbstractModel{

    /**
    * Total SQL lock wait time in seconds.
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * Maximum lock wait time in seconds
    */
    @SerializedName("LockTimeMax")
    @Expose
    private Float LockTimeMax;

    /**
    * Minimum lock wait time in seconds
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
    * Total duration in seconds
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * Maximum execution time in seconds
    */
    @SerializedName("QueryTimeMax")
    @Expose
    private Float QueryTimeMax;

    /**
    * Minimum execution time in seconds
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
    * SQL statements with parameter (random)
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * Database name
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * Ratio of the total duration in %
    */
    @SerializedName("QueryTimeRatio")
    @Expose
    private Float QueryTimeRatio;

    /**
    * Ratio of the total SQL lock wait time in %
    */
    @SerializedName("LockTimeRatio")
    @Expose
    private Float LockTimeRatio;

    /**
    * Ratio of total number of scanned rows in %
    */
    @SerializedName("RowsExaminedRatio")
    @Expose
    private Float RowsExaminedRatio;

    /**
    * Ratio of total number of returned rows in %
    */
    @SerializedName("RowsSentRatio")
    @Expose
    private Float RowsSentRatio;

    /**
    * Average execution time in seconds
    */
    @SerializedName("QueryTimeAvg")
    @Expose
    private Float QueryTimeAvg;

    /**
    * Average number of returned rows
    */
    @SerializedName("RowsSentAvg")
    @Expose
    private Float RowsSentAvg;

    /**
    * Average lock wait time in seconds
    */
    @SerializedName("LockTimeAvg")
    @Expose
    private Float LockTimeAvg;

    /**
    * Average number of scanned rows
    */
    @SerializedName("RowsExaminedAvg")
    @Expose
    private Float RowsExaminedAvg;

    /**
    * MD5 value of the SQL template
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
     * Get Total SQL lock wait time in seconds. 
     * @return LockTime Total SQL lock wait time in seconds.
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set Total SQL lock wait time in seconds.
     * @param LockTime Total SQL lock wait time in seconds.
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get Maximum lock wait time in seconds 
     * @return LockTimeMax Maximum lock wait time in seconds
     */
    public Float getLockTimeMax() {
        return this.LockTimeMax;
    }

    /**
     * Set Maximum lock wait time in seconds
     * @param LockTimeMax Maximum lock wait time in seconds
     */
    public void setLockTimeMax(Float LockTimeMax) {
        this.LockTimeMax = LockTimeMax;
    }

    /**
     * Get Minimum lock wait time in seconds 
     * @return LockTimeMin Minimum lock wait time in seconds
     */
    public Float getLockTimeMin() {
        return this.LockTimeMin;
    }

    /**
     * Set Minimum lock wait time in seconds
     * @param LockTimeMin Minimum lock wait time in seconds
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
     * Get Total duration in seconds 
     * @return QueryTime Total duration in seconds
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set Total duration in seconds
     * @param QueryTime Total duration in seconds
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get Maximum execution time in seconds 
     * @return QueryTimeMax Maximum execution time in seconds
     */
    public Float getQueryTimeMax() {
        return this.QueryTimeMax;
    }

    /**
     * Set Maximum execution time in seconds
     * @param QueryTimeMax Maximum execution time in seconds
     */
    public void setQueryTimeMax(Float QueryTimeMax) {
        this.QueryTimeMax = QueryTimeMax;
    }

    /**
     * Get Minimum execution time in seconds 
     * @return QueryTimeMin Minimum execution time in seconds
     */
    public Float getQueryTimeMin() {
        return this.QueryTimeMin;
    }

    /**
     * Set Minimum execution time in seconds
     * @param QueryTimeMin Minimum execution time in seconds
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
     * Get SQL statements with parameter (random) 
     * @return SqlText SQL statements with parameter (random)
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set SQL statements with parameter (random)
     * @param SqlText SQL statements with parameter (random)
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get Database name 
     * @return Schema Database name
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set Database name
     * @param Schema Database name
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get Ratio of the total duration in % 
     * @return QueryTimeRatio Ratio of the total duration in %
     */
    public Float getQueryTimeRatio() {
        return this.QueryTimeRatio;
    }

    /**
     * Set Ratio of the total duration in %
     * @param QueryTimeRatio Ratio of the total duration in %
     */
    public void setQueryTimeRatio(Float QueryTimeRatio) {
        this.QueryTimeRatio = QueryTimeRatio;
    }

    /**
     * Get Ratio of the total SQL lock wait time in % 
     * @return LockTimeRatio Ratio of the total SQL lock wait time in %
     */
    public Float getLockTimeRatio() {
        return this.LockTimeRatio;
    }

    /**
     * Set Ratio of the total SQL lock wait time in %
     * @param LockTimeRatio Ratio of the total SQL lock wait time in %
     */
    public void setLockTimeRatio(Float LockTimeRatio) {
        this.LockTimeRatio = LockTimeRatio;
    }

    /**
     * Get Ratio of total number of scanned rows in % 
     * @return RowsExaminedRatio Ratio of total number of scanned rows in %
     */
    public Float getRowsExaminedRatio() {
        return this.RowsExaminedRatio;
    }

    /**
     * Set Ratio of total number of scanned rows in %
     * @param RowsExaminedRatio Ratio of total number of scanned rows in %
     */
    public void setRowsExaminedRatio(Float RowsExaminedRatio) {
        this.RowsExaminedRatio = RowsExaminedRatio;
    }

    /**
     * Get Ratio of total number of returned rows in % 
     * @return RowsSentRatio Ratio of total number of returned rows in %
     */
    public Float getRowsSentRatio() {
        return this.RowsSentRatio;
    }

    /**
     * Set Ratio of total number of returned rows in %
     * @param RowsSentRatio Ratio of total number of returned rows in %
     */
    public void setRowsSentRatio(Float RowsSentRatio) {
        this.RowsSentRatio = RowsSentRatio;
    }

    /**
     * Get Average execution time in seconds 
     * @return QueryTimeAvg Average execution time in seconds
     */
    public Float getQueryTimeAvg() {
        return this.QueryTimeAvg;
    }

    /**
     * Set Average execution time in seconds
     * @param QueryTimeAvg Average execution time in seconds
     */
    public void setQueryTimeAvg(Float QueryTimeAvg) {
        this.QueryTimeAvg = QueryTimeAvg;
    }

    /**
     * Get Average number of returned rows 
     * @return RowsSentAvg Average number of returned rows
     */
    public Float getRowsSentAvg() {
        return this.RowsSentAvg;
    }

    /**
     * Set Average number of returned rows
     * @param RowsSentAvg Average number of returned rows
     */
    public void setRowsSentAvg(Float RowsSentAvg) {
        this.RowsSentAvg = RowsSentAvg;
    }

    /**
     * Get Average lock wait time in seconds 
     * @return LockTimeAvg Average lock wait time in seconds
     */
    public Float getLockTimeAvg() {
        return this.LockTimeAvg;
    }

    /**
     * Set Average lock wait time in seconds
     * @param LockTimeAvg Average lock wait time in seconds
     */
    public void setLockTimeAvg(Float LockTimeAvg) {
        this.LockTimeAvg = LockTimeAvg;
    }

    /**
     * Get Average number of scanned rows 
     * @return RowsExaminedAvg Average number of scanned rows
     */
    public Float getRowsExaminedAvg() {
        return this.RowsExaminedAvg;
    }

    /**
     * Set Average number of scanned rows
     * @param RowsExaminedAvg Average number of scanned rows
     */
    public void setRowsExaminedAvg(Float RowsExaminedAvg) {
        this.RowsExaminedAvg = RowsExaminedAvg;
    }

    /**
     * Get MD5 value of the SQL template 
     * @return Md5 MD5 value of the SQL template
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set MD5 value of the SQL template
     * @param Md5 MD5 value of the SQL template
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    public SlowLogTopSqlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogTopSqlItem(SlowLogTopSqlItem source) {
        if (source.LockTime != null) {
            this.LockTime = new Float(source.LockTime);
        }
        if (source.LockTimeMax != null) {
            this.LockTimeMax = new Float(source.LockTimeMax);
        }
        if (source.LockTimeMin != null) {
            this.LockTimeMin = new Float(source.LockTimeMin);
        }
        if (source.RowsExamined != null) {
            this.RowsExamined = new Long(source.RowsExamined);
        }
        if (source.RowsExaminedMax != null) {
            this.RowsExaminedMax = new Long(source.RowsExaminedMax);
        }
        if (source.RowsExaminedMin != null) {
            this.RowsExaminedMin = new Long(source.RowsExaminedMin);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Float(source.QueryTime);
        }
        if (source.QueryTimeMax != null) {
            this.QueryTimeMax = new Float(source.QueryTimeMax);
        }
        if (source.QueryTimeMin != null) {
            this.QueryTimeMin = new Float(source.QueryTimeMin);
        }
        if (source.RowsSent != null) {
            this.RowsSent = new Long(source.RowsSent);
        }
        if (source.RowsSentMax != null) {
            this.RowsSentMax = new Long(source.RowsSentMax);
        }
        if (source.RowsSentMin != null) {
            this.RowsSentMin = new Long(source.RowsSentMin);
        }
        if (source.ExecTimes != null) {
            this.ExecTimes = new Long(source.ExecTimes);
        }
        if (source.SqlTemplate != null) {
            this.SqlTemplate = new String(source.SqlTemplate);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.QueryTimeRatio != null) {
            this.QueryTimeRatio = new Float(source.QueryTimeRatio);
        }
        if (source.LockTimeRatio != null) {
            this.LockTimeRatio = new Float(source.LockTimeRatio);
        }
        if (source.RowsExaminedRatio != null) {
            this.RowsExaminedRatio = new Float(source.RowsExaminedRatio);
        }
        if (source.RowsSentRatio != null) {
            this.RowsSentRatio = new Float(source.RowsSentRatio);
        }
        if (source.QueryTimeAvg != null) {
            this.QueryTimeAvg = new Float(source.QueryTimeAvg);
        }
        if (source.RowsSentAvg != null) {
            this.RowsSentAvg = new Float(source.RowsSentAvg);
        }
        if (source.LockTimeAvg != null) {
            this.LockTimeAvg = new Float(source.LockTimeAvg);
        }
        if (source.RowsExaminedAvg != null) {
            this.RowsExaminedAvg = new Float(source.RowsExaminedAvg);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
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
        this.setParamSimple(map, prefix + "QueryTimeAvg", this.QueryTimeAvg);
        this.setParamSimple(map, prefix + "RowsSentAvg", this.RowsSentAvg);
        this.setParamSimple(map, prefix + "LockTimeAvg", this.LockTimeAvg);
        this.setParamSimple(map, prefix + "RowsExaminedAvg", this.RowsExaminedAvg);
        this.setParamSimple(map, prefix + "Md5", this.Md5);

    }
}

