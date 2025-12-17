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
package com.tencentcloudapi.ai3d.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitHunyuanTo3DProJobRequest extends AbstractModel {

    /**
    * Generates 3D content, describes 3D content, chinese forward prompt content.
Supports up to 1024 utf-8 characters.
Text-To-3D. specifies image, image_url, or prompt is required. prompt and image/image_url cannot coexist.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Enter the Base64 code of the image.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Valid values: jpg, png, jpeg, webp.
ImageBase64, ImageUrl, or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * Input image Url.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Multi-Perspective model image. reference value for viewing angle:.
left view.
right view.
back view.

Each viewing angle allows only one image.
Image size limit: must not exceed 8M after encoding.
Image resolution limitation: specifies the unilateral resolution should be less than 5000 and greater than 128.
●Supported image format: JPG or PNG
    */
    @SerializedName("MultiViewImages")
    @Expose
    private ViewImage [] MultiViewImages;

    /**
    * Specifies whether PBR material generation is enabled, false by default.
    */
    @SerializedName("EnablePBR")
    @Expose
    private Boolean EnablePBR;

    /**
    * Specifies the face count of the generated 3D model. default value is 500000.
Specifies the supported face count range. value range: 40000-1500000.
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * Generation task type. default: Normal. valid values:.
Generates a textured geometry model.
LowPoly: specifies whether to generate a model with smart polygon reduction.
Geometry: specifies whether to generate a Geometry model without texture (white model). when this task is selected, the EnablePBR parameter does not take effect.
Sketch: enter a Sketch or line art to generate a model. in this mode, prompt and ImageUrl/ImageBase64 can be input together.
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * This parameter only takes effect when LowPoly mode is selected from GenerateType.

Polygon type, indicates the model surface is composed of polygon grids, defaults to triangle. valid values:.
Specifies the triangle face.
quadrilateral: generates a mix of quadrangle and triangle faces.
    */
    @SerializedName("PolygonType")
    @Expose
    private String PolygonType;

    /**
     * Get Generates 3D content, describes 3D content, chinese forward prompt content.
Supports up to 1024 utf-8 characters.
Text-To-3D. specifies image, image_url, or prompt is required. prompt and image/image_url cannot coexist. 
     * @return Prompt Generates 3D content, describes 3D content, chinese forward prompt content.
Supports up to 1024 utf-8 characters.
Text-To-3D. specifies image, image_url, or prompt is required. prompt and image/image_url cannot coexist.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Generates 3D content, describes 3D content, chinese forward prompt content.
Supports up to 1024 utf-8 characters.
Text-To-3D. specifies image, image_url, or prompt is required. prompt and image/image_url cannot coexist.
     * @param Prompt Generates 3D content, describes 3D content, chinese forward prompt content.
Supports up to 1024 utf-8 characters.
Text-To-3D. specifies image, image_url, or prompt is required. prompt and image/image_url cannot coexist.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Enter the Base64 code of the image.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Valid values: jpg, png, jpeg, webp.
ImageBase64, ImageUrl, or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist. 
     * @return ImageBase64 Enter the Base64 code of the image.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Valid values: jpg, png, jpeg, webp.
ImageBase64, ImageUrl, or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Enter the Base64 code of the image.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Valid values: jpg, png, jpeg, webp.
ImageBase64, ImageUrl, or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     * @param ImageBase64 Enter the Base64 code of the image.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Valid values: jpg, png, jpeg, webp.
ImageBase64, ImageUrl, or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get Input image Url.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist. 
     * @return ImageUrl Input image Url.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Input image Url.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     * @param ImageUrl Input image Url.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Multi-Perspective model image. reference value for viewing angle:.
left view.
right view.
back view.

Each viewing angle allows only one image.
Image size limit: must not exceed 8M after encoding.
Image resolution limitation: specifies the unilateral resolution should be less than 5000 and greater than 128.
●Supported image format: JPG or PNG 
     * @return MultiViewImages Multi-Perspective model image. reference value for viewing angle:.
left view.
right view.
back view.

Each viewing angle allows only one image.
Image size limit: must not exceed 8M after encoding.
Image resolution limitation: specifies the unilateral resolution should be less than 5000 and greater than 128.
●Supported image format: JPG or PNG
     */
    public ViewImage [] getMultiViewImages() {
        return this.MultiViewImages;
    }

    /**
     * Set Multi-Perspective model image. reference value for viewing angle:.
left view.
right view.
back view.

Each viewing angle allows only one image.
Image size limit: must not exceed 8M after encoding.
Image resolution limitation: specifies the unilateral resolution should be less than 5000 and greater than 128.
●Supported image format: JPG or PNG
     * @param MultiViewImages Multi-Perspective model image. reference value for viewing angle:.
left view.
right view.
back view.

Each viewing angle allows only one image.
Image size limit: must not exceed 8M after encoding.
Image resolution limitation: specifies the unilateral resolution should be less than 5000 and greater than 128.
●Supported image format: JPG or PNG
     */
    public void setMultiViewImages(ViewImage [] MultiViewImages) {
        this.MultiViewImages = MultiViewImages;
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
     * Get Specifies the face count of the generated 3D model. default value is 500000.
Specifies the supported face count range. value range: 40000-1500000. 
     * @return FaceCount Specifies the face count of the generated 3D model. default value is 500000.
Specifies the supported face count range. value range: 40000-1500000.
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set Specifies the face count of the generated 3D model. default value is 500000.
Specifies the supported face count range. value range: 40000-1500000.
     * @param FaceCount Specifies the face count of the generated 3D model. default value is 500000.
Specifies the supported face count range. value range: 40000-1500000.
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get Generation task type. default: Normal. valid values:.
Generates a textured geometry model.
LowPoly: specifies whether to generate a model with smart polygon reduction.
Geometry: specifies whether to generate a Geometry model without texture (white model). when this task is selected, the EnablePBR parameter does not take effect.
Sketch: enter a Sketch or line art to generate a model. in this mode, prompt and ImageUrl/ImageBase64 can be input together. 
     * @return GenerateType Generation task type. default: Normal. valid values:.
Generates a textured geometry model.
LowPoly: specifies whether to generate a model with smart polygon reduction.
Geometry: specifies whether to generate a Geometry model without texture (white model). when this task is selected, the EnablePBR parameter does not take effect.
Sketch: enter a Sketch or line art to generate a model. in this mode, prompt and ImageUrl/ImageBase64 can be input together.
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set Generation task type. default: Normal. valid values:.
Generates a textured geometry model.
LowPoly: specifies whether to generate a model with smart polygon reduction.
Geometry: specifies whether to generate a Geometry model without texture (white model). when this task is selected, the EnablePBR parameter does not take effect.
Sketch: enter a Sketch or line art to generate a model. in this mode, prompt and ImageUrl/ImageBase64 can be input together.
     * @param GenerateType Generation task type. default: Normal. valid values:.
Generates a textured geometry model.
LowPoly: specifies whether to generate a model with smart polygon reduction.
Geometry: specifies whether to generate a Geometry model without texture (white model). when this task is selected, the EnablePBR parameter does not take effect.
Sketch: enter a Sketch or line art to generate a model. in this mode, prompt and ImageUrl/ImageBase64 can be input together.
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get This parameter only takes effect when LowPoly mode is selected from GenerateType.

Polygon type, indicates the model surface is composed of polygon grids, defaults to triangle. valid values:.
Specifies the triangle face.
quadrilateral: generates a mix of quadrangle and triangle faces. 
     * @return PolygonType This parameter only takes effect when LowPoly mode is selected from GenerateType.

Polygon type, indicates the model surface is composed of polygon grids, defaults to triangle. valid values:.
Specifies the triangle face.
quadrilateral: generates a mix of quadrangle and triangle faces.
     */
    public String getPolygonType() {
        return this.PolygonType;
    }

    /**
     * Set This parameter only takes effect when LowPoly mode is selected from GenerateType.

Polygon type, indicates the model surface is composed of polygon grids, defaults to triangle. valid values:.
Specifies the triangle face.
quadrilateral: generates a mix of quadrangle and triangle faces.
     * @param PolygonType This parameter only takes effect when LowPoly mode is selected from GenerateType.

Polygon type, indicates the model surface is composed of polygon grids, defaults to triangle. valid values:.
Specifies the triangle face.
quadrilateral: generates a mix of quadrangle and triangle faces.
     */
    public void setPolygonType(String PolygonType) {
        this.PolygonType = PolygonType;
    }

    public SubmitHunyuanTo3DProJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuanTo3DProJobRequest(SubmitHunyuanTo3DProJobRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
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
        if (source.EnablePBR != null) {
            this.EnablePBR = new Boolean(source.EnablePBR);
        }
        if (source.FaceCount != null) {
            this.FaceCount = new Long(source.FaceCount);
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.PolygonType != null) {
            this.PolygonType = new String(source.PolygonType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamArrayObj(map, prefix + "MultiViewImages.", this.MultiViewImages);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);
        this.setParamSimple(map, prefix + "FaceCount", this.FaceCount);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "PolygonType", this.PolygonType);

    }
}

