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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTranscodeDetailInfo extends AbstractModel {

    /**
    * The channel ID.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * The start time (UTC+8) of transcoding in the format of yyyy-MM-dd HH:mm:ss.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time (UTC+8) of transcoding in the format of yyyy-MM-dd HH:mm:ss.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The duration (s) of transcoding.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * The encoding method.
Examples:
`liveprocessor_H264`: Live transcoding-H264
`liveprocessor_H265`: Live transcoding-H265
`topspeed_H264`: Top speed codec-H264
`topspeed_H265`: Top speed codec-H265
    */
    @SerializedName("ModuleCodec")
    @Expose
    private String ModuleCodec;

    /**
    * The target bitrate (Kbps).
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * The transcoding type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The push domain name.
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * The target resolution.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get The channel ID. 
     * @return ChannelId The channel ID.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set The channel ID.
     * @param ChannelId The channel ID.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get The start time (UTC+8) of transcoding in the format of yyyy-MM-dd HH:mm:ss. 
     * @return StartTime The start time (UTC+8) of transcoding in the format of yyyy-MM-dd HH:mm:ss.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time (UTC+8) of transcoding in the format of yyyy-MM-dd HH:mm:ss.
     * @param StartTime The start time (UTC+8) of transcoding in the format of yyyy-MM-dd HH:mm:ss.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time (UTC+8) of transcoding in the format of yyyy-MM-dd HH:mm:ss. 
     * @return EndTime The end time (UTC+8) of transcoding in the format of yyyy-MM-dd HH:mm:ss.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time (UTC+8) of transcoding in the format of yyyy-MM-dd HH:mm:ss.
     * @param EndTime The end time (UTC+8) of transcoding in the format of yyyy-MM-dd HH:mm:ss.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The duration (s) of transcoding. 
     * @return Duration The duration (s) of transcoding.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set The duration (s) of transcoding.
     * @param Duration The duration (s) of transcoding.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The encoding method.
Examples:
`liveprocessor_H264`: Live transcoding-H264
`liveprocessor_H265`: Live transcoding-H265
`topspeed_H264`: Top speed codec-H264
`topspeed_H265`: Top speed codec-H265 
     * @return ModuleCodec The encoding method.
Examples:
`liveprocessor_H264`: Live transcoding-H264
`liveprocessor_H265`: Live transcoding-H265
`topspeed_H264`: Top speed codec-H264
`topspeed_H265`: Top speed codec-H265
     */
    public String getModuleCodec() {
        return this.ModuleCodec;
    }

    /**
     * Set The encoding method.
Examples:
`liveprocessor_H264`: Live transcoding-H264
`liveprocessor_H265`: Live transcoding-H265
`topspeed_H264`: Top speed codec-H264
`topspeed_H265`: Top speed codec-H265
     * @param ModuleCodec The encoding method.
Examples:
`liveprocessor_H264`: Live transcoding-H264
`liveprocessor_H265`: Live transcoding-H265
`topspeed_H264`: Top speed codec-H264
`topspeed_H265`: Top speed codec-H265
     */
    public void setModuleCodec(String ModuleCodec) {
        this.ModuleCodec = ModuleCodec;
    }

    /**
     * Get The target bitrate (Kbps). 
     * @return Bitrate The target bitrate (Kbps).
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set The target bitrate (Kbps).
     * @param Bitrate The target bitrate (Kbps).
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get The transcoding type. 
     * @return Type The transcoding type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The transcoding type.
     * @param Type The transcoding type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The push domain name. 
     * @return PushDomain The push domain name.
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * Set The push domain name.
     * @param PushDomain The push domain name.
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * Get The target resolution. 
     * @return Resolution The target resolution.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set The target resolution.
     * @param Resolution The target resolution.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public DescribeTranscodeDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTranscodeDetailInfo(DescribeTranscodeDetailInfo source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ModuleCodec != null) {
            this.ModuleCodec = new String(source.ModuleCodec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PushDomain != null) {
            this.PushDomain = new String(source.PushDomain);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
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

