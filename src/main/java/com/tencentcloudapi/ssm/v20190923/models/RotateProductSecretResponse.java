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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RotateProductSecretResponse extends AbstractModel{

    /**
    * Asynchronous rotation task ID. This field is valid when `SecretType` is `1` (i.e., the secret type is Tencent Cloud services secret, such as MySQL/TDSQL credentials).
    */
    @SerializedName("FlowID")
    @Expose
    private Long FlowID;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Asynchronous rotation task ID. This field is valid when `SecretType` is `1` (i.e., the secret type is Tencent Cloud services secret, such as MySQL/TDSQL credentials). 
     * @return FlowID Asynchronous rotation task ID. This field is valid when `SecretType` is `1` (i.e., the secret type is Tencent Cloud services secret, such as MySQL/TDSQL credentials).
     */
    public Long getFlowID() {
        return this.FlowID;
    }

    /**
     * Set Asynchronous rotation task ID. This field is valid when `SecretType` is `1` (i.e., the secret type is Tencent Cloud services secret, such as MySQL/TDSQL credentials).
     * @param FlowID Asynchronous rotation task ID. This field is valid when `SecretType` is `1` (i.e., the secret type is Tencent Cloud services secret, such as MySQL/TDSQL credentials).
     */
    public void setFlowID(Long FlowID) {
        this.FlowID = FlowID;
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

    public RotateProductSecretResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RotateProductSecretResponse(RotateProductSecretResponse source) {
        if (source.FlowID != null) {
            this.FlowID = new Long(source.FlowID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowID", this.FlowID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

