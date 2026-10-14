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

public class AIDubbingTaskOutput extends AbstractModel {

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
    * <p>File URL of the video after voice type cloning</p>
    */
    @SerializedName("VoiceClonedVideo")
    @Expose
    private String VoiceClonedVideo;

    /**
    * <p>File address of the voice type clone annotation</p>
    */
    @SerializedName("VoiceClonedMarkFile")
    @Expose
    private String VoiceClonedMarkFile;

    /**
    * <p>Video output path.</p>
    */
    @SerializedName("VideoPath")
    @Expose
    private String VideoPath;

    /**
    * <p>FileId of the subtitle file extracted from video.</p>
    */
    @SerializedName("OriginSubtitleFileId")
    @Expose
    private String OriginSubtitleFileId;

    /**
    * <p>FileId of a subtitle translation file extracted from a video.</p>
    */
    @SerializedName("TranslateSubtitleFileId")
    @Expose
    private String TranslateSubtitleFileId;

    /**
    * <p>Tag file path.</p>
    */
    @SerializedName("SpeakerPath")
    @Expose
    private String SpeakerPath;

    /**
    * <p>Fileid of the tag file.</p>
    */
    @SerializedName("SpeakerFileId")
    @Expose
    private String SpeakerFileId;

    /**
    * <p>FileId of the video output after removal.</p>
    */
    @SerializedName("EraseVideoFileId")
    @Expose
    private String EraseVideoFileId;

    /**
    * <p>Erase video output path.</p>
    */
    @SerializedName("EraseVideoPath")
    @Expose
    private String EraseVideoPath;

    /**
    * <p>Dubbed audio file path of the translation.</p>
    */
    @SerializedName("DstAudioPath")
    @Expose
    private String DstAudioPath;

    /**
    * <p>FileId of the audio file for the translated dubbing.</p>
    */
    @SerializedName("DstAudioFileId")
    @Expose
    private String DstAudioFileId;

    /**
    * <p>Voice cloning editing information</p><p>Editing information for secondary modifications of voice cloning</p>
    */
    @SerializedName("DubbingEditInfoUrl")
    @Expose
    private String DubbingEditInfoUrl;

    /**
    * <p>Subtitle position after removal. <strong>Note</strong>: only applicable to subtitle extraction when return of subtitle position is enabled.</p>
    */
    @SerializedName("SubtitlePos")
    @Expose
    private SubtitlePosition SubtitlePos;

    /**
    * <p>Storage location of the output file of the AI dubbing task.</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

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
     * Get <p>File URL of the video after voice type cloning</p> 
     * @return VoiceClonedVideo <p>File URL of the video after voice type cloning</p>
     */
    public String getVoiceClonedVideo() {
        return this.VoiceClonedVideo;
    }

    /**
     * Set <p>File URL of the video after voice type cloning</p>
     * @param VoiceClonedVideo <p>File URL of the video after voice type cloning</p>
     */
    public void setVoiceClonedVideo(String VoiceClonedVideo) {
        this.VoiceClonedVideo = VoiceClonedVideo;
    }

    /**
     * Get <p>File address of the voice type clone annotation</p> 
     * @return VoiceClonedMarkFile <p>File address of the voice type clone annotation</p>
     */
    public String getVoiceClonedMarkFile() {
        return this.VoiceClonedMarkFile;
    }

    /**
     * Set <p>File address of the voice type clone annotation</p>
     * @param VoiceClonedMarkFile <p>File address of the voice type clone annotation</p>
     */
    public void setVoiceClonedMarkFile(String VoiceClonedMarkFile) {
        this.VoiceClonedMarkFile = VoiceClonedMarkFile;
    }

    /**
     * Get <p>Video output path.</p> 
     * @return VideoPath <p>Video output path.</p>
     */
    public String getVideoPath() {
        return this.VideoPath;
    }

    /**
     * Set <p>Video output path.</p>
     * @param VideoPath <p>Video output path.</p>
     */
    public void setVideoPath(String VideoPath) {
        this.VideoPath = VideoPath;
    }

    /**
     * Get <p>FileId of the subtitle file extracted from video.</p> 
     * @return OriginSubtitleFileId <p>FileId of the subtitle file extracted from video.</p>
     */
    public String getOriginSubtitleFileId() {
        return this.OriginSubtitleFileId;
    }

    /**
     * Set <p>FileId of the subtitle file extracted from video.</p>
     * @param OriginSubtitleFileId <p>FileId of the subtitle file extracted from video.</p>
     */
    public void setOriginSubtitleFileId(String OriginSubtitleFileId) {
        this.OriginSubtitleFileId = OriginSubtitleFileId;
    }

    /**
     * Get <p>FileId of a subtitle translation file extracted from a video.</p> 
     * @return TranslateSubtitleFileId <p>FileId of a subtitle translation file extracted from a video.</p>
     */
    public String getTranslateSubtitleFileId() {
        return this.TranslateSubtitleFileId;
    }

    /**
     * Set <p>FileId of a subtitle translation file extracted from a video.</p>
     * @param TranslateSubtitleFileId <p>FileId of a subtitle translation file extracted from a video.</p>
     */
    public void setTranslateSubtitleFileId(String TranslateSubtitleFileId) {
        this.TranslateSubtitleFileId = TranslateSubtitleFileId;
    }

    /**
     * Get <p>Tag file path.</p> 
     * @return SpeakerPath <p>Tag file path.</p>
     */
    public String getSpeakerPath() {
        return this.SpeakerPath;
    }

    /**
     * Set <p>Tag file path.</p>
     * @param SpeakerPath <p>Tag file path.</p>
     */
    public void setSpeakerPath(String SpeakerPath) {
        this.SpeakerPath = SpeakerPath;
    }

    /**
     * Get <p>Fileid of the tag file.</p> 
     * @return SpeakerFileId <p>Fileid of the tag file.</p>
     */
    public String getSpeakerFileId() {
        return this.SpeakerFileId;
    }

    /**
     * Set <p>Fileid of the tag file.</p>
     * @param SpeakerFileId <p>Fileid of the tag file.</p>
     */
    public void setSpeakerFileId(String SpeakerFileId) {
        this.SpeakerFileId = SpeakerFileId;
    }

    /**
     * Get <p>FileId of the video output after removal.</p> 
     * @return EraseVideoFileId <p>FileId of the video output after removal.</p>
     */
    public String getEraseVideoFileId() {
        return this.EraseVideoFileId;
    }

    /**
     * Set <p>FileId of the video output after removal.</p>
     * @param EraseVideoFileId <p>FileId of the video output after removal.</p>
     */
    public void setEraseVideoFileId(String EraseVideoFileId) {
        this.EraseVideoFileId = EraseVideoFileId;
    }

    /**
     * Get <p>Erase video output path.</p> 
     * @return EraseVideoPath <p>Erase video output path.</p>
     */
    public String getEraseVideoPath() {
        return this.EraseVideoPath;
    }

    /**
     * Set <p>Erase video output path.</p>
     * @param EraseVideoPath <p>Erase video output path.</p>
     */
    public void setEraseVideoPath(String EraseVideoPath) {
        this.EraseVideoPath = EraseVideoPath;
    }

    /**
     * Get <p>Dubbed audio file path of the translation.</p> 
     * @return DstAudioPath <p>Dubbed audio file path of the translation.</p>
     */
    public String getDstAudioPath() {
        return this.DstAudioPath;
    }

    /**
     * Set <p>Dubbed audio file path of the translation.</p>
     * @param DstAudioPath <p>Dubbed audio file path of the translation.</p>
     */
    public void setDstAudioPath(String DstAudioPath) {
        this.DstAudioPath = DstAudioPath;
    }

    /**
     * Get <p>FileId of the audio file for the translated dubbing.</p> 
     * @return DstAudioFileId <p>FileId of the audio file for the translated dubbing.</p>
     */
    public String getDstAudioFileId() {
        return this.DstAudioFileId;
    }

    /**
     * Set <p>FileId of the audio file for the translated dubbing.</p>
     * @param DstAudioFileId <p>FileId of the audio file for the translated dubbing.</p>
     */
    public void setDstAudioFileId(String DstAudioFileId) {
        this.DstAudioFileId = DstAudioFileId;
    }

    /**
     * Get <p>Voice cloning editing information</p><p>Editing information for secondary modifications of voice cloning</p> 
     * @return DubbingEditInfoUrl <p>Voice cloning editing information</p><p>Editing information for secondary modifications of voice cloning</p>
     */
    public String getDubbingEditInfoUrl() {
        return this.DubbingEditInfoUrl;
    }

    /**
     * Set <p>Voice cloning editing information</p><p>Editing information for secondary modifications of voice cloning</p>
     * @param DubbingEditInfoUrl <p>Voice cloning editing information</p><p>Editing information for secondary modifications of voice cloning</p>
     */
    public void setDubbingEditInfoUrl(String DubbingEditInfoUrl) {
        this.DubbingEditInfoUrl = DubbingEditInfoUrl;
    }

    /**
     * Get <p>Subtitle position after removal. <strong>Note</strong>: only applicable to subtitle extraction when return of subtitle position is enabled.</p> 
     * @return SubtitlePos <p>Subtitle position after removal. <strong>Note</strong>: only applicable to subtitle extraction when return of subtitle position is enabled.</p>
     */
    public SubtitlePosition getSubtitlePos() {
        return this.SubtitlePos;
    }

    /**
     * Set <p>Subtitle position after removal. <strong>Note</strong>: only applicable to subtitle extraction when return of subtitle position is enabled.</p>
     * @param SubtitlePos <p>Subtitle position after removal. <strong>Note</strong>: only applicable to subtitle extraction when return of subtitle position is enabled.</p>
     */
    public void setSubtitlePos(SubtitlePosition SubtitlePos) {
        this.SubtitlePos = SubtitlePos;
    }

    /**
     * Get <p>Storage location of the output file of the AI dubbing task.</p> 
     * @return OutputStorage <p>Storage location of the output file of the AI dubbing task.</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>Storage location of the output file of the AI dubbing task.</p>
     * @param OutputStorage <p>Storage location of the output file of the AI dubbing task.</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public AIDubbingTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIDubbingTaskOutput(AIDubbingTaskOutput source) {
        if (source.OriginSubtitlePath != null) {
            this.OriginSubtitlePath = new String(source.OriginSubtitlePath);
        }
        if (source.TranslateSubtitlePath != null) {
            this.TranslateSubtitlePath = new String(source.TranslateSubtitlePath);
        }
        if (source.VoiceClonedVideo != null) {
            this.VoiceClonedVideo = new String(source.VoiceClonedVideo);
        }
        if (source.VoiceClonedMarkFile != null) {
            this.VoiceClonedMarkFile = new String(source.VoiceClonedMarkFile);
        }
        if (source.VideoPath != null) {
            this.VideoPath = new String(source.VideoPath);
        }
        if (source.OriginSubtitleFileId != null) {
            this.OriginSubtitleFileId = new String(source.OriginSubtitleFileId);
        }
        if (source.TranslateSubtitleFileId != null) {
            this.TranslateSubtitleFileId = new String(source.TranslateSubtitleFileId);
        }
        if (source.SpeakerPath != null) {
            this.SpeakerPath = new String(source.SpeakerPath);
        }
        if (source.SpeakerFileId != null) {
            this.SpeakerFileId = new String(source.SpeakerFileId);
        }
        if (source.EraseVideoFileId != null) {
            this.EraseVideoFileId = new String(source.EraseVideoFileId);
        }
        if (source.EraseVideoPath != null) {
            this.EraseVideoPath = new String(source.EraseVideoPath);
        }
        if (source.DstAudioPath != null) {
            this.DstAudioPath = new String(source.DstAudioPath);
        }
        if (source.DstAudioFileId != null) {
            this.DstAudioFileId = new String(source.DstAudioFileId);
        }
        if (source.DubbingEditInfoUrl != null) {
            this.DubbingEditInfoUrl = new String(source.DubbingEditInfoUrl);
        }
        if (source.SubtitlePos != null) {
            this.SubtitlePos = new SubtitlePosition(source.SubtitlePos);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginSubtitlePath", this.OriginSubtitlePath);
        this.setParamSimple(map, prefix + "TranslateSubtitlePath", this.TranslateSubtitlePath);
        this.setParamSimple(map, prefix + "VoiceClonedVideo", this.VoiceClonedVideo);
        this.setParamSimple(map, prefix + "VoiceClonedMarkFile", this.VoiceClonedMarkFile);
        this.setParamSimple(map, prefix + "VideoPath", this.VideoPath);
        this.setParamSimple(map, prefix + "OriginSubtitleFileId", this.OriginSubtitleFileId);
        this.setParamSimple(map, prefix + "TranslateSubtitleFileId", this.TranslateSubtitleFileId);
        this.setParamSimple(map, prefix + "SpeakerPath", this.SpeakerPath);
        this.setParamSimple(map, prefix + "SpeakerFileId", this.SpeakerFileId);
        this.setParamSimple(map, prefix + "EraseVideoFileId", this.EraseVideoFileId);
        this.setParamSimple(map, prefix + "EraseVideoPath", this.EraseVideoPath);
        this.setParamSimple(map, prefix + "DstAudioPath", this.DstAudioPath);
        this.setParamSimple(map, prefix + "DstAudioFileId", this.DstAudioFileId);
        this.setParamSimple(map, prefix + "DubbingEditInfoUrl", this.DubbingEditInfoUrl);
        this.setParamObj(map, prefix + "SubtitlePos.", this.SubtitlePos);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

