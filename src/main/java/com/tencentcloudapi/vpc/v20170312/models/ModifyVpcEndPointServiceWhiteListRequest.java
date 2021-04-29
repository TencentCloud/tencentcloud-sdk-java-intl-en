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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVpcEndPointServiceWhiteListRequest extends AbstractModel{

    /**
    * User UIN
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * Endpoint service ID
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * Allowlist description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get User UIN 
     * @return UserUin User UIN
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set User UIN
     * @param UserUin User UIN
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get Endpoint service ID 
     * @return EndPointServiceId Endpoint service ID
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set Endpoint service ID
     * @param EndPointServiceId Endpoint service ID
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get Allowlist description 
     * @return Description Allowlist description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Allowlist description
     * @param Description Allowlist description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

