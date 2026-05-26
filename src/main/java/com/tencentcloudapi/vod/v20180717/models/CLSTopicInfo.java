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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLSTopicInfo extends AbstractModel {

    /**
    * Log topic ID.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Log Set ID.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
     * Get Log topic ID. 
     * @return TopicId Log topic ID.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID.
     * @param TopicId Log topic ID.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log topic name. 
     * @return TopicName Log topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Log topic name.
     * @param TopicName Log topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Log Set ID. 
     * @return LogsetId Log Set ID.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Log Set ID.
     * @param LogsetId Log Set ID.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    public CLSTopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLSTopicInfo(CLSTopicInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);

    }
}

