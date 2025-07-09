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

public class WaterMark extends AbstractModel {

    /**
    * The watermark type. 0 (default): image; 1: text (not supported yet).
    */
    @SerializedName("WaterMarkType")
    @Expose
    private Long WaterMarkType;

    /**
    * The information of watermark images. This parameter is required if the watermark type is image.
    */
    @SerializedName("WaterMarkImage")
    @Expose
    private WaterMarkImage WaterMarkImage;

    /**
    * The information of the text watermark. This parameter is required if `WaterMarkType` is `1`.
    */
    @SerializedName("WaterMarkChar")
    @Expose
    private WaterMarkChar WaterMarkChar;

    /**
    * The information of the timestamp watermark. This parameter is required if `WaterMarkType` is `2`.
    */
    @SerializedName("WaterMarkTimestamp")
    @Expose
    private WaterMarkTimestamp WaterMarkTimestamp;

    /**
     * Get The watermark type. 0 (default): image; 1: text (not supported yet). 
     * @return WaterMarkType The watermark type. 0 (default): image; 1: text (not supported yet).
     */
    public Long getWaterMarkType() {
        return this.WaterMarkType;
    }

    /**
     * Set The watermark type. 0 (default): image; 1: text (not supported yet).
     * @param WaterMarkType The watermark type. 0 (default): image; 1: text (not supported yet).
     */
    public void setWaterMarkType(Long WaterMarkType) {
        this.WaterMarkType = WaterMarkType;
    }

    /**
     * Get The information of watermark images. This parameter is required if the watermark type is image. 
     * @return WaterMarkImage The information of watermark images. This parameter is required if the watermark type is image.
     */
    public WaterMarkImage getWaterMarkImage() {
        return this.WaterMarkImage;
    }

    /**
     * Set The information of watermark images. This parameter is required if the watermark type is image.
     * @param WaterMarkImage The information of watermark images. This parameter is required if the watermark type is image.
     */
    public void setWaterMarkImage(WaterMarkImage WaterMarkImage) {
        this.WaterMarkImage = WaterMarkImage;
    }

    /**
     * Get The information of the text watermark. This parameter is required if `WaterMarkType` is `1`. 
     * @return WaterMarkChar The information of the text watermark. This parameter is required if `WaterMarkType` is `1`.
     */
    public WaterMarkChar getWaterMarkChar() {
        return this.WaterMarkChar;
    }

    /**
     * Set The information of the text watermark. This parameter is required if `WaterMarkType` is `1`.
     * @param WaterMarkChar The information of the text watermark. This parameter is required if `WaterMarkType` is `1`.
     */
    public void setWaterMarkChar(WaterMarkChar WaterMarkChar) {
        this.WaterMarkChar = WaterMarkChar;
    }

    /**
     * Get The information of the timestamp watermark. This parameter is required if `WaterMarkType` is `2`. 
     * @return WaterMarkTimestamp The information of the timestamp watermark. This parameter is required if `WaterMarkType` is `2`.
     */
    public WaterMarkTimestamp getWaterMarkTimestamp() {
        return this.WaterMarkTimestamp;
    }

    /**
     * Set The information of the timestamp watermark. This parameter is required if `WaterMarkType` is `2`.
     * @param WaterMarkTimestamp The information of the timestamp watermark. This parameter is required if `WaterMarkType` is `2`.
     */
    public void setWaterMarkTimestamp(WaterMarkTimestamp WaterMarkTimestamp) {
        this.WaterMarkTimestamp = WaterMarkTimestamp;
    }

    public WaterMark() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterMark(WaterMark source) {
        if (source.WaterMarkType != null) {
            this.WaterMarkType = new Long(source.WaterMarkType);
        }
        if (source.WaterMarkImage != null) {
            this.WaterMarkImage = new WaterMarkImage(source.WaterMarkImage);
        }
        if (source.WaterMarkChar != null) {
            this.WaterMarkChar = new WaterMarkChar(source.WaterMarkChar);
        }
        if (source.WaterMarkTimestamp != null) {
            this.WaterMarkTimestamp = new WaterMarkTimestamp(source.WaterMarkTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkType", this.WaterMarkType);
        this.setParamObj(map, prefix + "WaterMarkImage.", this.WaterMarkImage);
        this.setParamObj(map, prefix + "WaterMarkChar.", this.WaterMarkChar);
        this.setParamObj(map, prefix + "WaterMarkTimestamp.", this.WaterMarkTimestamp);

    }
}

