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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogResponse extends AbstractModel{

    /**
    * `Context` for loading subsequent content. It will expire after 1 hour.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Whether to return all raw log query results. This parameter is meaningless if the query statement (Query) contains an SQL query.
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * Whether the return is the analysis result
    */
    @SerializedName("Analysis")
    @Expose
    private Boolean Analysis;

    /**
    * If `Analysis` is `true`, column name of the analysis result will be returned; otherwise, empty content will be returned.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ColNames")
    @Expose
    private String [] ColNames;

    /**
    * Log query result. If `Analysis` is `True`, `null` may be returned
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Results")
    @Expose
    private LogInfo [] Results;

    /**
    * Log analysis result. If `Analysis` is `False`, `null` may be returned
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AnalysisResults")
    @Expose
    private LogItems [] AnalysisResults;

    /**
    * New log analysis result, which will be valid if `UseNewAnalysis` is `true`
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AnalysisRecords")
    @Expose
    private String [] AnalysisRecords;

    /**
    * Column attribute of log analysis, which will be valid if `UseNewAnalysis` is `true`
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get `Context` for loading subsequent content. It will expire after 1 hour. 
     * @return Context `Context` for loading subsequent content. It will expire after 1 hour.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set `Context` for loading subsequent content. It will expire after 1 hour.
     * @param Context `Context` for loading subsequent content. It will expire after 1 hour.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Whether to return all raw log query results. This parameter is meaningless if the query statement (Query) contains an SQL query. 
     * @return ListOver Whether to return all raw log query results. This parameter is meaningless if the query statement (Query) contains an SQL query.
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set Whether to return all raw log query results. This parameter is meaningless if the query statement (Query) contains an SQL query.
     * @param ListOver Whether to return all raw log query results. This parameter is meaningless if the query statement (Query) contains an SQL query.
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get Whether the return is the analysis result 
     * @return Analysis Whether the return is the analysis result
     */
    public Boolean getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set Whether the return is the analysis result
     * @param Analysis Whether the return is the analysis result
     */
    public void setAnalysis(Boolean Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get If `Analysis` is `true`, column name of the analysis result will be returned; otherwise, empty content will be returned.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ColNames If `Analysis` is `true`, column name of the analysis result will be returned; otherwise, empty content will be returned.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getColNames() {
        return this.ColNames;
    }

    /**
     * Set If `Analysis` is `true`, column name of the analysis result will be returned; otherwise, empty content will be returned.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ColNames If `Analysis` is `true`, column name of the analysis result will be returned; otherwise, empty content will be returned.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setColNames(String [] ColNames) {
        this.ColNames = ColNames;
    }

    /**
     * Get Log query result. If `Analysis` is `True`, `null` may be returned
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Results Log query result. If `Analysis` is `True`, `null` may be returned
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public LogInfo [] getResults() {
        return this.Results;
    }

    /**
     * Set Log query result. If `Analysis` is `True`, `null` may be returned
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Results Log query result. If `Analysis` is `True`, `null` may be returned
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResults(LogInfo [] Results) {
        this.Results = Results;
    }

    /**
     * Get Log analysis result. If `Analysis` is `False`, `null` may be returned
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AnalysisResults Log analysis result. If `Analysis` is `False`, `null` may be returned
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public LogItems [] getAnalysisResults() {
        return this.AnalysisResults;
    }

    /**
     * Set Log analysis result. If `Analysis` is `False`, `null` may be returned
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AnalysisResults Log analysis result. If `Analysis` is `False`, `null` may be returned
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAnalysisResults(LogItems [] AnalysisResults) {
        this.AnalysisResults = AnalysisResults;
    }

    /**
     * Get New log analysis result, which will be valid if `UseNewAnalysis` is `true`
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AnalysisRecords New log analysis result, which will be valid if `UseNewAnalysis` is `true`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getAnalysisRecords() {
        return this.AnalysisRecords;
    }

    /**
     * Set New log analysis result, which will be valid if `UseNewAnalysis` is `true`
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AnalysisRecords New log analysis result, which will be valid if `UseNewAnalysis` is `true`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAnalysisRecords(String [] AnalysisRecords) {
        this.AnalysisRecords = AnalysisRecords;
    }

    /**
     * Get Column attribute of log analysis, which will be valid if `UseNewAnalysis` is `true`
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Columns Column attribute of log analysis, which will be valid if `UseNewAnalysis` is `true`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set Column attribute of log analysis, which will be valid if `UseNewAnalysis` is `true`
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Columns Column attribute of log analysis, which will be valid if `UseNewAnalysis` is `true`
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SearchLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogResponse(SearchLogResponse source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Analysis != null) {
            this.Analysis = new Boolean(source.Analysis);
        }
        if (source.ColNames != null) {
            this.ColNames = new String[source.ColNames.length];
            for (int i = 0; i < source.ColNames.length; i++) {
                this.ColNames[i] = new String(source.ColNames[i]);
            }
        }
        if (source.Results != null) {
            this.Results = new LogInfo[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new LogInfo(source.Results[i]);
            }
        }
        if (source.AnalysisResults != null) {
            this.AnalysisResults = new LogItems[source.AnalysisResults.length];
            for (int i = 0; i < source.AnalysisResults.length; i++) {
                this.AnalysisResults[i] = new LogItems(source.AnalysisResults[i]);
            }
        }
        if (source.AnalysisRecords != null) {
            this.AnalysisRecords = new String[source.AnalysisRecords.length];
            for (int i = 0; i < source.AnalysisRecords.length; i++) {
                this.AnalysisRecords[i] = new String(source.AnalysisRecords[i]);
            }
        }
        if (source.Columns != null) {
            this.Columns = new Column[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new Column(source.Columns[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamSimple(map, prefix + "Analysis", this.Analysis);
        this.setParamArraySimple(map, prefix + "ColNames.", this.ColNames);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamArrayObj(map, prefix + "AnalysisResults.", this.AnalysisResults);
        this.setParamArraySimple(map, prefix + "AnalysisRecords.", this.AnalysisRecords);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

