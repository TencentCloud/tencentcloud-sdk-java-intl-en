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

public class LiveRealTimeClipResponse extends AbstractModel{

    /**
    * Playback URL of clipped video.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Unique media file ID of video generated by persistent clipping.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Task flow ID of video generated by persistent clipping.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VodTaskId")
    @Expose
    private String VodTaskId;

    /**
    * Metadata of clipped video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Playback URL of clipped video. 
     * @return Url Playback URL of clipped video.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Playback URL of clipped video.
     * @param Url Playback URL of clipped video.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Unique media file ID of video generated by persistent clipping.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileId Unique media file ID of video generated by persistent clipping.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Unique media file ID of video generated by persistent clipping.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileId Unique media file ID of video generated by persistent clipping.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Task flow ID of video generated by persistent clipping.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VodTaskId Task flow ID of video generated by persistent clipping.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVodTaskId() {
        return this.VodTaskId;
    }

    /**
     * Set Task flow ID of video generated by persistent clipping.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VodTaskId Task flow ID of video generated by persistent clipping.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVodTaskId(String VodTaskId) {
        this.VodTaskId = VodTaskId;
    }

    /**
     * Get Metadata of clipped video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MetaData Metadata of clipped video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Metadata of clipped video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MetaData Metadata of clipped video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public LiveRealTimeClipResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRealTimeClipResponse(LiveRealTimeClipResponse source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.VodTaskId != null) {
            this.VodTaskId = new String(source.VodTaskId);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "VodTaskId", this.VodTaskId);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

