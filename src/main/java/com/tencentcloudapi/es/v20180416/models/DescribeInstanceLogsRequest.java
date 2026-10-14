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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceLogsRequest extends AbstractModel {

    /**
    * Cluster instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Log type. Default value: 1.
<li>1, master log</li>
<li>2. Search slow logs</li>
<li>3. Index slow log</li>
<li>4. GC log</li>
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * Search term. LUCENE grammar is supported, for example, level:WARN, ip:1.1.1.1, message:test-index
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Log start time in the format of YYYY-MM-DD HH:MM:SS, for example, 2019-01-22 20:15:53
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Log end time in the format of YYYY-MM-DD HH:MM:SS, for example, 2019-01-22 20:15:53
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Pagination starting value. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination size. Default value: 100. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Time sort method. Default value: 0.
<li>0: descending order</li>
<li>1, ascending</li>
    */
    @SerializedName("OrderByType")
    @Expose
    private Long OrderByType;

    /**
    * Log level
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * Node ID.
    */
    @SerializedName("NodeIds")
    @Expose
    private String [] NodeIds;

    /**
    * Slow log index name
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * Slow log index shards
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * Slow log query time
    */
    @SerializedName("QueryCost")
    @Expose
    private Long QueryCost;

    /**
     * Get Cluster instance ID. 
     * @return InstanceId Cluster instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID.
     * @param InstanceId Cluster instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Log type. Default value: 1.
<li>1, master log</li>
<li>2. Search slow logs</li>
<li>3. Index slow log</li>
<li>4. GC log</li> 
     * @return LogType Log type. Default value: 1.
<li>1, master log</li>
<li>2. Search slow logs</li>
<li>3. Index slow log</li>
<li>4. GC log</li>
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type. Default value: 1.
<li>1, master log</li>
<li>2. Search slow logs</li>
<li>3. Index slow log</li>
<li>4. GC log</li>
     * @param LogType Log type. Default value: 1.
<li>1, master log</li>
<li>2. Search slow logs</li>
<li>3. Index slow log</li>
<li>4. GC log</li>
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Search term. LUCENE grammar is supported, for example, level:WARN, ip:1.1.1.1, message:test-index 
     * @return SearchKey Search term. LUCENE grammar is supported, for example, level:WARN, ip:1.1.1.1, message:test-index
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search term. LUCENE grammar is supported, for example, level:WARN, ip:1.1.1.1, message:test-index
     * @param SearchKey Search term. LUCENE grammar is supported, for example, level:WARN, ip:1.1.1.1, message:test-index
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Log start time in the format of YYYY-MM-DD HH:MM:SS, for example, 2019-01-22 20:15:53 
     * @return StartTime Log start time in the format of YYYY-MM-DD HH:MM:SS, for example, 2019-01-22 20:15:53
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Log start time in the format of YYYY-MM-DD HH:MM:SS, for example, 2019-01-22 20:15:53
     * @param StartTime Log start time in the format of YYYY-MM-DD HH:MM:SS, for example, 2019-01-22 20:15:53
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Log end time in the format of YYYY-MM-DD HH:MM:SS, for example, 2019-01-22 20:15:53 
     * @return EndTime Log end time in the format of YYYY-MM-DD HH:MM:SS, for example, 2019-01-22 20:15:53
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Log end time in the format of YYYY-MM-DD HH:MM:SS, for example, 2019-01-22 20:15:53
     * @param EndTime Log end time in the format of YYYY-MM-DD HH:MM:SS, for example, 2019-01-22 20:15:53
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Pagination starting value. Default value: 0. 
     * @return Offset Pagination starting value. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination starting value. Default value: 0.
     * @param Offset Pagination starting value. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination size. Default value: 100. Maximum value: 100. 
     * @return Limit Pagination size. Default value: 100. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination size. Default value: 100. Maximum value: 100.
     * @param Limit Pagination size. Default value: 100. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Time sort method. Default value: 0.
<li>0: descending order</li>
<li>1, ascending</li> 
     * @return OrderByType Time sort method. Default value: 0.
<li>0: descending order</li>
<li>1, ascending</li>
     */
    public Long getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Time sort method. Default value: 0.
<li>0: descending order</li>
<li>1, ascending</li>
     * @param OrderByType Time sort method. Default value: 0.
<li>0: descending order</li>
<li>1, ascending</li>
     */
    public void setOrderByType(Long OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Log level 
     * @return LogLevels Log level
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set Log level
     * @param LogLevels Log level
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get Node ID. 
     * @return NodeIds Node ID.
     */
    public String [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set Node ID.
     * @param NodeIds Node ID.
     */
    public void setNodeIds(String [] NodeIds) {
        this.NodeIds = NodeIds;
    }

    /**
     * Get Slow log index name 
     * @return IndexName Slow log index name
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set Slow log index name
     * @param IndexName Slow log index name
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get Slow log index shards 
     * @return ShardId Slow log index shards
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set Slow log index shards
     * @param ShardId Slow log index shards
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get Slow log query time 
     * @return QueryCost Slow log query time
     */
    public Long getQueryCost() {
        return this.QueryCost;
    }

    /**
     * Set Slow log query time
     * @param QueryCost Slow log query time
     */
    public void setQueryCost(Long QueryCost) {
        this.QueryCost = QueryCost;
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
        if (source.LogLevels != null) {
            this.LogLevels = new String[source.LogLevels.length];
            for (int i = 0; i < source.LogLevels.length; i++) {
                this.LogLevels[i] = new String(source.LogLevels[i]);
            }
        }
        if (source.NodeIds != null) {
            this.NodeIds = new String[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new String(source.NodeIds[i]);
            }
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.ShardId != null) {
            this.ShardId = new String(source.ShardId);
        }
        if (source.QueryCost != null) {
            this.QueryCost = new Long(source.QueryCost);
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
        this.setParamArraySimple(map, prefix + "LogLevels.", this.LogLevels);
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "QueryCost", this.QueryCost);

    }
}

