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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartPublishCdnStreamRequest extends AbstractModel {

    /**
    * [SdkAppId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId corresponding to the relayed room.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Main room information RoomId, the RoomId corresponding to the TRTC room for relay.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Main room information RoomType must be the same as the RoomId type of the relayed room. 0 indicates integer type room id, and 1 indicates string room number.
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * Relay service bot parameters for joining TRTC room.
    */
    @SerializedName("AgentParams")
    @Expose
    private AgentParams AgentParams;

    /**
    * Whether to transcode. 0 indicates no need to transcode, 1 indicates requirement to transcode. whether to charge transcoding fee is determined by the WithTranscoding parameter. WithTranscoding set to 0 means bypass forwarding and no transcoding costs will be incurred. WithTranscoding set to 1 means mixed-stream relay and transcoding costs will be charged.
Note: transcoding is required for stream mixing, and this parameter must be set to 1.
    */
    @SerializedName("WithTranscoding")
    @Expose
    private Long WithTranscoding;

    /**
    * Audio encoding parameters for stream retransmission. since audio must be transcoded (no transcoding costs will be incurred), this field is required when starting a task.
    */
    @SerializedName("AudioParams")
    @Expose
    private McuAudioParams AudioParams;

    /**
    * Video encoding parameters for the relay stream. leave blank for audio-only relay.
    */
    @SerializedName("VideoParams")
    @Expose
    private McuVideoParams VideoParams;

    /**
    * The user uplink parameters require single stream bypass forwarding. WithTranscoding needs to be set to 0 for single stream bypass forwarding.
    */
    @SerializedName("SingleSubscribeParams")
    @Expose
    private SingleSubscribeParams SingleSubscribeParams;

    /**
    * The CDN parameters for relay push support up to 10 push urls for a task. there must be one pushback room parameter.
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private McuPublishCdnParam [] PublishCdnParams;

    /**
    * Stream mixing SEI parameter.
    */
    @SerializedName("SeiParams")
    @Expose
    private McuSeiParams SeiParams;

    /**
    * Push back room information. a task supports up to 10 push rooms, and there must be one forward CDN parameter. note: use SDK version 10.4 or higher to push room. if you need assistance, contact tencent cloud technical support.
    */
    @SerializedName("FeedBackRoomParams")
    @Expose
    private McuFeedBackRoomParams [] FeedBackRoomParams;

    /**
    * Relay recording parameters. refer to the reference document (https://www.tencentcloud.comom/document/product/647/111748?from_cn_redirect=1).
    */
    @SerializedName("RecordParams")
    @Expose
    private McuRecordParams RecordParams;

    /**
     * Get [SdkAppId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId corresponding to the relayed room. 
     * @return SdkAppId [SdkAppId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId corresponding to the relayed room.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set [SdkAppId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId corresponding to the relayed room.
     * @param SdkAppId [SdkAppId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#SdkAppId) of TRTC, which is the same as the SdkAppId corresponding to the relayed room.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Main room information RoomId, the RoomId corresponding to the TRTC room for relay. 
     * @return RoomId Main room information RoomId, the RoomId corresponding to the TRTC room for relay.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Main room information RoomId, the RoomId corresponding to the TRTC room for relay.
     * @param RoomId Main room information RoomId, the RoomId corresponding to the TRTC room for relay.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Main room information RoomType must be the same as the RoomId type of the relayed room. 0 indicates integer type room id, and 1 indicates string room number. 
     * @return RoomIdType Main room information RoomType must be the same as the RoomId type of the relayed room. 0 indicates integer type room id, and 1 indicates string room number.
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set Main room information RoomType must be the same as the RoomId type of the relayed room. 0 indicates integer type room id, and 1 indicates string room number.
     * @param RoomIdType Main room information RoomType must be the same as the RoomId type of the relayed room. 0 indicates integer type room id, and 1 indicates string room number.
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get Relay service bot parameters for joining TRTC room. 
     * @return AgentParams Relay service bot parameters for joining TRTC room.
     */
    public AgentParams getAgentParams() {
        return this.AgentParams;
    }

    /**
     * Set Relay service bot parameters for joining TRTC room.
     * @param AgentParams Relay service bot parameters for joining TRTC room.
     */
    public void setAgentParams(AgentParams AgentParams) {
        this.AgentParams = AgentParams;
    }

    /**
     * Get Whether to transcode. 0 indicates no need to transcode, 1 indicates requirement to transcode. whether to charge transcoding fee is determined by the WithTranscoding parameter. WithTranscoding set to 0 means bypass forwarding and no transcoding costs will be incurred. WithTranscoding set to 1 means mixed-stream relay and transcoding costs will be charged.
Note: transcoding is required for stream mixing, and this parameter must be set to 1. 
     * @return WithTranscoding Whether to transcode. 0 indicates no need to transcode, 1 indicates requirement to transcode. whether to charge transcoding fee is determined by the WithTranscoding parameter. WithTranscoding set to 0 means bypass forwarding and no transcoding costs will be incurred. WithTranscoding set to 1 means mixed-stream relay and transcoding costs will be charged.
Note: transcoding is required for stream mixing, and this parameter must be set to 1.
     */
    public Long getWithTranscoding() {
        return this.WithTranscoding;
    }

    /**
     * Set Whether to transcode. 0 indicates no need to transcode, 1 indicates requirement to transcode. whether to charge transcoding fee is determined by the WithTranscoding parameter. WithTranscoding set to 0 means bypass forwarding and no transcoding costs will be incurred. WithTranscoding set to 1 means mixed-stream relay and transcoding costs will be charged.
Note: transcoding is required for stream mixing, and this parameter must be set to 1.
     * @param WithTranscoding Whether to transcode. 0 indicates no need to transcode, 1 indicates requirement to transcode. whether to charge transcoding fee is determined by the WithTranscoding parameter. WithTranscoding set to 0 means bypass forwarding and no transcoding costs will be incurred. WithTranscoding set to 1 means mixed-stream relay and transcoding costs will be charged.
Note: transcoding is required for stream mixing, and this parameter must be set to 1.
     */
    public void setWithTranscoding(Long WithTranscoding) {
        this.WithTranscoding = WithTranscoding;
    }

    /**
     * Get Audio encoding parameters for stream retransmission. since audio must be transcoded (no transcoding costs will be incurred), this field is required when starting a task. 
     * @return AudioParams Audio encoding parameters for stream retransmission. since audio must be transcoded (no transcoding costs will be incurred), this field is required when starting a task.
     */
    public McuAudioParams getAudioParams() {
        return this.AudioParams;
    }

    /**
     * Set Audio encoding parameters for stream retransmission. since audio must be transcoded (no transcoding costs will be incurred), this field is required when starting a task.
     * @param AudioParams Audio encoding parameters for stream retransmission. since audio must be transcoded (no transcoding costs will be incurred), this field is required when starting a task.
     */
    public void setAudioParams(McuAudioParams AudioParams) {
        this.AudioParams = AudioParams;
    }

    /**
     * Get Video encoding parameters for the relay stream. leave blank for audio-only relay. 
     * @return VideoParams Video encoding parameters for the relay stream. leave blank for audio-only relay.
     */
    public McuVideoParams getVideoParams() {
        return this.VideoParams;
    }

    /**
     * Set Video encoding parameters for the relay stream. leave blank for audio-only relay.
     * @param VideoParams Video encoding parameters for the relay stream. leave blank for audio-only relay.
     */
    public void setVideoParams(McuVideoParams VideoParams) {
        this.VideoParams = VideoParams;
    }

    /**
     * Get The user uplink parameters require single stream bypass forwarding. WithTranscoding needs to be set to 0 for single stream bypass forwarding. 
     * @return SingleSubscribeParams The user uplink parameters require single stream bypass forwarding. WithTranscoding needs to be set to 0 for single stream bypass forwarding.
     */
    public SingleSubscribeParams getSingleSubscribeParams() {
        return this.SingleSubscribeParams;
    }

    /**
     * Set The user uplink parameters require single stream bypass forwarding. WithTranscoding needs to be set to 0 for single stream bypass forwarding.
     * @param SingleSubscribeParams The user uplink parameters require single stream bypass forwarding. WithTranscoding needs to be set to 0 for single stream bypass forwarding.
     */
    public void setSingleSubscribeParams(SingleSubscribeParams SingleSubscribeParams) {
        this.SingleSubscribeParams = SingleSubscribeParams;
    }

    /**
     * Get The CDN parameters for relay push support up to 10 push urls for a task. there must be one pushback room parameter. 
     * @return PublishCdnParams The CDN parameters for relay push support up to 10 push urls for a task. there must be one pushback room parameter.
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set The CDN parameters for relay push support up to 10 push urls for a task. there must be one pushback room parameter.
     * @param PublishCdnParams The CDN parameters for relay push support up to 10 push urls for a task. there must be one pushback room parameter.
     */
    public void setPublishCdnParams(McuPublishCdnParam [] PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    /**
     * Get Stream mixing SEI parameter. 
     * @return SeiParams Stream mixing SEI parameter.
     */
    public McuSeiParams getSeiParams() {
        return this.SeiParams;
    }

    /**
     * Set Stream mixing SEI parameter.
     * @param SeiParams Stream mixing SEI parameter.
     */
    public void setSeiParams(McuSeiParams SeiParams) {
        this.SeiParams = SeiParams;
    }

    /**
     * Get Push back room information. a task supports up to 10 push rooms, and there must be one forward CDN parameter. note: use SDK version 10.4 or higher to push room. if you need assistance, contact tencent cloud technical support. 
     * @return FeedBackRoomParams Push back room information. a task supports up to 10 push rooms, and there must be one forward CDN parameter. note: use SDK version 10.4 or higher to push room. if you need assistance, contact tencent cloud technical support.
     */
    public McuFeedBackRoomParams [] getFeedBackRoomParams() {
        return this.FeedBackRoomParams;
    }

    /**
     * Set Push back room information. a task supports up to 10 push rooms, and there must be one forward CDN parameter. note: use SDK version 10.4 or higher to push room. if you need assistance, contact tencent cloud technical support.
     * @param FeedBackRoomParams Push back room information. a task supports up to 10 push rooms, and there must be one forward CDN parameter. note: use SDK version 10.4 or higher to push room. if you need assistance, contact tencent cloud technical support.
     */
    public void setFeedBackRoomParams(McuFeedBackRoomParams [] FeedBackRoomParams) {
        this.FeedBackRoomParams = FeedBackRoomParams;
    }

    /**
     * Get Relay recording parameters. refer to the reference document (https://www.tencentcloud.comom/document/product/647/111748?from_cn_redirect=1). 
     * @return RecordParams Relay recording parameters. refer to the reference document (https://www.tencentcloud.comom/document/product/647/111748?from_cn_redirect=1).
     */
    public McuRecordParams getRecordParams() {
        return this.RecordParams;
    }

    /**
     * Set Relay recording parameters. refer to the reference document (https://www.tencentcloud.comom/document/product/647/111748?from_cn_redirect=1).
     * @param RecordParams Relay recording parameters. refer to the reference document (https://www.tencentcloud.comom/document/product/647/111748?from_cn_redirect=1).
     */
    public void setRecordParams(McuRecordParams RecordParams) {
        this.RecordParams = RecordParams;
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
        if (source.SeiParams != null) {
            this.SeiParams = new McuSeiParams(source.SeiParams);
        }
        if (source.FeedBackRoomParams != null) {
            this.FeedBackRoomParams = new McuFeedBackRoomParams[source.FeedBackRoomParams.length];
            for (int i = 0; i < source.FeedBackRoomParams.length; i++) {
                this.FeedBackRoomParams[i] = new McuFeedBackRoomParams(source.FeedBackRoomParams[i]);
            }
        }
        if (source.RecordParams != null) {
            this.RecordParams = new McuRecordParams(source.RecordParams);
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
        this.setParamObj(map, prefix + "SeiParams.", this.SeiParams);
        this.setParamArrayObj(map, prefix + "FeedBackRoomParams.", this.FeedBackRoomParams);
        this.setParamObj(map, prefix + "RecordParams.", this.RecordParams);

    }
}

