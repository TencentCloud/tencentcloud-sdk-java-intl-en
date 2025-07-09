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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBBackupsRequest extends AbstractModel {

    /**
    * Instance ID in the format of postgres-4wdeb0zv.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Backup mode (1: full). Currently, only full backup is supported. The value is 1.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Query start time in the format of 2018-06-10 17:06:38, which cannot be more than 7 days ago
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time in the format of 2018-06-10 17:06:38
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of entries to be returned per page for backup list. Default value: 20. Minimum value: 1. Maximum value: 100. (If this parameter is left empty or 0, the default value will be used)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number for data return in paged query. Pagination starts from 0. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Instance ID in the format of postgres-4wdeb0zv. 
     * @return DBInstanceId Instance ID in the format of postgres-4wdeb0zv.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID in the format of postgres-4wdeb0zv.
     * @param DBInstanceId Instance ID in the format of postgres-4wdeb0zv.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Backup mode (1: full). Currently, only full backup is supported. The value is 1. 
     * @return Type Backup mode (1: full). Currently, only full backup is supported. The value is 1.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Backup mode (1: full). Currently, only full backup is supported. The value is 1.
     * @param Type Backup mode (1: full). Currently, only full backup is supported. The value is 1.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Query start time in the format of 2018-06-10 17:06:38, which cannot be more than 7 days ago 
     * @return StartTime Query start time in the format of 2018-06-10 17:06:38, which cannot be more than 7 days ago
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time in the format of 2018-06-10 17:06:38, which cannot be more than 7 days ago
     * @param StartTime Query start time in the format of 2018-06-10 17:06:38, which cannot be more than 7 days ago
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time in the format of 2018-06-10 17:06:38 
     * @return EndTime Query end time in the format of 2018-06-10 17:06:38
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time in the format of 2018-06-10 17:06:38
     * @param EndTime Query end time in the format of 2018-06-10 17:06:38
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of entries to be returned per page for backup list. Default value: 20. Minimum value: 1. Maximum value: 100. (If this parameter is left empty or 0, the default value will be used) 
     * @return Limit Number of entries to be returned per page for backup list. Default value: 20. Minimum value: 1. Maximum value: 100. (If this parameter is left empty or 0, the default value will be used)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned per page for backup list. Default value: 20. Minimum value: 1. Maximum value: 100. (If this parameter is left empty or 0, the default value will be used)
     * @param Limit Number of entries to be returned per page for backup list. Default value: 20. Minimum value: 1. Maximum value: 100. (If this parameter is left empty or 0, the default value will be used)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number for data return in paged query. Pagination starts from 0. Default value: 0. 
     * @return Offset Page number for data return in paged query. Pagination starts from 0. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number for data return in paged query. Pagination starts from 0. Default value: 0.
     * @param Offset Page number for data return in paged query. Pagination starts from 0. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeDBBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBBackupsRequest(DescribeDBBackupsRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

