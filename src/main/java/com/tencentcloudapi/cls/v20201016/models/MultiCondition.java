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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiCondition extends AbstractModel {

    /**
    * Trigger conditions
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Alarm severity. 0: Warning (Warn); 1: Reminder (Info); 2: Urgent (Critical).

- If not specified, the default is 0.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
     * Get Trigger conditions 
     * @return Condition Trigger conditions
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Trigger conditions
     * @param Condition Trigger conditions
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Alarm severity. 0: Warning (Warn); 1: Reminder (Info); 2: Urgent (Critical).

- If not specified, the default is 0. 
     * @return AlarmLevel Alarm severity. 0: Warning (Warn); 1: Reminder (Info); 2: Urgent (Critical).

- If not specified, the default is 0.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alarm severity. 0: Warning (Warn); 1: Reminder (Info); 2: Urgent (Critical).

- If not specified, the default is 0.
     * @param AlarmLevel Alarm severity. 0: Warning (Warn); 1: Reminder (Info); 2: Urgent (Critical).

- If not specified, the default is 0.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    public MultiCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiCondition(MultiCondition source) {
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);

    }
}

