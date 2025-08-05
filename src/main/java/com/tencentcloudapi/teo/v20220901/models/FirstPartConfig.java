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

public class FirstPartConfig extends AbstractModel {

    /**
    * Switch. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The statistical period of the first segment packet is in seconds. expect the duration to be 5 seconds by default.
    */
    @SerializedName("StatTime")
    @Expose
    private Long StatTime;

    /**
     * Get Switch. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li> 
     * @return Switch Switch. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
     * @param Switch Switch. valid values:.
<li>`on`: Enable;</li>

<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The statistical period of the first segment packet is in seconds. expect the duration to be 5 seconds by default. 
     * @return StatTime The statistical period of the first segment packet is in seconds. expect the duration to be 5 seconds by default.
     */
    public Long getStatTime() {
        return this.StatTime;
    }

    /**
     * Set The statistical period of the first segment packet is in seconds. expect the duration to be 5 seconds by default.
     * @param StatTime The statistical period of the first segment packet is in seconds. expect the duration to be 5 seconds by default.
     */
    public void setStatTime(Long StatTime) {
        this.StatTime = StatTime;
    }

    public FirstPartConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirstPartConfig(FirstPartConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.StatTime != null) {
            this.StatTime = new Long(source.StatTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "StatTime", this.StatTime);

    }
}

