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

public class DescribeMongodbLogsRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb#/), and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time for querying logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- Query time range: Only log data within the last 7 days can be queried.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time for querying logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- Query time range: Only log data within the last 7 days can be queried.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Node ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and go to the **Node Management** page to obtain the ID of the node to be queried.
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * Log category.
- Log categories include but are not limited to COMMAND, ACCESS, CONTROL, FTDC, INDEX, NETWORK, QUERY, REPL, SHARDING, STORAGE, RECOVERY, JOURNAL, and WRITE. The specific supported categories may vary depending on the MongoDB version. For details, see Log Messages (https://www.mongodb.com/zh-cn/docs/v5.0/reference/log-messages/#log-message-examples).
- Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log category** on the **Error Log** tab of the **Log Management** page.
    */
    @SerializedName("LogComponents")
    @Expose
    private String [] LogComponents;

    /**
    * Log level.
- The log levels are ranked by severity from high to low: FATAL, ERROR, and WARNING.
-Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log level** on the **Error Log** tab of the **Log Management** page.
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * Log ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log ID** on the **Error Log** tab of the **Log Management** page.
    */
    @SerializedName("LogIds")
    @Expose
    private String [] LogIds;

    /**
    * Log connection information. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log connection information** on the **Error Log** tab of the **Log Management** page.
    */
    @SerializedName("LogConnections")
    @Expose
    private String [] LogConnections;

    /**
    * Specifies the field for filtering the logs.
    */
    @SerializedName("LogDetailParams")
    @Expose
    private String [] LogDetailParams;

    /**
    * Offset. The minimum value is 0, and the maximum value is 10000. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination size. The minimum value is 1, and the maximum value is 100. The default value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb#/), and copy the instance ID from the instance list. 
     * @return InstanceId Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb#/), and copy the instance ID from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb#/), and copy the instance ID from the instance list.
     * @param InstanceId Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb#/), and copy the instance ID from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time for querying logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- Query time range: Only log data within the last 7 days can be queried. 
     * @return StartTime Start time for querying logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- Query time range: Only log data within the last 7 days can be queried.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for querying logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- Query time range: Only log data within the last 7 days can be queried.
     * @param StartTime Start time for querying logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- Query time range: Only log data within the last 7 days can be queried.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for querying logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- Query time range: Only log data within the last 7 days can be queried. 
     * @return EndTime End time for querying logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- Query time range: Only log data within the last 7 days can be queried.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for querying logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- Query time range: Only log data within the last 7 days can be queried.
     * @param EndTime End time for querying logs.
- Format: yyyy-mm-dd hh:mm:ss. For example, 2019-06-01 10:00:00.
- Query time range: Only log data within the last 7 days can be queried.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Node ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and go to the **Node Management** page to obtain the ID of the node to be queried. 
     * @return NodeNames Node ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and go to the **Node Management** page to obtain the ID of the node to be queried.
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set Node ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and go to the **Node Management** page to obtain the ID of the node to be queried.
     * @param NodeNames Node ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and go to the **Node Management** page to obtain the ID of the node to be queried.
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get Log category.
- Log categories include but are not limited to COMMAND, ACCESS, CONTROL, FTDC, INDEX, NETWORK, QUERY, REPL, SHARDING, STORAGE, RECOVERY, JOURNAL, and WRITE. The specific supported categories may vary depending on the MongoDB version. For details, see Log Messages (https://www.mongodb.com/zh-cn/docs/v5.0/reference/log-messages/#log-message-examples).
- Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log category** on the **Error Log** tab of the **Log Management** page. 
     * @return LogComponents Log category.
- Log categories include but are not limited to COMMAND, ACCESS, CONTROL, FTDC, INDEX, NETWORK, QUERY, REPL, SHARDING, STORAGE, RECOVERY, JOURNAL, and WRITE. The specific supported categories may vary depending on the MongoDB version. For details, see Log Messages (https://www.mongodb.com/zh-cn/docs/v5.0/reference/log-messages/#log-message-examples).
- Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log category** on the **Error Log** tab of the **Log Management** page.
     */
    public String [] getLogComponents() {
        return this.LogComponents;
    }

    /**
     * Set Log category.
- Log categories include but are not limited to COMMAND, ACCESS, CONTROL, FTDC, INDEX, NETWORK, QUERY, REPL, SHARDING, STORAGE, RECOVERY, JOURNAL, and WRITE. The specific supported categories may vary depending on the MongoDB version. For details, see Log Messages (https://www.mongodb.com/zh-cn/docs/v5.0/reference/log-messages/#log-message-examples).
- Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log category** on the **Error Log** tab of the **Log Management** page.
     * @param LogComponents Log category.
- Log categories include but are not limited to COMMAND, ACCESS, CONTROL, FTDC, INDEX, NETWORK, QUERY, REPL, SHARDING, STORAGE, RECOVERY, JOURNAL, and WRITE. The specific supported categories may vary depending on the MongoDB version. For details, see Log Messages (https://www.mongodb.com/zh-cn/docs/v5.0/reference/log-messages/#log-message-examples).
- Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log category** on the **Error Log** tab of the **Log Management** page.
     */
    public void setLogComponents(String [] LogComponents) {
        this.LogComponents = LogComponents;
    }

    /**
     * Get Log level.
- The log levels are ranked by severity from high to low: FATAL, ERROR, and WARNING.
-Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log level** on the **Error Log** tab of the **Log Management** page. 
     * @return LogLevels Log level.
- The log levels are ranked by severity from high to low: FATAL, ERROR, and WARNING.
-Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log level** on the **Error Log** tab of the **Log Management** page.
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set Log level.
- The log levels are ranked by severity from high to low: FATAL, ERROR, and WARNING.
-Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log level** on the **Error Log** tab of the **Log Management** page.
     * @param LogLevels Log level.
- The log levels are ranked by severity from high to low: FATAL, ERROR, and WARNING.
-Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log level** on the **Error Log** tab of the **Log Management** page.
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get Log ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log ID** on the **Error Log** tab of the **Log Management** page. 
     * @return LogIds Log ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log ID** on the **Error Log** tab of the **Log Management** page.
     */
    public String [] getLogIds() {
        return this.LogIds;
    }

    /**
     * Set Log ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log ID** on the **Error Log** tab of the **Log Management** page.
     * @param LogIds Log ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log ID** on the **Error Log** tab of the **Log Management** page.
     */
    public void setLogIds(String [] LogIds) {
        this.LogIds = LogIds;
    }

    /**
     * Get Log connection information. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log connection information** on the **Error Log** tab of the **Log Management** page. 
     * @return LogConnections Log connection information. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log connection information** on the **Error Log** tab of the **Log Management** page.
     */
    public String [] getLogConnections() {
        return this.LogConnections;
    }

    /**
     * Set Log connection information. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log connection information** on the **Error Log** tab of the **Log Management** page.
     * @param LogConnections Log connection information. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and view the **log connection information** on the **Error Log** tab of the **Log Management** page.
     */
    public void setLogConnections(String [] LogConnections) {
        this.LogConnections = LogConnections;
    }

    /**
     * Get Specifies the field for filtering the logs. 
     * @return LogDetailParams Specifies the field for filtering the logs.
     */
    public String [] getLogDetailParams() {
        return this.LogDetailParams;
    }

    /**
     * Set Specifies the field for filtering the logs.
     * @param LogDetailParams Specifies the field for filtering the logs.
     */
    public void setLogDetailParams(String [] LogDetailParams) {
        this.LogDetailParams = LogDetailParams;
    }

    /**
     * Get Offset. The minimum value is 0, and the maximum value is 10000. The default value is 0. 
     * @return Offset Offset. The minimum value is 0, and the maximum value is 10000. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The minimum value is 0, and the maximum value is 10000. The default value is 0.
     * @param Offset Offset. The minimum value is 0, and the maximum value is 10000. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination size. The minimum value is 1, and the maximum value is 100. The default value is 20. 
     * @return Limit Pagination size. The minimum value is 1, and the maximum value is 100. The default value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination size. The minimum value is 1, and the maximum value is 100. The default value is 20.
     * @param Limit Pagination size. The minimum value is 1, and the maximum value is 100. The default value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeMongodbLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMongodbLogsRequest(DescribeMongodbLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.LogComponents != null) {
            this.LogComponents = new String[source.LogComponents.length];
            for (int i = 0; i < source.LogComponents.length; i++) {
                this.LogComponents[i] = new String(source.LogComponents[i]);
            }
        }
        if (source.LogLevels != null) {
            this.LogLevels = new String[source.LogLevels.length];
            for (int i = 0; i < source.LogLevels.length; i++) {
                this.LogLevels[i] = new String(source.LogLevels[i]);
            }
        }
        if (source.LogIds != null) {
            this.LogIds = new String[source.LogIds.length];
            for (int i = 0; i < source.LogIds.length; i++) {
                this.LogIds[i] = new String(source.LogIds[i]);
            }
        }
        if (source.LogConnections != null) {
            this.LogConnections = new String[source.LogConnections.length];
            for (int i = 0; i < source.LogConnections.length; i++) {
                this.LogConnections[i] = new String(source.LogConnections[i]);
            }
        }
        if (source.LogDetailParams != null) {
            this.LogDetailParams = new String[source.LogDetailParams.length];
            for (int i = 0; i < source.LogDetailParams.length; i++) {
                this.LogDetailParams[i] = new String(source.LogDetailParams[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamArraySimple(map, prefix + "LogComponents.", this.LogComponents);
        this.setParamArraySimple(map, prefix + "LogLevels.", this.LogLevels);
        this.setParamArraySimple(map, prefix + "LogIds.", this.LogIds);
        this.setParamArraySimple(map, prefix + "LogConnections.", this.LogConnections);
        this.setParamArraySimple(map, prefix + "LogDetailParams.", this.LogDetailParams);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

