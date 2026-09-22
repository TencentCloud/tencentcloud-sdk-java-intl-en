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

public class AigcHunyuan3DTaskInput extends AbstractModel {

    /**
    * <p>Generate 3D reference image information.</p>
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcHunyuan3DReferenceImageInfo [] ImageInfos;

    /**
    * <p>Multi-perspective image information used to generate a 3D model.</p><p>The array length must be between 2 and 8 and must contain the front perspective.</p>
    */
    @SerializedName("MultiViewImageInfos")
    @Expose
    private AigcHunyuan3DMultiViewImageInfo [] MultiViewImageInfos;

    /**
    * <p>Prompt for generating a 3D model.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Generation Type.</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture);</li><li>Geometry: Generate only geometry (no texture, faster output speed);</li><li>Texture: Generate only texture (requires filling in MeshInfos)</li></ul>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>Reference 3D model used to generate a 3D model.</p>
    */
    @SerializedName("MeshInfos")
    @Expose
    private AigcHunyuan3DMeshInfo [] MeshInfos;

    /**
    * <p>Whether to enable output PBR material.</p><p>Enumeration values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable.</li></ul>
    */
    @SerializedName("EnablePBR")
    @Expose
    private String EnablePBR;

    /**
    * <p>Number of patches. This parameter is valid only when the value of GenerateType is Normal or Geometry.</p>
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * <p>Whether to retain UV unfolding.</p><p>Enumeration values:</p><ul><li>Enabled: reserved;</li><li>Disabled: not retain.</li></ul>
    */
    @SerializedName("KeepUV")
    @Expose
    private String KeepUV;

    /**
    * <p>Result format. In addition to the default return of obj and glb, an extra output format.</p><p>Enumeration values:</p><ul><li>FBX: FBX format file.</li></ul>
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
    * <p>Random Seed. Results can be reproduced with the same Seed input.</p>
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * <p>Style control word.</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * <p>Configuration of the output media file of the task.</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcHunyuan3DOutputConfig OutputConfig;

    /**
     * Get <p>Generate 3D reference image information.</p> 
     * @return ImageInfos <p>Generate 3D reference image information.</p>
     */
    public AigcHunyuan3DReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set <p>Generate 3D reference image information.</p>
     * @param ImageInfos <p>Generate 3D reference image information.</p>
     */
    public void setImageInfos(AigcHunyuan3DReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get <p>Multi-perspective image information used to generate a 3D model.</p><p>The array length must be between 2 and 8 and must contain the front perspective.</p> 
     * @return MultiViewImageInfos <p>Multi-perspective image information used to generate a 3D model.</p><p>The array length must be between 2 and 8 and must contain the front perspective.</p>
     */
    public AigcHunyuan3DMultiViewImageInfo [] getMultiViewImageInfos() {
        return this.MultiViewImageInfos;
    }

    /**
     * Set <p>Multi-perspective image information used to generate a 3D model.</p><p>The array length must be between 2 and 8 and must contain the front perspective.</p>
     * @param MultiViewImageInfos <p>Multi-perspective image information used to generate a 3D model.</p><p>The array length must be between 2 and 8 and must contain the front perspective.</p>
     */
    public void setMultiViewImageInfos(AigcHunyuan3DMultiViewImageInfo [] MultiViewImageInfos) {
        this.MultiViewImageInfos = MultiViewImageInfos;
    }

    /**
     * Get <p>Prompt for generating a 3D model.</p> 
     * @return Prompt <p>Prompt for generating a 3D model.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt for generating a 3D model.</p>
     * @param Prompt <p>Prompt for generating a 3D model.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Generation Type.</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture);</li><li>Geometry: Generate only geometry (no texture, faster output speed);</li><li>Texture: Generate only texture (requires filling in MeshInfos)</li></ul> 
     * @return GenerateType <p>Generation Type.</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture);</li><li>Geometry: Generate only geometry (no texture, faster output speed);</li><li>Texture: Generate only texture (requires filling in MeshInfos)</li></ul>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>Generation Type.</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture);</li><li>Geometry: Generate only geometry (no texture, faster output speed);</li><li>Texture: Generate only texture (requires filling in MeshInfos)</li></ul>
     * @param GenerateType <p>Generation Type.</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture);</li><li>Geometry: Generate only geometry (no texture, faster output speed);</li><li>Texture: Generate only texture (requires filling in MeshInfos)</li></ul>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>Reference 3D model used to generate a 3D model.</p> 
     * @return MeshInfos <p>Reference 3D model used to generate a 3D model.</p>
     */
    public AigcHunyuan3DMeshInfo [] getMeshInfos() {
        return this.MeshInfos;
    }

    /**
     * Set <p>Reference 3D model used to generate a 3D model.</p>
     * @param MeshInfos <p>Reference 3D model used to generate a 3D model.</p>
     */
    public void setMeshInfos(AigcHunyuan3DMeshInfo [] MeshInfos) {
        this.MeshInfos = MeshInfos;
    }

    /**
     * Get <p>Whether to enable output PBR material.</p><p>Enumeration values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable.</li></ul> 
     * @return EnablePBR <p>Whether to enable output PBR material.</p><p>Enumeration values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable.</li></ul>
     */
    public String getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set <p>Whether to enable output PBR material.</p><p>Enumeration values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable.</li></ul>
     * @param EnablePBR <p>Whether to enable output PBR material.</p><p>Enumeration values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable.</li></ul>
     */
    public void setEnablePBR(String EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    /**
     * Get <p>Number of patches. This parameter is valid only when the value of GenerateType is Normal or Geometry.</p> 
     * @return FaceCount <p>Number of patches. This parameter is valid only when the value of GenerateType is Normal or Geometry.</p>
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set <p>Number of patches. This parameter is valid only when the value of GenerateType is Normal or Geometry.</p>
     * @param FaceCount <p>Number of patches. This parameter is valid only when the value of GenerateType is Normal or Geometry.</p>
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get <p>Whether to retain UV unfolding.</p><p>Enumeration values:</p><ul><li>Enabled: reserved;</li><li>Disabled: not retain.</li></ul> 
     * @return KeepUV <p>Whether to retain UV unfolding.</p><p>Enumeration values:</p><ul><li>Enabled: reserved;</li><li>Disabled: not retain.</li></ul>
     */
    public String getKeepUV() {
        return this.KeepUV;
    }

    /**
     * Set <p>Whether to retain UV unfolding.</p><p>Enumeration values:</p><ul><li>Enabled: reserved;</li><li>Disabled: not retain.</li></ul>
     * @param KeepUV <p>Whether to retain UV unfolding.</p><p>Enumeration values:</p><ul><li>Enabled: reserved;</li><li>Disabled: not retain.</li></ul>
     */
    public void setKeepUV(String KeepUV) {
        this.KeepUV = KeepUV;
    }

    /**
     * Get <p>Result format. In addition to the default return of obj and glb, an extra output format.</p><p>Enumeration values:</p><ul><li>FBX: FBX format file.</li></ul> 
     * @return ResultFormat <p>Result format. In addition to the default return of obj and glb, an extra output format.</p><p>Enumeration values:</p><ul><li>FBX: FBX format file.</li></ul>
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set <p>Result format. In addition to the default return of obj and glb, an extra output format.</p><p>Enumeration values:</p><ul><li>FBX: FBX format file.</li></ul>
     * @param ResultFormat <p>Result format. In addition to the default return of obj and glb, an extra output format.</p><p>Enumeration values:</p><ul><li>FBX: FBX format file.</li></ul>
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    /**
     * Get <p>Random Seed. Results can be reproduced with the same Seed input.</p> 
     * @return Seed <p>Random Seed. Results can be reproduced with the same Seed input.</p>
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>Random Seed. Results can be reproduced with the same Seed input.</p>
     * @param Seed <p>Random Seed. Results can be reproduced with the same Seed input.</p>
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get <p>Style control word.</p> 
     * @return Style <p>Style control word.</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>Style control word.</p>
     * @param Style <p>Style control word.</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get <p>Configuration of the output media file of the task.</p> 
     * @return OutputConfig <p>Configuration of the output media file of the task.</p>
     */
    public AigcHunyuan3DOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>Configuration of the output media file of the task.</p>
     * @param OutputConfig <p>Configuration of the output media file of the task.</p>
     */
    public void setOutputConfig(AigcHunyuan3DOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public AigcHunyuan3DTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcHunyuan3DTaskInput(AigcHunyuan3DTaskInput source) {
        if (source.ImageInfos != null) {
            this.ImageInfos = new AigcHunyuan3DReferenceImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new AigcHunyuan3DReferenceImageInfo(source.ImageInfos[i]);
            }
        }
        if (source.MultiViewImageInfos != null) {
            this.MultiViewImageInfos = new AigcHunyuan3DMultiViewImageInfo[source.MultiViewImageInfos.length];
            for (int i = 0; i < source.MultiViewImageInfos.length; i++) {
                this.MultiViewImageInfos[i] = new AigcHunyuan3DMultiViewImageInfo(source.MultiViewImageInfos[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.MeshInfos != null) {
            this.MeshInfos = new AigcHunyuan3DMeshInfo[source.MeshInfos.length];
            for (int i = 0; i < source.MeshInfos.length; i++) {
                this.MeshInfos[i] = new AigcHunyuan3DMeshInfo(source.MeshInfos[i]);
            }
        }
        if (source.EnablePBR != null) {
            this.EnablePBR = new String(source.EnablePBR);
        }
        if (source.FaceCount != null) {
            this.FaceCount = new Long(source.FaceCount);
        }
        if (source.KeepUV != null) {
            this.KeepUV = new String(source.KeepUV);
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
        if (source.OutputConfig != null) {
            this.OutputConfig = new AigcHunyuan3DOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamArrayObj(map, prefix + "MultiViewImageInfos.", this.MultiViewImageInfos);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamArrayObj(map, prefix + "MeshInfos.", this.MeshInfos);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);
        this.setParamSimple(map, prefix + "FaceCount", this.FaceCount);
        this.setParamSimple(map, prefix + "KeepUV", this.KeepUV);
        this.setParamSimple(map, prefix + "ResultFormat", this.ResultFormat);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

