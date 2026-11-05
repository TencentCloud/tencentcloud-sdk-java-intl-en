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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClawAgentChannelContextTimeoutConfig extends AbstractModel {

    /**
    * <p>Whether to enable channel context timeout clearing</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>Channel context timeout duration</p><p>Value range: [1, 99]</p>
    */
    @SerializedName("TimeoutHour")
    @Expose
    private Long TimeoutHour;

    /**
     * Get <p>Whether to enable channel context timeout clearing</p> 
     * @return Enabled <p>Whether to enable channel context timeout clearing</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to enable channel context timeout clearing</p>
     * @param Enabled <p>Whether to enable channel context timeout clearing</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Channel context timeout duration</p><p>Value range: [1, 99]</p> 
     * @return TimeoutHour <p>Channel context timeout duration</p><p>Value range: [1, 99]</p>
     */
    public Long getTimeoutHour() {
        return this.TimeoutHour;
    }

    /**
     * Set <p>Channel context timeout duration</p><p>Value range: [1, 99]</p>
     * @param TimeoutHour <p>Channel context timeout duration</p><p>Value range: [1, 99]</p>
     */
    public void setTimeoutHour(Long TimeoutHour) {
        this.TimeoutHour = TimeoutHour;
    }

    public ClawAgentChannelContextTimeoutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClawAgentChannelContextTimeoutConfig(ClawAgentChannelContextTimeoutConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.TimeoutHour != null) {
            this.TimeoutHour = new Long(source.TimeoutHour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "TimeoutHour", this.TimeoutHour);

    }
}

