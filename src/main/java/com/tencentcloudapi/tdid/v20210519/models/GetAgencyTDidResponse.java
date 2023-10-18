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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAgencyTDidResponse extends AbstractModel {

    /**
    * The prefix (fixed).
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * The details of the DID.
    */
    @SerializedName("Identity")
    @Expose
    private Identity [] Identity;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The prefix (fixed). 
     * @return Prefix The prefix (fixed).
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set The prefix (fixed).
     * @param Prefix The prefix (fixed).
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get The details of the DID. 
     * @return Identity The details of the DID.
     */
    public Identity [] getIdentity() {
        return this.Identity;
    }

    /**
     * Set The details of the DID.
     * @param Identity The details of the DID.
     */
    public void setIdentity(Identity [] Identity) {
        this.Identity = Identity;
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

    public GetAgencyTDidResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAgencyTDidResponse(GetAgencyTDidResponse source) {
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Identity != null) {
            this.Identity = new Identity[source.Identity.length];
            for (int i = 0; i < source.Identity.length; i++) {
                this.Identity[i] = new Identity(source.Identity[i]);
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
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamArrayObj(map, prefix + "Identity.", this.Identity);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

