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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigratePrivateIpAddressRequest extends AbstractModel {

    /**
    * ID of the ENI instance bound with the private IP, such as `eni-m6dyj72l`.
    */
    @SerializedName("SourceNetworkInterfaceId")
    @Expose
    private String SourceNetworkInterfaceId;

    /**
    * ID of the destination ENI instance to be migrated.
    */
    @SerializedName("DestinationNetworkInterfaceId")
    @Expose
    private String DestinationNetworkInterfaceId;

    /**
    * The private IP to be migrated, such as 10.0.0.6.
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
     * Get ID of the ENI instance bound with the private IP, such as `eni-m6dyj72l`. 
     * @return SourceNetworkInterfaceId ID of the ENI instance bound with the private IP, such as `eni-m6dyj72l`.
     */
    public String getSourceNetworkInterfaceId() {
        return this.SourceNetworkInterfaceId;
    }

    /**
     * Set ID of the ENI instance bound with the private IP, such as `eni-m6dyj72l`.
     * @param SourceNetworkInterfaceId ID of the ENI instance bound with the private IP, such as `eni-m6dyj72l`.
     */
    public void setSourceNetworkInterfaceId(String SourceNetworkInterfaceId) {
        this.SourceNetworkInterfaceId = SourceNetworkInterfaceId;
    }

    /**
     * Get ID of the destination ENI instance to be migrated. 
     * @return DestinationNetworkInterfaceId ID of the destination ENI instance to be migrated.
     */
    public String getDestinationNetworkInterfaceId() {
        return this.DestinationNetworkInterfaceId;
    }

    /**
     * Set ID of the destination ENI instance to be migrated.
     * @param DestinationNetworkInterfaceId ID of the destination ENI instance to be migrated.
     */
    public void setDestinationNetworkInterfaceId(String DestinationNetworkInterfaceId) {
        this.DestinationNetworkInterfaceId = DestinationNetworkInterfaceId;
    }

    /**
     * Get The private IP to be migrated, such as 10.0.0.6. 
     * @return PrivateIpAddress The private IP to be migrated, such as 10.0.0.6.
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set The private IP to be migrated, such as 10.0.0.6.
     * @param PrivateIpAddress The private IP to be migrated, such as 10.0.0.6.
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    public MigratePrivateIpAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigratePrivateIpAddressRequest(MigratePrivateIpAddressRequest source) {
        if (source.SourceNetworkInterfaceId != null) {
            this.SourceNetworkInterfaceId = new String(source.SourceNetworkInterfaceId);
        }
        if (source.DestinationNetworkInterfaceId != null) {
            this.DestinationNetworkInterfaceId = new String(source.DestinationNetworkInterfaceId);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceNetworkInterfaceId", this.SourceNetworkInterfaceId);
        this.setParamSimple(map, prefix + "DestinationNetworkInterfaceId", this.DestinationNetworkInterfaceId);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);

    }
}

