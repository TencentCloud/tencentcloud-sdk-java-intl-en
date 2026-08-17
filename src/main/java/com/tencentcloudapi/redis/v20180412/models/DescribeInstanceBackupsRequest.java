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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceBackupsRequest extends AbstractModel {

    /**
    * <p>List size of output backup per page. Default size is 20, maximum value is 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Pagination offset, integer multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Instance ID to be operated. You can get it from the InstanceId in the return value from the DescribeInstance API.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Start time, for example, in the format of 2017-02-08 16:46:34. Query the backup list of instances that started backup during the [beginTime, endTime] period, with a maximum query span of 30 days.</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>End time, in the format of 2017-02-08 19:09:26. Query the backup list of instances that started backup within the period of [beginTime, endTime]. The maximum query time span is 30 days.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Backup task status:<br>1: Backup is in progress.<br>2: Backup is normal.<br>3: Backup is switching to RDB file processing.<br>4: RDB switch completed.<br>-1: Backup has expired.<br>-2: Backup has been deleted.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>Instance name, supports name fuzzy search based on instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get <p>List size of output backup per page. Default size is 20, maximum value is 100.</p> 
     * @return Limit <p>List size of output backup per page. Default size is 20, maximum value is 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>List size of output backup per page. Default size is 20, maximum value is 100.</p>
     * @param Limit <p>List size of output backup per page. Default size is 20, maximum value is 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Pagination offset, integer multiple of Limit. Calculation formula: offset=limit*(page number-1).</p> 
     * @return Offset <p>Pagination offset, integer multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset, integer multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
     * @param Offset <p>Pagination offset, integer multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Instance ID to be operated. You can get it from the InstanceId in the return value from the DescribeInstance API.</p> 
     * @return InstanceId <p>Instance ID to be operated. You can get it from the InstanceId in the return value from the DescribeInstance API.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID to be operated. You can get it from the InstanceId in the return value from the DescribeInstance API.</p>
     * @param InstanceId <p>Instance ID to be operated. You can get it from the InstanceId in the return value from the DescribeInstance API.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Start time, for example, in the format of 2017-02-08 16:46:34. Query the backup list of instances that started backup during the [beginTime, endTime] period, with a maximum query span of 30 days.</p> 
     * @return BeginTime <p>Start time, for example, in the format of 2017-02-08 16:46:34. Query the backup list of instances that started backup during the [beginTime, endTime] period, with a maximum query span of 30 days.</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>Start time, for example, in the format of 2017-02-08 16:46:34. Query the backup list of instances that started backup during the [beginTime, endTime] period, with a maximum query span of 30 days.</p>
     * @param BeginTime <p>Start time, for example, in the format of 2017-02-08 16:46:34. Query the backup list of instances that started backup during the [beginTime, endTime] period, with a maximum query span of 30 days.</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>End time, in the format of 2017-02-08 19:09:26. Query the backup list of instances that started backup within the period of [beginTime, endTime]. The maximum query time span is 30 days.</p> 
     * @return EndTime <p>End time, in the format of 2017-02-08 19:09:26. Query the backup list of instances that started backup within the period of [beginTime, endTime]. The maximum query time span is 30 days.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time, in the format of 2017-02-08 19:09:26. Query the backup list of instances that started backup within the period of [beginTime, endTime]. The maximum query time span is 30 days.</p>
     * @param EndTime <p>End time, in the format of 2017-02-08 19:09:26. Query the backup list of instances that started backup within the period of [beginTime, endTime]. The maximum query time span is 30 days.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Backup task status:<br>1: Backup is in progress.<br>2: Backup is normal.<br>3: Backup is switching to RDB file processing.<br>4: RDB switch completed.<br>-1: Backup has expired.<br>-2: Backup has been deleted.</p> 
     * @return Status <p>Backup task status:<br>1: Backup is in progress.<br>2: Backup is normal.<br>3: Backup is switching to RDB file processing.<br>4: RDB switch completed.<br>-1: Backup has expired.<br>-2: Backup has been deleted.</p>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Backup task status:<br>1: Backup is in progress.<br>2: Backup is normal.<br>3: Backup is switching to RDB file processing.<br>4: RDB switch completed.<br>-1: Backup has expired.<br>-2: Backup has been deleted.</p>
     * @param Status <p>Backup task status:<br>1: Backup is in progress.<br>2: Backup is normal.<br>3: Backup is switching to RDB file processing.<br>4: RDB switch completed.<br>-1: Backup has expired.<br>-2: Backup has been deleted.</p>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Instance name, supports name fuzzy search based on instance name.</p> 
     * @return InstanceName <p>Instance name, supports name fuzzy search based on instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name, supports name fuzzy search based on instance name.</p>
     * @param InstanceName <p>Instance name, supports name fuzzy search based on instance name.</p>
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

