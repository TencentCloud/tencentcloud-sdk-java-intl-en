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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitHunyuanTo3DRapidJobRequest extends AbstractModel {

    /**
    * Text-To-3D, description of 3D content, forward Prompt content
Supports up to 200 utf-8 characters
Either ImageBase64, ImageUrl, or Prompt is required, and Prompt cannot coexist with ImageBase64/ImageUrl
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Input image Base64 data
Size: unilateral resolution requirement not less than 128, not greater than 5000, size not greater than 6mb (after encoding, size increases by approximately 30%). format:
jpg, png, jpeg, webp
Imagebase64, imageurl, and Prompt are required, but Prompt and imagebase64/imageurl cannot coexist
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * Input image Url size: 
Unilateral resolution requirement not less than 128, not greater than 5000. size not greater than 8mb
Format: jpg, png, jpeg, webp
Imagebase64, imageurl, and Prompt are required, and Prompt cannot coexist with imagebase64/imageurl	
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Returns the 3D file format. valid values:
OBJ, GLB, STL, USDZ, FBX, MP4, GIF
Recommended input models below 50W, may timeout when selecting USDZ, MP4, or GIF format
Example value: STL
    */
    @SerializedName("ResultFormat")
    @Expose
    private String ResultFormat;

    /**
    * Specifies whether PBR material generation is enabled, false by default.	
    */
    @SerializedName("EnablePBR")
    @Expose
    private Boolean EnablePBR;

    /**
    * Specifies whether to enable the single geometry generation option
When enabled, it generates a 3D model without textures (white model)
When enabled, the generative model does not support OBJ format
Default model file format is GLB
    */
    @SerializedName("EnableGeometry")
    @Expose
    private Boolean EnableGeometry;

    /**
     * Get Text-To-3D, description of 3D content, forward Prompt content
Supports up to 200 utf-8 characters
Either ImageBase64, ImageUrl, or Prompt is required, and Prompt cannot coexist with ImageBase64/ImageUrl 
     * @return Prompt Text-To-3D, description of 3D content, forward Prompt content
Supports up to 200 utf-8 characters
Either ImageBase64, ImageUrl, or Prompt is required, and Prompt cannot coexist with ImageBase64/ImageUrl
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Text-To-3D, description of 3D content, forward Prompt content
Supports up to 200 utf-8 characters
Either ImageBase64, ImageUrl, or Prompt is required, and Prompt cannot coexist with ImageBase64/ImageUrl
     * @param Prompt Text-To-3D, description of 3D content, forward Prompt content
Supports up to 200 utf-8 characters
Either ImageBase64, ImageUrl, or Prompt is required, and Prompt cannot coexist with ImageBase64/ImageUrl
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Input image Base64 data
Size: unilateral resolution requirement not less than 128, not greater than 5000, size not greater than 6mb (after encoding, size increases by approximately 30%). format:
jpg, png, jpeg, webp
Imagebase64, imageurl, and Prompt are required, but Prompt and imagebase64/imageurl cannot coexist 
     * @return ImageBase64 Input image Base64 data
Size: unilateral resolution requirement not less than 128, not greater than 5000, size not greater than 6mb (after encoding, size increases by approximately 30%). format:
jpg, png, jpeg, webp
Imagebase64, imageurl, and Prompt are required, but Prompt and imagebase64/imageurl cannot coexist
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Input image Base64 data
Size: unilateral resolution requirement not less than 128, not greater than 5000, size not greater than 6mb (after encoding, size increases by approximately 30%). format:
jpg, png, jpeg, webp
Imagebase64, imageurl, and Prompt are required, but Prompt and imagebase64/imageurl cannot coexist
     * @param ImageBase64 Input image Base64 data
Size: unilateral resolution requirement not less than 128, not greater than 5000, size not greater than 6mb (after encoding, size increases by approximately 30%). format:
jpg, png, jpeg, webp
Imagebase64, imageurl, and Prompt are required, but Prompt and imagebase64/imageurl cannot coexist
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get Input image Url size: 
Unilateral resolution requirement not less than 128, not greater than 5000. size not greater than 8mb
Format: jpg, png, jpeg, webp
Imagebase64, imageurl, and Prompt are required, and Prompt cannot coexist with imagebase64/imageurl	 
     * @return ImageUrl Input image Url size: 
Unilateral resolution requirement not less than 128, not greater than 5000. size not greater than 8mb
Format: jpg, png, jpeg, webp
Imagebase64, imageurl, and Prompt are required, and Prompt cannot coexist with imagebase64/imageurl	
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Input image Url size: 
Unilateral resolution requirement not less than 128, not greater than 5000. size not greater than 8mb
Format: jpg, png, jpeg, webp
Imagebase64, imageurl, and Prompt are required, and Prompt cannot coexist with imagebase64/imageurl	
     * @param ImageUrl Input image Url size: 
Unilateral resolution requirement not less than 128, not greater than 5000. size not greater than 8mb
Format: jpg, png, jpeg, webp
Imagebase64, imageurl, and Prompt are required, and Prompt cannot coexist with imagebase64/imageurl	
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Returns the 3D file format. valid values:
OBJ, GLB, STL, USDZ, FBX, MP4, GIF
Recommended input models below 50W, may timeout when selecting USDZ, MP4, or GIF format
Example value: STL 
     * @return ResultFormat Returns the 3D file format. valid values:
OBJ, GLB, STL, USDZ, FBX, MP4, GIF
Recommended input models below 50W, may timeout when selecting USDZ, MP4, or GIF format
Example value: STL
     */
    public String getResultFormat() {
        return this.ResultFormat;
    }

    /**
     * Set Returns the 3D file format. valid values:
OBJ, GLB, STL, USDZ, FBX, MP4, GIF
Recommended input models below 50W, may timeout when selecting USDZ, MP4, or GIF format
Example value: STL
     * @param ResultFormat Returns the 3D file format. valid values:
OBJ, GLB, STL, USDZ, FBX, MP4, GIF
Recommended input models below 50W, may timeout when selecting USDZ, MP4, or GIF format
Example value: STL
     */
    public void setResultFormat(String ResultFormat) {
        this.ResultFormat = ResultFormat;
    }

    /**
     * Get Specifies whether PBR material generation is enabled, false by default.	 
     * @return EnablePBR Specifies whether PBR material generation is enabled, false by default.	
     */
    public Boolean getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set Specifies whether PBR material generation is enabled, false by default.	
     * @param EnablePBR Specifies whether PBR material generation is enabled, false by default.	
     */
    public void setEnablePBR(Boolean EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    /**
     * Get Specifies whether to enable the single geometry generation option
When enabled, it generates a 3D model without textures (white model)
When enabled, the generative model does not support OBJ format
Default model file format is GLB 
     * @return EnableGeometry Specifies whether to enable the single geometry generation option
When enabled, it generates a 3D model without textures (white model)
When enabled, the generative model does not support OBJ format
Default model file format is GLB
     */
    public Boolean getEnableGeometry() {
        return this.EnableGeometry;
    }

    /**
     * Set Specifies whether to enable the single geometry generation option
When enabled, it generates a 3D model without textures (white model)
When enabled, the generative model does not support OBJ format
Default model file format is GLB
     * @param EnableGeometry Specifies whether to enable the single geometry generation option
When enabled, it generates a 3D model without textures (white model)
When enabled, the generative model does not support OBJ format
Default model file format is GLB
     */
    public void setEnableGeometry(Boolean EnableGeometry) {
        this.EnableGeometry = EnableGeometry;
    }

    public SubmitHunyuanTo3DRapidJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuanTo3DRapidJobRequest(SubmitHunyuanTo3DRapidJobRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ResultFormat != null) {
            this.ResultFormat = new String(source.ResultFormat);
        }
        if (source.EnablePBR != null) {
            this.EnablePBR = new Boolean(source.EnablePBR);
        }
        if (source.EnableGeometry != null) {
            this.EnableGeometry = new Boolean(source.EnableGeometry);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ResultFormat", this.ResultFormat);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);
        this.setParamSimple(map, prefix + "EnableGeometry", this.EnableGeometry);

    }
}

