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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpandShardConfig extends AbstractModel {

    /**
    * Shard IDs in array
    */
    @SerializedName("ShardInstanceIds")
    @Expose
    private String [] ShardInstanceIds;

    /**
    * Shard memory capacity in GB
    */
    @SerializedName("ShardMemory")
    @Expose
    private Long ShardMemory;

    /**
    * Shard storage capacity in GB
    */
    @SerializedName("ShardStorage")
    @Expose
    private Long ShardStorage;

    /**
    * Number of shard nodes
    */
    @SerializedName("ShardNodeCount")
    @Expose
    private Long ShardNodeCount;

    /**
     * Get Shard IDs in array 
     * @return ShardInstanceIds Shard IDs in array
     */
    public String [] getShardInstanceIds() {
        return this.ShardInstanceIds;
    }

    /**
     * Set Shard IDs in array
     * @param ShardInstanceIds Shard IDs in array
     */
    public void setShardInstanceIds(String [] ShardInstanceIds) {
        this.ShardInstanceIds = ShardInstanceIds;
    }

    /**
     * Get Shard memory capacity in GB 
     * @return ShardMemory Shard memory capacity in GB
     */
    public Long getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * Set Shard memory capacity in GB
     * @param ShardMemory Shard memory capacity in GB
     */
    public void setShardMemory(Long ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * Get Shard storage capacity in GB 
     * @return ShardStorage Shard storage capacity in GB
     */
    public Long getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * Set Shard storage capacity in GB
     * @param ShardStorage Shard storage capacity in GB
     */
    public void setShardStorage(Long ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * Get Number of shard nodes 
     * @return ShardNodeCount Number of shard nodes
     */
    public Long getShardNodeCount() {
        return this.ShardNodeCount;
    }

    /**
     * Set Number of shard nodes
     * @param ShardNodeCount Number of shard nodes
     */
    public void setShardNodeCount(Long ShardNodeCount) {
        this.ShardNodeCount = ShardNodeCount;
    }

    public ExpandShardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpandShardConfig(ExpandShardConfig source) {
        if (source.ShardInstanceIds != null) {
            this.ShardInstanceIds = new String[source.ShardInstanceIds.length];
            for (int i = 0; i < source.ShardInstanceIds.length; i++) {
                this.ShardInstanceIds[i] = new String(source.ShardInstanceIds[i]);
            }
        }
        if (source.ShardMemory != null) {
            this.ShardMemory = new Long(source.ShardMemory);
        }
        if (source.ShardStorage != null) {
            this.ShardStorage = new Long(source.ShardStorage);
        }
        if (source.ShardNodeCount != null) {
            this.ShardNodeCount = new Long(source.ShardNodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ShardInstanceIds.", this.ShardInstanceIds);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamSimple(map, prefix + "ShardNodeCount", this.ShardNodeCount);

    }
}

