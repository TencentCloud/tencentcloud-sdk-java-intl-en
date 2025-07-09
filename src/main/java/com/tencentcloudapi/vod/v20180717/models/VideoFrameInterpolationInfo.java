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
    * Whether to enable smart frame interpolation. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The frame rate. Value range: (0, 100]. This parameter is valid only if `Switch` is `ON`. By default, the original frame rate will be used.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get Whether to enable smart frame interpolation. Valid values:
<li>`ON`</li>
<li>`OFF`</li> 
     * @return Switch Whether to enable smart frame interpolation. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable smart frame interpolation. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     * @param Switch Whether to enable smart frame interpolation. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The frame rate. Value range: (0, 100]. This parameter is valid only if `Switch` is `ON`. By default, the original frame rate will be used. 
     * @return Fps The frame rate. Value range: (0, 100]. This parameter is valid only if `Switch` is `ON`. By default, the original frame rate will be used.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set The frame rate. Value range: (0, 100]. This parameter is valid only if `Switch` is `ON`. By default, the original frame rate will be used.
     * @param Fps The frame rate. Value range: (0, 100]. This parameter is valid only if `Switch` is `ON`. By default, the original frame rate will be used.
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

