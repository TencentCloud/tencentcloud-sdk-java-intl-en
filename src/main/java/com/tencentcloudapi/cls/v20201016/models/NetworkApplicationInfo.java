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

public class NetworkApplicationInfo extends AbstractModel {

    /**
    * Web application Id
    */
    @SerializedName("NetworkAppId")
    @Expose
    private String NetworkAppId;

    /**
    * Network app name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Region code
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Log topic id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * log set id
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Host Account ID
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-account ID
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
    * Creation time, timestamp in seconds
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Update time (second-level timestamp)
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Web application Id 
     * @return NetworkAppId Web application Id
     */
    public String getNetworkAppId() {
        return this.NetworkAppId;
    }

    /**
     * Set Web application Id
     * @param NetworkAppId Web application Id
     */
    public void setNetworkAppId(String NetworkAppId) {
        this.NetworkAppId = NetworkAppId;
    }

    /**
     * Get Network app name 
     * @return Name Network app name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Network app name
     * @param Name Network app name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Region code 
     * @return Region Region code
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region code
     * @param Region Region code
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Log topic id 
     * @return TopicId Log topic id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic id
     * @param TopicId Log topic id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get log set id 
     * @return LogsetId log set id
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set log set id
     * @param LogsetId log set id
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Host Account ID 
     * @return Uin Host Account ID
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Host Account ID
     * @param Uin Host Account ID
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-account ID 
     * @return SubUin Sub-account ID
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Sub-account ID
     * @param SubUin Sub-account ID
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get Creation time, timestamp in seconds 
     * @return CreateTime Creation time, timestamp in seconds
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, timestamp in seconds
     * @param CreateTime Creation time, timestamp in seconds
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time (second-level timestamp) 
     * @return UpdateTime Update time (second-level timestamp)
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time (second-level timestamp)
     * @param UpdateTime Update time (second-level timestamp)
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public NetworkApplicationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkApplicationInfo(NetworkApplicationInfo source) {
        if (source.NetworkAppId != null) {
            this.NetworkAppId = new String(source.NetworkAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkAppId", this.NetworkAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

