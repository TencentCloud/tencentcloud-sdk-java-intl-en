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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostName extends AbstractModel {

    /**
    * Target HostName configuration. Valid values:
<li>follow: follow request;</li>
<li>custom: Custom.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * custom value of the target HostName. Maximum length: 1024.<br>Note: This field is required when Action is custom, and it is ineffective when Action is follow.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Target HostName configuration. Valid values:
<li>follow: follow request;</li>
<li>custom: Custom.</li> 
     * @return Action Target HostName configuration. Valid values:
<li>follow: follow request;</li>
<li>custom: Custom.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Target HostName configuration. Valid values:
<li>follow: follow request;</li>
<li>custom: Custom.</li>
     * @param Action Target HostName configuration. Valid values:
<li>follow: follow request;</li>
<li>custom: Custom.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get custom value of the target HostName. Maximum length: 1024.<br>Note: This field is required when Action is custom, and it is ineffective when Action is follow. 
     * @return Value custom value of the target HostName. Maximum length: 1024.<br>Note: This field is required when Action is custom, and it is ineffective when Action is follow.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set custom value of the target HostName. Maximum length: 1024.<br>Note: This field is required when Action is custom, and it is ineffective when Action is follow.
     * @param Value custom value of the target HostName. Maximum length: 1024.<br>Note: This field is required when Action is custom, and it is ineffective when Action is follow.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public HostName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostName(HostName source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

