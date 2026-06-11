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

public class OpenClawServiceRequest extends AbstractModel {

    /**
    * <p>Tag type</p><p>Enumeration value:</p><ul><li>OpenClaw: OpenClaw type</li><li>ClawPro: ClawPro type</li></ul>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>Whether to create a trace topic, default to false</p><p>Enumeration value:</p><ul><li>true: Creates a trace topic</li><li>false: Does not create a trace topic</li></ul>
    */
    @SerializedName("EnableTrace")
    @Expose
    private Boolean EnableTrace;

    /**
     * Get <p>Tag type</p><p>Enumeration value:</p><ul><li>OpenClaw: OpenClaw type</li><li>ClawPro: ClawPro type</li></ul> 
     * @return Tag <p>Tag type</p><p>Enumeration value:</p><ul><li>OpenClaw: OpenClaw type</li><li>ClawPro: ClawPro type</li></ul>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>Tag type</p><p>Enumeration value:</p><ul><li>OpenClaw: OpenClaw type</li><li>ClawPro: ClawPro type</li></ul>
     * @param Tag <p>Tag type</p><p>Enumeration value:</p><ul><li>OpenClaw: OpenClaw type</li><li>ClawPro: ClawPro type</li></ul>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>Whether to create a trace topic, default to false</p><p>Enumeration value:</p><ul><li>true: Creates a trace topic</li><li>false: Does not create a trace topic</li></ul> 
     * @return EnableTrace <p>Whether to create a trace topic, default to false</p><p>Enumeration value:</p><ul><li>true: Creates a trace topic</li><li>false: Does not create a trace topic</li></ul>
     */
    public Boolean getEnableTrace() {
        return this.EnableTrace;
    }

    /**
     * Set <p>Whether to create a trace topic, default to false</p><p>Enumeration value:</p><ul><li>true: Creates a trace topic</li><li>false: Does not create a trace topic</li></ul>
     * @param EnableTrace <p>Whether to create a trace topic, default to false</p><p>Enumeration value:</p><ul><li>true: Creates a trace topic</li><li>false: Does not create a trace topic</li></ul>
     */
    public void setEnableTrace(Boolean EnableTrace) {
        this.EnableTrace = EnableTrace;
    }

    public OpenClawServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenClawServiceRequest(OpenClawServiceRequest source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.EnableTrace != null) {
            this.EnableTrace = new Boolean(source.EnableTrace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "EnableTrace", this.EnableTrace);

    }
}

