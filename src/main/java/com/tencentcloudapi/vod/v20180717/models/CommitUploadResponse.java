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

public class CommitUploadResponse extends AbstractModel{

    /**
    * Unique ID of media file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Media playback address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * Media cover address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Unique ID of media file. 
     * @return FileId Unique ID of media file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Unique ID of media file.
     * @param FileId Unique ID of media file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Media playback address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MediaUrl Media playback address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set Media playback address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MediaUrl Media playback address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * Get Media cover address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CoverUrl Media cover address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set Media cover address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CoverUrl Media cover address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "MediaUrl", this.MediaUrl);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

