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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContentIdentifiersResponse extends AbstractModel {

    /**
    * Total number of content identifiers that meet the filter conditions.	
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Detailed content identifier list.
    */
    @SerializedName("ContentIdentifiers")
    @Expose
    private ContentIdentifier [] ContentIdentifiers;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of content identifiers that meet the filter conditions.	 
     * @return TotalCount Total number of content identifiers that meet the filter conditions.	
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of content identifiers that meet the filter conditions.	
     * @param TotalCount Total number of content identifiers that meet the filter conditions.	
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Detailed content identifier list. 
     * @return ContentIdentifiers Detailed content identifier list.
     */
    public ContentIdentifier [] getContentIdentifiers() {
        return this.ContentIdentifiers;
    }

    /**
     * Set Detailed content identifier list.
     * @param ContentIdentifiers Detailed content identifier list.
     */
    public void setContentIdentifiers(ContentIdentifier [] ContentIdentifiers) {
        this.ContentIdentifiers = ContentIdentifiers;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeContentIdentifiersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContentIdentifiersResponse(DescribeContentIdentifiersResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ContentIdentifiers != null) {
            this.ContentIdentifiers = new ContentIdentifier[source.ContentIdentifiers.length];
            for (int i = 0; i < source.ContentIdentifiers.length; i++) {
                this.ContentIdentifiers[i] = new ContentIdentifier(source.ContentIdentifiers[i]);
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
        this.setParamArrayObj(map, prefix + "ContentIdentifiers.", this.ContentIdentifiers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

