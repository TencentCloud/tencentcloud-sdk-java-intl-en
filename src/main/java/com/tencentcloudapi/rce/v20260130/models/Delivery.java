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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Delivery extends AbstractModel {

    /**
    * <p>The method of the delivery</p><ul><li>physical</li><li>electronic</li></ul>
    */
    @SerializedName("DeliveryMethod")
    @Expose
    private String DeliveryMethod;

    /**
    * <p>The fee of the delivery</p>
    */
    @SerializedName("DeliveryAmount")
    @Expose
    private Amount DeliveryAmount;

    /**
    * <p>The address of the delivery</p>
    */
    @SerializedName("DeliveryAddress")
    @Expose
    private Address DeliveryAddress;

    /**
    * <p>Phone number of the consignee</p><p>parameter format: format with "+", region code, and number that complies with the E.164 standard</p>
    */
    @SerializedName("ConsigneePhone")
    @Expose
    private String ConsigneePhone;

    /**
    * <p>Email of the consignee</p>
    */
    @SerializedName("ConsigneeEmail")
    @Expose
    private String ConsigneeEmail;

    /**
    * <p>Full name of the consignee</p>
    */
    @SerializedName("ConsigneeName")
    @Expose
    private String ConsigneeName;

    /**
    * <p> Whether is the delivery expedited</p>
    */
    @SerializedName("Expedited")
    @Expose
    private Boolean Expedited;

    /**
    * <p>The carrier of the delivery, usually a logistics company</p>
    */
    @SerializedName("DeliveryCarrier")
    @Expose
    private String DeliveryCarrier;

    /**
    * <p>The number(s) used to track the delivery</p>
    */
    @SerializedName("DeliveryTracking")
    @Expose
    private String DeliveryTracking;

    /**
     * Get <p>The method of the delivery</p><ul><li>physical</li><li>electronic</li></ul> 
     * @return DeliveryMethod <p>The method of the delivery</p><ul><li>physical</li><li>electronic</li></ul>
     */
    public String getDeliveryMethod() {
        return this.DeliveryMethod;
    }

    /**
     * Set <p>The method of the delivery</p><ul><li>physical</li><li>electronic</li></ul>
     * @param DeliveryMethod <p>The method of the delivery</p><ul><li>physical</li><li>electronic</li></ul>
     */
    public void setDeliveryMethod(String DeliveryMethod) {
        this.DeliveryMethod = DeliveryMethod;
    }

    /**
     * Get <p>The fee of the delivery</p> 
     * @return DeliveryAmount <p>The fee of the delivery</p>
     */
    public Amount getDeliveryAmount() {
        return this.DeliveryAmount;
    }

    /**
     * Set <p>The fee of the delivery</p>
     * @param DeliveryAmount <p>The fee of the delivery</p>
     */
    public void setDeliveryAmount(Amount DeliveryAmount) {
        this.DeliveryAmount = DeliveryAmount;
    }

    /**
     * Get <p>The address of the delivery</p> 
     * @return DeliveryAddress <p>The address of the delivery</p>
     */
    public Address getDeliveryAddress() {
        return this.DeliveryAddress;
    }

    /**
     * Set <p>The address of the delivery</p>
     * @param DeliveryAddress <p>The address of the delivery</p>
     */
    public void setDeliveryAddress(Address DeliveryAddress) {
        this.DeliveryAddress = DeliveryAddress;
    }

    /**
     * Get <p>Phone number of the consignee</p><p>parameter format: format with "+", region code, and number that complies with the E.164 standard</p> 
     * @return ConsigneePhone <p>Phone number of the consignee</p><p>parameter format: format with "+", region code, and number that complies with the E.164 standard</p>
     */
    public String getConsigneePhone() {
        return this.ConsigneePhone;
    }

    /**
     * Set <p>Phone number of the consignee</p><p>parameter format: format with "+", region code, and number that complies with the E.164 standard</p>
     * @param ConsigneePhone <p>Phone number of the consignee</p><p>parameter format: format with "+", region code, and number that complies with the E.164 standard</p>
     */
    public void setConsigneePhone(String ConsigneePhone) {
        this.ConsigneePhone = ConsigneePhone;
    }

    /**
     * Get <p>Email of the consignee</p> 
     * @return ConsigneeEmail <p>Email of the consignee</p>
     */
    public String getConsigneeEmail() {
        return this.ConsigneeEmail;
    }

    /**
     * Set <p>Email of the consignee</p>
     * @param ConsigneeEmail <p>Email of the consignee</p>
     */
    public void setConsigneeEmail(String ConsigneeEmail) {
        this.ConsigneeEmail = ConsigneeEmail;
    }

    /**
     * Get <p>Full name of the consignee</p> 
     * @return ConsigneeName <p>Full name of the consignee</p>
     */
    public String getConsigneeName() {
        return this.ConsigneeName;
    }

    /**
     * Set <p>Full name of the consignee</p>
     * @param ConsigneeName <p>Full name of the consignee</p>
     */
    public void setConsigneeName(String ConsigneeName) {
        this.ConsigneeName = ConsigneeName;
    }

    /**
     * Get <p> Whether is the delivery expedited</p> 
     * @return Expedited <p> Whether is the delivery expedited</p>
     */
    public Boolean getExpedited() {
        return this.Expedited;
    }

    /**
     * Set <p> Whether is the delivery expedited</p>
     * @param Expedited <p> Whether is the delivery expedited</p>
     */
    public void setExpedited(Boolean Expedited) {
        this.Expedited = Expedited;
    }

    /**
     * Get <p>The carrier of the delivery, usually a logistics company</p> 
     * @return DeliveryCarrier <p>The carrier of the delivery, usually a logistics company</p>
     */
    public String getDeliveryCarrier() {
        return this.DeliveryCarrier;
    }

    /**
     * Set <p>The carrier of the delivery, usually a logistics company</p>
     * @param DeliveryCarrier <p>The carrier of the delivery, usually a logistics company</p>
     */
    public void setDeliveryCarrier(String DeliveryCarrier) {
        this.DeliveryCarrier = DeliveryCarrier;
    }

    /**
     * Get <p>The number(s) used to track the delivery</p> 
     * @return DeliveryTracking <p>The number(s) used to track the delivery</p>
     */
    public String getDeliveryTracking() {
        return this.DeliveryTracking;
    }

    /**
     * Set <p>The number(s) used to track the delivery</p>
     * @param DeliveryTracking <p>The number(s) used to track the delivery</p>
     */
    public void setDeliveryTracking(String DeliveryTracking) {
        this.DeliveryTracking = DeliveryTracking;
    }

    public Delivery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Delivery(Delivery source) {
        if (source.DeliveryMethod != null) {
            this.DeliveryMethod = new String(source.DeliveryMethod);
        }
        if (source.DeliveryAmount != null) {
            this.DeliveryAmount = new Amount(source.DeliveryAmount);
        }
        if (source.DeliveryAddress != null) {
            this.DeliveryAddress = new Address(source.DeliveryAddress);
        }
        if (source.ConsigneePhone != null) {
            this.ConsigneePhone = new String(source.ConsigneePhone);
        }
        if (source.ConsigneeEmail != null) {
            this.ConsigneeEmail = new String(source.ConsigneeEmail);
        }
        if (source.ConsigneeName != null) {
            this.ConsigneeName = new String(source.ConsigneeName);
        }
        if (source.Expedited != null) {
            this.Expedited = new Boolean(source.Expedited);
        }
        if (source.DeliveryCarrier != null) {
            this.DeliveryCarrier = new String(source.DeliveryCarrier);
        }
        if (source.DeliveryTracking != null) {
            this.DeliveryTracking = new String(source.DeliveryTracking);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliveryMethod", this.DeliveryMethod);
        this.setParamObj(map, prefix + "DeliveryAmount.", this.DeliveryAmount);
        this.setParamObj(map, prefix + "DeliveryAddress.", this.DeliveryAddress);
        this.setParamSimple(map, prefix + "ConsigneePhone", this.ConsigneePhone);
        this.setParamSimple(map, prefix + "ConsigneeEmail", this.ConsigneeEmail);
        this.setParamSimple(map, prefix + "ConsigneeName", this.ConsigneeName);
        this.setParamSimple(map, prefix + "Expedited", this.Expedited);
        this.setParamSimple(map, prefix + "DeliveryCarrier", this.DeliveryCarrier);
        this.setParamSimple(map, prefix + "DeliveryTracking", this.DeliveryTracking);

    }
}

