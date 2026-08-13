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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrameRateConfig extends AbstractModel {

    /**
    * Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Frame rate. Value ranges from 0 to 100. Measurement unit: Hz.
Default value: 0.
Note: For transcode, this parameter overrides the internal Fps in VideoTemplate.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON. 
     * @return Switch Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
     * @param Switch Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Frame rate. Value ranges from 0 to 100. Measurement unit: Hz.
Default value: 0.
Note: For transcode, this parameter overrides the internal Fps in VideoTemplate. 
     * @return Fps Frame rate. Value ranges from 0 to 100. Measurement unit: Hz.
Default value: 0.
Note: For transcode, this parameter overrides the internal Fps in VideoTemplate.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate. Value ranges from 0 to 100. Measurement unit: Hz.
Default value: 0.
Note: For transcode, this parameter overrides the internal Fps in VideoTemplate.
     * @param Fps Frame rate. Value ranges from 0 to 100. Measurement unit: Hz.
Default value: 0.
Note: For transcode, this parameter overrides the internal Fps in VideoTemplate.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    public FrameRateConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrameRateConfig(FrameRateConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

