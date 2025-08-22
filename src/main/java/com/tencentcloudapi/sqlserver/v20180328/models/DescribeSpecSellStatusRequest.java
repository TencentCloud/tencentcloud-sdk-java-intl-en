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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecSellStatusRequest extends AbstractModel {

    /**
    * AZ ID. For example, ap-guangzhou-3.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance specification ID, which can be obtained by calling the DescribeProductConfig API.
    */
    @SerializedName("SpecIdSet")
    @Expose
    private Long [] SpecIdSet;

    /**
    * Database version, which can be obtained by calling the DescribeProductConfig API.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * Product ID, which can be obtained by calling the DescribeProductConfig API.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Payment mode. POST: pay-as-you-go; PRE: monthly subscription.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Currency. CNY; USD.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get AZ ID. For example, ap-guangzhou-3. 
     * @return Zone AZ ID. For example, ap-guangzhou-3.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ ID. For example, ap-guangzhou-3.
     * @param Zone AZ ID. For example, ap-guangzhou-3.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance specification ID, which can be obtained by calling the DescribeProductConfig API. 
     * @return SpecIdSet Instance specification ID, which can be obtained by calling the DescribeProductConfig API.
     */
    public Long [] getSpecIdSet() {
        return this.SpecIdSet;
    }

    /**
     * Set Instance specification ID, which can be obtained by calling the DescribeProductConfig API.
     * @param SpecIdSet Instance specification ID, which can be obtained by calling the DescribeProductConfig API.
     */
    public void setSpecIdSet(Long [] SpecIdSet) {
        this.SpecIdSet = SpecIdSet;
    }

    /**
     * Get Database version, which can be obtained by calling the DescribeProductConfig API. 
     * @return DBVersion Database version, which can be obtained by calling the DescribeProductConfig API.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set Database version, which can be obtained by calling the DescribeProductConfig API.
     * @param DBVersion Database version, which can be obtained by calling the DescribeProductConfig API.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get Product ID, which can be obtained by calling the DescribeProductConfig API. 
     * @return Pid Product ID, which can be obtained by calling the DescribeProductConfig API.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Product ID, which can be obtained by calling the DescribeProductConfig API.
     * @param Pid Product ID, which can be obtained by calling the DescribeProductConfig API.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Payment mode. POST: pay-as-you-go; PRE: monthly subscription. 
     * @return PayMode Payment mode. POST: pay-as-you-go; PRE: monthly subscription.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode. POST: pay-as-you-go; PRE: monthly subscription.
     * @param PayMode Payment mode. POST: pay-as-you-go; PRE: monthly subscription.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Currency. CNY; USD. 
     * @return Currency Currency. CNY; USD.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency. CNY; USD.
     * @param Currency Currency. CNY; USD.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public DescribeSpecSellStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecSellStatusRequest(DescribeSpecSellStatusRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SpecIdSet != null) {
            this.SpecIdSet = new Long[source.SpecIdSet.length];
            for (int i = 0; i < source.SpecIdSet.length; i++) {
                this.SpecIdSet[i] = new Long(source.SpecIdSet[i]);
            }
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "SpecIdSet.", this.SpecIdSet);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}

