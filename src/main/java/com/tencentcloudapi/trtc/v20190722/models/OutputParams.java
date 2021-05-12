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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputParams extends AbstractModel{

    /**
    * Custom live stream ID, which must be different from the ID of relayed stream.
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Value range: [0, 1]. If it is 0, live streams are audio and video; if it is 1, live streams are only audio. Default value: 0.
    */
    @SerializedName("PureAudioStream")
    @Expose
    private Long PureAudioStream;

    /**
    * Prefix of custom recording file names. Please enable the recording feature in the TRTC console first. https://intl.cloud.tencent.com/document/product/647/50768?from_cn_redirect=1
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Whether to record audio only. Valid values: 0, 1. `0`: no meaning; `1`: records into MP3 files. This parameter is not recommended. Instead, you are advised to create an audio-only recording template in the TRTC console.
    */
    @SerializedName("RecordAudioOnly")
    @Expose
    private Long RecordAudioOnly;

    /**
     * Get Custom live stream ID, which must be different from the ID of relayed stream. 
     * @return StreamId Custom live stream ID, which must be different from the ID of relayed stream.
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Custom live stream ID, which must be different from the ID of relayed stream.
     * @param StreamId Custom live stream ID, which must be different from the ID of relayed stream.
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Value range: [0, 1]. If it is 0, live streams are audio and video; if it is 1, live streams are only audio. Default value: 0. 
     * @return PureAudioStream Value range: [0, 1]. If it is 0, live streams are audio and video; if it is 1, live streams are only audio. Default value: 0.
     */
    public Long getPureAudioStream() {
        return this.PureAudioStream;
    }

    /**
     * Set Value range: [0, 1]. If it is 0, live streams are audio and video; if it is 1, live streams are only audio. Default value: 0.
     * @param PureAudioStream Value range: [0, 1]. If it is 0, live streams are audio and video; if it is 1, live streams are only audio. Default value: 0.
     */
    public void setPureAudioStream(Long PureAudioStream) {
        this.PureAudioStream = PureAudioStream;
    }

    /**
     * Get Prefix of custom recording file names. Please enable the recording feature in the TRTC console first. https://intl.cloud.tencent.com/document/product/647/50768?from_cn_redirect=1 
     * @return RecordId Prefix of custom recording file names. Please enable the recording feature in the TRTC console first. https://intl.cloud.tencent.com/document/product/647/50768?from_cn_redirect=1
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Prefix of custom recording file names. Please enable the recording feature in the TRTC console first. https://intl.cloud.tencent.com/document/product/647/50768?from_cn_redirect=1
     * @param RecordId Prefix of custom recording file names. Please enable the recording feature in the TRTC console first. https://intl.cloud.tencent.com/document/product/647/50768?from_cn_redirect=1
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Whether to record audio only. Valid values: 0, 1. `0`: no meaning; `1`: records into MP3 files. This parameter is not recommended. Instead, you are advised to create an audio-only recording template in the TRTC console. 
     * @return RecordAudioOnly Whether to record audio only. Valid values: 0, 1. `0`: no meaning; `1`: records into MP3 files. This parameter is not recommended. Instead, you are advised to create an audio-only recording template in the TRTC console.
     */
    public Long getRecordAudioOnly() {
        return this.RecordAudioOnly;
    }

    /**
     * Set Whether to record audio only. Valid values: 0, 1. `0`: no meaning; `1`: records into MP3 files. This parameter is not recommended. Instead, you are advised to create an audio-only recording template in the TRTC console.
     * @param RecordAudioOnly Whether to record audio only. Valid values: 0, 1. `0`: no meaning; `1`: records into MP3 files. This parameter is not recommended. Instead, you are advised to create an audio-only recording template in the TRTC console.
     */
    public void setRecordAudioOnly(Long RecordAudioOnly) {
        this.RecordAudioOnly = RecordAudioOnly;
    }

    public OutputParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputParams(OutputParams source) {
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.PureAudioStream != null) {
            this.PureAudioStream = new Long(source.PureAudioStream);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.RecordAudioOnly != null) {
            this.RecordAudioOnly = new Long(source.RecordAudioOnly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "PureAudioStream", this.PureAudioStream);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "RecordAudioOnly", this.RecordAudioOnly);

    }
}

