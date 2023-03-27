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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WatermarkConfig extends AbstractModel{

    /**
    * The URL of the watermark image. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * The watermark width, which is expressed as a percentage of the video width. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Float Width;

    /**
    * The watermark height, which is expressed as a percentage of the video height. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Float Height;

    /**
    * The horizontal offset of the watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocationX")
    @Expose
    private Float LocationX;

    /**
    * The vertical offset of the watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocationY")
    @Expose
    private Float LocationY;

    /**
     * Get The URL of the watermark image. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url The URL of the watermark image. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The URL of the watermark image. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url The URL of the watermark image. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get The watermark width, which is expressed as a percentage of the video width. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Width The watermark width, which is expressed as a percentage of the video width. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getWidth() {
        return this.Width;
    }

    /**
     * Set The watermark width, which is expressed as a percentage of the video width. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Width The watermark width, which is expressed as a percentage of the video width. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Float Width) {
        this.Width = Width;
    }

    /**
     * Get The watermark height, which is expressed as a percentage of the video height. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Height The watermark height, which is expressed as a percentage of the video height. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getHeight() {
        return this.Height;
    }

    /**
     * Set The watermark height, which is expressed as a percentage of the video height. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Height The watermark height, which is expressed as a percentage of the video height. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(Float Height) {
        this.Height = Height;
    }

    /**
     * Get The horizontal offset of the watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LocationX The horizontal offset of the watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getLocationX() {
        return this.LocationX;
    }

    /**
     * Set The horizontal offset of the watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     * @param LocationX The horizontal offset of the watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle horizontally. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocationX(Float LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get The vertical offset of the watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LocationY The vertical offset of the watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getLocationY() {
        return this.LocationY;
    }

    /**
     * Set The vertical offset of the watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     * @param LocationY The vertical offset of the watermark, which is expressed as a percentage of the video width. For example, 50 indicates that the watermark will appear in the middle vertically. Value range: 0-100. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocationY(Float LocationY) {
        this.LocationY = LocationY;
    }

    public WatermarkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkConfig(WatermarkConfig source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Width != null) {
            this.Width = new Float(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Float(source.Height);
        }
        if (source.LocationX != null) {
            this.LocationX = new Float(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Float(source.LocationY);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);

    }
}

