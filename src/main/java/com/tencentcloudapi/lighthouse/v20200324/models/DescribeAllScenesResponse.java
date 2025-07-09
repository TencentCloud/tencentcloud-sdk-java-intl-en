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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllScenesResponse extends AbstractModel {

    /**
    * List of scenes
    */
    @SerializedName("SceneInfoSet")
    @Expose
    private SceneInfo [] SceneInfoSet;

    /**
    * Total count of scenes
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of scenes 
     * @return SceneInfoSet List of scenes
     */
    public SceneInfo [] getSceneInfoSet() {
        return this.SceneInfoSet;
    }

    /**
     * Set List of scenes
     * @param SceneInfoSet List of scenes
     */
    public void setSceneInfoSet(SceneInfo [] SceneInfoSet) {
        this.SceneInfoSet = SceneInfoSet;
    }

    /**
     * Get Total count of scenes 
     * @return TotalCount Total count of scenes
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total count of scenes
     * @param TotalCount Total count of scenes
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeAllScenesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllScenesResponse(DescribeAllScenesResponse source) {
        if (source.SceneInfoSet != null) {
            this.SceneInfoSet = new SceneInfo[source.SceneInfoSet.length];
            for (int i = 0; i < source.SceneInfoSet.length; i++) {
                this.SceneInfoSet[i] = new SceneInfo(source.SceneInfoSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SceneInfoSet.", this.SceneInfoSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

