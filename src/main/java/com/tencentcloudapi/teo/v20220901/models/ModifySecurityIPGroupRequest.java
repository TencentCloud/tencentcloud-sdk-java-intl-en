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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityIPGroupRequest extends AbstractModel {

    /**
    * Zone Id.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * IP group configuration.
    */
    @SerializedName("IPGroup")
    @Expose
    private IPGroup IPGroup;

    /**
    * Operation type. Valid values: <li> append: Add a new IP address to the IPGroup or set a scheduled expiration time;</li><li> remove: Delete a specified IP address or its scheduled expiration time from the IPGroup;</li><li> update: Replace all content in Content or ExpireInfo of the IPGroup, and modifications to the name of the IPGroup are allowed.</li>Notes for the append operation: <li> When adding a scheduled expiration time for an IP or range, it must be later than the current time. If the IP or range does not exist in the group, you must add it in the Content parameter simultaneously. If the IP or range already has an expiration time, the new time will override the original time.</li>Notes for the remove operation: <li> When deleting an IP or range, related unexpired scheduled expiration times will also be deleted;</li> <li> When deleting a scheduled expiration time, you can only delete a time that is not expired.</li>Notes for the update operation: <li> When replacing the content of Content, unexpired times of IPs or ranges not in Content will be deleted;</li> <li> When replacing the content of IPExpireInfo, the IPs or ranges in IPExpireInfo must be in Content or exist in the IP group.</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get Zone Id. 
     * @return ZoneId Zone Id.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone Id.
     * @param ZoneId Zone Id.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get IP group configuration. 
     * @return IPGroup IP group configuration.
     */
    public IPGroup getIPGroup() {
        return this.IPGroup;
    }

    /**
     * Set IP group configuration.
     * @param IPGroup IP group configuration.
     */
    public void setIPGroup(IPGroup IPGroup) {
        this.IPGroup = IPGroup;
    }

    /**
     * Get Operation type. Valid values: <li> append: Add a new IP address to the IPGroup or set a scheduled expiration time;</li><li> remove: Delete a specified IP address or its scheduled expiration time from the IPGroup;</li><li> update: Replace all content in Content or ExpireInfo of the IPGroup, and modifications to the name of the IPGroup are allowed.</li>Notes for the append operation: <li> When adding a scheduled expiration time for an IP or range, it must be later than the current time. If the IP or range does not exist in the group, you must add it in the Content parameter simultaneously. If the IP or range already has an expiration time, the new time will override the original time.</li>Notes for the remove operation: <li> When deleting an IP or range, related unexpired scheduled expiration times will also be deleted;</li> <li> When deleting a scheduled expiration time, you can only delete a time that is not expired.</li>Notes for the update operation: <li> When replacing the content of Content, unexpired times of IPs or ranges not in Content will be deleted;</li> <li> When replacing the content of IPExpireInfo, the IPs or ranges in IPExpireInfo must be in Content or exist in the IP group.</li> 
     * @return Mode Operation type. Valid values: <li> append: Add a new IP address to the IPGroup or set a scheduled expiration time;</li><li> remove: Delete a specified IP address or its scheduled expiration time from the IPGroup;</li><li> update: Replace all content in Content or ExpireInfo of the IPGroup, and modifications to the name of the IPGroup are allowed.</li>Notes for the append operation: <li> When adding a scheduled expiration time for an IP or range, it must be later than the current time. If the IP or range does not exist in the group, you must add it in the Content parameter simultaneously. If the IP or range already has an expiration time, the new time will override the original time.</li>Notes for the remove operation: <li> When deleting an IP or range, related unexpired scheduled expiration times will also be deleted;</li> <li> When deleting a scheduled expiration time, you can only delete a time that is not expired.</li>Notes for the update operation: <li> When replacing the content of Content, unexpired times of IPs or ranges not in Content will be deleted;</li> <li> When replacing the content of IPExpireInfo, the IPs or ranges in IPExpireInfo must be in Content or exist in the IP group.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Operation type. Valid values: <li> append: Add a new IP address to the IPGroup or set a scheduled expiration time;</li><li> remove: Delete a specified IP address or its scheduled expiration time from the IPGroup;</li><li> update: Replace all content in Content or ExpireInfo of the IPGroup, and modifications to the name of the IPGroup are allowed.</li>Notes for the append operation: <li> When adding a scheduled expiration time for an IP or range, it must be later than the current time. If the IP or range does not exist in the group, you must add it in the Content parameter simultaneously. If the IP or range already has an expiration time, the new time will override the original time.</li>Notes for the remove operation: <li> When deleting an IP or range, related unexpired scheduled expiration times will also be deleted;</li> <li> When deleting a scheduled expiration time, you can only delete a time that is not expired.</li>Notes for the update operation: <li> When replacing the content of Content, unexpired times of IPs or ranges not in Content will be deleted;</li> <li> When replacing the content of IPExpireInfo, the IPs or ranges in IPExpireInfo must be in Content or exist in the IP group.</li>
     * @param Mode Operation type. Valid values: <li> append: Add a new IP address to the IPGroup or set a scheduled expiration time;</li><li> remove: Delete a specified IP address or its scheduled expiration time from the IPGroup;</li><li> update: Replace all content in Content or ExpireInfo of the IPGroup, and modifications to the name of the IPGroup are allowed.</li>Notes for the append operation: <li> When adding a scheduled expiration time for an IP or range, it must be later than the current time. If the IP or range does not exist in the group, you must add it in the Content parameter simultaneously. If the IP or range already has an expiration time, the new time will override the original time.</li>Notes for the remove operation: <li> When deleting an IP or range, related unexpired scheduled expiration times will also be deleted;</li> <li> When deleting a scheduled expiration time, you can only delete a time that is not expired.</li>Notes for the update operation: <li> When replacing the content of Content, unexpired times of IPs or ranges not in Content will be deleted;</li> <li> When replacing the content of IPExpireInfo, the IPs or ranges in IPExpireInfo must be in Content or exist in the IP group.</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public ModifySecurityIPGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityIPGroupRequest(ModifySecurityIPGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IPGroup != null) {
            this.IPGroup = new IPGroup(source.IPGroup);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "IPGroup.", this.IPGroup);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

