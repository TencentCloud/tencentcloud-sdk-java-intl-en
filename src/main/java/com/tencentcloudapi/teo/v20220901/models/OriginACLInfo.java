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
    * <p>Origin protection mode for layer-7 acceleration domain names. Valid values: <li>all: automatic protection mode. All layer-7 acceleration domain names in the site are included in the origin protection list, including newly added layer-7 acceleration domain names;</li><li>specific: specified protection mode. Only bound layer-7 acceleration domain names are protected.</li></p>
    */
    @SerializedName("L7EnableMode")
    @Expose
    private String L7EnableMode;

    /**
    * <p>List of layer-7 acceleration domain names that have origin-pull from specific origin IP ranges enabled. Empty when origin protection is not enabled.</p>
    */
    @SerializedName("L7Hosts")
    @Expose
    private String [] L7Hosts;

    /**
    * <p>Origin protection mode for layer-4 proxy instances. Valid values: <li>all: automatic protection mode. All layer-4 proxy instances in the site are included in the origin protection list, including newly added layer-4 proxy instances;</li><li>specific: specified protection mode. Only bound layer-4 proxy instances are protected.</li></p>
    */
    @SerializedName("L4EnableMode")
    @Expose
    private String L4EnableMode;

    /**
    * <p>List of layer-4 proxy instances that have origin-pull from specific origin IP ranges enabled. Empty when origin protection is not enabled.</p>
    */
    @SerializedName("L4ProxyIds")
    @Expose
    private String [] L4ProxyIds;

    /**
    * <p>Currently effective origin IP range. Empty when origin protection is not enabled.</p>
    */
    @SerializedName("CurrentOriginACL")
    @Expose
    private CurrentOriginACL CurrentOriginACL;

    /**
    * <p>When the origin IP range is updated, this field returns the origin IP range that will take effect in the next version, including a comparison with the current origin IP range. Empty when there is no update or origin protection is not enabled.</p>
    */
    @SerializedName("NextOriginACL")
    @Expose
    private NextOriginACL NextOriginACL;

    /**
    * <p>Origin protection status. Valid values:</p><li>online: Effective;</li><li>offline: Disabled;</li><li>updating: Configuration being deployed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Origin protection origin-pull ACL control domain.</p>
    */
    @SerializedName("OriginACLFamily")
    @Expose
    private String OriginACLFamily;

    /**
     * Get <p>Origin protection mode for layer-7 acceleration domain names. Valid values: <li>all: automatic protection mode. All layer-7 acceleration domain names in the site are included in the origin protection list, including newly added layer-7 acceleration domain names;</li><li>specific: specified protection mode. Only bound layer-7 acceleration domain names are protected.</li></p> 
     * @return L7EnableMode <p>Origin protection mode for layer-7 acceleration domain names. Valid values: <li>all: automatic protection mode. All layer-7 acceleration domain names in the site are included in the origin protection list, including newly added layer-7 acceleration domain names;</li><li>specific: specified protection mode. Only bound layer-7 acceleration domain names are protected.</li></p>
     */
    public String getL7EnableMode() {
        return this.L7EnableMode;
    }

    /**
     * Set <p>Origin protection mode for layer-7 acceleration domain names. Valid values: <li>all: automatic protection mode. All layer-7 acceleration domain names in the site are included in the origin protection list, including newly added layer-7 acceleration domain names;</li><li>specific: specified protection mode. Only bound layer-7 acceleration domain names are protected.</li></p>
     * @param L7EnableMode <p>Origin protection mode for layer-7 acceleration domain names. Valid values: <li>all: automatic protection mode. All layer-7 acceleration domain names in the site are included in the origin protection list, including newly added layer-7 acceleration domain names;</li><li>specific: specified protection mode. Only bound layer-7 acceleration domain names are protected.</li></p>
     */
    public void setL7EnableMode(String L7EnableMode) {
        this.L7EnableMode = L7EnableMode;
    }

    /**
     * Get <p>List of layer-7 acceleration domain names that have origin-pull from specific origin IP ranges enabled. Empty when origin protection is not enabled.</p> 
     * @return L7Hosts <p>List of layer-7 acceleration domain names that have origin-pull from specific origin IP ranges enabled. Empty when origin protection is not enabled.</p>
     */
    public String [] getL7Hosts() {
        return this.L7Hosts;
    }

    /**
     * Set <p>List of layer-7 acceleration domain names that have origin-pull from specific origin IP ranges enabled. Empty when origin protection is not enabled.</p>
     * @param L7Hosts <p>List of layer-7 acceleration domain names that have origin-pull from specific origin IP ranges enabled. Empty when origin protection is not enabled.</p>
     */
    public void setL7Hosts(String [] L7Hosts) {
        this.L7Hosts = L7Hosts;
    }

    /**
     * Get <p>Origin protection mode for layer-4 proxy instances. Valid values: <li>all: automatic protection mode. All layer-4 proxy instances in the site are included in the origin protection list, including newly added layer-4 proxy instances;</li><li>specific: specified protection mode. Only bound layer-4 proxy instances are protected.</li></p> 
     * @return L4EnableMode <p>Origin protection mode for layer-4 proxy instances. Valid values: <li>all: automatic protection mode. All layer-4 proxy instances in the site are included in the origin protection list, including newly added layer-4 proxy instances;</li><li>specific: specified protection mode. Only bound layer-4 proxy instances are protected.</li></p>
     */
    public String getL4EnableMode() {
        return this.L4EnableMode;
    }

    /**
     * Set <p>Origin protection mode for layer-4 proxy instances. Valid values: <li>all: automatic protection mode. All layer-4 proxy instances in the site are included in the origin protection list, including newly added layer-4 proxy instances;</li><li>specific: specified protection mode. Only bound layer-4 proxy instances are protected.</li></p>
     * @param L4EnableMode <p>Origin protection mode for layer-4 proxy instances. Valid values: <li>all: automatic protection mode. All layer-4 proxy instances in the site are included in the origin protection list, including newly added layer-4 proxy instances;</li><li>specific: specified protection mode. Only bound layer-4 proxy instances are protected.</li></p>
     */
    public void setL4EnableMode(String L4EnableMode) {
        this.L4EnableMode = L4EnableMode;
    }

    /**
     * Get <p>List of layer-4 proxy instances that have origin-pull from specific origin IP ranges enabled. Empty when origin protection is not enabled.</p> 
     * @return L4ProxyIds <p>List of layer-4 proxy instances that have origin-pull from specific origin IP ranges enabled. Empty when origin protection is not enabled.</p>
     */
    public String [] getL4ProxyIds() {
        return this.L4ProxyIds;
    }

    /**
     * Set <p>List of layer-4 proxy instances that have origin-pull from specific origin IP ranges enabled. Empty when origin protection is not enabled.</p>
     * @param L4ProxyIds <p>List of layer-4 proxy instances that have origin-pull from specific origin IP ranges enabled. Empty when origin protection is not enabled.</p>
     */
    public void setL4ProxyIds(String [] L4ProxyIds) {
        this.L4ProxyIds = L4ProxyIds;
    }

    /**
     * Get <p>Currently effective origin IP range. Empty when origin protection is not enabled.</p> 
     * @return CurrentOriginACL <p>Currently effective origin IP range. Empty when origin protection is not enabled.</p>
     */
    public CurrentOriginACL getCurrentOriginACL() {
        return this.CurrentOriginACL;
    }

    /**
     * Set <p>Currently effective origin IP range. Empty when origin protection is not enabled.</p>
     * @param CurrentOriginACL <p>Currently effective origin IP range. Empty when origin protection is not enabled.</p>
     */
    public void setCurrentOriginACL(CurrentOriginACL CurrentOriginACL) {
        this.CurrentOriginACL = CurrentOriginACL;
    }

    /**
     * Get <p>When the origin IP range is updated, this field returns the origin IP range that will take effect in the next version, including a comparison with the current origin IP range. Empty when there is no update or origin protection is not enabled.</p> 
     * @return NextOriginACL <p>When the origin IP range is updated, this field returns the origin IP range that will take effect in the next version, including a comparison with the current origin IP range. Empty when there is no update or origin protection is not enabled.</p>
     */
    public NextOriginACL getNextOriginACL() {
        return this.NextOriginACL;
    }

    /**
     * Set <p>When the origin IP range is updated, this field returns the origin IP range that will take effect in the next version, including a comparison with the current origin IP range. Empty when there is no update or origin protection is not enabled.</p>
     * @param NextOriginACL <p>When the origin IP range is updated, this field returns the origin IP range that will take effect in the next version, including a comparison with the current origin IP range. Empty when there is no update or origin protection is not enabled.</p>
     */
    public void setNextOriginACL(NextOriginACL NextOriginACL) {
        this.NextOriginACL = NextOriginACL;
    }

    /**
     * Get <p>Origin protection status. Valid values:</p><li>online: Effective;</li><li>offline: Disabled;</li><li>updating: Configuration being deployed.</li> 
     * @return Status <p>Origin protection status. Valid values:</p><li>online: Effective;</li><li>offline: Disabled;</li><li>updating: Configuration being deployed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Origin protection status. Valid values:</p><li>online: Effective;</li><li>offline: Disabled;</li><li>updating: Configuration being deployed.</li>
     * @param Status <p>Origin protection status. Valid values:</p><li>online: Effective;</li><li>offline: Disabled;</li><li>updating: Configuration being deployed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Origin protection origin-pull ACL control domain.</p> 
     * @return OriginACLFamily <p>Origin protection origin-pull ACL control domain.</p>
     */
    public String getOriginACLFamily() {
        return this.OriginACLFamily;
    }

    /**
     * Set <p>Origin protection origin-pull ACL control domain.</p>
     * @param OriginACLFamily <p>Origin protection origin-pull ACL control domain.</p>
     */
    public void setOriginACLFamily(String OriginACLFamily) {
        this.OriginACLFamily = OriginACLFamily;
    }

    public OriginACLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginACLInfo(OriginACLInfo source) {
        if (source.L7EnableMode != null) {
            this.L7EnableMode = new String(source.L7EnableMode);
        }
        if (source.L7Hosts != null) {
            this.L7Hosts = new String[source.L7Hosts.length];
            for (int i = 0; i < source.L7Hosts.length; i++) {
                this.L7Hosts[i] = new String(source.L7Hosts[i]);
            }
        }
        if (source.L4EnableMode != null) {
            this.L4EnableMode = new String(source.L4EnableMode);
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
        if (source.OriginACLFamily != null) {
            this.OriginACLFamily = new String(source.OriginACLFamily);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "L7EnableMode", this.L7EnableMode);
        this.setParamArraySimple(map, prefix + "L7Hosts.", this.L7Hosts);
        this.setParamSimple(map, prefix + "L4EnableMode", this.L4EnableMode);
        this.setParamArraySimple(map, prefix + "L4ProxyIds.", this.L4ProxyIds);
        this.setParamObj(map, prefix + "CurrentOriginACL.", this.CurrentOriginACL);
        this.setParamObj(map, prefix + "NextOriginACL.", this.NextOriginACL);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OriginACLFamily", this.OriginACLFamily);

    }
}

