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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewDataEngineRequest extends AbstractModel {

    /**
    * CU queue name
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Renewal period in months, which is at least one month.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Payment type. It is 1 by default and is prepaid.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Unit. It is m by default, and only m can be filled in.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Auto-renewal flag: 0 means the initial status, and there is no automatic renewal by default. If the user has the privilege to retain services with prepayment, there will be an automatic renewal. 1 means that there is an automatic renewal. 2 means that there is surely no automatic renewal. If it is not specified, the parameter is 0 by default.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
     * Get CU queue name 
     * @return DataEngineName CU queue name
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set CU queue name
     * @param DataEngineName CU queue name
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Renewal period in months, which is at least one month. 
     * @return TimeSpan Renewal period in months, which is at least one month.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Renewal period in months, which is at least one month.
     * @param TimeSpan Renewal period in months, which is at least one month.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Payment type. It is 1 by default and is prepaid. 
     * @return PayMode Payment type. It is 1 by default and is prepaid.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment type. It is 1 by default and is prepaid.
     * @param PayMode Payment type. It is 1 by default and is prepaid.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Unit. It is m by default, and only m can be filled in. 
     * @return TimeUnit Unit. It is m by default, and only m can be filled in.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Unit. It is m by default, and only m can be filled in.
     * @param TimeUnit Unit. It is m by default, and only m can be filled in.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Auto-renewal flag: 0 means the initial status, and there is no automatic renewal by default. If the user has the privilege to retain services with prepayment, there will be an automatic renewal. 1 means that there is an automatic renewal. 2 means that there is surely no automatic renewal. If it is not specified, the parameter is 0 by default. 
     * @return RenewFlag Auto-renewal flag: 0 means the initial status, and there is no automatic renewal by default. If the user has the privilege to retain services with prepayment, there will be an automatic renewal. 1 means that there is an automatic renewal. 2 means that there is surely no automatic renewal. If it is not specified, the parameter is 0 by default.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal flag: 0 means the initial status, and there is no automatic renewal by default. If the user has the privilege to retain services with prepayment, there will be an automatic renewal. 1 means that there is an automatic renewal. 2 means that there is surely no automatic renewal. If it is not specified, the parameter is 0 by default.
     * @param RenewFlag Auto-renewal flag: 0 means the initial status, and there is no automatic renewal by default. If the user has the privilege to retain services with prepayment, there will be an automatic renewal. 1 means that there is an automatic renewal. 2 means that there is surely no automatic renewal. If it is not specified, the parameter is 0 by default.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public RenewDataEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewDataEngineRequest(RenewDataEngineRequest source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

