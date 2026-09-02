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

public class AiScheduleTriggerInfo extends AbstractModel {

    /**
    * <p>Trigger ID.</p>
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>Trigger type. Value: 1 (Cron expression), 2 (fixed time).</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
     * Get <p>Trigger ID.</p> 
     * @return TriggerId <p>Trigger ID.</p>
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>Trigger ID.</p>
     * @param TriggerId <p>Trigger ID.</p>
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get <p>Trigger type. Value: 1 (Cron expression), 2 (fixed time).</p> 
     * @return TriggerType <p>Trigger type. Value: 1 (Cron expression), 2 (fixed time).</p>
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Trigger type. Value: 1 (Cron expression), 2 (fixed time).</p>
     * @param TriggerType <p>Trigger type. Value: 1 (Cron expression), 2 (fixed time).</p>
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    public AiScheduleTriggerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiScheduleTriggerInfo(AiScheduleTriggerInfo source) {
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
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
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);

    }
}

