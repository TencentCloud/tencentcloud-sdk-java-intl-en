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

public class AiAnalysisTaskCoverOutput extends AbstractModel{

    /**
    * List of intelligently generated thumbnails
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `CoverSetFileUrl`.
    */
    @SerializedName("CoverSet")
    @Expose
    private MediaAiAnalysisCoverItem [] CoverSet;

    /**
    * URL to the file for intelligently generated thumbnails. The file is in JSON format and has the same data structure as `CoverSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `CoverSetFileUrlExpireTime`.
    */
    @SerializedName("CoverSetFileUrl")
    @Expose
    private String CoverSetFileUrl;

    /**
    * Expiration time of the URL to the file for intelligently generated thumbnails, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
    */
    @SerializedName("CoverSetFileUrlExpireTime")
    @Expose
    private String CoverSetFileUrlExpireTime;

    /**
     * Get List of intelligently generated thumbnails
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `CoverSetFileUrl`. 
     * @return CoverSet List of intelligently generated thumbnails
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `CoverSetFileUrl`.
     */
    public MediaAiAnalysisCoverItem [] getCoverSet() {
        return this.CoverSet;
    }

    /**
     * Set List of intelligently generated thumbnails
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `CoverSetFileUrl`.
     * @param CoverSet List of intelligently generated thumbnails
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `CoverSetFileUrl`.
     */
    public void setCoverSet(MediaAiAnalysisCoverItem [] CoverSet) {
        this.CoverSet = CoverSet;
    }

    /**
     * Get URL to the file for intelligently generated thumbnails. The file is in JSON format and has the same data structure as `CoverSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `CoverSetFileUrlExpireTime`. 
     * @return CoverSetFileUrl URL to the file for intelligently generated thumbnails. The file is in JSON format and has the same data structure as `CoverSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `CoverSetFileUrlExpireTime`.
     */
    public String getCoverSetFileUrl() {
        return this.CoverSetFileUrl;
    }

    /**
     * Set URL to the file for intelligently generated thumbnails. The file is in JSON format and has the same data structure as `CoverSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `CoverSetFileUrlExpireTime`.
     * @param CoverSetFileUrl URL to the file for intelligently generated thumbnails. The file is in JSON format and has the same data structure as `CoverSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `CoverSetFileUrlExpireTime`.
     */
    public void setCoverSetFileUrl(String CoverSetFileUrl) {
        this.CoverSetFileUrl = CoverSetFileUrl;
    }

    /**
     * Get Expiration time of the URL to the file for intelligently generated thumbnails, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) 
     * @return CoverSetFileUrlExpireTime Expiration time of the URL to the file for intelligently generated thumbnails, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     */
    public String getCoverSetFileUrlExpireTime() {
        return this.CoverSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the URL to the file for intelligently generated thumbnails, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     * @param CoverSetFileUrlExpireTime Expiration time of the URL to the file for intelligently generated thumbnails, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     */
    public void setCoverSetFileUrlExpireTime(String CoverSetFileUrlExpireTime) {
        this.CoverSetFileUrlExpireTime = CoverSetFileUrlExpireTime;
    }

    public AiAnalysisTaskCoverOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskCoverOutput(AiAnalysisTaskCoverOutput source) {
        if (source.CoverSet != null) {
            this.CoverSet = new MediaAiAnalysisCoverItem[source.CoverSet.length];
            for (int i = 0; i < source.CoverSet.length; i++) {
                this.CoverSet[i] = new MediaAiAnalysisCoverItem(source.CoverSet[i]);
            }
        }
        if (source.CoverSetFileUrl != null) {
            this.CoverSetFileUrl = new String(source.CoverSetFileUrl);
        }
        if (source.CoverSetFileUrlExpireTime != null) {
            this.CoverSetFileUrlExpireTime = new String(source.CoverSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CoverSet.", this.CoverSet);
        this.setParamSimple(map, prefix + "CoverSetFileUrl", this.CoverSetFileUrl);
        this.setParamSimple(map, prefix + "CoverSetFileUrlExpireTime", this.CoverSetFileUrlExpireTime);

    }
}

