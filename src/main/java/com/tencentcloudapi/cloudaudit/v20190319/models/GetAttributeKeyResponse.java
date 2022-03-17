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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAttributeKeyResponse extends AbstractModel{

    /**
    * Valid values of `AttributeKey`
    */
    @SerializedName("AttributeKeyDetails")
    @Expose
    private AttributeKeyDetail [] AttributeKeyDetails;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Valid values of `AttributeKey` 
     * @return AttributeKeyDetails Valid values of `AttributeKey`
     */
    public AttributeKeyDetail [] getAttributeKeyDetails() {
        return this.AttributeKeyDetails;
    }

    /**
     * Set Valid values of `AttributeKey`
     * @param AttributeKeyDetails Valid values of `AttributeKey`
     */
    public void setAttributeKeyDetails(AttributeKeyDetail [] AttributeKeyDetails) {
        this.AttributeKeyDetails = AttributeKeyDetails;
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

    public GetAttributeKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAttributeKeyResponse(GetAttributeKeyResponse source) {
        if (source.AttributeKeyDetails != null) {
            this.AttributeKeyDetails = new AttributeKeyDetail[source.AttributeKeyDetails.length];
            for (int i = 0; i < source.AttributeKeyDetails.length; i++) {
                this.AttributeKeyDetails[i] = new AttributeKeyDetail(source.AttributeKeyDetails[i]);
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
        this.setParamArrayObj(map, prefix + "AttributeKeyDetails.", this.AttributeKeyDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

