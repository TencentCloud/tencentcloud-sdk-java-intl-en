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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteVpcEndPointServiceWhiteListRequest extends AbstractModel {

    /**
    * Array of user UINs
    */
    @SerializedName("UserUin")
    @Expose
    private String [] UserUin;

    /**
    * Endpoint service ID
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
     * Get Array of user UINs 
     * @return UserUin Array of user UINs
     */
    public String [] getUserUin() {
        return this.UserUin;
    }

    /**
     * Set Array of user UINs
     * @param UserUin Array of user UINs
     */
    public void setUserUin(String [] UserUin) {
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

    public DeleteVpcEndPointServiceWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteVpcEndPointServiceWhiteListRequest(DeleteVpcEndPointServiceWhiteListRequest source) {
        if (source.UserUin != null) {
            this.UserUin = new String[source.UserUin.length];
            for (int i = 0; i < source.UserUin.length; i++) {
                this.UserUin[i] = new String(source.UserUin[i]);
            }
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UserUin.", this.UserUin);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);

    }
}

