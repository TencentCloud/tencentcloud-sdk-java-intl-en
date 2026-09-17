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
    * 
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskAsrFullTextSegmentItem [] SegmentSet;

    /**
    * 
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * 
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
    * 
    */
    @SerializedName("SubtitleSet")
    @Expose
    private AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] SubtitleSet;

    /**
    * 
    */
    @SerializedName("SubtitleUrl")
    @Expose
    private String SubtitleUrl;

    /**
     * Get  
     * @return SegmentSet 
     */
    public AiRecognitionTaskAsrFullTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 
     * @param SegmentSet 
     */
    public void setSegmentSet(AiRecognitionTaskAsrFullTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get  
     * @return SegmentSetFileUrl 
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set 
     * @param SegmentSetFileUrl 
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get  
     * @return SegmentSetFileUrlExpireTime 
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set 
     * @param SegmentSetFileUrlExpireTime 
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    /**
     * Get  
     * @return SubtitleSet 
     */
    public AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set 
     * @param SubtitleSet 
     */
    public void setSubtitleSet(AiRecognitionTaskAsrFullTextResultOutputSubtitleItem [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    /**
     * Get  
     * @return SubtitleUrl 
     */
    public String getSubtitleUrl() {
        return this.SubtitleUrl;
    }

    /**
     * Set 
     * @param SubtitleUrl 
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

