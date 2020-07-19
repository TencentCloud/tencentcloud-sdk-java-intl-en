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

public class TranscodeDetailInfo extends AbstractModel{

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Start time (Beijing time) in the format of `yyyy-mm-dd HH:MM`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (Beijing time) in the format of `yyyy-mm-dd HH:MM`.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Transcoding duration in minutes.
Note: given the possible interruptions during push, duration here is the sum of actual duration of transcoding instead of the interval between the start time and end time.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Codec with modules,
Example:
liveprocessor_H264: LVB transcoding - H264,
liveprocessor_H265: LVB transcoding - H265,
topspeed_H264: top speed codec - H264,
topspeed_H265: top speed codec - H265.
    */
    @SerializedName("ModuleCodec")
    @Expose
    private String ModuleCodec;

    /**
    * Bitrate.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Type. Valid values: Transcode, MixStream, WaterMark.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Push domain name.
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * Resolution.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get Stream name. 
     * @return StreamName Stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name.
     * @param StreamName Stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Start time (Beijing time) in the format of `yyyy-mm-dd HH:MM`. 
     * @return StartTime Start time (Beijing time) in the format of `yyyy-mm-dd HH:MM`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time (Beijing time) in the format of `yyyy-mm-dd HH:MM`.
     * @param StartTime Start time (Beijing time) in the format of `yyyy-mm-dd HH:MM`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (Beijing time) in the format of `yyyy-mm-dd HH:MM`. 
     * @return EndTime End time (Beijing time) in the format of `yyyy-mm-dd HH:MM`.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (Beijing time) in the format of `yyyy-mm-dd HH:MM`.
     * @param EndTime End time (Beijing time) in the format of `yyyy-mm-dd HH:MM`.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Transcoding duration in minutes.
Note: given the possible interruptions during push, duration here is the sum of actual duration of transcoding instead of the interval between the start time and end time. 
     * @return Duration Transcoding duration in minutes.
Note: given the possible interruptions during push, duration here is the sum of actual duration of transcoding instead of the interval between the start time and end time.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Transcoding duration in minutes.
Note: given the possible interruptions during push, duration here is the sum of actual duration of transcoding instead of the interval between the start time and end time.
     * @param Duration Transcoding duration in minutes.
Note: given the possible interruptions during push, duration here is the sum of actual duration of transcoding instead of the interval between the start time and end time.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Codec with modules,
Example:
liveprocessor_H264: LVB transcoding - H264,
liveprocessor_H265: LVB transcoding - H265,
topspeed_H264: top speed codec - H264,
topspeed_H265: top speed codec - H265. 
     * @return ModuleCodec Codec with modules,
Example:
liveprocessor_H264: LVB transcoding - H264,
liveprocessor_H265: LVB transcoding - H265,
topspeed_H264: top speed codec - H264,
topspeed_H265: top speed codec - H265.
     */
    public String getModuleCodec() {
        return this.ModuleCodec;
    }

    /**
     * Set Codec with modules,
Example:
liveprocessor_H264: LVB transcoding - H264,
liveprocessor_H265: LVB transcoding - H265,
topspeed_H264: top speed codec - H264,
topspeed_H265: top speed codec - H265.
     * @param ModuleCodec Codec with modules,
Example:
liveprocessor_H264: LVB transcoding - H264,
liveprocessor_H265: LVB transcoding - H265,
topspeed_H264: top speed codec - H264,
topspeed_H265: top speed codec - H265.
     */
    public void setModuleCodec(String ModuleCodec) {
        this.ModuleCodec = ModuleCodec;
    }

    /**
     * Get Bitrate. 
     * @return Bitrate Bitrate.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate.
     * @param Bitrate Bitrate.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Type. Valid values: Transcode, MixStream, WaterMark. 
     * @return Type Type. Valid values: Transcode, MixStream, WaterMark.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type. Valid values: Transcode, MixStream, WaterMark.
     * @param Type Type. Valid values: Transcode, MixStream, WaterMark.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Push domain name. 
     * @return PushDomain Push domain name.
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * Set Push domain name.
     * @param PushDomain Push domain name.
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * Get Resolution. 
     * @return Resolution Resolution.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Resolution.
     * @param Resolution Resolution.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ModuleCodec", this.ModuleCodec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

