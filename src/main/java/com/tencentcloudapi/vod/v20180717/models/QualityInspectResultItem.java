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

public class QualityInspectResultItem extends AbstractModel {

    /**
    * <p>Exception type. Valid values:</p><li>Jitter: jitter</li><li>Blur: blur</li><li>LowLighting: low illumination</li><li>HighLighting: overexposure</li><li>CrashScreen: screen glitch</li><li>BlackWhiteEdge: black and white edges</li><li>SolidColorScreen: solid color screen</li><li>Noise: noise</li><li>Mosaic: mosaic</li><li>QRCode: QR code</li><li>AppletCode: mini program code</li><li>BarCode: barcode</li><li>LowVoice: bass</li><li>HighVoice: audio burst</li><li>NoVoice: mute</li><li>LowEvaluation: no reference scoring below threshold</li><li>LowColorfulness: color richness info</li><li>AudioVideoAsync: audio and video synchronization issues</li><li>AudioSubtitleAsync: audio and subtitle out of sync</li><li>VideoAesthetic: low video aesthetic score</li><li>AudioDiscontinuity: discontinuous audio</li><li>AudioVolume: volume information</li><li>AudioLoudnessJitter: severe volume change</li><li>BackgroundMusic: background music exists</li><li>AudioEvaluation: poor bass quality</li><li>AudioNoise: noise</li><li>AudioSpeechQuality: low speech definition</li><li>AudioReverb: high reverberation level</li><li>AudioHighLoudness: loudness distortion</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Abnormal fragment list.<br><font color="red">Note:</font> This list only shows up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.</p>
    */
    @SerializedName("SegmentSet")
    @Expose
    private QualityInspectItem [] SegmentSet;

    /**
    * <p>URL of the exception segment list file. The file content is in JSON, and its data structure is consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)</p>
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * <p>Expiration time of the URL of the abnormal Segment List File, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get <p>Exception type. Valid values:</p><li>Jitter: jitter</li><li>Blur: blur</li><li>LowLighting: low illumination</li><li>HighLighting: overexposure</li><li>CrashScreen: screen glitch</li><li>BlackWhiteEdge: black and white edges</li><li>SolidColorScreen: solid color screen</li><li>Noise: noise</li><li>Mosaic: mosaic</li><li>QRCode: QR code</li><li>AppletCode: mini program code</li><li>BarCode: barcode</li><li>LowVoice: bass</li><li>HighVoice: audio burst</li><li>NoVoice: mute</li><li>LowEvaluation: no reference scoring below threshold</li><li>LowColorfulness: color richness info</li><li>AudioVideoAsync: audio and video synchronization issues</li><li>AudioSubtitleAsync: audio and subtitle out of sync</li><li>VideoAesthetic: low video aesthetic score</li><li>AudioDiscontinuity: discontinuous audio</li><li>AudioVolume: volume information</li><li>AudioLoudnessJitter: severe volume change</li><li>BackgroundMusic: background music exists</li><li>AudioEvaluation: poor bass quality</li><li>AudioNoise: noise</li><li>AudioSpeechQuality: low speech definition</li><li>AudioReverb: high reverberation level</li><li>AudioHighLoudness: loudness distortion</li> 
     * @return Type <p>Exception type. Valid values:</p><li>Jitter: jitter</li><li>Blur: blur</li><li>LowLighting: low illumination</li><li>HighLighting: overexposure</li><li>CrashScreen: screen glitch</li><li>BlackWhiteEdge: black and white edges</li><li>SolidColorScreen: solid color screen</li><li>Noise: noise</li><li>Mosaic: mosaic</li><li>QRCode: QR code</li><li>AppletCode: mini program code</li><li>BarCode: barcode</li><li>LowVoice: bass</li><li>HighVoice: audio burst</li><li>NoVoice: mute</li><li>LowEvaluation: no reference scoring below threshold</li><li>LowColorfulness: color richness info</li><li>AudioVideoAsync: audio and video synchronization issues</li><li>AudioSubtitleAsync: audio and subtitle out of sync</li><li>VideoAesthetic: low video aesthetic score</li><li>AudioDiscontinuity: discontinuous audio</li><li>AudioVolume: volume information</li><li>AudioLoudnessJitter: severe volume change</li><li>BackgroundMusic: background music exists</li><li>AudioEvaluation: poor bass quality</li><li>AudioNoise: noise</li><li>AudioSpeechQuality: low speech definition</li><li>AudioReverb: high reverberation level</li><li>AudioHighLoudness: loudness distortion</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Exception type. Valid values:</p><li>Jitter: jitter</li><li>Blur: blur</li><li>LowLighting: low illumination</li><li>HighLighting: overexposure</li><li>CrashScreen: screen glitch</li><li>BlackWhiteEdge: black and white edges</li><li>SolidColorScreen: solid color screen</li><li>Noise: noise</li><li>Mosaic: mosaic</li><li>QRCode: QR code</li><li>AppletCode: mini program code</li><li>BarCode: barcode</li><li>LowVoice: bass</li><li>HighVoice: audio burst</li><li>NoVoice: mute</li><li>LowEvaluation: no reference scoring below threshold</li><li>LowColorfulness: color richness info</li><li>AudioVideoAsync: audio and video synchronization issues</li><li>AudioSubtitleAsync: audio and subtitle out of sync</li><li>VideoAesthetic: low video aesthetic score</li><li>AudioDiscontinuity: discontinuous audio</li><li>AudioVolume: volume information</li><li>AudioLoudnessJitter: severe volume change</li><li>BackgroundMusic: background music exists</li><li>AudioEvaluation: poor bass quality</li><li>AudioNoise: noise</li><li>AudioSpeechQuality: low speech definition</li><li>AudioReverb: high reverberation level</li><li>AudioHighLoudness: loudness distortion</li>
     * @param Type <p>Exception type. Valid values:</p><li>Jitter: jitter</li><li>Blur: blur</li><li>LowLighting: low illumination</li><li>HighLighting: overexposure</li><li>CrashScreen: screen glitch</li><li>BlackWhiteEdge: black and white edges</li><li>SolidColorScreen: solid color screen</li><li>Noise: noise</li><li>Mosaic: mosaic</li><li>QRCode: QR code</li><li>AppletCode: mini program code</li><li>BarCode: barcode</li><li>LowVoice: bass</li><li>HighVoice: audio burst</li><li>NoVoice: mute</li><li>LowEvaluation: no reference scoring below threshold</li><li>LowColorfulness: color richness info</li><li>AudioVideoAsync: audio and video synchronization issues</li><li>AudioSubtitleAsync: audio and subtitle out of sync</li><li>VideoAesthetic: low video aesthetic score</li><li>AudioDiscontinuity: discontinuous audio</li><li>AudioVolume: volume information</li><li>AudioLoudnessJitter: severe volume change</li><li>BackgroundMusic: background music exists</li><li>AudioEvaluation: poor bass quality</li><li>AudioNoise: noise</li><li>AudioSpeechQuality: low speech definition</li><li>AudioReverb: high reverberation level</li><li>AudioHighLoudness: loudness distortion</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Abnormal fragment list.<br><font color="red">Note:</font> This list only shows up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.</p> 
     * @return SegmentSet <p>Abnormal fragment list.<br><font color="red">Note:</font> This list only shows up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.</p>
     */
    public QualityInspectItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set <p>Abnormal fragment list.<br><font color="red">Note:</font> This list only shows up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.</p>
     * @param SegmentSet <p>Abnormal fragment list.<br><font color="red">Note:</font> This list only shows up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.</p>
     */
    public void setSegmentSet(QualityInspectItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get <p>URL of the exception segment list file. The file content is in JSON, and its data structure is consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)</p> 
     * @return SegmentSetFileUrl <p>URL of the exception segment list file. The file content is in JSON, and its data structure is consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)</p>
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set <p>URL of the exception segment list file. The file content is in JSON, and its data structure is consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)</p>
     * @param SegmentSetFileUrl <p>URL of the exception segment list file. The file content is in JSON, and its data structure is consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)</p>
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get <p>Expiration time of the URL of the abnormal Segment List File, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return SegmentSetFileUrlExpireTime <p>Expiration time of the URL of the abnormal Segment List File, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set <p>Expiration time of the URL of the abnormal Segment List File, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param SegmentSetFileUrlExpireTime <p>Expiration time of the URL of the abnormal Segment List File, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public QualityInspectResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectResultItem(QualityInspectResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new QualityInspectItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new QualityInspectItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);

    }
}

