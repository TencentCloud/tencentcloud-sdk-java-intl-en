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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableProtoStatus extends AbstractModel{

    /**
    * Sale status. Valid values: sale_out (sold out), saling (purchasable), no_saling (non-purchasable)
    */
    @SerializedName("SaleStatus")
    @Expose
    private String SaleStatus;

    /**
    * Protocol type. Valid values: NFS, CIFS
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get Sale status. Valid values: sale_out (sold out), saling (purchasable), no_saling (non-purchasable) 
     * @return SaleStatus Sale status. Valid values: sale_out (sold out), saling (purchasable), no_saling (non-purchasable)
     */
    public String getSaleStatus() {
        return this.SaleStatus;
    }

    /**
     * Set Sale status. Valid values: sale_out (sold out), saling (purchasable), no_saling (non-purchasable)
     * @param SaleStatus Sale status. Valid values: sale_out (sold out), saling (purchasable), no_saling (non-purchasable)
     */
    public void setSaleStatus(String SaleStatus) {
        this.SaleStatus = SaleStatus;
    }

    /**
     * Get Protocol type. Valid values: NFS, CIFS 
     * @return Protocol Protocol type. Valid values: NFS, CIFS
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol type. Valid values: NFS, CIFS
     * @param Protocol Protocol type. Valid values: NFS, CIFS
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SaleStatus", this.SaleStatus);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

