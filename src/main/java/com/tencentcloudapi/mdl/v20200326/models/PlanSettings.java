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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlanSettings extends AbstractModel {

    /**
    * Timed recording settings
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TimedRecordSettings")
    @Expose
    private TimedRecordSettings TimedRecordSettings;

    /**
     * Get Timed recording settings
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TimedRecordSettings Timed recording settings
Note: This field may return `null`, indicating that no valid value was found.
     */
    public TimedRecordSettings getTimedRecordSettings() {
        return this.TimedRecordSettings;
    }

    /**
     * Set Timed recording settings
Note: This field may return `null`, indicating that no valid value was found.
     * @param TimedRecordSettings Timed recording settings
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTimedRecordSettings(TimedRecordSettings TimedRecordSettings) {
        this.TimedRecordSettings = TimedRecordSettings;
    }

    public PlanSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlanSettings(PlanSettings source) {
        if (source.TimedRecordSettings != null) {
            this.TimedRecordSettings = new TimedRecordSettings(source.TimedRecordSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TimedRecordSettings.", this.TimedRecordSettings);

    }
}

