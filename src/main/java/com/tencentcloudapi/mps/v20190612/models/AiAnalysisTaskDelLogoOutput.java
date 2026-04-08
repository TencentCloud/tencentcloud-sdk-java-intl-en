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

public class AiAnalysisTaskDelLogoOutput extends AbstractModel {

    /**
    * <p>Path of a file after removal.</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Storage location of a file after removal.</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>Path of subtitle file extracted from video.</p>
    */
    @SerializedName("OriginSubtitlePath")
    @Expose
    private String OriginSubtitlePath;

    /**
    * <p>Path of a subtitle translation file extracted from a video.</p>
    */
    @SerializedName("TranslateSubtitlePath")
    @Expose
    private String TranslateSubtitlePath;

    /**
    * <p>Subtitle position after removal. <strong>Note</strong>: only applicable to subtitle extraction when return of subtitle position is enabled.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubtitlePos")
    @Expose
    private SubtitlePosition SubtitlePos;

    /**
    * <p>File URL of the video after voice type cloning</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoiceClonedVideo")
    @Expose
    private String VoiceClonedVideo;

    /**
    * <p>File address of the voice type clone annotation</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoiceClonedMarkFile")
    @Expose
    private String VoiceClonedMarkFile;

    /**
     * Get <p>Path of a file after removal.</p> 
     * @return Path <p>Path of a file after removal.</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Path of a file after removal.</p>
     * @param Path <p>Path of a file after removal.</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Storage location of a file after removal.</p> 
     * @return OutputStorage <p>Storage location of a file after removal.</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>Storage location of a file after removal.</p>
     * @param OutputStorage <p>Storage location of a file after removal.</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>Path of subtitle file extracted from video.</p> 
     * @return OriginSubtitlePath <p>Path of subtitle file extracted from video.</p>
     */
    public String getOriginSubtitlePath() {
        return this.OriginSubtitlePath;
    }

    /**
     * Set <p>Path of subtitle file extracted from video.</p>
     * @param OriginSubtitlePath <p>Path of subtitle file extracted from video.</p>
     */
    public void setOriginSubtitlePath(String OriginSubtitlePath) {
        this.OriginSubtitlePath = OriginSubtitlePath;
    }

    /**
     * Get <p>Path of a subtitle translation file extracted from a video.</p> 
     * @return TranslateSubtitlePath <p>Path of a subtitle translation file extracted from a video.</p>
     */
    public String getTranslateSubtitlePath() {
        return this.TranslateSubtitlePath;
    }

    /**
     * Set <p>Path of a subtitle translation file extracted from a video.</p>
     * @param TranslateSubtitlePath <p>Path of a subtitle translation file extracted from a video.</p>
     */
    public void setTranslateSubtitlePath(String TranslateSubtitlePath) {
        this.TranslateSubtitlePath = TranslateSubtitlePath;
    }

    /**
     * Get <p>Subtitle position after removal. <strong>Note</strong>: only applicable to subtitle extraction when return of subtitle position is enabled.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubtitlePos <p>Subtitle position after removal. <strong>Note</strong>: only applicable to subtitle extraction when return of subtitle position is enabled.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SubtitlePosition getSubtitlePos() {
        return this.SubtitlePos;
    }

    /**
     * Set <p>Subtitle position after removal. <strong>Note</strong>: only applicable to subtitle extraction when return of subtitle position is enabled.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubtitlePos <p>Subtitle position after removal. <strong>Note</strong>: only applicable to subtitle extraction when return of subtitle position is enabled.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubtitlePos(SubtitlePosition SubtitlePos) {
        this.SubtitlePos = SubtitlePos;
    }

    /**
     * Get <p>File URL of the video after voice type cloning</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoiceClonedVideo <p>File URL of the video after voice type cloning</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVoiceClonedVideo() {
        return this.VoiceClonedVideo;
    }

    /**
     * Set <p>File URL of the video after voice type cloning</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoiceClonedVideo <p>File URL of the video after voice type cloning</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoiceClonedVideo(String VoiceClonedVideo) {
        this.VoiceClonedVideo = VoiceClonedVideo;
    }

    /**
     * Get <p>File address of the voice type clone annotation</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoiceClonedMarkFile <p>File address of the voice type clone annotation</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVoiceClonedMarkFile() {
        return this.VoiceClonedMarkFile;
    }

    /**
     * Set <p>File address of the voice type clone annotation</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoiceClonedMarkFile <p>File address of the voice type clone annotation</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoiceClonedMarkFile(String VoiceClonedMarkFile) {
        this.VoiceClonedMarkFile = VoiceClonedMarkFile;
    }

    public AiAnalysisTaskDelLogoOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskDelLogoOutput(AiAnalysisTaskDelLogoOutput source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OriginSubtitlePath != null) {
            this.OriginSubtitlePath = new String(source.OriginSubtitlePath);
        }
        if (source.TranslateSubtitlePath != null) {
            this.TranslateSubtitlePath = new String(source.TranslateSubtitlePath);
        }
        if (source.SubtitlePos != null) {
            this.SubtitlePos = new SubtitlePosition(source.SubtitlePos);
        }
        if (source.VoiceClonedVideo != null) {
            this.VoiceClonedVideo = new String(source.VoiceClonedVideo);
        }
        if (source.VoiceClonedMarkFile != null) {
            this.VoiceClonedMarkFile = new String(source.VoiceClonedMarkFile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OriginSubtitlePath", this.OriginSubtitlePath);
        this.setParamSimple(map, prefix + "TranslateSubtitlePath", this.TranslateSubtitlePath);
        this.setParamObj(map, prefix + "SubtitlePos.", this.SubtitlePos);
        this.setParamSimple(map, prefix + "VoiceClonedVideo", this.VoiceClonedVideo);
        this.setParamSimple(map, prefix + "VoiceClonedMarkFile", this.VoiceClonedMarkFile);

    }
}

