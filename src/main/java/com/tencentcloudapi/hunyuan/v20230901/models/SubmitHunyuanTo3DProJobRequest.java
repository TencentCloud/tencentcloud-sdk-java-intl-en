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

public class SubmitHunyuanTo3DProJobRequest extends AbstractModel {

    /**
    * Tencent HY 3D Global model version
Defaults to 3.0, with optional choices: 3.0, 3.1
When selecting version 3.1, the [LowPoly] and [Sketch] parameter is unavailable
Example value:3.0
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * Generates 3D content, describes 3D content.
Supports up to 1024 utf-8 characters.
Text-To-3D. Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Enter the Base64 code of the image.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Input image suggestion:
1.Simple background (solid-color background) 
2.No text or blended colors
3.Single object
4.The object occupies over 50% of the frame
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * Input image Url.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Input image suggestion:
1.Simple background (solid-color background) 
2.No text or blended colors
3.Single object
4.The object occupies over 50% of the frame
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Multi-Perspective model image. reference value for viewing angle:.
left: Left view;
right: Right view;
back: Rear view;
top: Top view (only supported in Model 3.1);
bottom: Bottom view (only supported in Model 3.1);
left_front: Left front 45 degree view (only supported in Model 3.1);
right_front: Right front 45 degree view (only supported in Model 3.1);

Each perspective is limited to one image.
Image size limit. the value must not exceed 8 mb after encoding.
Image resolution limitation: the unilateral resolution should be less than 5000 and greater than 128.
Supported image format: JPG or PNG
    */
    @SerializedName("MultiViewImages")
    @Expose
    private ViewImage [] MultiViewImages;

    /**
    * Specifies whether PBR material generation is enabled. default false
    */
    @SerializedName("EnablePBR")
    @Expose
    private Boolean EnablePBR;

    /**
    * Specifies the face count for 3D model generation. default value is 500000.
Specifies the supported face count generation range. value range: 40000-1500000
    */
    @SerializedName("FaceCount")
    @Expose
    private Long FaceCount;

    /**
    * Generation task type. default: Normal. valid values:
Normal: generates a geometric model with textures
LowPoly: specifies the model generated after intelligent polygon reduction.
Geometry: specifies whether to generate a Geometry model without textures (white model). when this task is selected, the EnablePBR parameter does not take effect
Specifies the Sketch for the generative model, allowing input of a Sketch or line drawing. in this mode, both prompt and ImageUrl/ImageBase64 can be entered together
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * This parameter only takes effect when LowPoly mode is selected from GenerateType

Polygon type, indicates the number of sides in the model's surface grid, defaults to triangle. valid values:
triangle. specifies the triangular face
quadrilateral: mix quadrangle and triangle faces to generate
    */
    @SerializedName("PolygonType")
    @Expose
    private String PolygonType;

    /**
     * Get Tencent HY 3D Global model version
Defaults to 3.0, with optional choices: 3.0, 3.1
When selecting version 3.1, the [LowPoly] and [Sketch] parameter is unavailable
Example value:3.0 
     * @return Model Tencent HY 3D Global model version
Defaults to 3.0, with optional choices: 3.0, 3.1
When selecting version 3.1, the [LowPoly] and [Sketch] parameter is unavailable
Example value:3.0
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set Tencent HY 3D Global model version
Defaults to 3.0, with optional choices: 3.0, 3.1
When selecting version 3.1, the [LowPoly] and [Sketch] parameter is unavailable
Example value:3.0
     * @param Model Tencent HY 3D Global model version
Defaults to 3.0, with optional choices: 3.0, 3.1
When selecting version 3.1, the [LowPoly] and [Sketch] parameter is unavailable
Example value:3.0
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get Generates 3D content, describes 3D content.
Supports up to 1024 utf-8 characters.
Text-To-3D. Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist. 
     * @return Prompt Generates 3D content, describes 3D content.
Supports up to 1024 utf-8 characters.
Text-To-3D. Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Generates 3D content, describes 3D content.
Supports up to 1024 utf-8 characters.
Text-To-3D. Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     * @param Prompt Generates 3D content, describes 3D content.
Supports up to 1024 utf-8 characters.
Text-To-3D. Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Enter the Base64 code of the image.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Input image suggestion:
1.Simple background (solid-color background) 
2.No text or blended colors
3.Single object
4.The object occupies over 50% of the frame
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist. 
     * @return ImageBase64 Enter the Base64 code of the image.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Input image suggestion:
1.Simple background (solid-color background) 
2.No text or blended colors
3.Single object
4.The object occupies over 50% of the frame
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set Enter the Base64 code of the image.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Input image suggestion:
1.Simple background (solid-color background) 
2.No text or blended colors
3.Single object
4.The object occupies over 50% of the frame
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     * @param ImageBase64 Enter the Base64 code of the image.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Input image suggestion:
1.Simple background (solid-color background) 
2.No text or blended colors
3.Single object
4.The object occupies over 50% of the frame
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get Input image Url.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Input image suggestion:
1.Simple background (solid-color background) 
2.No text or blended colors
3.Single object
4.The object occupies over 50% of the frame
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist. 
     * @return ImageUrl Input image Url.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Input image suggestion:
1.Simple background (solid-color background) 
2.No text or blended colors
3.Single object
4.The object occupies over 50% of the frame
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Input image Url.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Input image suggestion:
1.Simple background (solid-color background) 
2.No text or blended colors
3.Single object
4.The object occupies over 50% of the frame
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     * @param ImageUrl Input image Url.
Size: specifies the unilateral resolution requirement, not less than 128 and not greater than 5000. size should not exceed 8m (after encoding, it increases by about 30%, recommend actual input image size no more than 6m).
Input image suggestion:
1.Simple background (solid-color background) 
2.No text or blended colors
3.Single object
4.The object occupies over 50% of the frame
Valid values: jpg, png, jpeg, webp.
Specifies either ImageBase64/ImageUrl or Prompt is required. Prompt and ImageBase64/ImageUrl cannot coexist.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Multi-Perspective model image. reference value for viewing angle:.
left: Left view;
right: Right view;
back: Rear view;
top: Top view (only supported in Model 3.1);
bottom: Bottom view (only supported in Model 3.1);
left_front: Left front 45 degree view (only supported in Model 3.1);
right_front: Right front 45 degree view (only supported in Model 3.1);

Each perspective is limited to one image.
Image size limit. the value must not exceed 8 mb after encoding.
Image resolution limitation: the unilateral resolution should be less than 5000 and greater than 128.
Supported image format: JPG or PNG 
     * @return MultiViewImages Multi-Perspective model image. reference value for viewing angle:.
left: Left view;
right: Right view;
back: Rear view;
top: Top view (only supported in Model 3.1);
bottom: Bottom view (only supported in Model 3.1);
left_front: Left front 45 degree view (only supported in Model 3.1);
right_front: Right front 45 degree view (only supported in Model 3.1);

Each perspective is limited to one image.
Image size limit. the value must not exceed 8 mb after encoding.
Image resolution limitation: the unilateral resolution should be less than 5000 and greater than 128.
Supported image format: JPG or PNG
     */
    public ViewImage [] getMultiViewImages() {
        return this.MultiViewImages;
    }

    /**
     * Set Multi-Perspective model image. reference value for viewing angle:.
left: Left view;
right: Right view;
back: Rear view;
top: Top view (only supported in Model 3.1);
bottom: Bottom view (only supported in Model 3.1);
left_front: Left front 45 degree view (only supported in Model 3.1);
right_front: Right front 45 degree view (only supported in Model 3.1);

Each perspective is limited to one image.
Image size limit. the value must not exceed 8 mb after encoding.
Image resolution limitation: the unilateral resolution should be less than 5000 and greater than 128.
Supported image format: JPG or PNG
     * @param MultiViewImages Multi-Perspective model image. reference value for viewing angle:.
left: Left view;
right: Right view;
back: Rear view;
top: Top view (only supported in Model 3.1);
bottom: Bottom view (only supported in Model 3.1);
left_front: Left front 45 degree view (only supported in Model 3.1);
right_front: Right front 45 degree view (only supported in Model 3.1);

Each perspective is limited to one image.
Image size limit. the value must not exceed 8 mb after encoding.
Image resolution limitation: the unilateral resolution should be less than 5000 and greater than 128.
Supported image format: JPG or PNG
     */
    public void setMultiViewImages(ViewImage [] MultiViewImages) {
        this.MultiViewImages = MultiViewImages;
    }

    /**
     * Get Specifies whether PBR material generation is enabled. default false 
     * @return EnablePBR Specifies whether PBR material generation is enabled. default false
     */
    public Boolean getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set Specifies whether PBR material generation is enabled. default false
     * @param EnablePBR Specifies whether PBR material generation is enabled. default false
     */
    public void setEnablePBR(Boolean EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    /**
     * Get Specifies the face count for 3D model generation. default value is 500000.
Specifies the supported face count generation range. value range: 40000-1500000 
     * @return FaceCount Specifies the face count for 3D model generation. default value is 500000.
Specifies the supported face count generation range. value range: 40000-1500000
     */
    public Long getFaceCount() {
        return this.FaceCount;
    }

    /**
     * Set Specifies the face count for 3D model generation. default value is 500000.
Specifies the supported face count generation range. value range: 40000-1500000
     * @param FaceCount Specifies the face count for 3D model generation. default value is 500000.
Specifies the supported face count generation range. value range: 40000-1500000
     */
    public void setFaceCount(Long FaceCount) {
        this.FaceCount = FaceCount;
    }

    /**
     * Get Generation task type. default: Normal. valid values:
Normal: generates a geometric model with textures
LowPoly: specifies the model generated after intelligent polygon reduction.
Geometry: specifies whether to generate a Geometry model without textures (white model). when this task is selected, the EnablePBR parameter does not take effect
Specifies the Sketch for the generative model, allowing input of a Sketch or line drawing. in this mode, both prompt and ImageUrl/ImageBase64 can be entered together 
     * @return GenerateType Generation task type. default: Normal. valid values:
Normal: generates a geometric model with textures
LowPoly: specifies the model generated after intelligent polygon reduction.
Geometry: specifies whether to generate a Geometry model without textures (white model). when this task is selected, the EnablePBR parameter does not take effect
Specifies the Sketch for the generative model, allowing input of a Sketch or line drawing. in this mode, both prompt and ImageUrl/ImageBase64 can be entered together
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set Generation task type. default: Normal. valid values:
Normal: generates a geometric model with textures
LowPoly: specifies the model generated after intelligent polygon reduction.
Geometry: specifies whether to generate a Geometry model without textures (white model). when this task is selected, the EnablePBR parameter does not take effect
Specifies the Sketch for the generative model, allowing input of a Sketch or line drawing. in this mode, both prompt and ImageUrl/ImageBase64 can be entered together
     * @param GenerateType Generation task type. default: Normal. valid values:
Normal: generates a geometric model with textures
LowPoly: specifies the model generated after intelligent polygon reduction.
Geometry: specifies whether to generate a Geometry model without textures (white model). when this task is selected, the EnablePBR parameter does not take effect
Specifies the Sketch for the generative model, allowing input of a Sketch or line drawing. in this mode, both prompt and ImageUrl/ImageBase64 can be entered together
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get This parameter only takes effect when LowPoly mode is selected from GenerateType

Polygon type, indicates the number of sides in the model's surface grid, defaults to triangle. valid values:
triangle. specifies the triangular face
quadrilateral: mix quadrangle and triangle faces to generate 
     * @return PolygonType This parameter only takes effect when LowPoly mode is selected from GenerateType

Polygon type, indicates the number of sides in the model's surface grid, defaults to triangle. valid values:
triangle. specifies the triangular face
quadrilateral: mix quadrangle and triangle faces to generate
     */
    public String getPolygonType() {
        return this.PolygonType;
    }

    /**
     * Set This parameter only takes effect when LowPoly mode is selected from GenerateType

Polygon type, indicates the number of sides in the model's surface grid, defaults to triangle. valid values:
triangle. specifies the triangular face
quadrilateral: mix quadrangle and triangle faces to generate
     * @param PolygonType This parameter only takes effect when LowPoly mode is selected from GenerateType

Polygon type, indicates the number of sides in the model's surface grid, defaults to triangle. valid values:
triangle. specifies the triangular face
quadrilateral: mix quadrangle and triangle faces to generate
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
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
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
        this.setParamSimple(map, prefix + "Model", this.Model);
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

