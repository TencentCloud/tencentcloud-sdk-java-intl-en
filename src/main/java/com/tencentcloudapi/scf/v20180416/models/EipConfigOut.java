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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipConfigOut extends AbstractModel{

    /**
    * Whether it is a fixed IP. Valid values: ["ENABLE","DISABLE"]
    */
    @SerializedName("EipStatus")
    @Expose
    private String EipStatus;

    /**
    * IP list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EipAddress")
    @Expose
    private String [] EipAddress;

    /**
     * Get Whether it is a fixed IP. Valid values: ["ENABLE","DISABLE"] 
     * @return EipStatus Whether it is a fixed IP. Valid values: ["ENABLE","DISABLE"]
     */
    public String getEipStatus() {
        return this.EipStatus;
    }

    /**
     * Set Whether it is a fixed IP. Valid values: ["ENABLE","DISABLE"]
     * @param EipStatus Whether it is a fixed IP. Valid values: ["ENABLE","DISABLE"]
     */
    public void setEipStatus(String EipStatus) {
        this.EipStatus = EipStatus;
    }

    /**
     * Get IP list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EipAddress IP list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getEipAddress() {
        return this.EipAddress;
    }

    /**
     * Set IP list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EipAddress IP list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEipAddress(String [] EipAddress) {
        this.EipAddress = EipAddress;
    }

    public EipConfigOut() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipConfigOut(EipConfigOut source) {
        if (source.EipStatus != null) {
            this.EipStatus = new String(source.EipStatus);
        }
        if (source.EipAddress != null) {
            this.EipAddress = new String[source.EipAddress.length];
            for (int i = 0; i < source.EipAddress.length; i++) {
                this.EipAddress[i] = new String(source.EipAddress[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipStatus", this.EipStatus);
        this.setParamArraySimple(map, prefix + "EipAddress.", this.EipAddress);

    }
}

