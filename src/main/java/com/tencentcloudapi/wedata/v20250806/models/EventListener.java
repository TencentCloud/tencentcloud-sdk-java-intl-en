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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventListener extends AbstractModel {

    /**
    * Event name

    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Event cycle. valid values: SECOND, MIN, HOUR, DAY.

    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * Event BROADCAST type: SINGLE, BROADCAST.

    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * Extension Information


    */
    @SerializedName("PropertiesList")
    @Expose
    private ParamInfo [] PropertiesList;

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
     * Get Event cycle. valid values: SECOND, MIN, HOUR, DAY.
 
     * @return EventSubType Event cycle. valid values: SECOND, MIN, HOUR, DAY.

     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set Event cycle. valid values: SECOND, MIN, HOUR, DAY.

     * @param EventSubType Event cycle. valid values: SECOND, MIN, HOUR, DAY.

     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get Event BROADCAST type: SINGLE, BROADCAST.
 
     * @return EventBroadcastType Event BROADCAST type: SINGLE, BROADCAST.

     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set Event BROADCAST type: SINGLE, BROADCAST.

     * @param EventBroadcastType Event BROADCAST type: SINGLE, BROADCAST.

     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get Extension Information

 
     * @return PropertiesList Extension Information


     */
    public ParamInfo [] getPropertiesList() {
        return this.PropertiesList;
    }

    /**
     * Set Extension Information


     * @param PropertiesList Extension Information


     */
    public void setPropertiesList(ParamInfo [] PropertiesList) {
        this.PropertiesList = PropertiesList;
    }

    public EventListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventListener(EventListener source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
        if (source.PropertiesList != null) {
            this.PropertiesList = new ParamInfo[source.PropertiesList.length];
            for (int i = 0; i < source.PropertiesList.length; i++) {
                this.PropertiesList[i] = new ParamInfo(source.PropertiesList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamArrayObj(map, prefix + "PropertiesList.", this.PropertiesList);

    }
}

