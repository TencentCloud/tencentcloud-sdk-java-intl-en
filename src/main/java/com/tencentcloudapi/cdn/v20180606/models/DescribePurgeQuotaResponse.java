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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurgeQuotaResponse extends AbstractModel{

    /**
    * URL purge usage and quota.
    */
    @SerializedName("UrlPurge")
    @Expose
    private Quota [] UrlPurge;

    /**
    * Directory purge usage and quota.
    */
    @SerializedName("PathPurge")
    @Expose
    private Quota [] PathPurge;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get URL purge usage and quota. 
     * @return UrlPurge URL purge usage and quota.
     */
    public Quota [] getUrlPurge() {
        return this.UrlPurge;
    }

    /**
     * Set URL purge usage and quota.
     * @param UrlPurge URL purge usage and quota.
     */
    public void setUrlPurge(Quota [] UrlPurge) {
        this.UrlPurge = UrlPurge;
    }

    /**
     * Get Directory purge usage and quota. 
     * @return PathPurge Directory purge usage and quota.
     */
    public Quota [] getPathPurge() {
        return this.PathPurge;
    }

    /**
     * Set Directory purge usage and quota.
     * @param PathPurge Directory purge usage and quota.
     */
    public void setPathPurge(Quota [] PathPurge) {
        this.PathPurge = PathPurge;
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
        this.setParamArrayObj(map, prefix + "UrlPurge.", this.UrlPurge);
        this.setParamArrayObj(map, prefix + "PathPurge.", this.PathPurge);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

