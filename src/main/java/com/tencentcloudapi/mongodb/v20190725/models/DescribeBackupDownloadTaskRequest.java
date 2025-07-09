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
    * Instance ID in the format of "cmgo-p8vnipr5", which is the same as the instance ID displayed in the TencentDB console
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The name of a backup file with download tasks to be queried
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * The start time of the query period. Tasks whose start time and end time fall within the query period will be queried. If it is left empty, the start time can be any time earlier than the end time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time of the query period. Tasks will be queried if their start and end times fall within the query period. If it is left empty, the end time can be any time later than the start time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The maximum number of results returned per page. Value range: 1-100. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset for pagination. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The field used to sort the results. Valid values: `createTime` (default), `finishTime`.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sort order. Valid values: `asc`, `desc` (default).
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * The status of the tasks to be queried. Valid values: `0` (waiting for execution), `1` (downloading), `2` (downloaded), `3` (download failed), `4` (waiting for retry). If it is left empty, tasks in any status will be returned.
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get Instance ID in the format of "cmgo-p8vnipr5", which is the same as the instance ID displayed in the TencentDB console 
     * @return InstanceId Instance ID in the format of "cmgo-p8vnipr5", which is the same as the instance ID displayed in the TencentDB console
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of "cmgo-p8vnipr5", which is the same as the instance ID displayed in the TencentDB console
     * @param InstanceId Instance ID in the format of "cmgo-p8vnipr5", which is the same as the instance ID displayed in the TencentDB console
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The name of a backup file with download tasks to be queried 
     * @return BackupName The name of a backup file with download tasks to be queried
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set The name of a backup file with download tasks to be queried
     * @param BackupName The name of a backup file with download tasks to be queried
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get The start time of the query period. Tasks whose start time and end time fall within the query period will be queried. If it is left empty, the start time can be any time earlier than the end time. 
     * @return StartTime The start time of the query period. Tasks whose start time and end time fall within the query period will be queried. If it is left empty, the start time can be any time earlier than the end time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time of the query period. Tasks whose start time and end time fall within the query period will be queried. If it is left empty, the start time can be any time earlier than the end time.
     * @param StartTime The start time of the query period. Tasks whose start time and end time fall within the query period will be queried. If it is left empty, the start time can be any time earlier than the end time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time of the query period. Tasks will be queried if their start and end times fall within the query period. If it is left empty, the end time can be any time later than the start time. 
     * @return EndTime The end time of the query period. Tasks will be queried if their start and end times fall within the query period. If it is left empty, the end time can be any time later than the start time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the query period. Tasks will be queried if their start and end times fall within the query period. If it is left empty, the end time can be any time later than the start time.
     * @param EndTime The end time of the query period. Tasks will be queried if their start and end times fall within the query period. If it is left empty, the end time can be any time later than the start time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The maximum number of results returned per page. Value range: 1-100. Default value: `20`. 
     * @return Limit The maximum number of results returned per page. Value range: 1-100. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of results returned per page. Value range: 1-100. Default value: `20`.
     * @param Limit The maximum number of results returned per page. Value range: 1-100. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset for pagination. Default value: `0`. 
     * @return Offset Offset for pagination. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for pagination. Default value: `0`.
     * @param Offset Offset for pagination. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The field used to sort the results. Valid values: `createTime` (default), `finishTime`. 
     * @return OrderBy The field used to sort the results. Valid values: `createTime` (default), `finishTime`.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set The field used to sort the results. Valid values: `createTime` (default), `finishTime`.
     * @param OrderBy The field used to sort the results. Valid values: `createTime` (default), `finishTime`.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sort order. Valid values: `asc`, `desc` (default). 
     * @return OrderByType Sort order. Valid values: `asc`, `desc` (default).
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sort order. Valid values: `asc`, `desc` (default).
     * @param OrderByType Sort order. Valid values: `asc`, `desc` (default).
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get The status of the tasks to be queried. Valid values: `0` (waiting for execution), `1` (downloading), `2` (downloaded), `3` (download failed), `4` (waiting for retry). If it is left empty, tasks in any status will be returned. 
     * @return Status The status of the tasks to be queried. Valid values: `0` (waiting for execution), `1` (downloading), `2` (downloaded), `3` (download failed), `4` (waiting for retry). If it is left empty, tasks in any status will be returned.
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set The status of the tasks to be queried. Valid values: `0` (waiting for execution), `1` (downloading), `2` (downloaded), `3` (download failed), `4` (waiting for retry). If it is left empty, tasks in any status will be returned.
     * @param Status The status of the tasks to be queried. Valid values: `0` (waiting for execution), `1` (downloading), `2` (downloaded), `3` (download failed), `4` (waiting for retry). If it is left empty, tasks in any status will be returned.
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

