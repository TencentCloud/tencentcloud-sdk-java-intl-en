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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQClusterConfig extends AbstractModel{

    /**
    * Maximum TPS per namespace
    */
    @SerializedName("MaxTpsPerNamespace")
    @Expose
    private Long MaxTpsPerNamespace;

    /**
    * Maximum number of namespaces
    */
    @SerializedName("MaxNamespaceNum")
    @Expose
    private Long MaxNamespaceNum;

    /**
    * Number of used namespaces
    */
    @SerializedName("UsedNamespaceNum")
    @Expose
    private Long UsedNamespaceNum;

    /**
    * Maximum number of topics
    */
    @SerializedName("MaxTopicNum")
    @Expose
    private Long MaxTopicNum;

    /**
    * Number of used topics
    */
    @SerializedName("UsedTopicNum")
    @Expose
    private Long UsedTopicNum;

    /**
    * Maximum number of groups
    */
    @SerializedName("MaxGroupNum")
    @Expose
    private Long MaxGroupNum;

    /**
    * Number of used groups
    */
    @SerializedName("UsedGroupNum")
    @Expose
    private Long UsedGroupNum;

    /**
    * Maximum message retention period in milliseconds
    */
    @SerializedName("MaxRetentionTime")
    @Expose
    private Long MaxRetentionTime;

    /**
    * Maximum message delay in milliseconds
    */
    @SerializedName("MaxLatencyTime")
    @Expose
    private Long MaxLatencyTime;

    /**
     * Get Maximum TPS per namespace 
     * @return MaxTpsPerNamespace Maximum TPS per namespace
     */
    public Long getMaxTpsPerNamespace() {
        return this.MaxTpsPerNamespace;
    }

    /**
     * Set Maximum TPS per namespace
     * @param MaxTpsPerNamespace Maximum TPS per namespace
     */
    public void setMaxTpsPerNamespace(Long MaxTpsPerNamespace) {
        this.MaxTpsPerNamespace = MaxTpsPerNamespace;
    }

    /**
     * Get Maximum number of namespaces 
     * @return MaxNamespaceNum Maximum number of namespaces
     */
    public Long getMaxNamespaceNum() {
        return this.MaxNamespaceNum;
    }

    /**
     * Set Maximum number of namespaces
     * @param MaxNamespaceNum Maximum number of namespaces
     */
    public void setMaxNamespaceNum(Long MaxNamespaceNum) {
        this.MaxNamespaceNum = MaxNamespaceNum;
    }

    /**
     * Get Number of used namespaces 
     * @return UsedNamespaceNum Number of used namespaces
     */
    public Long getUsedNamespaceNum() {
        return this.UsedNamespaceNum;
    }

    /**
     * Set Number of used namespaces
     * @param UsedNamespaceNum Number of used namespaces
     */
    public void setUsedNamespaceNum(Long UsedNamespaceNum) {
        this.UsedNamespaceNum = UsedNamespaceNum;
    }

    /**
     * Get Maximum number of topics 
     * @return MaxTopicNum Maximum number of topics
     */
    public Long getMaxTopicNum() {
        return this.MaxTopicNum;
    }

    /**
     * Set Maximum number of topics
     * @param MaxTopicNum Maximum number of topics
     */
    public void setMaxTopicNum(Long MaxTopicNum) {
        this.MaxTopicNum = MaxTopicNum;
    }

    /**
     * Get Number of used topics 
     * @return UsedTopicNum Number of used topics
     */
    public Long getUsedTopicNum() {
        return this.UsedTopicNum;
    }

    /**
     * Set Number of used topics
     * @param UsedTopicNum Number of used topics
     */
    public void setUsedTopicNum(Long UsedTopicNum) {
        this.UsedTopicNum = UsedTopicNum;
    }

    /**
     * Get Maximum number of groups 
     * @return MaxGroupNum Maximum number of groups
     */
    public Long getMaxGroupNum() {
        return this.MaxGroupNum;
    }

    /**
     * Set Maximum number of groups
     * @param MaxGroupNum Maximum number of groups
     */
    public void setMaxGroupNum(Long MaxGroupNum) {
        this.MaxGroupNum = MaxGroupNum;
    }

    /**
     * Get Number of used groups 
     * @return UsedGroupNum Number of used groups
     */
    public Long getUsedGroupNum() {
        return this.UsedGroupNum;
    }

    /**
     * Set Number of used groups
     * @param UsedGroupNum Number of used groups
     */
    public void setUsedGroupNum(Long UsedGroupNum) {
        this.UsedGroupNum = UsedGroupNum;
    }

    /**
     * Get Maximum message retention period in milliseconds 
     * @return MaxRetentionTime Maximum message retention period in milliseconds
     */
    public Long getMaxRetentionTime() {
        return this.MaxRetentionTime;
    }

    /**
     * Set Maximum message retention period in milliseconds
     * @param MaxRetentionTime Maximum message retention period in milliseconds
     */
    public void setMaxRetentionTime(Long MaxRetentionTime) {
        this.MaxRetentionTime = MaxRetentionTime;
    }

    /**
     * Get Maximum message delay in milliseconds 
     * @return MaxLatencyTime Maximum message delay in milliseconds
     */
    public Long getMaxLatencyTime() {
        return this.MaxLatencyTime;
    }

    /**
     * Set Maximum message delay in milliseconds
     * @param MaxLatencyTime Maximum message delay in milliseconds
     */
    public void setMaxLatencyTime(Long MaxLatencyTime) {
        this.MaxLatencyTime = MaxLatencyTime;
    }

    public RocketMQClusterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQClusterConfig(RocketMQClusterConfig source) {
        if (source.MaxTpsPerNamespace != null) {
            this.MaxTpsPerNamespace = new Long(source.MaxTpsPerNamespace);
        }
        if (source.MaxNamespaceNum != null) {
            this.MaxNamespaceNum = new Long(source.MaxNamespaceNum);
        }
        if (source.UsedNamespaceNum != null) {
            this.UsedNamespaceNum = new Long(source.UsedNamespaceNum);
        }
        if (source.MaxTopicNum != null) {
            this.MaxTopicNum = new Long(source.MaxTopicNum);
        }
        if (source.UsedTopicNum != null) {
            this.UsedTopicNum = new Long(source.UsedTopicNum);
        }
        if (source.MaxGroupNum != null) {
            this.MaxGroupNum = new Long(source.MaxGroupNum);
        }
        if (source.UsedGroupNum != null) {
            this.UsedGroupNum = new Long(source.UsedGroupNum);
        }
        if (source.MaxRetentionTime != null) {
            this.MaxRetentionTime = new Long(source.MaxRetentionTime);
        }
        if (source.MaxLatencyTime != null) {
            this.MaxLatencyTime = new Long(source.MaxLatencyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxTpsPerNamespace", this.MaxTpsPerNamespace);
        this.setParamSimple(map, prefix + "MaxNamespaceNum", this.MaxNamespaceNum);
        this.setParamSimple(map, prefix + "UsedNamespaceNum", this.UsedNamespaceNum);
        this.setParamSimple(map, prefix + "MaxTopicNum", this.MaxTopicNum);
        this.setParamSimple(map, prefix + "UsedTopicNum", this.UsedTopicNum);
        this.setParamSimple(map, prefix + "MaxGroupNum", this.MaxGroupNum);
        this.setParamSimple(map, prefix + "UsedGroupNum", this.UsedGroupNum);
        this.setParamSimple(map, prefix + "MaxRetentionTime", this.MaxRetentionTime);
        this.setParamSimple(map, prefix + "MaxLatencyTime", this.MaxLatencyTime);

    }
}

