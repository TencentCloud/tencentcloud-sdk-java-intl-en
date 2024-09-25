/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MergeInfo extends AbstractModel {

    /**
    * Enter the image Base64 code.
●Either the Base64 code or URL must be provided. If both are provided, URL prevails.
●Material image limitation: face size in the image greater than 34×34 pixels; image size greater than 64×64 pixels. (After encoding, the image size may increase by about 30%. It is recommended to control the image size reasonably.)
●Supported image format: JPG or PNG
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Enter the image URL.
●Either the Base64 code or URL must be provided. If both are provided, URL prevails.
●Material image limitation: face size in the image greater than 34×34 pixels; image size greater than 64×64 pixels. (After encoding, the image size may increase by about 30%. It is recommended to control the image size reasonably.)
●Supported image format: JPG or PNG
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Face position information (face box) on the uploaded image
Width and height are no less than 30.
    */
    @SerializedName("InputImageFaceRect")
    @Expose
    private FaceRect InputImageFaceRect;

    /**
    * Material face ID. If this parameter is left blank, the largest face is used by default.
    */
    @SerializedName("TemplateFaceID")
    @Expose
    private String TemplateFaceID;

    /**
    * Face position information (face box) on the template. If this parameter is left blank, the largest face is used by default. This parameter applies to scenes where custom material templates are used for fusion.
Width and height are no less than 30.
    */
    @SerializedName("TemplateFaceRect")
    @Expose
    private FaceRect TemplateFaceRect;

    /**
     * Get Enter the image Base64 code.
●Either the Base64 code or URL must be provided. If both are provided, URL prevails.
●Material image limitation: face size in the image greater than 34×34 pixels; image size greater than 64×64 pixels. (After encoding, the image size may increase by about 30%. It is recommended to control the image size reasonably.)
●Supported image format: JPG or PNG 
     * @return Image Enter the image Base64 code.
●Either the Base64 code or URL must be provided. If both are provided, URL prevails.
●Material image limitation: face size in the image greater than 34×34 pixels; image size greater than 64×64 pixels. (After encoding, the image size may increase by about 30%. It is recommended to control the image size reasonably.)
●Supported image format: JPG or PNG
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set Enter the image Base64 code.
●Either the Base64 code or URL must be provided. If both are provided, URL prevails.
●Material image limitation: face size in the image greater than 34×34 pixels; image size greater than 64×64 pixels. (After encoding, the image size may increase by about 30%. It is recommended to control the image size reasonably.)
●Supported image format: JPG or PNG
     * @param Image Enter the image Base64 code.
●Either the Base64 code or URL must be provided. If both are provided, URL prevails.
●Material image limitation: face size in the image greater than 34×34 pixels; image size greater than 64×64 pixels. (After encoding, the image size may increase by about 30%. It is recommended to control the image size reasonably.)
●Supported image format: JPG or PNG
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get Enter the image URL.
●Either the Base64 code or URL must be provided. If both are provided, URL prevails.
●Material image limitation: face size in the image greater than 34×34 pixels; image size greater than 64×64 pixels. (After encoding, the image size may increase by about 30%. It is recommended to control the image size reasonably.)
●Supported image format: JPG or PNG 
     * @return Url Enter the image URL.
●Either the Base64 code or URL must be provided. If both are provided, URL prevails.
●Material image limitation: face size in the image greater than 34×34 pixels; image size greater than 64×64 pixels. (After encoding, the image size may increase by about 30%. It is recommended to control the image size reasonably.)
●Supported image format: JPG or PNG
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Enter the image URL.
●Either the Base64 code or URL must be provided. If both are provided, URL prevails.
●Material image limitation: face size in the image greater than 34×34 pixels; image size greater than 64×64 pixels. (After encoding, the image size may increase by about 30%. It is recommended to control the image size reasonably.)
●Supported image format: JPG or PNG
     * @param Url Enter the image URL.
●Either the Base64 code or URL must be provided. If both are provided, URL prevails.
●Material image limitation: face size in the image greater than 34×34 pixels; image size greater than 64×64 pixels. (After encoding, the image size may increase by about 30%. It is recommended to control the image size reasonably.)
●Supported image format: JPG or PNG
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Face position information (face box) on the uploaded image
Width and height are no less than 30. 
     * @return InputImageFaceRect Face position information (face box) on the uploaded image
Width and height are no less than 30.
     */
    public FaceRect getInputImageFaceRect() {
        return this.InputImageFaceRect;
    }

    /**
     * Set Face position information (face box) on the uploaded image
Width and height are no less than 30.
     * @param InputImageFaceRect Face position information (face box) on the uploaded image
Width and height are no less than 30.
     */
    public void setInputImageFaceRect(FaceRect InputImageFaceRect) {
        this.InputImageFaceRect = InputImageFaceRect;
    }

    /**
     * Get Material face ID. If this parameter is left blank, the largest face is used by default. 
     * @return TemplateFaceID Material face ID. If this parameter is left blank, the largest face is used by default.
     */
    public String getTemplateFaceID() {
        return this.TemplateFaceID;
    }

    /**
     * Set Material face ID. If this parameter is left blank, the largest face is used by default.
     * @param TemplateFaceID Material face ID. If this parameter is left blank, the largest face is used by default.
     */
    public void setTemplateFaceID(String TemplateFaceID) {
        this.TemplateFaceID = TemplateFaceID;
    }

    /**
     * Get Face position information (face box) on the template. If this parameter is left blank, the largest face is used by default. This parameter applies to scenes where custom material templates are used for fusion.
Width and height are no less than 30. 
     * @return TemplateFaceRect Face position information (face box) on the template. If this parameter is left blank, the largest face is used by default. This parameter applies to scenes where custom material templates are used for fusion.
Width and height are no less than 30.
     */
    public FaceRect getTemplateFaceRect() {
        return this.TemplateFaceRect;
    }

    /**
     * Set Face position information (face box) on the template. If this parameter is left blank, the largest face is used by default. This parameter applies to scenes where custom material templates are used for fusion.
Width and height are no less than 30.
     * @param TemplateFaceRect Face position information (face box) on the template. If this parameter is left blank, the largest face is used by default. This parameter applies to scenes where custom material templates are used for fusion.
Width and height are no less than 30.
     */
    public void setTemplateFaceRect(FaceRect TemplateFaceRect) {
        this.TemplateFaceRect = TemplateFaceRect;
    }

    public MergeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MergeInfo(MergeInfo source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.InputImageFaceRect != null) {
            this.InputImageFaceRect = new FaceRect(source.InputImageFaceRect);
        }
        if (source.TemplateFaceID != null) {
            this.TemplateFaceID = new String(source.TemplateFaceID);
        }
        if (source.TemplateFaceRect != null) {
            this.TemplateFaceRect = new FaceRect(source.TemplateFaceRect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "InputImageFaceRect.", this.InputImageFaceRect);
        this.setParamSimple(map, prefix + "TemplateFaceID", this.TemplateFaceID);
        this.setParamObj(map, prefix + "TemplateFaceRect.", this.TemplateFaceRect);

    }
}

