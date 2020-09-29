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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerrorismConfigureInfoForUpdate extends AbstractModel{

    /**
    * Control parameter of a terrorism information detection in image task.
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private TerrorismImgReviewTemplateInfoForUpdate ImgReviewInfo;

    /**
    * Control parameter of terrorism information detection in text task.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private TerrorismOcrReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * Get Control parameter of a terrorism information detection in image task. 
     * @return ImgReviewInfo Control parameter of a terrorism information detection in image task.
     */
    public TerrorismImgReviewTemplateInfoForUpdate getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set Control parameter of a terrorism information detection in image task.
     * @param ImgReviewInfo Control parameter of a terrorism information detection in image task.
     */
    public void setImgReviewInfo(TerrorismImgReviewTemplateInfoForUpdate ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get Control parameter of terrorism information detection in text task. 
     * @return OcrReviewInfo Control parameter of terrorism information detection in text task.
     */
    public TerrorismOcrReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Control parameter of terrorism information detection in text task.
     * @param OcrReviewInfo Control parameter of terrorism information detection in text task.
     */
    public void setOcrReviewInfo(TerrorismOcrReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImgReviewInfo.", this.ImgReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

