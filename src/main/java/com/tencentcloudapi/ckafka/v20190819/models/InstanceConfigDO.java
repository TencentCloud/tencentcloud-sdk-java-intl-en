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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfigDO extends AbstractModel {

    /**
    * Whether to create topics automatically
    */
    @SerializedName("AutoCreateTopicsEnable")
    @Expose
    private Boolean AutoCreateTopicsEnable;

    /**
    * Number of partitions
    */
    @SerializedName("DefaultNumPartitions")
    @Expose
    private Long DefaultNumPartitions;

    /**
    * Default replication factor
    */
    @SerializedName("DefaultReplicationFactor")
    @Expose
    private Long DefaultReplicationFactor;

    /**
     * Get Whether to create topics automatically 
     * @return AutoCreateTopicsEnable Whether to create topics automatically
     */
    public Boolean getAutoCreateTopicsEnable() {
        return this.AutoCreateTopicsEnable;
    }

    /**
     * Set Whether to create topics automatically
     * @param AutoCreateTopicsEnable Whether to create topics automatically
     */
    public void setAutoCreateTopicsEnable(Boolean AutoCreateTopicsEnable) {
        this.AutoCreateTopicsEnable = AutoCreateTopicsEnable;
    }

    /**
     * Get Number of partitions 
     * @return DefaultNumPartitions Number of partitions
     */
    public Long getDefaultNumPartitions() {
        return this.DefaultNumPartitions;
    }

    /**
     * Set Number of partitions
     * @param DefaultNumPartitions Number of partitions
     */
    public void setDefaultNumPartitions(Long DefaultNumPartitions) {
        this.DefaultNumPartitions = DefaultNumPartitions;
    }

    /**
     * Get Default replication factor 
     * @return DefaultReplicationFactor Default replication factor
     */
    public Long getDefaultReplicationFactor() {
        return this.DefaultReplicationFactor;
    }

    /**
     * Set Default replication factor
     * @param DefaultReplicationFactor Default replication factor
     */
    public void setDefaultReplicationFactor(Long DefaultReplicationFactor) {
        this.DefaultReplicationFactor = DefaultReplicationFactor;
    }

    public InstanceConfigDO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConfigDO(InstanceConfigDO source) {
        if (source.AutoCreateTopicsEnable != null) {
            this.AutoCreateTopicsEnable = new Boolean(source.AutoCreateTopicsEnable);
        }
        if (source.DefaultNumPartitions != null) {
            this.DefaultNumPartitions = new Long(source.DefaultNumPartitions);
        }
        if (source.DefaultReplicationFactor != null) {
            this.DefaultReplicationFactor = new Long(source.DefaultReplicationFactor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoCreateTopicsEnable", this.AutoCreateTopicsEnable);
        this.setParamSimple(map, prefix + "DefaultNumPartitions", this.DefaultNumPartitions);
        this.setParamSimple(map, prefix + "DefaultReplicationFactor", this.DefaultReplicationFactor);

    }
}

