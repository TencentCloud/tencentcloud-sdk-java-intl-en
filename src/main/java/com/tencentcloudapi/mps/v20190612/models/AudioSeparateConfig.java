/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioSeparateConfig extends AbstractModel{

    /**
    * Whether to enable the feature. Valid values:
<li>`ON`</li>
<li>`OFF` </li>
Default value: `ON`.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The scenario. Valid values:
<li>`normal`: Separate voice and background audio.</li>
<li>`music`: Separate vocals and instrumentals.</li>
Default value: `normal`.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The output audio track. Valid values:
<li>`vocal`: Voice.</li>
<li>`background`: Output background audio if the scenario is `normal`, and output instrumentals if the scenario is `music`.</li>
Default value: `vocal`.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Track")
    @Expose
    private String Track;

    /**
     * Get Whether to enable the feature. Valid values:
<li>`ON`</li>
<li>`OFF` </li>
Default value: `ON`. 
     * @return Switch Whether to enable the feature. Valid values:
<li>`ON`</li>
<li>`OFF` </li>
Default value: `ON`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the feature. Valid values:
<li>`ON`</li>
<li>`OFF` </li>
Default value: `ON`.
     * @param Switch Whether to enable the feature. Valid values:
<li>`ON`</li>
<li>`OFF` </li>
Default value: `ON`.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The scenario. Valid values:
<li>`normal`: Separate voice and background audio.</li>
<li>`music`: Separate vocals and instrumentals.</li>
Default value: `normal`.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Type The scenario. Valid values:
<li>`normal`: Separate voice and background audio.</li>
<li>`music`: Separate vocals and instrumentals.</li>
Default value: `normal`.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The scenario. Valid values:
<li>`normal`: Separate voice and background audio.</li>
<li>`music`: Separate vocals and instrumentals.</li>
Default value: `normal`.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Type The scenario. Valid values:
<li>`normal`: Separate voice and background audio.</li>
<li>`music`: Separate vocals and instrumentals.</li>
Default value: `normal`.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The output audio track. Valid values:
<li>`vocal`: Voice.</li>
<li>`background`: Output background audio if the scenario is `normal`, and output instrumentals if the scenario is `music`.</li>
Default value: `vocal`.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Track The output audio track. Valid values:
<li>`vocal`: Voice.</li>
<li>`background`: Output background audio if the scenario is `normal`, and output instrumentals if the scenario is `music`.</li>
Default value: `vocal`.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getTrack() {
        return this.Track;
    }

    /**
     * Set The output audio track. Valid values:
<li>`vocal`: Voice.</li>
<li>`background`: Output background audio if the scenario is `normal`, and output instrumentals if the scenario is `music`.</li>
Default value: `vocal`.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Track The output audio track. Valid values:
<li>`vocal`: Voice.</li>
<li>`background`: Output background audio if the scenario is `normal`, and output instrumentals if the scenario is `music`.</li>
Default value: `vocal`.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTrack(String Track) {
        this.Track = Track;
    }

    public AudioSeparateConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioSeparateConfig(AudioSeparateConfig source) {
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

