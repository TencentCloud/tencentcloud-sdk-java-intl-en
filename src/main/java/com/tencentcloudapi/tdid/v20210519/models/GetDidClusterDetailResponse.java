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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDidClusterDetailResponse extends AbstractModel{

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The consortium name.
    */
    @SerializedName("ConsortiumName")
    @Expose
    private String ConsortiumName;

    /**
    * The name of the blockchain organization.
    */
    @SerializedName("ChainAgency")
    @Expose
    private String ChainAgency;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The network ID. 
     * @return ClusterId The network ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The network ID.
     * @param ClusterId The network ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The consortium name. 
     * @return ConsortiumName The consortium name.
     */
    public String getConsortiumName() {
        return this.ConsortiumName;
    }

    /**
     * Set The consortium name.
     * @param ConsortiumName The consortium name.
     */
    public void setConsortiumName(String ConsortiumName) {
        this.ConsortiumName = ConsortiumName;
    }

    /**
     * Get The name of the blockchain organization. 
     * @return ChainAgency The name of the blockchain organization.
     */
    public String getChainAgency() {
        return this.ChainAgency;
    }

    /**
     * Set The name of the blockchain organization.
     * @param ChainAgency The name of the blockchain organization.
     */
    public void setChainAgency(String ChainAgency) {
        this.ChainAgency = ChainAgency;
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

    public GetDidClusterDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDidClusterDetailResponse(GetDidClusterDetailResponse source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ConsortiumName != null) {
            this.ConsortiumName = new String(source.ConsortiumName);
        }
        if (source.ChainAgency != null) {
            this.ChainAgency = new String(source.ChainAgency);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ConsortiumName", this.ConsortiumName);
        this.setParamSimple(map, prefix + "ChainAgency", this.ChainAgency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

