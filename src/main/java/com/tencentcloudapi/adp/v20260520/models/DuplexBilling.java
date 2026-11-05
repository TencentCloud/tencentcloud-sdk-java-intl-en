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

public class DuplexBilling extends AbstractModel {

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>UNKNOW</td> <td>0</td> <td></td> </tr> <tr> <td>TOKEN</td> <td>1</td> <td>By token</td> </tr> <tr> <td>PAGE_COUNT</td> <td>2</td> <td>By page number</td> </tr> <tr> <td>TIMES</td> <td>3</td> <td>By count</td> </tr> <tr> <td>TIMES_THOUSAND</td> <td>4</td> <td>By thousand counts</td> </tr> <tr> <td>SECOND</td> <td>5</td> <td>By duration</td> </tr> <tr> <td>CHARACTER</td> <td>6</td> <td>By number of characters</td> </tr> <tr> <td>CHARACTER_THOUSAND</td> <td>7</td> <td>By thousand characters</td> </tr> <tr> <td>SHEET</td> <td>8</td> <td>By sheet</td> </tr> <tr> <td>NUMBER</td> <td>9</td> <td>By count</td> </tr> </tbody> </table>
    */
    @SerializedName("BillingUnit")
    @Expose
    private Long BillingUnit;

    /**
    * <p>Input cash price</p><p>Unit: CNY</p>
    */
    @SerializedName("InputCashPrice")
    @Expose
    private Float InputCashPrice;

    /**
    * <p>Input PU price</p><p>Unit: pu</p>
    */
    @SerializedName("InputPuPrice")
    @Expose
    private Float InputPuPrice;

    /**
    * <p>Output cash price</p><p>Unit: CNY</p>
    */
    @SerializedName("OutputCashPrice")
    @Expose
    private Float OutputCashPrice;

    /**
    * <p>Output PU price</p><p>Unit: pu</p>
    */
    @SerializedName("OutputPuPrice")
    @Expose
    private Float OutputPuPrice;

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>UNKNOW</td> <td>0</td> <td></td> </tr> <tr> <td>TOKEN</td> <td>1</td> <td>By token</td> </tr> <tr> <td>PAGE_COUNT</td> <td>2</td> <td>By page number</td> </tr> <tr> <td>TIMES</td> <td>3</td> <td>By count</td> </tr> <tr> <td>TIMES_THOUSAND</td> <td>4</td> <td>By thousand counts</td> </tr> <tr> <td>SECOND</td> <td>5</td> <td>By duration</td> </tr> <tr> <td>CHARACTER</td> <td>6</td> <td>By number of characters</td> </tr> <tr> <td>CHARACTER_THOUSAND</td> <td>7</td> <td>By thousand characters</td> </tr> <tr> <td>SHEET</td> <td>8</td> <td>By sheet</td> </tr> <tr> <td>NUMBER</td> <td>9</td> <td>By count</td> </tr> </tbody> </table> 
     * @return BillingUnit <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>UNKNOW</td> <td>0</td> <td></td> </tr> <tr> <td>TOKEN</td> <td>1</td> <td>By token</td> </tr> <tr> <td>PAGE_COUNT</td> <td>2</td> <td>By page number</td> </tr> <tr> <td>TIMES</td> <td>3</td> <td>By count</td> </tr> <tr> <td>TIMES_THOUSAND</td> <td>4</td> <td>By thousand counts</td> </tr> <tr> <td>SECOND</td> <td>5</td> <td>By duration</td> </tr> <tr> <td>CHARACTER</td> <td>6</td> <td>By number of characters</td> </tr> <tr> <td>CHARACTER_THOUSAND</td> <td>7</td> <td>By thousand characters</td> </tr> <tr> <td>SHEET</td> <td>8</td> <td>By sheet</td> </tr> <tr> <td>NUMBER</td> <td>9</td> <td>By count</td> </tr> </tbody> </table>
     */
    public Long getBillingUnit() {
        return this.BillingUnit;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>UNKNOW</td> <td>0</td> <td></td> </tr> <tr> <td>TOKEN</td> <td>1</td> <td>By token</td> </tr> <tr> <td>PAGE_COUNT</td> <td>2</td> <td>By page number</td> </tr> <tr> <td>TIMES</td> <td>3</td> <td>By count</td> </tr> <tr> <td>TIMES_THOUSAND</td> <td>4</td> <td>By thousand counts</td> </tr> <tr> <td>SECOND</td> <td>5</td> <td>By duration</td> </tr> <tr> <td>CHARACTER</td> <td>6</td> <td>By number of characters</td> </tr> <tr> <td>CHARACTER_THOUSAND</td> <td>7</td> <td>By thousand characters</td> </tr> <tr> <td>SHEET</td> <td>8</td> <td>By sheet</td> </tr> <tr> <td>NUMBER</td> <td>9</td> <td>By count</td> </tr> </tbody> </table>
     * @param BillingUnit <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>UNKNOW</td> <td>0</td> <td></td> </tr> <tr> <td>TOKEN</td> <td>1</td> <td>By token</td> </tr> <tr> <td>PAGE_COUNT</td> <td>2</td> <td>By page number</td> </tr> <tr> <td>TIMES</td> <td>3</td> <td>By count</td> </tr> <tr> <td>TIMES_THOUSAND</td> <td>4</td> <td>By thousand counts</td> </tr> <tr> <td>SECOND</td> <td>5</td> <td>By duration</td> </tr> <tr> <td>CHARACTER</td> <td>6</td> <td>By number of characters</td> </tr> <tr> <td>CHARACTER_THOUSAND</td> <td>7</td> <td>By thousand characters</td> </tr> <tr> <td>SHEET</td> <td>8</td> <td>By sheet</td> </tr> <tr> <td>NUMBER</td> <td>9</td> <td>By count</td> </tr> </tbody> </table>
     */
    public void setBillingUnit(Long BillingUnit) {
        this.BillingUnit = BillingUnit;
    }

    /**
     * Get <p>Input cash price</p><p>Unit: CNY</p> 
     * @return InputCashPrice <p>Input cash price</p><p>Unit: CNY</p>
     */
    public Float getInputCashPrice() {
        return this.InputCashPrice;
    }

    /**
     * Set <p>Input cash price</p><p>Unit: CNY</p>
     * @param InputCashPrice <p>Input cash price</p><p>Unit: CNY</p>
     */
    public void setInputCashPrice(Float InputCashPrice) {
        this.InputCashPrice = InputCashPrice;
    }

    /**
     * Get <p>Input PU price</p><p>Unit: pu</p> 
     * @return InputPuPrice <p>Input PU price</p><p>Unit: pu</p>
     */
    public Float getInputPuPrice() {
        return this.InputPuPrice;
    }

    /**
     * Set <p>Input PU price</p><p>Unit: pu</p>
     * @param InputPuPrice <p>Input PU price</p><p>Unit: pu</p>
     */
    public void setInputPuPrice(Float InputPuPrice) {
        this.InputPuPrice = InputPuPrice;
    }

    /**
     * Get <p>Output cash price</p><p>Unit: CNY</p> 
     * @return OutputCashPrice <p>Output cash price</p><p>Unit: CNY</p>
     */
    public Float getOutputCashPrice() {
        return this.OutputCashPrice;
    }

    /**
     * Set <p>Output cash price</p><p>Unit: CNY</p>
     * @param OutputCashPrice <p>Output cash price</p><p>Unit: CNY</p>
     */
    public void setOutputCashPrice(Float OutputCashPrice) {
        this.OutputCashPrice = OutputCashPrice;
    }

    /**
     * Get <p>Output PU price</p><p>Unit: pu</p> 
     * @return OutputPuPrice <p>Output PU price</p><p>Unit: pu</p>
     */
    public Float getOutputPuPrice() {
        return this.OutputPuPrice;
    }

    /**
     * Set <p>Output PU price</p><p>Unit: pu</p>
     * @param OutputPuPrice <p>Output PU price</p><p>Unit: pu</p>
     */
    public void setOutputPuPrice(Float OutputPuPrice) {
        this.OutputPuPrice = OutputPuPrice;
    }

    public DuplexBilling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DuplexBilling(DuplexBilling source) {
        if (source.BillingUnit != null) {
            this.BillingUnit = new Long(source.BillingUnit);
        }
        if (source.InputCashPrice != null) {
            this.InputCashPrice = new Float(source.InputCashPrice);
        }
        if (source.InputPuPrice != null) {
            this.InputPuPrice = new Float(source.InputPuPrice);
        }
        if (source.OutputCashPrice != null) {
            this.OutputCashPrice = new Float(source.OutputCashPrice);
        }
        if (source.OutputPuPrice != null) {
            this.OutputPuPrice = new Float(source.OutputPuPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingUnit", this.BillingUnit);
        this.setParamSimple(map, prefix + "InputCashPrice", this.InputCashPrice);
        this.setParamSimple(map, prefix + "InputPuPrice", this.InputPuPrice);
        this.setParamSimple(map, prefix + "OutputCashPrice", this.OutputCashPrice);
        this.setParamSimple(map, prefix + "OutputPuPrice", this.OutputPuPrice);

    }
}

