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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAlarmLogRequest extends AbstractModel {

    /**
    * Start time of the log to be queried, which is a Unix timestamp in milliseconds
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * End time of the log to be queried, which is a Unix timestamp in milliseconds
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * Query statement. Maximum length: 1024
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Number of logs returned in a single query. Maximum value: 1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * This field is used to load more logs. Pass through the last `Context` value returned to get more log content.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Order of the logs sorted by time returned by the log API. Valid values: `asc`: ascending; `desc`: descending. Default value: `desc`
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * If the value is `true`, the new search method will be used, and the response parameters `AnalysisRecords` and `Columns` will be valid. If the value is `false`, the old search method will be used, and `AnalysisResults` and `ColNames` will be valid.
    */
    @SerializedName("UseNewAnalysis")
    @Expose
    private Boolean UseNewAnalysis;

    /**
     * Get Start time of the log to be queried, which is a Unix timestamp in milliseconds 
     * @return From Start time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Start time of the log to be queried, which is a Unix timestamp in milliseconds
     * @param From Start time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get End time of the log to be queried, which is a Unix timestamp in milliseconds 
     * @return To End time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set End time of the log to be queried, which is a Unix timestamp in milliseconds
     * @param To End time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get Query statement. Maximum length: 1024 
     * @return Query Query statement. Maximum length: 1024
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statement. Maximum length: 1024
     * @param Query Query statement. Maximum length: 1024
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Number of logs returned in a single query. Maximum value: 1000 
     * @return Limit Number of logs returned in a single query. Maximum value: 1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of logs returned in a single query. Maximum value: 1000
     * @param Limit Number of logs returned in a single query. Maximum value: 1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get This field is used to load more logs. Pass through the last `Context` value returned to get more log content. 
     * @return Context This field is used to load more logs. Pass through the last `Context` value returned to get more log content.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set This field is used to load more logs. Pass through the last `Context` value returned to get more log content.
     * @param Context This field is used to load more logs. Pass through the last `Context` value returned to get more log content.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Order of the logs sorted by time returned by the log API. Valid values: `asc`: ascending; `desc`: descending. Default value: `desc` 
     * @return Sort Order of the logs sorted by time returned by the log API. Valid values: `asc`: ascending; `desc`: descending. Default value: `desc`
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Order of the logs sorted by time returned by the log API. Valid values: `asc`: ascending; `desc`: descending. Default value: `desc`
     * @param Sort Order of the logs sorted by time returned by the log API. Valid values: `asc`: ascending; `desc`: descending. Default value: `desc`
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get If the value is `true`, the new search method will be used, and the response parameters `AnalysisRecords` and `Columns` will be valid. If the value is `false`, the old search method will be used, and `AnalysisResults` and `ColNames` will be valid. 
     * @return UseNewAnalysis If the value is `true`, the new search method will be used, and the response parameters `AnalysisRecords` and `Columns` will be valid. If the value is `false`, the old search method will be used, and `AnalysisResults` and `ColNames` will be valid.
     */
    public Boolean getUseNewAnalysis() {
        return this.UseNewAnalysis;
    }

    /**
     * Set If the value is `true`, the new search method will be used, and the response parameters `AnalysisRecords` and `Columns` will be valid. If the value is `false`, the old search method will be used, and `AnalysisResults` and `ColNames` will be valid.
     * @param UseNewAnalysis If the value is `true`, the new search method will be used, and the response parameters `AnalysisRecords` and `Columns` will be valid. If the value is `false`, the old search method will be used, and `AnalysisResults` and `ColNames` will be valid.
     */
    public void setUseNewAnalysis(Boolean UseNewAnalysis) {
        this.UseNewAnalysis = UseNewAnalysis;
    }

    public GetAlarmLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAlarmLogRequest(GetAlarmLogRequest source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.UseNewAnalysis != null) {
            this.UseNewAnalysis = new Boolean(source.UseNewAnalysis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "UseNewAnalysis", this.UseNewAnalysis);

    }
}

