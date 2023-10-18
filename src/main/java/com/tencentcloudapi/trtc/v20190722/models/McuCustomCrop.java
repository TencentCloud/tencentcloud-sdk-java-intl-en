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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuCustomCrop extends AbstractModel {

    /**
    * The horizontal offset (pixels) of the starting point for cropping. This parameter must be greater than 0.
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * The vertical offset (pixels) of the starting point for cropping. This parameter must be greater than 0.
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * The video width (pixels) after cropping. The sum of this parameter and `LocationX` cannot be greater than 10000.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The video height (pixels) after cropping. The sum of this parameter and `LocationY` cannot be greater than 10000.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get The horizontal offset (pixels) of the starting point for cropping. This parameter must be greater than 0. 
     * @return LocationX The horizontal offset (pixels) of the starting point for cropping. This parameter must be greater than 0.
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set The horizontal offset (pixels) of the starting point for cropping. This parameter must be greater than 0.
     * @param LocationX The horizontal offset (pixels) of the starting point for cropping. This parameter must be greater than 0.
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get The vertical offset (pixels) of the starting point for cropping. This parameter must be greater than 0. 
     * @return LocationY The vertical offset (pixels) of the starting point for cropping. This parameter must be greater than 0.
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set The vertical offset (pixels) of the starting point for cropping. This parameter must be greater than 0.
     * @param LocationY The vertical offset (pixels) of the starting point for cropping. This parameter must be greater than 0.
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get The video width (pixels) after cropping. The sum of this parameter and `LocationX` cannot be greater than 10000. 
     * @return Width The video width (pixels) after cropping. The sum of this parameter and `LocationX` cannot be greater than 10000.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The video width (pixels) after cropping. The sum of this parameter and `LocationX` cannot be greater than 10000.
     * @param Width The video width (pixels) after cropping. The sum of this parameter and `LocationX` cannot be greater than 10000.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The video height (pixels) after cropping. The sum of this parameter and `LocationY` cannot be greater than 10000. 
     * @return Height The video height (pixels) after cropping. The sum of this parameter and `LocationY` cannot be greater than 10000.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The video height (pixels) after cropping. The sum of this parameter and `LocationY` cannot be greater than 10000.
     * @param Height The video height (pixels) after cropping. The sum of this parameter and `LocationY` cannot be greater than 10000.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public McuCustomCrop() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuCustomCrop(McuCustomCrop source) {
        if (source.LocationX != null) {
            this.LocationX = new Long(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Long(source.LocationY);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

