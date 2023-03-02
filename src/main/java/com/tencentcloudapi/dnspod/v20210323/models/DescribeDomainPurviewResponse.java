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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainPurviewResponse extends AbstractModel{

    /**
    * Permission list of the domain
    */
    @SerializedName("PurviewList")
    @Expose
    private PurviewInfo [] PurviewList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Permission list of the domain 
     * @return PurviewList Permission list of the domain
     */
    public PurviewInfo [] getPurviewList() {
        return this.PurviewList;
    }

    /**
     * Set Permission list of the domain
     * @param PurviewList Permission list of the domain
     */
    public void setPurviewList(PurviewInfo [] PurviewList) {
        this.PurviewList = PurviewList;
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

    public DescribeDomainPurviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainPurviewResponse(DescribeDomainPurviewResponse source) {
        if (source.PurviewList != null) {
            this.PurviewList = new PurviewInfo[source.PurviewList.length];
            for (int i = 0; i < source.PurviewList.length; i++) {
                this.PurviewList[i] = new PurviewInfo(source.PurviewList[i]);
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
        this.setParamArrayObj(map, prefix + "PurviewList.", this.PurviewList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

