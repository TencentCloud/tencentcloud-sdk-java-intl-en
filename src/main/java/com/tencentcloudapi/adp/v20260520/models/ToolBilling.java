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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ToolBilling extends AbstractModel {

    /**
    * <p>Basic Billing Information</p>
    */
    @SerializedName("BasicBilling")
    @Expose
    private BasicBilling BasicBilling;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>BILLING_TYPE_FREE</td> <td>0</td> <td>Free</td> </tr> <tr> <td>BILLING_TYPE_LIMITED_FREE</td> <td>1</td> <td>Limited-time free</td> </tr> <tr> <td>BILLING_TYPE_OFFICIAL_PAID</td> <td>2</td> <td>Official charges</td> </tr> <tr> <td>BILLING_TYPE_OFFICIAL_PAID_OLD_FREE</td> <td>3</td> <td>Official charges (fees for new/upgraded users, limited-time free for existing users)</td> </tr> </tbody> </table>
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
    * <p>Composite type billing information</p>
    */
    @SerializedName("ComplexBilling")
    @Expose
    private ComplexBilling ComplexBilling;

    /**
    * <p>Bidirectional billing information</p>
    */
    @SerializedName("DuplexBilling")
    @Expose
    private DuplexBilling DuplexBilling;

    /**
     * Get <p>Basic Billing Information</p> 
     * @return BasicBilling <p>Basic Billing Information</p>
     */
    public BasicBilling getBasicBilling() {
        return this.BasicBilling;
    }

    /**
     * Set <p>Basic Billing Information</p>
     * @param BasicBilling <p>Basic Billing Information</p>
     */
    public void setBasicBilling(BasicBilling BasicBilling) {
        this.BasicBilling = BasicBilling;
    }

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>BILLING_TYPE_FREE</td> <td>0</td> <td>Free</td> </tr> <tr> <td>BILLING_TYPE_LIMITED_FREE</td> <td>1</td> <td>Limited-time free</td> </tr> <tr> <td>BILLING_TYPE_OFFICIAL_PAID</td> <td>2</td> <td>Official charges</td> </tr> <tr> <td>BILLING_TYPE_OFFICIAL_PAID_OLD_FREE</td> <td>3</td> <td>Official charges (fees for new/upgraded users, limited-time free for existing users)</td> </tr> </tbody> </table> 
     * @return BillingType <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>BILLING_TYPE_FREE</td> <td>0</td> <td>Free</td> </tr> <tr> <td>BILLING_TYPE_LIMITED_FREE</td> <td>1</td> <td>Limited-time free</td> </tr> <tr> <td>BILLING_TYPE_OFFICIAL_PAID</td> <td>2</td> <td>Official charges</td> </tr> <tr> <td>BILLING_TYPE_OFFICIAL_PAID_OLD_FREE</td> <td>3</td> <td>Official charges (fees for new/upgraded users, limited-time free for existing users)</td> </tr> </tbody> </table>
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>BILLING_TYPE_FREE</td> <td>0</td> <td>Free</td> </tr> <tr> <td>BILLING_TYPE_LIMITED_FREE</td> <td>1</td> <td>Limited-time free</td> </tr> <tr> <td>BILLING_TYPE_OFFICIAL_PAID</td> <td>2</td> <td>Official charges</td> </tr> <tr> <td>BILLING_TYPE_OFFICIAL_PAID_OLD_FREE</td> <td>3</td> <td>Official charges (fees for new/upgraded users, limited-time free for existing users)</td> </tr> </tbody> </table>
     * @param BillingType <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>BILLING_TYPE_FREE</td> <td>0</td> <td>Free</td> </tr> <tr> <td>BILLING_TYPE_LIMITED_FREE</td> <td>1</td> <td>Limited-time free</td> </tr> <tr> <td>BILLING_TYPE_OFFICIAL_PAID</td> <td>2</td> <td>Official charges</td> </tr> <tr> <td>BILLING_TYPE_OFFICIAL_PAID_OLD_FREE</td> <td>3</td> <td>Official charges (fees for new/upgraded users, limited-time free for existing users)</td> </tr> </tbody> </table>
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * Get <p>Composite type billing information</p> 
     * @return ComplexBilling <p>Composite type billing information</p>
     */
    public ComplexBilling getComplexBilling() {
        return this.ComplexBilling;
    }

    /**
     * Set <p>Composite type billing information</p>
     * @param ComplexBilling <p>Composite type billing information</p>
     */
    public void setComplexBilling(ComplexBilling ComplexBilling) {
        this.ComplexBilling = ComplexBilling;
    }

    /**
     * Get <p>Bidirectional billing information</p> 
     * @return DuplexBilling <p>Bidirectional billing information</p>
     */
    public DuplexBilling getDuplexBilling() {
        return this.DuplexBilling;
    }

    /**
     * Set <p>Bidirectional billing information</p>
     * @param DuplexBilling <p>Bidirectional billing information</p>
     */
    public void setDuplexBilling(DuplexBilling DuplexBilling) {
        this.DuplexBilling = DuplexBilling;
    }

    public ToolBilling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolBilling(ToolBilling source) {
        if (source.BasicBilling != null) {
            this.BasicBilling = new BasicBilling(source.BasicBilling);
        }
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
        }
        if (source.ComplexBilling != null) {
            this.ComplexBilling = new ComplexBilling(source.ComplexBilling);
        }
        if (source.DuplexBilling != null) {
            this.DuplexBilling = new DuplexBilling(source.DuplexBilling);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BasicBilling.", this.BasicBilling);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamObj(map, prefix + "ComplexBilling.", this.ComplexBilling);
        this.setParamObj(map, prefix + "DuplexBilling.", this.DuplexBilling);

    }
}

