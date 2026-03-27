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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterSlaveZoneRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Old replica AZ
    */
    @SerializedName("OldSlaveZone")
    @Expose
    private String OldSlaveZone;

    /**
    * New replica AZ
    */
    @SerializedName("NewSlaveZone")
    @Expose
    private String NewSlaveZone;

    /**
    * Specifies the binlog synchronization mode. the default value is async. valid values are sync, semisync, and async.
    */
    @SerializedName("BinlogSyncWay")
    @Expose
    private String BinlogSyncWay;

    /**
    * Semi-sync timeout period in ms. To ensure business stability, the semi-synchronous replication includes a degradation mechanism. If the primary AZ cluster exceeds this timeout while waiting for transaction confirmation from the secondary AZ cluster, the replication mode will fall back to asynchronous replication. Minimum setting: 1000 ms; maximum support: 4294967295 ms; default: 10000 ms.
    */
    @SerializedName("SemiSyncTimeout")
    @Expose
    private Long SemiSyncTimeout;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Old replica AZ 
     * @return OldSlaveZone Old replica AZ
     */
    public String getOldSlaveZone() {
        return this.OldSlaveZone;
    }

    /**
     * Set Old replica AZ
     * @param OldSlaveZone Old replica AZ
     */
    public void setOldSlaveZone(String OldSlaveZone) {
        this.OldSlaveZone = OldSlaveZone;
    }

    /**
     * Get New replica AZ 
     * @return NewSlaveZone New replica AZ
     */
    public String getNewSlaveZone() {
        return this.NewSlaveZone;
    }

    /**
     * Set New replica AZ
     * @param NewSlaveZone New replica AZ
     */
    public void setNewSlaveZone(String NewSlaveZone) {
        this.NewSlaveZone = NewSlaveZone;
    }

    /**
     * Get Specifies the binlog synchronization mode. the default value is async. valid values are sync, semisync, and async. 
     * @return BinlogSyncWay Specifies the binlog synchronization mode. the default value is async. valid values are sync, semisync, and async.
     */
    public String getBinlogSyncWay() {
        return this.BinlogSyncWay;
    }

    /**
     * Set Specifies the binlog synchronization mode. the default value is async. valid values are sync, semisync, and async.
     * @param BinlogSyncWay Specifies the binlog synchronization mode. the default value is async. valid values are sync, semisync, and async.
     */
    public void setBinlogSyncWay(String BinlogSyncWay) {
        this.BinlogSyncWay = BinlogSyncWay;
    }

    /**
     * Get Semi-sync timeout period in ms. To ensure business stability, the semi-synchronous replication includes a degradation mechanism. If the primary AZ cluster exceeds this timeout while waiting for transaction confirmation from the secondary AZ cluster, the replication mode will fall back to asynchronous replication. Minimum setting: 1000 ms; maximum support: 4294967295 ms; default: 10000 ms. 
     * @return SemiSyncTimeout Semi-sync timeout period in ms. To ensure business stability, the semi-synchronous replication includes a degradation mechanism. If the primary AZ cluster exceeds this timeout while waiting for transaction confirmation from the secondary AZ cluster, the replication mode will fall back to asynchronous replication. Minimum setting: 1000 ms; maximum support: 4294967295 ms; default: 10000 ms.
     */
    public Long getSemiSyncTimeout() {
        return this.SemiSyncTimeout;
    }

    /**
     * Set Semi-sync timeout period in ms. To ensure business stability, the semi-synchronous replication includes a degradation mechanism. If the primary AZ cluster exceeds this timeout while waiting for transaction confirmation from the secondary AZ cluster, the replication mode will fall back to asynchronous replication. Minimum setting: 1000 ms; maximum support: 4294967295 ms; default: 10000 ms.
     * @param SemiSyncTimeout Semi-sync timeout period in ms. To ensure business stability, the semi-synchronous replication includes a degradation mechanism. If the primary AZ cluster exceeds this timeout while waiting for transaction confirmation from the secondary AZ cluster, the replication mode will fall back to asynchronous replication. Minimum setting: 1000 ms; maximum support: 4294967295 ms; default: 10000 ms.
     */
    public void setSemiSyncTimeout(Long SemiSyncTimeout) {
        this.SemiSyncTimeout = SemiSyncTimeout;
    }

    public ModifyClusterSlaveZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterSlaveZoneRequest(ModifyClusterSlaveZoneRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.OldSlaveZone != null) {
            this.OldSlaveZone = new String(source.OldSlaveZone);
        }
        if (source.NewSlaveZone != null) {
            this.NewSlaveZone = new String(source.NewSlaveZone);
        }
        if (source.BinlogSyncWay != null) {
            this.BinlogSyncWay = new String(source.BinlogSyncWay);
        }
        if (source.SemiSyncTimeout != null) {
            this.SemiSyncTimeout = new Long(source.SemiSyncTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "OldSlaveZone", this.OldSlaveZone);
        this.setParamSimple(map, prefix + "NewSlaveZone", this.NewSlaveZone);
        this.setParamSimple(map, prefix + "BinlogSyncWay", this.BinlogSyncWay);
        this.setParamSimple(map, prefix + "SemiSyncTimeout", this.SemiSyncTimeout);

    }
}

