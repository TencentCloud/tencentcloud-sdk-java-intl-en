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
    * ID of the user in the small image.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Stream type of the small image. 0: camera; 1: screen sharing. If a web user's stream is displayed in the small image, enter 0 for this parameter.
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * Output width of the small image in pixels. If this parameter is left empty, 0 will be used by default.
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * Output height of the small image in pixels. If this parameter is left empty, 0 will be used by default.
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * Output X-axis offset of the small image in pixels. The sum of `LocationX` and `ImageWidth` cannot exceed the total width of the output mixed stream. If this parameter is left empty, 0 will be used by default.
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * Output Y-axis offset of the small image in pixels. The sum of `LocationY` and `ImageHeight` cannot exceed the total height of the output mixed stream. If this parameter is left empty, 0 will be used by default.
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
     * Get ID of the user in the small image. 
     * @return UserId ID of the user in the small image.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set ID of the user in the small image.
     * @param UserId ID of the user in the small image.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Stream type of the small image. 0: camera; 1: screen sharing. If a web user's stream is displayed in the small image, enter 0 for this parameter. 
     * @return StreamType Stream type of the small image. 0: camera; 1: screen sharing. If a web user's stream is displayed in the small image, enter 0 for this parameter.
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set Stream type of the small image. 0: camera; 1: screen sharing. If a web user's stream is displayed in the small image, enter 0 for this parameter.
     * @param StreamType Stream type of the small image. 0: camera; 1: screen sharing. If a web user's stream is displayed in the small image, enter 0 for this parameter.
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get Output width of the small image in pixels. If this parameter is left empty, 0 will be used by default. 
     * @return ImageWidth Output width of the small image in pixels. If this parameter is left empty, 0 will be used by default.
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set Output width of the small image in pixels. If this parameter is left empty, 0 will be used by default.
     * @param ImageWidth Output width of the small image in pixels. If this parameter is left empty, 0 will be used by default.
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get Output height of the small image in pixels. If this parameter is left empty, 0 will be used by default. 
     * @return ImageHeight Output height of the small image in pixels. If this parameter is left empty, 0 will be used by default.
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set Output height of the small image in pixels. If this parameter is left empty, 0 will be used by default.
     * @param ImageHeight Output height of the small image in pixels. If this parameter is left empty, 0 will be used by default.
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get Output X-axis offset of the small image in pixels. The sum of `LocationX` and `ImageWidth` cannot exceed the total width of the output mixed stream. If this parameter is left empty, 0 will be used by default. 
     * @return LocationX Output X-axis offset of the small image in pixels. The sum of `LocationX` and `ImageWidth` cannot exceed the total width of the output mixed stream. If this parameter is left empty, 0 will be used by default.
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set Output X-axis offset of the small image in pixels. The sum of `LocationX` and `ImageWidth` cannot exceed the total width of the output mixed stream. If this parameter is left empty, 0 will be used by default.
     * @param LocationX Output X-axis offset of the small image in pixels. The sum of `LocationX` and `ImageWidth` cannot exceed the total width of the output mixed stream. If this parameter is left empty, 0 will be used by default.
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get Output Y-axis offset of the small image in pixels. The sum of `LocationY` and `ImageHeight` cannot exceed the total height of the output mixed stream. If this parameter is left empty, 0 will be used by default. 
     * @return LocationY Output Y-axis offset of the small image in pixels. The sum of `LocationY` and `ImageHeight` cannot exceed the total height of the output mixed stream. If this parameter is left empty, 0 will be used by default.
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set Output Y-axis offset of the small image in pixels. The sum of `LocationY` and `ImageHeight` cannot exceed the total height of the output mixed stream. If this parameter is left empty, 0 will be used by default.
     * @param LocationY Output Y-axis offset of the small image in pixels. The sum of `LocationY` and `ImageHeight` cannot exceed the total height of the output mixed stream. If this parameter is left empty, 0 will be used by default.
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

