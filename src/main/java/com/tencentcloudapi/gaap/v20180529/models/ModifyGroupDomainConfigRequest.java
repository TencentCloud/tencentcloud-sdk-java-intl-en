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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGroupDomainConfigRequest extends AbstractModel {

    /**
    * Connection group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Default access IP or domain name of domain name resolution
    */
    @SerializedName("DefaultDnsIp")
    @Expose
    private String DefaultDnsIp;

    /**
    * Nearest access region configuration.
    */
    @SerializedName("AccessRegionList")
    @Expose
    private AccessRegionDomainConf [] AccessRegionList;

    /**
     * Get Connection group ID. 
     * @return GroupId Connection group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID.
     * @param GroupId Connection group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Default access IP or domain name of domain name resolution 
     * @return DefaultDnsIp Default access IP or domain name of domain name resolution
     */
    public String getDefaultDnsIp() {
        return this.DefaultDnsIp;
    }

    /**
     * Set Default access IP or domain name of domain name resolution
     * @param DefaultDnsIp Default access IP or domain name of domain name resolution
     */
    public void setDefaultDnsIp(String DefaultDnsIp) {
        this.DefaultDnsIp = DefaultDnsIp;
    }

    /**
     * Get Nearest access region configuration. 
     * @return AccessRegionList Nearest access region configuration.
     */
    public AccessRegionDomainConf [] getAccessRegionList() {
        return this.AccessRegionList;
    }

    /**
     * Set Nearest access region configuration.
     * @param AccessRegionList Nearest access region configuration.
     */
    public void setAccessRegionList(AccessRegionDomainConf [] AccessRegionList) {
        this.AccessRegionList = AccessRegionList;
    }

    public ModifyGroupDomainConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGroupDomainConfigRequest(ModifyGroupDomainConfigRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.DefaultDnsIp != null) {
            this.DefaultDnsIp = new String(source.DefaultDnsIp);
        }
        if (source.AccessRegionList != null) {
            this.AccessRegionList = new AccessRegionDomainConf[source.AccessRegionList.length];
            for (int i = 0; i < source.AccessRegionList.length; i++) {
                this.AccessRegionList[i] = new AccessRegionDomainConf(source.AccessRegionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "DefaultDnsIp", this.DefaultDnsIp);
        this.setParamArrayObj(map, prefix + "AccessRegionList.", this.AccessRegionList);

    }
}

