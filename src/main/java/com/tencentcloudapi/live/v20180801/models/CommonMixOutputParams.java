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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMixOutputParams extends AbstractModel{

    /**
    * Output stream name.
    */
    @SerializedName("OutputStreamName")
    @Expose
    private String OutputStreamName;

    /**
    * Output stream type. Valid values: [0,1].
If this parameter is left empty, 0 will be used by default.
If the output stream is a stream in the input stream list, enter 0.
If you want the stream mix result to be a new stream, enter 1.
If this value is 1, `output_stream_id` cannot appear in `input_stram_list`, and there cannot be a stream with the same ID on the LVB backend.
    */
    @SerializedName("OutputStreamType")
    @Expose
    private Long OutputStreamType;

    /**
    * The output bitrate. Value range: 1-10000.
If you do not specify this, the system will select a bitrate automatically.
    */
    @SerializedName("OutputStreamBitRate")
    @Expose
    private Long OutputStreamBitRate;

    /**
    * Output stream GOP size. Value range: [1,10].
If this parameter is left empty, the system will automatically determine.
    */
    @SerializedName("OutputStreamGop")
    @Expose
    private Long OutputStreamGop;

    /**
    * Output stream frame rate. Value range: [1,60].
If this parameter is left empty, the system will automatically determine.
    */
    @SerializedName("OutputStreamFrameRate")
    @Expose
    private Long OutputStreamFrameRate;

    /**
    * Output stream audio bitrate. Value range: [1,500]
If this parameter is left empty, the system will automatically determine.
    */
    @SerializedName("OutputAudioBitRate")
    @Expose
    private Long OutputAudioBitRate;

    /**
    * Output stream audio sample rate. Valid values: [96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000].
If this parameter is left empty, the system will automatically determine.
    */
    @SerializedName("OutputAudioSampleRate")
    @Expose
    private Long OutputAudioSampleRate;

    /**
    * Output stream audio sound channel. Valid values: [1,2].
If this parameter is left empty, the system will automatically determine.
    */
    @SerializedName("OutputAudioChannels")
    @Expose
    private Long OutputAudioChannels;

    /**
    * SEI information in output stream. If there are no special needs, leave it empty.
    */
    @SerializedName("MixSei")
    @Expose
    private String MixSei;

    /**
     * Get Output stream name. 
     * @return OutputStreamName Output stream name.
     */
    public String getOutputStreamName() {
        return this.OutputStreamName;
    }

    /**
     * Set Output stream name.
     * @param OutputStreamName Output stream name.
     */
    public void setOutputStreamName(String OutputStreamName) {
        this.OutputStreamName = OutputStreamName;
    }

    /**
     * Get Output stream type. Valid values: [0,1].
If this parameter is left empty, 0 will be used by default.
If the output stream is a stream in the input stream list, enter 0.
If you want the stream mix result to be a new stream, enter 1.
If this value is 1, `output_stream_id` cannot appear in `input_stram_list`, and there cannot be a stream with the same ID on the LVB backend. 
     * @return OutputStreamType Output stream type. Valid values: [0,1].
If this parameter is left empty, 0 will be used by default.
If the output stream is a stream in the input stream list, enter 0.
If you want the stream mix result to be a new stream, enter 1.
If this value is 1, `output_stream_id` cannot appear in `input_stram_list`, and there cannot be a stream with the same ID on the LVB backend.
     */
    public Long getOutputStreamType() {
        return this.OutputStreamType;
    }

    /**
     * Set Output stream type. Valid values: [0,1].
If this parameter is left empty, 0 will be used by default.
If the output stream is a stream in the input stream list, enter 0.
If you want the stream mix result to be a new stream, enter 1.
If this value is 1, `output_stream_id` cannot appear in `input_stram_list`, and there cannot be a stream with the same ID on the LVB backend.
     * @param OutputStreamType Output stream type. Valid values: [0,1].
If this parameter is left empty, 0 will be used by default.
If the output stream is a stream in the input stream list, enter 0.
If you want the stream mix result to be a new stream, enter 1.
If this value is 1, `output_stream_id` cannot appear in `input_stram_list`, and there cannot be a stream with the same ID on the LVB backend.
     */
    public void setOutputStreamType(Long OutputStreamType) {
        this.OutputStreamType = OutputStreamType;
    }

    /**
     * Get The output bitrate. Value range: 1-10000.
If you do not specify this, the system will select a bitrate automatically. 
     * @return OutputStreamBitRate The output bitrate. Value range: 1-10000.
If you do not specify this, the system will select a bitrate automatically.
     */
    public Long getOutputStreamBitRate() {
        return this.OutputStreamBitRate;
    }

    /**
     * Set The output bitrate. Value range: 1-10000.
If you do not specify this, the system will select a bitrate automatically.
     * @param OutputStreamBitRate The output bitrate. Value range: 1-10000.
If you do not specify this, the system will select a bitrate automatically.
     */
    public void setOutputStreamBitRate(Long OutputStreamBitRate) {
        this.OutputStreamBitRate = OutputStreamBitRate;
    }

    /**
     * Get Output stream GOP size. Value range: [1,10].
If this parameter is left empty, the system will automatically determine. 
     * @return OutputStreamGop Output stream GOP size. Value range: [1,10].
If this parameter is left empty, the system will automatically determine.
     */
    public Long getOutputStreamGop() {
        return this.OutputStreamGop;
    }

    /**
     * Set Output stream GOP size. Value range: [1,10].
If this parameter is left empty, the system will automatically determine.
     * @param OutputStreamGop Output stream GOP size. Value range: [1,10].
If this parameter is left empty, the system will automatically determine.
     */
    public void setOutputStreamGop(Long OutputStreamGop) {
        this.OutputStreamGop = OutputStreamGop;
    }

    /**
     * Get Output stream frame rate. Value range: [1,60].
If this parameter is left empty, the system will automatically determine. 
     * @return OutputStreamFrameRate Output stream frame rate. Value range: [1,60].
If this parameter is left empty, the system will automatically determine.
     */
    public Long getOutputStreamFrameRate() {
        return this.OutputStreamFrameRate;
    }

    /**
     * Set Output stream frame rate. Value range: [1,60].
If this parameter is left empty, the system will automatically determine.
     * @param OutputStreamFrameRate Output stream frame rate. Value range: [1,60].
If this parameter is left empty, the system will automatically determine.
     */
    public void setOutputStreamFrameRate(Long OutputStreamFrameRate) {
        this.OutputStreamFrameRate = OutputStreamFrameRate;
    }

    /**
     * Get Output stream audio bitrate. Value range: [1,500]
If this parameter is left empty, the system will automatically determine. 
     * @return OutputAudioBitRate Output stream audio bitrate. Value range: [1,500]
If this parameter is left empty, the system will automatically determine.
     */
    public Long getOutputAudioBitRate() {
        return this.OutputAudioBitRate;
    }

    /**
     * Set Output stream audio bitrate. Value range: [1,500]
If this parameter is left empty, the system will automatically determine.
     * @param OutputAudioBitRate Output stream audio bitrate. Value range: [1,500]
If this parameter is left empty, the system will automatically determine.
     */
    public void setOutputAudioBitRate(Long OutputAudioBitRate) {
        this.OutputAudioBitRate = OutputAudioBitRate;
    }

    /**
     * Get Output stream audio sample rate. Valid values: [96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000].
If this parameter is left empty, the system will automatically determine. 
     * @return OutputAudioSampleRate Output stream audio sample rate. Valid values: [96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000].
If this parameter is left empty, the system will automatically determine.
     */
    public Long getOutputAudioSampleRate() {
        return this.OutputAudioSampleRate;
    }

    /**
     * Set Output stream audio sample rate. Valid values: [96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000].
If this parameter is left empty, the system will automatically determine.
     * @param OutputAudioSampleRate Output stream audio sample rate. Valid values: [96000, 88200, 64000, 48000, 44100, 32000,24000, 22050, 16000, 12000, 11025, 8000].
If this parameter is left empty, the system will automatically determine.
     */
    public void setOutputAudioSampleRate(Long OutputAudioSampleRate) {
        this.OutputAudioSampleRate = OutputAudioSampleRate;
    }

    /**
     * Get Output stream audio sound channel. Valid values: [1,2].
If this parameter is left empty, the system will automatically determine. 
     * @return OutputAudioChannels Output stream audio sound channel. Valid values: [1,2].
If this parameter is left empty, the system will automatically determine.
     */
    public Long getOutputAudioChannels() {
        return this.OutputAudioChannels;
    }

    /**
     * Set Output stream audio sound channel. Valid values: [1,2].
If this parameter is left empty, the system will automatically determine.
     * @param OutputAudioChannels Output stream audio sound channel. Valid values: [1,2].
If this parameter is left empty, the system will automatically determine.
     */
    public void setOutputAudioChannels(Long OutputAudioChannels) {
        this.OutputAudioChannels = OutputAudioChannels;
    }

    /**
     * Get SEI information in output stream. If there are no special needs, leave it empty. 
     * @return MixSei SEI information in output stream. If there are no special needs, leave it empty.
     */
    public String getMixSei() {
        return this.MixSei;
    }

    /**
     * Set SEI information in output stream. If there are no special needs, leave it empty.
     * @param MixSei SEI information in output stream. If there are no special needs, leave it empty.
     */
    public void setMixSei(String MixSei) {
        this.MixSei = MixSei;
    }

    public CommonMixOutputParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonMixOutputParams(CommonMixOutputParams source) {
        if (source.OutputStreamName != null) {
            this.OutputStreamName = new String(source.OutputStreamName);
        }
        if (source.OutputStreamType != null) {
            this.OutputStreamType = new Long(source.OutputStreamType);
        }
        if (source.OutputStreamBitRate != null) {
            this.OutputStreamBitRate = new Long(source.OutputStreamBitRate);
        }
        if (source.OutputStreamGop != null) {
            this.OutputStreamGop = new Long(source.OutputStreamGop);
        }
        if (source.OutputStreamFrameRate != null) {
            this.OutputStreamFrameRate = new Long(source.OutputStreamFrameRate);
        }
        if (source.OutputAudioBitRate != null) {
            this.OutputAudioBitRate = new Long(source.OutputAudioBitRate);
        }
        if (source.OutputAudioSampleRate != null) {
            this.OutputAudioSampleRate = new Long(source.OutputAudioSampleRate);
        }
        if (source.OutputAudioChannels != null) {
            this.OutputAudioChannels = new Long(source.OutputAudioChannels);
        }
        if (source.MixSei != null) {
            this.MixSei = new String(source.MixSei);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputStreamName", this.OutputStreamName);
        this.setParamSimple(map, prefix + "OutputStreamType", this.OutputStreamType);
        this.setParamSimple(map, prefix + "OutputStreamBitRate", this.OutputStreamBitRate);
        this.setParamSimple(map, prefix + "OutputStreamGop", this.OutputStreamGop);
        this.setParamSimple(map, prefix + "OutputStreamFrameRate", this.OutputStreamFrameRate);
        this.setParamSimple(map, prefix + "OutputAudioBitRate", this.OutputAudioBitRate);
        this.setParamSimple(map, prefix + "OutputAudioSampleRate", this.OutputAudioSampleRate);
        this.setParamSimple(map, prefix + "OutputAudioChannels", this.OutputAudioChannels);
        this.setParamSimple(map, prefix + "MixSei", this.MixSei);

    }
}

