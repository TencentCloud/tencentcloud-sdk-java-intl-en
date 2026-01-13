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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDetailedSlowLogsRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the start time for querying slow logs. - Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00. - The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Specifies the end time for querying slow logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-02 12:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specifies the threshold for querying slow logs, in milliseconds. It indicates that the execution time of the slow log query exceeds this value. The default value is 100.
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * Specifies the command type for querying slow logs.
    */
    @SerializedName("Commands")
    @Expose
    private String [] Commands;

    /**
    * Full-text search keyword. The logical operator among multiple keywords is OR.
    */
    @SerializedName("Texts")
    @Expose
    private String [] Texts;

    /**
    * Specifies the node name for querying slow logs. The [DescribeDBInstanceNodeProperty](https://www.tencentcloud.com/document/product/240/82022?from_cn_redirect=1) API can be called to query the node name.
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * Specifies the queryHash value to be queried.
    */
    @SerializedName("QueryHash")
    @Expose
    private String [] QueryHash;

    /**
    * Pagination offset. The default value is 0, and the value range is [0, 100].

    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. The default value is 20, and the value range is [0, 10000].
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies the sorting condition for slow logs.
- StartTime: sort by the generation time of slow logs.
- ExecTime: sort by the execution time of slow logs.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Specifies the sorting method.
- desc: descending order.
- asc: ascending order.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list. 
     * @return InstanceId Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     * @param InstanceId Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the start time for querying slow logs. - Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00. - The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried. 
     * @return StartTime Specifies the start time for querying slow logs. - Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00. - The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Specifies the start time for querying slow logs. - Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00. - The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     * @param StartTime Specifies the start time for querying slow logs. - Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00. - The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Specifies the end time for querying slow logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-02 12:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried. 
     * @return EndTime Specifies the end time for querying slow logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-02 12:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Specifies the end time for querying slow logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-02 12:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     * @param EndTime Specifies the end time for querying slow logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-02 12:00:00.
- The query start and end time interval cannot exceed 24 hours. Only slow logs within the last 7 days can be queried.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specifies the threshold for querying slow logs, in milliseconds. It indicates that the execution time of the slow log query exceeds this value. The default value is 100. 
     * @return ExecTime Specifies the threshold for querying slow logs, in milliseconds. It indicates that the execution time of the slow log query exceeds this value. The default value is 100.
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set Specifies the threshold for querying slow logs, in milliseconds. It indicates that the execution time of the slow log query exceeds this value. The default value is 100.
     * @param ExecTime Specifies the threshold for querying slow logs, in milliseconds. It indicates that the execution time of the slow log query exceeds this value. The default value is 100.
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get Specifies the command type for querying slow logs. 
     * @return Commands Specifies the command type for querying slow logs.
     */
    public String [] getCommands() {
        return this.Commands;
    }

    /**
     * Set Specifies the command type for querying slow logs.
     * @param Commands Specifies the command type for querying slow logs.
     */
    public void setCommands(String [] Commands) {
        this.Commands = Commands;
    }

    /**
     * Get Full-text search keyword. The logical operator among multiple keywords is OR. 
     * @return Texts Full-text search keyword. The logical operator among multiple keywords is OR.
     */
    public String [] getTexts() {
        return this.Texts;
    }

    /**
     * Set Full-text search keyword. The logical operator among multiple keywords is OR.
     * @param Texts Full-text search keyword. The logical operator among multiple keywords is OR.
     */
    public void setTexts(String [] Texts) {
        this.Texts = Texts;
    }

    /**
     * Get Specifies the node name for querying slow logs. The [DescribeDBInstanceNodeProperty](https://www.tencentcloud.com/document/product/240/82022?from_cn_redirect=1) API can be called to query the node name. 
     * @return NodeNames Specifies the node name for querying slow logs. The [DescribeDBInstanceNodeProperty](https://www.tencentcloud.com/document/product/240/82022?from_cn_redirect=1) API can be called to query the node name.
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set Specifies the node name for querying slow logs. The [DescribeDBInstanceNodeProperty](https://www.tencentcloud.com/document/product/240/82022?from_cn_redirect=1) API can be called to query the node name.
     * @param NodeNames Specifies the node name for querying slow logs. The [DescribeDBInstanceNodeProperty](https://www.tencentcloud.com/document/product/240/82022?from_cn_redirect=1) API can be called to query the node name.
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get Specifies the queryHash value to be queried. 
     * @return QueryHash Specifies the queryHash value to be queried.
     */
    public String [] getQueryHash() {
        return this.QueryHash;
    }

    /**
     * Set Specifies the queryHash value to be queried.
     * @param QueryHash Specifies the queryHash value to be queried.
     */
    public void setQueryHash(String [] QueryHash) {
        this.QueryHash = QueryHash;
    }

    /**
     * Get Pagination offset. The default value is 0, and the value range is [0, 100].
 
     * @return Offset Pagination offset. The default value is 0, and the value range is [0, 100].

     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. The default value is 0, and the value range is [0, 100].

     * @param Offset Pagination offset. The default value is 0, and the value range is [0, 100].

     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. The default value is 20, and the value range is [0, 10000]. 
     * @return Limit Number of returned entries. The default value is 20, and the value range is [0, 10000].
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. The default value is 20, and the value range is [0, 10000].
     * @param Limit Number of returned entries. The default value is 20, and the value range is [0, 10000].
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies the sorting condition for slow logs.
- StartTime: sort by the generation time of slow logs.
- ExecTime: sort by the execution time of slow logs. 
     * @return OrderBy Specifies the sorting condition for slow logs.
- StartTime: sort by the generation time of slow logs.
- ExecTime: sort by the execution time of slow logs.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Specifies the sorting condition for slow logs.
- StartTime: sort by the generation time of slow logs.
- ExecTime: sort by the execution time of slow logs.
     * @param OrderBy Specifies the sorting condition for slow logs.
- StartTime: sort by the generation time of slow logs.
- ExecTime: sort by the execution time of slow logs.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Specifies the sorting method.
- desc: descending order.
- asc: ascending order. 
     * @return OrderByType Specifies the sorting method.
- desc: descending order.
- asc: ascending order.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Specifies the sorting method.
- desc: descending order.
- asc: ascending order.
     * @param OrderByType Specifies the sorting method.
- desc: descending order.
- asc: ascending order.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeDetailedSlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDetailedSlowLogsRequest(DescribeDetailedSlowLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Commands != null) {
            this.Commands = new String[source.Commands.length];
            for (int i = 0; i < source.Commands.length; i++) {
                this.Commands[i] = new String(source.Commands[i]);
            }
        }
        if (source.Texts != null) {
            this.Texts = new String[source.Texts.length];
            for (int i = 0; i < source.Texts.length; i++) {
                this.Texts[i] = new String(source.Texts[i]);
            }
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.QueryHash != null) {
            this.QueryHash = new String[source.QueryHash.length];
            for (int i = 0; i < source.QueryHash.length; i++) {
                this.QueryHash[i] = new String(source.QueryHash[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamArraySimple(map, prefix + "Commands.", this.Commands);
        this.setParamArraySimple(map, prefix + "Texts.", this.Texts);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamArraySimple(map, prefix + "QueryHash.", this.QueryHash);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

