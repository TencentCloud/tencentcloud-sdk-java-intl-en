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

public class OpenKafkaConsumerRequest extends AbstractModel {

    /**
    * <p>Log topic Id.</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">obtaining the log topic list</a>.</li><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">creating a log topic</a>.</li></ul>
    */
    @SerializedName("FromTopicId")
    @Expose
    private String FromTopicId;

    /**
    * <p>Compression type [0: NONE; 2: SNAPPY; 3: LZ4]. Default value: 0</p>
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * <p>kafka consumption data format</p>
    */
    @SerializedName("ConsumerContent")
    @Expose
    private KafkaConsumerContent ConsumerContent;

    /**
    * <p>Whether to enable the delivery service log. 1: Disabled; 2: Enabled. Default value: 2</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>Public network consumption switch. Enabled by default</p>
    */
    @SerializedName("EnableInternetConsume")
    @Expose
    private Boolean EnableInternetConsume;

    /**
    * <p>Private network consumption switch. Enabled by default</p>
    */
    @SerializedName("EnableIntranetConsume")
    @Expose
    private Boolean EnableIntranetConsume;

    /**
    * <p>Consumption scope type. 0: Latest; 1: Historical + latest. Default value: 0</p>
    */
    @SerializedName("ScopeType")
    @Expose
    private Long ScopeType;

    /**
     * Get <p>Log topic Id.</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">obtaining the log topic list</a>.</li><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">creating a log topic</a>.</li></ul> 
     * @return FromTopicId <p>Log topic Id.</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">obtaining the log topic list</a>.</li><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">creating a log topic</a>.</li></ul>
     */
    public String getFromTopicId() {
        return this.FromTopicId;
    }

    /**
     * Set <p>Log topic Id.</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">obtaining the log topic list</a>.</li><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">creating a log topic</a>.</li></ul>
     * @param FromTopicId <p>Log topic Id.</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">obtaining the log topic list</a>.</li><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56456?from_cn_redirect=1">creating a log topic</a>.</li></ul>
     */
    public void setFromTopicId(String FromTopicId) {
        this.FromTopicId = FromTopicId;
    }

    /**
     * Get <p>Compression type [0: NONE; 2: SNAPPY; 3: LZ4]. Default value: 0</p> 
     * @return Compression <p>Compression type [0: NONE; 2: SNAPPY; 3: LZ4]. Default value: 0</p>
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set <p>Compression type [0: NONE; 2: SNAPPY; 3: LZ4]. Default value: 0</p>
     * @param Compression <p>Compression type [0: NONE; 2: SNAPPY; 3: LZ4]. Default value: 0</p>
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get <p>kafka consumption data format</p> 
     * @return ConsumerContent <p>kafka consumption data format</p>
     */
    public KafkaConsumerContent getConsumerContent() {
        return this.ConsumerContent;
    }

    /**
     * Set <p>kafka consumption data format</p>
     * @param ConsumerContent <p>kafka consumption data format</p>
     */
    public void setConsumerContent(KafkaConsumerContent ConsumerContent) {
        this.ConsumerContent = ConsumerContent;
    }

    /**
     * Get <p>Whether to enable the delivery service log. 1: Disabled; 2: Enabled. Default value: 2</p> 
     * @return HasServicesLog <p>Whether to enable the delivery service log. 1: Disabled; 2: Enabled. Default value: 2</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether to enable the delivery service log. 1: Disabled; 2: Enabled. Default value: 2</p>
     * @param HasServicesLog <p>Whether to enable the delivery service log. 1: Disabled; 2: Enabled. Default value: 2</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>Public network consumption switch. Enabled by default</p> 
     * @return EnableInternetConsume <p>Public network consumption switch. Enabled by default</p>
     */
    public Boolean getEnableInternetConsume() {
        return this.EnableInternetConsume;
    }

    /**
     * Set <p>Public network consumption switch. Enabled by default</p>
     * @param EnableInternetConsume <p>Public network consumption switch. Enabled by default</p>
     */
    public void setEnableInternetConsume(Boolean EnableInternetConsume) {
        this.EnableInternetConsume = EnableInternetConsume;
    }

    /**
     * Get <p>Private network consumption switch. Enabled by default</p> 
     * @return EnableIntranetConsume <p>Private network consumption switch. Enabled by default</p>
     */
    public Boolean getEnableIntranetConsume() {
        return this.EnableIntranetConsume;
    }

    /**
     * Set <p>Private network consumption switch. Enabled by default</p>
     * @param EnableIntranetConsume <p>Private network consumption switch. Enabled by default</p>
     */
    public void setEnableIntranetConsume(Boolean EnableIntranetConsume) {
        this.EnableIntranetConsume = EnableIntranetConsume;
    }

    /**
     * Get <p>Consumption scope type. 0: Latest; 1: Historical + latest. Default value: 0</p> 
     * @return ScopeType <p>Consumption scope type. 0: Latest; 1: Historical + latest. Default value: 0</p>
     */
    public Long getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set <p>Consumption scope type. 0: Latest; 1: Historical + latest. Default value: 0</p>
     * @param ScopeType <p>Consumption scope type. 0: Latest; 1: Historical + latest. Default value: 0</p>
     */
    public void setScopeType(Long ScopeType) {
        this.ScopeType = ScopeType;
    }

    public OpenKafkaConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenKafkaConsumerRequest(OpenKafkaConsumerRequest source) {
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
        if (source.EnableInternetConsume != null) {
            this.EnableInternetConsume = new Boolean(source.EnableInternetConsume);
        }
        if (source.EnableIntranetConsume != null) {
            this.EnableIntranetConsume = new Boolean(source.EnableIntranetConsume);
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
        this.setParamSimple(map, prefix + "EnableInternetConsume", this.EnableInternetConsume);
        this.setParamSimple(map, prefix + "EnableIntranetConsume", this.EnableIntranetConsume);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);

    }
}

