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

public class AiRecognitionTaskSegmentResultOutput extends AbstractModel {

    /**
    * Video splitting segment list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskSegmentSegmentItem [] SegmentSet;

    /**
    * URL of the video splitting segment list file. The content of the file is JSON, and the data structure is consistent with the SegmentSet fields. The file is not retained permanently and will be deleted after the SegmentSetFileUrlExpireTime time point is reached.
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * Expiration time of the video splitting segment list file URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get Video splitting segment list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl. 
     * @return SegmentSet Video splitting segment list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     */
    public AiRecognitionTaskSegmentSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Video splitting segment list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     * @param SegmentSet Video splitting segment list.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     */
    public void setSegmentSet(AiRecognitionTaskSegmentSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL of the video splitting segment list file. The content of the file is JSON, and the data structure is consistent with the SegmentSet fields. The file is not retained permanently and will be deleted after the SegmentSetFileUrlExpireTime time point is reached. 
     * @return SegmentSetFileUrl URL of the video splitting segment list file. The content of the file is JSON, and the data structure is consistent with the SegmentSet fields. The file is not retained permanently and will be deleted after the SegmentSetFileUrlExpireTime time point is reached.
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL of the video splitting segment list file. The content of the file is JSON, and the data structure is consistent with the SegmentSet fields. The file is not retained permanently and will be deleted after the SegmentSetFileUrlExpireTime time point is reached.
     * @param SegmentSetFileUrl URL of the video splitting segment list file. The content of the file is JSON, and the data structure is consistent with the SegmentSet fields. The file is not retained permanently and will be deleted after the SegmentSetFileUrlExpireTime time point is reached.
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get Expiration time of the video splitting segment list file URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return SegmentSetFileUrlExpireTime Expiration time of the video splitting segment list file URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the video splitting segment list file URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param SegmentSetFileUrlExpireTime Expiration time of the video splitting segment list file URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public AiRecognitionTaskSegmentResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskSegmentResultOutput(AiRecognitionTaskSegmentResultOutput source) {
        if (source.SegmentSet != null) {
            this.SegmentSet = new AiRecognitionTaskSegmentSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new AiRecognitionTaskSegmentSegmentItem(source.SegmentSet[i]);
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

