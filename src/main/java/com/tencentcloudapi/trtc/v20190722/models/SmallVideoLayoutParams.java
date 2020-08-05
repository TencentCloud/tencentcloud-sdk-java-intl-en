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

public class SmallVideoLayoutParams extends AbstractModel{

    /**
    * 
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * 
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * 
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * 
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * 
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
     * Get  
     * @return UserId 
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 
     * @param UserId 
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get  
     * @return StreamType 
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 
     * @param StreamType 
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get  
     * @return ImageWidth 
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 
     * @param ImageWidth 
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get  
     * @return ImageHeight 
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 
     * @param ImageHeight 
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get  
     * @return LocationX 
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set 
     * @param LocationX 
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get  
     * @return LocationY 
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set 
     * @param LocationY 
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);

    }
}

