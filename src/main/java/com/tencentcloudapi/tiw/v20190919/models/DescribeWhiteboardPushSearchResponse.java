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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWhiteboardPushSearchResponse extends AbstractModel{

    /**
    * The set of queried push tasks.
    */
    @SerializedName("WhiteboardPushTaskSet")
    @Expose
    private WhiteboardPushTaskSearchResult [] WhiteboardPushTaskSet;

    /**
    * Number of push tasks.
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
     * Get The set of queried push tasks. 
     * @return WhiteboardPushTaskSet The set of queried push tasks.
     */
    public WhiteboardPushTaskSearchResult [] getWhiteboardPushTaskSet() {
        return this.WhiteboardPushTaskSet;
    }

    /**
     * Set The set of queried push tasks.
     * @param WhiteboardPushTaskSet The set of queried push tasks.
     */
    public void setWhiteboardPushTaskSet(WhiteboardPushTaskSearchResult [] WhiteboardPushTaskSet) {
        this.WhiteboardPushTaskSet = WhiteboardPushTaskSet;
    }

    /**
     * Get Number of push tasks. 
     * @return TotalCount Number of push tasks.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of push tasks.
     * @param TotalCount Number of push tasks.
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

    public DescribeWhiteboardPushSearchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWhiteboardPushSearchResponse(DescribeWhiteboardPushSearchResponse source) {
        if (source.WhiteboardPushTaskSet != null) {
            this.WhiteboardPushTaskSet = new WhiteboardPushTaskSearchResult[source.WhiteboardPushTaskSet.length];
            for (int i = 0; i < source.WhiteboardPushTaskSet.length; i++) {
                this.WhiteboardPushTaskSet[i] = new WhiteboardPushTaskSearchResult(source.WhiteboardPushTaskSet[i]);
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
        this.setParamArrayObj(map, prefix + "WhiteboardPushTaskSet.", this.WhiteboardPushTaskSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

