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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSArchiveLogsRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Logging ID</p>
    */
    @SerializedName("ArchiveLogId")
    @Expose
    private Long ArchiveLogId;

    /**
    * <p>End time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Backup status: pending, running, success, failed</p>
    */
    @SerializedName("FilterStatus")
    @Expose
    private String FilterStatus;

    /**
    * <p>Limit on number</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting field, enumerate: StartTime, EndTime, ExpiredTime, FileSize, BackupDuration</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Sorting method: ASC: sequential, DESC: reverse</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>Start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Logging ID</p> 
     * @return ArchiveLogId <p>Logging ID</p>
     */
    public Long getArchiveLogId() {
        return this.ArchiveLogId;
    }

    /**
     * Set <p>Logging ID</p>
     * @param ArchiveLogId <p>Logging ID</p>
     */
    public void setArchiveLogId(Long ArchiveLogId) {
        this.ArchiveLogId = ArchiveLogId;
    }

    /**
     * Get <p>End time.</p> 
     * @return EndTime <p>End time.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time.</p>
     * @param EndTime <p>End time.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Backup status: pending, running, success, failed</p> 
     * @return FilterStatus <p>Backup status: pending, running, success, failed</p>
     */
    public String getFilterStatus() {
        return this.FilterStatus;
    }

    /**
     * Set <p>Backup status: pending, running, success, failed</p>
     * @param FilterStatus <p>Backup status: pending, running, success, failed</p>
     */
    public void setFilterStatus(String FilterStatus) {
        this.FilterStatus = FilterStatus;
    }

    /**
     * Get <p>Limit on number</p> 
     * @return Limit <p>Limit on number</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Limit on number</p>
     * @param Limit <p>Limit on number</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset.</p> 
     * @return Offset <p>Offset.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset.</p>
     * @param Offset <p>Offset.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting field, enumerate: StartTime, EndTime, ExpiredTime, FileSize, BackupDuration</p> 
     * @return OrderBy <p>Sorting field, enumerate: StartTime, EndTime, ExpiredTime, FileSize, BackupDuration</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting field, enumerate: StartTime, EndTime, ExpiredTime, FileSize, BackupDuration</p>
     * @param OrderBy <p>Sorting field, enumerate: StartTime, EndTime, ExpiredTime, FileSize, BackupDuration</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Sorting method: ASC: sequential, DESC: reverse</p> 
     * @return OrderType <p>Sorting method: ASC: sequential, DESC: reverse</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>Sorting method: ASC: sequential, DESC: reverse</p>
     * @param OrderType <p>Sorting method: ASC: sequential, DESC: reverse</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>Start time.</p> 
     * @return StartTime <p>Start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time.</p>
     * @param StartTime <p>Start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public DescribeDBSArchiveLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSArchiveLogsRequest(DescribeDBSArchiveLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ArchiveLogId != null) {
            this.ArchiveLogId = new Long(source.ArchiveLogId);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FilterStatus != null) {
            this.FilterStatus = new String(source.FilterStatus);
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
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ArchiveLogId", this.ArchiveLogId);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FilterStatus", this.FilterStatus);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

