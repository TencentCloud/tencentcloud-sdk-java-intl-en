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

public class SubmitHunyuanTo3DTextureEditJobRequest extends AbstractModel {

    /**
    * File URL of the 3D model file that requires texture edit
Supported formats: FBX, OBJ, GLB
3D model limit: less than 100000 faces
    */
    @SerializedName("File3D")
    @Expose
    private InputFile3D File3D;

    /**
    * Reference image for 3D model texture editing: Base64 data and image Url
Either Base64 or Url must be provided. if both are provided, Url prevails
Image restrictions: unilateral resolution less than 4096 and greater than 128, converted into Base64 string less than 10MB
Format support: jpg, jpeg, png
    */
    @SerializedName("Image")
    @Expose
    private ImageInfo Image;

    /**
    * Describes texture editing, forward prompt content
Supports up to 1024 utf-8 characters
Either image or prompt is required, and prompt and image cannot coexist
Example value: a kitten
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Whether to enable the PBR texture parameter, only supports enabling when entering the Prompt
Example value: true
    */
    @SerializedName("EnablePBR")
    @Expose
    private Boolean EnablePBR;

    /**
     * Get File URL of the 3D model file that requires texture edit
Supported formats: FBX, OBJ, GLB
3D model limit: less than 100000 faces 
     * @return File3D File URL of the 3D model file that requires texture edit
Supported formats: FBX, OBJ, GLB
3D model limit: less than 100000 faces
     */
    public InputFile3D getFile3D() {
        return this.File3D;
    }

    /**
     * Set File URL of the 3D model file that requires texture edit
Supported formats: FBX, OBJ, GLB
3D model limit: less than 100000 faces
     * @param File3D File URL of the 3D model file that requires texture edit
Supported formats: FBX, OBJ, GLB
3D model limit: less than 100000 faces
     */
    public void setFile3D(InputFile3D File3D) {
        this.File3D = File3D;
    }

    /**
     * Get Reference image for 3D model texture editing: Base64 data and image Url
Either Base64 or Url must be provided. if both are provided, Url prevails
Image restrictions: unilateral resolution less than 4096 and greater than 128, converted into Base64 string less than 10MB
Format support: jpg, jpeg, png 
     * @return Image Reference image for 3D model texture editing: Base64 data and image Url
Either Base64 or Url must be provided. if both are provided, Url prevails
Image restrictions: unilateral resolution less than 4096 and greater than 128, converted into Base64 string less than 10MB
Format support: jpg, jpeg, png
     */
    public ImageInfo getImage() {
        return this.Image;
    }

    /**
     * Set Reference image for 3D model texture editing: Base64 data and image Url
Either Base64 or Url must be provided. if both are provided, Url prevails
Image restrictions: unilateral resolution less than 4096 and greater than 128, converted into Base64 string less than 10MB
Format support: jpg, jpeg, png
     * @param Image Reference image for 3D model texture editing: Base64 data and image Url
Either Base64 or Url must be provided. if both are provided, Url prevails
Image restrictions: unilateral resolution less than 4096 and greater than 128, converted into Base64 string less than 10MB
Format support: jpg, jpeg, png
     */
    public void setImage(ImageInfo Image) {
        this.Image = Image;
    }

    /**
     * Get Describes texture editing, forward prompt content
Supports up to 1024 utf-8 characters
Either image or prompt is required, and prompt and image cannot coexist
Example value: a kitten 
     * @return Prompt Describes texture editing, forward prompt content
Supports up to 1024 utf-8 characters
Either image or prompt is required, and prompt and image cannot coexist
Example value: a kitten
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Describes texture editing, forward prompt content
Supports up to 1024 utf-8 characters
Either image or prompt is required, and prompt and image cannot coexist
Example value: a kitten
     * @param Prompt Describes texture editing, forward prompt content
Supports up to 1024 utf-8 characters
Either image or prompt is required, and prompt and image cannot coexist
Example value: a kitten
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Whether to enable the PBR texture parameter, only supports enabling when entering the Prompt
Example value: true 
     * @return EnablePBR Whether to enable the PBR texture parameter, only supports enabling when entering the Prompt
Example value: true
     */
    public Boolean getEnablePBR() {
        return this.EnablePBR;
    }

    /**
     * Set Whether to enable the PBR texture parameter, only supports enabling when entering the Prompt
Example value: true
     * @param EnablePBR Whether to enable the PBR texture parameter, only supports enabling when entering the Prompt
Example value: true
     */
    public void setEnablePBR(Boolean EnablePBR) {
        this.EnablePBR = EnablePBR;
    }

    public SubmitHunyuanTo3DTextureEditJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitHunyuanTo3DTextureEditJobRequest(SubmitHunyuanTo3DTextureEditJobRequest source) {
        if (source.File3D != null) {
            this.File3D = new InputFile3D(source.File3D);
        }
        if (source.Image != null) {
            this.Image = new ImageInfo(source.Image);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.EnablePBR != null) {
            this.EnablePBR = new Boolean(source.EnablePBR);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "File3D.", this.File3D);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "EnablePBR", this.EnablePBR);

    }
}

