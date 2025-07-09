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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupInfo extends AbstractModel {

    /**
    * Security group ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Security group name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Allowlist list.
    */
    @SerializedName("Whitelist")
    @Expose
    private String [] Whitelist;

    /**
    * List of bound input streams.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OccupiedInputs")
    @Expose
    private String [] OccupiedInputs;

    /**
    * Security group address.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * List of bound output streams.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OccupiedOutputs")
    @Expose
    private String [] OccupiedOutputs;

    /**
     * Get Security group ID. 
     * @return Id Security group ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Security group ID.
     * @param Id Security group ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Security group name. 
     * @return Name Security group name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Security group name.
     * @param Name Security group name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Allowlist list. 
     * @return Whitelist Allowlist list.
     */
    public String [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set Allowlist list.
     * @param Whitelist Allowlist list.
     */
    public void setWhitelist(String [] Whitelist) {
        this.Whitelist = Whitelist;
    }

    /**
     * Get List of bound input streams.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OccupiedInputs List of bound input streams.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getOccupiedInputs() {
        return this.OccupiedInputs;
    }

    /**
     * Set List of bound input streams.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OccupiedInputs List of bound input streams.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOccupiedInputs(String [] OccupiedInputs) {
        this.OccupiedInputs = OccupiedInputs;
    }

    /**
     * Get Security group address. 
     * @return Region Security group address.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Security group address.
     * @param Region Security group address.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get List of bound output streams.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OccupiedOutputs List of bound output streams.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getOccupiedOutputs() {
        return this.OccupiedOutputs;
    }

    /**
     * Set List of bound output streams.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OccupiedOutputs List of bound output streams.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOccupiedOutputs(String [] OccupiedOutputs) {
        this.OccupiedOutputs = OccupiedOutputs;
    }

    public SecurityGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupInfo(SecurityGroupInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Whitelist != null) {
            this.Whitelist = new String[source.Whitelist.length];
            for (int i = 0; i < source.Whitelist.length; i++) {
                this.Whitelist[i] = new String(source.Whitelist[i]);
            }
        }
        if (source.OccupiedInputs != null) {
            this.OccupiedInputs = new String[source.OccupiedInputs.length];
            for (int i = 0; i < source.OccupiedInputs.length; i++) {
                this.OccupiedInputs[i] = new String(source.OccupiedInputs[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.OccupiedOutputs != null) {
            this.OccupiedOutputs = new String[source.OccupiedOutputs.length];
            for (int i = 0; i < source.OccupiedOutputs.length; i++) {
                this.OccupiedOutputs[i] = new String(source.OccupiedOutputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Whitelist.", this.Whitelist);
        this.setParamArraySimple(map, prefix + "OccupiedInputs.", this.OccupiedInputs);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "OccupiedOutputs.", this.OccupiedOutputs);

    }
}

