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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterEventListenerRequest extends AbstractModel {

    /**
    * Keyword, if it refers to a task, then pass the Task ID
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Event name
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Event type, default REST_API
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Configuration information, for example, maximum waiting time 1 day configuration in json: {"maxWaitEventTime":1,"maxWaitEventTimeUnit":"DAYS"}
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
     * Get Keyword, if it refers to a task, then pass the Task ID 
     * @return Key Keyword, if it refers to a task, then pass the Task ID
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Keyword, if it refers to a task, then pass the Task ID
     * @param Key Keyword, if it refers to a task, then pass the Task ID
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Event name 
     * @return EventName Event name
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name
     * @param EventName Event name
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Event type, default REST_API 
     * @return Type Event type, default REST_API
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Event type, default REST_API
     * @param Type Event type, default REST_API
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Configuration information, for example, maximum waiting time 1 day configuration in json: {"maxWaitEventTime":1,"maxWaitEventTimeUnit":"DAYS"} 
     * @return Properties Configuration information, for example, maximum waiting time 1 day configuration in json: {"maxWaitEventTime":1,"maxWaitEventTimeUnit":"DAYS"}
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set Configuration information, for example, maximum waiting time 1 day configuration in json: {"maxWaitEventTime":1,"maxWaitEventTimeUnit":"DAYS"}
     * @param Properties Configuration information, for example, maximum waiting time 1 day configuration in json: {"maxWaitEventTime":1,"maxWaitEventTimeUnit":"DAYS"}
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    public RegisterEventListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterEventListenerRequest(RegisterEventListenerRequest source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Properties", this.Properties);

    }
}

