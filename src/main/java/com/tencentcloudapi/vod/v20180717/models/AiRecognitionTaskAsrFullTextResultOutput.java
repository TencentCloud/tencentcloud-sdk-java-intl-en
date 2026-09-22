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

public class AiRecognitionTaskAsrFullTextResultOutput extends AbstractModel {

    /**
    * List of segments for full speech recognition.
<font color=red>Note</font>: This list only shows the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskAsrFullTextSegmentItem [] SegmentSet;

    /**
    * URL of the speech full text recognition Segment List File. The content of the file is in JSON format, and its data structure is consistent with the fields of SegmentSet. (The file is not retained permanently. It will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * Expiration time of the full speech recognition segment list file URL, using the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
    * Generated subtitle list, corresponding to SubtitleFormats in speech full-text recognition task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
    */
    @SerializedName("SubtitleSet")
    @Expose
    private AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] SubtitleSet;

    /**
    * Generated subtitle file Url, corresponding to SubtitleFormat in speech full-text recognition task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
    */
    @SerializedName("SubtitleUrl")
    @Expose
    private String SubtitleUrl;

    /**
     * Get List of segments for full speech recognition.
<font color=red>Note</font>: This list only shows the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl. 
     * @return SegmentSet List of segments for full speech recognition.
<font color=red>Note</font>: This list only shows the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     */
    public AiRecognitionTaskAsrFullTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of segments for full speech recognition.
<font color=red>Note</font>: This list only shows the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     * @param SegmentSet List of segments for full speech recognition.
<font color=red>Note</font>: This list only shows the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     */
    public void setSegmentSet(AiRecognitionTaskAsrFullTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL of the speech full text recognition Segment List File. The content of the file is in JSON format, and its data structure is consistent with the fields of SegmentSet. (The file is not retained permanently. It will be deleted after reaching the SegmentSetFileUrlExpireTime time point.) 
     * @return SegmentSetFileUrl URL of the speech full text recognition Segment List File. The content of the file is in JSON format, and its data structure is consistent with the fields of SegmentSet. (The file is not retained permanently. It will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL of the speech full text recognition Segment List File. The content of the file is in JSON format, and its data structure is consistent with the fields of SegmentSet. (The file is not retained permanently. It will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)
     * @param SegmentSetFileUrl URL of the speech full text recognition Segment List File. The content of the file is in JSON format, and its data structure is consistent with the fields of SegmentSet. (The file is not retained permanently. It will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get Expiration time of the full speech recognition segment list file URL, using the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return SegmentSetFileUrlExpireTime Expiration time of the full speech recognition segment list file URL, using the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the full speech recognition segment list file URL, using the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param SegmentSetFileUrlExpireTime Expiration time of the full speech recognition segment list file URL, using the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    /**
     * Get Generated subtitle list, corresponding to SubtitleFormats in speech full-text recognition task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo). 
     * @return SubtitleSet Generated subtitle list, corresponding to SubtitleFormats in speech full-text recognition task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     */
    public AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set Generated subtitle list, corresponding to SubtitleFormats in speech full-text recognition task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     * @param SubtitleSet Generated subtitle list, corresponding to SubtitleFormats in speech full-text recognition task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     */
    public void setSubtitleSet(AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    /**
     * Get Generated subtitle file Url, corresponding to SubtitleFormat in speech full-text recognition task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo). 
     * @return SubtitleUrl Generated subtitle file Url, corresponding to SubtitleFormat in speech full-text recognition task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     */
    public String getSubtitleUrl() {
        return this.SubtitleUrl;
    }

    /**
     * Set Generated subtitle file Url, corresponding to SubtitleFormat in speech full-text recognition task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     * @param SubtitleUrl Generated subtitle file Url, corresponding to SubtitleFormat in speech full-text recognition task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     */
    public void setSubtitleUrl(String SubtitleUrl) {
        this.SubtitleUrl = SubtitleUrl;
    }

    public AiRecognitionTaskAsrFullTextResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskAsrFullTextResultOutput(AiRecognitionTaskAsrFullTextResultOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new AiRecognitionTaskAsrFullTextSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new AiRecognitionTaskAsrFullTextSegmentItem(source.SegmentSet[i]);
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
        if (source.SubtitleUrl != null) {
            this.SubtitleUrl = new String(source.SubtitleUrl);
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
        this.setParamSimple(map, prefix + "SubtitleUrl", this.SubtitleUrl);

    }
}

