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

public class FrameCaptureTemplate extends AbstractModel {

    /**
    * Name of frame capture template, limited to uppercase and lowercase letters and numbers, with a length between 1 and 20 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Width of frame capture, optional, input range is from 0 to 3000, must be a multiple of 2.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height of frame capture, optional, input range is from 0 to 3000, must be a multiple of 2.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Interval of frame capture, an integer between 1 and 3600.
    */
    @SerializedName("CaptureInterval")
    @Expose
    private Long CaptureInterval;

    /**
    * Interval units of frame capture, only supports SECONDS.
    */
    @SerializedName("CaptureIntervalUnits")
    @Expose
    private String CaptureIntervalUnits;

    /**
    * Scaling behavior of frame capture, supports DEFAULT or STRETCH_TO_OUTPUT, with DEFAULT being the default option.
    */
    @SerializedName("ScalingBehavior")
    @Expose
    private String ScalingBehavior;

    /**
    * Sharpness, an integer between 0 and 100.
    */
    @SerializedName("Sharpness")
    @Expose
    private Long Sharpness;

    /**
     * Get Name of frame capture template, limited to uppercase and lowercase letters and numbers, with a length between 1 and 20 characters. 
     * @return Name Name of frame capture template, limited to uppercase and lowercase letters and numbers, with a length between 1 and 20 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of frame capture template, limited to uppercase and lowercase letters and numbers, with a length between 1 and 20 characters.
     * @param Name Name of frame capture template, limited to uppercase and lowercase letters and numbers, with a length between 1 and 20 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Width of frame capture, optional, input range is from 0 to 3000, must be a multiple of 2. 
     * @return Width Width of frame capture, optional, input range is from 0 to 3000, must be a multiple of 2.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of frame capture, optional, input range is from 0 to 3000, must be a multiple of 2.
     * @param Width Width of frame capture, optional, input range is from 0 to 3000, must be a multiple of 2.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height of frame capture, optional, input range is from 0 to 3000, must be a multiple of 2. 
     * @return Height Height of frame capture, optional, input range is from 0 to 3000, must be a multiple of 2.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of frame capture, optional, input range is from 0 to 3000, must be a multiple of 2.
     * @param Height Height of frame capture, optional, input range is from 0 to 3000, must be a multiple of 2.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Interval of frame capture, an integer between 1 and 3600. 
     * @return CaptureInterval Interval of frame capture, an integer between 1 and 3600.
     */
    public Long getCaptureInterval() {
        return this.CaptureInterval;
    }

    /**
     * Set Interval of frame capture, an integer between 1 and 3600.
     * @param CaptureInterval Interval of frame capture, an integer between 1 and 3600.
     */
    public void setCaptureInterval(Long CaptureInterval) {
        this.CaptureInterval = CaptureInterval;
    }

    /**
     * Get Interval units of frame capture, only supports SECONDS. 
     * @return CaptureIntervalUnits Interval units of frame capture, only supports SECONDS.
     */
    public String getCaptureIntervalUnits() {
        return this.CaptureIntervalUnits;
    }

    /**
     * Set Interval units of frame capture, only supports SECONDS.
     * @param CaptureIntervalUnits Interval units of frame capture, only supports SECONDS.
     */
    public void setCaptureIntervalUnits(String CaptureIntervalUnits) {
        this.CaptureIntervalUnits = CaptureIntervalUnits;
    }

    /**
     * Get Scaling behavior of frame capture, supports DEFAULT or STRETCH_TO_OUTPUT, with DEFAULT being the default option. 
     * @return ScalingBehavior Scaling behavior of frame capture, supports DEFAULT or STRETCH_TO_OUTPUT, with DEFAULT being the default option.
     */
    public String getScalingBehavior() {
        return this.ScalingBehavior;
    }

    /**
     * Set Scaling behavior of frame capture, supports DEFAULT or STRETCH_TO_OUTPUT, with DEFAULT being the default option.
     * @param ScalingBehavior Scaling behavior of frame capture, supports DEFAULT or STRETCH_TO_OUTPUT, with DEFAULT being the default option.
     */
    public void setScalingBehavior(String ScalingBehavior) {
        this.ScalingBehavior = ScalingBehavior;
    }

    /**
     * Get Sharpness, an integer between 0 and 100. 
     * @return Sharpness Sharpness, an integer between 0 and 100.
     */
    public Long getSharpness() {
        return this.Sharpness;
    }

    /**
     * Set Sharpness, an integer between 0 and 100.
     * @param Sharpness Sharpness, an integer between 0 and 100.
     */
    public void setSharpness(Long Sharpness) {
        this.Sharpness = Sharpness;
    }

    public FrameCaptureTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrameCaptureTemplate(FrameCaptureTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.CaptureInterval != null) {
            this.CaptureInterval = new Long(source.CaptureInterval);
        }
        if (source.CaptureIntervalUnits != null) {
            this.CaptureIntervalUnits = new String(source.CaptureIntervalUnits);
        }
        if (source.ScalingBehavior != null) {
            this.ScalingBehavior = new String(source.ScalingBehavior);
        }
        if (source.Sharpness != null) {
            this.Sharpness = new Long(source.Sharpness);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "CaptureInterval", this.CaptureInterval);
        this.setParamSimple(map, prefix + "CaptureIntervalUnits", this.CaptureIntervalUnits);
        this.setParamSimple(map, prefix + "ScalingBehavior", this.ScalingBehavior);
        this.setParamSimple(map, prefix + "Sharpness", this.Sharpness);

    }
}

