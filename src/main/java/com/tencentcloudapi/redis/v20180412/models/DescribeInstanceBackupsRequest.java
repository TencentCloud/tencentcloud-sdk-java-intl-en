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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceBackupsRequest extends AbstractModel {

    /**
    * Number of backups returned per page. Default value: `20`. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset, which is an integral multiple of `Limit`. `offset` = `limit` * (page number - 1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the `DescribeInstance` API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-02-08 16:46:34. This parameter is used to query the list of instance backups started during the [beginTime, endTime] range.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-02-08 19:09:26. This parameter is used to query the list of instance backups started during the [beginTime, endTime] range.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Backup task status:
`1`: The backup is in the process.
`2`: The backup is normal.
`3`: The backup is being converted to an RDB file.
`4`: Conversion to RDB has been completed.
`-1`: The backup expired.
`-2`: The backup has been deleted.
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * Instance name, which can be fuzzily searched.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get Number of backups returned per page. Default value: `20`. Maximum value: `100`. 
     * @return Limit Number of backups returned per page. Default value: `20`. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of backups returned per page. Default value: `20`. Maximum value: `100`.
     * @param Limit Number of backups returned per page. Default value: `20`. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset, which is an integral multiple of `Limit`. `offset` = `limit` * (page number - 1). 
     * @return Offset Pagination offset, which is an integral multiple of `Limit`. `offset` = `limit` * (page number - 1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, which is an integral multiple of `Limit`. `offset` = `limit` * (page number - 1).
     * @param Offset Pagination offset, which is an integral multiple of `Limit`. `offset` = `limit` * (page number - 1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the `DescribeInstance` API. 
     * @return InstanceId ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the `DescribeInstance` API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the `DescribeInstance` API.
     * @param InstanceId ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the `DescribeInstance` API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-02-08 16:46:34. This parameter is used to query the list of instance backups started during the [beginTime, endTime] range. 
     * @return BeginTime Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-02-08 16:46:34. This parameter is used to query the list of instance backups started during the [beginTime, endTime] range.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-02-08 16:46:34. This parameter is used to query the list of instance backups started during the [beginTime, endTime] range.
     * @param BeginTime Start time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-02-08 16:46:34. This parameter is used to query the list of instance backups started during the [beginTime, endTime] range.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-02-08 19:09:26. This parameter is used to query the list of instance backups started during the [beginTime, endTime] range. 
     * @return EndTime End time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-02-08 19:09:26. This parameter is used to query the list of instance backups started during the [beginTime, endTime] range.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-02-08 19:09:26. This parameter is used to query the list of instance backups started during the [beginTime, endTime] range.
     * @param EndTime End time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-02-08 19:09:26. This parameter is used to query the list of instance backups started during the [beginTime, endTime] range.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Backup task status:
`1`: The backup is in the process.
`2`: The backup is normal.
`3`: The backup is being converted to an RDB file.
`4`: Conversion to RDB has been completed.
`-1`: The backup expired.
`-2`: The backup has been deleted. 
     * @return Status Backup task status:
`1`: The backup is in the process.
`2`: The backup is normal.
`3`: The backup is being converted to an RDB file.
`4`: Conversion to RDB has been completed.
`-1`: The backup expired.
`-2`: The backup has been deleted.
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Backup task status:
`1`: The backup is in the process.
`2`: The backup is normal.
`3`: The backup is being converted to an RDB file.
`4`: Conversion to RDB has been completed.
`-1`: The backup expired.
`-2`: The backup has been deleted.
     * @param Status Backup task status:
`1`: The backup is in the process.
`2`: The backup is normal.
`3`: The backup is being converted to an RDB file.
`4`: Conversion to RDB has been completed.
`-1`: The backup expired.
`-2`: The backup has been deleted.
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get Instance name, which can be fuzzily searched. 
     * @return InstanceName Instance name, which can be fuzzily searched.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, which can be fuzzily searched.
     * @param InstanceName Instance name, which can be fuzzily searched.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public DescribeInstanceBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceBackupsRequest(DescribeInstanceBackupsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

