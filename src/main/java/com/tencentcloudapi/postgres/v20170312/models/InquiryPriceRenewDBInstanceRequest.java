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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewDBInstanceRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Renewal duration in months. Maximum value: 48
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get Instance ID 
     * @return DBInstanceId Instance ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID
     * @param DBInstanceId Instance ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Renewal duration in months. Maximum value: 48 
     * @return Period Renewal duration in months. Maximum value: 48
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Renewal duration in months. Maximum value: 48
     * @param Period Renewal duration in months. Maximum value: 48
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public InquiryPriceRenewDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewDBInstanceRequest(InquiryPriceRenewDBInstanceRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

