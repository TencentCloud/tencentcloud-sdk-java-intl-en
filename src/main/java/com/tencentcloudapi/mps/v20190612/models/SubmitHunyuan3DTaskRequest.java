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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitHunyuan3DTaskRequest extends AbstractModel {

    /**
    * <p>Prompt for text-to-3D</p><p>Input limit: up to 1024 utf-8 characters</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Image URL (http/https) for image-to-3D</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>Generate 3D from multi-perspective images. At least 2 images are required, and a front view must be included.</p>
    */
    @SerializedName("MultiViewImages")
    @Expose
    private ViewImage [] MultiViewImages;

    /**
    * <p>Generation Type</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture)</li><li>Geometry: Generate only the geometry (no texture, faster output speed)</li><li>Texture: Generate only the texture (MeshUrl is required)</li></ul><p>Default value: Normal</p>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>URL of the existing 3D model (only .glb / .obj supported). If MeshUrl is passed, GenerateType=Texture is mandatory (texture scenario)</p>
    */
    @SerializedName("MeshUrl")
    @Expose
    private String MeshUrl;

    /**
    * <p>Whether to output the PBR material</p><p>Default value: false</p>
    */
    @SerializedName("EnablePBR")
    @Expose
    private Boolean EnablePBR;

    /**
    * <p>Patch count in the range of [3000, 1500000]. This parameter takes effect only for the Normal/Geometry branch.</p><p>Parameter value range: [3000, 1500000]</p><p>Default value: 500000</p>
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * <p>Reserve UV unfolding or not</p><p>Default value: false</p>
    */
    @SerializedName("KeepUV")
    @Expose
    private Boolean KeepUV;

    /**
    * <p>A format attached to the output in addition to the default obj + glb. Currently only support FBX</p>
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
    * <p>Random Seed. The result can be reproduced with identical Seed input.</p>
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * <p>Style control words</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
     * Get <p>Prompt for text-to-3D</p><p>Input limit: up to 1024 utf-8 characters</p> 
     * @return Prompt <p>Prompt for text-to-3D</p><p>Input limit: up to 1024 utf-8 characters</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt for text-to-3D</p><p>Input limit: up to 1024 utf-8 characters</p>
     * @param Prompt <p>Prompt for text-to-3D</p><p>Input limit: up to 1024 utf-8 characters</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Image URL (http/https) for image-to-3D</p> 
     * @return ImageUrl <p>Image URL (http/https) for image-to-3D</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>Image URL (http/https) for image-to-3D</p>
     * @param ImageUrl <p>Image URL (http/https) for image-to-3D</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>Generate 3D from multi-perspective images. At least 2 images are required, and a front view must be included.</p> 
     * @return MultiViewImages <p>Generate 3D from multi-perspective images. At least 2 images are required, and a front view must be included.</p>
     */
    public ViewImage [] getMultiViewImages() {
        return this.MultiViewImages;
    }

    /**
     * Set <p>Generate 3D from multi-perspective images. At least 2 images are required, and a front view must be included.</p>
     * @param MultiViewImages <p>Generate 3D from multi-perspective images. At least 2 images are required, and a front view must be included.</p>
     */
    public void setMultiViewImages(ViewImage [] MultiViewImages) {
        this.MultiViewImages = MultiViewImages;
    }

    /**
     * Get <p>Generation Type</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture)</li><li>Geometry: Generate only the geometry (no texture, faster output speed)</li><li>Texture: Generate only the texture (MeshUrl is required)</li></ul><p>Default value: Normal</p> 
     * @return GenerateType <p>Generation Type</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture)</li><li>Geometry: Generate only the geometry (no texture, faster output speed)</li><li>Texture: Generate only the texture (MeshUrl is required)</li></ul><p>Default value: Normal</p>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>Generation Type</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture)</li><li>Geometry: Generate only the geometry (no texture, faster output speed)</li><li>Texture: Generate only the texture (MeshUrl is required)</li></ul><p>Default value: Normal</p>
     * @param GenerateType <p>Generation Type</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture)</li><li>Geometry: Generate only the geometry (no texture, faster output speed)</li><li>Texture: Generate only the texture (MeshUrl is required)</li></ul><p>Default value: Normal</p>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>URL of the existing 3D model (only .glb / .obj supported). If MeshUrl is passed, GenerateType=Texture is mandatory (texture scenario)</p> 
     * @return MeshUrl <p>URL of the existing 3D model (only .glb / .obj supported). If MeshUrl is passed, GenerateType=Texture is mandatory (texture scenario)</p>
     */
    public String getMeshUrl() {
        return this.MeshUrl;
    }

    /**
     * Set <p>URL of the existing 3D model (only .glb / .obj supported). If MeshUrl is passed, GenerateType=Texture is mandatory (texture scenario)</p>
     * @param MeshUrl <p>URL of the existing 3D model (only .glb / .obj supported). If MeshUrl is passed, GenerateType=Texture is mandatory (texture scenario)</p>
     */
    public void setMeshUrl(String MeshUrl) {
        this.MeshUrl = MeshUrl;
    }

    /**
     * Get <p>Whether to output the PBR material</p><p>Default value: false</p> 
     * @return EnablePBR <p>Whether to output the PBR material</p><p>Default value: false</p>
     */
    public Boolean getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set <p>Whether to output the PBR material</p><p>Default value: false</p>
     * @param EnablePBR <p>Whether to output the PBR material</p><p>Default value: false</p>
     */
    public void setEnablePBR(Boolean EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    /**
     * Get <p>Patch count in the range of [3000, 1500000]. This parameter takes effect only for the Normal/Geometry branch.</p><p>Parameter value range: [3000, 1500000]</p><p>Default value: 500000</p> 
     * @return FaceCount <p>Patch count in the range of [3000, 1500000]. This parameter takes effect only for the Normal/Geometry branch.</p><p>Parameter value range: [3000, 1500000]</p><p>Default value: 500000</p>
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set <p>Patch count in the range of [3000, 1500000]. This parameter takes effect only for the Normal/Geometry branch.</p><p>Parameter value range: [3000, 1500000]</p><p>Default value: 500000</p>
     * @param FaceCount <p>Patch count in the range of [3000, 1500000]. This parameter takes effect only for the Normal/Geometry branch.</p><p>Parameter value range: [3000, 1500000]</p><p>Default value: 500000</p>
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get <p>Reserve UV unfolding or not</p><p>Default value: false</p> 
     * @return KeepUV <p>Reserve UV unfolding or not</p><p>Default value: false</p>
     */
    public Boolean getKeepUV() {
        return this.KeepUV;
    }

    /**
     * Set <p>Reserve UV unfolding or not</p><p>Default value: false</p>
     * @param KeepUV <p>Reserve UV unfolding or not</p><p>Default value: false</p>
     */
    public void setKeepUV(Boolean KeepUV) {
        this.KeepUV = KeepUV;
    }

    /**
     * Get <p>A format attached to the output in addition to the default obj + glb. Currently only support FBX</p> 
     * @return ResultFormat <p>A format attached to the output in addition to the default obj + glb. Currently only support FBX</p>
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set <p>A format attached to the output in addition to the default obj + glb. Currently only support FBX</p>
     * @param ResultFormat <p>A format attached to the output in addition to the default obj + glb. Currently only support FBX</p>
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    /**
     * Get <p>Random Seed. The result can be reproduced with identical Seed input.</p> 
     * @return Seed <p>Random Seed. The result can be reproduced with identical Seed input.</p>
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>Random Seed. The result can be reproduced with identical Seed input.</p>
     * @param Seed <p>Random Seed. The result can be reproduced with identical Seed input.</p>
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get <p>Style control words</p> 
     * @return Style <p>Style control words</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>Style control words</p>
     * @param Style <p>Style control words</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    public SubmitHunyuan3DTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuan3DTaskRequest(SubmitHunyuan3DTaskRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.MultiViewImages != null) {
            this.MultiViewImages = new ViewImage[source.MultiViewImages.length];
            for (int i = 0; i < source.MultiViewImages.length; i++) {
                this.MultiViewImages[i] = new ViewImage(source.MultiViewImages[i]);
            }
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.MeshUrl != null) {
            this.MeshUrl = new String(source.MeshUrl);
        }
        if (source.EnablePBR != null) {
            this.EnablePBR = new Boolean(source.EnablePBR);
        }
        if (source.FaceCount != null) {
            this.FaceCount = new Long(source.FaceCount);
        }
        if (source.KeepUV != null) {
            this.KeepUV = new Boolean(source.KeepUV);
        }
        if (source.ResultFormat != null) {
            this.ResultFormat = new String(source.ResultFormat);
        }
        if (source.Seed != null) {
            this.Seed = new Long(source.Seed);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamArrayObj(map, prefix + "MultiViewImages.", this.MultiViewImages);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "MeshUrl", this.MeshUrl);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);
        this.setParamSimple(map, prefix + "FaceCount", this.FaceCount);
        this.setParamSimple(map, prefix + "KeepUV", this.KeepUV);
        this.setParamSimple(map, prefix + "ResultFormat", this.ResultFormat);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "Style", this.Style);

    }
}

