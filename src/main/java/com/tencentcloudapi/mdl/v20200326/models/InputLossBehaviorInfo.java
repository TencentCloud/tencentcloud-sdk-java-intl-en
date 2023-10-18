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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputLossBehaviorInfo extends AbstractModel {

    /**
    * The time to fill in the last video frame, unit ms, range 0-1000000, 1000000 means always inserting, default 0 means filling in black screen frame.
    */
    @SerializedName("RepeatLastFrameMs")
    @Expose
    private Long RepeatLastFrameMs;

    /**
    * Fill frame type, COLOR means solid color filling, IMAGE means picture filling, the default is COLOR.
    */
    @SerializedName("InputLossImageType")
    @Expose
    private String InputLossImageType;

    /**
    * When the type is COLOR, the corresponding rgb value
    */
    @SerializedName("ColorRGB")
    @Expose
    private String ColorRGB;

    /**
    * When the type is IMAGE, the corresponding image url value
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get The time to fill in the last video frame, unit ms, range 0-1000000, 1000000 means always inserting, default 0 means filling in black screen frame. 
     * @return RepeatLastFrameMs The time to fill in the last video frame, unit ms, range 0-1000000, 1000000 means always inserting, default 0 means filling in black screen frame.
     */
    public Long getRepeatLastFrameMs() {
        return this.RepeatLastFrameMs;
    }

    /**
     * Set The time to fill in the last video frame, unit ms, range 0-1000000, 1000000 means always inserting, default 0 means filling in black screen frame.
     * @param RepeatLastFrameMs The time to fill in the last video frame, unit ms, range 0-1000000, 1000000 means always inserting, default 0 means filling in black screen frame.
     */
    public void setRepeatLastFrameMs(Long RepeatLastFrameMs) {
        this.RepeatLastFrameMs = RepeatLastFrameMs;
    }

    /**
     * Get Fill frame type, COLOR means solid color filling, IMAGE means picture filling, the default is COLOR. 
     * @return InputLossImageType Fill frame type, COLOR means solid color filling, IMAGE means picture filling, the default is COLOR.
     */
    public String getInputLossImageType() {
        return this.InputLossImageType;
    }

    /**
     * Set Fill frame type, COLOR means solid color filling, IMAGE means picture filling, the default is COLOR.
     * @param InputLossImageType Fill frame type, COLOR means solid color filling, IMAGE means picture filling, the default is COLOR.
     */
    public void setInputLossImageType(String InputLossImageType) {
        this.InputLossImageType = InputLossImageType;
    }

    /**
     * Get When the type is COLOR, the corresponding rgb value 
     * @return ColorRGB When the type is COLOR, the corresponding rgb value
     */
    public String getColorRGB() {
        return this.ColorRGB;
    }

    /**
     * Set When the type is COLOR, the corresponding rgb value
     * @param ColorRGB When the type is COLOR, the corresponding rgb value
     */
    public void setColorRGB(String ColorRGB) {
        this.ColorRGB = ColorRGB;
    }

    /**
     * Get When the type is IMAGE, the corresponding image url value 
     * @return ImageUrl When the type is IMAGE, the corresponding image url value
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set When the type is IMAGE, the corresponding image url value
     * @param ImageUrl When the type is IMAGE, the corresponding image url value
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public InputLossBehaviorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputLossBehaviorInfo(InputLossBehaviorInfo source) {
        if (source.RepeatLastFrameMs != null) {
            this.RepeatLastFrameMs = new Long(source.RepeatLastFrameMs);
        }
        if (source.InputLossImageType != null) {
            this.InputLossImageType = new String(source.InputLossImageType);
        }
        if (source.ColorRGB != null) {
            this.ColorRGB = new String(source.ColorRGB);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepeatLastFrameMs", this.RepeatLastFrameMs);
        this.setParamSimple(map, prefix + "InputLossImageType", this.InputLossImageType);
        this.setParamSimple(map, prefix + "ColorRGB", this.ColorRGB);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

