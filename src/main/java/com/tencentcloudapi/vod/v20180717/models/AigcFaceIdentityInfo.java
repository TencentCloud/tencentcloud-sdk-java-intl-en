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

public class AigcFaceIdentityInfo extends AbstractModel {

    /**
    * Face ID in the video. The same human face is considered a different ID when the interval in the middle of the video exceeds 1s.
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * Schematic diagram of human face extracted from the video.
    */
    @SerializedName("FaceImage")
    @Expose
    private String FaceImage;

    /**
    * The starting time of the lip-sync interval can be used as the best start time for lip-sync. Unit: ms.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The end time of the lip-sync interval for this face. Note: This result may have millisecond-level deviation and could be longer than the actual interval end. Unit: ms.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Face ID in the video. The same human face is considered a different ID when the interval in the middle of the video exceeds 1s. 
     * @return FaceId Face ID in the video. The same human face is considered a different ID when the interval in the middle of the video exceeds 1s.
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set Face ID in the video. The same human face is considered a different ID when the interval in the middle of the video exceeds 1s.
     * @param FaceId Face ID in the video. The same human face is considered a different ID when the interval in the middle of the video exceeds 1s.
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get Schematic diagram of human face extracted from the video. 
     * @return FaceImage Schematic diagram of human face extracted from the video.
     */
    public String getFaceImage() {
        return this.FaceImage;
    }

    /**
     * Set Schematic diagram of human face extracted from the video.
     * @param FaceImage Schematic diagram of human face extracted from the video.
     */
    public void setFaceImage(String FaceImage) {
        this.FaceImage = FaceImage;
    }

    /**
     * Get The starting time of the lip-sync interval can be used as the best start time for lip-sync. Unit: ms. 
     * @return StartTime The starting time of the lip-sync interval can be used as the best start time for lip-sync. Unit: ms.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The starting time of the lip-sync interval can be used as the best start time for lip-sync. Unit: ms.
     * @param StartTime The starting time of the lip-sync interval can be used as the best start time for lip-sync. Unit: ms.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time of the lip-sync interval for this face. Note: This result may have millisecond-level deviation and could be longer than the actual interval end. Unit: ms. 
     * @return EndTime The end time of the lip-sync interval for this face. Note: This result may have millisecond-level deviation and could be longer than the actual interval end. Unit: ms.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the lip-sync interval for this face. Note: This result may have millisecond-level deviation and could be longer than the actual interval end. Unit: ms.
     * @param EndTime The end time of the lip-sync interval for this face. Note: This result may have millisecond-level deviation and could be longer than the actual interval end. Unit: ms.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public AigcFaceIdentityInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcFaceIdentityInfo(AigcFaceIdentityInfo source) {
        if (source.FaceId != null) {
            this.FaceId = new String(source.FaceId);
        }
        if (source.FaceImage != null) {
            this.FaceImage = new String(source.FaceImage);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamSimple(map, prefix + "FaceImage", this.FaceImage);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

