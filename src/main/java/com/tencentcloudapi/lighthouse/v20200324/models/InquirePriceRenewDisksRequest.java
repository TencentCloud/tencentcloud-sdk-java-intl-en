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

public class InquirePriceRenewDisksRequest extends AbstractModel {

    /**
    * List of cloud disk IDs.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Parameter settings for renewing the monthly subscribed cloud disk.
    */
    @SerializedName("RenewDiskChargePrepaid")
    @Expose
    private RenewDiskChargePrepaid RenewDiskChargePrepaid;

    /**
     * Get List of cloud disk IDs. 
     * @return DiskIds List of cloud disk IDs.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set List of cloud disk IDs.
     * @param DiskIds List of cloud disk IDs.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Parameter settings for renewing the monthly subscribed cloud disk. 
     * @return RenewDiskChargePrepaid Parameter settings for renewing the monthly subscribed cloud disk.
     */
    public RenewDiskChargePrepaid getRenewDiskChargePrepaid() {
        return this.RenewDiskChargePrepaid;
    }

    /**
     * Set Parameter settings for renewing the monthly subscribed cloud disk.
     * @param RenewDiskChargePrepaid Parameter settings for renewing the monthly subscribed cloud disk.
     */
    public void setRenewDiskChargePrepaid(RenewDiskChargePrepaid RenewDiskChargePrepaid) {
        this.RenewDiskChargePrepaid = RenewDiskChargePrepaid;
    }

    public InquirePriceRenewDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRenewDisksRequest(InquirePriceRenewDisksRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.RenewDiskChargePrepaid != null) {
            this.RenewDiskChargePrepaid = new RenewDiskChargePrepaid(source.RenewDiskChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamObj(map, prefix + "RenewDiskChargePrepaid.", this.RenewDiskChargePrepaid);

    }
}

