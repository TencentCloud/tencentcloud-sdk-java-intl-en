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
    * Optional. If `auto.create.topic.enable` is set to `true` and this value is not set, 3 will be used by default
    */
    @SerializedName("DefaultNumPartitions")
    @Expose
    private Long DefaultNumPartitions;

    /**
    * If `auto.create.topic.enable` is set to `true` but this value is not set, 2 will be used by default
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
     * Get Optional. If `auto.create.topic.enable` is set to `true` and this value is not set, 3 will be used by default 
     * @return DefaultNumPartitions Optional. If `auto.create.topic.enable` is set to `true` and this value is not set, 3 will be used by default
     */
    public Long getDefaultNumPartitions() {
        return this.DefaultNumPartitions;
    }

    /**
     * Set Optional. If `auto.create.topic.enable` is set to `true` and this value is not set, 3 will be used by default
     * @param DefaultNumPartitions Optional. If `auto.create.topic.enable` is set to `true` and this value is not set, 3 will be used by default
     */
    public void setDefaultNumPartitions(Long DefaultNumPartitions) {
        this.DefaultNumPartitions = DefaultNumPartitions;
    }

    /**
     * Get If `auto.create.topic.enable` is set to `true` but this value is not set, 2 will be used by default 
     * @return DefaultReplicationFactor If `auto.create.topic.enable` is set to `true` but this value is not set, 2 will be used by default
     */
    public Long getDefaultReplicationFactor() {
        return this.DefaultReplicationFactor;
    }

    /**
     * Set If `auto.create.topic.enable` is set to `true` but this value is not set, 2 will be used by default
     * @param DefaultReplicationFactor If `auto.create.topic.enable` is set to `true` but this value is not set, 2 will be used by default
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

