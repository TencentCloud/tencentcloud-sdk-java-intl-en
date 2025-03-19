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

public class CreateOrganizationMemberAuthIdentityRequest extends AbstractModel {

    /**
    * Member UIN list, including up to 10 items.
    */
    @SerializedName("MemberUins")
    @Expose
    private Long [] MemberUins;

    /**
    * Identity ID list, including up to 5 items, which can be obtained through [ListOrganizationIdentity](https://intl.cloud.tencent.com/document/product/850/82934?from_cn_redirect=1).
    */
    @SerializedName("IdentityIds")
    @Expose
    private Long [] IdentityIds;

    /**
     * Get Member UIN list, including up to 10 items. 
     * @return MemberUins Member UIN list, including up to 10 items.
     */
    public Long [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set Member UIN list, including up to 10 items.
     * @param MemberUins Member UIN list, including up to 10 items.
     */
    public void setMemberUins(Long [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    /**
     * Get Identity ID list, including up to 5 items, which can be obtained through [ListOrganizationIdentity](https://intl.cloud.tencent.com/document/product/850/82934?from_cn_redirect=1). 
     * @return IdentityIds Identity ID list, including up to 5 items, which can be obtained through [ListOrganizationIdentity](https://intl.cloud.tencent.com/document/product/850/82934?from_cn_redirect=1).
     */
    public Long [] getIdentityIds() {
        return this.IdentityIds;
    }

    /**
     * Set Identity ID list, including up to 5 items, which can be obtained through [ListOrganizationIdentity](https://intl.cloud.tencent.com/document/product/850/82934?from_cn_redirect=1).
     * @param IdentityIds Identity ID list, including up to 5 items, which can be obtained through [ListOrganizationIdentity](https://intl.cloud.tencent.com/document/product/850/82934?from_cn_redirect=1).
     */
    public void setIdentityIds(Long [] IdentityIds) {
        this.IdentityIds = IdentityIds;
    }

    public CreateOrganizationMemberAuthIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationMemberAuthIdentityRequest(CreateOrganizationMemberAuthIdentityRequest source) {
        if (source.MemberUins != null) {
            this.MemberUins = new Long[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new Long(source.MemberUins[i]);
            }
        }
        if (source.IdentityIds != null) {
            this.IdentityIds = new Long[source.IdentityIds.length];
            for (int i = 0; i < source.IdentityIds.length; i++) {
                this.IdentityIds[i] = new Long(source.IdentityIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);
        this.setParamArraySimple(map, prefix + "IdentityIds.", this.IdentityIds);

    }
}

