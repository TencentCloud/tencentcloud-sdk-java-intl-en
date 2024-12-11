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
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionConfig SuperResolution;

    /**
    * 
    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceConfig ColorEnhance;

    /**
    * 
    */
    @SerializedName("SharpEnhance")
    @Expose
    private SharpEnhanceConfig SharpEnhance;

    /**
    * 
    */
    @SerializedName("FaceEnhance")
    @Expose
    private FaceEnhanceConfig FaceEnhance;

    /**
     * Get Super-resolution configuration.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SuperResolution Super-resolution configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SuperResolutionConfig getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set Super-resolution configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SuperResolution Super-resolution configuration.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSuperResolution(SuperResolutionConfig SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get  
     * @return ColorEnhance 
     */
    public ColorEnhanceConfig getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set 
     * @param ColorEnhance 
     */
    public void setColorEnhance(ColorEnhanceConfig ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get  
     * @return SharpEnhance 
     */
    public SharpEnhanceConfig getSharpEnhance() {
        return this.SharpEnhance;
    }

    /**
     * Set 
     * @param SharpEnhance 
     */
    public void setSharpEnhance(SharpEnhanceConfig SharpEnhance) {
        this.SharpEnhance = SharpEnhance;
    }

    /**
     * Get  
     * @return FaceEnhance 
     */
    public FaceEnhanceConfig getFaceEnhance() {
        return this.FaceEnhance;
    }

    /**
     * Set 
     * @param FaceEnhance 
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

