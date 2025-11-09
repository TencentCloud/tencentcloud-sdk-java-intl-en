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

public class MultiPathGatewayNextOriginACL extends AbstractModel {

    /**
    * Specifies the version number.
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * Describes the IP range details for origin servers.
    */
    @SerializedName("EntireAddresses")
    @Expose
    private Addresses EntireAddresses;

    /**
    * The latest origin IP range newly added compared with the origin IP range in MultiPathGatewayCurrentOrginACL.
    */
    @SerializedName("AddedAddresses")
    @Expose
    private Addresses AddedAddresses;

    /**
    * Specifies the latest IP address range removed from the origin IP range in MultiPathGatewayCurrentOrginACL compared with the original.
    */
    @SerializedName("RemovedAddresses")
    @Expose
    private Addresses RemovedAddresses;

    /**
    * The latest origin IP range unchanged compared with the origin IP range in MultiPathGatewayCurrentOrginACL.
    */
    @SerializedName("NoChangeAddresses")
    @Expose
    private Addresses NoChangeAddresses;

    /**
     * Get Specifies the version number. 
     * @return Version Specifies the version number.
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set Specifies the version number.
     * @param Version Specifies the version number.
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get Describes the IP range details for origin servers. 
     * @return EntireAddresses Describes the IP range details for origin servers.
     */
    public Addresses getEntireAddresses() {
        return this.EntireAddresses;
    }

    /**
     * Set Describes the IP range details for origin servers.
     * @param EntireAddresses Describes the IP range details for origin servers.
     */
    public void setEntireAddresses(Addresses EntireAddresses) {
        this.EntireAddresses = EntireAddresses;
    }

    /**
     * Get The latest origin IP range newly added compared with the origin IP range in MultiPathGatewayCurrentOrginACL. 
     * @return AddedAddresses The latest origin IP range newly added compared with the origin IP range in MultiPathGatewayCurrentOrginACL.
     */
    public Addresses getAddedAddresses() {
        return this.AddedAddresses;
    }

    /**
     * Set The latest origin IP range newly added compared with the origin IP range in MultiPathGatewayCurrentOrginACL.
     * @param AddedAddresses The latest origin IP range newly added compared with the origin IP range in MultiPathGatewayCurrentOrginACL.
     */
    public void setAddedAddresses(Addresses AddedAddresses) {
        this.AddedAddresses = AddedAddresses;
    }

    /**
     * Get Specifies the latest IP address range removed from the origin IP range in MultiPathGatewayCurrentOrginACL compared with the original. 
     * @return RemovedAddresses Specifies the latest IP address range removed from the origin IP range in MultiPathGatewayCurrentOrginACL compared with the original.
     */
    public Addresses getRemovedAddresses() {
        return this.RemovedAddresses;
    }

    /**
     * Set Specifies the latest IP address range removed from the origin IP range in MultiPathGatewayCurrentOrginACL compared with the original.
     * @param RemovedAddresses Specifies the latest IP address range removed from the origin IP range in MultiPathGatewayCurrentOrginACL compared with the original.
     */
    public void setRemovedAddresses(Addresses RemovedAddresses) {
        this.RemovedAddresses = RemovedAddresses;
    }

    /**
     * Get The latest origin IP range unchanged compared with the origin IP range in MultiPathGatewayCurrentOrginACL. 
     * @return NoChangeAddresses The latest origin IP range unchanged compared with the origin IP range in MultiPathGatewayCurrentOrginACL.
     */
    public Addresses getNoChangeAddresses() {
        return this.NoChangeAddresses;
    }

    /**
     * Set The latest origin IP range unchanged compared with the origin IP range in MultiPathGatewayCurrentOrginACL.
     * @param NoChangeAddresses The latest origin IP range unchanged compared with the origin IP range in MultiPathGatewayCurrentOrginACL.
     */
    public void setNoChangeAddresses(Addresses NoChangeAddresses) {
        this.NoChangeAddresses = NoChangeAddresses;
    }

    public MultiPathGatewayNextOriginACL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiPathGatewayNextOriginACL(MultiPathGatewayNextOriginACL source) {
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.EntireAddresses != null) {
            this.EntireAddresses = new Addresses(source.EntireAddresses);
        }
        if (source.AddedAddresses != null) {
            this.AddedAddresses = new Addresses(source.AddedAddresses);
        }
        if (source.RemovedAddresses != null) {
            this.RemovedAddresses = new Addresses(source.RemovedAddresses);
        }
        if (source.NoChangeAddresses != null) {
            this.NoChangeAddresses = new Addresses(source.NoChangeAddresses);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamObj(map, prefix + "EntireAddresses.", this.EntireAddresses);
        this.setParamObj(map, prefix + "AddedAddresses.", this.AddedAddresses);
        this.setParamObj(map, prefix + "RemovedAddresses.", this.RemovedAddresses);
        this.setParamObj(map, prefix + "NoChangeAddresses.", this.NoChangeAddresses);

    }
}

