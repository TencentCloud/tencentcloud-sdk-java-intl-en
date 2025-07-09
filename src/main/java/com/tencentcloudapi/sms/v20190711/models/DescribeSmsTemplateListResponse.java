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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmsTemplateListResponse extends AbstractModel {

    /**
    * Response for getting SMS signature information
    */
    @SerializedName("DescribeTemplateStatusSet")
    @Expose
    private DescribeTemplateListStatus [] DescribeTemplateStatusSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Response for getting SMS signature information 
     * @return DescribeTemplateStatusSet Response for getting SMS signature information
     */
    public DescribeTemplateListStatus [] getDescribeTemplateStatusSet() {
        return this.DescribeTemplateStatusSet;
    }

    /**
     * Set Response for getting SMS signature information
     * @param DescribeTemplateStatusSet Response for getting SMS signature information
     */
    public void setDescribeTemplateStatusSet(DescribeTemplateListStatus [] DescribeTemplateStatusSet) {
        this.DescribeTemplateStatusSet = DescribeTemplateStatusSet;
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

    public DescribeSmsTemplateListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmsTemplateListResponse(DescribeSmsTemplateListResponse source) {
        if (source.DescribeTemplateStatusSet != null) {
            this.DescribeTemplateStatusSet = new DescribeTemplateListStatus[source.DescribeTemplateStatusSet.length];
            for (int i = 0; i < source.DescribeTemplateStatusSet.length; i++) {
                this.DescribeTemplateStatusSet[i] = new DescribeTemplateListStatus(source.DescribeTemplateStatusSet[i]);
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
        this.setParamArrayObj(map, prefix + "DescribeTemplateStatusSet.", this.DescribeTemplateStatusSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

