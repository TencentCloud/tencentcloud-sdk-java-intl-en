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

public class AiAnalysisTaskTagOutput extends AbstractModel {

    /**
    * Video intelligent tag list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to TagSetFileUrl.
    */
    @SerializedName("TagSet")
    @Expose
    private MediaAiAnalysisTagItem [] TagSet;

    /**
    * URL of the video intelligent tag list file. The file content is in JSON format, and its data structure is consistent with the TagSet field. (The file will not be retained permanently and will be deleted after reaching the TagSetFileUrlExpireTime time point.)
    */
    @SerializedName("TagSetFileUrl")
    @Expose
    private String TagSetFileUrl;

    /**
    * Expiration time of the video intelligent tag list file URL, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("TagSetFileUrlExpireTime")
    @Expose
    private String TagSetFileUrlExpireTime;

    /**
     * Get Video intelligent tag list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to TagSetFileUrl. 
     * @return TagSet Video intelligent tag list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to TagSetFileUrl.
     */
    public MediaAiAnalysisTagItem [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Video intelligent tag list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to TagSetFileUrl.
     * @param TagSet Video intelligent tag list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to TagSetFileUrl.
     */
    public void setTagSet(MediaAiAnalysisTagItem [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get URL of the video intelligent tag list file. The file content is in JSON format, and its data structure is consistent with the TagSet field. (The file will not be retained permanently and will be deleted after reaching the TagSetFileUrlExpireTime time point.) 
     * @return TagSetFileUrl URL of the video intelligent tag list file. The file content is in JSON format, and its data structure is consistent with the TagSet field. (The file will not be retained permanently and will be deleted after reaching the TagSetFileUrlExpireTime time point.)
     */
    public String getTagSetFileUrl() {
        return this.TagSetFileUrl;
    }

    /**
     * Set URL of the video intelligent tag list file. The file content is in JSON format, and its data structure is consistent with the TagSet field. (The file will not be retained permanently and will be deleted after reaching the TagSetFileUrlExpireTime time point.)
     * @param TagSetFileUrl URL of the video intelligent tag list file. The file content is in JSON format, and its data structure is consistent with the TagSet field. (The file will not be retained permanently and will be deleted after reaching the TagSetFileUrlExpireTime time point.)
     */
    public void setTagSetFileUrl(String TagSetFileUrl) {
        this.TagSetFileUrl = TagSetFileUrl;
    }

    /**
     * Get Expiration time of the video intelligent tag list file URL, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return TagSetFileUrlExpireTime Expiration time of the video intelligent tag list file URL, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getTagSetFileUrlExpireTime() {
        return this.TagSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the video intelligent tag list file URL, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param TagSetFileUrlExpireTime Expiration time of the video intelligent tag list file URL, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setTagSetFileUrlExpireTime(String TagSetFileUrlExpireTime) {
        this.TagSetFileUrlExpireTime = TagSetFileUrlExpireTime;
    }

    public AiAnalysisTaskTagOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskTagOutput(AiAnalysisTaskTagOutput source) {
        if (source.TagSet != null) {
            this.TagSet = new MediaAiAnalysisTagItem[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new MediaAiAnalysisTagItem(source.TagSet[i]);
            }
        }
        if (source.TagSetFileUrl != null) {
            this.TagSetFileUrl = new String(source.TagSetFileUrl);
        }
        if (source.TagSetFileUrlExpireTime != null) {
            this.TagSetFileUrlExpireTime = new String(source.TagSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "TagSetFileUrl", this.TagSetFileUrl);
        this.setParamSimple(map, prefix + "TagSetFileUrlExpireTime", this.TagSetFileUrlExpireTime);

    }
}

