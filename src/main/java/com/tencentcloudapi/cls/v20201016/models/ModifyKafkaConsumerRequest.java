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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyKafkaConsumerRequest extends AbstractModel {

    /**
    * <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">Create Log Topic</a>.</li></ul>
    */
    @SerializedName("FromTopicId")
    @Expose
    private String FromTopicId;

    /**
    * <p>Compression mode. 0: No compression; 2: Use Snappy compression; 3: Use LZ4 compression</p>
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * <p>kafka protocol consumption data format</p>
    */
    @SerializedName("ConsumerContent")
    @Expose
    private KafkaConsumerContent ConsumerContent;

    /**
    * <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled.</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>Range type of consumption, 0: latest, 1: history + latest</p>
    */
    @SerializedName("ScopeType")
    @Expose
    private Long ScopeType;

    /**
     * Get <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">Create Log Topic</a>.</li></ul> 
     * @return FromTopicId <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">Create Log Topic</a>.</li></ul>
     */
    public String getFromTopicId() {
        return this.FromTopicId;
    }

    /**
     * Set <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">Create Log Topic</a>.</li></ul>
     * @param FromTopicId <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">Create Log Topic</a>.</li></ul>
     */
    public void setFromTopicId(String FromTopicId) {
        this.FromTopicId = FromTopicId;
    }

    /**
     * Get <p>Compression mode. 0: No compression; 2: Use Snappy compression; 3: Use LZ4 compression</p> 
     * @return Compression <p>Compression mode. 0: No compression; 2: Use Snappy compression; 3: Use LZ4 compression</p>
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set <p>Compression mode. 0: No compression; 2: Use Snappy compression; 3: Use LZ4 compression</p>
     * @param Compression <p>Compression mode. 0: No compression; 2: Use Snappy compression; 3: Use LZ4 compression</p>
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get <p>kafka protocol consumption data format</p> 
     * @return ConsumerContent <p>kafka protocol consumption data format</p>
     */
    public KafkaConsumerContent getConsumerContent() {
        return this.ConsumerContent;
    }

    /**
     * Set <p>kafka protocol consumption data format</p>
     * @param ConsumerContent <p>kafka protocol consumption data format</p>
     */
    public void setConsumerContent(KafkaConsumerContent ConsumerContent) {
        this.ConsumerContent = ConsumerContent;
    }

    /**
     * Get <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled.</p> 
     * @return HasServicesLog <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled.</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled.</p>
     * @param HasServicesLog <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled.</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>Range type of consumption, 0: latest, 1: history + latest</p> 
     * @return ScopeType <p>Range type of consumption, 0: latest, 1: history + latest</p>
     */
    public Long getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set <p>Range type of consumption, 0: latest, 1: history + latest</p>
     * @param ScopeType <p>Range type of consumption, 0: latest, 1: history + latest</p>
     */
    public void setScopeType(Long ScopeType) {
        this.ScopeType = ScopeType;
    }

    public ModifyKafkaConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKafkaConsumerRequest(ModifyKafkaConsumerRequest source) {
        if (source.FromTopicId != null) {
            this.FromTopicId = new String(source.FromTopicId);
        }
        if (source.Compression != null) {
            this.Compression = new Long(source.Compression);
        }
        if (source.ConsumerContent != null) {
            this.ConsumerContent = new KafkaConsumerContent(source.ConsumerContent);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new Long(source.ScopeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromTopicId", this.FromTopicId);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamObj(map, prefix + "ConsumerContent.", this.ConsumerContent);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);

    }
}

