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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEventBusRequest extends AbstractModel {

    /**
    * Event bus ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * Event bus description, which can contain up to 200 characters of any type.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Event bus name: it can contain 2-60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter.
    */
    @SerializedName("EventBusName")
    @Expose
    private String EventBusName;

    /**
    * Log retention period
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * EventBridge log topic ID
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * Whether to enable log retention
    */
    @SerializedName("EnableStore")
    @Expose
    private Boolean EnableStore;

    /**
     * Get Event bus ID 
     * @return EventBusId Event bus ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set Event bus ID
     * @param EventBusId Event bus ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get Event bus description, which can contain up to 200 characters of any type. 
     * @return Description Event bus description, which can contain up to 200 characters of any type.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event bus description, which can contain up to 200 characters of any type.
     * @param Description Event bus description, which can contain up to 200 characters of any type.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Event bus name: it can contain 2-60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter. 
     * @return EventBusName Event bus name: it can contain 2-60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter.
     */
    public String getEventBusName() {
        return this.EventBusName;
    }

    /**
     * Set Event bus name: it can contain 2-60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter.
     * @param EventBusName Event bus name: it can contain 2-60 letters, digits, underscores, and hyphens and must start with a letter and end with a digit or letter.
     */
    public void setEventBusName(String EventBusName) {
        this.EventBusName = EventBusName;
    }

    /**
     * Get Log retention period 
     * @return SaveDays Log retention period
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set Log retention period
     * @param SaveDays Log retention period
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get EventBridge log topic ID 
     * @return LogTopicId EventBridge log topic ID
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set EventBridge log topic ID
     * @param LogTopicId EventBridge log topic ID
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get Whether to enable log retention 
     * @return EnableStore Whether to enable log retention
     */
    public Boolean getEnableStore() {
        return this.EnableStore;
    }

    /**
     * Set Whether to enable log retention
     * @param EnableStore Whether to enable log retention
     */
    public void setEnableStore(Boolean EnableStore) {
        this.EnableStore = EnableStore;
    }

    public UpdateEventBusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEventBusRequest(UpdateEventBusRequest source) {
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EventBusName != null) {
            this.EventBusName = new String(source.EventBusName);
        }
        if (source.SaveDays != null) {
            this.SaveDays = new Long(source.SaveDays);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.EnableStore != null) {
            this.EnableStore = new Boolean(source.EnableStore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EventBusName", this.EventBusName);
        this.setParamSimple(map, prefix + "SaveDays", this.SaveDays);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "EnableStore", this.EnableStore);

    }
}

