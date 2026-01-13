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

public class DescribeBackupDownloadTaskRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/mongodb), and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the backup file name for filtering download tasks of the specified file. The [DescribeDBBackups](https://www.tencentcloud.com/document/product/240/38574?from_cn_redirect=1) API can be called to obtain the backup file name.
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * Specifies the task within the query time range, and StartTime specifies the start time. If not specified, there are no limitations on the start time by default.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Specifies the task within the query time range, and EndTime specifies the end time. If not specified, there are no limitations on the end time by default.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of entries returned for this query. Value range: 1–100. The default value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies the number of pages returned for this query. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field.
- createTime: sort by the creation time of the backup download task. The default value is createTime.
- finishTime: sort by the completion time of the backup download task.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method.
- asc: ascending order.
- desc: descending order. The default value is desc.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Specifies the task status for filtering download tasks. If this parameter is not configured, tasks of all status types will be returned.
- 0: wait for execution.
- 1: downloading.
- 2: download completed.
- 3: download failed.
- 4: wait for retry.
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

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
     * Get Specifies the backup file name for filtering download tasks of the specified file. The [DescribeDBBackups](https://www.tencentcloud.com/document/product/240/38574?from_cn_redirect=1) API can be called to obtain the backup file name. 
     * @return BackupName Specifies the backup file name for filtering download tasks of the specified file. The [DescribeDBBackups](https://www.tencentcloud.com/document/product/240/38574?from_cn_redirect=1) API can be called to obtain the backup file name.
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Specifies the backup file name for filtering download tasks of the specified file. The [DescribeDBBackups](https://www.tencentcloud.com/document/product/240/38574?from_cn_redirect=1) API can be called to obtain the backup file name.
     * @param BackupName Specifies the backup file name for filtering download tasks of the specified file. The [DescribeDBBackups](https://www.tencentcloud.com/document/product/240/38574?from_cn_redirect=1) API can be called to obtain the backup file name.
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get Specifies the task within the query time range, and StartTime specifies the start time. If not specified, there are no limitations on the start time by default. 
     * @return StartTime Specifies the task within the query time range, and StartTime specifies the start time. If not specified, there are no limitations on the start time by default.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Specifies the task within the query time range, and StartTime specifies the start time. If not specified, there are no limitations on the start time by default.
     * @param StartTime Specifies the task within the query time range, and StartTime specifies the start time. If not specified, there are no limitations on the start time by default.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Specifies the task within the query time range, and EndTime specifies the end time. If not specified, there are no limitations on the end time by default. 
     * @return EndTime Specifies the task within the query time range, and EndTime specifies the end time. If not specified, there are no limitations on the end time by default.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Specifies the task within the query time range, and EndTime specifies the end time. If not specified, there are no limitations on the end time by default.
     * @param EndTime Specifies the task within the query time range, and EndTime specifies the end time. If not specified, there are no limitations on the end time by default.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of entries returned for this query. Value range: 1–100. The default value is 20. 
     * @return Limit Number of entries returned for this query. Value range: 1–100. The default value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries returned for this query. Value range: 1–100. The default value is 20.
     * @param Limit Number of entries returned for this query. Value range: 1–100. The default value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies the number of pages returned for this query. The default value is 0. 
     * @return Offset Specifies the number of pages returned for this query. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Specifies the number of pages returned for this query. The default value is 0.
     * @param Offset Specifies the number of pages returned for this query. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field.
- createTime: sort by the creation time of the backup download task. The default value is createTime.
- finishTime: sort by the completion time of the backup download task. 
     * @return OrderBy Sorting field.
- createTime: sort by the creation time of the backup download task. The default value is createTime.
- finishTime: sort by the completion time of the backup download task.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field.
- createTime: sort by the creation time of the backup download task. The default value is createTime.
- finishTime: sort by the completion time of the backup download task.
     * @param OrderBy Sorting field.
- createTime: sort by the creation time of the backup download task. The default value is createTime.
- finishTime: sort by the completion time of the backup download task.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method.
- asc: ascending order.
- desc: descending order. The default value is desc. 
     * @return OrderByType Sorting method.
- asc: ascending order.
- desc: descending order. The default value is desc.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method.
- asc: ascending order.
- desc: descending order. The default value is desc.
     * @param OrderByType Sorting method.
- asc: ascending order.
- desc: descending order. The default value is desc.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Specifies the task status for filtering download tasks. If this parameter is not configured, tasks of all status types will be returned.
- 0: wait for execution.
- 1: downloading.
- 2: download completed.
- 3: download failed.
- 4: wait for retry. 
     * @return Status Specifies the task status for filtering download tasks. If this parameter is not configured, tasks of all status types will be returned.
- 0: wait for execution.
- 1: downloading.
- 2: download completed.
- 3: download failed.
- 4: wait for retry.
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Specifies the task status for filtering download tasks. If this parameter is not configured, tasks of all status types will be returned.
- 0: wait for execution.
- 1: downloading.
- 2: download completed.
- 3: download failed.
- 4: wait for retry.
     * @param Status Specifies the task status for filtering download tasks. If this parameter is not configured, tasks of all status types will be returned.
- 0: wait for execution.
- 1: downloading.
- 2: download completed.
- 3: download failed.
- 4: wait for retry.
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public DescribeBackupDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDownloadTaskRequest(DescribeBackupDownloadTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

