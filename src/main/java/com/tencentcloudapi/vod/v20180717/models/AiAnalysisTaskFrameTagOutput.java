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

public class AiAnalysisTaskFrameTagOutput extends AbstractModel {

    /**
    * List of frame-specific video tags
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `SegmentSetFileUrl`.
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaAiAnalysisFrameTagSegmentItem [] SegmentSet;

    /**
    * URL to the file for frame-specific video tags. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `SegmentSetFileUrlExpireTime`.
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * Expiration time of the URL to the file for frame-specific video tags, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get List of frame-specific video tags
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `SegmentSetFileUrl`. 
     * @return SegmentSet List of frame-specific video tags
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `SegmentSetFileUrl`.
     */
    public MediaAiAnalysisFrameTagSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of frame-specific video tags
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `SegmentSetFileUrl`.
     * @param SegmentSet List of frame-specific video tags
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `SegmentSetFileUrl`.
     */
    public void setSegmentSet(MediaAiAnalysisFrameTagSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL to the file for frame-specific video tags. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `SegmentSetFileUrlExpireTime`. 
     * @return SegmentSetFileUrl URL to the file for frame-specific video tags. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `SegmentSetFileUrlExpireTime`.
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL to the file for frame-specific video tags. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `SegmentSetFileUrlExpireTime`.
     * @param SegmentSetFileUrl URL to the file for frame-specific video tags. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `SegmentSetFileUrlExpireTime`.
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get Expiration time of the URL to the file for frame-specific video tags, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) 
     * @return SegmentSetFileUrlExpireTime Expiration time of the URL to the file for frame-specific video tags, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the URL to the file for frame-specific video tags, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     * @param SegmentSetFileUrlExpireTime Expiration time of the URL to the file for frame-specific video tags, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public AiAnalysisTaskFrameTagOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskFrameTagOutput(AiAnalysisTaskFrameTagOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new MediaAiAnalysisFrameTagSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new MediaAiAnalysisFrameTagSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);

    }
}

