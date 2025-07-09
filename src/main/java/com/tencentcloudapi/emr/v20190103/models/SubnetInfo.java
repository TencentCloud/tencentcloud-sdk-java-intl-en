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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubnetInfo extends AbstractModel {

    /**
    * Subnet information (name)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * Subnet information (ID)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get Subnet information (name)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SubnetName Subnet information (name)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet information (name)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SubnetName Subnet information (name)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get Subnet information (ID)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SubnetId Subnet information (ID)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet information (ID)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SubnetId Subnet information (ID)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public SubnetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubnetInfo(SubnetInfo source) {
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

