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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventListenerOpsDto extends AbstractModel {

    /**
    * Event nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Keyword, if it is a task, then it is the Task ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Trigger methodNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Event Attributes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private String CreationTimestamp;

    /**
     * Get Event nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return EventName Event nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param EventName Event nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Keyword, if it is a task, then it is the Task ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Key Keyword, if it is a task, then it is the Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Keyword, if it is a task, then it is the Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Key Keyword, if it is a task, then it is the Task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Trigger methodNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Type Trigger methodNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Trigger methodNote: This field may return null, indicating that no valid value can be obtained.
     * @param Type Trigger methodNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Event Attributes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Properties Event Attributes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set Event Attributes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Properties Event Attributes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreationTimestamp Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreationTimestamp Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreationTimestamp(String CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    public EventListenerOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventListenerOpsDto(EventListenerOpsDto source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new String(source.CreationTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);

    }
}

