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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutionPlanDetail extends AbstractModel {

    /**
    * <p>Template ID</p>
    */
    @SerializedName("TemplateID")
    @Expose
    private String TemplateID;

    /**
    * <p>Database name.</p>
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * <p>Original SQL sample</p>
    */
    @SerializedName("SQLSample")
    @Expose
    private String SQLSample;

    /**
    * <p>Sample SQL after rewrite</p>
    */
    @SerializedName("SQLSampleRewritten")
    @Expose
    private String SQLSampleRewritten;

    /**
    * <p>Execution plan before optimization - List</p>
    */
    @SerializedName("TablePlanBefore")
    @Expose
    private ExplainRow [] TablePlanBefore;

    /**
    * <p>Execution plan after optimization - List</p>
    */
    @SerializedName("TablePlanAfter")
    @Expose
    private ExplainRow [] TablePlanAfter;

    /**
    * <p>Tree execution plan before optimization</p>
    */
    @SerializedName("TreePlanBefore")
    @Expose
    private String TreePlanBefore;

    /**
    * <p>Tree execution plan after optimization</p>
    */
    @SerializedName("TreePlanAfter")
    @Expose
    private String TreePlanAfter;

    /**
    * <p>Query time before optimization</p>
    */
    @SerializedName("QueryTimeBefore")
    @Expose
    private Float QueryTimeBefore;

    /**
    * <p>Query time after optimization</p>
    */
    @SerializedName("QueryTimeAfter")
    @Expose
    private Float QueryTimeAfter;

    /**
    * <p>Number of scanned rows before optimization</p>
    */
    @SerializedName("SQLScanRowsBefore")
    @Expose
    private Long SQLScanRowsBefore;

    /**
    * <p>Number of scanned rows after optimization</p>
    */
    @SerializedName("SQLScanRowsAfter")
    @Expose
    private Long SQLScanRowsAfter;

    /**
     * Get <p>Template ID</p> 
     * @return TemplateID <p>Template ID</p>
     */
    public String getTemplateID() {
        return this.TemplateID;
    }

    /**
     * Set <p>Template ID</p>
     * @param TemplateID <p>Template ID</p>
     */
    public void setTemplateID(String TemplateID) {
        this.TemplateID = TemplateID;
    }

    /**
     * Get <p>Database name.</p> 
     * @return Db <p>Database name.</p>
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set <p>Database name.</p>
     * @param Db <p>Database name.</p>
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get <p>Original SQL sample</p> 
     * @return SQLSample <p>Original SQL sample</p>
     */
    public String getSQLSample() {
        return this.SQLSample;
    }

    /**
     * Set <p>Original SQL sample</p>
     * @param SQLSample <p>Original SQL sample</p>
     */
    public void setSQLSample(String SQLSample) {
        this.SQLSample = SQLSample;
    }

    /**
     * Get <p>Sample SQL after rewrite</p> 
     * @return SQLSampleRewritten <p>Sample SQL after rewrite</p>
     */
    public String getSQLSampleRewritten() {
        return this.SQLSampleRewritten;
    }

    /**
     * Set <p>Sample SQL after rewrite</p>
     * @param SQLSampleRewritten <p>Sample SQL after rewrite</p>
     */
    public void setSQLSampleRewritten(String SQLSampleRewritten) {
        this.SQLSampleRewritten = SQLSampleRewritten;
    }

    /**
     * Get <p>Execution plan before optimization - List</p> 
     * @return TablePlanBefore <p>Execution plan before optimization - List</p>
     */
    public ExplainRow [] getTablePlanBefore() {
        return this.TablePlanBefore;
    }

    /**
     * Set <p>Execution plan before optimization - List</p>
     * @param TablePlanBefore <p>Execution plan before optimization - List</p>
     */
    public void setTablePlanBefore(ExplainRow [] TablePlanBefore) {
        this.TablePlanBefore = TablePlanBefore;
    }

    /**
     * Get <p>Execution plan after optimization - List</p> 
     * @return TablePlanAfter <p>Execution plan after optimization - List</p>
     */
    public ExplainRow [] getTablePlanAfter() {
        return this.TablePlanAfter;
    }

    /**
     * Set <p>Execution plan after optimization - List</p>
     * @param TablePlanAfter <p>Execution plan after optimization - List</p>
     */
    public void setTablePlanAfter(ExplainRow [] TablePlanAfter) {
        this.TablePlanAfter = TablePlanAfter;
    }

    /**
     * Get <p>Tree execution plan before optimization</p> 
     * @return TreePlanBefore <p>Tree execution plan before optimization</p>
     */
    public String getTreePlanBefore() {
        return this.TreePlanBefore;
    }

    /**
     * Set <p>Tree execution plan before optimization</p>
     * @param TreePlanBefore <p>Tree execution plan before optimization</p>
     */
    public void setTreePlanBefore(String TreePlanBefore) {
        this.TreePlanBefore = TreePlanBefore;
    }

    /**
     * Get <p>Tree execution plan after optimization</p> 
     * @return TreePlanAfter <p>Tree execution plan after optimization</p>
     */
    public String getTreePlanAfter() {
        return this.TreePlanAfter;
    }

    /**
     * Set <p>Tree execution plan after optimization</p>
     * @param TreePlanAfter <p>Tree execution plan after optimization</p>
     */
    public void setTreePlanAfter(String TreePlanAfter) {
        this.TreePlanAfter = TreePlanAfter;
    }

    /**
     * Get <p>Query time before optimization</p> 
     * @return QueryTimeBefore <p>Query time before optimization</p>
     */
    public Float getQueryTimeBefore() {
        return this.QueryTimeBefore;
    }

    /**
     * Set <p>Query time before optimization</p>
     * @param QueryTimeBefore <p>Query time before optimization</p>
     */
    public void setQueryTimeBefore(Float QueryTimeBefore) {
        this.QueryTimeBefore = QueryTimeBefore;
    }

    /**
     * Get <p>Query time after optimization</p> 
     * @return QueryTimeAfter <p>Query time after optimization</p>
     */
    public Float getQueryTimeAfter() {
        return this.QueryTimeAfter;
    }

    /**
     * Set <p>Query time after optimization</p>
     * @param QueryTimeAfter <p>Query time after optimization</p>
     */
    public void setQueryTimeAfter(Float QueryTimeAfter) {
        this.QueryTimeAfter = QueryTimeAfter;
    }

    /**
     * Get <p>Number of scanned rows before optimization</p> 
     * @return SQLScanRowsBefore <p>Number of scanned rows before optimization</p>
     */
    public Long getSQLScanRowsBefore() {
        return this.SQLScanRowsBefore;
    }

    /**
     * Set <p>Number of scanned rows before optimization</p>
     * @param SQLScanRowsBefore <p>Number of scanned rows before optimization</p>
     */
    public void setSQLScanRowsBefore(Long SQLScanRowsBefore) {
        this.SQLScanRowsBefore = SQLScanRowsBefore;
    }

    /**
     * Get <p>Number of scanned rows after optimization</p> 
     * @return SQLScanRowsAfter <p>Number of scanned rows after optimization</p>
     */
    public Long getSQLScanRowsAfter() {
        return this.SQLScanRowsAfter;
    }

    /**
     * Set <p>Number of scanned rows after optimization</p>
     * @param SQLScanRowsAfter <p>Number of scanned rows after optimization</p>
     */
    public void setSQLScanRowsAfter(Long SQLScanRowsAfter) {
        this.SQLScanRowsAfter = SQLScanRowsAfter;
    }

    public ExecutionPlanDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutionPlanDetail(ExecutionPlanDetail source) {
        if (source.TemplateID != null) {
            this.TemplateID = new String(source.TemplateID);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.SQLSample != null) {
            this.SQLSample = new String(source.SQLSample);
        }
        if (source.SQLSampleRewritten != null) {
            this.SQLSampleRewritten = new String(source.SQLSampleRewritten);
        }
        if (source.TablePlanBefore != null) {
            this.TablePlanBefore = new ExplainRow[source.TablePlanBefore.length];
            for (int i = 0; i < source.TablePlanBefore.length; i++) {
                this.TablePlanBefore[i] = new ExplainRow(source.TablePlanBefore[i]);
            }
        }
        if (source.TablePlanAfter != null) {
            this.TablePlanAfter = new ExplainRow[source.TablePlanAfter.length];
            for (int i = 0; i < source.TablePlanAfter.length; i++) {
                this.TablePlanAfter[i] = new ExplainRow(source.TablePlanAfter[i]);
            }
        }
        if (source.TreePlanBefore != null) {
            this.TreePlanBefore = new String(source.TreePlanBefore);
        }
        if (source.TreePlanAfter != null) {
            this.TreePlanAfter = new String(source.TreePlanAfter);
        }
        if (source.QueryTimeBefore != null) {
            this.QueryTimeBefore = new Float(source.QueryTimeBefore);
        }
        if (source.QueryTimeAfter != null) {
            this.QueryTimeAfter = new Float(source.QueryTimeAfter);
        }
        if (source.SQLScanRowsBefore != null) {
            this.SQLScanRowsBefore = new Long(source.SQLScanRowsBefore);
        }
        if (source.SQLScanRowsAfter != null) {
            this.SQLScanRowsAfter = new Long(source.SQLScanRowsAfter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateID", this.TemplateID);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "SQLSample", this.SQLSample);
        this.setParamSimple(map, prefix + "SQLSampleRewritten", this.SQLSampleRewritten);
        this.setParamArrayObj(map, prefix + "TablePlanBefore.", this.TablePlanBefore);
        this.setParamArrayObj(map, prefix + "TablePlanAfter.", this.TablePlanAfter);
        this.setParamSimple(map, prefix + "TreePlanBefore", this.TreePlanBefore);
        this.setParamSimple(map, prefix + "TreePlanAfter", this.TreePlanAfter);
        this.setParamSimple(map, prefix + "QueryTimeBefore", this.QueryTimeBefore);
        this.setParamSimple(map, prefix + "QueryTimeAfter", this.QueryTimeAfter);
        this.setParamSimple(map, prefix + "SQLScanRowsBefore", this.SQLScanRowsBefore);
        this.setParamSimple(map, prefix + "SQLScanRowsAfter", this.SQLScanRowsAfter);

    }
}

