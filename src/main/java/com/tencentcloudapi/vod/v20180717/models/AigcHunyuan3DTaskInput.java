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
    * 
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcHunyuan3DReferenceImageInfo [] ImageInfos;

    /**
    * 
    */
    @SerializedName("MultiViewImageInfos")
    @Expose
    private AigcHunyuan3DMultiViewImageInfo [] MultiViewImageInfos;

    /**
    * 
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * 
    */
    @SerializedName("MeshInfos")
    @Expose
    private AigcHunyuan3DMeshInfo [] MeshInfos;

    /**
    * 
    */
    @SerializedName("EnablePBR")
    @Expose
    private String EnablePBR;

    /**
    * 
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * 
    */
    @SerializedName("KeepUV")
    @Expose
    private String KeepUV;

    /**
    * 
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
    * 
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * 
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * 
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcHunyuan3DOutputConfig OutputConfig;

    /**
     * Get  
     * @return ImageInfos 
     */
    public AigcHunyuan3DReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set 
     * @param ImageInfos 
     */
    public void setImageInfos(AigcHunyuan3DReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get  
     * @return MultiViewImageInfos 
     */
    public AigcHunyuan3DMultiViewImageInfo [] getMultiViewImageInfos() {
        return this.MultiViewImageInfos;
    }

    /**
     * Set 
     * @param MultiViewImageInfos 
     */
    public void setMultiViewImageInfos(AigcHunyuan3DMultiViewImageInfo [] MultiViewImageInfos) {
        this.MultiViewImageInfos = MultiViewImageInfos;
    }

    /**
     * Get  
     * @return Prompt 
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 
     * @param Prompt 
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get  
     * @return GenerateType 
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set 
     * @param GenerateType 
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get  
     * @return MeshInfos 
     */
    public AigcHunyuan3DMeshInfo [] getMeshInfos() {
        return this.MeshInfos;
    }

    /**
     * Set 
     * @param MeshInfos 
     */
    public void setMeshInfos(AigcHunyuan3DMeshInfo [] MeshInfos) {
        this.MeshInfos = MeshInfos;
    }

    /**
     * Get  
     * @return EnablePBR 
     */
    public String getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set 
     * @param EnablePBR 
     */
    public void setEnablePBR(String EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    /**
     * Get  
     * @return FaceCount 
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set 
     * @param FaceCount 
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get  
     * @return KeepUV 
     */
    public String getKeepUV() {
        return this.KeepUV;
    }

    /**
     * Set 
     * @param KeepUV 
     */
    public void setKeepUV(String KeepUV) {
        this.KeepUV = KeepUV;
    }

    /**
     * Get  
     * @return ResultFormat 
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set 
     * @param ResultFormat 
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    /**
     * Get  
     * @return Seed 
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set 
     * @param Seed 
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get  
     * @return Style 
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set 
     * @param Style 
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get  
     * @return OutputConfig 
     */
    public AigcHunyuan3DOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set 
     * @param OutputConfig 
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

