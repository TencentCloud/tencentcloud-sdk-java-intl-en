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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckChainResponse extends AbstractModel {

    /**
    * Whether you are the owner of the consortium. `1`: Yes; `0`: No.
    */
    @SerializedName("RoleType")
    @Expose
    private Long RoleType;

    /**
    * The chain ID.
    */
    @SerializedName("ChainId")
    @Expose
    private String ChainId;

    /**
    * The application name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether you are the owner of the consortium. `1`: Yes; `0`: No. 
     * @return RoleType Whether you are the owner of the consortium. `1`: Yes; `0`: No.
     */
    public Long getRoleType() {
        return this.RoleType;
    }

    /**
     * Set Whether you are the owner of the consortium. `1`: Yes; `0`: No.
     * @param RoleType Whether you are the owner of the consortium. `1`: Yes; `0`: No.
     */
    public void setRoleType(Long RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get The chain ID. 
     * @return ChainId The chain ID.
     */
    public String getChainId() {
        return this.ChainId;
    }

    /**
     * Set The chain ID.
     * @param ChainId The chain ID.
     */
    public void setChainId(String ChainId) {
        this.ChainId = ChainId;
    }

    /**
     * Get The application name. 
     * @return AppName The application name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The application name.
     * @param AppName The application name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
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

    public CheckChainResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckChainResponse(CheckChainResponse source) {
        if (source.RoleType != null) {
            this.RoleType = new Long(source.RoleType);
        }
        if (source.ChainId != null) {
            this.ChainId = new String(source.ChainId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

