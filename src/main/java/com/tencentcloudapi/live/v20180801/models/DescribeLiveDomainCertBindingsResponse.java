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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveDomainCertBindingsResponse extends AbstractModel {

    /**
    * The information of domains that meet the query criteria.
    */
    @SerializedName("LiveDomainCertBindings")
    @Expose
    private LiveDomainCertBindings [] LiveDomainCertBindings;

    /**
    * The number of records returned, which is needed for pagination.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The information of domains that meet the query criteria. 
     * @return LiveDomainCertBindings The information of domains that meet the query criteria.
     */
    public LiveDomainCertBindings [] getLiveDomainCertBindings() {
        return this.LiveDomainCertBindings;
    }

    /**
     * Set The information of domains that meet the query criteria.
     * @param LiveDomainCertBindings The information of domains that meet the query criteria.
     */
    public void setLiveDomainCertBindings(LiveDomainCertBindings [] LiveDomainCertBindings) {
        this.LiveDomainCertBindings = LiveDomainCertBindings;
    }

    /**
     * Get The number of records returned, which is needed for pagination. 
     * @return TotalNum The number of records returned, which is needed for pagination.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set The number of records returned, which is needed for pagination.
     * @param TotalNum The number of records returned, which is needed for pagination.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
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

    public DescribeLiveDomainCertBindingsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveDomainCertBindingsResponse(DescribeLiveDomainCertBindingsResponse source) {
        if (source.LiveDomainCertBindings != null) {
            this.LiveDomainCertBindings = new LiveDomainCertBindings[source.LiveDomainCertBindings.length];
            for (int i = 0; i < source.LiveDomainCertBindings.length; i++) {
                this.LiveDomainCertBindings[i] = new LiveDomainCertBindings(source.LiveDomainCertBindings[i]);
            }
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LiveDomainCertBindings.", this.LiveDomainCertBindings);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

