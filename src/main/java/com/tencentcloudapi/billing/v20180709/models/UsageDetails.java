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

public class UsageDetails extends AbstractModel {

    /**
    * Product name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * product details
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * Product code	
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Sub-product code	
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * Billing item code.	
    */
    @SerializedName("BillingItemCode")
    @Expose
    private String BillingItemCode;

    /**
    * Billing sub-item code.	
    */
    @SerializedName("SubBillingItemCode")
    @Expose
    private String SubBillingItemCode;

    /**
    * Product English Name	
    */
    @SerializedName("ProductEnName")
    @Expose
    private String ProductEnName;

    /**
    * English name of the sub-product.	
    */
    @SerializedName("SubProductEnName")
    @Expose
    private String SubProductEnName;

    /**
    * billing cycle	
    */
    @SerializedName("CalcUnit")
    @Expose
    private String CalcUnit;

    /**
    * payMode is prepay and payScene is common in the current situation
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get Product name 
     * @return ProductName Product name
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name
     * @param ProductName Product name
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get product details 
     * @return SubProductName product details
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set product details
     * @param SubProductName product details
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get Product code	 
     * @return ProductCode Product code	
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Product code	
     * @param ProductCode Product code	
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Sub-product code	 
     * @return SubProductCode Sub-product code	
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set Sub-product code	
     * @param SubProductCode Sub-product code	
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get Billing item code.	 
     * @return BillingItemCode Billing item code.	
     */
    public String getBillingItemCode() {
        return this.BillingItemCode;
    }

    /**
     * Set Billing item code.	
     * @param BillingItemCode Billing item code.	
     */
    public void setBillingItemCode(String BillingItemCode) {
        this.BillingItemCode = BillingItemCode;
    }

    /**
     * Get Billing sub-item code.	 
     * @return SubBillingItemCode Billing sub-item code.	
     */
    public String getSubBillingItemCode() {
        return this.SubBillingItemCode;
    }

    /**
     * Set Billing sub-item code.	
     * @param SubBillingItemCode Billing sub-item code.	
     */
    public void setSubBillingItemCode(String SubBillingItemCode) {
        this.SubBillingItemCode = SubBillingItemCode;
    }

    /**
     * Get Product English Name	 
     * @return ProductEnName Product English Name	
     */
    public String getProductEnName() {
        return this.ProductEnName;
    }

    /**
     * Set Product English Name	
     * @param ProductEnName Product English Name	
     */
    public void setProductEnName(String ProductEnName) {
        this.ProductEnName = ProductEnName;
    }

    /**
     * Get English name of the sub-product.	 
     * @return SubProductEnName English name of the sub-product.	
     */
    public String getSubProductEnName() {
        return this.SubProductEnName;
    }

    /**
     * Set English name of the sub-product.	
     * @param SubProductEnName English name of the sub-product.	
     */
    public void setSubProductEnName(String SubProductEnName) {
        this.SubProductEnName = SubProductEnName;
    }

    /**
     * Get billing cycle	 
     * @return CalcUnit billing cycle	
     */
    public String getCalcUnit() {
        return this.CalcUnit;
    }

    /**
     * Set billing cycle	
     * @param CalcUnit billing cycle	
     */
    public void setCalcUnit(String CalcUnit) {
        this.CalcUnit = CalcUnit;
    }

    /**
     * Get payMode is prepay and payScene is common in the current situation 
     * @return Action payMode is prepay and payScene is common in the current situation
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set payMode is prepay and payScene is common in the current situation
     * @param Action payMode is prepay and payScene is common in the current situation
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public UsageDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDetails(UsageDetails source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SubProductName != null) {
            this.SubProductName = new String(source.SubProductName);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.BillingItemCode != null) {
            this.BillingItemCode = new String(source.BillingItemCode);
        }
        if (source.SubBillingItemCode != null) {
            this.SubBillingItemCode = new String(source.SubBillingItemCode);
        }
        if (source.ProductEnName != null) {
            this.ProductEnName = new String(source.ProductEnName);
        }
        if (source.SubProductEnName != null) {
            this.SubProductEnName = new String(source.SubProductEnName);
        }
        if (source.CalcUnit != null) {
            this.CalcUnit = new String(source.CalcUnit);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SubProductName", this.SubProductName);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "BillingItemCode", this.BillingItemCode);
        this.setParamSimple(map, prefix + "SubBillingItemCode", this.SubBillingItemCode);
        this.setParamSimple(map, prefix + "ProductEnName", this.ProductEnName);
        this.setParamSimple(map, prefix + "SubProductEnName", this.SubProductEnName);
        this.setParamSimple(map, prefix + "CalcUnit", this.CalcUnit);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

