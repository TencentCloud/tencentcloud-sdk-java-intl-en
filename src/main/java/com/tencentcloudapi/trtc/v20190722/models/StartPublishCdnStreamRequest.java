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

public class StartPublishCdnStreamRequest extends AbstractModel{

    /**
    * The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are relayed.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The ID of the room whose streams are relayed (the main room).
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * The type of the `RoomId` parameter, which must be the same as the ID type of the room whose streams are relayed. 0: integer; 1: string.
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * The information of the relaying robot in the room.
    */
    @SerializedName("AgentParams")
    @Expose
    private AgentParams AgentParams;

    /**
    * Whether to transcode the streams. 0: No; 1: Yes.
    */
    @SerializedName("WithTranscoding")
    @Expose
    private Long WithTranscoding;

    /**
    * The audio encoding parameters for relaying.
    */
    @SerializedName("AudioParams")
    @Expose
    private McuAudioParams AudioParams;

    /**
    * The video encoding parameters for relaying. If you do not pass this parameter, only audio will be relayed.
    */
    @SerializedName("VideoParams")
    @Expose
    private McuVideoParams VideoParams;

    /**
    * The information of a single stream relayed. When you relay a single stream, set `WithTranscoding` to 0.
    */
    @SerializedName("SingleSubscribeParams")
    @Expose
    private SingleSubscribeParams SingleSubscribeParams;

    /**
    * The CDN information.
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private McuPublishCdnParam [] PublishCdnParams;

    /**
     * Get The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are relayed. 
     * @return SdkAppId The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are relayed.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are relayed.
     * @param SdkAppId The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are relayed.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The ID of the room whose streams are relayed (the main room). 
     * @return RoomId The ID of the room whose streams are relayed (the main room).
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The ID of the room whose streams are relayed (the main room).
     * @param RoomId The ID of the room whose streams are relayed (the main room).
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The type of the `RoomId` parameter, which must be the same as the ID type of the room whose streams are relayed. 0: integer; 1: string. 
     * @return RoomIdType The type of the `RoomId` parameter, which must be the same as the ID type of the room whose streams are relayed. 0: integer; 1: string.
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set The type of the `RoomId` parameter, which must be the same as the ID type of the room whose streams are relayed. 0: integer; 1: string.
     * @param RoomIdType The type of the `RoomId` parameter, which must be the same as the ID type of the room whose streams are relayed. 0: integer; 1: string.
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get The information of the relaying robot in the room. 
     * @return AgentParams The information of the relaying robot in the room.
     */
    public AgentParams getAgentParams() {
        return this.AgentParams;
    }

    /**
     * Set The information of the relaying robot in the room.
     * @param AgentParams The information of the relaying robot in the room.
     */
    public void setAgentParams(AgentParams AgentParams) {
        this.AgentParams = AgentParams;
    }

    /**
     * Get Whether to transcode the streams. 0: No; 1: Yes. 
     * @return WithTranscoding Whether to transcode the streams. 0: No; 1: Yes.
     */
    public Long getWithTranscoding() {
        return this.WithTranscoding;
    }

    /**
     * Set Whether to transcode the streams. 0: No; 1: Yes.
     * @param WithTranscoding Whether to transcode the streams. 0: No; 1: Yes.
     */
    public void setWithTranscoding(Long WithTranscoding) {
        this.WithTranscoding = WithTranscoding;
    }

    /**
     * Get The audio encoding parameters for relaying. 
     * @return AudioParams The audio encoding parameters for relaying.
     */
    public McuAudioParams getAudioParams() {
        return this.AudioParams;
    }

    /**
     * Set The audio encoding parameters for relaying.
     * @param AudioParams The audio encoding parameters for relaying.
     */
    public void setAudioParams(McuAudioParams AudioParams) {
        this.AudioParams = AudioParams;
    }

    /**
     * Get The video encoding parameters for relaying. If you do not pass this parameter, only audio will be relayed. 
     * @return VideoParams The video encoding parameters for relaying. If you do not pass this parameter, only audio will be relayed.
     */
    public McuVideoParams getVideoParams() {
        return this.VideoParams;
    }

    /**
     * Set The video encoding parameters for relaying. If you do not pass this parameter, only audio will be relayed.
     * @param VideoParams The video encoding parameters for relaying. If you do not pass this parameter, only audio will be relayed.
     */
    public void setVideoParams(McuVideoParams VideoParams) {
        this.VideoParams = VideoParams;
    }

    /**
     * Get The information of a single stream relayed. When you relay a single stream, set `WithTranscoding` to 0. 
     * @return SingleSubscribeParams The information of a single stream relayed. When you relay a single stream, set `WithTranscoding` to 0.
     */
    public SingleSubscribeParams getSingleSubscribeParams() {
        return this.SingleSubscribeParams;
    }

    /**
     * Set The information of a single stream relayed. When you relay a single stream, set `WithTranscoding` to 0.
     * @param SingleSubscribeParams The information of a single stream relayed. When you relay a single stream, set `WithTranscoding` to 0.
     */
    public void setSingleSubscribeParams(SingleSubscribeParams SingleSubscribeParams) {
        this.SingleSubscribeParams = SingleSubscribeParams;
    }

    /**
     * Get The CDN information. 
     * @return PublishCdnParams The CDN information.
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set The CDN information.
     * @param PublishCdnParams The CDN information.
     */
    public void setPublishCdnParams(McuPublishCdnParam [] PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    public StartPublishCdnStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartPublishCdnStreamRequest(StartPublishCdnStreamRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.AgentParams != null) {
            this.AgentParams = new AgentParams(source.AgentParams);
        }
        if (source.WithTranscoding != null) {
            this.WithTranscoding = new Long(source.WithTranscoding);
        }
        if (source.AudioParams != null) {
            this.AudioParams = new McuAudioParams(source.AudioParams);
        }
        if (source.VideoParams != null) {
            this.VideoParams = new McuVideoParams(source.VideoParams);
        }
        if (source.SingleSubscribeParams != null) {
            this.SingleSubscribeParams = new SingleSubscribeParams(source.SingleSubscribeParams);
        }
        if (source.PublishCdnParams != null) {
            this.PublishCdnParams = new McuPublishCdnParam[source.PublishCdnParams.length];
            for (int i = 0; i < source.PublishCdnParams.length; i++) {
                this.PublishCdnParams[i] = new McuPublishCdnParam(source.PublishCdnParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "AgentParams.", this.AgentParams);
        this.setParamSimple(map, prefix + "WithTranscoding", this.WithTranscoding);
        this.setParamObj(map, prefix + "AudioParams.", this.AudioParams);
        this.setParamObj(map, prefix + "VideoParams.", this.VideoParams);
        this.setParamObj(map, prefix + "SingleSubscribeParams.", this.SingleSubscribeParams);
        this.setParamArrayObj(map, prefix + "PublishCdnParams.", this.PublishCdnParams);

    }
}

