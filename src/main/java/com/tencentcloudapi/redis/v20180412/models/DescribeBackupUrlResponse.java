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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupUrlResponse extends AbstractModel{

    /**
    * Download address on the public network (valid for 6 hours)
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String [] DownloadUrl;

    /**
    * Download address on the private network (valid for 6 hours)
    */
    @SerializedName("InnerDownloadUrl")
    @Expose
    private String [] InnerDownloadUrl;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Download address on the public network (valid for 6 hours) 
     * @return DownloadUrl Download address on the public network (valid for 6 hours)
     */
    public String [] getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set Download address on the public network (valid for 6 hours)
     * @param DownloadUrl Download address on the public network (valid for 6 hours)
     */
    public void setDownloadUrl(String [] DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get Download address on the private network (valid for 6 hours) 
     * @return InnerDownloadUrl Download address on the private network (valid for 6 hours)
     */
    public String [] getInnerDownloadUrl() {
        return this.InnerDownloadUrl;
    }

    /**
     * Set Download address on the private network (valid for 6 hours)
     * @param InnerDownloadUrl Download address on the private network (valid for 6 hours)
     */
    public void setInnerDownloadUrl(String [] InnerDownloadUrl) {
        this.InnerDownloadUrl = InnerDownloadUrl;
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
        this.setParamArraySimple(map, prefix + "DownloadUrl.", this.DownloadUrl);
        this.setParamArraySimple(map, prefix + "InnerDownloadUrl.", this.InnerDownloadUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

