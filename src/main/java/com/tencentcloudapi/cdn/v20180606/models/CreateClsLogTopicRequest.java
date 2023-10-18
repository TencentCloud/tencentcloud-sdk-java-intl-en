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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClsLogTopicRequest extends AbstractModel {

    /**
    * Log topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Specifies whether to access CDN or ECDN. Valid values: `cdn` (default) and `ecdn`.
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * Domain name region information
    */
    @SerializedName("DomainAreaConfigs")
    @Expose
    private DomainAreaConfig [] DomainAreaConfigs;

    /**
     * Get Log topic name 
     * @return TopicName Log topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Log topic name
     * @param TopicName Log topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Logset ID 
     * @return LogsetId Logset ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
     * @param LogsetId Logset ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Specifies whether to access CDN or ECDN. Valid values: `cdn` (default) and `ecdn`. 
     * @return Channel Specifies whether to access CDN or ECDN. Valid values: `cdn` (default) and `ecdn`.
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set Specifies whether to access CDN or ECDN. Valid values: `cdn` (default) and `ecdn`.
     * @param Channel Specifies whether to access CDN or ECDN. Valid values: `cdn` (default) and `ecdn`.
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get Domain name region information 
     * @return DomainAreaConfigs Domain name region information
     */
    public DomainAreaConfig [] getDomainAreaConfigs() {
        return this.DomainAreaConfigs;
    }

    /**
     * Set Domain name region information
     * @param DomainAreaConfigs Domain name region information
     */
    public void setDomainAreaConfigs(DomainAreaConfig [] DomainAreaConfigs) {
        this.DomainAreaConfigs = DomainAreaConfigs;
    }

    public CreateClsLogTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClsLogTopicRequest(CreateClsLogTopicRequest source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.DomainAreaConfigs != null) {
            this.DomainAreaConfigs = new DomainAreaConfig[source.DomainAreaConfigs.length];
            for (int i = 0; i < source.DomainAreaConfigs.length; i++) {
                this.DomainAreaConfigs[i] = new DomainAreaConfig(source.DomainAreaConfigs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamArrayObj(map, prefix + "DomainAreaConfigs.", this.DomainAreaConfigs);

    }
}

