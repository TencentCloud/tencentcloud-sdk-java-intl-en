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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicAddressConfig extends AbstractModel {

    /**
    * Public ip address
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Maximum public network bandwidth
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * public network associated group id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Public network associated group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Public network CLB id
    */
    @SerializedName("NetworkId")
    @Expose
    private String NetworkId;

    /**
    * Description of public network CLB
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Public ip address 
     * @return Vip Public ip address
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Public ip address
     * @param Vip Public ip address
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Maximum public network bandwidth 
     * @return InternetMaxBandwidthOut Maximum public network bandwidth
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Maximum public network bandwidth
     * @param InternetMaxBandwidthOut Maximum public network bandwidth
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get public network associated group id 
     * @return GroupId public network associated group id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set public network associated group id
     * @param GroupId public network associated group id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Public network associated group name 
     * @return GroupName Public network associated group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Public network associated group name
     * @param GroupName Public network associated group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Public network CLB id 
     * @return NetworkId Public network CLB id
     */
    public String getNetworkId() {
        return this.NetworkId;
    }

    /**
     * Set Public network CLB id
     * @param NetworkId Public network CLB id
     */
    public void setNetworkId(String NetworkId) {
        this.NetworkId = NetworkId;
    }

    /**
     * Get Description of public network CLB 
     * @return Description Description of public network CLB
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of public network CLB
     * @param Description Description of public network CLB
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public PublicAddressConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicAddressConfig(PublicAddressConfig source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.NetworkId != null) {
            this.NetworkId = new String(source.NetworkId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "NetworkId", this.NetworkId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

