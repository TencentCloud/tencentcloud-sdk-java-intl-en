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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainOwnerRequest extends AbstractModel {

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The account to which to transfer the domain, which can be an UIN or email address
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get Domain 
     * @return Domain Domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
     * @param Domain Domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The account to which to transfer the domain, which can be an UIN or email address 
     * @return Account The account to which to transfer the domain, which can be an UIN or email address
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set The account to which to transfer the domain, which can be an UIN or email address
     * @param Account The account to which to transfer the domain, which can be an UIN or email address
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API. 
     * @return DomainId The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
     * @param DomainId The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public ModifyDomainOwnerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainOwnerRequest(ModifyDomainOwnerRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

