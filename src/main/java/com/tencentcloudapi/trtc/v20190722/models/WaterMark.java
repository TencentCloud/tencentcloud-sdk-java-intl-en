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

public class WaterMark extends AbstractModel{

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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WaterMarkType", this.WaterMarkType);
        this.setParamObj(map, prefix + "WaterMarkImage.", this.WaterMarkImage);

    }
}

