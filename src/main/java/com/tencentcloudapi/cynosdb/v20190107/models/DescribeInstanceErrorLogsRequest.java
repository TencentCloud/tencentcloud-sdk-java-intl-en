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
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Limit on the number of logs
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset of the log number
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Sorting field. Valid value: 'Timestamp'.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values: `ASC`, `DESC`.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Log level, which supports combo search by multiple levels. Valid values: `error`, `warning`, `note`.
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * 
    */
    @SerializedName("KeyWords")
    @Expose
    private String [] KeyWords;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Limit on the number of logs 
     * @return Limit Limit on the number of logs
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on the number of logs
     * @param Limit Limit on the number of logs
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset of the log number 
     * @return Offset Offset of the log number
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of the log number
     * @param Offset Offset of the log number
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Sorting field. Valid value: 'Timestamp'. 
     * @return OrderBy Sorting field. Valid value: 'Timestamp'.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Valid value: 'Timestamp'.
     * @param OrderBy Sorting field. Valid value: 'Timestamp'.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: `ASC`, `DESC`. 
     * @return OrderByType Sorting order. Valid values: `ASC`, `DESC`.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Valid values: `ASC`, `DESC`.
     * @param OrderByType Sorting order. Valid values: `ASC`, `DESC`.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Log level, which supports combo search by multiple levels. Valid values: `error`, `warning`, `note`. 
     * @return LogLevels Log level, which supports combo search by multiple levels. Valid values: `error`, `warning`, `note`.
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set Log level, which supports combo search by multiple levels. Valid values: `error`, `warning`, `note`.
     * @param LogLevels Log level, which supports combo search by multiple levels. Valid values: `error`, `warning`, `note`.
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get  
     * @return KeyWords 
     */
    public String [] getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set 
     * @param KeyWords 
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

