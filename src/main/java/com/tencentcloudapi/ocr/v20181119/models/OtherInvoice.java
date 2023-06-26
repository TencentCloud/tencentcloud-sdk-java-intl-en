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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherInvoice extends AbstractModel{

    /**
    * Invoice title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Amount
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * List
    */
    @SerializedName("OtherInvoiceListItems")
    @Expose
    private OtherInvoiceItem [] OtherInvoiceListItems;

    /**
    * Table
    */
    @SerializedName("OtherInvoiceTableItems")
    @Expose
    private OtherInvoiceList [] OtherInvoiceTableItems;

    /**
     * Get Invoice title 
     * @return Title Invoice title
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Invoice title
     * @param Title Invoice title
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Amount 
     * @return Total Amount
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Amount
     * @param Total Amount
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get List 
     * @return OtherInvoiceListItems List
     */
    public OtherInvoiceItem [] getOtherInvoiceListItems() {
        return this.OtherInvoiceListItems;
    }

    /**
     * Set List
     * @param OtherInvoiceListItems List
     */
    public void setOtherInvoiceListItems(OtherInvoiceItem [] OtherInvoiceListItems) {
        this.OtherInvoiceListItems = OtherInvoiceListItems;
    }

    /**
     * Get Table 
     * @return OtherInvoiceTableItems Table
     */
    public OtherInvoiceList [] getOtherInvoiceTableItems() {
        return this.OtherInvoiceTableItems;
    }

    /**
     * Set Table
     * @param OtherInvoiceTableItems Table
     */
    public void setOtherInvoiceTableItems(OtherInvoiceList [] OtherInvoiceTableItems) {
        this.OtherInvoiceTableItems = OtherInvoiceTableItems;
    }

    public OtherInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherInvoice(OtherInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.OtherInvoiceListItems != null) {
            this.OtherInvoiceListItems = new OtherInvoiceItem[source.OtherInvoiceListItems.length];
            for (int i = 0; i < source.OtherInvoiceListItems.length; i++) {
                this.OtherInvoiceListItems[i] = new OtherInvoiceItem(source.OtherInvoiceListItems[i]);
            }
        }
        if (source.OtherInvoiceTableItems != null) {
            this.OtherInvoiceTableItems = new OtherInvoiceList[source.OtherInvoiceTableItems.length];
            for (int i = 0; i < source.OtherInvoiceTableItems.length; i++) {
                this.OtherInvoiceTableItems[i] = new OtherInvoiceList(source.OtherInvoiceTableItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "OtherInvoiceListItems.", this.OtherInvoiceListItems);
        this.setParamArrayObj(map, prefix + "OtherInvoiceTableItems.", this.OtherInvoiceTableItems);

    }
}

