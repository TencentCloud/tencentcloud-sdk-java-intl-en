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

public class TerrorismConfigureInfoForUpdate extends AbstractModel {

    /**
    * Task control parameter for image recognition involving unsafe information.
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private TerrorismImgReviewTemplateInfoForUpdate ImgReviewInfo;

    /**
    * Task control parameter for text recognition involving unsafe information.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private TerrorismOcrReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * Get Task control parameter for image recognition involving unsafe information. 
     * @return ImgReviewInfo Task control parameter for image recognition involving unsafe information.
     */
    public TerrorismImgReviewTemplateInfoForUpdate getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set Task control parameter for image recognition involving unsafe information.
     * @param ImgReviewInfo Task control parameter for image recognition involving unsafe information.
     */
    public void setImgReviewInfo(TerrorismImgReviewTemplateInfoForUpdate ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get Task control parameter for text recognition involving unsafe information. 
     * @return OcrReviewInfo Task control parameter for text recognition involving unsafe information.
     */
    public TerrorismOcrReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Task control parameter for text recognition involving unsafe information.
     * @param OcrReviewInfo Task control parameter for text recognition involving unsafe information.
     */
    public void setOcrReviewInfo(TerrorismOcrReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public TerrorismConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerrorismConfigureInfoForUpdate(TerrorismConfigureInfoForUpdate source) {
        if (source.ImgReviewInfo != null) {
            this.ImgReviewInfo = new TerrorismImgReviewTemplateInfoForUpdate(source.ImgReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new TerrorismOcrReviewTemplateInfoForUpdate(source.OcrReviewInfo);
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

