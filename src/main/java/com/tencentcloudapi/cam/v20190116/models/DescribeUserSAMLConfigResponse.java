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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserSAMLConfigResponse extends AbstractModel{

    /**
    * SAML metadata document.
    */
    @SerializedName("SAMLMetadata")
    @Expose
    private String SAMLMetadata;

    /**
    * Status. `0`: not set, `11`: enabled, `2`: disabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SAML metadata document. 
     * @return SAMLMetadata SAML metadata document.
     */
    public String getSAMLMetadata() {
        return this.SAMLMetadata;
    }

    /**
     * Set SAML metadata document.
     * @param SAMLMetadata SAML metadata document.
     */
    public void setSAMLMetadata(String SAMLMetadata) {
        this.SAMLMetadata = SAMLMetadata;
    }

    /**
     * Get Status. `0`: not set, `11`: enabled, `2`: disabled. 
     * @return Status Status. `0`: not set, `11`: enabled, `2`: disabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. `0`: not set, `11`: enabled, `2`: disabled.
     * @param Status Status. `0`: not set, `11`: enabled, `2`: disabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public DescribeUserSAMLConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserSAMLConfigResponse(DescribeUserSAMLConfigResponse source) {
        if (source.SAMLMetadata != null) {
            this.SAMLMetadata = new String(source.SAMLMetadata);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SAMLMetadata", this.SAMLMetadata);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

