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

public class MediaSourceData extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * 
    */
    @SerializedName("LiveRecordInfo")
    @Expose
    private LiveRecordInfo LiveRecordInfo;

    /**
    * 
    */
    @SerializedName("TrtcRecordInfo")
    @Expose
    private TrtcRecordInfo TrtcRecordInfo;

    /**
    * 
    */
    @SerializedName("WebPageRecordInfo")
    @Expose
    private WebPageRecordInfo WebPageRecordInfo;

    /**
     * Get  
     * @return SourceType 
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 
     * @param SourceType 
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get  
     * @return SourceContext 
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set 
     * @param SourceContext 
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get  
     * @return LiveRecordInfo 
     */
    public LiveRecordInfo getLiveRecordInfo() {
        return this.LiveRecordInfo;
    }

    /**
     * Set 
     * @param LiveRecordInfo 
     */
    public void setLiveRecordInfo(LiveRecordInfo LiveRecordInfo) {
        this.LiveRecordInfo = LiveRecordInfo;
    }

    /**
     * Get  
     * @return TrtcRecordInfo 
     */
    public TrtcRecordInfo getTrtcRecordInfo() {
        return this.TrtcRecordInfo;
    }

    /**
     * Set 
     * @param TrtcRecordInfo 
     */
    public void setTrtcRecordInfo(TrtcRecordInfo TrtcRecordInfo) {
        this.TrtcRecordInfo = TrtcRecordInfo;
    }

    /**
     * Get  
     * @return WebPageRecordInfo 
     */
    public WebPageRecordInfo getWebPageRecordInfo() {
        return this.WebPageRecordInfo;
    }

    /**
     * Set 
     * @param WebPageRecordInfo 
     */
    public void setWebPageRecordInfo(WebPageRecordInfo WebPageRecordInfo) {
        this.WebPageRecordInfo = WebPageRecordInfo;
    }

    public MediaSourceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSourceData(MediaSourceData source) {
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceContext != null) {
            this.SourceContext = new String(source.SourceContext);
        }
        if (source.LiveRecordInfo != null) {
            this.LiveRecordInfo = new LiveRecordInfo(source.LiveRecordInfo);
        }
        if (source.TrtcRecordInfo != null) {
            this.TrtcRecordInfo = new TrtcRecordInfo(source.TrtcRecordInfo);
        }
        if (source.WebPageRecordInfo != null) {
            this.WebPageRecordInfo = new WebPageRecordInfo(source.WebPageRecordInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamObj(map, prefix + "LiveRecordInfo.", this.LiveRecordInfo);
        this.setParamObj(map, prefix + "TrtcRecordInfo.", this.TrtcRecordInfo);
        this.setParamObj(map, prefix + "WebPageRecordInfo.", this.WebPageRecordInfo);

    }
}

