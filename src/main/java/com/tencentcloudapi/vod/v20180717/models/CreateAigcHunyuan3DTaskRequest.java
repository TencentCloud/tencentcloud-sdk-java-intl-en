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

public class CreateAigcHunyuan3DTaskRequest extends AbstractModel {

    /**
    * <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), this field must be filled with the app ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Generate reference image information for the 3D model.</p><p>Input parameter limit: The maximum array length is 1.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive. One and only one must be filled in.</p>
    */
    @SerializedName("ImageInfos")
    @Expose
    private AigcHunyuan3DReferenceImageInfo [] ImageInfos;

    /**
    * <p>Multi-perspective image information used to generate 3D models.</p><p>Input limitations: The array length must be between 2 and 8, and it must contain the front perspective.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive with each other. One and only one must be filled in.</p>
    */
    @SerializedName("MultiViewImageInfos")
    @Expose
    private AigcHunyuan3DMultiViewImageInfo [] MultiViewImageInfos;

    /**
    * <p>Prompt content for generating a 3D model.</p><p>Input parameter limit: up to 1024 utf-8 characters.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive. One and only one must be filled in.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>Generation Type.</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture);</li><li>Geometry: Generate only geometry (no texture, faster output speed);</li><li>Texture: Generate only texture (requires filling in MeshInfos)</li></ul><p>Default value: Normal</p>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>Reference 3D model used to generate a 3D model.</p><p>Input parameter limit: when MeshInfos is filled in, GenerateType must be set to Texture (texture scenario).</p>
    */
    @SerializedName("MeshInfos")
    @Expose
    private AigcHunyuan3DMeshInfo [] MeshInfos;

    /**
    * <p>Whether to enable output of PBR materials.</p><p>Enumeration values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable.</li></ul><p>Default value: Disabled</p>
    */
    @SerializedName("EnablePBR")
    @Expose
    private String EnablePBR;

    /**
    * <p>Number of patches. This parameter is valid only when GenerateType is Normal or Geometry.</p><p>Value range: [3000, 1500000]</p><p>Default value: 500000</p>
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * <p>Whether to reserve UV unfolding.</p><p>Enumeration values:</p><ul><li>Enabled: reserved;</li><li>Disabled: not retain.</li></ul><p>Default value: Disabled</p>
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
    * <p>Random Seed. Results are reproducible with the same Seed input.</p><p>Value range: [0, 2147483647]</p>
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
    * <p>Output media file configuration of the task.</p>
    */
    @SerializedName("OutputConfig")
    @Expose
    private AigcHunyuan3DOutputConfig OutputConfig;

    /**
    * <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), this field must be filled with the app ID.</b></p> 
     * @return SubAppId <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), this field must be filled with the app ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), this field must be filled with the app ID.</b></p>
     * @param SubAppId <p><b>On-demand <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate on-demand services from December 25, 2023, if they access resources in on-demand applications (whether the default application or a newly created application), this field must be filled with the app ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Generate reference image information for the 3D model.</p><p>Input parameter limit: The maximum array length is 1.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive. One and only one must be filled in.</p> 
     * @return ImageInfos <p>Generate reference image information for the 3D model.</p><p>Input parameter limit: The maximum array length is 1.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive. One and only one must be filled in.</p>
     */
    public AigcHunyuan3DReferenceImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set <p>Generate reference image information for the 3D model.</p><p>Input parameter limit: The maximum array length is 1.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive. One and only one must be filled in.</p>
     * @param ImageInfos <p>Generate reference image information for the 3D model.</p><p>Input parameter limit: The maximum array length is 1.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive. One and only one must be filled in.</p>
     */
    public void setImageInfos(AigcHunyuan3DReferenceImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get <p>Multi-perspective image information used to generate 3D models.</p><p>Input limitations: The array length must be between 2 and 8, and it must contain the front perspective.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive with each other. One and only one must be filled in.</p> 
     * @return MultiViewImageInfos <p>Multi-perspective image information used to generate 3D models.</p><p>Input limitations: The array length must be between 2 and 8, and it must contain the front perspective.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive with each other. One and only one must be filled in.</p>
     */
    public AigcHunyuan3DMultiViewImageInfo [] getMultiViewImageInfos() {
        return this.MultiViewImageInfos;
    }

    /**
     * Set <p>Multi-perspective image information used to generate 3D models.</p><p>Input limitations: The array length must be between 2 and 8, and it must contain the front perspective.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive with each other. One and only one must be filled in.</p>
     * @param MultiViewImageInfos <p>Multi-perspective image information used to generate 3D models.</p><p>Input limitations: The array length must be between 2 and 8, and it must contain the front perspective.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive with each other. One and only one must be filled in.</p>
     */
    public void setMultiViewImageInfos(AigcHunyuan3DMultiViewImageInfo [] MultiViewImageInfos) {
        this.MultiViewImageInfos = MultiViewImageInfos;
    }

    /**
     * Get <p>Prompt content for generating a 3D model.</p><p>Input parameter limit: up to 1024 utf-8 characters.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive. One and only one must be filled in.</p> 
     * @return Prompt <p>Prompt content for generating a 3D model.</p><p>Input parameter limit: up to 1024 utf-8 characters.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive. One and only one must be filled in.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Prompt content for generating a 3D model.</p><p>Input parameter limit: up to 1024 utf-8 characters.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive. One and only one must be filled in.</p>
     * @param Prompt <p>Prompt content for generating a 3D model.</p><p>Input parameter limit: up to 1024 utf-8 characters.</p><p>The three input parameters ImageInfos, MultiViewImageInfos, and Prompt are mutually exclusive. One and only one must be filled in.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>Generation Type.</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture);</li><li>Geometry: Generate only geometry (no texture, faster output speed);</li><li>Texture: Generate only texture (requires filling in MeshInfos)</li></ul><p>Default value: Normal</p> 
     * @return GenerateType <p>Generation Type.</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture);</li><li>Geometry: Generate only geometry (no texture, faster output speed);</li><li>Texture: Generate only texture (requires filling in MeshInfos)</li></ul><p>Default value: Normal</p>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>Generation Type.</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture);</li><li>Geometry: Generate only geometry (no texture, faster output speed);</li><li>Texture: Generate only texture (requires filling in MeshInfos)</li></ul><p>Default value: Normal</p>
     * @param GenerateType <p>Generation Type.</p><p>Enumeration values:</p><ul><li>Normal: Generate a complete 3D asset (geometry + texture);</li><li>Geometry: Generate only geometry (no texture, faster output speed);</li><li>Texture: Generate only texture (requires filling in MeshInfos)</li></ul><p>Default value: Normal</p>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>Reference 3D model used to generate a 3D model.</p><p>Input parameter limit: when MeshInfos is filled in, GenerateType must be set to Texture (texture scenario).</p> 
     * @return MeshInfos <p>Reference 3D model used to generate a 3D model.</p><p>Input parameter limit: when MeshInfos is filled in, GenerateType must be set to Texture (texture scenario).</p>
     */
    public AigcHunyuan3DMeshInfo [] getMeshInfos() {
        return this.MeshInfos;
    }

    /**
     * Set <p>Reference 3D model used to generate a 3D model.</p><p>Input parameter limit: when MeshInfos is filled in, GenerateType must be set to Texture (texture scenario).</p>
     * @param MeshInfos <p>Reference 3D model used to generate a 3D model.</p><p>Input parameter limit: when MeshInfos is filled in, GenerateType must be set to Texture (texture scenario).</p>
     */
    public void setMeshInfos(AigcHunyuan3DMeshInfo [] MeshInfos) {
        this.MeshInfos = MeshInfos;
    }

    /**
     * Get <p>Whether to enable output of PBR materials.</p><p>Enumeration values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable.</li></ul><p>Default value: Disabled</p> 
     * @return EnablePBR <p>Whether to enable output of PBR materials.</p><p>Enumeration values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable.</li></ul><p>Default value: Disabled</p>
     */
    public String getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set <p>Whether to enable output of PBR materials.</p><p>Enumeration values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable.</li></ul><p>Default value: Disabled</p>
     * @param EnablePBR <p>Whether to enable output of PBR materials.</p><p>Enumeration values:</p><ul><li>Enabled: enable;</li><li>Disabled: disable.</li></ul><p>Default value: Disabled</p>
     */
    public void setEnablePBR(String EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    /**
     * Get <p>Number of patches. This parameter is valid only when GenerateType is Normal or Geometry.</p><p>Value range: [3000, 1500000]</p><p>Default value: 500000</p> 
     * @return FaceCount <p>Number of patches. This parameter is valid only when GenerateType is Normal or Geometry.</p><p>Value range: [3000, 1500000]</p><p>Default value: 500000</p>
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set <p>Number of patches. This parameter is valid only when GenerateType is Normal or Geometry.</p><p>Value range: [3000, 1500000]</p><p>Default value: 500000</p>
     * @param FaceCount <p>Number of patches. This parameter is valid only when GenerateType is Normal or Geometry.</p><p>Value range: [3000, 1500000]</p><p>Default value: 500000</p>
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get <p>Whether to reserve UV unfolding.</p><p>Enumeration values:</p><ul><li>Enabled: reserved;</li><li>Disabled: not retain.</li></ul><p>Default value: Disabled</p> 
     * @return KeepUV <p>Whether to reserve UV unfolding.</p><p>Enumeration values:</p><ul><li>Enabled: reserved;</li><li>Disabled: not retain.</li></ul><p>Default value: Disabled</p>
     */
    public String getKeepUV() {
        return this.KeepUV;
    }

    /**
     * Set <p>Whether to reserve UV unfolding.</p><p>Enumeration values:</p><ul><li>Enabled: reserved;</li><li>Disabled: not retain.</li></ul><p>Default value: Disabled</p>
     * @param KeepUV <p>Whether to reserve UV unfolding.</p><p>Enumeration values:</p><ul><li>Enabled: reserved;</li><li>Disabled: not retain.</li></ul><p>Default value: Disabled</p>
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
     * Get <p>Random Seed. Results are reproducible with the same Seed input.</p><p>Value range: [0, 2147483647]</p> 
     * @return Seed <p>Random Seed. Results are reproducible with the same Seed input.</p><p>Value range: [0, 2147483647]</p>
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>Random Seed. Results are reproducible with the same Seed input.</p><p>Value range: [0, 2147483647]</p>
     * @param Seed <p>Random Seed. Results are reproducible with the same Seed input.</p><p>Value range: [0, 2147483647]</p>
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
     * Get <p>Output media file configuration of the task.</p> 
     * @return OutputConfig <p>Output media file configuration of the task.</p>
     */
    public AigcHunyuan3DOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set <p>Output media file configuration of the task.</p>
     * @param OutputConfig <p>Output media file configuration of the task.</p>
     */
    public void setOutputConfig(AigcHunyuan3DOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p> 
     * @return SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     * @param SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Source context. This is used to pass through user request information. The audio and video quality revival complete callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.</p> 
     * @return TasksPriority <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.</p>
     * @param TasksPriority <p>Task priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    public CreateAigcHunyuan3DTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcHunyuan3DTaskRequest(CreateAigcHunyuan3DTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
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
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
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
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

