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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupStickySession extends AbstractModel {

    /**
    * Whether to enable session persistence. Off by default.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Timeout period in seconds. Value range: 1-86400. Default value: 1000.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get Whether to enable session persistence. Off by default. 
     * @return Enabled Whether to enable session persistence. Off by default.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable session persistence. Off by default.
     * @param Enabled Whether to enable session persistence. Off by default.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Timeout period in seconds. Value range: 1-86400. Default value: 1000. 
     * @return Timeout Timeout period in seconds. Value range: 1-86400. Default value: 1000.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout period in seconds. Value range: 1-86400. Default value: 1000.
     * @param Timeout Timeout period in seconds. Value range: 1-86400. Default value: 1000.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public TargetGroupStickySession() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupStickySession(TargetGroupStickySession source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

