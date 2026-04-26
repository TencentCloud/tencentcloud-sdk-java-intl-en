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

public class McuWaterMarkImage extends AbstractModel {

    /**
    * Watermark image URL address. supports png, jpg, and jpeg formats. image size limit not more than 5MB.
Note:.
Make sure the image link has data accessibility. the backend download timeout is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the watermark image will not take effect.
2. supported character sets for urls: ['0-9', 'a-z', 'a-z', '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if any characters exist outside the supported character sets, the watermark image will not take effect.
    */
    @SerializedName("WaterMarkUrl")
    @Expose
    private String WaterMarkUrl;

    /**
    * The watermark width (pixels).
    */
    @SerializedName("WaterMarkWidth")
    @Expose
    private Long WaterMarkWidth;

    /**
    * The watermark height (pixels).
    */
    @SerializedName("WaterMarkHeight")
    @Expose
    private Long WaterMarkHeight;

    /**
    * The horizontal offset (pixels) of the watermark.
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * The vertical offset (pixels) of the watermark.
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * The image layer of the watermark. If you do not pass this parameter, 0 will be used.
    */
    @SerializedName("ZOrder")
    @Expose
    private Long ZOrder;

    /**
    * 
    */
    @SerializedName("DynamicPosType")
    @Expose
    private Long DynamicPosType;

    /**
     * Get Watermark image URL address. supports png, jpg, and jpeg formats. image size limit not more than 5MB.
Note:.
Make sure the image link has data accessibility. the backend download timeout is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the watermark image will not take effect.
2. supported character sets for urls: ['0-9', 'a-z', 'a-z', '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if any characters exist outside the supported character sets, the watermark image will not take effect. 
     * @return WaterMarkUrl Watermark image URL address. supports png, jpg, and jpeg formats. image size limit not more than 5MB.
Note:.
Make sure the image link has data accessibility. the backend download timeout is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the watermark image will not take effect.
2. supported character sets for urls: ['0-9', 'a-z', 'a-z', '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if any characters exist outside the supported character sets, the watermark image will not take effect.
     */
    public String getWaterMarkUrl() {
        return this.WaterMarkUrl;
    }

    /**
     * Set Watermark image URL address. supports png, jpg, and jpeg formats. image size limit not more than 5MB.
Note:.
Make sure the image link has data accessibility. the backend download timeout is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the watermark image will not take effect.
2. supported character sets for urls: ['0-9', 'a-z', 'a-z', '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if any characters exist outside the supported character sets, the watermark image will not take effect.
     * @param WaterMarkUrl Watermark image URL address. supports png, jpg, and jpeg formats. image size limit not more than 5MB.
Note:.
Make sure the image link has data accessibility. the backend download timeout is 10 seconds with a maximum of 3 retries. if the image download fails eventually, the watermark image will not take effect.
2. supported character sets for urls: ['0-9', 'a-z', 'a-z', '-', '.', '_', '~', ':', '/', '?', '#', '[', ']', '@', '!', '&', '(', ')', '*', '+', ',', '%', '=', ';', '|']. make sure url characters are within the supported character sets. if any characters exist outside the supported character sets, the watermark image will not take effect.
     */
    public void setWaterMarkUrl(String WaterMarkUrl) {
        this.WaterMarkUrl = WaterMarkUrl;
    }

    /**
     * Get The watermark width (pixels). 
     * @return WaterMarkWidth The watermark width (pixels).
     */
    public Long getWaterMarkWidth() {
        return this.WaterMarkWidth;
    }

    /**
     * Set The watermark width (pixels).
     * @param WaterMarkWidth The watermark width (pixels).
     */
    public void setWaterMarkWidth(Long WaterMarkWidth) {
        this.WaterMarkWidth = WaterMarkWidth;
    }

    /**
     * Get The watermark height (pixels). 
     * @return WaterMarkHeight The watermark height (pixels).
     */
    public Long getWaterMarkHeight() {
        return this.WaterMarkHeight;
    }

    /**
     * Set The watermark height (pixels).
     * @param WaterMarkHeight The watermark height (pixels).
     */
    public void setWaterMarkHeight(Long WaterMarkHeight) {
        this.WaterMarkHeight = WaterMarkHeight;
    }

    /**
     * Get The horizontal offset (pixels) of the watermark. 
     * @return LocationX The horizontal offset (pixels) of the watermark.
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set The horizontal offset (pixels) of the watermark.
     * @param LocationX The horizontal offset (pixels) of the watermark.
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get The vertical offset (pixels) of the watermark. 
     * @return LocationY The vertical offset (pixels) of the watermark.
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set The vertical offset (pixels) of the watermark.
     * @param LocationY The vertical offset (pixels) of the watermark.
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get The image layer of the watermark. If you do not pass this parameter, 0 will be used. 
     * @return ZOrder The image layer of the watermark. If you do not pass this parameter, 0 will be used.
     */
    public Long getZOrder() {
        return this.ZOrder;
    }

    /**
     * Set The image layer of the watermark. If you do not pass this parameter, 0 will be used.
     * @param ZOrder The image layer of the watermark. If you do not pass this parameter, 0 will be used.
     */
    public void setZOrder(Long ZOrder) {
        this.ZOrder = ZOrder;
    }

    /**
     * Get  
     * @return DynamicPosType 
     */
    public Long getDynamicPosType() {
        return this.DynamicPosType;
    }

    /**
     * Set 
     * @param DynamicPosType 
     */
    public void setDynamicPosType(Long DynamicPosType) {
        this.DynamicPosType = DynamicPosType;
    }

    public McuWaterMarkImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuWaterMarkImage(McuWaterMarkImage source) {
        if (source.WaterMarkUrl != null) {
            this.WaterMarkUrl = new String(source.WaterMarkUrl);
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
        if (source.ZOrder != null) {
            this.ZOrder = new Long(source.ZOrder);
        }
        if (source.DynamicPosType != null) {
            this.DynamicPosType = new Long(source.DynamicPosType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkUrl", this.WaterMarkUrl);
        this.setParamSimple(map, prefix + "WaterMarkWidth", this.WaterMarkWidth);
        this.setParamSimple(map, prefix + "WaterMarkHeight", this.WaterMarkHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "ZOrder", this.ZOrder);
        this.setParamSimple(map, prefix + "DynamicPosType", this.DynamicPosType);

    }
}

