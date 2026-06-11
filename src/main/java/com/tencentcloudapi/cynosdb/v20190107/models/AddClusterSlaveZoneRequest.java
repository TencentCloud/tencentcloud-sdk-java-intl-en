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
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Replica AZ.
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * Binlog sync mode. Default value: async. Optional values: sync, semisync, async.
    */
    @SerializedName("BinlogSyncWay")
    @Expose
    private String BinlogSyncWay;

    /**
    * Semi-sync timeout period in milliseconds. To ensure business stability, semi-sync replication has a degradation logic. When the primary availability zone cluster waits for the secondary availability zone cluster to confirm a transaction and exceeds the timeout period, the replication method will degrade to asynchronous replication. The minimum value is set to 1000 ms, support up to 4294967295 ms, and defaults to 10000 ms.
    */
    @SerializedName("SemiSyncTimeout")
    @Expose
    private Long SemiSyncTimeout;

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Replica AZ. 
     * @return SlaveZone Replica AZ.
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set Replica AZ.
     * @param SlaveZone Replica AZ.
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get Binlog sync mode. Default value: async. Optional values: sync, semisync, async. 
     * @return BinlogSyncWay Binlog sync mode. Default value: async. Optional values: sync, semisync, async.
     */
    public String getBinlogSyncWay() {
        return this.BinlogSyncWay;
    }

    /**
     * Set Binlog sync mode. Default value: async. Optional values: sync, semisync, async.
     * @param BinlogSyncWay Binlog sync mode. Default value: async. Optional values: sync, semisync, async.
     */
    public void setBinlogSyncWay(String BinlogSyncWay) {
        this.BinlogSyncWay = BinlogSyncWay;
    }

    /**
     * Get Semi-sync timeout period in milliseconds. To ensure business stability, semi-sync replication has a degradation logic. When the primary availability zone cluster waits for the secondary availability zone cluster to confirm a transaction and exceeds the timeout period, the replication method will degrade to asynchronous replication. The minimum value is set to 1000 ms, support up to 4294967295 ms, and defaults to 10000 ms. 
     * @return SemiSyncTimeout Semi-sync timeout period in milliseconds. To ensure business stability, semi-sync replication has a degradation logic. When the primary availability zone cluster waits for the secondary availability zone cluster to confirm a transaction and exceeds the timeout period, the replication method will degrade to asynchronous replication. The minimum value is set to 1000 ms, support up to 4294967295 ms, and defaults to 10000 ms.
     */
    public Long getSemiSyncTimeout() {
        return this.SemiSyncTimeout;
    }

    /**
     * Set Semi-sync timeout period in milliseconds. To ensure business stability, semi-sync replication has a degradation logic. When the primary availability zone cluster waits for the secondary availability zone cluster to confirm a transaction and exceeds the timeout period, the replication method will degrade to asynchronous replication. The minimum value is set to 1000 ms, support up to 4294967295 ms, and defaults to 10000 ms.
     * @param SemiSyncTimeout Semi-sync timeout period in milliseconds. To ensure business stability, semi-sync replication has a degradation logic. When the primary availability zone cluster waits for the secondary availability zone cluster to confirm a transaction and exceeds the timeout period, the replication method will degrade to asynchronous replication. The minimum value is set to 1000 ms, support up to 4294967295 ms, and defaults to 10000 ms.
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

