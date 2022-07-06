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

public class UpgradeInstanceRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Shard size in MB. This parameter cannot be passed in at the same time as `RedisShardNum`/`RedisReplicasNum`.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Number of shards. This parameter is not required by standard architecture instances and cannot be passed in at the same time as `RedisReplicasNum`/`MemSize`.
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * Number of replicas. This parameter cannot be passed in at the same time as `RedisShardNum`/`MemSize`. To modify the number of replicas in a multi-AZ instance, `NodeSet` must be passed in.
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * Additional information for adding replicas for multi-AZ instances. This parameter is not required for single-AZ instances but is required when adding replicas for multi-AZ instances. It contains the information of the replicas to be added, including replica AZ and type (`NodeType` is 1).
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

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
     * Get Shard size in MB. This parameter cannot be passed in at the same time as `RedisShardNum`/`RedisReplicasNum`. 
     * @return MemSize Shard size in MB. This parameter cannot be passed in at the same time as `RedisShardNum`/`RedisReplicasNum`.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Shard size in MB. This parameter cannot be passed in at the same time as `RedisShardNum`/`RedisReplicasNum`.
     * @param MemSize Shard size in MB. This parameter cannot be passed in at the same time as `RedisShardNum`/`RedisReplicasNum`.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Number of shards. This parameter is not required by standard architecture instances and cannot be passed in at the same time as `RedisReplicasNum`/`MemSize`. 
     * @return RedisShardNum Number of shards. This parameter is not required by standard architecture instances and cannot be passed in at the same time as `RedisReplicasNum`/`MemSize`.
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set Number of shards. This parameter is not required by standard architecture instances and cannot be passed in at the same time as `RedisReplicasNum`/`MemSize`.
     * @param RedisShardNum Number of shards. This parameter is not required by standard architecture instances and cannot be passed in at the same time as `RedisReplicasNum`/`MemSize`.
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get Number of replicas. This parameter cannot be passed in at the same time as `RedisShardNum`/`MemSize`. To modify the number of replicas in a multi-AZ instance, `NodeSet` must be passed in. 
     * @return RedisReplicasNum Number of replicas. This parameter cannot be passed in at the same time as `RedisShardNum`/`MemSize`. To modify the number of replicas in a multi-AZ instance, `NodeSet` must be passed in.
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set Number of replicas. This parameter cannot be passed in at the same time as `RedisShardNum`/`MemSize`. To modify the number of replicas in a multi-AZ instance, `NodeSet` must be passed in.
     * @param RedisReplicasNum Number of replicas. This parameter cannot be passed in at the same time as `RedisShardNum`/`MemSize`. To modify the number of replicas in a multi-AZ instance, `NodeSet` must be passed in.
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get Additional information for adding replicas for multi-AZ instances. This parameter is not required for single-AZ instances but is required when adding replicas for multi-AZ instances. It contains the information of the replicas to be added, including replica AZ and type (`NodeType` is 1). 
     * @return NodeSet Additional information for adding replicas for multi-AZ instances. This parameter is not required for single-AZ instances but is required when adding replicas for multi-AZ instances. It contains the information of the replicas to be added, including replica AZ and type (`NodeType` is 1).
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set Additional information for adding replicas for multi-AZ instances. This parameter is not required for single-AZ instances but is required when adding replicas for multi-AZ instances. It contains the information of the replicas to be added, including replica AZ and type (`NodeType` is 1).
     * @param NodeSet Additional information for adding replicas for multi-AZ instances. This parameter is not required for single-AZ instances but is required when adding replicas for multi-AZ instances. It contains the information of the replicas to be added, including replica AZ and type (`NodeType` is 1).
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    public UpgradeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceRequest(UpgradeInstanceRequest source) {
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
        if (source.NodeSet != null) {
            this.NodeSet = new RedisNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new RedisNodeInfo(source.NodeSet[i]);
            }
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
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);

    }
}

