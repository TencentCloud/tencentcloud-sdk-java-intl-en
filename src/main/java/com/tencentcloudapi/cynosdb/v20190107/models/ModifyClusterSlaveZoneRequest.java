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
    * <p>Cluster Id.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Old secondary AZ</p>
    */
    @SerializedName("OldSlaveZone")
    @Expose
    private String OldSlaveZone;

    /**
    * <p>New secondary AZ</p>
    */
    @SerializedName("NewSlaveZone")
    @Expose
    private String NewSlaveZone;

    /**
    * <p>binlog synchronization mode. Default value: async. Available values: sync, semisync, async</p>
    */
    @SerializedName("BinlogSyncWay")
    @Expose
    private String BinlogSyncWay;

    /**
    * <p>Semi-sync timeout period, in milliseconds. To ensure business stability, semi-sync replication has a degradation logic. If the primary AZ cluster exceeds this timeout period while waiting for the standby AZ cluster to confirm a transaction, the replication method degrades to asynchronous replication. The minimum is set to 1000 ms, with support up to 4294967295 ms. Default: 10000 ms.</p>
    */
    @SerializedName("SemiSyncTimeout")
    @Expose
    private Long SemiSyncTimeout;

    /**
     * Get <p>Cluster Id.</p> 
     * @return ClusterId <p>Cluster Id.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster Id.</p>
     * @param ClusterId <p>Cluster Id.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Old secondary AZ</p> 
     * @return OldSlaveZone <p>Old secondary AZ</p>
     */
    public String getOldSlaveZone() {
        return this.OldSlaveZone;
    }

    /**
     * Set <p>Old secondary AZ</p>
     * @param OldSlaveZone <p>Old secondary AZ</p>
     */
    public void setOldSlaveZone(String OldSlaveZone) {
        this.OldSlaveZone = OldSlaveZone;
    }

    /**
     * Get <p>New secondary AZ</p> 
     * @return NewSlaveZone <p>New secondary AZ</p>
     */
    public String getNewSlaveZone() {
        return this.NewSlaveZone;
    }

    /**
     * Set <p>New secondary AZ</p>
     * @param NewSlaveZone <p>New secondary AZ</p>
     */
    public void setNewSlaveZone(String NewSlaveZone) {
        this.NewSlaveZone = NewSlaveZone;
    }

    /**
     * Get <p>binlog synchronization mode. Default value: async. Available values: sync, semisync, async</p> 
     * @return BinlogSyncWay <p>binlog synchronization mode. Default value: async. Available values: sync, semisync, async</p>
     */
    public String getBinlogSyncWay() {
        return this.BinlogSyncWay;
    }

    /**
     * Set <p>binlog synchronization mode. Default value: async. Available values: sync, semisync, async</p>
     * @param BinlogSyncWay <p>binlog synchronization mode. Default value: async. Available values: sync, semisync, async</p>
     */
    public void setBinlogSyncWay(String BinlogSyncWay) {
        this.BinlogSyncWay = BinlogSyncWay;
    }

    /**
     * Get <p>Semi-sync timeout period, in milliseconds. To ensure business stability, semi-sync replication has a degradation logic. If the primary AZ cluster exceeds this timeout period while waiting for the standby AZ cluster to confirm a transaction, the replication method degrades to asynchronous replication. The minimum is set to 1000 ms, with support up to 4294967295 ms. Default: 10000 ms.</p> 
     * @return SemiSyncTimeout <p>Semi-sync timeout period, in milliseconds. To ensure business stability, semi-sync replication has a degradation logic. If the primary AZ cluster exceeds this timeout period while waiting for the standby AZ cluster to confirm a transaction, the replication method degrades to asynchronous replication. The minimum is set to 1000 ms, with support up to 4294967295 ms. Default: 10000 ms.</p>
     */
    public Long getSemiSyncTimeout() {
        return this.SemiSyncTimeout;
    }

    /**
     * Set <p>Semi-sync timeout period, in milliseconds. To ensure business stability, semi-sync replication has a degradation logic. If the primary AZ cluster exceeds this timeout period while waiting for the standby AZ cluster to confirm a transaction, the replication method degrades to asynchronous replication. The minimum is set to 1000 ms, with support up to 4294967295 ms. Default: 10000 ms.</p>
     * @param SemiSyncTimeout <p>Semi-sync timeout period, in milliseconds. To ensure business stability, semi-sync replication has a degradation logic. If the primary AZ cluster exceeds this timeout period while waiting for the standby AZ cluster to confirm a transaction, the replication method degrades to asynchronous replication. The minimum is set to 1000 ms, with support up to 4294967295 ms. Default: 10000 ms.</p>
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

