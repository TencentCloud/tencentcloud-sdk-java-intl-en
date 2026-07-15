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
    * <p>Insertion method. Valid values:</p><li>subtitle-stream: Inserts a subtitle track.</li><li>close-caption-708: Encodes CEA-708 subtitles into SEI frames.</li><li>close-caption-608: Encodes CEA-608 subtitles into SEI frames.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Subtitle file.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Subtitle")
    @Expose
    private MediaInputInfo Subtitle;

    /**
    * <p>Subtitle name.<br>Note: Only Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and brackets are supported. The length cannot exceed 64 characters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
    * <p>Subtitle language, such as eng.</p>
    */
    @SerializedName("SubtitleLanguage")
    @Expose
    private String SubtitleLanguage;

    /**
    * <p>Subtitle output format. Valid values: {&quot;WebVTT&quot;,&quot;TTML&quot;}.<br>Default value: &quot;WebVTT&quot;.</p>
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * <p>Default subtitle track. When set to true, the current subtitle is designated as the default subtitle track. A maximum of 1 default subtitle track can be specified.<br>Default value: false.</p>
    */
    @SerializedName("DefaultTrack")
    @Expose
    private Boolean DefaultTrack;

    /**
     * Get <p>Insertion method. Valid values:</p><li>subtitle-stream: Inserts a subtitle track.</li><li>close-caption-708: Encodes CEA-708 subtitles into SEI frames.</li><li>close-caption-608: Encodes CEA-608 subtitles into SEI frames.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type <p>Insertion method. Valid values:</p><li>subtitle-stream: Inserts a subtitle track.</li><li>close-caption-708: Encodes CEA-708 subtitles into SEI frames.</li><li>close-caption-608: Encodes CEA-608 subtitles into SEI frames.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Insertion method. Valid values:</p><li>subtitle-stream: Inserts a subtitle track.</li><li>close-caption-708: Encodes CEA-708 subtitles into SEI frames.</li><li>close-caption-608: Encodes CEA-608 subtitles into SEI frames.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type <p>Insertion method. Valid values:</p><li>subtitle-stream: Inserts a subtitle track.</li><li>close-caption-708: Encodes CEA-708 subtitles into SEI frames.</li><li>close-caption-608: Encodes CEA-608 subtitles into SEI frames.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Subtitle file.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Subtitle <p>Subtitle file.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaInputInfo getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set <p>Subtitle file.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Subtitle <p>Subtitle file.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubtitle(MediaInputInfo Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     * Get <p>Subtitle name.<br>Note: Only Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and brackets are supported. The length cannot exceed 64 characters.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubtitleName <p>Subtitle name.<br>Note: Only Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and brackets are supported. The length cannot exceed 64 characters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set <p>Subtitle name.<br>Note: Only Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and brackets are supported. The length cannot exceed 64 characters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubtitleName <p>Subtitle name.<br>Note: Only Chinese characters, letters, digits, spaces, underscores (_), hyphens (-), periods (.), and brackets are supported. The length cannot exceed 64 characters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    /**
     * Get <p>Subtitle language, such as eng.</p> 
     * @return SubtitleLanguage <p>Subtitle language, such as eng.</p>
     */
    public String getSubtitleLanguage() {
        return this.SubtitleLanguage;
    }

    /**
     * Set <p>Subtitle language, such as eng.</p>
     * @param SubtitleLanguage <p>Subtitle language, such as eng.</p>
     */
    public void setSubtitleLanguage(String SubtitleLanguage) {
        this.SubtitleLanguage = SubtitleLanguage;
    }

    /**
     * Get <p>Subtitle output format. Valid values: {&quot;WebVTT&quot;,&quot;TTML&quot;}.<br>Default value: &quot;WebVTT&quot;.</p> 
     * @return OutputFormat <p>Subtitle output format. Valid values: {&quot;WebVTT&quot;,&quot;TTML&quot;}.<br>Default value: &quot;WebVTT&quot;.</p>
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set <p>Subtitle output format. Valid values: {&quot;WebVTT&quot;,&quot;TTML&quot;}.<br>Default value: &quot;WebVTT&quot;.</p>
     * @param OutputFormat <p>Subtitle output format. Valid values: {&quot;WebVTT&quot;,&quot;TTML&quot;}.<br>Default value: &quot;WebVTT&quot;.</p>
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get <p>Default subtitle track. When set to true, the current subtitle is designated as the default subtitle track. A maximum of 1 default subtitle track can be specified.<br>Default value: false.</p> 
     * @return DefaultTrack <p>Default subtitle track. When set to true, the current subtitle is designated as the default subtitle track. A maximum of 1 default subtitle track can be specified.<br>Default value: false.</p>
     */
    public Boolean getDefaultTrack() {
        return this.DefaultTrack;
    }

    /**
     * Set <p>Default subtitle track. When set to true, the current subtitle is designated as the default subtitle track. A maximum of 1 default subtitle track can be specified.<br>Default value: false.</p>
     * @param DefaultTrack <p>Default subtitle track. When set to true, the current subtitle is designated as the default subtitle track. A maximum of 1 default subtitle track can be specified.<br>Default value: false.</p>
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
        if (source.SubtitleLanguage != null) {
            this.SubtitleLanguage = new String(source.SubtitleLanguage);
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
        this.setParamSimple(map, prefix + "SubtitleLanguage", this.SubtitleLanguage);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "DefaultTrack", this.DefaultTrack);

    }
}

