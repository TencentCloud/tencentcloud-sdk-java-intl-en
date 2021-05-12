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

public class ForbidMediaDistributionResponse extends AbstractModel{

    /**
    * List of IDs of files that do not exist.
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
     * Get List of IDs of files that do not exist. 
     * @return NotExistFileIdSet List of IDs of files that do not exist.
     */
    public String [] getNotExistFileIdSet() {
        return this.NotExistFileIdSet;
    }

    /**
     * Set List of IDs of files that do not exist.
     * @param NotExistFileIdSet List of IDs of files that do not exist.
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

    public ForbidMediaDistributionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForbidMediaDistributionResponse(ForbidMediaDistributionResponse source) {
        if (source.NotExistFileIdSet != null) {
            this.NotExistFileIdSet = new String[source.NotExistFileIdSet.length];
            for (int i = 0; i < source.NotExistFileIdSet.length; i++) {
                this.NotExistFileIdSet[i] = new String(source.NotExistFileIdSet[i]);
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
        this.setParamArraySimple(map, prefix + "NotExistFileIdSet.", this.NotExistFileIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

