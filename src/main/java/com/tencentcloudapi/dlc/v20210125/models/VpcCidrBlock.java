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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcCidrBlock extends AbstractModel {

    /**
    * Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CidrId")
    @Expose
    private String CidrId;

    /**
    * Subnet IP range
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CidrAddr")
    @Expose
    private String CidrAddr;

    /**
     * Get Subnet ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CidrId Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCidrId() {
        return this.CidrId;
    }

    /**
     * Set Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CidrId Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCidrId(String CidrId) {
        this.CidrId = CidrId;
    }

    /**
     * Get Subnet IP range
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CidrAddr Subnet IP range
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCidrAddr() {
        return this.CidrAddr;
    }

    /**
     * Set Subnet IP range
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CidrAddr Subnet IP range
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCidrAddr(String CidrAddr) {
        this.CidrAddr = CidrAddr;
    }

    public VpcCidrBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcCidrBlock(VpcCidrBlock source) {
        if (source.CidrId != null) {
            this.CidrId = new String(source.CidrId);
        }
        if (source.CidrAddr != null) {
            this.CidrAddr = new String(source.CidrAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CidrId", this.CidrId);
        this.setParamSimple(map, prefix + "CidrAddr", this.CidrAddr);

    }
}

