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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShardInfo extends AbstractModel{

    /**
    * Used shard capacity
    */
    @SerializedName("UsedVolume")
    @Expose
    private Float UsedVolume;

    /**
    * Shard ID
    */
    @SerializedName("ReplicaSetId")
    @Expose
    private String ReplicaSetId;

    /**
    * Shard name
    */
    @SerializedName("ReplicaSetName")
    @Expose
    private String ReplicaSetName;

    /**
    * Shard memory size in MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Shard disk size in MB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Shard oplog size in MB
    */
    @SerializedName("OplogSize")
    @Expose
    private Long OplogSize;

    /**
    * Number of secondary nodes of a shard
    */
    @SerializedName("SecondaryNum")
    @Expose
    private Long SecondaryNum;

    /**
    * Shard physical ID
    */
    @SerializedName("RealReplicaSetId")
    @Expose
    private String RealReplicaSetId;

    /**
     * Get Used shard capacity 
     * @return UsedVolume Used shard capacity
     */
    public Float getUsedVolume() {
        return this.UsedVolume;
    }

    /**
     * Set Used shard capacity
     * @param UsedVolume Used shard capacity
     */
    public void setUsedVolume(Float UsedVolume) {
        this.UsedVolume = UsedVolume;
    }

    /**
     * Get Shard ID 
     * @return ReplicaSetId Shard ID
     */
    public String getReplicaSetId() {
        return this.ReplicaSetId;
    }

    /**
     * Set Shard ID
     * @param ReplicaSetId Shard ID
     */
    public void setReplicaSetId(String ReplicaSetId) {
        this.ReplicaSetId = ReplicaSetId;
    }

    /**
     * Get Shard name 
     * @return ReplicaSetName Shard name
     */
    public String getReplicaSetName() {
        return this.ReplicaSetName;
    }

    /**
     * Set Shard name
     * @param ReplicaSetName Shard name
     */
    public void setReplicaSetName(String ReplicaSetName) {
        this.ReplicaSetName = ReplicaSetName;
    }

    /**
     * Get Shard memory size in MB 
     * @return Memory Shard memory size in MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Shard memory size in MB
     * @param Memory Shard memory size in MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Shard disk size in MB 
     * @return Volume Shard disk size in MB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Shard disk size in MB
     * @param Volume Shard disk size in MB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Shard oplog size in MB 
     * @return OplogSize Shard oplog size in MB
     */
    public Long getOplogSize() {
        return this.OplogSize;
    }

    /**
     * Set Shard oplog size in MB
     * @param OplogSize Shard oplog size in MB
     */
    public void setOplogSize(Long OplogSize) {
        this.OplogSize = OplogSize;
    }

    /**
     * Get Number of secondary nodes of a shard 
     * @return SecondaryNum Number of secondary nodes of a shard
     */
    public Long getSecondaryNum() {
        return this.SecondaryNum;
    }

    /**
     * Set Number of secondary nodes of a shard
     * @param SecondaryNum Number of secondary nodes of a shard
     */
    public void setSecondaryNum(Long SecondaryNum) {
        this.SecondaryNum = SecondaryNum;
    }

    /**
     * Get Shard physical ID 
     * @return RealReplicaSetId Shard physical ID
     */
    public String getRealReplicaSetId() {
        return this.RealReplicaSetId;
    }

    /**
     * Set Shard physical ID
     * @param RealReplicaSetId Shard physical ID
     */
    public void setRealReplicaSetId(String RealReplicaSetId) {
        this.RealReplicaSetId = RealReplicaSetId;
    }

    public ShardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShardInfo(ShardInfo source) {
        if (source.UsedVolume != null) {
            this.UsedVolume = new Float(source.UsedVolume);
        }
        if (source.ReplicaSetId != null) {
            this.ReplicaSetId = new String(source.ReplicaSetId);
        }
        if (source.ReplicaSetName != null) {
            this.ReplicaSetName = new String(source.ReplicaSetName);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.OplogSize != null) {
            this.OplogSize = new Long(source.OplogSize);
        }
        if (source.SecondaryNum != null) {
            this.SecondaryNum = new Long(source.SecondaryNum);
        }
        if (source.RealReplicaSetId != null) {
            this.RealReplicaSetId = new String(source.RealReplicaSetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsedVolume", this.UsedVolume);
        this.setParamSimple(map, prefix + "ReplicaSetId", this.ReplicaSetId);
        this.setParamSimple(map, prefix + "ReplicaSetName", this.ReplicaSetName);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "OplogSize", this.OplogSize);
        this.setParamSimple(map, prefix + "SecondaryNum", this.SecondaryNum);
        this.setParamSimple(map, prefix + "RealReplicaSetId", this.RealReplicaSetId);

    }
}

