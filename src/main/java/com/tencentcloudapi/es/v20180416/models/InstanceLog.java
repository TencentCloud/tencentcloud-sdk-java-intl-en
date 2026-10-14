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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLog extends AbstractModel {

    /**
    * Log time
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Log level
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Cluster node IP address.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Log content
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Cluster node ID.
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * Slow log index name
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * Slow log index shards
    */
    @SerializedName("Shard")
    @Expose
    private String Shard;

    /**
    * Slow log index query time
    */
    @SerializedName("QueryCost")
    @Expose
    private String QueryCost;

    /**
     * Get Log time 
     * @return Time Log time
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Log time
     * @param Time Log time
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Log level 
     * @return Level Log level
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Log level
     * @param Level Log level
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Cluster node IP address. 
     * @return Ip Cluster node IP address.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Cluster node IP address.
     * @param Ip Cluster node IP address.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Log content 
     * @return Message Log content
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Log content
     * @param Message Log content
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Cluster node ID. 
     * @return NodeID Cluster node ID.
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set Cluster node ID.
     * @param NodeID Cluster node ID.
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get Slow log index name 
     * @return IndexName Slow log index name
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set Slow log index name
     * @param IndexName Slow log index name
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get Slow log index shards 
     * @return Shard Slow log index shards
     */
    public String getShard() {
        return this.Shard;
    }

    /**
     * Set Slow log index shards
     * @param Shard Slow log index shards
     */
    public void setShard(String Shard) {
        this.Shard = Shard;
    }

    /**
     * Get Slow log index query time 
     * @return QueryCost Slow log index query time
     */
    public String getQueryCost() {
        return this.QueryCost;
    }

    /**
     * Set Slow log index query time
     * @param QueryCost Slow log index query time
     */
    public void setQueryCost(String QueryCost) {
        this.QueryCost = QueryCost;
    }

    public InstanceLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLog(InstanceLog source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.Shard != null) {
            this.Shard = new String(source.Shard);
        }
        if (source.QueryCost != null) {
            this.QueryCost = new String(source.QueryCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "Shard", this.Shard);
        this.setParamSimple(map, prefix + "QueryCost", this.QueryCost);

    }
}

