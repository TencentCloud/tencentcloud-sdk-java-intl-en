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

public class AudioSeparateInfo extends AbstractModel {

    /**
    * Audio separation control switch. Available values:
<li>ON: enable audio separation;</li>
<li>OFF: Disable audio separation.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Scenario type. Valid values:
<li>normal: Voice background sound scenario</li>
<li>music: Singing accompaniment scenario</li>
Default value: normal.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Output audio track. Available values:
<li>vocal: output voice</li>
<li>Background: Output background audio when the scenario is normal, and output accompaniment when the scenario is music.</li>
Default value: vocal.
    */
    @SerializedName("Track")
    @Expose
    private String Track;

    /**
     * Get Audio separation control switch. Available values:
<li>ON: enable audio separation;</li>
<li>OFF: Disable audio separation.</li> 
     * @return Switch Audio separation control switch. Available values:
<li>ON: enable audio separation;</li>
<li>OFF: Disable audio separation.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Audio separation control switch. Available values:
<li>ON: enable audio separation;</li>
<li>OFF: Disable audio separation.</li>
     * @param Switch Audio separation control switch. Available values:
<li>ON: enable audio separation;</li>
<li>OFF: Disable audio separation.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Scenario type. Valid values:
<li>normal: Voice background sound scenario</li>
<li>music: Singing accompaniment scenario</li>
Default value: normal. 
     * @return Type Scenario type. Valid values:
<li>normal: Voice background sound scenario</li>
<li>music: Singing accompaniment scenario</li>
Default value: normal.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Scenario type. Valid values:
<li>normal: Voice background sound scenario</li>
<li>music: Singing accompaniment scenario</li>
Default value: normal.
     * @param Type Scenario type. Valid values:
<li>normal: Voice background sound scenario</li>
<li>music: Singing accompaniment scenario</li>
Default value: normal.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Output audio track. Available values:
<li>vocal: output voice</li>
<li>Background: Output background audio when the scenario is normal, and output accompaniment when the scenario is music.</li>
Default value: vocal. 
     * @return Track Output audio track. Available values:
<li>vocal: output voice</li>
<li>Background: Output background audio when the scenario is normal, and output accompaniment when the scenario is music.</li>
Default value: vocal.
     */
    public String getTrack() {
        return this.Track;
    }

    /**
     * Set Output audio track. Available values:
<li>vocal: output voice</li>
<li>Background: Output background audio when the scenario is normal, and output accompaniment when the scenario is music.</li>
Default value: vocal.
     * @param Track Output audio track. Available values:
<li>vocal: output voice</li>
<li>Background: Output background audio when the scenario is normal, and output accompaniment when the scenario is music.</li>
Default value: vocal.
     */
    public void setTrack(String Track) {
        this.Track = Track;
    }

    public AudioSeparateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioSeparateInfo(AudioSeparateInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Track != null) {
            this.Track = new String(source.Track);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Track", this.Track);

    }
}

