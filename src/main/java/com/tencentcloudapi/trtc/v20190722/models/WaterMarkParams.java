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

public class WaterMarkParams extends AbstractModel{

    /**
    * Image ID of the watermark, which is generated after the image is uploaded to the TRTC console
    */
    @SerializedName("WaterMarkId")
    @Expose
    private Long WaterMarkId;

    /**
    * Width (px) of the watermark for On-Cloud MixTranscoding
    */
    @SerializedName("WaterMarkWidth")
    @Expose
    private Long WaterMarkWidth;

    /**
    * Height (px) of the watermark for On-Cloud MixTranscoding
    */
    @SerializedName("WaterMarkHeight")
    @Expose
    private Long WaterMarkHeight;

    /**
    * Horizontal offset (px) of the watermark
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * Vertical offset (px) of the watermark
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * URL of the watermark image for the mixed stream, which can be in PNG, JPG, JPEG, or BMP format and does not support the alpha channel. The URL must not exceed 512 bytes. When both `WaterMarkUrl` and `WaterMarkId` are specified, the former will be used. The watermark image cannot exceed 10 MB.
    */
    @SerializedName("WaterMarkUrl")
    @Expose
    private String WaterMarkUrl;

    /**
     * Get Image ID of the watermark, which is generated after the image is uploaded to the TRTC console 
     * @return WaterMarkId Image ID of the watermark, which is generated after the image is uploaded to the TRTC console
     */
    public Long getWaterMarkId() {
        return this.WaterMarkId;
    }

    /**
     * Set Image ID of the watermark, which is generated after the image is uploaded to the TRTC console
     * @param WaterMarkId Image ID of the watermark, which is generated after the image is uploaded to the TRTC console
     */
    public void setWaterMarkId(Long WaterMarkId) {
        this.WaterMarkId = WaterMarkId;
    }

    /**
     * Get Width (px) of the watermark for On-Cloud MixTranscoding 
     * @return WaterMarkWidth Width (px) of the watermark for On-Cloud MixTranscoding
     */
    public Long getWaterMarkWidth() {
        return this.WaterMarkWidth;
    }

    /**
     * Set Width (px) of the watermark for On-Cloud MixTranscoding
     * @param WaterMarkWidth Width (px) of the watermark for On-Cloud MixTranscoding
     */
    public void setWaterMarkWidth(Long WaterMarkWidth) {
        this.WaterMarkWidth = WaterMarkWidth;
    }

    /**
     * Get Height (px) of the watermark for On-Cloud MixTranscoding 
     * @return WaterMarkHeight Height (px) of the watermark for On-Cloud MixTranscoding
     */
    public Long getWaterMarkHeight() {
        return this.WaterMarkHeight;
    }

    /**
     * Set Height (px) of the watermark for On-Cloud MixTranscoding
     * @param WaterMarkHeight Height (px) of the watermark for On-Cloud MixTranscoding
     */
    public void setWaterMarkHeight(Long WaterMarkHeight) {
        this.WaterMarkHeight = WaterMarkHeight;
    }

    /**
     * Get Horizontal offset (px) of the watermark 
     * @return LocationX Horizontal offset (px) of the watermark
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set Horizontal offset (px) of the watermark
     * @param LocationX Horizontal offset (px) of the watermark
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get Vertical offset (px) of the watermark 
     * @return LocationY Vertical offset (px) of the watermark
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set Vertical offset (px) of the watermark
     * @param LocationY Vertical offset (px) of the watermark
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get URL of the watermark image for the mixed stream, which can be in PNG, JPG, JPEG, or BMP format and does not support the alpha channel. The URL must not exceed 512 bytes. When both `WaterMarkUrl` and `WaterMarkId` are specified, the former will be used. The watermark image cannot exceed 10 MB. 
     * @return WaterMarkUrl URL of the watermark image for the mixed stream, which can be in PNG, JPG, JPEG, or BMP format and does not support the alpha channel. The URL must not exceed 512 bytes. When both `WaterMarkUrl` and `WaterMarkId` are specified, the former will be used. The watermark image cannot exceed 10 MB.
     */
    public String getWaterMarkUrl() {
        return this.WaterMarkUrl;
    }

    /**
     * Set URL of the watermark image for the mixed stream, which can be in PNG, JPG, JPEG, or BMP format and does not support the alpha channel. The URL must not exceed 512 bytes. When both `WaterMarkUrl` and `WaterMarkId` are specified, the former will be used. The watermark image cannot exceed 10 MB.
     * @param WaterMarkUrl URL of the watermark image for the mixed stream, which can be in PNG, JPG, JPEG, or BMP format and does not support the alpha channel. The URL must not exceed 512 bytes. When both `WaterMarkUrl` and `WaterMarkId` are specified, the former will be used. The watermark image cannot exceed 10 MB.
     */
    public void setWaterMarkUrl(String WaterMarkUrl) {
        this.WaterMarkUrl = WaterMarkUrl;
    }

    public WaterMarkParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterMarkParams(WaterMarkParams source) {
        if (source.WaterMarkId != null) {
            this.WaterMarkId = new Long(source.WaterMarkId);
        }
        if (source.WaterMarkWidth != null) {
            this.WaterMarkWidth = new Long(source.WaterMarkWidth);
        }
        if (source.WaterMarkHeight != null) {
            this.WaterMarkHeight = new Long(source.WaterMarkHeight);
        }
        if (source.LocationX != null) {
            this.LocationX = new Long(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Long(source.LocationY);
        }
        if (source.WaterMarkUrl != null) {
            this.WaterMarkUrl = new String(source.WaterMarkUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkId", this.WaterMarkId);
        this.setParamSimple(map, prefix + "WaterMarkWidth", this.WaterMarkWidth);
        this.setParamSimple(map, prefix + "WaterMarkHeight", this.WaterMarkHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "WaterMarkUrl", this.WaterMarkUrl);

    }
}

