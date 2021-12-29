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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskHighlightOutput extends AbstractModel{

    /**
    * List of intelligently generated highlights
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `HighlightSetFileUrl`.
    */
    @SerializedName("HighlightSet")
    @Expose
    private MediaAiAnalysisHighlightItem [] HighlightSet;

    /**
    * URL to the file for intelligently generated highlights. The file is in JSON format and has the same data structure as `HighlightSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `HighlightSetFileUrlExpireTime`.
    */
    @SerializedName("HighlightSetFileUrl")
    @Expose
    private String HighlightSetFileUrl;

    /**
    * Expiration time of the URL to the file for intelligently generated highlights, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
    */
    @SerializedName("HighlightSetFileUrlExpireTime")
    @Expose
    private String HighlightSetFileUrlExpireTime;

    /**
     * Get List of intelligently generated highlights
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `HighlightSetFileUrl`. 
     * @return HighlightSet List of intelligently generated highlights
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `HighlightSetFileUrl`.
     */
    public MediaAiAnalysisHighlightItem [] getHighlightSet() {
        return this.HighlightSet;
    }

    /**
     * Set List of intelligently generated highlights
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `HighlightSetFileUrl`.
     * @param HighlightSet List of intelligently generated highlights
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `HighlightSetFileUrl`.
     */
    public void setHighlightSet(MediaAiAnalysisHighlightItem [] HighlightSet) {
        this.HighlightSet = HighlightSet;
    }

    /**
     * Get URL to the file for intelligently generated highlights. The file is in JSON format and has the same data structure as `HighlightSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `HighlightSetFileUrlExpireTime`. 
     * @return HighlightSetFileUrl URL to the file for intelligently generated highlights. The file is in JSON format and has the same data structure as `HighlightSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `HighlightSetFileUrlExpireTime`.
     */
    public String getHighlightSetFileUrl() {
        return this.HighlightSetFileUrl;
    }

    /**
     * Set URL to the file for intelligently generated highlights. The file is in JSON format and has the same data structure as `HighlightSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `HighlightSetFileUrlExpireTime`.
     * @param HighlightSetFileUrl URL to the file for intelligently generated highlights. The file is in JSON format and has the same data structure as `HighlightSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `HighlightSetFileUrlExpireTime`.
     */
    public void setHighlightSetFileUrl(String HighlightSetFileUrl) {
        this.HighlightSetFileUrl = HighlightSetFileUrl;
    }

    /**
     * Get Expiration time of the URL to the file for intelligently generated highlights, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) 
     * @return HighlightSetFileUrlExpireTime Expiration time of the URL to the file for intelligently generated highlights, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     */
    public String getHighlightSetFileUrlExpireTime() {
        return this.HighlightSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the URL to the file for intelligently generated highlights, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     * @param HighlightSetFileUrlExpireTime Expiration time of the URL to the file for intelligently generated highlights, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
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

