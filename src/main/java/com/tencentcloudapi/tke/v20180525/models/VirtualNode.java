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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirtualNode extends AbstractModel {

    /**
    * Virtual node name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subnet of the virtual node
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Virtual node status
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Virtual node name 
     * @return Name Virtual node name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Virtual node name
     * @param Name Virtual node name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Subnet of the virtual node 
     * @return SubnetId Subnet of the virtual node
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet of the virtual node
     * @param SubnetId Subnet of the virtual node
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Virtual node status 
     * @return Phase Virtual node status
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set Virtual node status
     * @param Phase Virtual node status
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public VirtualNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualNode(VirtualNode source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

