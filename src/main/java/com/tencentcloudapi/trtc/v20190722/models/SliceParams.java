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

public class SliceParams extends AbstractModel {

    /**
    * Slicing task type.
1: audio slicing;
2: video frame extraction;
3: audio/video slicing + video frame extraction.
Example value: 1.
    */
    @SerializedName("SliceType")
    @Expose
    private Long SliceType;

    /**
    * Recording is stopped automatically when there is no anchor in the room for more than MaxIdleTime. Unit: seconds. Default value: 30 seconds. This value needs to be greater than or equal to 5 seconds and less than or equal to 86,400 seconds (24 hours).
Example value: 30.
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * Audio slicing duration. Default value: 15s. Example value: 15.
    */
    @SerializedName("SliceAudio")
    @Expose
    private Long SliceAudio;

    /**
    * Interval for video frame extraction. Default value: 5s. Example value: 5.
    */
    @SerializedName("SliceVideo")
    @Expose
    private Long SliceVideo;

    /**
    * Specifies the allowlist or blocklist for the subscription stream.
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeStreamUserIds SubscribeStreamUserIds;

    /**
    * Depreciated. The callback URL is configured in the console.
    */
    @SerializedName("SliceCallbackUrl")
    @Expose
    private String SliceCallbackUrl;

    /**
     * Get Slicing task type.
1: audio slicing;
2: video frame extraction;
3: audio/video slicing + video frame extraction.
Example value: 1. 
     * @return SliceType Slicing task type.
1: audio slicing;
2: video frame extraction;
3: audio/video slicing + video frame extraction.
Example value: 1.
     */
    public Long getSliceType() {
        return this.SliceType;
    }

    /**
     * Set Slicing task type.
1: audio slicing;
2: video frame extraction;
3: audio/video slicing + video frame extraction.
Example value: 1.
     * @param SliceType Slicing task type.
1: audio slicing;
2: video frame extraction;
3: audio/video slicing + video frame extraction.
Example value: 1.
     */
    public void setSliceType(Long SliceType) {
        this.SliceType = SliceType;
    }

    /**
     * Get Recording is stopped automatically when there is no anchor in the room for more than MaxIdleTime. Unit: seconds. Default value: 30 seconds. This value needs to be greater than or equal to 5 seconds and less than or equal to 86,400 seconds (24 hours).
Example value: 30. 
     * @return MaxIdleTime Recording is stopped automatically when there is no anchor in the room for more than MaxIdleTime. Unit: seconds. Default value: 30 seconds. This value needs to be greater than or equal to 5 seconds and less than or equal to 86,400 seconds (24 hours).
Example value: 30.
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set Recording is stopped automatically when there is no anchor in the room for more than MaxIdleTime. Unit: seconds. Default value: 30 seconds. This value needs to be greater than or equal to 5 seconds and less than or equal to 86,400 seconds (24 hours).
Example value: 30.
     * @param MaxIdleTime Recording is stopped automatically when there is no anchor in the room for more than MaxIdleTime. Unit: seconds. Default value: 30 seconds. This value needs to be greater than or equal to 5 seconds and less than or equal to 86,400 seconds (24 hours).
Example value: 30.
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get Audio slicing duration. Default value: 15s. Example value: 15. 
     * @return SliceAudio Audio slicing duration. Default value: 15s. Example value: 15.
     */
    public Long getSliceAudio() {
        return this.SliceAudio;
    }

    /**
     * Set Audio slicing duration. Default value: 15s. Example value: 15.
     * @param SliceAudio Audio slicing duration. Default value: 15s. Example value: 15.
     */
    public void setSliceAudio(Long SliceAudio) {
        this.SliceAudio = SliceAudio;
    }

    /**
     * Get Interval for video frame extraction. Default value: 5s. Example value: 5. 
     * @return SliceVideo Interval for video frame extraction. Default value: 5s. Example value: 5.
     */
    public Long getSliceVideo() {
        return this.SliceVideo;
    }

    /**
     * Set Interval for video frame extraction. Default value: 5s. Example value: 5.
     * @param SliceVideo Interval for video frame extraction. Default value: 5s. Example value: 5.
     */
    public void setSliceVideo(Long SliceVideo) {
        this.SliceVideo = SliceVideo;
    }

    /**
     * Get Specifies the allowlist or blocklist for the subscription stream. 
     * @return SubscribeStreamUserIds Specifies the allowlist or blocklist for the subscription stream.
     */
    public SubscribeStreamUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set Specifies the allowlist or blocklist for the subscription stream.
     * @param SubscribeStreamUserIds Specifies the allowlist or blocklist for the subscription stream.
     */
    public void setSubscribeStreamUserIds(SubscribeStreamUserIds SubscribeStreamUserIds) {
        this.SubscribeStreamUserIds = SubscribeStreamUserIds;
    }

    /**
     * Get Depreciated. The callback URL is configured in the console. 
     * @return SliceCallbackUrl Depreciated. The callback URL is configured in the console.
     */
    public String getSliceCallbackUrl() {
        return this.SliceCallbackUrl;
    }

    /**
     * Set Depreciated. The callback URL is configured in the console.
     * @param SliceCallbackUrl Depreciated. The callback URL is configured in the console.
     */
    public void setSliceCallbackUrl(String SliceCallbackUrl) {
        this.SliceCallbackUrl = SliceCallbackUrl;
    }

    public SliceParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SliceParams(SliceParams source) {
        if (source.SliceType != null) {
            this.SliceType = new Long(source.SliceType);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.SliceAudio != null) {
            this.SliceAudio = new Long(source.SliceAudio);
        }
        if (source.SliceVideo != null) {
            this.SliceVideo = new Long(source.SliceVideo);
        }
        if (source.SubscribeStreamUserIds != null) {
            this.SubscribeStreamUserIds = new SubscribeStreamUserIds(source.SubscribeStreamUserIds);
        }
        if (source.SliceCallbackUrl != null) {
            this.SliceCallbackUrl = new String(source.SliceCallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SliceType", this.SliceType);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "SliceAudio", this.SliceAudio);
        this.setParamSimple(map, prefix + "SliceVideo", this.SliceVideo);
        this.setParamObj(map, prefix + "SubscribeStreamUserIds.", this.SubscribeStreamUserIds);
        this.setParamSimple(map, prefix + "SliceCallbackUrl", this.SliceCallbackUrl);

    }
}

