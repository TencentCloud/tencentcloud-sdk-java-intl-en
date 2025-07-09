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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventNotifySetting extends AbstractModel {

    /**
    * The callback configuration for push events.
    */
    @SerializedName("PushEventSettings")
    @Expose
    private PushEventSetting PushEventSettings;

    /**
     * Get The callback configuration for push events. 
     * @return PushEventSettings The callback configuration for push events.
     */
    public PushEventSetting getPushEventSettings() {
        return this.PushEventSettings;
    }

    /**
     * Set The callback configuration for push events.
     * @param PushEventSettings The callback configuration for push events.
     */
    public void setPushEventSettings(PushEventSetting PushEventSettings) {
        this.PushEventSettings = PushEventSettings;
    }

    public EventNotifySetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventNotifySetting(EventNotifySetting source) {
        if (source.PushEventSettings != null) {
            this.PushEventSettings = new PushEventSetting(source.PushEventSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PushEventSettings.", this.PushEventSettings);

    }
}

