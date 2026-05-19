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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeClothesConfig extends AbstractModel {

    /**
    * <p>Input the image list of <strong>clothing</strong> that need to be replaced. Maximum support for each kind:</p><ul><li>change_clothes: 4 images;</li><li>change_clothes_under: 1 image;</li><li>change_clothes_full_wear: 1 image;</li><li>change_clothes_top_wear: 1 image;</li><li>change_clothes_bottom_wear: 1 image;</li></ul>
    */
    @SerializedName("ClothesFileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] ClothesFileInfos;

    /**
    * <p>Prompt for AI clothing change. <strong>Valid only when Type is change_clothes.</strong></p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
     * Get <p>Input the image list of <strong>clothing</strong> that need to be replaced. Maximum support for each kind:</p><ul><li>change_clothes: 4 images;</li><li>change_clothes_under: 1 image;</li><li>change_clothes_full_wear: 1 image;</li><li>change_clothes_top_wear: 1 image;</li><li>change_clothes_bottom_wear: 1 image;</li></ul> 
     * @return ClothesFileInfos <p>Input the image list of <strong>clothing</strong> that need to be replaced. Maximum support for each kind:</p><ul><li>change_clothes: 4 images;</li><li>change_clothes_under: 1 image;</li><li>change_clothes_full_wear: 1 image;</li><li>change_clothes_top_wear: 1 image;</li><li>change_clothes_bottom_wear: 1 image;</li></ul>
     */
    public SceneAigcImageTaskInputFileInfo [] getClothesFileInfos() {
        return this.ClothesFileInfos;
    }

    /**
     * Set <p>Input the image list of <strong>clothing</strong> that need to be replaced. Maximum support for each kind:</p><ul><li>change_clothes: 4 images;</li><li>change_clothes_under: 1 image;</li><li>change_clothes_full_wear: 1 image;</li><li>change_clothes_top_wear: 1 image;</li><li>change_clothes_bottom_wear: 1 image;</li></ul>
     * @param ClothesFileInfos <p>Input the image list of <strong>clothing</strong> that need to be replaced. Maximum support for each kind:</p><ul><li>change_clothes: 4 images;</li><li>change_clothes_under: 1 image;</li><li>change_clothes_full_wear: 1 image;</li><li>change_clothes_top_wear: 1 image;</li><li>change_clothes_bottom_wear: 1 image;</li></ul>
     */
    public void setClothesFileInfos(SceneAigcImageTaskInputFileInfo [] ClothesFileInfos) {
        this.ClothesFileInfos = ClothesFileInfos;
    }

    /**
     * Get <p>Prompt for AI clothing change. <strong>Valid only when Type is change_clothes.</strong></p> 
     * @return Prompt <p>Prompt for AI clothing change. <strong>Valid only when Type is change_clothes.</strong></p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt for AI clothing change. <strong>Valid only when Type is change_clothes.</strong></p>
     * @param Prompt <p>Prompt for AI clothing change. <strong>Valid only when Type is change_clothes.</strong></p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    public ChangeClothesConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeClothesConfig(ChangeClothesConfig source) {
        if (source.ClothesFileInfos != null) {
            this.ClothesFileInfos = new SceneAigcImageTaskInputFileInfo[source.ClothesFileInfos.length];
            for (int i = 0; i < source.ClothesFileInfos.length; i++) {
                this.ClothesFileInfos[i] = new SceneAigcImageTaskInputFileInfo(source.ClothesFileInfos[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ClothesFileInfos.", this.ClothesFileInfos);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);

    }
}

