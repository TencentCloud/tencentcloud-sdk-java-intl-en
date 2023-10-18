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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputSecurityGroupInfo extends AbstractModel {

    /**
    * Input security group ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Input security group name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of allowlist entries.
    */
    @SerializedName("Whitelist")
    @Expose
    private String [] Whitelist;

    /**
    * List of bound input streams.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OccupiedInputs")
    @Expose
    private String [] OccupiedInputs;

    /**
    * Input security group address.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Input security group ID. 
     * @return Id Input security group ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Input security group ID.
     * @param Id Input security group ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Input security group name. 
     * @return Name Input security group name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Input security group name.
     * @param Name Input security group name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get List of allowlist entries. 
     * @return Whitelist List of allowlist entries.
     */
    public String [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set List of allowlist entries.
     * @param Whitelist List of allowlist entries.
     */
    public void setWhitelist(String [] Whitelist) {
        this.Whitelist = Whitelist;
    }

    /**
     * Get List of bound input streams.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OccupiedInputs List of bound input streams.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getOccupiedInputs() {
        return this.OccupiedInputs;
    }

    /**
     * Set List of bound input streams.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OccupiedInputs List of bound input streams.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOccupiedInputs(String [] OccupiedInputs) {
        this.OccupiedInputs = OccupiedInputs;
    }

    /**
     * Get Input security group address. 
     * @return Region Input security group address.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Input security group address.
     * @param Region Input security group address.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public InputSecurityGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputSecurityGroupInfo(InputSecurityGroupInfo source) {
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

    }
}

