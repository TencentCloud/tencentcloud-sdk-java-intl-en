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

public class AddressChargePrepaid extends AbstractModel{

    /**
    * Purchase duration of instance
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Whether auto-renewal is enabled
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get Purchase duration of instance 
     * @return Period Purchase duration of instance
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Purchase duration of instance
     * @param Period Purchase duration of instance
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Whether auto-renewal is enabled 
     * @return RenewFlag Whether auto-renewal is enabled
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether auto-renewal is enabled
     * @param RenewFlag Whether auto-renewal is enabled
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

