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

public class DescribeInstanceErrorLogsRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Log entry limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Log entry offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Sorting field. Valid values: `Timestamp` (enumeration value).
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting type. Valid values: `ASC`, `DESC`.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Log level. Valid values: error, warning, note. You can search multiple levels at the same time.
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * Keyword. Fuzzy search is supported.
    */
    @SerializedName("KeyWords")
    @Expose
    private String [] KeyWords;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Log entry limit 
     * @return Limit Log entry limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Log entry limit
     * @param Limit Log entry limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Log entry offset 
     * @return Offset Log entry offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Log entry offset
     * @param Offset Log entry offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Sorting field. Valid values: `Timestamp` (enumeration value). 
     * @return OrderBy Sorting field. Valid values: `Timestamp` (enumeration value).
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Valid values: `Timestamp` (enumeration value).
     * @param OrderBy Sorting field. Valid values: `Timestamp` (enumeration value).
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting type. Valid values: `ASC`, `DESC`. 
     * @return OrderByType Sorting type. Valid values: `ASC`, `DESC`.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting type. Valid values: `ASC`, `DESC`.
     * @param OrderByType Sorting type. Valid values: `ASC`, `DESC`.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Log level. Valid values: error, warning, note. You can search multiple levels at the same time. 
     * @return LogLevels Log level. Valid values: error, warning, note. You can search multiple levels at the same time.
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set Log level. Valid values: error, warning, note. You can search multiple levels at the same time.
     * @param LogLevels Log level. Valid values: error, warning, note. You can search multiple levels at the same time.
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get Keyword. Fuzzy search is supported. 
     * @return KeyWords Keyword. Fuzzy search is supported.
     */
    public String [] getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set Keyword. Fuzzy search is supported.
     * @param KeyWords Keyword. Fuzzy search is supported.
     */
    public void setKeyWords(String [] KeyWords) {
        this.KeyWords = KeyWords;
    }

    public DescribeInstanceErrorLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceErrorLogsRequest(DescribeInstanceErrorLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.LogLevels != null) {
            this.LogLevels = new String[source.LogLevels.length];
            for (int i = 0; i < source.LogLevels.length; i++) {
                this.LogLevels[i] = new String(source.LogLevels[i]);
            }
        }
        if (source.KeyWords != null) {
            this.KeyWords = new String[source.KeyWords.length];
            for (int i = 0; i < source.KeyWords.length; i++) {
                this.KeyWords[i] = new String(source.KeyWords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArraySimple(map, prefix + "LogLevels.", this.LogLevels);
        this.setParamArraySimple(map, prefix + "KeyWords.", this.KeyWords);

    }
}

