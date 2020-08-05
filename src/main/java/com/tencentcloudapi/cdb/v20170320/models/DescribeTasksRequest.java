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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel{

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) to query the ID, whose value is the `InstanceId` value in output parameters.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ID of an async task request, i.e., `AsyncRequestId` returned by relevant TencentDB operations.
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;

    /**
    * Task type. If no value is passed in, all task types will be queried. Valid values:
1 - rolling back a database;
2 - performing an SQL operation;
3 - importing data;
5 - setting a parameter;
6 - initializing a TencentDB instance;
7 - restarting a TencentDB instance;
8 - enabling GTID of a TencentDB instance;
9 - upgrading a read-only instance;
10 - rolling back databases in batches;
11 - upgrading a primary instance;
12 - deleting a TencentDB table;
13 - promoting a disaster recovery instance.
    */
    @SerializedName("TaskTypes")
    @Expose
    private Long [] TaskTypes;

    /**
    * Task status. If no value is passed in, all task statuses will be queried. Valid values:
-1 - undefined;
0 - initializing;
1 - running;
2 - succeeded;
3 - failed;
4 - terminated;
5 - deleted;
6 - paused.
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * Start time of the first task in the format of yyyy-MM-dd HH:mm:ss, such as 2017-12-31 10:40:01. It is used for queries by time range.
    */
    @SerializedName("StartTimeBegin")
    @Expose
    private String StartTimeBegin;

    /**
    * End time of the last task in the format of yyyy-MM-dd HH:mm:ss, such as 2017-12-31 10:40:01. It is used for queries by time range.
    */
    @SerializedName("StartTimeEnd")
    @Expose
    private String StartTimeEnd;

    /**
    * Record offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned for a single request. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) to query the ID, whose value is the `InstanceId` value in output parameters. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) to query the ID, whose value is the `InstanceId` value in output parameters.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) to query the ID, whose value is the `InstanceId` value in output parameters.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) to query the ID, whose value is the `InstanceId` value in output parameters.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ID of an async task request, i.e., `AsyncRequestId` returned by relevant TencentDB operations. 
     * @return AsyncRequestId ID of an async task request, i.e., `AsyncRequestId` returned by relevant TencentDB operations.
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set ID of an async task request, i.e., `AsyncRequestId` returned by relevant TencentDB operations.
     * @param AsyncRequestId ID of an async task request, i.e., `AsyncRequestId` returned by relevant TencentDB operations.
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get Task type. If no value is passed in, all task types will be queried. Valid values:
1 - rolling back a database;
2 - performing an SQL operation;
3 - importing data;
5 - setting a parameter;
6 - initializing a TencentDB instance;
7 - restarting a TencentDB instance;
8 - enabling GTID of a TencentDB instance;
9 - upgrading a read-only instance;
10 - rolling back databases in batches;
11 - upgrading a primary instance;
12 - deleting a TencentDB table;
13 - promoting a disaster recovery instance. 
     * @return TaskTypes Task type. If no value is passed in, all task types will be queried. Valid values:
1 - rolling back a database;
2 - performing an SQL operation;
3 - importing data;
5 - setting a parameter;
6 - initializing a TencentDB instance;
7 - restarting a TencentDB instance;
8 - enabling GTID of a TencentDB instance;
9 - upgrading a read-only instance;
10 - rolling back databases in batches;
11 - upgrading a primary instance;
12 - deleting a TencentDB table;
13 - promoting a disaster recovery instance.
     */
    public Long [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set Task type. If no value is passed in, all task types will be queried. Valid values:
1 - rolling back a database;
2 - performing an SQL operation;
3 - importing data;
5 - setting a parameter;
6 - initializing a TencentDB instance;
7 - restarting a TencentDB instance;
8 - enabling GTID of a TencentDB instance;
9 - upgrading a read-only instance;
10 - rolling back databases in batches;
11 - upgrading a primary instance;
12 - deleting a TencentDB table;
13 - promoting a disaster recovery instance.
     * @param TaskTypes Task type. If no value is passed in, all task types will be queried. Valid values:
1 - rolling back a database;
2 - performing an SQL operation;
3 - importing data;
5 - setting a parameter;
6 - initializing a TencentDB instance;
7 - restarting a TencentDB instance;
8 - enabling GTID of a TencentDB instance;
9 - upgrading a read-only instance;
10 - rolling back databases in batches;
11 - upgrading a primary instance;
12 - deleting a TencentDB table;
13 - promoting a disaster recovery instance.
     */
    public void setTaskTypes(Long [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get Task status. If no value is passed in, all task statuses will be queried. Valid values:
-1 - undefined;
0 - initializing;
1 - running;
2 - succeeded;
3 - failed;
4 - terminated;
5 - deleted;
6 - paused. 
     * @return TaskStatus Task status. If no value is passed in, all task statuses will be queried. Valid values:
-1 - undefined;
0 - initializing;
1 - running;
2 - succeeded;
3 - failed;
4 - terminated;
5 - deleted;
6 - paused.
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status. If no value is passed in, all task statuses will be queried. Valid values:
-1 - undefined;
0 - initializing;
1 - running;
2 - succeeded;
3 - failed;
4 - terminated;
5 - deleted;
6 - paused.
     * @param TaskStatus Task status. If no value is passed in, all task statuses will be queried. Valid values:
-1 - undefined;
0 - initializing;
1 - running;
2 - succeeded;
3 - failed;
4 - terminated;
5 - deleted;
6 - paused.
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Start time of the first task in the format of yyyy-MM-dd HH:mm:ss, such as 2017-12-31 10:40:01. It is used for queries by time range. 
     * @return StartTimeBegin Start time of the first task in the format of yyyy-MM-dd HH:mm:ss, such as 2017-12-31 10:40:01. It is used for queries by time range.
     */
    public String getStartTimeBegin() {
        return this.StartTimeBegin;
    }

    /**
     * Set Start time of the first task in the format of yyyy-MM-dd HH:mm:ss, such as 2017-12-31 10:40:01. It is used for queries by time range.
     * @param StartTimeBegin Start time of the first task in the format of yyyy-MM-dd HH:mm:ss, such as 2017-12-31 10:40:01. It is used for queries by time range.
     */
    public void setStartTimeBegin(String StartTimeBegin) {
        this.StartTimeBegin = StartTimeBegin;
    }

    /**
     * Get End time of the last task in the format of yyyy-MM-dd HH:mm:ss, such as 2017-12-31 10:40:01. It is used for queries by time range. 
     * @return StartTimeEnd End time of the last task in the format of yyyy-MM-dd HH:mm:ss, such as 2017-12-31 10:40:01. It is used for queries by time range.
     */
    public String getStartTimeEnd() {
        return this.StartTimeEnd;
    }

    /**
     * Set End time of the last task in the format of yyyy-MM-dd HH:mm:ss, such as 2017-12-31 10:40:01. It is used for queries by time range.
     * @param StartTimeEnd End time of the last task in the format of yyyy-MM-dd HH:mm:ss, such as 2017-12-31 10:40:01. It is used for queries by time range.
     */
    public void setStartTimeEnd(String StartTimeEnd) {
        this.StartTimeEnd = StartTimeEnd;
    }

    /**
     * Get Record offset. Default value: 0. 
     * @return Offset Record offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Record offset. Default value: 0.
     * @param Offset Record offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned for a single request. Default value: 20. Maximum value: 100. 
     * @return Limit Number of results to be returned for a single request. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned for a single request. Default value: 20. Maximum value: 100.
     * @param Limit Number of results to be returned for a single request. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamSimple(map, prefix + "StartTimeBegin", this.StartTimeBegin);
        this.setParamSimple(map, prefix + "StartTimeEnd", this.StartTimeEnd);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

