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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchTemplate extends AbstractModel {

    /**
    * Search name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Search index type
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Search statement
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Time range
    */
    @SerializedName("TimeRange")
    @Expose
    private String TimeRange;

    /**
    * Converted search statement content
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Search method. Valid values: `standard` (search in the search box); `simple` (search by filter).
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
    * Displayed data
    */
    @SerializedName("DisplayData")
    @Expose
    private String DisplayData;

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Search name 
     * @return Name Search name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Search name
     * @param Name Search name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Search index type 
     * @return LogType Search index type
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Search index type
     * @param LogType Search index type
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Search statement 
     * @return Condition Search statement
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Search statement
     * @param Condition Search statement
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Time range 
     * @return TimeRange Time range
     */
    public String getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set Time range
     * @param TimeRange Time range
     */
    public void setTimeRange(String TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get Converted search statement content 
     * @return Query Converted search statement content
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Converted search statement content
     * @param Query Converted search statement content
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Search method. Valid values: `standard` (search in the search box); `simple` (search by filter). 
     * @return Flag Search method. Valid values: `standard` (search in the search box); `simple` (search by filter).
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set Search method. Valid values: `standard` (search in the search box); `simple` (search by filter).
     * @param Flag Search method. Valid values: `standard` (search in the search box); `simple` (search by filter).
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    /**
     * Get Displayed data 
     * @return DisplayData Displayed data
     */
    public String getDisplayData() {
        return this.DisplayData;
    }

    /**
     * Set Displayed data
     * @param DisplayData Displayed data
     */
    public void setDisplayData(String DisplayData) {
        this.DisplayData = DisplayData;
    }

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public SearchTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchTemplate(SearchTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new String(source.TimeRange);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Flag != null) {
            this.Flag = new String(source.Flag);
        }
        if (source.DisplayData != null) {
            this.DisplayData = new String(source.DisplayData);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "DisplayData", this.DisplayData);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

