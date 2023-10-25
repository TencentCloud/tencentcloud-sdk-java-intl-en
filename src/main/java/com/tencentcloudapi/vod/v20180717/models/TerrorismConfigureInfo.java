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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerrorismConfigureInfo extends AbstractModel {

    /**
    * Parameters for OCR-based recognition of terrorism content
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private TerrorismOcrReviewTemplateInfo OcrReviewInfo;

    /**
    * Parameters for recognition of terrorism content in images
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private TerrorismImgReviewTemplateInfo ImgReviewInfo;

    /**
     * Get Parameters for OCR-based recognition of terrorism content
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return OcrReviewInfo Parameters for OCR-based recognition of terrorism content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public TerrorismOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Parameters for OCR-based recognition of terrorism content
Note: This field may return `null`, indicating that no valid value can be found.
     * @param OcrReviewInfo Parameters for OCR-based recognition of terrorism content
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setOcrReviewInfo(TerrorismOcrReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    /**
     * Get Parameters for recognition of terrorism content in images
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return ImgReviewInfo Parameters for recognition of terrorism content in images
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public TerrorismImgReviewTemplateInfo getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set Parameters for recognition of terrorism content in images
Note: This field may return `null`, indicating that no valid value can be found.
     * @param ImgReviewInfo Parameters for recognition of terrorism content in images
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setImgReviewInfo(TerrorismImgReviewTemplateInfo ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    public TerrorismConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerrorismConfigureInfo(TerrorismConfigureInfo source) {
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new TerrorismOcrReviewTemplateInfo(source.OcrReviewInfo);
        }
        if (source.ImgReviewInfo != null) {
            this.ImgReviewInfo = new TerrorismImgReviewTemplateInfo(source.ImgReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);
        this.setParamObj(map, prefix + "ImgReviewInfo.", this.ImgReviewInfo);

    }
}

