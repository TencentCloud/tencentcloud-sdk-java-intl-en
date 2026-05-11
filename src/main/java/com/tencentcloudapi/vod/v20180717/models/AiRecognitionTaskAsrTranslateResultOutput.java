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

public class AiRecognitionTaskAsrTranslateResultOutput extends AbstractModel {

    /**
    * Voice translation clip list.
<font color=red>Note</font>: The list only displays the first 100 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskAsrTranslateSegmentItem [] SegmentSet;

    /**
    * URL of Speech Translation Clip List File. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * Expiration time of the URL for the speech translation clip list file, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
    * Generated subtitle list.
    */
    @SerializedName("SubtitleSet")
    @Expose
    private AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] SubtitleSet;

    /**
     * Get Voice translation clip list.
<font color=red>Note</font>: The list only displays the first 100 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl. 
     * @return SegmentSet Voice translation clip list.
<font color=red>Note</font>: The list only displays the first 100 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
     */
    public AiRecognitionTaskAsrTranslateSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Voice translation clip list.
<font color=red>Note</font>: The list only displays the first 100 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
     * @param SegmentSet Voice translation clip list.
<font color=red>Note</font>: The list only displays the first 100 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
     */
    public void setSegmentSet(AiRecognitionTaskAsrTranslateSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL of Speech Translation Clip List File. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.) 
     * @return SegmentSetFileUrl URL of Speech Translation Clip List File. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL of Speech Translation Clip List File. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
     * @param SegmentSetFileUrl URL of Speech Translation Clip List File. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get Expiration time of the URL for the speech translation clip list file, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return SegmentSetFileUrlExpireTime Expiration time of the URL for the speech translation clip list file, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the URL for the speech translation clip list file, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param SegmentSetFileUrlExpireTime Expiration time of the URL for the speech translation clip list file, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    /**
     * Get Generated subtitle list. 
     * @return SubtitleSet Generated subtitle list.
     */
    public AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set Generated subtitle list.
     * @param SubtitleSet Generated subtitle list.
     */
    public void setSubtitleSet(AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    public AiRecognitionTaskAsrTranslateResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskAsrTranslateResultOutput(AiRecognitionTaskAsrTranslateResultOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new AiRecognitionTaskAsrTranslateSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new AiRecognitionTaskAsrTranslateSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new AiRecognitionTaskAsrFullTextResultOutputSubtitleItem[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new AiRecognitionTaskAsrFullTextResultOutputSubtitleItem(source.SubtitleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);
        this.setParamArrayObj(map, prefix + "SubtitleSet.", this.SubtitleSet);

    }
}

