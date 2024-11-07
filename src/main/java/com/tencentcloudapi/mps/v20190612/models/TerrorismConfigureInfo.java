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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerrorismConfigureInfo extends AbstractModel {

    /**
    * The parameters for detecting sensitive information in images.
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private TerrorismImgReviewTemplateInfo ImgReviewInfo;

    /**
    * The parameters for detecting sensitive information based on OCR.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private TerrorismOcrReviewTemplateInfo OcrReviewInfo;

    /**
     * Get The parameters for detecting sensitive information in images. 
     * @return ImgReviewInfo The parameters for detecting sensitive information in images.
     */
    public TerrorismImgReviewTemplateInfo getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set The parameters for detecting sensitive information in images.
     * @param ImgReviewInfo The parameters for detecting sensitive information in images.
     */
    public void setImgReviewInfo(TerrorismImgReviewTemplateInfo ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get The parameters for detecting sensitive information based on OCR. 
     * @return OcrReviewInfo The parameters for detecting sensitive information based on OCR.
     */
    public TerrorismOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set The parameters for detecting sensitive information based on OCR.
     * @param OcrReviewInfo The parameters for detecting sensitive information based on OCR.
     */
    public void setOcrReviewInfo(TerrorismOcrReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public TerrorismConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerrorismConfigureInfo(TerrorismConfigureInfo source) {
        if (source.ImgReviewInfo != null) {
            this.ImgReviewInfo = new TerrorismImgReviewTemplateInfo(source.ImgReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new TerrorismOcrReviewTemplateInfo(source.OcrReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImgReviewInfo.", this.ImgReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

