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

public class TaskNotifyConfig extends AbstractModel {

    /**
    * Notification type. Currently only supports URLs
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Callback URL. Starting with http/https, supporting a maximum of 512 characters
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
     * Get Notification type. Currently only supports URLs 
     * @return Type Notification type. Currently only supports URLs
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Notification type. Currently only supports URLs
     * @param Type Notification type. Currently only supports URLs
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Callback URL. Starting with http/https, supporting a maximum of 512 characters 
     * @return NotifyUrl Callback URL. Starting with http/https, supporting a maximum of 512 characters
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set Callback URL. Starting with http/https, supporting a maximum of 512 characters
     * @param NotifyUrl Callback URL. Starting with http/https, supporting a maximum of 512 characters
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    public TaskNotifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskNotifyConfig(TaskNotifyConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);

    }
}

