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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlanReq extends AbstractModel{

    /**
    * Event name
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Event trigger time settings
    */
    @SerializedName("TimingSettings")
    @Expose
    private TimingSettingsReq TimingSettings;

    /**
    * Event configuration
    */
    @SerializedName("EventSettings")
    @Expose
    private EventSettingsReq EventSettings;

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
     * Get Event trigger time settings 
     * @return TimingSettings Event trigger time settings
     */
    public TimingSettingsReq getTimingSettings() {
        return this.TimingSettings;
    }

    /**
     * Set Event trigger time settings
     * @param TimingSettings Event trigger time settings
     */
    public void setTimingSettings(TimingSettingsReq TimingSettings) {
        this.TimingSettings = TimingSettings;
    }

    /**
     * Get Event configuration 
     * @return EventSettings Event configuration
     */
    public EventSettingsReq getEventSettings() {
        return this.EventSettings;
    }

    /**
     * Set Event configuration
     * @param EventSettings Event configuration
     */
    public void setEventSettings(EventSettingsReq EventSettings) {
        this.EventSettings = EventSettings;
    }

    public PlanReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlanReq(PlanReq source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.TimingSettings != null) {
            this.TimingSettings = new TimingSettingsReq(source.TimingSettings);
        }
        if (source.EventSettings != null) {
            this.EventSettings = new EventSettingsReq(source.EventSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamObj(map, prefix + "TimingSettings.", this.TimingSettings);
        this.setParamObj(map, prefix + "EventSettings.", this.EventSettings);

    }
}

