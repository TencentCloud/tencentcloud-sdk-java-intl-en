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

public class McuWaterMarkParams extends AbstractModel {

    /**
    * The watermark type. Valid values: `0` (default): Image; `1`: Text.
    */
    @SerializedName("WaterMarkType")
    @Expose
    private Long WaterMarkType;

    /**
    * The watermark image information. This parameter is required if `WaterMarkType` is 0.
    */
    @SerializedName("WaterMarkImage")
    @Expose
    private McuWaterMarkImage WaterMarkImage;

    /**
    * The text watermark configuration. This parameter is required if `WaterMarkType` is `1`.
    */
    @SerializedName("WaterMarkText")
    @Expose
    private McuWaterMarkText WaterMarkText;

    /**
     * Get The watermark type. Valid values: `0` (default): Image; `1`: Text. 
     * @return WaterMarkType The watermark type. Valid values: `0` (default): Image; `1`: Text.
     */
    public Long getWaterMarkType() {
        return this.WaterMarkType;
    }

    /**
     * Set The watermark type. Valid values: `0` (default): Image; `1`: Text.
     * @param WaterMarkType The watermark type. Valid values: `0` (default): Image; `1`: Text.
     */
    public void setWaterMarkType(Long WaterMarkType) {
        this.WaterMarkType = WaterMarkType;
    }

    /**
     * Get The watermark image information. This parameter is required if `WaterMarkType` is 0. 
     * @return WaterMarkImage The watermark image information. This parameter is required if `WaterMarkType` is 0.
     */
    public McuWaterMarkImage getWaterMarkImage() {
        return this.WaterMarkImage;
    }

    /**
     * Set The watermark image information. This parameter is required if `WaterMarkType` is 0.
     * @param WaterMarkImage The watermark image information. This parameter is required if `WaterMarkType` is 0.
     */
    public void setWaterMarkImage(McuWaterMarkImage WaterMarkImage) {
        this.WaterMarkImage = WaterMarkImage;
    }

    /**
     * Get The text watermark configuration. This parameter is required if `WaterMarkType` is `1`. 
     * @return WaterMarkText The text watermark configuration. This parameter is required if `WaterMarkType` is `1`.
     */
    public McuWaterMarkText getWaterMarkText() {
        return this.WaterMarkText;
    }

    /**
     * Set The text watermark configuration. This parameter is required if `WaterMarkType` is `1`.
     * @param WaterMarkText The text watermark configuration. This parameter is required if `WaterMarkType` is `1`.
     */
    public void setWaterMarkText(McuWaterMarkText WaterMarkText) {
        this.WaterMarkText = WaterMarkText;
    }

    public McuWaterMarkParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuWaterMarkParams(McuWaterMarkParams source) {
        if (source.WaterMarkType != null) {
            this.WaterMarkType = new Long(source.WaterMarkType);
        }
        if (source.WaterMarkImage != null) {
            this.WaterMarkImage = new McuWaterMarkImage(source.WaterMarkImage);
        }
        if (source.WaterMarkText != null) {
            this.WaterMarkText = new McuWaterMarkText(source.WaterMarkText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkType", this.WaterMarkType);
        this.setParamObj(map, prefix + "WaterMarkImage.", this.WaterMarkImage);
        this.setParamObj(map, prefix + "WaterMarkText.", this.WaterMarkText);

    }
}

