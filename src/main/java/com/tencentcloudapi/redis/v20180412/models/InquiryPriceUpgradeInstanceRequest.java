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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceUpgradeInstanceRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Shard size in MB.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Number of shards. This parameter can be left blank for Redis 2.8 in standard architecture, CKV in standard architecture, and Redis 2.8 in standalone architecture.
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * Number of replicas. This parameter can be left blank for Redis 2.8 in standard architecture, CKV in standard architecture, and Redis 2.8 in standalone architecture.
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Shard size in MB. 
     * @return MemSize Shard size in MB.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Shard size in MB.
     * @param MemSize Shard size in MB.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Number of shards. This parameter can be left blank for Redis 2.8 in standard architecture, CKV in standard architecture, and Redis 2.8 in standalone architecture. 
     * @return RedisShardNum Number of shards. This parameter can be left blank for Redis 2.8 in standard architecture, CKV in standard architecture, and Redis 2.8 in standalone architecture.
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set Number of shards. This parameter can be left blank for Redis 2.8 in standard architecture, CKV in standard architecture, and Redis 2.8 in standalone architecture.
     * @param RedisShardNum Number of shards. This parameter can be left blank for Redis 2.8 in standard architecture, CKV in standard architecture, and Redis 2.8 in standalone architecture.
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get Number of replicas. This parameter can be left blank for Redis 2.8 in standard architecture, CKV in standard architecture, and Redis 2.8 in standalone architecture. 
     * @return RedisReplicasNum Number of replicas. This parameter can be left blank for Redis 2.8 in standard architecture, CKV in standard architecture, and Redis 2.8 in standalone architecture.
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set Number of replicas. This parameter can be left blank for Redis 2.8 in standard architecture, CKV in standard architecture, and Redis 2.8 in standalone architecture.
     * @param RedisReplicasNum Number of replicas. This parameter can be left blank for Redis 2.8 in standard architecture, CKV in standard architecture, and Redis 2.8 in standalone architecture.
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    public InquiryPriceUpgradeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceUpgradeInstanceRequest(InquiryPriceUpgradeInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);

    }
}

