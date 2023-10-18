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

public class SearchMediaResponse extends AbstractModel {

    /**
    * Number of eligible entries.
<li>Maximum value: 5000. If the number of eligible entries is greater than 5,000, this field will return 5,000 instead of the actual number.</li>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Media file information list
    */
    @SerializedName("MediaInfoSet")
    @Expose
    private MediaInfo [] MediaInfoSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of eligible entries.
<li>Maximum value: 5000. If the number of eligible entries is greater than 5,000, this field will return 5,000 instead of the actual number.</li> 
     * @return TotalCount Number of eligible entries.
<li>Maximum value: 5000. If the number of eligible entries is greater than 5,000, this field will return 5,000 instead of the actual number.</li>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible entries.
<li>Maximum value: 5000. If the number of eligible entries is greater than 5,000, this field will return 5,000 instead of the actual number.</li>
     * @param TotalCount Number of eligible entries.
<li>Maximum value: 5000. If the number of eligible entries is greater than 5,000, this field will return 5,000 instead of the actual number.</li>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Media file information list 
     * @return MediaInfoSet Media file information list
     */
    public MediaInfo [] getMediaInfoSet() {
        return this.MediaInfoSet;
    }

    /**
     * Set Media file information list
     * @param MediaInfoSet Media file information list
     */
    public void setMediaInfoSet(MediaInfo [] MediaInfoSet) {
        this.MediaInfoSet = MediaInfoSet;
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

    public SearchMediaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchMediaResponse(SearchMediaResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MediaInfoSet != null) {
            this.MediaInfoSet = new MediaInfo[source.MediaInfoSet.length];
            for (int i = 0; i < source.MediaInfoSet.length; i++) {
                this.MediaInfoSet[i] = new MediaInfo(source.MediaInfoSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "MediaInfoSet.", this.MediaInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

