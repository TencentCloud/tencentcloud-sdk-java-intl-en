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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAMLOngoingScreeningStatusRequest extends AbstractModel {

    /**
    * <p>Unique identifier of the end user in the customer system, up to 256 characters.</p>
    */
    @SerializedName("UniqueCustomerID")
    @Expose
    private String UniqueCustomerID;

    /**
    * <p>Whether to enable continuous monitoring and screening. Default value: false</p><p>Default value: false</p>
    */
    @SerializedName("EnableOngoingScreening")
    @Expose
    private Boolean EnableOngoingScreening;

    /**
     * Get <p>Unique identifier of the end user in the customer system, up to 256 characters.</p> 
     * @return UniqueCustomerID <p>Unique identifier of the end user in the customer system, up to 256 characters.</p>
     */
    public String getUniqueCustomerID() {
        return this.UniqueCustomerID;
    }

    /**
     * Set <p>Unique identifier of the end user in the customer system, up to 256 characters.</p>
     * @param UniqueCustomerID <p>Unique identifier of the end user in the customer system, up to 256 characters.</p>
     */
    public void setUniqueCustomerID(String UniqueCustomerID) {
        this.UniqueCustomerID = UniqueCustomerID;
    }

    /**
     * Get <p>Whether to enable continuous monitoring and screening. Default value: false</p><p>Default value: false</p> 
     * @return EnableOngoingScreening <p>Whether to enable continuous monitoring and screening. Default value: false</p><p>Default value: false</p>
     */
    public Boolean getEnableOngoingScreening() {
        return this.EnableOngoingScreening;
    }

    /**
     * Set <p>Whether to enable continuous monitoring and screening. Default value: false</p><p>Default value: false</p>
     * @param EnableOngoingScreening <p>Whether to enable continuous monitoring and screening. Default value: false</p><p>Default value: false</p>
     */
    public void setEnableOngoingScreening(Boolean EnableOngoingScreening) {
        this.EnableOngoingScreening = EnableOngoingScreening;
    }

    public UpdateAMLOngoingScreeningStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAMLOngoingScreeningStatusRequest(UpdateAMLOngoingScreeningStatusRequest source) {
        if (source.UniqueCustomerID != null) {
            this.UniqueCustomerID = new String(source.UniqueCustomerID);
        }
        if (source.EnableOngoingScreening != null) {
            this.EnableOngoingScreening = new Boolean(source.EnableOngoingScreening);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueCustomerID", this.UniqueCustomerID);
        this.setParamSimple(map, prefix + "EnableOngoingScreening", this.EnableOngoingScreening);

    }
}

