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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DCNReplicaConfig extends AbstractModel{

    /**
    * DCN running status. Valid values: `START` (running), `STOP` (pause)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoReplicationMode")
    @Expose
    private String RoReplicationMode;

    /**
    * Delayed replication type. Valid values: `DEFAULT` (no delay), `DUE_TIME` (specified replication time)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DelayReplicationType")
    @Expose
    private String DelayReplicationType;

    /**
    * Specified time for delayed replication
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DueTime")
    @Expose
    private String DueTime;

    /**
    * The number of seconds to delay the replication
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplicationDelay")
    @Expose
    private Long ReplicationDelay;

    /**
     * Get DCN running status. Valid values: `START` (running), `STOP` (pause)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoReplicationMode DCN running status. Valid values: `START` (running), `STOP` (pause)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoReplicationMode() {
        return this.RoReplicationMode;
    }

    /**
     * Set DCN running status. Valid values: `START` (running), `STOP` (pause)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoReplicationMode DCN running status. Valid values: `START` (running), `STOP` (pause)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoReplicationMode(String RoReplicationMode) {
        this.RoReplicationMode = RoReplicationMode;
    }

    /**
     * Get Delayed replication type. Valid values: `DEFAULT` (no delay), `DUE_TIME` (specified replication time)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DelayReplicationType Delayed replication type. Valid values: `DEFAULT` (no delay), `DUE_TIME` (specified replication time)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDelayReplicationType() {
        return this.DelayReplicationType;
    }

    /**
     * Set Delayed replication type. Valid values: `DEFAULT` (no delay), `DUE_TIME` (specified replication time)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DelayReplicationType Delayed replication type. Valid values: `DEFAULT` (no delay), `DUE_TIME` (specified replication time)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDelayReplicationType(String DelayReplicationType) {
        this.DelayReplicationType = DelayReplicationType;
    }

    /**
     * Get Specified time for delayed replication
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DueTime Specified time for delayed replication
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDueTime() {
        return this.DueTime;
    }

    /**
     * Set Specified time for delayed replication
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DueTime Specified time for delayed replication
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDueTime(String DueTime) {
        this.DueTime = DueTime;
    }

    /**
     * Get The number of seconds to delay the replication
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReplicationDelay The number of seconds to delay the replication
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReplicationDelay() {
        return this.ReplicationDelay;
    }

    /**
     * Set The number of seconds to delay the replication
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReplicationDelay The number of seconds to delay the replication
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReplicationDelay(Long ReplicationDelay) {
        this.ReplicationDelay = ReplicationDelay;
    }

    public DCNReplicaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DCNReplicaConfig(DCNReplicaConfig source) {
        if (source.RoReplicationMode != null) {
            this.RoReplicationMode = new String(source.RoReplicationMode);
        }
        if (source.DelayReplicationType != null) {
            this.DelayReplicationType = new String(source.DelayReplicationType);
        }
        if (source.DueTime != null) {
            this.DueTime = new String(source.DueTime);
        }
        if (source.ReplicationDelay != null) {
            this.ReplicationDelay = new Long(source.ReplicationDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoReplicationMode", this.RoReplicationMode);
        this.setParamSimple(map, prefix + "DelayReplicationType", this.DelayReplicationType);
        this.setParamSimple(map, prefix + "DueTime", this.DueTime);
        this.setParamSimple(map, prefix + "ReplicationDelay", this.ReplicationDelay);

    }
}

