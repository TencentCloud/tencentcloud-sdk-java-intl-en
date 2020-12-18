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

public class ModifyRoTypeRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The original type of an RO replica. Valid values: `NORMAL` (do not support delayed replication), `DELAY_REPLICATION` (support delayed replication).
    */
    @SerializedName("SrcRoInstType")
    @Expose
    private String SrcRoInstType;

    /**
    * The target type of an RO replica. Valid values: `NORMAL` (do not support delayed replication), `DELAY_REPLICATION` (support delayed replication).
    */
    @SerializedName("DstRoInstType")
    @Expose
    private String DstRoInstType;

    /**
    * Replication delay in seconds. This parameter is required when a regular RO replica is switched to a delayed one. Value range: 1 to 259200.
    */
    @SerializedName("ReplicationDelay")
    @Expose
    private Long ReplicationDelay;

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
     * Get The original type of an RO replica. Valid values: `NORMAL` (do not support delayed replication), `DELAY_REPLICATION` (support delayed replication). 
     * @return SrcRoInstType The original type of an RO replica. Valid values: `NORMAL` (do not support delayed replication), `DELAY_REPLICATION` (support delayed replication).
     */
    public String getSrcRoInstType() {
        return this.SrcRoInstType;
    }

    /**
     * Set The original type of an RO replica. Valid values: `NORMAL` (do not support delayed replication), `DELAY_REPLICATION` (support delayed replication).
     * @param SrcRoInstType The original type of an RO replica. Valid values: `NORMAL` (do not support delayed replication), `DELAY_REPLICATION` (support delayed replication).
     */
    public void setSrcRoInstType(String SrcRoInstType) {
        this.SrcRoInstType = SrcRoInstType;
    }

    /**
     * Get The target type of an RO replica. Valid values: `NORMAL` (do not support delayed replication), `DELAY_REPLICATION` (support delayed replication). 
     * @return DstRoInstType The target type of an RO replica. Valid values: `NORMAL` (do not support delayed replication), `DELAY_REPLICATION` (support delayed replication).
     */
    public String getDstRoInstType() {
        return this.DstRoInstType;
    }

    /**
     * Set The target type of an RO replica. Valid values: `NORMAL` (do not support delayed replication), `DELAY_REPLICATION` (support delayed replication).
     * @param DstRoInstType The target type of an RO replica. Valid values: `NORMAL` (do not support delayed replication), `DELAY_REPLICATION` (support delayed replication).
     */
    public void setDstRoInstType(String DstRoInstType) {
        this.DstRoInstType = DstRoInstType;
    }

    /**
     * Get Replication delay in seconds. This parameter is required when a regular RO replica is switched to a delayed one. Value range: 1 to 259200. 
     * @return ReplicationDelay Replication delay in seconds. This parameter is required when a regular RO replica is switched to a delayed one. Value range: 1 to 259200.
     */
    public Long getReplicationDelay() {
        return this.ReplicationDelay;
    }

    /**
     * Set Replication delay in seconds. This parameter is required when a regular RO replica is switched to a delayed one. Value range: 1 to 259200.
     * @param ReplicationDelay Replication delay in seconds. This parameter is required when a regular RO replica is switched to a delayed one. Value range: 1 to 259200.
     */
    public void setReplicationDelay(Long ReplicationDelay) {
        this.ReplicationDelay = ReplicationDelay;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SrcRoInstType", this.SrcRoInstType);
        this.setParamSimple(map, prefix + "DstRoInstType", this.DstRoInstType);
        this.setParamSimple(map, prefix + "ReplicationDelay", this.ReplicationDelay);

    }
}

