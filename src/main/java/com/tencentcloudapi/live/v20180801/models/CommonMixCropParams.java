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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMixCropParams extends AbstractModel{

    /**
    * Crop width. Value range: [0,3000].
    */
    @SerializedName("CropWidth")
    @Expose
    private Float CropWidth;

    /**
    * Crop height. Value range: [0,3000].
    */
    @SerializedName("CropHeight")
    @Expose
    private Float CropHeight;

    /**
    * Starting crop X coordinate. Value range: [0,3000].
    */
    @SerializedName("CropStartLocationX")
    @Expose
    private Float CropStartLocationX;

    /**
    * Starting crop Y coordinate. Value range: [0,3000].
    */
    @SerializedName("CropStartLocationY")
    @Expose
    private Float CropStartLocationY;

    /**
     * Get Crop width. Value range: [0,3000]. 
     * @return CropWidth Crop width. Value range: [0,3000].
     */
    public Float getCropWidth() {
        return this.CropWidth;
    }

    /**
     * Set Crop width. Value range: [0,3000].
     * @param CropWidth Crop width. Value range: [0,3000].
     */
    public void setCropWidth(Float CropWidth) {
        this.CropWidth = CropWidth;
    }

    /**
     * Get Crop height. Value range: [0,3000]. 
     * @return CropHeight Crop height. Value range: [0,3000].
     */
    public Float getCropHeight() {
        return this.CropHeight;
    }

    /**
     * Set Crop height. Value range: [0,3000].
     * @param CropHeight Crop height. Value range: [0,3000].
     */
    public void setCropHeight(Float CropHeight) {
        this.CropHeight = CropHeight;
    }

    /**
     * Get Starting crop X coordinate. Value range: [0,3000]. 
     * @return CropStartLocationX Starting crop X coordinate. Value range: [0,3000].
     */
    public Float getCropStartLocationX() {
        return this.CropStartLocationX;
    }

    /**
     * Set Starting crop X coordinate. Value range: [0,3000].
     * @param CropStartLocationX Starting crop X coordinate. Value range: [0,3000].
     */
    public void setCropStartLocationX(Float CropStartLocationX) {
        this.CropStartLocationX = CropStartLocationX;
    }

    /**
     * Get Starting crop Y coordinate. Value range: [0,3000]. 
     * @return CropStartLocationY Starting crop Y coordinate. Value range: [0,3000].
     */
    public Float getCropStartLocationY() {
        return this.CropStartLocationY;
    }

    /**
     * Set Starting crop Y coordinate. Value range: [0,3000].
     * @param CropStartLocationY Starting crop Y coordinate. Value range: [0,3000].
     */
    public void setCropStartLocationY(Float CropStartLocationY) {
        this.CropStartLocationY = CropStartLocationY;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CropWidth", this.CropWidth);
        this.setParamSimple(map, prefix + "CropHeight", this.CropHeight);
        this.setParamSimple(map, prefix + "CropStartLocationX", this.CropStartLocationX);
        this.setParamSimple(map, prefix + "CropStartLocationY", this.CropStartLocationY);

    }
}

