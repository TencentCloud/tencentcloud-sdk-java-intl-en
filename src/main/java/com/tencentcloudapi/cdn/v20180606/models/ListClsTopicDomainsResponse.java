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

public class ListClsTopicDomainsResponse extends AbstractModel {

    /**
    * Developer ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Channel
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

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
    * Domain name region configuration, which may contain deleted domain names. If this is to be used in `ManageClsTopicDomains` API, you need to exclude deleted domain names by using the `ListCdnDomains` API.
    */
    @SerializedName("DomainAreaConfigs")
    @Expose
    private DomainAreaConfig [] DomainAreaConfigs;

    /**
    * Log topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Last modified time of log topic
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Developer ID 
     * @return AppId Developer ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Developer ID
     * @param AppId Developer ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Channel 
     * @return Channel Channel
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set Channel
     * @param Channel Channel
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
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
     * Get Domain name region configuration, which may contain deleted domain names. If this is to be used in `ManageClsTopicDomains` API, you need to exclude deleted domain names by using the `ListCdnDomains` API. 
     * @return DomainAreaConfigs Domain name region configuration, which may contain deleted domain names. If this is to be used in `ManageClsTopicDomains` API, you need to exclude deleted domain names by using the `ListCdnDomains` API.
     */
    public DomainAreaConfig [] getDomainAreaConfigs() {
        return this.DomainAreaConfigs;
    }

    /**
     * Set Domain name region configuration, which may contain deleted domain names. If this is to be used in `ManageClsTopicDomains` API, you need to exclude deleted domain names by using the `ListCdnDomains` API.
     * @param DomainAreaConfigs Domain name region configuration, which may contain deleted domain names. If this is to be used in `ManageClsTopicDomains` API, you need to exclude deleted domain names by using the `ListCdnDomains` API.
     */
    public void setDomainAreaConfigs(DomainAreaConfig [] DomainAreaConfigs) {
        this.DomainAreaConfigs = DomainAreaConfigs;
    }

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
     * Get Last modified time of log topic
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UpdateTime Last modified time of log topic
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of log topic
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UpdateTime Last modified time of log topic
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListClsTopicDomainsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListClsTopicDomainsResponse(ListClsTopicDomainsResponse source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
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
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamArrayObj(map, prefix + "DomainAreaConfigs.", this.DomainAreaConfigs);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

