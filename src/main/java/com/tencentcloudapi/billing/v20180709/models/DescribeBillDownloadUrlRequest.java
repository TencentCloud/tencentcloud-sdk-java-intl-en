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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillDownloadUrlRequest extends AbstractModel {

    /**
    * Billing mode. Enumeration values
billOverview=L0-PDF Bill
Bill Summary=L1-Summary Bill	
billResource=L2-Resource bill	
billDetail=L3-Detailed Bill	
billPack
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Billing month
Earliest start month supported is 2021-01
L0-PDF&bill package does not support download for the current month. Please download the monthly bill after billing on the 1st of next month at 19:00.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Downloaded account ID list. By default, the query returns the account statement of the current account. If the group management account needs to download the self-pay bills of member accounts, enter the member account UIN in this field.
    */
    @SerializedName("ChildUin")
    @Expose
    private String [] ChildUin;

    /**
     * Get Billing mode. Enumeration values
billOverview=L0-PDF Bill
Bill Summary=L1-Summary Bill	
billResource=L2-Resource bill	
billDetail=L3-Detailed Bill	
billPack 
     * @return FileType Billing mode. Enumeration values
billOverview=L0-PDF Bill
Bill Summary=L1-Summary Bill	
billResource=L2-Resource bill	
billDetail=L3-Detailed Bill	
billPack
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Billing mode. Enumeration values
billOverview=L0-PDF Bill
Bill Summary=L1-Summary Bill	
billResource=L2-Resource bill	
billDetail=L3-Detailed Bill	
billPack
     * @param FileType Billing mode. Enumeration values
billOverview=L0-PDF Bill
Bill Summary=L1-Summary Bill	
billResource=L2-Resource bill	
billDetail=L3-Detailed Bill	
billPack
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Billing month
Earliest start month supported is 2021-01
L0-PDF&bill package does not support download for the current month. Please download the monthly bill after billing on the 1st of next month at 19:00. 
     * @return Month Billing month
Earliest start month supported is 2021-01
L0-PDF&bill package does not support download for the current month. Please download the monthly bill after billing on the 1st of next month at 19:00.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Billing month
Earliest start month supported is 2021-01
L0-PDF&bill package does not support download for the current month. Please download the monthly bill after billing on the 1st of next month at 19:00.
     * @param Month Billing month
Earliest start month supported is 2021-01
L0-PDF&bill package does not support download for the current month. Please download the monthly bill after billing on the 1st of next month at 19:00.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Downloaded account ID list. By default, the query returns the account statement of the current account. If the group management account needs to download the self-pay bills of member accounts, enter the member account UIN in this field. 
     * @return ChildUin Downloaded account ID list. By default, the query returns the account statement of the current account. If the group management account needs to download the self-pay bills of member accounts, enter the member account UIN in this field.
     */
    public String [] getChildUin() {
        return this.ChildUin;
    }

    /**
     * Set Downloaded account ID list. By default, the query returns the account statement of the current account. If the group management account needs to download the self-pay bills of member accounts, enter the member account UIN in this field.
     * @param ChildUin Downloaded account ID list. By default, the query returns the account statement of the current account. If the group management account needs to download the self-pay bills of member accounts, enter the member account UIN in this field.
     */
    public void setChildUin(String [] ChildUin) {
        this.ChildUin = ChildUin;
    }

    public DescribeBillDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillDownloadUrlRequest(DescribeBillDownloadUrlRequest source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.ChildUin != null) {
            this.ChildUin = new String[source.ChildUin.length];
            for (int i = 0; i < source.ChildUin.length; i++) {
                this.ChildUin[i] = new String(source.ChildUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamArraySimple(map, prefix + "ChildUin.", this.ChildUin);

    }
}

