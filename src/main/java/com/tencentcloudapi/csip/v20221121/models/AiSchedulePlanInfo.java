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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiSchedulePlanInfo extends AbstractModel {

    /**
    * Trigger ID.
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * Expected trigger time, Unix millisecond timestamp.
    */
    @SerializedName("FireTime")
    @Expose
    private Long FireTime;

    /**
    * Trigger type. Parameter Value: 1 (Cron expression), 2 (fixed time).
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
     * Get Trigger ID. 
     * @return TriggerId Trigger ID.
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set Trigger ID.
     * @param TriggerId Trigger ID.
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get Expected trigger time, Unix millisecond timestamp. 
     * @return FireTime Expected trigger time, Unix millisecond timestamp.
     */
    public Long getFireTime() {
        return this.FireTime;
    }

    /**
     * Set Expected trigger time, Unix millisecond timestamp.
     * @param FireTime Expected trigger time, Unix millisecond timestamp.
     */
    public void setFireTime(Long FireTime) {
        this.FireTime = FireTime;
    }

    /**
     * Get Trigger type. Parameter Value: 1 (Cron expression), 2 (fixed time). 
     * @return TriggerType Trigger type. Parameter Value: 1 (Cron expression), 2 (fixed time).
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Trigger type. Parameter Value: 1 (Cron expression), 2 (fixed time).
     * @param TriggerType Trigger type. Parameter Value: 1 (Cron expression), 2 (fixed time).
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    public AiSchedulePlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiSchedulePlanInfo(AiSchedulePlanInfo source) {
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.FireTime != null) {
            this.FireTime = new Long(source.FireTime);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "FireTime", this.FireTime);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);

    }
}

