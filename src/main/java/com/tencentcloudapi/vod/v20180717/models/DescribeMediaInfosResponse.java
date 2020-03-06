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

public class DescribeMediaInfosResponse extends AbstractModel{

    /**
    * Media file information list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MediaInfoSet")
    @Expose
    private MediaInfo [] MediaInfoSet;

    /**
    * List of IDs of files that do not exist.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotExistFileIdSet")
    @Expose
    private String [] NotExistFileIdSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Media file information list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MediaInfoSet Media file information list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaInfo [] getMediaInfoSet() {
        return this.MediaInfoSet;
    }

    /**
     * Set Media file information list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MediaInfoSet Media file information list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMediaInfoSet(MediaInfo [] MediaInfoSet) {
        this.MediaInfoSet = MediaInfoSet;
    }

    /**
     * Get List of IDs of files that do not exist.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NotExistFileIdSet List of IDs of files that do not exist.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNotExistFileIdSet() {
        return this.NotExistFileIdSet;
    }

    /**
     * Set List of IDs of files that do not exist.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NotExistFileIdSet List of IDs of files that do not exist.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNotExistFileIdSet(String [] NotExistFileIdSet) {
        this.NotExistFileIdSet = NotExistFileIdSet;
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
        this.setParamArrayObj(map, prefix + "MediaInfoSet.", this.MediaInfoSet);
        this.setParamArraySimple(map, prefix + "NotExistFileIdSet.", this.NotExistFileIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

