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

public class AiRecognitionTaskSegmentResultOutput extends AbstractModel {

    /**
    * List of split video segments
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskSegmentSegmentItem [] SegmentSet;

    /**
    * URL to the file of the list for split video segments. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * Expiration time of the URL to the file of the list for split video segments, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get List of split video segments
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`. 
     * @return SegmentSet List of split video segments
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
     */
    public AiRecognitionTaskSegmentSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of split video segments
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
     * @param SegmentSet List of split video segments
<font color=red>Note</font>: this list displays up to the first 100 results. You can get all the results from the file whose URL is `SegmentSetFileUrl`.
     */
    public void setSegmentSet(AiRecognitionTaskSegmentSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL to the file of the list for split video segments. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently. 
     * @return SegmentSetFileUrl URL to the file of the list for split video segments. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL to the file of the list for split video segments. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
     * @param SegmentSetFileUrl URL to the file of the list for split video segments. The file format is JSON, and the data structure is the same as `SegmentSet`. The file will be deleted upon the expiration time `SegmentSetFileUrlExpireTime`, instead of being stored permanently.
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get Expiration time of the URL to the file of the list for split video segments, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732) 
     * @return SegmentSetFileUrlExpireTime Expiration time of the URL to the file of the list for split video segments, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the URL to the file of the list for split video segments, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
     * @param SegmentSetFileUrlExpireTime Expiration time of the URL to the file of the list for split video segments, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732)
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

