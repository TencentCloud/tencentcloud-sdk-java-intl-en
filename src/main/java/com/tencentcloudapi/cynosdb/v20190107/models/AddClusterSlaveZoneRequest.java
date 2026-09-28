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

public class AddClusterSlaveZoneRequest extends AbstractModel {

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Secondary AZ</p>
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * <p>binlog synchronization mode. Default value: async. Available values: sync, semisync, async</p>
    */
    @SerializedName("BinlogSyncWay")
    @Expose
    private String BinlogSyncWay;

    /**
    * <p>Semi-sync timeout period, in milliseconds. To ensure business stability, semi-synchronous replication has a degradation logic. If the primary availability zone cluster exceeds this timeout period while waiting for the standby availability zone cluster to confirm a transaction, the replication method will degrade to asynchronous replication. The minimum is set to 1000 ms, with support up to 4294967295 ms. Default is 10000 ms.</p>
    */
    @SerializedName("SemiSyncTimeout")
    @Expose
    private Long SemiSyncTimeout;

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Secondary AZ</p> 
     * @return SlaveZone <p>Secondary AZ</p>
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set <p>Secondary AZ</p>
     * @param SlaveZone <p>Secondary AZ</p>
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
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
     * Get <p>Semi-sync timeout period, in milliseconds. To ensure business stability, semi-synchronous replication has a degradation logic. If the primary availability zone cluster exceeds this timeout period while waiting for the standby availability zone cluster to confirm a transaction, the replication method will degrade to asynchronous replication. The minimum is set to 1000 ms, with support up to 4294967295 ms. Default is 10000 ms.</p> 
     * @return SemiSyncTimeout <p>Semi-sync timeout period, in milliseconds. To ensure business stability, semi-synchronous replication has a degradation logic. If the primary availability zone cluster exceeds this timeout period while waiting for the standby availability zone cluster to confirm a transaction, the replication method will degrade to asynchronous replication. The minimum is set to 1000 ms, with support up to 4294967295 ms. Default is 10000 ms.</p>
     */
    public Long getSemiSyncTimeout() {
        return this.SemiSyncTimeout;
    }

    /**
     * Set <p>Semi-sync timeout period, in milliseconds. To ensure business stability, semi-synchronous replication has a degradation logic. If the primary availability zone cluster exceeds this timeout period while waiting for the standby availability zone cluster to confirm a transaction, the replication method will degrade to asynchronous replication. The minimum is set to 1000 ms, with support up to 4294967295 ms. Default is 10000 ms.</p>
     * @param SemiSyncTimeout <p>Semi-sync timeout period, in milliseconds. To ensure business stability, semi-synchronous replication has a degradation logic. If the primary availability zone cluster exceeds this timeout period while waiting for the standby availability zone cluster to confirm a transaction, the replication method will degrade to asynchronous replication. The minimum is set to 1000 ms, with support up to 4294967295 ms. Default is 10000 ms.</p>
     */
    public void setSemiSyncTimeout(Long SemiSyncTimeout) {
        this.SemiSyncTimeout = SemiSyncTimeout;
    }

    public AddClusterSlaveZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddClusterSlaveZoneRequest(AddClusterSlaveZoneRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
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
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "BinlogSyncWay", this.BinlogSyncWay);
        this.setParamSimple(map, prefix + "SemiSyncTimeout", this.SemiSyncTimeout);

    }
}

