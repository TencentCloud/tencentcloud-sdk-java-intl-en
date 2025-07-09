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
    * Media files source category: <li>Record: From recording. Such as live streaming recording, live time shift recording, etc.</li> <li>Upload: From upload. Such as pull upload, upload from server, client UGC upload, etc.</li> <li>VideoProcessing: From video processing. Such as video splicing, video editing, etc.</li> <li>TrtcRecord: From TRTC accompanying recording.</li> <li>WebPageRecord: From panoramic recording.</li> <li>Unknown: Unknown source.</li>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * User-transparent transmission field when creating a file.
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * Live streaming recording information, valid when the file source is Record.
    */
    @SerializedName("LiveRecordInfo")
    @Expose
    private LiveRecordInfo LiveRecordInfo;

    /**
    * TRTC recording information, valid when the file source is TrtcRecord.
    */
    @SerializedName("TrtcRecordInfo")
    @Expose
    private TrtcRecordInfo TrtcRecordInfo;

    /**
    * Panoramic recording information, valid when the file source is WebPageRecord.
    */
    @SerializedName("WebPageRecordInfo")
    @Expose
    private WebPageRecordInfo WebPageRecordInfo;

    /**
     * Get Media files source category: <li>Record: From recording. Such as live streaming recording, live time shift recording, etc.</li> <li>Upload: From upload. Such as pull upload, upload from server, client UGC upload, etc.</li> <li>VideoProcessing: From video processing. Such as video splicing, video editing, etc.</li> <li>TrtcRecord: From TRTC accompanying recording.</li> <li>WebPageRecord: From panoramic recording.</li> <li>Unknown: Unknown source.</li> 
     * @return SourceType Media files source category: <li>Record: From recording. Such as live streaming recording, live time shift recording, etc.</li> <li>Upload: From upload. Such as pull upload, upload from server, client UGC upload, etc.</li> <li>VideoProcessing: From video processing. Such as video splicing, video editing, etc.</li> <li>TrtcRecord: From TRTC accompanying recording.</li> <li>WebPageRecord: From panoramic recording.</li> <li>Unknown: Unknown source.</li>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Media files source category: <li>Record: From recording. Such as live streaming recording, live time shift recording, etc.</li> <li>Upload: From upload. Such as pull upload, upload from server, client UGC upload, etc.</li> <li>VideoProcessing: From video processing. Such as video splicing, video editing, etc.</li> <li>TrtcRecord: From TRTC accompanying recording.</li> <li>WebPageRecord: From panoramic recording.</li> <li>Unknown: Unknown source.</li>
     * @param SourceType Media files source category: <li>Record: From recording. Such as live streaming recording, live time shift recording, etc.</li> <li>Upload: From upload. Such as pull upload, upload from server, client UGC upload, etc.</li> <li>VideoProcessing: From video processing. Such as video splicing, video editing, etc.</li> <li>TrtcRecord: From TRTC accompanying recording.</li> <li>WebPageRecord: From panoramic recording.</li> <li>Unknown: Unknown source.</li>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get User-transparent transmission field when creating a file. 
     * @return SourceContext User-transparent transmission field when creating a file.
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set User-transparent transmission field when creating a file.
     * @param SourceContext User-transparent transmission field when creating a file.
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get Live streaming recording information, valid when the file source is Record. 
     * @return LiveRecordInfo Live streaming recording information, valid when the file source is Record.
     */
    public LiveRecordInfo getLiveRecordInfo() {
        return this.LiveRecordInfo;
    }

    /**
     * Set Live streaming recording information, valid when the file source is Record.
     * @param LiveRecordInfo Live streaming recording information, valid when the file source is Record.
     */
    public void setLiveRecordInfo(LiveRecordInfo LiveRecordInfo) {
        this.LiveRecordInfo = LiveRecordInfo;
    }

    /**
     * Get TRTC recording information, valid when the file source is TrtcRecord. 
     * @return TrtcRecordInfo TRTC recording information, valid when the file source is TrtcRecord.
     */
    public TrtcRecordInfo getTrtcRecordInfo() {
        return this.TrtcRecordInfo;
    }

    /**
     * Set TRTC recording information, valid when the file source is TrtcRecord.
     * @param TrtcRecordInfo TRTC recording information, valid when the file source is TrtcRecord.
     */
    public void setTrtcRecordInfo(TrtcRecordInfo TrtcRecordInfo) {
        this.TrtcRecordInfo = TrtcRecordInfo;
    }

    /**
     * Get Panoramic recording information, valid when the file source is WebPageRecord. 
     * @return WebPageRecordInfo Panoramic recording information, valid when the file source is WebPageRecord.
     */
    public WebPageRecordInfo getWebPageRecordInfo() {
        return this.WebPageRecordInfo;
    }

    /**
     * Set Panoramic recording information, valid when the file source is WebPageRecord.
     * @param WebPageRecordInfo Panoramic recording information, valid when the file source is WebPageRecord.
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

