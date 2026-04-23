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
    * Media file source category:
<li>Record: comes from recording, such as live recording, live streaming time shift recording.</li>
<li>Upload: Comes from upload, such as pull upload, server-side upload, and client UGC upload.</li>
<li>VideoProcessing: comes from video processing, such as video splicing, video editing.</li>
<li>TrtcRecord: Comes from TRTC simultaneous recording.</li>
<li>WebPageRecord: comes from panoramic recording.</li>
<li>Unknown: Unknown source.</li>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Field passed through when the user creates a file.
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * Live recording information is valid when file source is Record.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LiveRecordInfo")
    @Expose
    private LiveRecordInfo LiveRecordInfo;

    /**
    * TRTC Companion Recording Information. Valid at that time when the file source is TrtcRecord.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TrtcRecordInfo")
    @Expose
    private TrtcRecordInfo TrtcRecordInfo;

    /**
    * Panoramic recording information. Valid when the file source is WebPageRecord.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebPageRecordInfo")
    @Expose
    private WebPageRecordInfo WebPageRecordInfo;

    /**
     * Get Media file source category:
<li>Record: comes from recording, such as live recording, live streaming time shift recording.</li>
<li>Upload: Comes from upload, such as pull upload, server-side upload, and client UGC upload.</li>
<li>VideoProcessing: comes from video processing, such as video splicing, video editing.</li>
<li>TrtcRecord: Comes from TRTC simultaneous recording.</li>
<li>WebPageRecord: comes from panoramic recording.</li>
<li>Unknown: Unknown source.</li> 
     * @return SourceType Media file source category:
<li>Record: comes from recording, such as live recording, live streaming time shift recording.</li>
<li>Upload: Comes from upload, such as pull upload, server-side upload, and client UGC upload.</li>
<li>VideoProcessing: comes from video processing, such as video splicing, video editing.</li>
<li>TrtcRecord: Comes from TRTC simultaneous recording.</li>
<li>WebPageRecord: comes from panoramic recording.</li>
<li>Unknown: Unknown source.</li>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Media file source category:
<li>Record: comes from recording, such as live recording, live streaming time shift recording.</li>
<li>Upload: Comes from upload, such as pull upload, server-side upload, and client UGC upload.</li>
<li>VideoProcessing: comes from video processing, such as video splicing, video editing.</li>
<li>TrtcRecord: Comes from TRTC simultaneous recording.</li>
<li>WebPageRecord: comes from panoramic recording.</li>
<li>Unknown: Unknown source.</li>
     * @param SourceType Media file source category:
<li>Record: comes from recording, such as live recording, live streaming time shift recording.</li>
<li>Upload: Comes from upload, such as pull upload, server-side upload, and client UGC upload.</li>
<li>VideoProcessing: comes from video processing, such as video splicing, video editing.</li>
<li>TrtcRecord: Comes from TRTC simultaneous recording.</li>
<li>WebPageRecord: comes from panoramic recording.</li>
<li>Unknown: Unknown source.</li>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Field passed through when the user creates a file. 
     * @return SourceContext Field passed through when the user creates a file.
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set Field passed through when the user creates a file.
     * @param SourceContext Field passed through when the user creates a file.
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get Live recording information is valid when file source is Record.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LiveRecordInfo Live recording information is valid when file source is Record.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LiveRecordInfo getLiveRecordInfo() {
        return this.LiveRecordInfo;
    }

    /**
     * Set Live recording information is valid when file source is Record.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LiveRecordInfo Live recording information is valid when file source is Record.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLiveRecordInfo(LiveRecordInfo LiveRecordInfo) {
        this.LiveRecordInfo = LiveRecordInfo;
    }

    /**
     * Get TRTC Companion Recording Information. Valid at that time when the file source is TrtcRecord.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TrtcRecordInfo TRTC Companion Recording Information. Valid at that time when the file source is TrtcRecord.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TrtcRecordInfo getTrtcRecordInfo() {
        return this.TrtcRecordInfo;
    }

    /**
     * Set TRTC Companion Recording Information. Valid at that time when the file source is TrtcRecord.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TrtcRecordInfo TRTC Companion Recording Information. Valid at that time when the file source is TrtcRecord.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTrtcRecordInfo(TrtcRecordInfo TrtcRecordInfo) {
        this.TrtcRecordInfo = TrtcRecordInfo;
    }

    /**
     * Get Panoramic recording information. Valid when the file source is WebPageRecord.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WebPageRecordInfo Panoramic recording information. Valid when the file source is WebPageRecord.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WebPageRecordInfo getWebPageRecordInfo() {
        return this.WebPageRecordInfo;
    }

    /**
     * Set Panoramic recording information. Valid when the file source is WebPageRecord.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WebPageRecordInfo Panoramic recording information. Valid when the file source is WebPageRecord.
Note: This field may return null, indicating that no valid values can be obtained.
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

