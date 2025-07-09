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

public class OriginACLInfo extends AbstractModel {

    /**
    * The list of L7 accelerated domains that enable the origin ACLs. This field is empty when origin protection is not enabled.
    */
    @SerializedName("L7Hosts")
    @Expose
    private String [] L7Hosts;

    /**
    * The list of L4 proxy instances that enable the origin ACLs. This field is empty when origin protection is not enabled.
    */
    @SerializedName("L4ProxyIds")
    @Expose
    private String [] L4ProxyIds;

    /**
    * Currently effective origin ACLs. This field is empty when origin protection is not enabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("CurrentOriginACL")
    @Expose
    private CurrentOriginACL CurrentOriginACL;

    /**
    * When the origin ACLs are updated, this field will be returned with the next version's origin IP range to take effect, including a comparison with the current origin IP range. This field is empty if not updated or origin protection is not enabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("NextOriginACL")
    @Expose
    private NextOriginACL NextOriginACL;

    /**
    * Origin protection status. Vaild values:
- online: in effect;
- offline: disabled;
- updating: configuration deployment in progress.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get The list of L7 accelerated domains that enable the origin ACLs. This field is empty when origin protection is not enabled. 
     * @return L7Hosts The list of L7 accelerated domains that enable the origin ACLs. This field is empty when origin protection is not enabled.
     */
    public String [] getL7Hosts() {
        return this.L7Hosts;
    }

    /**
     * Set The list of L7 accelerated domains that enable the origin ACLs. This field is empty when origin protection is not enabled.
     * @param L7Hosts The list of L7 accelerated domains that enable the origin ACLs. This field is empty when origin protection is not enabled.
     */
    public void setL7Hosts(String [] L7Hosts) {
        this.L7Hosts = L7Hosts;
    }

    /**
     * Get The list of L4 proxy instances that enable the origin ACLs. This field is empty when origin protection is not enabled. 
     * @return L4ProxyIds The list of L4 proxy instances that enable the origin ACLs. This field is empty when origin protection is not enabled.
     */
    public String [] getL4ProxyIds() {
        return this.L4ProxyIds;
    }

    /**
     * Set The list of L4 proxy instances that enable the origin ACLs. This field is empty when origin protection is not enabled.
     * @param L4ProxyIds The list of L4 proxy instances that enable the origin ACLs. This field is empty when origin protection is not enabled.
     */
    public void setL4ProxyIds(String [] L4ProxyIds) {
        this.L4ProxyIds = L4ProxyIds;
    }

    /**
     * Get Currently effective origin ACLs. This field is empty when origin protection is not enabled.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return CurrentOriginACL Currently effective origin ACLs. This field is empty when origin protection is not enabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public CurrentOriginACL getCurrentOriginACL() {
        return this.CurrentOriginACL;
    }

    /**
     * Set Currently effective origin ACLs. This field is empty when origin protection is not enabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param CurrentOriginACL Currently effective origin ACLs. This field is empty when origin protection is not enabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCurrentOriginACL(CurrentOriginACL CurrentOriginACL) {
        this.CurrentOriginACL = CurrentOriginACL;
    }

    /**
     * Get When the origin ACLs are updated, this field will be returned with the next version's origin IP range to take effect, including a comparison with the current origin IP range. This field is empty if not updated or origin protection is not enabled.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return NextOriginACL When the origin ACLs are updated, this field will be returned with the next version's origin IP range to take effect, including a comparison with the current origin IP range. This field is empty if not updated or origin protection is not enabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public NextOriginACL getNextOriginACL() {
        return this.NextOriginACL;
    }

    /**
     * Set When the origin ACLs are updated, this field will be returned with the next version's origin IP range to take effect, including a comparison with the current origin IP range. This field is empty if not updated or origin protection is not enabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param NextOriginACL When the origin ACLs are updated, this field will be returned with the next version's origin IP range to take effect, including a comparison with the current origin IP range. This field is empty if not updated or origin protection is not enabled.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setNextOriginACL(NextOriginACL NextOriginACL) {
        this.NextOriginACL = NextOriginACL;
    }

    /**
     * Get Origin protection status. Vaild values:
- online: in effect;
- offline: disabled;
- updating: configuration deployment in progress. 
     * @return Status Origin protection status. Vaild values:
- online: in effect;
- offline: disabled;
- updating: configuration deployment in progress.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Origin protection status. Vaild values:
- online: in effect;
- offline: disabled;
- updating: configuration deployment in progress.
     * @param Status Origin protection status. Vaild values:
- online: in effect;
- offline: disabled;
- updating: configuration deployment in progress.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public OriginACLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginACLInfo(OriginACLInfo source) {
        if (source.L7Hosts != null) {
            this.L7Hosts = new String[source.L7Hosts.length];
            for (int i = 0; i < source.L7Hosts.length; i++) {
                this.L7Hosts[i] = new String(source.L7Hosts[i]);
            }
        }
        if (source.L4ProxyIds != null) {
            this.L4ProxyIds = new String[source.L4ProxyIds.length];
            for (int i = 0; i < source.L4ProxyIds.length; i++) {
                this.L4ProxyIds[i] = new String(source.L4ProxyIds[i]);
            }
        }
        if (source.CurrentOriginACL != null) {
            this.CurrentOriginACL = new CurrentOriginACL(source.CurrentOriginACL);
        }
        if (source.NextOriginACL != null) {
            this.NextOriginACL = new NextOriginACL(source.NextOriginACL);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "L7Hosts.", this.L7Hosts);
        this.setParamArraySimple(map, prefix + "L4ProxyIds.", this.L4ProxyIds);
        this.setParamObj(map, prefix + "CurrentOriginACL.", this.CurrentOriginACL);
        this.setParamObj(map, prefix + "NextOriginACL.", this.NextOriginACL);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

