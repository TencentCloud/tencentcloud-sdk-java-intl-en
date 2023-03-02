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

public class DescribeDomainShareInfoResponse extends AbstractModel{

    /**
    * Domain sharing information
    */
    @SerializedName("ShareList")
    @Expose
    private DomainShareInfo [] ShareList;

    /**
    * Owner account of the domain
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Domain sharing information 
     * @return ShareList Domain sharing information
     */
    public DomainShareInfo [] getShareList() {
        return this.ShareList;
    }

    /**
     * Set Domain sharing information
     * @param ShareList Domain sharing information
     */
    public void setShareList(DomainShareInfo [] ShareList) {
        this.ShareList = ShareList;
    }

    /**
     * Get Owner account of the domain 
     * @return Owner Owner account of the domain
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Owner account of the domain
     * @param Owner Owner account of the domain
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
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

    public DescribeDomainShareInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainShareInfoResponse(DescribeDomainShareInfoResponse source) {
        if (source.ShareList != null) {
            this.ShareList = new DomainShareInfo[source.ShareList.length];
            for (int i = 0; i < source.ShareList.length; i++) {
                this.ShareList[i] = new DomainShareInfo(source.ShareList[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ShareList.", this.ShareList);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

