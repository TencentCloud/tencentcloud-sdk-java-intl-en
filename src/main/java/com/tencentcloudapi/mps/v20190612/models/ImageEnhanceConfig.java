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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageEnhanceConfig extends AbstractModel {

    /**
    * Super-resolution configuration.

    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionConfig SuperResolution;

    /**
    * Color enhancement configuration.

    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceConfig ColorEnhance;

    /**
    * Detail enhancement configuration.

    */
    @SerializedName("SharpEnhance")
    @Expose
    private SharpEnhanceConfig SharpEnhance;

    /**
    * Face enhancement configuration.

    */
    @SerializedName("FaceEnhance")
    @Expose
    private FaceEnhanceConfig FaceEnhance;

    /**
     * Get Super-resolution configuration.
 
     * @return SuperResolution Super-resolution configuration.

     */
    public SuperResolutionConfig getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set Super-resolution configuration.

     * @param SuperResolution Super-resolution configuration.

     */
    public void setSuperResolution(SuperResolutionConfig SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get Color enhancement configuration.
 
     * @return ColorEnhance Color enhancement configuration.

     */
    public ColorEnhanceConfig getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set Color enhancement configuration.

     * @param ColorEnhance Color enhancement configuration.

     */
    public void setColorEnhance(ColorEnhanceConfig ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get Detail enhancement configuration.
 
     * @return SharpEnhance Detail enhancement configuration.

     */
    public SharpEnhanceConfig getSharpEnhance() {
        return this.SharpEnhance;
    }

    /**
     * Set Detail enhancement configuration.

     * @param SharpEnhance Detail enhancement configuration.

     */
    public void setSharpEnhance(SharpEnhanceConfig SharpEnhance) {
        this.SharpEnhance = SharpEnhance;
    }

    /**
     * Get Face enhancement configuration.
 
     * @return FaceEnhance Face enhancement configuration.

     */
    public FaceEnhanceConfig getFaceEnhance() {
        return this.FaceEnhance;
    }

    /**
     * Set Face enhancement configuration.

     * @param FaceEnhance Face enhancement configuration.

     */
    public void setFaceEnhance(FaceEnhanceConfig FaceEnhance) {
        this.FaceEnhance = FaceEnhance;
    }

    public ImageEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageEnhanceConfig(ImageEnhanceConfig source) {
        if (source.SuperResolution != null) {
            this.SuperResolution = new SuperResolutionConfig(source.SuperResolution);
        }
        if (source.ColorEnhance != null) {
            this.ColorEnhance = new ColorEnhanceConfig(source.ColorEnhance);
        }
        if (source.SharpEnhance != null) {
            this.SharpEnhance = new SharpEnhanceConfig(source.SharpEnhance);
        }
        if (source.FaceEnhance != null) {
            this.FaceEnhance = new FaceEnhanceConfig(source.FaceEnhance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SuperResolution.", this.SuperResolution);
        this.setParamObj(map, prefix + "ColorEnhance.", this.ColorEnhance);
        this.setParamObj(map, prefix + "SharpEnhance.", this.SharpEnhance);
        this.setParamObj(map, prefix + "FaceEnhance.", this.FaceEnhance);

    }
}

