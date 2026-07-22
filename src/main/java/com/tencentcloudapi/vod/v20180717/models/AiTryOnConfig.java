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

public class AiTryOnConfig extends AbstractModel {

    /**
    * <p>Dress up model.</p><p>Enumeration value:</p><ul><li>WAND-tryon-1.0-lite: Lightweight tier, prioritizing speed.</li><li>WAND-tryon-1.0-flash: Balanced tier, taking into account effect and latency.</li><li>WAND-tryon-1.0-pro: High-quality tier, prioritizing effect.</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>Input the image list of clothing that needs to be replaced. 1-4 images are supported.</p>
    */
    @SerializedName("ClothesFileInfos")
    @Expose
    private SceneAigcImageTaskInputFileInfo [] ClothesFileInfos;

    /**
    * <p>Dress up command Prompt.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
     * Get <p>Dress up model.</p><p>Enumeration value:</p><ul><li>WAND-tryon-1.0-lite: Lightweight tier, prioritizing speed.</li><li>WAND-tryon-1.0-flash: Balanced tier, taking into account effect and latency.</li><li>WAND-tryon-1.0-pro: High-quality tier, prioritizing effect.</li></ul> 
     * @return Model <p>Dress up model.</p><p>Enumeration value:</p><ul><li>WAND-tryon-1.0-lite: Lightweight tier, prioritizing speed.</li><li>WAND-tryon-1.0-flash: Balanced tier, taking into account effect and latency.</li><li>WAND-tryon-1.0-pro: High-quality tier, prioritizing effect.</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>Dress up model.</p><p>Enumeration value:</p><ul><li>WAND-tryon-1.0-lite: Lightweight tier, prioritizing speed.</li><li>WAND-tryon-1.0-flash: Balanced tier, taking into account effect and latency.</li><li>WAND-tryon-1.0-pro: High-quality tier, prioritizing effect.</li></ul>
     * @param Model <p>Dress up model.</p><p>Enumeration value:</p><ul><li>WAND-tryon-1.0-lite: Lightweight tier, prioritizing speed.</li><li>WAND-tryon-1.0-flash: Balanced tier, taking into account effect and latency.</li><li>WAND-tryon-1.0-pro: High-quality tier, prioritizing effect.</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>Input the image list of clothing that needs to be replaced. 1-4 images are supported.</p> 
     * @return ClothesFileInfos <p>Input the image list of clothing that needs to be replaced. 1-4 images are supported.</p>
     */
    public SceneAigcImageTaskInputFileInfo [] getClothesFileInfos() {
        return this.ClothesFileInfos;
    }

    /**
     * Set <p>Input the image list of clothing that needs to be replaced. 1-4 images are supported.</p>
     * @param ClothesFileInfos <p>Input the image list of clothing that needs to be replaced. 1-4 images are supported.</p>
     */
    public void setClothesFileInfos(SceneAigcImageTaskInputFileInfo [] ClothesFileInfos) {
        this.ClothesFileInfos = ClothesFileInfos;
    }

    /**
     * Get <p>Dress up command Prompt.</p> 
     * @return Prompt <p>Dress up command Prompt.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Dress up command Prompt.</p>
     * @param Prompt <p>Dress up command Prompt.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    public AiTryOnConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiTryOnConfig(AiTryOnConfig source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
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
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "ClothesFileInfos.", this.ClothesFileInfos);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);

    }
}

