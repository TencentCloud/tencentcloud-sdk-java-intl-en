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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceLogsRequest extends AbstractModel{

    /**
    * Cluster instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Log type. Default value: 1
<li>1: primary log</li>
<li>2: search slow log</li>
<li>3: index slow log</li>
<li>4: GC log</li>
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * Search keyword, which supports LUCENE syntax, such as `level:WARN`, `ip:1.1.1.1`, and `message:test-index`
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Log start time in the format of YYYY-MM-DD HH:MM:SS, such as 2019-01-22 20:15:53
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Log end time in the format of YYYY-MM-DD HH:MM:SS, such as 2019-01-22 20:15:53
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Pagination start value. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Default value: 100. Maximum value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Time sorting order. Default value: 0
<li>0: descending</li>
<li>1: ascending</li>
    */
    @SerializedName("OrderByType")
    @Expose
    private Long OrderByType;

    /**
     * Get Cluster instance ID 
     * @return InstanceId Cluster instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID
     * @param InstanceId Cluster instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Log type. Default value: 1
<li>1: primary log</li>
<li>2: search slow log</li>
<li>3: index slow log</li>
<li>4: GC log</li> 
     * @return LogType Log type. Default value: 1
<li>1: primary log</li>
<li>2: search slow log</li>
<li>3: index slow log</li>
<li>4: GC log</li>
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type. Default value: 1
<li>1: primary log</li>
<li>2: search slow log</li>
<li>3: index slow log</li>
<li>4: GC log</li>
     * @param LogType Log type. Default value: 1
<li>1: primary log</li>
<li>2: search slow log</li>
<li>3: index slow log</li>
<li>4: GC log</li>
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Search keyword, which supports LUCENE syntax, such as `level:WARN`, `ip:1.1.1.1`, and `message:test-index` 
     * @return SearchKey Search keyword, which supports LUCENE syntax, such as `level:WARN`, `ip:1.1.1.1`, and `message:test-index`
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search keyword, which supports LUCENE syntax, such as `level:WARN`, `ip:1.1.1.1`, and `message:test-index`
     * @param SearchKey Search keyword, which supports LUCENE syntax, such as `level:WARN`, `ip:1.1.1.1`, and `message:test-index`
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Log start time in the format of YYYY-MM-DD HH:MM:SS, such as 2019-01-22 20:15:53 
     * @return StartTime Log start time in the format of YYYY-MM-DD HH:MM:SS, such as 2019-01-22 20:15:53
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Log start time in the format of YYYY-MM-DD HH:MM:SS, such as 2019-01-22 20:15:53
     * @param StartTime Log start time in the format of YYYY-MM-DD HH:MM:SS, such as 2019-01-22 20:15:53
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Log end time in the format of YYYY-MM-DD HH:MM:SS, such as 2019-01-22 20:15:53 
     * @return EndTime Log end time in the format of YYYY-MM-DD HH:MM:SS, such as 2019-01-22 20:15:53
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Log end time in the format of YYYY-MM-DD HH:MM:SS, such as 2019-01-22 20:15:53
     * @param EndTime Log end time in the format of YYYY-MM-DD HH:MM:SS, such as 2019-01-22 20:15:53
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Pagination start value. Default value: 0 
     * @return Offset Pagination start value. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination start value. Default value: 0
     * @param Offset Pagination start value. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Default value: 100. Maximum value: 100 
     * @return Limit Number of entries per page. Default value: 100. Maximum value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Default value: 100. Maximum value: 100
     * @param Limit Number of entries per page. Default value: 100. Maximum value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Time sorting order. Default value: 0
<li>0: descending</li>
<li>1: ascending</li> 
     * @return OrderByType Time sorting order. Default value: 0
<li>0: descending</li>
<li>1: ascending</li>
     */
    public Long getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Time sorting order. Default value: 0
<li>0: descending</li>
<li>1: ascending</li>
     * @param OrderByType Time sorting order. Default value: 0
<li>0: descending</li>
<li>1: ascending</li>
     */
    public void setOrderByType(Long OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeInstanceLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceLogsRequest(DescribeInstanceLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new Long(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

