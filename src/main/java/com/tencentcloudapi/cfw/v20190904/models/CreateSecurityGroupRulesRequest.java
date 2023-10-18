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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityGroupRulesRequest extends AbstractModel {

    /**
    * Added enterprise security group rule data
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupListData [] Data;

    /**
    * Direction. 0: outbound; 1: inbound. 1 by default
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 0: at the end; 1: at the top; 2: in the middle. 0 by default
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Indicates whether to enable rules after addition. 0: disable; 1: enable. 1 by default
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get Added enterprise security group rule data 
     * @return Data Added enterprise security group rule data
     */
    public SecurityGroupListData [] getData() {
        return this.Data;
    }

    /**
     * Set Added enterprise security group rule data
     * @param Data Added enterprise security group rule data
     */
    public void setData(SecurityGroupListData [] Data) {
        this.Data = Data;
    }

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
     * Get 0: at the end; 1: at the top; 2: in the middle. 0 by default 
     * @return Type 0: at the end; 1: at the top; 2: in the middle. 0 by default
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: at the end; 1: at the top; 2: in the middle. 0 by default
     * @param Type 0: at the end; 1: at the top; 2: in the middle. 0 by default
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Indicates whether to enable rules after addition. 0: disable; 1: enable. 1 by default 
     * @return Enable Indicates whether to enable rules after addition. 0: disable; 1: enable. 1 by default
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Indicates whether to enable rules after addition. 0: disable; 1: enable. 1 by default
     * @param Enable Indicates whether to enable rules after addition. 0: disable; 1: enable. 1 by default
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public CreateSecurityGroupRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityGroupRulesRequest(CreateSecurityGroupRulesRequest source) {
        if (source.Data != null) {
            this.Data = new SecurityGroupListData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SecurityGroupListData(source.Data[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

