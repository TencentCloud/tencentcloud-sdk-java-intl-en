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

public class HDRInfo extends AbstractModel {

    /**
    * Whether to enable HDR. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
Default value: `OFF`.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * High dynamic range type. Valid values:
<li>hdr10: means the hdr10 standard;</li>
<li>hlg: refers to the hlg standard.</li>

Note:
<li>Valid only when the high dynamic range type control switch is ON.</li>
<li>Valid when the video stream encoding format Codec of the video output parameter specified in the target parameter is libx264 or libx265.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Whether to enable HDR. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
Default value: `OFF`. 
     * @return Switch Whether to enable HDR. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
Default value: `OFF`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable HDR. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
Default value: `OFF`.
     * @param Switch Whether to enable HDR. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
Default value: `OFF`.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get High dynamic range type. Valid values:
<li>hdr10: means the hdr10 standard;</li>
<li>hlg: refers to the hlg standard.</li>

Note:
<li>Valid only when the high dynamic range type control switch is ON.</li>
<li>Valid when the video stream encoding format Codec of the video output parameter specified in the target parameter is libx264 or libx265.</li> 
     * @return Type High dynamic range type. Valid values:
<li>hdr10: means the hdr10 standard;</li>
<li>hlg: refers to the hlg standard.</li>

Note:
<li>Valid only when the high dynamic range type control switch is ON.</li>
<li>Valid when the video stream encoding format Codec of the video output parameter specified in the target parameter is libx264 or libx265.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set High dynamic range type. Valid values:
<li>hdr10: means the hdr10 standard;</li>
<li>hlg: refers to the hlg standard.</li>

Note:
<li>Valid only when the high dynamic range type control switch is ON.</li>
<li>Valid when the video stream encoding format Codec of the video output parameter specified in the target parameter is libx264 or libx265.</li>
     * @param Type High dynamic range type. Valid values:
<li>hdr10: means the hdr10 standard;</li>
<li>hlg: refers to the hlg standard.</li>

Note:
<li>Valid only when the high dynamic range type control switch is ON.</li>
<li>Valid when the video stream encoding format Codec of the video output parameter specified in the target parameter is libx264 or libx265.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public HDRInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HDRInfo(HDRInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

