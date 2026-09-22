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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoFrameInterpolationInfo extends AbstractModel {

    /**
    * Intelligent frame interpolation control switch. Valid values:
<li>ON: enable intelligent frame interpolation</li>
<li>OFF: Disable intelligent frame interpolation.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Intelligent frame interpolation frame rate. Value range: (0, 100]. Valid only when the intelligent frame interpolation control switch is ON. Default: match the source file frame rate.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get Intelligent frame interpolation control switch. Valid values:
<li>ON: enable intelligent frame interpolation</li>
<li>OFF: Disable intelligent frame interpolation.</li> 
     * @return Switch Intelligent frame interpolation control switch. Valid values:
<li>ON: enable intelligent frame interpolation</li>
<li>OFF: Disable intelligent frame interpolation.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Intelligent frame interpolation control switch. Valid values:
<li>ON: enable intelligent frame interpolation</li>
<li>OFF: Disable intelligent frame interpolation.</li>
     * @param Switch Intelligent frame interpolation control switch. Valid values:
<li>ON: enable intelligent frame interpolation</li>
<li>OFF: Disable intelligent frame interpolation.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Intelligent frame interpolation frame rate. Value range: (0, 100]. Valid only when the intelligent frame interpolation control switch is ON. Default: match the source file frame rate. 
     * @return Fps Intelligent frame interpolation frame rate. Value range: (0, 100]. Valid only when the intelligent frame interpolation control switch is ON. Default: match the source file frame rate.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Intelligent frame interpolation frame rate. Value range: (0, 100]. Valid only when the intelligent frame interpolation control switch is ON. Default: match the source file frame rate.
     * @param Fps Intelligent frame interpolation frame rate. Value range: (0, 100]. Valid only when the intelligent frame interpolation control switch is ON. Default: match the source file frame rate.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    public VideoFrameInterpolationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoFrameInterpolationInfo(VideoFrameInterpolationInfo source) {
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

