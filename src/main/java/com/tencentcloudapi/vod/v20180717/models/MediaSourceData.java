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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaSourceData extends AbstractModel{

    /**
    * Source of a media file:
<li>`Record`: recording, such as live or time-shift recording</li>
<li>`Upload`: upload, such as pull for upload, upload from server, and UGC upload from client</li>
<li>`VideoProcessing`: video processing, such as video splicing and video clipping</li>
<li>`WebPageRecord`: panoramic recording </li>
<li>`Unknown`: unknown source</li>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Field passed through when a file is created.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * The TRTC recording information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TrtcRecordInfo")
    @Expose
    private TrtcRecordInfo TrtcRecordInfo;

    /**
     * Get Source of a media file:
<li>`Record`: recording, such as live or time-shift recording</li>
<li>`Upload`: upload, such as pull for upload, upload from server, and UGC upload from client</li>
<li>`VideoProcessing`: video processing, such as video splicing and video clipping</li>
<li>`WebPageRecord`: panoramic recording </li>
<li>`Unknown`: unknown source</li> 
     * @return SourceType Source of a media file:
<li>`Record`: recording, such as live or time-shift recording</li>
<li>`Upload`: upload, such as pull for upload, upload from server, and UGC upload from client</li>
<li>`VideoProcessing`: video processing, such as video splicing and video clipping</li>
<li>`WebPageRecord`: panoramic recording </li>
<li>`Unknown`: unknown source</li>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Source of a media file:
<li>`Record`: recording, such as live or time-shift recording</li>
<li>`Upload`: upload, such as pull for upload, upload from server, and UGC upload from client</li>
<li>`VideoProcessing`: video processing, such as video splicing and video clipping</li>
<li>`WebPageRecord`: panoramic recording </li>
<li>`Unknown`: unknown source</li>
     * @param SourceType Source of a media file:
<li>`Record`: recording, such as live or time-shift recording</li>
<li>`Upload`: upload, such as pull for upload, upload from server, and UGC upload from client</li>
<li>`VideoProcessing`: video processing, such as video splicing and video clipping</li>
<li>`WebPageRecord`: panoramic recording </li>
<li>`Unknown`: unknown source</li>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Field passed through when a file is created.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SourceContext Field passed through when a file is created.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set Field passed through when a file is created.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SourceContext Field passed through when a file is created.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get The TRTC recording information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TrtcRecordInfo The TRTC recording information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TrtcRecordInfo getTrtcRecordInfo() {
        return this.TrtcRecordInfo;
    }

    /**
     * Set The TRTC recording information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TrtcRecordInfo The TRTC recording information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTrtcRecordInfo(TrtcRecordInfo TrtcRecordInfo) {
        this.TrtcRecordInfo = TrtcRecordInfo;
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
        if (source.TrtcRecordInfo != null) {
            this.TrtcRecordInfo = new TrtcRecordInfo(source.TrtcRecordInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamObj(map, prefix + "TrtcRecordInfo.", this.TrtcRecordInfo);

    }
}

