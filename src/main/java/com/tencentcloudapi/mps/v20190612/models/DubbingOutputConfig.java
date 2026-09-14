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

public class DubbingOutputConfig extends AbstractModel {

    /**
    * <p>Output method</p><p>Enumeration values:</p><ul><li>FinalVideoOnly: default, final video only</li><li>AudioAndSubtitle: translation audio + translation subtitle</li><li>Custom: customization</li></ul><p>Default value: FinalVideoOnly</p><p>No translation audio and subtitle are returned when using external subtitles</p>
    */
    @SerializedName("OutputMode")
    @Expose
    private String OutputMode;

    /**
    * <p>Output video switch</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: ON</p><p>Only takes effect in Custom mode</p>
    */
    @SerializedName("OutputFinalVideo")
    @Expose
    private String OutputFinalVideo;

    /**
    * <p>Switch to output subtitle files (contains both original voice subtitles and target language subtitles)</p><p>Enumeration values:</p><ul><li>ON: enable</li><li>OFF: disable</li></ul><p>Default value: OFF</p>
    */
    @SerializedName("OutputSubtitle")
    @Expose
    private String OutputSubtitle;

    /**
    * <p>Audio switch for output translation dubbing</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p><p>Only takes effect in Custom mode</p>
    */
    @SerializedName("OutputDstAudio")
    @Expose
    private String OutputDstAudio;

    /**
    * <p>Subtitle suppression configuration message.</p>
    */
    @SerializedName("EmbedSubtitleConfig")
    @Expose
    private DubbingEmbedSubtitleConfig EmbedSubtitleConfig;

    /**
     * Get <p>Output method</p><p>Enumeration values:</p><ul><li>FinalVideoOnly: default, final video only</li><li>AudioAndSubtitle: translation audio + translation subtitle</li><li>Custom: customization</li></ul><p>Default value: FinalVideoOnly</p><p>No translation audio and subtitle are returned when using external subtitles</p> 
     * @return OutputMode <p>Output method</p><p>Enumeration values:</p><ul><li>FinalVideoOnly: default, final video only</li><li>AudioAndSubtitle: translation audio + translation subtitle</li><li>Custom: customization</li></ul><p>Default value: FinalVideoOnly</p><p>No translation audio and subtitle are returned when using external subtitles</p>
     */
    public String getOutputMode() {
        return this.OutputMode;
    }

    /**
     * Set <p>Output method</p><p>Enumeration values:</p><ul><li>FinalVideoOnly: default, final video only</li><li>AudioAndSubtitle: translation audio + translation subtitle</li><li>Custom: customization</li></ul><p>Default value: FinalVideoOnly</p><p>No translation audio and subtitle are returned when using external subtitles</p>
     * @param OutputMode <p>Output method</p><p>Enumeration values:</p><ul><li>FinalVideoOnly: default, final video only</li><li>AudioAndSubtitle: translation audio + translation subtitle</li><li>Custom: customization</li></ul><p>Default value: FinalVideoOnly</p><p>No translation audio and subtitle are returned when using external subtitles</p>
     */
    public void setOutputMode(String OutputMode) {
        this.OutputMode = OutputMode;
    }

    /**
     * Get <p>Output video switch</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: ON</p><p>Only takes effect in Custom mode</p> 
     * @return OutputFinalVideo <p>Output video switch</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: ON</p><p>Only takes effect in Custom mode</p>
     */
    public String getOutputFinalVideo() {
        return this.OutputFinalVideo;
    }

    /**
     * Set <p>Output video switch</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: ON</p><p>Only takes effect in Custom mode</p>
     * @param OutputFinalVideo <p>Output video switch</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: ON</p><p>Only takes effect in Custom mode</p>
     */
    public void setOutputFinalVideo(String OutputFinalVideo) {
        this.OutputFinalVideo = OutputFinalVideo;
    }

    /**
     * Get <p>Switch to output subtitle files (contains both original voice subtitles and target language subtitles)</p><p>Enumeration values:</p><ul><li>ON: enable</li><li>OFF: disable</li></ul><p>Default value: OFF</p> 
     * @return OutputSubtitle <p>Switch to output subtitle files (contains both original voice subtitles and target language subtitles)</p><p>Enumeration values:</p><ul><li>ON: enable</li><li>OFF: disable</li></ul><p>Default value: OFF</p>
     */
    public String getOutputSubtitle() {
        return this.OutputSubtitle;
    }

    /**
     * Set <p>Switch to output subtitle files (contains both original voice subtitles and target language subtitles)</p><p>Enumeration values:</p><ul><li>ON: enable</li><li>OFF: disable</li></ul><p>Default value: OFF</p>
     * @param OutputSubtitle <p>Switch to output subtitle files (contains both original voice subtitles and target language subtitles)</p><p>Enumeration values:</p><ul><li>ON: enable</li><li>OFF: disable</li></ul><p>Default value: OFF</p>
     */
    public void setOutputSubtitle(String OutputSubtitle) {
        this.OutputSubtitle = OutputSubtitle;
    }

    /**
     * Get <p>Audio switch for output translation dubbing</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p><p>Only takes effect in Custom mode</p> 
     * @return OutputDstAudio <p>Audio switch for output translation dubbing</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p><p>Only takes effect in Custom mode</p>
     */
    public String getOutputDstAudio() {
        return this.OutputDstAudio;
    }

    /**
     * Set <p>Audio switch for output translation dubbing</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p><p>Only takes effect in Custom mode</p>
     * @param OutputDstAudio <p>Audio switch for output translation dubbing</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p><p>Only takes effect in Custom mode</p>
     */
    public void setOutputDstAudio(String OutputDstAudio) {
        this.OutputDstAudio = OutputDstAudio;
    }

    /**
     * Get <p>Subtitle suppression configuration message.</p> 
     * @return EmbedSubtitleConfig <p>Subtitle suppression configuration message.</p>
     */
    public DubbingEmbedSubtitleConfig getEmbedSubtitleConfig() {
        return this.EmbedSubtitleConfig;
    }

    /**
     * Set <p>Subtitle suppression configuration message.</p>
     * @param EmbedSubtitleConfig <p>Subtitle suppression configuration message.</p>
     */
    public void setEmbedSubtitleConfig(DubbingEmbedSubtitleConfig EmbedSubtitleConfig) {
        this.EmbedSubtitleConfig = EmbedSubtitleConfig;
    }

    public DubbingOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DubbingOutputConfig(DubbingOutputConfig source) {
        if (source.OutputMode != null) {
            this.OutputMode = new String(source.OutputMode);
        }
        if (source.OutputFinalVideo != null) {
            this.OutputFinalVideo = new String(source.OutputFinalVideo);
        }
        if (source.OutputSubtitle != null) {
            this.OutputSubtitle = new String(source.OutputSubtitle);
        }
        if (source.OutputDstAudio != null) {
            this.OutputDstAudio = new String(source.OutputDstAudio);
        }
        if (source.EmbedSubtitleConfig != null) {
            this.EmbedSubtitleConfig = new DubbingEmbedSubtitleConfig(source.EmbedSubtitleConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputMode", this.OutputMode);
        this.setParamSimple(map, prefix + "OutputFinalVideo", this.OutputFinalVideo);
        this.setParamSimple(map, prefix + "OutputSubtitle", this.OutputSubtitle);
        this.setParamSimple(map, prefix + "OutputDstAudio", this.OutputDstAudio);
        this.setParamObj(map, prefix + "EmbedSubtitleConfig.", this.EmbedSubtitleConfig);

    }
}

