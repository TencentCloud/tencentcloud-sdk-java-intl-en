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

public class DescribeInstanceLoginKeyPairAttributeResponse extends AbstractModel {

    /**
    * Whether to allow login with the default key pair. Valid values: YES, NO.
    */
    @SerializedName("PermitLogin")
    @Expose
    private String PermitLogin;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether to allow login with the default key pair. Valid values: YES, NO. 
     * @return PermitLogin Whether to allow login with the default key pair. Valid values: YES, NO.
     */
    public String getPermitLogin() {
        return this.PermitLogin;
    }

    /**
     * Set Whether to allow login with the default key pair. Valid values: YES, NO.
     * @param PermitLogin Whether to allow login with the default key pair. Valid values: YES, NO.
     */
    public void setPermitLogin(String PermitLogin) {
        this.PermitLogin = PermitLogin;
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

    public DescribeInstanceLoginKeyPairAttributeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceLoginKeyPairAttributeResponse(DescribeInstanceLoginKeyPairAttributeResponse source) {
        if (source.PermitLogin != null) {
            this.PermitLogin = new String(source.PermitLogin);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PermitLogin", this.PermitLogin);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

