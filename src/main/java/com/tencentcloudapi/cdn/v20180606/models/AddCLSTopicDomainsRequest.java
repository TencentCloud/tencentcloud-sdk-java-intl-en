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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddCLSTopicDomainsRequest extends AbstractModel{

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Region configuration for domains
    */
    @SerializedName("DomainAreaConfigs")
    @Expose
    private DomainAreaConfig [] DomainAreaConfigs;

    /**
    * Specifies whether to access CDN or ECDN. Valid values: `cdn` (default) and `ecdn`.
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

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
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Region configuration for domains 
     * @return DomainAreaConfigs Region configuration for domains
     */
    public DomainAreaConfig [] getDomainAreaConfigs() {
        return this.DomainAreaConfigs;
    }

    /**
     * Set Region configuration for domains
     * @param DomainAreaConfigs Region configuration for domains
     */
    public void setDomainAreaConfigs(DomainAreaConfig [] DomainAreaConfigs) {
        this.DomainAreaConfigs = DomainAreaConfigs;
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

    public AddCLSTopicDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCLSTopicDomainsRequest(AddCLSTopicDomainsRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.DomainAreaConfigs != null) {
            this.DomainAreaConfigs = new DomainAreaConfig[source.DomainAreaConfigs.length];
            for (int i = 0; i < source.DomainAreaConfigs.length; i++) {
                this.DomainAreaConfigs[i] = new DomainAreaConfig(source.DomainAreaConfigs[i]);
            }
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamArrayObj(map, prefix + "DomainAreaConfigs.", this.DomainAreaConfigs);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

