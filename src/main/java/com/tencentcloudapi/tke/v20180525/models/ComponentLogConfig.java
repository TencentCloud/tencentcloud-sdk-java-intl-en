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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentLogConfig extends AbstractModel {

    /**
    * Component name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Log level. for components that support dynamic adjustment, you can specify this parameter when enabling logs.
    */
    @SerializedName("LogLevel")
    @Expose
    private Long LogLevel;

    /**
    * Logset ID. if not specified, auto-create.
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Log topic ID. if not specified, auto-create.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * topic region. this parameter enables cross-region shipping of logs.
    */
    @SerializedName("TopicRegion")
    @Expose
    private String TopicRegion;

    /**
     * Get Component name 
     * @return Name Component name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Component name
     * @param Name Component name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Log level. for components that support dynamic adjustment, you can specify this parameter when enabling logs. 
     * @return LogLevel Log level. for components that support dynamic adjustment, you can specify this parameter when enabling logs.
     */
    public Long getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set Log level. for components that support dynamic adjustment, you can specify this parameter when enabling logs.
     * @param LogLevel Log level. for components that support dynamic adjustment, you can specify this parameter when enabling logs.
     */
    public void setLogLevel(Long LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get Logset ID. if not specified, auto-create. 
     * @return LogSetId Logset ID. if not specified, auto-create.
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set Logset ID. if not specified, auto-create.
     * @param LogSetId Logset ID. if not specified, auto-create.
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Log topic ID. if not specified, auto-create. 
     * @return TopicId Log topic ID. if not specified, auto-create.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID. if not specified, auto-create.
     * @param TopicId Log topic ID. if not specified, auto-create.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get topic region. this parameter enables cross-region shipping of logs. 
     * @return TopicRegion topic region. this parameter enables cross-region shipping of logs.
     */
    public String getTopicRegion() {
        return this.TopicRegion;
    }

    /**
     * Set topic region. this parameter enables cross-region shipping of logs.
     * @param TopicRegion topic region. this parameter enables cross-region shipping of logs.
     */
    public void setTopicRegion(String TopicRegion) {
        this.TopicRegion = TopicRegion;
    }

    public ComponentLogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentLogConfig(ComponentLogConfig source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new Long(source.LogLevel);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicRegion != null) {
            this.TopicRegion = new String(source.TopicRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicRegion", this.TopicRegion);

    }
}

