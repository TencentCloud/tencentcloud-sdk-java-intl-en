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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerStrategyItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("InterfaceConfig")
    @Expose
    private HttpCallbackConfig InterfaceConfig;

    /**
    * 
    */
    @SerializedName("HangupTypes")
    @Expose
    private String [] HangupTypes;

    /**
    * 
    */
    @SerializedName("CallTags")
    @Expose
    private RetryTagItem [] CallTags;

    /**
    * 
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
     * Get  
     * @return InterfaceConfig 
     */
    public HttpCallbackConfig getInterfaceConfig() {
        return this.InterfaceConfig;
    }

    /**
     * Set 
     * @param InterfaceConfig 
     */
    public void setInterfaceConfig(HttpCallbackConfig InterfaceConfig) {
        this.InterfaceConfig = InterfaceConfig;
    }

    /**
     * Get  
     * @return HangupTypes 
     */
    public String [] getHangupTypes() {
        return this.HangupTypes;
    }

    /**
     * Set 
     * @param HangupTypes 
     */
    public void setHangupTypes(String [] HangupTypes) {
        this.HangupTypes = HangupTypes;
    }

    /**
     * Get  
     * @return CallTags 
     */
    public RetryTagItem [] getCallTags() {
        return this.CallTags;
    }

    /**
     * Set 
     * @param CallTags 
     */
    public void setCallTags(RetryTagItem [] CallTags) {
        this.CallTags = CallTags;
    }

    /**
     * Get  
     * @return TriggerMode 
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set 
     * @param TriggerMode 
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    public TriggerStrategyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerStrategyItem(TriggerStrategyItem source) {
        if (source.InterfaceConfig != null) {
            this.InterfaceConfig = new HttpCallbackConfig(source.InterfaceConfig);
        }
        if (source.HangupTypes != null) {
            this.HangupTypes = new String[source.HangupTypes.length];
            for (int i = 0; i < source.HangupTypes.length; i++) {
                this.HangupTypes[i] = new String(source.HangupTypes[i]);
            }
        }
        if (source.CallTags != null) {
            this.CallTags = new RetryTagItem[source.CallTags.length];
            for (int i = 0; i < source.CallTags.length; i++) {
                this.CallTags[i] = new RetryTagItem(source.CallTags[i]);
            }
        }
        if (source.TriggerMode != null) {
            this.TriggerMode = new String(source.TriggerMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InterfaceConfig.", this.InterfaceConfig);
        this.setParamArraySimple(map, prefix + "HangupTypes.", this.HangupTypes);
        this.setParamArrayObj(map, prefix + "CallTags.", this.CallTags);
        this.setParamSimple(map, prefix + "TriggerMode", this.TriggerMode);

    }
}

