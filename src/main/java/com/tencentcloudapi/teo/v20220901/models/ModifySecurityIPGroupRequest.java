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
    * Site ID.
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
    * Operation type. valid values: <li>`append`: add new IP addresses or set scheduled expiration time to `IPGroup`;</li> <li>`remove`: delete specified IP addresses or their scheduled expiration time from `IPGroup`;</li> <li>`update`: replace all Content of `Content` or `ExpireInfo` in `IPGroup` and modify the IPGroup name.</li>  notes for `append` operation: <li>when adding a scheduled expiration time for an IP or range, it must be later than the current time. if the IP or range does not exist in the group, it must be added to the `Content` parameter simultaneously. if the IP or range already has an expiration time, the new time will overwrite the original one.</li>  notes for `remove` operation: <li>when deleting an IP or range, related unexpired scheduled expiration times will also be deleted;</li> <li>when deleting a scheduled expiration time, only currently unexpired times can be removed.</li>  notes for `update` operation: <li>when replacing `Content`, unexpired times of ips or ranges not in `Content` will be deleted;</li> <li>when replacing `IPExpireInfo`, the ips or ranges in `IPExpireInfo` must exist in `Content` or the IP group.</li>.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
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
     * Get Operation type. valid values: <li>`append`: add new IP addresses or set scheduled expiration time to `IPGroup`;</li> <li>`remove`: delete specified IP addresses or their scheduled expiration time from `IPGroup`;</li> <li>`update`: replace all Content of `Content` or `ExpireInfo` in `IPGroup` and modify the IPGroup name.</li>  notes for `append` operation: <li>when adding a scheduled expiration time for an IP or range, it must be later than the current time. if the IP or range does not exist in the group, it must be added to the `Content` parameter simultaneously. if the IP or range already has an expiration time, the new time will overwrite the original one.</li>  notes for `remove` operation: <li>when deleting an IP or range, related unexpired scheduled expiration times will also be deleted;</li> <li>when deleting a scheduled expiration time, only currently unexpired times can be removed.</li>  notes for `update` operation: <li>when replacing `Content`, unexpired times of ips or ranges not in `Content` will be deleted;</li> <li>when replacing `IPExpireInfo`, the ips or ranges in `IPExpireInfo` must exist in `Content` or the IP group.</li>. 
     * @return Mode Operation type. valid values: <li>`append`: add new IP addresses or set scheduled expiration time to `IPGroup`;</li> <li>`remove`: delete specified IP addresses or their scheduled expiration time from `IPGroup`;</li> <li>`update`: replace all Content of `Content` or `ExpireInfo` in `IPGroup` and modify the IPGroup name.</li>  notes for `append` operation: <li>when adding a scheduled expiration time for an IP or range, it must be later than the current time. if the IP or range does not exist in the group, it must be added to the `Content` parameter simultaneously. if the IP or range already has an expiration time, the new time will overwrite the original one.</li>  notes for `remove` operation: <li>when deleting an IP or range, related unexpired scheduled expiration times will also be deleted;</li> <li>when deleting a scheduled expiration time, only currently unexpired times can be removed.</li>  notes for `update` operation: <li>when replacing `Content`, unexpired times of ips or ranges not in `Content` will be deleted;</li> <li>when replacing `IPExpireInfo`, the ips or ranges in `IPExpireInfo` must exist in `Content` or the IP group.</li>.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Operation type. valid values: <li>`append`: add new IP addresses or set scheduled expiration time to `IPGroup`;</li> <li>`remove`: delete specified IP addresses or their scheduled expiration time from `IPGroup`;</li> <li>`update`: replace all Content of `Content` or `ExpireInfo` in `IPGroup` and modify the IPGroup name.</li>  notes for `append` operation: <li>when adding a scheduled expiration time for an IP or range, it must be later than the current time. if the IP or range does not exist in the group, it must be added to the `Content` parameter simultaneously. if the IP or range already has an expiration time, the new time will overwrite the original one.</li>  notes for `remove` operation: <li>when deleting an IP or range, related unexpired scheduled expiration times will also be deleted;</li> <li>when deleting a scheduled expiration time, only currently unexpired times can be removed.</li>  notes for `update` operation: <li>when replacing `Content`, unexpired times of ips or ranges not in `Content` will be deleted;</li> <li>when replacing `IPExpireInfo`, the ips or ranges in `IPExpireInfo` must exist in `Content` or the IP group.</li>.
     * @param Mode Operation type. valid values: <li>`append`: add new IP addresses or set scheduled expiration time to `IPGroup`;</li> <li>`remove`: delete specified IP addresses or their scheduled expiration time from `IPGroup`;</li> <li>`update`: replace all Content of `Content` or `ExpireInfo` in `IPGroup` and modify the IPGroup name.</li>  notes for `append` operation: <li>when adding a scheduled expiration time for an IP or range, it must be later than the current time. if the IP or range does not exist in the group, it must be added to the `Content` parameter simultaneously. if the IP or range already has an expiration time, the new time will overwrite the original one.</li>  notes for `remove` operation: <li>when deleting an IP or range, related unexpired scheduled expiration times will also be deleted;</li> <li>when deleting a scheduled expiration time, only currently unexpired times can be removed.</li>  notes for `update` operation: <li>when replacing `Content`, unexpired times of ips or ranges not in `Content` will be deleted;</li> <li>when replacing `IPExpireInfo`, the ips or ranges in `IPExpireInfo` must exist in `Content` or the IP group.</li>.
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

