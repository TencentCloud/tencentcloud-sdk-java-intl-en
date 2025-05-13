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

public class EventListenerDTO extends AbstractModel {

    /**
    * Keyword, generally the task id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * REST_API,KAFKA
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Creation time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreationTs")
    @Expose
    private String CreationTs;

    /**
    * Configuration information

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PropertiesList")
    @Expose
    private ParamInfoDs [] PropertiesList;

    /**
    * Event name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Listener task information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskInfo")
    @Expose
    private EventListenerTaskInfo TaskInfo;

    /**
    * Project id to which the event belongs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventProjectId")
    @Expose
    private String EventProjectId;

    /**
     * Get Keyword, generally the task id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Key Keyword, generally the task id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Keyword, generally the task id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Key Keyword, generally the task id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get REST_API,KAFKA
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type REST_API,KAFKA
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set REST_API,KAFKA
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type REST_API,KAFKA
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Creation time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreationTs Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreationTs() {
        return this.CreationTs;
    }

    /**
     * Set Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreationTs Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreationTs(String CreationTs) {
        this.CreationTs = CreationTs;
    }

    /**
     * Get Configuration information

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PropertiesList Configuration information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamInfoDs [] getPropertiesList() {
        return this.PropertiesList;
    }

    /**
     * Set Configuration information

Note: This field may return null, indicating that no valid values can be obtained.
     * @param PropertiesList Configuration information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPropertiesList(ParamInfoDs [] PropertiesList) {
        this.PropertiesList = PropertiesList;
    }

    /**
     * Get Event name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventName Event name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventName Event name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Listener task information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskInfo Listener task information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EventListenerTaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set Listener task information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskInfo Listener task information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskInfo(EventListenerTaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    /**
     * Get Project id to which the event belongs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventProjectId Project id to which the event belongs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventProjectId() {
        return this.EventProjectId;
    }

    /**
     * Set Project id to which the event belongs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventProjectId Project id to which the event belongs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventProjectId(String EventProjectId) {
        this.EventProjectId = EventProjectId;
    }

    public EventListenerDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventListenerDTO(EventListenerDTO source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreationTs != null) {
            this.CreationTs = new String(source.CreationTs);
        }
        if (source.PropertiesList != null) {
            this.PropertiesList = new ParamInfoDs[source.PropertiesList.length];
            for (int i = 0; i < source.PropertiesList.length; i++) {
                this.PropertiesList[i] = new ParamInfoDs(source.PropertiesList[i]);
            }
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.TaskInfo != null) {
            this.TaskInfo = new EventListenerTaskInfo(source.TaskInfo);
        }
        if (source.EventProjectId != null) {
            this.EventProjectId = new String(source.EventProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreationTs", this.CreationTs);
        this.setParamArrayObj(map, prefix + "PropertiesList.", this.PropertiesList);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);
        this.setParamSimple(map, prefix + "EventProjectId", this.EventProjectId);

    }
}

