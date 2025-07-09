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

public class NextOriginACL extends AbstractModel {

    /**
    * Version number.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Version effective time, which adopts UTC+8 and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("PlannedActiveTime")
    @Expose
    private String PlannedActiveTime;

    /**
    * IP range details.
    */
    @SerializedName("EntireAddresses")
    @Expose
    private Addresses EntireAddresses;

    /**
    * The latest origin IP range newly-added compared with the origin IP range in CurrentOrginACL.
    */
    @SerializedName("AddedAddresses")
    @Expose
    private Addresses AddedAddresses;

    /**
    * The latest origin IP range deleted compared with the origin IP range in CurrentOrginACL.
    */
    @SerializedName("RemovedAddresses")
    @Expose
    private Addresses RemovedAddresses;

    /**
    * The latest origin IP range is unchanged compared with the origin IP range in CurrentOrginACL.
    */
    @SerializedName("NoChangeAddresses")
    @Expose
    private Addresses NoChangeAddresses;

    /**
     * Get Version number. 
     * @return Version Version number.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version number.
     * @param Version Version number.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Version effective time, which adopts UTC+8 and follows the date and time format of the ISO 8601 standard. 
     * @return PlannedActiveTime Version effective time, which adopts UTC+8 and follows the date and time format of the ISO 8601 standard.
     */
    public String getPlannedActiveTime() {
        return this.PlannedActiveTime;
    }

    /**
     * Set Version effective time, which adopts UTC+8 and follows the date and time format of the ISO 8601 standard.
     * @param PlannedActiveTime Version effective time, which adopts UTC+8 and follows the date and time format of the ISO 8601 standard.
     */
    public void setPlannedActiveTime(String PlannedActiveTime) {
        this.PlannedActiveTime = PlannedActiveTime;
    }

    /**
     * Get IP range details. 
     * @return EntireAddresses IP range details.
     */
    public Addresses getEntireAddresses() {
        return this.EntireAddresses;
    }

    /**
     * Set IP range details.
     * @param EntireAddresses IP range details.
     */
    public void setEntireAddresses(Addresses EntireAddresses) {
        this.EntireAddresses = EntireAddresses;
    }

    /**
     * Get The latest origin IP range newly-added compared with the origin IP range in CurrentOrginACL. 
     * @return AddedAddresses The latest origin IP range newly-added compared with the origin IP range in CurrentOrginACL.
     */
    public Addresses getAddedAddresses() {
        return this.AddedAddresses;
    }

    /**
     * Set The latest origin IP range newly-added compared with the origin IP range in CurrentOrginACL.
     * @param AddedAddresses The latest origin IP range newly-added compared with the origin IP range in CurrentOrginACL.
     */
    public void setAddedAddresses(Addresses AddedAddresses) {
        this.AddedAddresses = AddedAddresses;
    }

    /**
     * Get The latest origin IP range deleted compared with the origin IP range in CurrentOrginACL. 
     * @return RemovedAddresses The latest origin IP range deleted compared with the origin IP range in CurrentOrginACL.
     */
    public Addresses getRemovedAddresses() {
        return this.RemovedAddresses;
    }

    /**
     * Set The latest origin IP range deleted compared with the origin IP range in CurrentOrginACL.
     * @param RemovedAddresses The latest origin IP range deleted compared with the origin IP range in CurrentOrginACL.
     */
    public void setRemovedAddresses(Addresses RemovedAddresses) {
        this.RemovedAddresses = RemovedAddresses;
    }

    /**
     * Get The latest origin IP range is unchanged compared with the origin IP range in CurrentOrginACL. 
     * @return NoChangeAddresses The latest origin IP range is unchanged compared with the origin IP range in CurrentOrginACL.
     */
    public Addresses getNoChangeAddresses() {
        return this.NoChangeAddresses;
    }

    /**
     * Set The latest origin IP range is unchanged compared with the origin IP range in CurrentOrginACL.
     * @param NoChangeAddresses The latest origin IP range is unchanged compared with the origin IP range in CurrentOrginACL.
     */
    public void setNoChangeAddresses(Addresses NoChangeAddresses) {
        this.NoChangeAddresses = NoChangeAddresses;
    }

    public NextOriginACL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NextOriginACL(NextOriginACL source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.PlannedActiveTime != null) {
            this.PlannedActiveTime = new String(source.PlannedActiveTime);
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
        this.setParamSimple(map, prefix + "PlannedActiveTime", this.PlannedActiveTime);
        this.setParamObj(map, prefix + "EntireAddresses.", this.EntireAddresses);
        this.setParamObj(map, prefix + "AddedAddresses.", this.AddedAddresses);
        this.setParamObj(map, prefix + "RemovedAddresses.", this.RemovedAddresses);
        this.setParamObj(map, prefix + "NoChangeAddresses.", this.NoChangeAddresses);

    }
}

