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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerType extends AbstractModel {

    /**
    * Trigger Type
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
    * Trigger time period
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("MaximumExecutionFrequency")
    @Expose
    private String MaximumExecutionFrequency;

    /**
     * Get Trigger Type 
     * @return MessageType Trigger Type
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set Trigger Type
     * @param MessageType Trigger Type
     */
    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    /**
     * Get Trigger time period
Note: This field may return null, indicating that no valid value is found. 
     * @return MaximumExecutionFrequency Trigger time period
Note: This field may return null, indicating that no valid value is found.
     */
    public String getMaximumExecutionFrequency() {
        return this.MaximumExecutionFrequency;
    }

    /**
     * Set Trigger time period
Note: This field may return null, indicating that no valid value is found.
     * @param MaximumExecutionFrequency Trigger time period
Note: This field may return null, indicating that no valid value is found.
     */
    public void setMaximumExecutionFrequency(String MaximumExecutionFrequency) {
        this.MaximumExecutionFrequency = MaximumExecutionFrequency;
    }

    public TriggerType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerType(TriggerType source) {
        if (source.MessageType != null) {
            this.MessageType = new String(source.MessageType);
        }
        if (source.MaximumExecutionFrequency != null) {
            this.MaximumExecutionFrequency = new String(source.MaximumExecutionFrequency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);
        this.setParamSimple(map, prefix + "MaximumExecutionFrequency", this.MaximumExecutionFrequency);

    }
}

