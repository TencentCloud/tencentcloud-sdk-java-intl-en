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

public class UpdatePublishCdnStreamRequest extends AbstractModel{

    /**
    * The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are relayed.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The sequence of a request. This parameter ensures the requests to change the parameters of the same relaying task are in the correct order. It increases each time a new request is made.
    */
    @SerializedName("SequenceNumber")
    @Expose
    private Long SequenceNumber;

    /**
    * Whether to transcode the streams. 0: No; 1: Yes.
    */
    @SerializedName("WithTranscoding")
    @Expose
    private Long WithTranscoding;

    /**
    * Pass this parameter to change the users whose audios are mixed. If you do not pass this parameter, no changes will be made.
    */
    @SerializedName("AudioParams")
    @Expose
    private McuAudioParams AudioParams;

    /**
    * Pass this parameter to change video parameters other than the codec, including the video layout, background image, background color, and watermark information. This parameter is valid only if streams are transcoded. If you do not pass it, no changes will be made.
    */
    @SerializedName("VideoParams")
    @Expose
    private McuVideoParams VideoParams;

    /**
    * Pass this parameter to change the single stream that is relayed. This parameter is valid only if streams are not transcoded. If you do not pass this parameter, no changes will be made.
    */
    @SerializedName("SingleSubscribeParams")
    @Expose
    private SingleSubscribeParams SingleSubscribeParams;

    /**
    * Pass this parameter to change the CDNs to relay to. If you do not pass this parameter, no changes will be made.
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private McuPublishCdnParam [] PublishCdnParams;

    /**
    * The stream mixing SEI parameters.
    */
    @SerializedName("SeiParams")
    @Expose
    private McuSeiParams SeiParams;

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
     * Get The task ID. 
     * @return TaskId The task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The task ID.
     * @param TaskId The task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The sequence of a request. This parameter ensures the requests to change the parameters of the same relaying task are in the correct order. It increases each time a new request is made. 
     * @return SequenceNumber The sequence of a request. This parameter ensures the requests to change the parameters of the same relaying task are in the correct order. It increases each time a new request is made.
     */
    public Long getSequenceNumber() {
        return this.SequenceNumber;
    }

    /**
     * Set The sequence of a request. This parameter ensures the requests to change the parameters of the same relaying task are in the correct order. It increases each time a new request is made.
     * @param SequenceNumber The sequence of a request. This parameter ensures the requests to change the parameters of the same relaying task are in the correct order. It increases each time a new request is made.
     */
    public void setSequenceNumber(Long SequenceNumber) {
        this.SequenceNumber = SequenceNumber;
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
     * Get Pass this parameter to change the users whose audios are mixed. If you do not pass this parameter, no changes will be made. 
     * @return AudioParams Pass this parameter to change the users whose audios are mixed. If you do not pass this parameter, no changes will be made.
     */
    public McuAudioParams getAudioParams() {
        return this.AudioParams;
    }

    /**
     * Set Pass this parameter to change the users whose audios are mixed. If you do not pass this parameter, no changes will be made.
     * @param AudioParams Pass this parameter to change the users whose audios are mixed. If you do not pass this parameter, no changes will be made.
     */
    public void setAudioParams(McuAudioParams AudioParams) {
        this.AudioParams = AudioParams;
    }

    /**
     * Get Pass this parameter to change video parameters other than the codec, including the video layout, background image, background color, and watermark information. This parameter is valid only if streams are transcoded. If you do not pass it, no changes will be made. 
     * @return VideoParams Pass this parameter to change video parameters other than the codec, including the video layout, background image, background color, and watermark information. This parameter is valid only if streams are transcoded. If you do not pass it, no changes will be made.
     */
    public McuVideoParams getVideoParams() {
        return this.VideoParams;
    }

    /**
     * Set Pass this parameter to change video parameters other than the codec, including the video layout, background image, background color, and watermark information. This parameter is valid only if streams are transcoded. If you do not pass it, no changes will be made.
     * @param VideoParams Pass this parameter to change video parameters other than the codec, including the video layout, background image, background color, and watermark information. This parameter is valid only if streams are transcoded. If you do not pass it, no changes will be made.
     */
    public void setVideoParams(McuVideoParams VideoParams) {
        this.VideoParams = VideoParams;
    }

    /**
     * Get Pass this parameter to change the single stream that is relayed. This parameter is valid only if streams are not transcoded. If you do not pass this parameter, no changes will be made. 
     * @return SingleSubscribeParams Pass this parameter to change the single stream that is relayed. This parameter is valid only if streams are not transcoded. If you do not pass this parameter, no changes will be made.
     */
    public SingleSubscribeParams getSingleSubscribeParams() {
        return this.SingleSubscribeParams;
    }

    /**
     * Set Pass this parameter to change the single stream that is relayed. This parameter is valid only if streams are not transcoded. If you do not pass this parameter, no changes will be made.
     * @param SingleSubscribeParams Pass this parameter to change the single stream that is relayed. This parameter is valid only if streams are not transcoded. If you do not pass this parameter, no changes will be made.
     */
    public void setSingleSubscribeParams(SingleSubscribeParams SingleSubscribeParams) {
        this.SingleSubscribeParams = SingleSubscribeParams;
    }

    /**
     * Get Pass this parameter to change the CDNs to relay to. If you do not pass this parameter, no changes will be made. 
     * @return PublishCdnParams Pass this parameter to change the CDNs to relay to. If you do not pass this parameter, no changes will be made.
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set Pass this parameter to change the CDNs to relay to. If you do not pass this parameter, no changes will be made.
     * @param PublishCdnParams Pass this parameter to change the CDNs to relay to. If you do not pass this parameter, no changes will be made.
     */
    public void setPublishCdnParams(McuPublishCdnParam [] PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    /**
     * Get The stream mixing SEI parameters. 
     * @return SeiParams The stream mixing SEI parameters.
     */
    public McuSeiParams getSeiParams() {
        return this.SeiParams;
    }

    /**
     * Set The stream mixing SEI parameters.
     * @param SeiParams The stream mixing SEI parameters.
     */
    public void setSeiParams(McuSeiParams SeiParams) {
        this.SeiParams = SeiParams;
    }

    public UpdatePublishCdnStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePublishCdnStreamRequest(UpdatePublishCdnStreamRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SequenceNumber != null) {
            this.SequenceNumber = new Long(source.SequenceNumber);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SequenceNumber", this.SequenceNumber);
        this.setParamSimple(map, prefix + "WithTranscoding", this.WithTranscoding);
        this.setParamObj(map, prefix + "AudioParams.", this.AudioParams);
        this.setParamObj(map, prefix + "VideoParams.", this.VideoParams);
        this.setParamObj(map, prefix + "SingleSubscribeParams.", this.SingleSubscribeParams);
        this.setParamArrayObj(map, prefix + "PublishCdnParams.", this.PublishCdnParams);
        this.setParamObj(map, prefix + "SeiParams.", this.SeiParams);

    }
}

