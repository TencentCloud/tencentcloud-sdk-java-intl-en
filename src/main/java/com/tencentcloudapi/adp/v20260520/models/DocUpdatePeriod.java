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

public class DocUpdatePeriod extends AbstractModel {

    /**
    * <p>Whether periodic update is enabled</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>Update interval (hr)</p>
    */
    @SerializedName("PeriodHour")
    @Expose
    private Long PeriodHour;

    /**
     * Get <p>Whether periodic update is enabled</p> 
     * @return Enabled <p>Whether periodic update is enabled</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether periodic update is enabled</p>
     * @param Enabled <p>Whether periodic update is enabled</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Update interval (hr)</p> 
     * @return PeriodHour <p>Update interval (hr)</p>
     */
    public Long getPeriodHour() {
        return this.PeriodHour;
    }

    /**
     * Set <p>Update interval (hr)</p>
     * @param PeriodHour <p>Update interval (hr)</p>
     */
    public void setPeriodHour(Long PeriodHour) {
        this.PeriodHour = PeriodHour;
    }

    public DocUpdatePeriod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocUpdatePeriod(DocUpdatePeriod source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.PeriodHour != null) {
            this.PeriodHour = new Long(source.PeriodHour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "PeriodHour", this.PeriodHour);

    }
}

