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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetNotifyUrlRequest extends AbstractModel {

    /**
    * Alarm notification callback url
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * Alarm notification callback key
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * Alarm threshold of the data transfer plan
    */
    @SerializedName("AlarmValue")
    @Expose
    private Long AlarmValue;

    /**
     * Get Alarm notification callback url 
     * @return NotifyUrl Alarm notification callback url
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set Alarm notification callback url
     * @param NotifyUrl Alarm notification callback url
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get Alarm notification callback key 
     * @return CallbackKey Alarm notification callback key
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set Alarm notification callback key
     * @param CallbackKey Alarm notification callback key
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Get Alarm threshold of the data transfer plan 
     * @return AlarmValue Alarm threshold of the data transfer plan
     */
    public Long getAlarmValue() {
        return this.AlarmValue;
    }

    /**
     * Set Alarm threshold of the data transfer plan
     * @param AlarmValue Alarm threshold of the data transfer plan
     */
    public void setAlarmValue(Long AlarmValue) {
        this.AlarmValue = AlarmValue;
    }

    public SetNotifyUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetNotifyUrlRequest(SetNotifyUrlRequest source) {
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
        if (source.AlarmValue != null) {
            this.AlarmValue = new Long(source.AlarmValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "AlarmValue", this.AlarmValue);

    }
}

