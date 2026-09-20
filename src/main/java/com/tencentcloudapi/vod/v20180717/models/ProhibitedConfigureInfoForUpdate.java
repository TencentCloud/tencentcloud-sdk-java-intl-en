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

public class ProhibitedConfigureInfoForUpdate extends AbstractModel {

    /**
    * Voice prohibition control parameters.
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private ProhibitedAsrReviewTemplateInfoForUpdate AsrReviewInfo;

    /**
    * Prohibited control parameters for text.
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private ProhibitedOcrReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * Get Voice prohibition control parameters. 
     * @return AsrReviewInfo Voice prohibition control parameters.
     */
    public ProhibitedAsrReviewTemplateInfoForUpdate getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set Voice prohibition control parameters.
     * @param AsrReviewInfo Voice prohibition control parameters.
     */
    public void setAsrReviewInfo(ProhibitedAsrReviewTemplateInfoForUpdate AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get Prohibited control parameters for text. 
     * @return OcrReviewInfo Prohibited control parameters for text.
     */
    public ProhibitedOcrReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set Prohibited control parameters for text.
     * @param OcrReviewInfo Prohibited control parameters for text.
     */
    public void setOcrReviewInfo(ProhibitedOcrReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public ProhibitedConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProhibitedConfigureInfoForUpdate(ProhibitedConfigureInfoForUpdate source) {
        if (source.AsrReviewInfo != null) {
            this.AsrReviewInfo = new ProhibitedAsrReviewTemplateInfoForUpdate(source.AsrReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new ProhibitedOcrReviewTemplateInfoForUpdate(source.OcrReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AsrReviewInfo.", this.AsrReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

