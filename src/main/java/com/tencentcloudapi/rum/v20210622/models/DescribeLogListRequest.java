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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogListRequest extends AbstractModel{

    /**
    * Sorting order (required). Valid values: `desc`, `asc`.
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * This parameter is required. Valid values: `searchlog`, `histogram`.
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Project ID (required)
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Start time (required)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The number of raw logs returned for a single query. This parameter is required. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Context, which is used to load more logs. Pass through the last `Context` value returned to get more log content (up to 10,000 raw logs). It will expire after 1 hour
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Query statement, which is required and can contain up to 4,096 characters.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * End time (required)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Sorting order (required). Valid values: `desc`, `asc`. 
     * @return Sort Sorting order (required). Valid values: `desc`, `asc`.
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting order (required). Valid values: `desc`, `asc`.
     * @param Sort Sorting order (required). Valid values: `desc`, `asc`.
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get This parameter is required. Valid values: `searchlog`, `histogram`. 
     * @return ActionType This parameter is required. Valid values: `searchlog`, `histogram`.
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set This parameter is required. Valid values: `searchlog`, `histogram`.
     * @param ActionType This parameter is required. Valid values: `searchlog`, `histogram`.
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Project ID (required) 
     * @return ID Project ID (required)
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Project ID (required)
     * @param ID Project ID (required)
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Start time (required) 
     * @return StartTime Start time (required)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (required)
     * @param StartTime Start time (required)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The number of raw logs returned for a single query. This parameter is required. Maximum value: 100. 
     * @return Limit The number of raw logs returned for a single query. This parameter is required. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of raw logs returned for a single query. This parameter is required. Maximum value: 100.
     * @param Limit The number of raw logs returned for a single query. This parameter is required. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Context, which is used to load more logs. Pass through the last `Context` value returned to get more log content (up to 10,000 raw logs). It will expire after 1 hour 
     * @return Context Context, which is used to load more logs. Pass through the last `Context` value returned to get more log content (up to 10,000 raw logs). It will expire after 1 hour
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Context, which is used to load more logs. Pass through the last `Context` value returned to get more log content (up to 10,000 raw logs). It will expire after 1 hour
     * @param Context Context, which is used to load more logs. Pass through the last `Context` value returned to get more log content (up to 10,000 raw logs). It will expire after 1 hour
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Query statement, which is required and can contain up to 4,096 characters. 
     * @return Query Query statement, which is required and can contain up to 4,096 characters.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statement, which is required and can contain up to 4,096 characters.
     * @param Query Query statement, which is required and can contain up to 4,096 characters.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get End time (required) 
     * @return EndTime End time (required)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (required)
     * @param EndTime End time (required)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeLogListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogListRequest(DescribeLogListRequest source) {
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

