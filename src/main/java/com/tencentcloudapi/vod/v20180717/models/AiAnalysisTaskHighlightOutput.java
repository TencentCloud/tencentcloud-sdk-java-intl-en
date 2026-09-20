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

public class AiAnalysisTaskHighlightOutput extends AbstractModel {

    /**
    * Intelligent video highlight list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to HighlightSetFileUrl.
    */
    @SerializedName("HighlightSet")
    @Expose
    private MediaAiAnalysisHighlightItem [] HighlightSet;

    /**
    * URL of the video intelligent highlight list file. The content of the file is JSON, and the data structure is consistent with the HighlightSet fields. The file is not retained permanently and will be deleted after the HighlightSetFileUrlExpireTime time point is reached.
    */
    @SerializedName("HighlightSetFileUrl")
    @Expose
    private String HighlightSetFileUrl;

    /**
    * Expiration time of the video intelligent highlight list file URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("HighlightSetFileUrlExpireTime")
    @Expose
    private String HighlightSetFileUrlExpireTime;

    /**
     * Get Intelligent video highlight list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to HighlightSetFileUrl. 
     * @return HighlightSet Intelligent video highlight list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to HighlightSetFileUrl.
     */
    public MediaAiAnalysisHighlightItem [] getHighlightSet() {
        return this.HighlightSet;
    }

    /**
     * Set Intelligent video highlight list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to HighlightSetFileUrl.
     * @param HighlightSet Intelligent video highlight list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to HighlightSetFileUrl.
     */
    public void setHighlightSet(MediaAiAnalysisHighlightItem [] HighlightSet) {
        this.HighlightSet = HighlightSet;
    }

    /**
     * Get URL of the video intelligent highlight list file. The content of the file is JSON, and the data structure is consistent with the HighlightSet fields. The file is not retained permanently and will be deleted after the HighlightSetFileUrlExpireTime time point is reached. 
     * @return HighlightSetFileUrl URL of the video intelligent highlight list file. The content of the file is JSON, and the data structure is consistent with the HighlightSet fields. The file is not retained permanently and will be deleted after the HighlightSetFileUrlExpireTime time point is reached.
     */
    public String getHighlightSetFileUrl() {
        return this.HighlightSetFileUrl;
    }

    /**
     * Set URL of the video intelligent highlight list file. The content of the file is JSON, and the data structure is consistent with the HighlightSet fields. The file is not retained permanently and will be deleted after the HighlightSetFileUrlExpireTime time point is reached.
     * @param HighlightSetFileUrl URL of the video intelligent highlight list file. The content of the file is JSON, and the data structure is consistent with the HighlightSet fields. The file is not retained permanently and will be deleted after the HighlightSetFileUrlExpireTime time point is reached.
     */
    public void setHighlightSetFileUrl(String HighlightSetFileUrl) {
        this.HighlightSetFileUrl = HighlightSetFileUrl;
    }

    /**
     * Get Expiration time of the video intelligent highlight list file URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return HighlightSetFileUrlExpireTime Expiration time of the video intelligent highlight list file URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getHighlightSetFileUrlExpireTime() {
        return this.HighlightSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the video intelligent highlight list file URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param HighlightSetFileUrlExpireTime Expiration time of the video intelligent highlight list file URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setHighlightSetFileUrlExpireTime(String HighlightSetFileUrlExpireTime) {
        this.HighlightSetFileUrlExpireTime = HighlightSetFileUrlExpireTime;
    }

    public AiAnalysisTaskHighlightOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskHighlightOutput(AiAnalysisTaskHighlightOutput source) {
        if (source.HighlightSet != null) {
            this.HighlightSet = new MediaAiAnalysisHighlightItem[source.HighlightSet.length];
            for (int i = 0; i < source.HighlightSet.length; i++) {
                this.HighlightSet[i] = new MediaAiAnalysisHighlightItem(source.HighlightSet[i]);
            }
        }
        if (source.HighlightSetFileUrl != null) {
            this.HighlightSetFileUrl = new String(source.HighlightSetFileUrl);
        }
        if (source.HighlightSetFileUrlExpireTime != null) {
            this.HighlightSetFileUrlExpireTime = new String(source.HighlightSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HighlightSet.", this.HighlightSet);
        this.setParamSimple(map, prefix + "HighlightSetFileUrl", this.HighlightSetFileUrl);
        this.setParamSimple(map, prefix + "HighlightSetFileUrlExpireTime", this.HighlightSetFileUrlExpireTime);

    }
}

