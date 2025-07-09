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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomerBillDownloadUrlRequest extends AbstractModel {

    /**
    * The month to which the bill belongs, formatted as yyyy-mm; the earliest month available for query is june, 2022. current month's billing data may be inaccurate; please download the current month's bill after it is generated at 1:00 on the 5th of the next month.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Bill type. valid values: [billResource, billDetail, billResourcePack, billDetailPack]. `billResource`: resource bill; `billDetail`: detailed bill; `billResourcePack`: resource bill package; `billDetailPack`: detailed bill package.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Customer type. valid values: [Customer, Reseller, ResellerCustomer]. `Customer`: direct customer; `Reseller`: secondary reseller; `ResellerCustomer`: reseller's customers
    */
    @SerializedName("CustomerUinType")
    @Expose
    private String CustomerUinType;

    /**
    * Language. valid values: [zh_cn, en]. default is `en` (english).
    */
    @SerializedName("FileLanguage")
    @Expose
    private String FileLanguage;

    /**
    * Customer uin. when downloading the bill package (FileType is billResourcePack or billDetailPack), CustomerUin is not passed
    */
    @SerializedName("CustomerUin")
    @Expose
    private Long CustomerUin;

    /**
     * Get The month to which the bill belongs, formatted as yyyy-mm; the earliest month available for query is june, 2022. current month's billing data may be inaccurate; please download the current month's bill after it is generated at 1:00 on the 5th of the next month. 
     * @return Month The month to which the bill belongs, formatted as yyyy-mm; the earliest month available for query is june, 2022. current month's billing data may be inaccurate; please download the current month's bill after it is generated at 1:00 on the 5th of the next month.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set The month to which the bill belongs, formatted as yyyy-mm; the earliest month available for query is june, 2022. current month's billing data may be inaccurate; please download the current month's bill after it is generated at 1:00 on the 5th of the next month.
     * @param Month The month to which the bill belongs, formatted as yyyy-mm; the earliest month available for query is june, 2022. current month's billing data may be inaccurate; please download the current month's bill after it is generated at 1:00 on the 5th of the next month.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Bill type. valid values: [billResource, billDetail, billResourcePack, billDetailPack]. `billResource`: resource bill; `billDetail`: detailed bill; `billResourcePack`: resource bill package; `billDetailPack`: detailed bill package. 
     * @return FileType Bill type. valid values: [billResource, billDetail, billResourcePack, billDetailPack]. `billResource`: resource bill; `billDetail`: detailed bill; `billResourcePack`: resource bill package; `billDetailPack`: detailed bill package.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Bill type. valid values: [billResource, billDetail, billResourcePack, billDetailPack]. `billResource`: resource bill; `billDetail`: detailed bill; `billResourcePack`: resource bill package; `billDetailPack`: detailed bill package.
     * @param FileType Bill type. valid values: [billResource, billDetail, billResourcePack, billDetailPack]. `billResource`: resource bill; `billDetail`: detailed bill; `billResourcePack`: resource bill package; `billDetailPack`: detailed bill package.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Customer type. valid values: [Customer, Reseller, ResellerCustomer]. `Customer`: direct customer; `Reseller`: secondary reseller; `ResellerCustomer`: reseller's customers 
     * @return CustomerUinType Customer type. valid values: [Customer, Reseller, ResellerCustomer]. `Customer`: direct customer; `Reseller`: secondary reseller; `ResellerCustomer`: reseller's customers
     */
    public String getCustomerUinType() {
        return this.CustomerUinType;
    }

    /**
     * Set Customer type. valid values: [Customer, Reseller, ResellerCustomer]. `Customer`: direct customer; `Reseller`: secondary reseller; `ResellerCustomer`: reseller's customers
     * @param CustomerUinType Customer type. valid values: [Customer, Reseller, ResellerCustomer]. `Customer`: direct customer; `Reseller`: secondary reseller; `ResellerCustomer`: reseller's customers
     */
    public void setCustomerUinType(String CustomerUinType) {
        this.CustomerUinType = CustomerUinType;
    }

    /**
     * Get Language. valid values: [zh_cn, en]. default is `en` (english). 
     * @return FileLanguage Language. valid values: [zh_cn, en]. default is `en` (english).
     */
    public String getFileLanguage() {
        return this.FileLanguage;
    }

    /**
     * Set Language. valid values: [zh_cn, en]. default is `en` (english).
     * @param FileLanguage Language. valid values: [zh_cn, en]. default is `en` (english).
     */
    public void setFileLanguage(String FileLanguage) {
        this.FileLanguage = FileLanguage;
    }

    /**
     * Get Customer uin. when downloading the bill package (FileType is billResourcePack or billDetailPack), CustomerUin is not passed 
     * @return CustomerUin Customer uin. when downloading the bill package (FileType is billResourcePack or billDetailPack), CustomerUin is not passed
     */
    public Long getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set Customer uin. when downloading the bill package (FileType is billResourcePack or billDetailPack), CustomerUin is not passed
     * @param CustomerUin Customer uin. when downloading the bill package (FileType is billResourcePack or billDetailPack), CustomerUin is not passed
     */
    public void setCustomerUin(Long CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    public DescribeCustomerBillDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerBillDownloadUrlRequest(DescribeCustomerBillDownloadUrlRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CustomerUinType != null) {
            this.CustomerUinType = new String(source.CustomerUinType);
        }
        if (source.FileLanguage != null) {
            this.FileLanguage = new String(source.FileLanguage);
        }
        if (source.CustomerUin != null) {
            this.CustomerUin = new Long(source.CustomerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CustomerUinType", this.CustomerUinType);
        this.setParamSimple(map, prefix + "FileLanguage", this.FileLanguage);
        this.setParamSimple(map, prefix + "CustomerUin", this.CustomerUin);

    }
}

