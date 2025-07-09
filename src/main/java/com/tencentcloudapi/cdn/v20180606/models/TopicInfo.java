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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicInfo extends AbstractModel {

    /**
    * Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Whether to enable publishing
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * Creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Either `cdn` or `ecdn`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * Whether the logset has been removed from CLS
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Deleted")
    @Expose
    private String Deleted;

    /**
     * Get Topic ID 
     * @return TopicId Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID
     * @param TopicId Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Whether to enable publishing 
     * @return Enabled Whether to enable publishing
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable publishing
     * @param Enabled Whether to enable publishing
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Creation time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CreateTime Creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CreateTime Creation time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Either `cdn` or `ecdn`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Channel Either `cdn` or `ecdn`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set Either `cdn` or `ecdn`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Channel Either `cdn` or `ecdn`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get Whether the logset has been removed from CLS
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Deleted Whether the logset has been removed from CLS
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getDeleted() {
        return this.Deleted;
    }

    /**
     * Set Whether the logset has been removed from CLS
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Deleted Whether the logset has been removed from CLS
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDeleted(String Deleted) {
        this.Deleted = Deleted;
    }

    public TopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicInfo(TopicInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.Deleted != null) {
            this.Deleted = new String(source.Deleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);

    }
}

