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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskChargePrepaid extends AbstractModel{

    /**
    * Purchase duration.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Whether Auto-Renewal is enabled 
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Purchase duration unit. Default value: "m" (month)
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
     * Get Purchase duration. 
     * @return Period Purchase duration.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Purchase duration.
     * @param Period Purchase duration.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Whether Auto-Renewal is enabled  
     * @return RenewFlag Whether Auto-Renewal is enabled 
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether Auto-Renewal is enabled 
     * @param RenewFlag Whether Auto-Renewal is enabled 
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Purchase duration unit. Default value: "m" (month) 
     * @return TimeUnit Purchase duration unit. Default value: "m" (month)
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Purchase duration unit. Default value: "m" (month)
     * @param TimeUnit Purchase duration unit. Default value: "m" (month)
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    public DiskChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskChargePrepaid(DiskChargePrepaid source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);

    }
}

