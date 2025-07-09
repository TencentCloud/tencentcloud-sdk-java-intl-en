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

public class QueryTaskCostDetailRequest extends AbstractModel {

    /**
    * Filter criteria. The following filter types are supported. The parameter Name should be one of them. The maximum number of values that can be filtered by task-id is 50. The values that can be filtered by other parameter filters should not be more than 5.
task-id - String - (accurate filtering of task IDs). The example of the value of task-id is e386471f-139a-4e59-877f-50ece8135b99.
task-state - String - (filtering task status); valid values: 0 (initializing), 1 (running), 2 (successful), and -1 (failed).
task-sql-keyword - String - (fuzzy filtering of the keywords of SQL statements); the example of the value is DROP TABLE.
task-operator- string (filtering sub-UIN)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Start time, and the format is yyyy-mm-dd HH:MM:SS. It is the current moment 45 days ago by default.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, and the format is yyyy-mm-dd HH:MM:SS. The time span is longer than 0 day but shorter than or equal to 30 days. Data within the recent 45 days can be queried. It is the current moment by default.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Data engine name, used for selecting
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Identifier on the next page
    */
    @SerializedName("SearchAfter")
    @Expose
    private String SearchAfter;

    /**
    * Size of each page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Filter criteria. The following filter types are supported. The parameter Name should be one of them. The maximum number of values that can be filtered by task-id is 50. The values that can be filtered by other parameter filters should not be more than 5.
task-id - String - (accurate filtering of task IDs). The example of the value of task-id is e386471f-139a-4e59-877f-50ece8135b99.
task-state - String - (filtering task status); valid values: 0 (initializing), 1 (running), 2 (successful), and -1 (failed).
task-sql-keyword - String - (fuzzy filtering of the keywords of SQL statements); the example of the value is DROP TABLE.
task-operator- string (filtering sub-UIN) 
     * @return Filters Filter criteria. The following filter types are supported. The parameter Name should be one of them. The maximum number of values that can be filtered by task-id is 50. The values that can be filtered by other parameter filters should not be more than 5.
task-id - String - (accurate filtering of task IDs). The example of the value of task-id is e386471f-139a-4e59-877f-50ece8135b99.
task-state - String - (filtering task status); valid values: 0 (initializing), 1 (running), 2 (successful), and -1 (failed).
task-sql-keyword - String - (fuzzy filtering of the keywords of SQL statements); the example of the value is DROP TABLE.
task-operator- string (filtering sub-UIN)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The following filter types are supported. The parameter Name should be one of them. The maximum number of values that can be filtered by task-id is 50. The values that can be filtered by other parameter filters should not be more than 5.
task-id - String - (accurate filtering of task IDs). The example of the value of task-id is e386471f-139a-4e59-877f-50ece8135b99.
task-state - String - (filtering task status); valid values: 0 (initializing), 1 (running), 2 (successful), and -1 (failed).
task-sql-keyword - String - (fuzzy filtering of the keywords of SQL statements); the example of the value is DROP TABLE.
task-operator- string (filtering sub-UIN)
     * @param Filters Filter criteria. The following filter types are supported. The parameter Name should be one of them. The maximum number of values that can be filtered by task-id is 50. The values that can be filtered by other parameter filters should not be more than 5.
task-id - String - (accurate filtering of task IDs). The example of the value of task-id is e386471f-139a-4e59-877f-50ece8135b99.
task-state - String - (filtering task status); valid values: 0 (initializing), 1 (running), 2 (successful), and -1 (failed).
task-sql-keyword - String - (fuzzy filtering of the keywords of SQL statements); the example of the value is DROP TABLE.
task-operator- string (filtering sub-UIN)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Start time, and the format is yyyy-mm-dd HH:MM:SS. It is the current moment 45 days ago by default. 
     * @return StartTime Start time, and the format is yyyy-mm-dd HH:MM:SS. It is the current moment 45 days ago by default.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, and the format is yyyy-mm-dd HH:MM:SS. It is the current moment 45 days ago by default.
     * @param StartTime Start time, and the format is yyyy-mm-dd HH:MM:SS. It is the current moment 45 days ago by default.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, and the format is yyyy-mm-dd HH:MM:SS. The time span is longer than 0 day but shorter than or equal to 30 days. Data within the recent 45 days can be queried. It is the current moment by default. 
     * @return EndTime End time, and the format is yyyy-mm-dd HH:MM:SS. The time span is longer than 0 day but shorter than or equal to 30 days. Data within the recent 45 days can be queried. It is the current moment by default.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, and the format is yyyy-mm-dd HH:MM:SS. The time span is longer than 0 day but shorter than or equal to 30 days. Data within the recent 45 days can be queried. It is the current moment by default.
     * @param EndTime End time, and the format is yyyy-mm-dd HH:MM:SS. The time span is longer than 0 day but shorter than or equal to 30 days. Data within the recent 45 days can be queried. It is the current moment by default.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Data engine name, used for selecting 
     * @return DataEngineName Data engine name, used for selecting
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set Data engine name, used for selecting
     * @param DataEngineName Data engine name, used for selecting
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Identifier on the next page 
     * @return SearchAfter Identifier on the next page
     */
    public String getSearchAfter() {
        return this.SearchAfter;
    }

    /**
     * Set Identifier on the next page
     * @param SearchAfter Identifier on the next page
     */
    public void setSearchAfter(String SearchAfter) {
        this.SearchAfter = SearchAfter;
    }

    /**
     * Get Size of each page 
     * @return PageSize Size of each page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Size of each page
     * @param PageSize Size of each page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public QueryTaskCostDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTaskCostDetailRequest(QueryTaskCostDetailRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.SearchAfter != null) {
            this.SearchAfter = new String(source.SearchAfter);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "SearchAfter", this.SearchAfter);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

