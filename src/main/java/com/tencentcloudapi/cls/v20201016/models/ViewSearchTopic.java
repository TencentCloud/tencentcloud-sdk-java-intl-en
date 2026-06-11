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

public class ViewSearchTopic extends AbstractModel {

    /**
    * <p>Region of the logset and topic</p><p>Parameter format: ap-guangzhou</p><p>In the same query view, each topic must be in the same region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Log set id</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>Log topic id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get <p>Region of the logset and topic</p><p>Parameter format: ap-guangzhou</p><p>In the same query view, each topic must be in the same region.</p> 
     * @return Region <p>Region of the logset and topic</p><p>Parameter format: ap-guangzhou</p><p>In the same query view, each topic must be in the same region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region of the logset and topic</p><p>Parameter format: ap-guangzhou</p><p>In the same query view, each topic must be in the same region.</p>
     * @param Region <p>Region of the logset and topic</p><p>Parameter format: ap-guangzhou</p><p>In the same query view, each topic must be in the same region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Log set id</p> 
     * @return LogsetId <p>Log set id</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>Log set id</p>
     * @param LogsetId <p>Log set id</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>Log topic id</p> 
     * @return TopicId <p>Log topic id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Log topic id</p>
     * @param TopicId <p>Log topic id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public ViewSearchTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewSearchTopic(ViewSearchTopic source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

