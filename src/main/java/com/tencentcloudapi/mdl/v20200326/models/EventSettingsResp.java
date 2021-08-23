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

public class EventSettingsResp extends AbstractModel{

    /**
    * Only `INPUT_SWITCH` is supported currently.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
    */
    @SerializedName("InputAttachment")
    @Expose
    private String InputAttachment;

    /**
     * Get Only `INPUT_SWITCH` is supported currently. 
     * @return EventType Only `INPUT_SWITCH` is supported currently.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Only `INPUT_SWITCH` is supported currently.
     * @param EventType Only `INPUT_SWITCH` is supported currently.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH` 
     * @return InputAttachment ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
     */
    public String getInputAttachment() {
        return this.InputAttachment;
    }

    /**
     * Set ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
     * @param InputAttachment ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
     */
    public void setInputAttachment(String InputAttachment) {
        this.InputAttachment = InputAttachment;
    }

    public EventSettingsResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventSettingsResp(EventSettingsResp source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.InputAttachment != null) {
            this.InputAttachment = new String(source.InputAttachment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "InputAttachment", this.InputAttachment);

    }
}

