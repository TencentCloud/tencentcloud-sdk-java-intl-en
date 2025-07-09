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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityGroupSequenceRulesRequest extends AbstractModel {

    /**
    * Direction. 0: outbound; 1: inbound. 1 by default
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Sorting data of enterprise security group rules
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupOrderIndexData [] Data;

    /**
     * Get Direction. 0: outbound; 1: inbound. 1 by default 
     * @return Direction Direction. 0: outbound; 1: inbound. 1 by default
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction. 0: outbound; 1: inbound. 1 by default
     * @param Direction Direction. 0: outbound; 1: inbound. 1 by default
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Sorting data of enterprise security group rules 
     * @return Data Sorting data of enterprise security group rules
     */
    public SecurityGroupOrderIndexData [] getData() {
        return this.Data;
    }

    /**
     * Set Sorting data of enterprise security group rules
     * @param Data Sorting data of enterprise security group rules
     */
    public void setData(SecurityGroupOrderIndexData [] Data) {
        this.Data = Data;
    }

    public ModifySecurityGroupSequenceRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityGroupSequenceRulesRequest(ModifySecurityGroupSequenceRulesRequest source) {
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Data != null) {
            this.Data = new SecurityGroupOrderIndexData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SecurityGroupOrderIndexData(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

