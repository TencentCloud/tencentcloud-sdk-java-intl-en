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

public class ModifyInstanceAttributesConfig extends AbstractModel {

    /**
    * Automatic creation. true: enabled, false: not enabled
    */
    @SerializedName("AutoCreateTopicEnable")
    @Expose
    private Boolean AutoCreateTopicEnable;

    /**
    * Default number of partitions for a newly created topic. if AutoCreateTopicEnable is set to true and no value is set, defaults to 3.
    */
    @SerializedName("DefaultNumPartitions")
    @Expose
    private Long DefaultNumPartitions;

    /**
    * Default number of replicas for a newly created topic. if AutoCreateTopicEnable is set to true and not specified, defaults to 2.
    */
    @SerializedName("DefaultReplicationFactor")
    @Expose
    private Long DefaultReplicationFactor;

    /**
     * Get Automatic creation. true: enabled, false: not enabled 
     * @return AutoCreateTopicEnable Automatic creation. true: enabled, false: not enabled
     */
    public Boolean getAutoCreateTopicEnable() {
        return this.AutoCreateTopicEnable;
    }

    /**
     * Set Automatic creation. true: enabled, false: not enabled
     * @param AutoCreateTopicEnable Automatic creation. true: enabled, false: not enabled
     */
    public void setAutoCreateTopicEnable(Boolean AutoCreateTopicEnable) {
        this.AutoCreateTopicEnable = AutoCreateTopicEnable;
    }

    /**
     * Get Default number of partitions for a newly created topic. if AutoCreateTopicEnable is set to true and no value is set, defaults to 3. 
     * @return DefaultNumPartitions Default number of partitions for a newly created topic. if AutoCreateTopicEnable is set to true and no value is set, defaults to 3.
     */
    public Long getDefaultNumPartitions() {
        return this.DefaultNumPartitions;
    }

    /**
     * Set Default number of partitions for a newly created topic. if AutoCreateTopicEnable is set to true and no value is set, defaults to 3.
     * @param DefaultNumPartitions Default number of partitions for a newly created topic. if AutoCreateTopicEnable is set to true and no value is set, defaults to 3.
     */
    public void setDefaultNumPartitions(Long DefaultNumPartitions) {
        this.DefaultNumPartitions = DefaultNumPartitions;
    }

    /**
     * Get Default number of replicas for a newly created topic. if AutoCreateTopicEnable is set to true and not specified, defaults to 2. 
     * @return DefaultReplicationFactor Default number of replicas for a newly created topic. if AutoCreateTopicEnable is set to true and not specified, defaults to 2.
     */
    public Long getDefaultReplicationFactor() {
        return this.DefaultReplicationFactor;
    }

    /**
     * Set Default number of replicas for a newly created topic. if AutoCreateTopicEnable is set to true and not specified, defaults to 2.
     * @param DefaultReplicationFactor Default number of replicas for a newly created topic. if AutoCreateTopicEnable is set to true and not specified, defaults to 2.
     */
    public void setDefaultReplicationFactor(Long DefaultReplicationFactor) {
        this.DefaultReplicationFactor = DefaultReplicationFactor;
    }

    public ModifyInstanceAttributesConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAttributesConfig(ModifyInstanceAttributesConfig source) {
        if (source.AutoCreateTopicEnable != null) {
            this.AutoCreateTopicEnable = new Boolean(source.AutoCreateTopicEnable);
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
        this.setParamSimple(map, prefix + "AutoCreateTopicEnable", this.AutoCreateTopicEnable);
        this.setParamSimple(map, prefix + "DefaultNumPartitions", this.DefaultNumPartitions);
        this.setParamSimple(map, prefix + "DefaultReplicationFactor", this.DefaultReplicationFactor);

    }
}

