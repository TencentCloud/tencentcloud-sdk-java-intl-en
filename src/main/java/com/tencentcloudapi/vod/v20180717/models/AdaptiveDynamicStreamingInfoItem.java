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

public class AdaptiveDynamicStreamingInfoItem extends AbstractModel {

    /**
    * <p>Convert to adaptive bitrate streaming specification.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Packaging format. Value ranges from:</p><li>HLS;</li><li>DASH.</li>
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * <p>Encryption type.</p>
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * <p>Playback address.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Media file size, unit: byte.</p><li>When the media file is HLS, the size is the sum of m3u8 and ts file sizes.</li><li>When the media file is DASH, the size is the sum of mpd and fragment file sizes.</li><li><font color="red">Note</font>: This field is 0 for adaptive bitrate stream files generated through pre-processing before 2022-01-10T16:00:00Z.</li>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>Watermark type. Available values:</p><li>Trace means transit watermark processing;</li><li>CopyRight means copyright watermark processing;</li><li>None means no watermark processing.</li>
    */
    @SerializedName("DigitalWatermarkType")
    @Expose
    private String DigitalWatermarkType;

    /**
    * <p>Substream info list.</p>
    */
    @SerializedName("SubStreamSet")
    @Expose
    private MediaSubStreamInfoItem [] SubStreamSet;

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
    * <p>Subtitle information list.</p>
    */
    @SerializedName("SubtitleSet")
    @Expose
    private MediaSubtitleItem [] SubtitleSet;

    /**
    * <p>Unique identifier for default subtitle.</p>
    */
    @SerializedName("DefaultSubtitleId")
    @Expose
    private String DefaultSubtitleId;

    /**
    * <p>DRM encryption method.</p>
    */
    @SerializedName("DrmEncryptType")
    @Expose
    private String DrmEncryptType;

    /**
     * Get <p>Convert to adaptive bitrate streaming specification.</p> 
     * @return Definition <p>Convert to adaptive bitrate streaming specification.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Convert to adaptive bitrate streaming specification.</p>
     * @param Definition <p>Convert to adaptive bitrate streaming specification.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Packaging format. Value ranges from:</p><li>HLS;</li><li>DASH.</li> 
     * @return Package <p>Packaging format. Value ranges from:</p><li>HLS;</li><li>DASH.</li>
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set <p>Packaging format. Value ranges from:</p><li>HLS;</li><li>DASH.</li>
     * @param Package <p>Packaging format. Value ranges from:</p><li>HLS;</li><li>DASH.</li>
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get <p>Encryption type.</p> 
     * @return DrmType <p>Encryption type.</p>
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set <p>Encryption type.</p>
     * @param DrmType <p>Encryption type.</p>
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get <p>Playback address.</p> 
     * @return Url <p>Playback address.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Playback address.</p>
     * @param Url <p>Playback address.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Media file size, unit: byte.</p><li>When the media file is HLS, the size is the sum of m3u8 and ts file sizes.</li><li>When the media file is DASH, the size is the sum of mpd and fragment file sizes.</li><li><font color="red">Note</font>: This field is 0 for adaptive bitrate stream files generated through pre-processing before 2022-01-10T16:00:00Z.</li> 
     * @return Size <p>Media file size, unit: byte.</p><li>When the media file is HLS, the size is the sum of m3u8 and ts file sizes.</li><li>When the media file is DASH, the size is the sum of mpd and fragment file sizes.</li><li><font color="red">Note</font>: This field is 0 for adaptive bitrate stream files generated through pre-processing before 2022-01-10T16:00:00Z.</li>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>Media file size, unit: byte.</p><li>When the media file is HLS, the size is the sum of m3u8 and ts file sizes.</li><li>When the media file is DASH, the size is the sum of mpd and fragment file sizes.</li><li><font color="red">Note</font>: This field is 0 for adaptive bitrate stream files generated through pre-processing before 2022-01-10T16:00:00Z.</li>
     * @param Size <p>Media file size, unit: byte.</p><li>When the media file is HLS, the size is the sum of m3u8 and ts file sizes.</li><li>When the media file is DASH, the size is the sum of mpd and fragment file sizes.</li><li><font color="red">Note</font>: This field is 0 for adaptive bitrate stream files generated through pre-processing before 2022-01-10T16:00:00Z.</li>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>Watermark type. Available values:</p><li>Trace means transit watermark processing;</li><li>CopyRight means copyright watermark processing;</li><li>None means no watermark processing.</li> 
     * @return DigitalWatermarkType <p>Watermark type. Available values:</p><li>Trace means transit watermark processing;</li><li>CopyRight means copyright watermark processing;</li><li>None means no watermark processing.</li>
     */
    public String getDigitalWatermarkType() {
        return this.DigitalWatermarkType;
    }

    /**
     * Set <p>Watermark type. Available values:</p><li>Trace means transit watermark processing;</li><li>CopyRight means copyright watermark processing;</li><li>None means no watermark processing.</li>
     * @param DigitalWatermarkType <p>Watermark type. Available values:</p><li>Trace means transit watermark processing;</li><li>CopyRight means copyright watermark processing;</li><li>None means no watermark processing.</li>
     */
    public void setDigitalWatermarkType(String DigitalWatermarkType) {
        this.DigitalWatermarkType = DigitalWatermarkType;
    }

    /**
     * Get <p>Substream info list.</p> 
     * @return SubStreamSet <p>Substream info list.</p>
     */
    public MediaSubStreamInfoItem [] getSubStreamSet() {
        return this.SubStreamSet;
    }

    /**
     * Set <p>Substream info list.</p>
     * @param SubStreamSet <p>Substream info list.</p>
     */
    public void setSubStreamSet(MediaSubStreamInfoItem [] SubStreamSet) {
        this.SubStreamSet = SubStreamSet;
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
     * Get <p>Subtitle information list.</p> 
     * @return SubtitleSet <p>Subtitle information list.</p>
     */
    public MediaSubtitleItem [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set <p>Subtitle information list.</p>
     * @param SubtitleSet <p>Subtitle information list.</p>
     */
    public void setSubtitleSet(MediaSubtitleItem [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    /**
     * Get <p>Unique identifier for default subtitle.</p> 
     * @return DefaultSubtitleId <p>Unique identifier for default subtitle.</p>
     */
    public String getDefaultSubtitleId() {
        return this.DefaultSubtitleId;
    }

    /**
     * Set <p>Unique identifier for default subtitle.</p>
     * @param DefaultSubtitleId <p>Unique identifier for default subtitle.</p>
     */
    public void setDefaultSubtitleId(String DefaultSubtitleId) {
        this.DefaultSubtitleId = DefaultSubtitleId;
    }

    /**
     * Get <p>DRM encryption method.</p> 
     * @return DrmEncryptType <p>DRM encryption method.</p>
     */
    public String getDrmEncryptType() {
        return this.DrmEncryptType;
    }

    /**
     * Set <p>DRM encryption method.</p>
     * @param DrmEncryptType <p>DRM encryption method.</p>
     */
    public void setDrmEncryptType(String DrmEncryptType) {
        this.DrmEncryptType = DrmEncryptType;
    }

    public AdaptiveDynamicStreamingInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingInfoItem(AdaptiveDynamicStreamingInfoItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Package != null) {
            this.Package = new String(source.Package);
        }
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.DigitalWatermarkType != null) {
            this.DigitalWatermarkType = new String(source.DigitalWatermarkType);
        }
        if (source.SubStreamSet != null) {
            this.SubStreamSet = new MediaSubStreamInfoItem[source.SubStreamSet.length];
            for (int i = 0; i < source.SubStreamSet.length; i++) {
                this.SubStreamSet[i] = new MediaSubStreamInfoItem(source.SubStreamSet[i]);
            }
        }
        if (source.CopyRightWatermarkText != null) {
            this.CopyRightWatermarkText = new String(source.CopyRightWatermarkText);
        }
        if (source.BlindWatermarkDefinition != null) {
            this.BlindWatermarkDefinition = new Long(source.BlindWatermarkDefinition);
        }
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new MediaSubtitleItem[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new MediaSubtitleItem(source.SubtitleSet[i]);
            }
        }
        if (source.DefaultSubtitleId != null) {
            this.DefaultSubtitleId = new String(source.DefaultSubtitleId);
        }
        if (source.DrmEncryptType != null) {
            this.DrmEncryptType = new String(source.DrmEncryptType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "DigitalWatermarkType", this.DigitalWatermarkType);
        this.setParamArrayObj(map, prefix + "SubStreamSet.", this.SubStreamSet);
        this.setParamSimple(map, prefix + "CopyRightWatermarkText", this.CopyRightWatermarkText);
        this.setParamSimple(map, prefix + "BlindWatermarkDefinition", this.BlindWatermarkDefinition);
        this.setParamArrayObj(map, prefix + "SubtitleSet.", this.SubtitleSet);
        this.setParamSimple(map, prefix + "DefaultSubtitleId", this.DefaultSubtitleId);
        this.setParamSimple(map, prefix + "DrmEncryptType", this.DrmEncryptType);

    }
}

