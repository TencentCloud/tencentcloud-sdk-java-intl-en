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

public class VideoDenoiseInfo extends AbstractModel {

    /**
    * Video noise reduction control switch. Available values:
<li>ON: turn on video noise reduction</li>
<li>OFF: Turn off video noise reduction.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Video noise reduction type. It is valid only when the video noise reduction control switch is ON. Available values:
<li>weak: light video noise reduction;</li>
<li>strong: strong video noise reduction.</li>
Default value: weak.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Video noise reduction control switch. Available values:
<li>ON: turn on video noise reduction</li>
<li>OFF: Turn off video noise reduction.</li> 
     * @return Switch Video noise reduction control switch. Available values:
<li>ON: turn on video noise reduction</li>
<li>OFF: Turn off video noise reduction.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Video noise reduction control switch. Available values:
<li>ON: turn on video noise reduction</li>
<li>OFF: Turn off video noise reduction.</li>
     * @param Switch Video noise reduction control switch. Available values:
<li>ON: turn on video noise reduction</li>
<li>OFF: Turn off video noise reduction.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Video noise reduction type. It is valid only when the video noise reduction control switch is ON. Available values:
<li>weak: light video noise reduction;</li>
<li>strong: strong video noise reduction.</li>
Default value: weak. 
     * @return Type Video noise reduction type. It is valid only when the video noise reduction control switch is ON. Available values:
<li>weak: light video noise reduction;</li>
<li>strong: strong video noise reduction.</li>
Default value: weak.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Video noise reduction type. It is valid only when the video noise reduction control switch is ON. Available values:
<li>weak: light video noise reduction;</li>
<li>strong: strong video noise reduction.</li>
Default value: weak.
     * @param Type Video noise reduction type. It is valid only when the video noise reduction control switch is ON. Available values:
<li>weak: light video noise reduction;</li>
<li>strong: strong video noise reduction.</li>
Default value: weak.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public VideoDenoiseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDenoiseInfo(VideoDenoiseInfo source) {
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

