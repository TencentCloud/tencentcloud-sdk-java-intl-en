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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceBackupsRequest extends AbstractModel{

    /**
    * ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the DescribeInstance API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance list size. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is an integral multiple of `Limit`
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
    * 1: backup in process; 2: backing up normally; 3: converting from backup to RDB file; 4: RDB conversion completed; -1: backup expired; -2: backup deleted.
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the DescribeInstance API. 
     * @return InstanceId ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the DescribeInstance API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the DescribeInstance API.
     * @param InstanceId ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the DescribeInstance API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance list size. Default value: 20 
     * @return Limit Instance list size. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Instance list size. Default value: 20
     * @param Limit Instance list size. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is an integral multiple of `Limit` 
     * @return Offset Offset, which is an integral multiple of `Limit`
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is an integral multiple of `Limit`
     * @param Offset Offset, which is an integral multiple of `Limit`
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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
     * Get 1: backup in process; 2: backing up normally; 3: converting from backup to RDB file; 4: RDB conversion completed; -1: backup expired; -2: backup deleted. 
     * @return Status 1: backup in process; 2: backing up normally; 3: converting from backup to RDB file; 4: RDB conversion completed; -1: backup expired; -2: backup deleted.
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 1: backup in process; 2: backing up normally; 3: converting from backup to RDB file; 4: RDB conversion completed; -1: backup expired; -2: backup deleted.
     * @param Status 1: backup in process; 2: backing up normally; 3: converting from backup to RDB file; 4: RDB conversion completed; -1: backup expired; -2: backup deleted.
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public DescribeInstanceBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceBackupsRequest(DescribeInstanceBackupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

