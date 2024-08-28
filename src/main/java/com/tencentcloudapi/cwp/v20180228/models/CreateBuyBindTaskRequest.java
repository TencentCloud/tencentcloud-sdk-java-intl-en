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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBuyBindTaskRequest extends AbstractModel {

    /**
    * Order Number
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * Optional parameters. 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * Machine list
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * Whether to select all machines
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
     * Get Order Number 
     * @return DealName Order Number
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Order Number
     * @param DealName Order Number
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get Optional parameters. 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription 
     * @return LicenseType Optional parameters. 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Optional parameters. 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription
     * @param LicenseType Optional parameters. 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Machine list 
     * @return QuuidList Machine list
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set Machine list
     * @param QuuidList Machine list
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get Whether to select all machines 
     * @return IsAll Whether to select all machines
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set Whether to select all machines
     * @param IsAll Whether to select all machines
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    public CreateBuyBindTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBuyBindTaskRequest(CreateBuyBindTaskRequest source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);

    }
}

