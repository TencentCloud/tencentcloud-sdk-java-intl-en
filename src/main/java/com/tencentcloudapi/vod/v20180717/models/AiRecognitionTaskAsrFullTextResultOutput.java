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

public class AiRecognitionTaskAsrFullTextResultOutput extends AbstractModel {

    /**
    * List of full-text speech recognition segments
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskAsrFullTextSegmentItem [] SegmentSet;

    /**
    * URL to the file of the list for full-text speech recognition segments. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * The expiration time of the URLs of full-text speech recognition segments in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
    * The subtitle files generated, whose format is determined by the `SubtitleFormats` parameter of [AsrFullTextConfigureInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
    */
    @SerializedName("SubtitleSet")
    @Expose
    private AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] SubtitleSet;

    /**
    * The URLs of the subtitle files generated, whose format is determined by the `SubtitleFormats` parameter of [AsrFullTextConfigureInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
    */
    @SerializedName("SubtitleUrl")
    @Expose
    private String SubtitleUrl;

    /**
     * Get List of full-text speech recognition segments
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`. 
     * @return SegmentSet List of full-text speech recognition segments
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
     */
    public AiRecognitionTaskAsrFullTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of full-text speech recognition segments
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
     * @param SegmentSet List of full-text speech recognition segments
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
     */
    public void setSegmentSet(AiRecognitionTaskAsrFullTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL to the file of the list for full-text speech recognition segments. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently. 
     * @return SegmentSetFileUrl URL to the file of the list for full-text speech recognition segments. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL to the file of the list for full-text speech recognition segments. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
     * @param SegmentSetFileUrl URL to the file of the list for full-text speech recognition segments. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get The expiration time of the URLs of full-text speech recognition segments in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format). 
     * @return SegmentSetFileUrlExpireTime The expiration time of the URLs of full-text speech recognition segments in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set The expiration time of the URLs of full-text speech recognition segments in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
     * @param SegmentSetFileUrlExpireTime The expiration time of the URLs of full-text speech recognition segments in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format).
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    /**
     * Get The subtitle files generated, whose format is determined by the `SubtitleFormats` parameter of [AsrFullTextConfigureInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo). 
     * @return SubtitleSet The subtitle files generated, whose format is determined by the `SubtitleFormats` parameter of [AsrFullTextConfigureInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     */
    public AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set The subtitle files generated, whose format is determined by the `SubtitleFormats` parameter of [AsrFullTextConfigureInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     * @param SubtitleSet The subtitle files generated, whose format is determined by the `SubtitleFormats` parameter of [AsrFullTextConfigureInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     */
    public void setSubtitleSet(AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    /**
     * Get The URLs of the subtitle files generated, whose format is determined by the `SubtitleFormats` parameter of [AsrFullTextConfigureInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo). 
     * @return SubtitleUrl The URLs of the subtitle files generated, whose format is determined by the `SubtitleFormats` parameter of [AsrFullTextConfigureInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     */
    public String getSubtitleUrl() {
        return this.SubtitleUrl;
    }

    /**
     * Set The URLs of the subtitle files generated, whose format is determined by the `SubtitleFormats` parameter of [AsrFullTextConfigureInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
     * @param SubtitleUrl The URLs of the subtitle files generated, whose format is determined by the `SubtitleFormats` parameter of [AsrFullTextConfigureInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#AsrFullTextConfigureInfo).
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

