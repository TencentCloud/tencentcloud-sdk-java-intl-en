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

public class DescribeDBPerformanceResponse extends AbstractModel{

    /**
    * Number of slow queries
    */
    @SerializedName("LongQuery")
    @Expose
    private MonitorData LongQuery;

    /**
    * Number of SELECT operations
    */
    @SerializedName("SelectTotal")
    @Expose
    private MonitorData SelectTotal;

    /**
    * Number of UPDATE operations
    */
    @SerializedName("UpdateTotal")
    @Expose
    private MonitorData UpdateTotal;

    /**
    * Number of INSERT operations
    */
    @SerializedName("InsertTotal")
    @Expose
    private MonitorData InsertTotal;

    /**
    * Number of DELETE operations
    */
    @SerializedName("DeleteTotal")
    @Expose
    private MonitorData DeleteTotal;

    /**
    * Cache hit rate
    */
    @SerializedName("MemHitRate")
    @Expose
    private MonitorData MemHitRate;

    /**
    * Number of disk IOs per second
    */
    @SerializedName("DiskIops")
    @Expose
    private MonitorData DiskIops;

    /**
    * Number of active connections
    */
    @SerializedName("ConnActive")
    @Expose
    private MonitorData ConnActive;

    /**
    * Whether primary/secondary switch occurred. 1: yes, 0: no
    */
    @SerializedName("IsMasterSwitched")
    @Expose
    private MonitorData IsMasterSwitched;

    /**
    * primary/secondary delay
    */
    @SerializedName("SlaveDelay")
    @Expose
    private MonitorData SlaveDelay;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of slow queries 
     * @return LongQuery Number of slow queries
     */
    public MonitorData getLongQuery() {
        return this.LongQuery;
    }

    /**
     * Set Number of slow queries
     * @param LongQuery Number of slow queries
     */
    public void setLongQuery(MonitorData LongQuery) {
        this.LongQuery = LongQuery;
    }

    /**
     * Get Number of SELECT operations 
     * @return SelectTotal Number of SELECT operations
     */
    public MonitorData getSelectTotal() {
        return this.SelectTotal;
    }

    /**
     * Set Number of SELECT operations
     * @param SelectTotal Number of SELECT operations
     */
    public void setSelectTotal(MonitorData SelectTotal) {
        this.SelectTotal = SelectTotal;
    }

    /**
     * Get Number of UPDATE operations 
     * @return UpdateTotal Number of UPDATE operations
     */
    public MonitorData getUpdateTotal() {
        return this.UpdateTotal;
    }

    /**
     * Set Number of UPDATE operations
     * @param UpdateTotal Number of UPDATE operations
     */
    public void setUpdateTotal(MonitorData UpdateTotal) {
        this.UpdateTotal = UpdateTotal;
    }

    /**
     * Get Number of INSERT operations 
     * @return InsertTotal Number of INSERT operations
     */
    public MonitorData getInsertTotal() {
        return this.InsertTotal;
    }

    /**
     * Set Number of INSERT operations
     * @param InsertTotal Number of INSERT operations
     */
    public void setInsertTotal(MonitorData InsertTotal) {
        this.InsertTotal = InsertTotal;
    }

    /**
     * Get Number of DELETE operations 
     * @return DeleteTotal Number of DELETE operations
     */
    public MonitorData getDeleteTotal() {
        return this.DeleteTotal;
    }

    /**
     * Set Number of DELETE operations
     * @param DeleteTotal Number of DELETE operations
     */
    public void setDeleteTotal(MonitorData DeleteTotal) {
        this.DeleteTotal = DeleteTotal;
    }

    /**
     * Get Cache hit rate 
     * @return MemHitRate Cache hit rate
     */
    public MonitorData getMemHitRate() {
        return this.MemHitRate;
    }

    /**
     * Set Cache hit rate
     * @param MemHitRate Cache hit rate
     */
    public void setMemHitRate(MonitorData MemHitRate) {
        this.MemHitRate = MemHitRate;
    }

    /**
     * Get Number of disk IOs per second 
     * @return DiskIops Number of disk IOs per second
     */
    public MonitorData getDiskIops() {
        return this.DiskIops;
    }

    /**
     * Set Number of disk IOs per second
     * @param DiskIops Number of disk IOs per second
     */
    public void setDiskIops(MonitorData DiskIops) {
        this.DiskIops = DiskIops;
    }

    /**
     * Get Number of active connections 
     * @return ConnActive Number of active connections
     */
    public MonitorData getConnActive() {
        return this.ConnActive;
    }

    /**
     * Set Number of active connections
     * @param ConnActive Number of active connections
     */
    public void setConnActive(MonitorData ConnActive) {
        this.ConnActive = ConnActive;
    }

    /**
     * Get Whether primary/secondary switch occurred. 1: yes, 0: no 
     * @return IsMasterSwitched Whether primary/secondary switch occurred. 1: yes, 0: no
     */
    public MonitorData getIsMasterSwitched() {
        return this.IsMasterSwitched;
    }

    /**
     * Set Whether primary/secondary switch occurred. 1: yes, 0: no
     * @param IsMasterSwitched Whether primary/secondary switch occurred. 1: yes, 0: no
     */
    public void setIsMasterSwitched(MonitorData IsMasterSwitched) {
        this.IsMasterSwitched = IsMasterSwitched;
    }

    /**
     * Get primary/secondary delay 
     * @return SlaveDelay primary/secondary delay
     */
    public MonitorData getSlaveDelay() {
        return this.SlaveDelay;
    }

    /**
     * Set primary/secondary delay
     * @param SlaveDelay primary/secondary delay
     */
    public void setSlaveDelay(MonitorData SlaveDelay) {
        this.SlaveDelay = SlaveDelay;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LongQuery.", this.LongQuery);
        this.setParamObj(map, prefix + "SelectTotal.", this.SelectTotal);
        this.setParamObj(map, prefix + "UpdateTotal.", this.UpdateTotal);
        this.setParamObj(map, prefix + "InsertTotal.", this.InsertTotal);
        this.setParamObj(map, prefix + "DeleteTotal.", this.DeleteTotal);
        this.setParamObj(map, prefix + "MemHitRate.", this.MemHitRate);
        this.setParamObj(map, prefix + "DiskIops.", this.DiskIops);
        this.setParamObj(map, prefix + "ConnActive.", this.ConnActive);
        this.setParamObj(map, prefix + "IsMasterSwitched.", this.IsMasterSwitched);
        this.setParamObj(map, prefix + "SlaveDelay.", this.SlaveDelay);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

