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
    * HDR type control switch. Available values:
<li>ON: enable high dynamic range type conversion;</li>
<li>OFF: Disable high dynamic range type switch.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * High dynamic range type. Valid values:
<li>hdr10: refers to the hdr10 standard;</li>
<li>hlg: refers to the hlg standard.</li>

Note:
<li> Valid only when the high dynamic range type control switch is ON;</li>
<li>Valid when the video stream encoding format Codec of the video output parameter is specified as libx264 or libx265 in the target parameter.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get HDR type control switch. Available values:
<li>ON: enable high dynamic range type conversion;</li>
<li>OFF: Disable high dynamic range type switch.</li> 
     * @return Switch HDR type control switch. Available values:
<li>ON: enable high dynamic range type conversion;</li>
<li>OFF: Disable high dynamic range type switch.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set HDR type control switch. Available values:
<li>ON: enable high dynamic range type conversion;</li>
<li>OFF: Disable high dynamic range type switch.</li>
     * @param Switch HDR type control switch. Available values:
<li>ON: enable high dynamic range type conversion;</li>
<li>OFF: Disable high dynamic range type switch.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get High dynamic range type. Valid values:
<li>hdr10: refers to the hdr10 standard;</li>
<li>hlg: refers to the hlg standard.</li>

Note:
<li> Valid only when the high dynamic range type control switch is ON;</li>
<li>Valid when the video stream encoding format Codec of the video output parameter is specified as libx264 or libx265 in the target parameter.</li> 
     * @return Type High dynamic range type. Valid values:
<li>hdr10: refers to the hdr10 standard;</li>
<li>hlg: refers to the hlg standard.</li>

Note:
<li> Valid only when the high dynamic range type control switch is ON;</li>
<li>Valid when the video stream encoding format Codec of the video output parameter is specified as libx264 or libx265 in the target parameter.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set High dynamic range type. Valid values:
<li>hdr10: refers to the hdr10 standard;</li>
<li>hlg: refers to the hlg standard.</li>

Note:
<li> Valid only when the high dynamic range type control switch is ON;</li>
<li>Valid when the video stream encoding format Codec of the video output parameter is specified as libx264 or libx265 in the target parameter.</li>
     * @param Type High dynamic range type. Valid values:
<li>hdr10: refers to the hdr10 standard;</li>
<li>hlg: refers to the hlg standard.</li>

Note:
<li> Valid only when the high dynamic range type control switch is ON;</li>
<li>Valid when the video stream encoding format Codec of the video output parameter is specified as libx264 or libx265 in the target parameter.</li>
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

