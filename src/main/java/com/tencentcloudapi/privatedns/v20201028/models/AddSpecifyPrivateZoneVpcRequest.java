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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSpecifyPrivateZoneVpcRequest extends AbstractModel {

    /**
    * Private domain ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Information about the new VPC.
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * Information about the new VPC of the associated account.
    */
    @SerializedName("AccountVpcSet")
    @Expose
    private AccountVpcInfo [] AccountVpcSet;

    /**
    * Whether the operation is synchronous.
    */
    @SerializedName("Sync")
    @Expose
    private Boolean Sync;

    /**
     * Get Private domain ID. 
     * @return ZoneId Private domain ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Private domain ID.
     * @param ZoneId Private domain ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Information about the new VPC. 
     * @return VpcSet Information about the new VPC.
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set Information about the new VPC.
     * @param VpcSet Information about the new VPC.
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get Information about the new VPC of the associated account. 
     * @return AccountVpcSet Information about the new VPC of the associated account.
     */
    public AccountVpcInfo [] getAccountVpcSet() {
        return this.AccountVpcSet;
    }

    /**
     * Set Information about the new VPC of the associated account.
     * @param AccountVpcSet Information about the new VPC of the associated account.
     */
    public void setAccountVpcSet(AccountVpcInfo [] AccountVpcSet) {
        this.AccountVpcSet = AccountVpcSet;
    }

    /**
     * Get Whether the operation is synchronous. 
     * @return Sync Whether the operation is synchronous.
     */
    public Boolean getSync() {
        return this.Sync;
    }

    /**
     * Set Whether the operation is synchronous.
     * @param Sync Whether the operation is synchronous.
     */
    public void setSync(Boolean Sync) {
        this.Sync = Sync;
    }

    public AddSpecifyPrivateZoneVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSpecifyPrivateZoneVpcRequest(AddSpecifyPrivateZoneVpcRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.VpcSet != null) {
            this.VpcSet = new VpcInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcInfo(source.VpcSet[i]);
            }
        }
        if (source.AccountVpcSet != null) {
            this.AccountVpcSet = new AccountVpcInfo[source.AccountVpcSet.length];
            for (int i = 0; i < source.AccountVpcSet.length; i++) {
                this.AccountVpcSet[i] = new AccountVpcInfo(source.AccountVpcSet[i]);
            }
        }
        if (source.Sync != null) {
            this.Sync = new Boolean(source.Sync);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamArrayObj(map, prefix + "AccountVpcSet.", this.AccountVpcSet);
        this.setParamSimple(map, prefix + "Sync", this.Sync);

    }
}

