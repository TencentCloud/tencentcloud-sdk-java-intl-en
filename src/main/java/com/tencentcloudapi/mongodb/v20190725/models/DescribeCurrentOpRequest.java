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

public class DescribeCurrentOpRequest extends AbstractModel {

    /**
    * Specifies the instance ID to be queried. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Namespace where the operation belongs, in the format of db.collection.
    */
    @SerializedName("Ns")
    @Expose
    private String Ns;

    /**
    * Sets the query and filtering condition to the execution time of the operation task.
- The default value is 0, and the value range is [0, 3600000], in milliseconds.
- The result will return the operation whose execution time exceeds the set time.
    */
    @SerializedName("MillisecondRunning")
    @Expose
    private Long MillisecondRunning;

    /**
    * Sets the query and filtering condition to the type of the operation task. Valid values:
- none: special status; idle connections or internal tasks.
- update: update data.
- insert: insertion operation.
- query: query operation.
- command: command operation.
- getmore: obtain more data.
- remove: deletion operation.
- killcursors: operation of releasing the query cursor.
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * Filtering condition, such as the shard name.
    */
    @SerializedName("ReplicaSetName")
    @Expose
    private String ReplicaSetName;

    /**
    * Sets the query and filtering condition to the node role.
- primary: primary node.
- secondary: secondary node.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Number of entries returned per request. The default value is 100, and the value range is [0, 100].
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. The default value is 0, and the value range is [0, 10000].
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field of the returned result set. Currently, sorting by MicrosecsRunning (execution time of the operation task) is supported.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method of the returned result set.
- ASC: ascending order. The default value is ASC, which indicates sorting in ascending order.
- DESC: descending order.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Specifies the instance ID to be queried. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list. 
     * @return InstanceId Specifies the instance ID to be queried. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the instance ID to be queried. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     * @param InstanceId Specifies the instance ID to be queried. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Namespace where the operation belongs, in the format of db.collection. 
     * @return Ns Namespace where the operation belongs, in the format of db.collection.
     */
    public String getNs() {
        return this.Ns;
    }

    /**
     * Set Namespace where the operation belongs, in the format of db.collection.
     * @param Ns Namespace where the operation belongs, in the format of db.collection.
     */
    public void setNs(String Ns) {
        this.Ns = Ns;
    }

    /**
     * Get Sets the query and filtering condition to the execution time of the operation task.
- The default value is 0, and the value range is [0, 3600000], in milliseconds.
- The result will return the operation whose execution time exceeds the set time. 
     * @return MillisecondRunning Sets the query and filtering condition to the execution time of the operation task.
- The default value is 0, and the value range is [0, 3600000], in milliseconds.
- The result will return the operation whose execution time exceeds the set time.
     */
    public Long getMillisecondRunning() {
        return this.MillisecondRunning;
    }

    /**
     * Set Sets the query and filtering condition to the execution time of the operation task.
- The default value is 0, and the value range is [0, 3600000], in milliseconds.
- The result will return the operation whose execution time exceeds the set time.
     * @param MillisecondRunning Sets the query and filtering condition to the execution time of the operation task.
- The default value is 0, and the value range is [0, 3600000], in milliseconds.
- The result will return the operation whose execution time exceeds the set time.
     */
    public void setMillisecondRunning(Long MillisecondRunning) {
        this.MillisecondRunning = MillisecondRunning;
    }

    /**
     * Get Sets the query and filtering condition to the type of the operation task. Valid values:
- none: special status; idle connections or internal tasks.
- update: update data.
- insert: insertion operation.
- query: query operation.
- command: command operation.
- getmore: obtain more data.
- remove: deletion operation.
- killcursors: operation of releasing the query cursor. 
     * @return Op Sets the query and filtering condition to the type of the operation task. Valid values:
- none: special status; idle connections or internal tasks.
- update: update data.
- insert: insertion operation.
- query: query operation.
- command: command operation.
- getmore: obtain more data.
- remove: deletion operation.
- killcursors: operation of releasing the query cursor.
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set Sets the query and filtering condition to the type of the operation task. Valid values:
- none: special status; idle connections or internal tasks.
- update: update data.
- insert: insertion operation.
- query: query operation.
- command: command operation.
- getmore: obtain more data.
- remove: deletion operation.
- killcursors: operation of releasing the query cursor.
     * @param Op Sets the query and filtering condition to the type of the operation task. Valid values:
- none: special status; idle connections or internal tasks.
- update: update data.
- insert: insertion operation.
- query: query operation.
- command: command operation.
- getmore: obtain more data.
- remove: deletion operation.
- killcursors: operation of releasing the query cursor.
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get Filtering condition, such as the shard name. 
     * @return ReplicaSetName Filtering condition, such as the shard name.
     */
    public String getReplicaSetName() {
        return this.ReplicaSetName;
    }

    /**
     * Set Filtering condition, such as the shard name.
     * @param ReplicaSetName Filtering condition, such as the shard name.
     */
    public void setReplicaSetName(String ReplicaSetName) {
        this.ReplicaSetName = ReplicaSetName;
    }

    /**
     * Get Sets the query and filtering condition to the node role.
- primary: primary node.
- secondary: secondary node. 
     * @return State Sets the query and filtering condition to the node role.
- primary: primary node.
- secondary: secondary node.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Sets the query and filtering condition to the node role.
- primary: primary node.
- secondary: secondary node.
     * @param State Sets the query and filtering condition to the node role.
- primary: primary node.
- secondary: secondary node.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Number of entries returned per request. The default value is 100, and the value range is [0, 100]. 
     * @return Limit Number of entries returned per request. The default value is 100, and the value range is [0, 100].
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries returned per request. The default value is 100, and the value range is [0, 100].
     * @param Limit Number of entries returned per request. The default value is 100, and the value range is [0, 100].
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. The default value is 0, and the value range is [0, 10000]. 
     * @return Offset Offset. The default value is 0, and the value range is [0, 10000].
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0, and the value range is [0, 10000].
     * @param Offset Offset. The default value is 0, and the value range is [0, 10000].
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field of the returned result set. Currently, sorting by MicrosecsRunning (execution time of the operation task) is supported. 
     * @return OrderBy Sorting field of the returned result set. Currently, sorting by MicrosecsRunning (execution time of the operation task) is supported.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field of the returned result set. Currently, sorting by MicrosecsRunning (execution time of the operation task) is supported.
     * @param OrderBy Sorting field of the returned result set. Currently, sorting by MicrosecsRunning (execution time of the operation task) is supported.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method of the returned result set.
- ASC: ascending order. The default value is ASC, which indicates sorting in ascending order.
- DESC: descending order. 
     * @return OrderByType Sorting method of the returned result set.
- ASC: ascending order. The default value is ASC, which indicates sorting in ascending order.
- DESC: descending order.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method of the returned result set.
- ASC: ascending order. The default value is ASC, which indicates sorting in ascending order.
- DESC: descending order.
     * @param OrderByType Sorting method of the returned result set.
- ASC: ascending order. The default value is ASC, which indicates sorting in ascending order.
- DESC: descending order.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeCurrentOpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCurrentOpRequest(DescribeCurrentOpRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ns != null) {
            this.Ns = new String(source.Ns);
        }
        if (source.MillisecondRunning != null) {
            this.MillisecondRunning = new Long(source.MillisecondRunning);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.ReplicaSetName != null) {
            this.ReplicaSetName = new String(source.ReplicaSetName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "Ns", this.Ns);
        this.setParamSimple(map, prefix + "MillisecondRunning", this.MillisecondRunning);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamSimple(map, prefix + "ReplicaSetName", this.ReplicaSetName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

