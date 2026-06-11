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

public class MediaTranscodeItem extends AbstractModel {

    /**
    * <p>File URL of the transcoded video.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Transcoding specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1">transcoding parameter template</a>.<br><font color="red">Note: A value of 0 means the raw file.</font></p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Sum of the mean bitrate of a stream and the mean audio stream bit rate, unit: bps.</p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>Maximum value of video stream height. Unit: px.</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>Maximum value of video stream width. Unit: px.</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>Total size of media files, measurement unit: byte.</p><li>When the media file is HLS, the size is the sum of m3u8 and ts file sizes.</li>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>Video duration, in seconds.</p>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>md5 value of the video.</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>Container type, such as m4a, mp4.</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>Video stream information.</p>
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private MediaVideoStreamItem [] VideoStreamSet;

    /**
    * <p>Audio stream information.</p>
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private MediaAudioStreamItem [] AudioStreamSet;

    /**
    * <p>Digital watermark type. Available values:</p><li>Trace means transit watermark processing;</li><li>CopyRight means copyright watermark processing;</li><li>None means no digital watermark processing.</li>
    */
    @SerializedName("DigitalWatermarkType")
    @Expose
    private String DigitalWatermarkType;

    /**
    * <p>Copyright information.</p>
    */
    @SerializedName("CopyRightWatermarkText")
    @Expose
    private String CopyRightWatermarkText;

    /**
    * <p>Digital watermark template id.</p>
    */
    @SerializedName("BlindWatermarkDefinition")
    @Expose
    private Long BlindWatermarkDefinition;

    /**
    * <p>Generated new FileId for transcoding. Valid when requesting to enable independence media output.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get <p>File URL of the transcoded video.</p> 
     * @return Url <p>File URL of the transcoded video.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>File URL of the transcoded video.</p>
     * @param Url <p>File URL of the transcoded video.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Transcoding specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1">transcoding parameter template</a>.<br><font color="red">Note: A value of 0 means the raw file.</font></p> 
     * @return Definition <p>Transcoding specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1">transcoding parameter template</a>.<br><font color="red">Note: A value of 0 means the raw file.</font></p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Transcoding specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1">transcoding parameter template</a>.<br><font color="red">Note: A value of 0 means the raw file.</font></p>
     * @param Definition <p>Transcoding specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1">transcoding parameter template</a>.<br><font color="red">Note: A value of 0 means the raw file.</font></p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Sum of the mean bitrate of a stream and the mean audio stream bit rate, unit: bps.</p> 
     * @return Bitrate <p>Sum of the mean bitrate of a stream and the mean audio stream bit rate, unit: bps.</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>Sum of the mean bitrate of a stream and the mean audio stream bit rate, unit: bps.</p>
     * @param Bitrate <p>Sum of the mean bitrate of a stream and the mean audio stream bit rate, unit: bps.</p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>Maximum value of video stream height. Unit: px.</p> 
     * @return Height <p>Maximum value of video stream height. Unit: px.</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>Maximum value of video stream height. Unit: px.</p>
     * @param Height <p>Maximum value of video stream height. Unit: px.</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>Maximum value of video stream width. Unit: px.</p> 
     * @return Width <p>Maximum value of video stream width. Unit: px.</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>Maximum value of video stream width. Unit: px.</p>
     * @param Width <p>Maximum value of video stream width. Unit: px.</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>Total size of media files, measurement unit: byte.</p><li>When the media file is HLS, the size is the sum of m3u8 and ts file sizes.</li> 
     * @return Size <p>Total size of media files, measurement unit: byte.</p><li>When the media file is HLS, the size is the sum of m3u8 and ts file sizes.</li>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>Total size of media files, measurement unit: byte.</p><li>When the media file is HLS, the size is the sum of m3u8 and ts file sizes.</li>
     * @param Size <p>Total size of media files, measurement unit: byte.</p><li>When the media file is HLS, the size is the sum of m3u8 and ts file sizes.</li>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>Video duration, in seconds.</p> 
     * @return Duration <p>Video duration, in seconds.</p>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Video duration, in seconds.</p>
     * @param Duration <p>Video duration, in seconds.</p>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>md5 value of the video.</p> 
     * @return Md5 <p>md5 value of the video.</p>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>md5 value of the video.</p>
     * @param Md5 <p>md5 value of the video.</p>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>Container type, such as m4a, mp4.</p> 
     * @return Container <p>Container type, such as m4a, mp4.</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>Container type, such as m4a, mp4.</p>
     * @param Container <p>Container type, such as m4a, mp4.</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>Video stream information.</p> 
     * @return VideoStreamSet <p>Video stream information.</p>
     */
    public MediaVideoStreamItem [] getVideoStreamSet() {
        return this.VideoStreamSet;
    }

    /**
     * Set <p>Video stream information.</p>
     * @param VideoStreamSet <p>Video stream information.</p>
     */
    public void setVideoStreamSet(MediaVideoStreamItem [] VideoStreamSet) {
        this.VideoStreamSet = VideoStreamSet;
    }

    /**
     * Get <p>Audio stream information.</p> 
     * @return AudioStreamSet <p>Audio stream information.</p>
     */
    public MediaAudioStreamItem [] getAudioStreamSet() {
        return this.AudioStreamSet;
    }

    /**
     * Set <p>Audio stream information.</p>
     * @param AudioStreamSet <p>Audio stream information.</p>
     */
    public void setAudioStreamSet(MediaAudioStreamItem [] AudioStreamSet) {
        this.AudioStreamSet = AudioStreamSet;
    }

    /**
     * Get <p>Digital watermark type. Available values:</p><li>Trace means transit watermark processing;</li><li>CopyRight means copyright watermark processing;</li><li>None means no digital watermark processing.</li> 
     * @return DigitalWatermarkType <p>Digital watermark type. Available values:</p><li>Trace means transit watermark processing;</li><li>CopyRight means copyright watermark processing;</li><li>None means no digital watermark processing.</li>
     */
    public String getDigitalWatermarkType() {
        return this.DigitalWatermarkType;
    }

    /**
     * Set <p>Digital watermark type. Available values:</p><li>Trace means transit watermark processing;</li><li>CopyRight means copyright watermark processing;</li><li>None means no digital watermark processing.</li>
     * @param DigitalWatermarkType <p>Digital watermark type. Available values:</p><li>Trace means transit watermark processing;</li><li>CopyRight means copyright watermark processing;</li><li>None means no digital watermark processing.</li>
     */
    public void setDigitalWatermarkType(String DigitalWatermarkType) {
        this.DigitalWatermarkType = DigitalWatermarkType;
    }

    /**
     * Get <p>Copyright information.</p> 
     * @return CopyRightWatermarkText <p>Copyright information.</p>
     */
    public String getCopyRightWatermarkText() {
        return this.CopyRightWatermarkText;
    }

    /**
     * Set <p>Copyright information.</p>
     * @param CopyRightWatermarkText <p>Copyright information.</p>
     */
    public void setCopyRightWatermarkText(String CopyRightWatermarkText) {
        this.CopyRightWatermarkText = CopyRightWatermarkText;
    }

    /**
     * Get <p>Digital watermark template id.</p> 
     * @return BlindWatermarkDefinition <p>Digital watermark template id.</p>
     */
    public Long getBlindWatermarkDefinition() {
        return this.BlindWatermarkDefinition;
    }

    /**
     * Set <p>Digital watermark template id.</p>
     * @param BlindWatermarkDefinition <p>Digital watermark template id.</p>
     */
    public void setBlindWatermarkDefinition(Long BlindWatermarkDefinition) {
        this.BlindWatermarkDefinition = BlindWatermarkDefinition;
    }

    /**
     * Get <p>Generated new FileId for transcoding. Valid when requesting to enable independence media output.</p> 
     * @return FileId <p>Generated new FileId for transcoding. Valid when requesting to enable independence media output.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Generated new FileId for transcoding. Valid when requesting to enable independence media output.</p>
     * @param FileId <p>Generated new FileId for transcoding. Valid when requesting to enable independence media output.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public MediaTranscodeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTranscodeItem(MediaTranscodeItem source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.VideoStreamSet != null) {
            this.VideoStreamSet = new MediaVideoStreamItem[source.VideoStreamSet.length];
            for (int i = 0; i < source.VideoStreamSet.length; i++) {
                this.VideoStreamSet[i] = new MediaVideoStreamItem(source.VideoStreamSet[i]);
            }
        }
        if (source.AudioStreamSet != null) {
            this.AudioStreamSet = new MediaAudioStreamItem[source.AudioStreamSet.length];
            for (int i = 0; i < source.AudioStreamSet.length; i++) {
                this.AudioStreamSet[i] = new MediaAudioStreamItem(source.AudioStreamSet[i]);
            }
        }
        if (source.DigitalWatermarkType != null) {
            this.DigitalWatermarkType = new String(source.DigitalWatermarkType);
        }
        if (source.CopyRightWatermarkText != null) {
            this.CopyRightWatermarkText = new String(source.CopyRightWatermarkText);
        }
        if (source.BlindWatermarkDefinition != null) {
            this.BlindWatermarkDefinition = new Long(source.BlindWatermarkDefinition);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamArrayObj(map, prefix + "VideoStreamSet.", this.VideoStreamSet);
        this.setParamArrayObj(map, prefix + "AudioStreamSet.", this.AudioStreamSet);
        this.setParamSimple(map, prefix + "DigitalWatermarkType", this.DigitalWatermarkType);
        this.setParamSimple(map, prefix + "CopyRightWatermarkText", this.CopyRightWatermarkText);
        this.setParamSimple(map, prefix + "BlindWatermarkDefinition", this.BlindWatermarkDefinition);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

