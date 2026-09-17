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
    * 
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * 
    */
    @SerializedName("FaceImage")
    @Expose
    private String FaceImage;

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get  
     * @return FaceId 
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 
     * @param FaceId 
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get  
     * @return FaceImage 
     */
    public String getFaceImage() {
        return this.FaceImage;
    }

    /**
     * Set 
     * @param FaceImage 
     */
    public void setFaceImage(String FaceImage) {
        this.FaceImage = FaceImage;
    }

    /**
     * Get  
     * @return StartTime 
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return EndTime 
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 
     * @param EndTime 
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

