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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CachePrefresh extends AbstractModel {

    /**
    * Configuration switch
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cache prefresh percentage. Values: 1-99
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
     * Get Configuration switch 
     * @return Switch Configuration switch
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Configuration switch
     * @param Switch Configuration switch
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cache prefresh percentage. Values: 1-99
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Percent Cache prefresh percentage. Values: 1-99
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Cache prefresh percentage. Values: 1-99
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Percent Cache prefresh percentage. Values: 1-99
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    public CachePrefresh() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CachePrefresh(CachePrefresh source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

