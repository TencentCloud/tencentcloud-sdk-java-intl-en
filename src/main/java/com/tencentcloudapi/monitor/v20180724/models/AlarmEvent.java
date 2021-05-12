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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmEvent extends AbstractModel{

    /**
    * Event name
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Event display name
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Alarm policy type
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

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
     * Get Event display name 
     * @return Description Event display name
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event display name
     * @param Description Event display name
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Alarm policy type 
     * @return Namespace Alarm policy type
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Alarm policy type
     * @param Namespace Alarm policy type
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public AlarmEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmEvent(AlarmEvent source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

