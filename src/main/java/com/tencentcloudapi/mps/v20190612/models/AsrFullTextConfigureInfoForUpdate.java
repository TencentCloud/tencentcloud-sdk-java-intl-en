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

public class AsrFullTextConfigureInfoForUpdate extends AbstractModel{

    /**
    * Switch of a full speech recognition task. Valid values:
<li>ON: Enables an intelligent full speech recognition task;</li>
<li>OFF: Disables an intelligent full speech recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Format of the generated subtitles file. If an empty string is entered, no subtitles files will be generated. Valid value:
<li>vtt: Generates a WebVTT subtitles file.</li>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
     * Get Switch of a full speech recognition task. Valid values:
<li>ON: Enables an intelligent full speech recognition task;</li>
<li>OFF: Disables an intelligent full speech recognition task.</li> 
     * @return Switch Switch of a full speech recognition task. Valid values:
<li>ON: Enables an intelligent full speech recognition task;</li>
<li>OFF: Disables an intelligent full speech recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch of a full speech recognition task. Valid values:
<li>ON: Enables an intelligent full speech recognition task;</li>
<li>OFF: Disables an intelligent full speech recognition task.</li>
     * @param Switch Switch of a full speech recognition task. Valid values:
<li>ON: Enables an intelligent full speech recognition task;</li>
<li>OFF: Disables an intelligent full speech recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Format of the generated subtitles file. If an empty string is entered, no subtitles files will be generated. Valid value:
<li>vtt: Generates a WebVTT subtitles file.</li> 
     * @return SubtitleFormat Format of the generated subtitles file. If an empty string is entered, no subtitles files will be generated. Valid value:
<li>vtt: Generates a WebVTT subtitles file.</li>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Format of the generated subtitles file. If an empty string is entered, no subtitles files will be generated. Valid value:
<li>vtt: Generates a WebVTT subtitles file.</li>
     * @param SubtitleFormat Format of the generated subtitles file. If an empty string is entered, no subtitles files will be generated. Valid value:
<li>vtt: Generates a WebVTT subtitles file.</li>
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);

    }
}

