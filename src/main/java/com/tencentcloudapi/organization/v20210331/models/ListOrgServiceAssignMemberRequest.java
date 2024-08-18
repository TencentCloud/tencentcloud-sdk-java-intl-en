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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListOrgServiceAssignMemberRequest extends AbstractModel {

    /**
    * Offset. Its value must be an integer multiple of the limit. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit. Value range: 1-50. Default value: 10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Organization service ID, which can be obtained through [ListOrganizationService](https://intl.cloud.tencent.com/document/product/850/109561?from_cn_redirect=1).
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
     * Get Offset. Its value must be an integer multiple of the limit. Default value: 0. 
     * @return Offset Offset. Its value must be an integer multiple of the limit. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Its value must be an integer multiple of the limit. Default value: 0.
     * @param Offset Offset. Its value must be an integer multiple of the limit. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit. Value range: 1-50. Default value: 10. 
     * @return Limit Limit. Value range: 1-50. Default value: 10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit. Value range: 1-50. Default value: 10.
     * @param Limit Limit. Value range: 1-50. Default value: 10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Organization service ID, which can be obtained through [ListOrganizationService](https://intl.cloud.tencent.com/document/product/850/109561?from_cn_redirect=1). 
     * @return ServiceId Organization service ID, which can be obtained through [ListOrganizationService](https://intl.cloud.tencent.com/document/product/850/109561?from_cn_redirect=1).
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Organization service ID, which can be obtained through [ListOrganizationService](https://intl.cloud.tencent.com/document/product/850/109561?from_cn_redirect=1).
     * @param ServiceId Organization service ID, which can be obtained through [ListOrganizationService](https://intl.cloud.tencent.com/document/product/850/109561?from_cn_redirect=1).
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    public ListOrgServiceAssignMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOrgServiceAssignMemberRequest(ListOrgServiceAssignMemberRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}
