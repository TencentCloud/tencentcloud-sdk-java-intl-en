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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SLAPolicy extends AbstractModel {

    /**
    * SLA rules.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SLARules")
    @Expose
    private SLARule [] SLARules;

    /**
    * Alert notification channel.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AlertChannel")
    @Expose
    private AlertChannel AlertChannel;

    /**
     * Get SLA rules.

Note: This field may return null, indicating that no valid value is found. 
     * @return SLARules SLA rules.

Note: This field may return null, indicating that no valid value is found.
     */
    public SLARule [] getSLARules() {
        return this.SLARules;
    }

    /**
     * Set SLA rules.

Note: This field may return null, indicating that no valid value is found.
     * @param SLARules SLA rules.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSLARules(SLARule [] SLARules) {
        this.SLARules = SLARules;
    }

    /**
     * Get Alert notification channel.

Note: This field may return null, indicating that no valid value is found. 
     * @return AlertChannel Alert notification channel.

Note: This field may return null, indicating that no valid value is found.
     */
    public AlertChannel getAlertChannel() {
        return this.AlertChannel;
    }

    /**
     * Set Alert notification channel.

Note: This field may return null, indicating that no valid value is found.
     * @param AlertChannel Alert notification channel.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAlertChannel(AlertChannel AlertChannel) {
        this.AlertChannel = AlertChannel;
    }

    public SLAPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SLAPolicy(SLAPolicy source) {
        if (source.SLARules != null) {
            this.SLARules = new SLARule[source.SLARules.length];
            for (int i = 0; i < source.SLARules.length; i++) {
                this.SLARules[i] = new SLARule(source.SLARules[i]);
            }
        }
        if (source.AlertChannel != null) {
            this.AlertChannel = new AlertChannel(source.AlertChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SLARules.", this.SLARules);
        this.setParamObj(map, prefix + "AlertChannel.", this.AlertChannel);

    }
}

