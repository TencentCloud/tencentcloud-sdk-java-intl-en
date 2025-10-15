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

public class AddOnSubtitle extends AbstractModel {

    /**
    * The mode. Valid values:
<li>`subtitle-stream`: Add a subtitle track.</li>
<li>`close-caption-708`: Embed CEA-708 subtitles in SEI frames.</li>
<li>`close-caption-608`: Embed CEA-608 subtitles in SEI frames.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The subtitle file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Subtitle")
    @Expose
    private MediaInputInfo Subtitle;

    /**
    * Subtitle name.
Note: supports Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and parentheses. Max 64 characters.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
    * Output format of the subtitle. valid values: "WebVTT", "TTML".
Default value: "WebVTT".
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * Default subtitle track. specifies the current subtitle as the default track when true. a maximum of 1 default subtitle track can be specified.
Default value: `false`.
    */
    @SerializedName("DefaultTrack")
    @Expose
    private Boolean DefaultTrack;

    /**
     * Get The mode. Valid values:
<li>`subtitle-stream`: Add a subtitle track.</li>
<li>`close-caption-708`: Embed CEA-708 subtitles in SEI frames.</li>
<li>`close-caption-608`: Embed CEA-608 subtitles in SEI frames.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type The mode. Valid values:
<li>`subtitle-stream`: Add a subtitle track.</li>
<li>`close-caption-708`: Embed CEA-708 subtitles in SEI frames.</li>
<li>`close-caption-608`: Embed CEA-608 subtitles in SEI frames.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The mode. Valid values:
<li>`subtitle-stream`: Add a subtitle track.</li>
<li>`close-caption-708`: Embed CEA-708 subtitles in SEI frames.</li>
<li>`close-caption-608`: Embed CEA-608 subtitles in SEI frames.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type The mode. Valid values:
<li>`subtitle-stream`: Add a subtitle track.</li>
<li>`close-caption-708`: Embed CEA-708 subtitles in SEI frames.</li>
<li>`close-caption-608`: Embed CEA-608 subtitles in SEI frames.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The subtitle file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Subtitle The subtitle file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaInputInfo getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set The subtitle file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Subtitle The subtitle file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubtitle(MediaInputInfo Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     * Get Subtitle name.
Note: supports Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and parentheses. Max 64 characters.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubtitleName Subtitle name.
Note: supports Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and parentheses. Max 64 characters.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set Subtitle name.
Note: supports Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and parentheses. Max 64 characters.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubtitleName Subtitle name.
Note: supports Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and parentheses. Max 64 characters.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    /**
     * Get Output format of the subtitle. valid values: "WebVTT", "TTML".
Default value: "WebVTT". 
     * @return OutputFormat Output format of the subtitle. valid values: "WebVTT", "TTML".
Default value: "WebVTT".
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set Output format of the subtitle. valid values: "WebVTT", "TTML".
Default value: "WebVTT".
     * @param OutputFormat Output format of the subtitle. valid values: "WebVTT", "TTML".
Default value: "WebVTT".
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get Default subtitle track. specifies the current subtitle as the default track when true. a maximum of 1 default subtitle track can be specified.
Default value: `false`. 
     * @return DefaultTrack Default subtitle track. specifies the current subtitle as the default track when true. a maximum of 1 default subtitle track can be specified.
Default value: `false`.
     */
    public Boolean getDefaultTrack() {
        return this.DefaultTrack;
    }

    /**
     * Set Default subtitle track. specifies the current subtitle as the default track when true. a maximum of 1 default subtitle track can be specified.
Default value: `false`.
     * @param DefaultTrack Default subtitle track. specifies the current subtitle as the default track when true. a maximum of 1 default subtitle track can be specified.
Default value: `false`.
     */
    public void setDefaultTrack(Boolean DefaultTrack) {
        this.DefaultTrack = DefaultTrack;
    }

    public AddOnSubtitle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOnSubtitle(AddOnSubtitle source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new MediaInputInfo(source.Subtitle);
        }
        if (source.SubtitleName != null) {
            this.SubtitleName = new String(source.SubtitleName);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.DefaultTrack != null) {
            this.DefaultTrack = new Boolean(source.DefaultTrack);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Subtitle.", this.Subtitle);
        this.setParamSimple(map, prefix + "SubtitleName", this.SubtitleName);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "DefaultTrack", this.DefaultTrack);

    }
}

