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

public class StartDelayReplicationRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Delayed replication mode. Valid values: `DEFAULT` (replicate according to the specified replication delay), `GTID` (replicate according to the specified GTID), `DUE_TIME` (replicate according to the specified point in time).
    */
    @SerializedName("DelayReplicationType")
    @Expose
    private String DelayReplicationType;

    /**
    * Specified point in time. Default value: 0. The maximum value cannot be later than the current time.
    */
    @SerializedName("DueTime")
    @Expose
    private Long DueTime;

    /**
    * Specified GITD. This parameter is required when the delayed replication mode is `GTID`.
    */
    @SerializedName("Gtid")
    @Expose
    private String Gtid;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Delayed replication mode. Valid values: `DEFAULT` (replicate according to the specified replication delay), `GTID` (replicate according to the specified GTID), `DUE_TIME` (replicate according to the specified point in time). 
     * @return DelayReplicationType Delayed replication mode. Valid values: `DEFAULT` (replicate according to the specified replication delay), `GTID` (replicate according to the specified GTID), `DUE_TIME` (replicate according to the specified point in time).
     */
    public String getDelayReplicationType() {
        return this.DelayReplicationType;
    }

    /**
     * Set Delayed replication mode. Valid values: `DEFAULT` (replicate according to the specified replication delay), `GTID` (replicate according to the specified GTID), `DUE_TIME` (replicate according to the specified point in time).
     * @param DelayReplicationType Delayed replication mode. Valid values: `DEFAULT` (replicate according to the specified replication delay), `GTID` (replicate according to the specified GTID), `DUE_TIME` (replicate according to the specified point in time).
     */
    public void setDelayReplicationType(String DelayReplicationType) {
        this.DelayReplicationType = DelayReplicationType;
    }

    /**
     * Get Specified point in time. Default value: 0. The maximum value cannot be later than the current time. 
     * @return DueTime Specified point in time. Default value: 0. The maximum value cannot be later than the current time.
     */
    public Long getDueTime() {
        return this.DueTime;
    }

    /**
     * Set Specified point in time. Default value: 0. The maximum value cannot be later than the current time.
     * @param DueTime Specified point in time. Default value: 0. The maximum value cannot be later than the current time.
     */
    public void setDueTime(Long DueTime) {
        this.DueTime = DueTime;
    }

    /**
     * Get Specified GITD. This parameter is required when the delayed replication mode is `GTID`. 
     * @return Gtid Specified GITD. This parameter is required when the delayed replication mode is `GTID`.
     */
    public String getGtid() {
        return this.Gtid;
    }

    /**
     * Set Specified GITD. This parameter is required when the delayed replication mode is `GTID`.
     * @param Gtid Specified GITD. This parameter is required when the delayed replication mode is `GTID`.
     */
    public void setGtid(String Gtid) {
        this.Gtid = Gtid;
    }

    public StartDelayReplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartDelayReplicationRequest(StartDelayReplicationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DelayReplicationType != null) {
            this.DelayReplicationType = new String(source.DelayReplicationType);
        }
        if (source.DueTime != null) {
            this.DueTime = new Long(source.DueTime);
        }
        if (source.Gtid != null) {
            this.Gtid = new String(source.Gtid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DelayReplicationType", this.DelayReplicationType);
        this.setParamSimple(map, prefix + "DueTime", this.DueTime);
        this.setParamSimple(map, prefix + "Gtid", this.Gtid);

    }
}

