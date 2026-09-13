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

public class TransactionEvent extends AbstractModel {

    /**
    * <p>The unique ID of the transaction</p>
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * <p>The ID(s) of the order associated with the transaction</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String [] OrderId;

    /**
    * <p>The amount of the transaction</p>
    */
    @SerializedName("PaymentAmount")
    @Expose
    private Amount PaymentAmount;

    /**
    * <p>The detail information of the payment method associated with the transaction</p>
    */
    @SerializedName("PaymentMethod")
    @Expose
    private PaymentMethod PaymentMethod;

    /**
    * <p>Transaction type</p><p>Enumeration value:</p><ul><li>sale: One-time authorization and deduction (most common)</li><li>authorize: Authorization only (frozen amount)</li><li>capture: Execute deduction (after authorization)</li><li>void: Cancel pending authorization or deduction</li><li>refund: Refund (part or all)</li><li>deposit: Deposit to account</li><li>withdrawal: Withdrawal from account</li><li>transfer: Fund transfer between accounts</li><li>buy: Purchase asset (for example, crypto currency)</li><li>sell: Sell asset</li><li>send: Send fund/asset (for example, cross-wallet transfer)</li><li>receive: Receive fund/asset</li></ul><p>Default value: sale</p>
    */
    @SerializedName("TransactionType")
    @Expose
    private String TransactionType;

    /**
    * <p>Bill information</p>
    */
    @SerializedName("Billing")
    @Expose
    private Billing Billing;

    /**
    * <p>Delivery information</p>
    */
    @SerializedName("Delivery")
    @Expose
    private Delivery Delivery;

    /**
    * <p>Merchant information</p>
    */
    @SerializedName("Merchant")
    @Expose
    private Merchant Merchant;

    /**
    * <p>Payment result</p>
    */
    @SerializedName("PaymentResult")
    @Expose
    private PaymentResult PaymentResult;

    /**
    * <p>The ID of the recipent in transfer transaction</p>
    */
    @SerializedName("TransferRecipientUserId")
    @Expose
    private String TransferRecipientUserId;

    /**
    * <p>The address of the sender in transfer transaction</p>
    */
    @SerializedName("TransferSentAddress")
    @Expose
    private Address TransferSentAddress;

    /**
    * <p>Physical address of the recipient, applicable to the transfer transaction type.</p>
    */
    @SerializedName("TransferReceivedAddress")
    @Expose
    private Address TransferReceivedAddress;

    /**
    * <p>The digital order(s) associated with the transaction</p>
    */
    @SerializedName("DigitalOrders")
    @Expose
    private DigitalOrder [] DigitalOrders;

    /**
    * <p>Wallet to receive crypto currency</p>
    */
    @SerializedName("ReceiverWallet")
    @Expose
    private Wallet ReceiverWallet;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>The unique ID of the transaction</p> 
     * @return TransactionId <p>The unique ID of the transaction</p>
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set <p>The unique ID of the transaction</p>
     * @param TransactionId <p>The unique ID of the transaction</p>
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get <p>The ID(s) of the order associated with the transaction</p> 
     * @return OrderId <p>The ID(s) of the order associated with the transaction</p>
     */
    public String [] getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>The ID(s) of the order associated with the transaction</p>
     * @param OrderId <p>The ID(s) of the order associated with the transaction</p>
     */
    public void setOrderId(String [] OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>The amount of the transaction</p> 
     * @return PaymentAmount <p>The amount of the transaction</p>
     */
    public Amount getPaymentAmount() {
        return this.PaymentAmount;
    }

    /**
     * Set <p>The amount of the transaction</p>
     * @param PaymentAmount <p>The amount of the transaction</p>
     */
    public void setPaymentAmount(Amount PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    /**
     * Get <p>The detail information of the payment method associated with the transaction</p> 
     * @return PaymentMethod <p>The detail information of the payment method associated with the transaction</p>
     */
    public PaymentMethod getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set <p>The detail information of the payment method associated with the transaction</p>
     * @param PaymentMethod <p>The detail information of the payment method associated with the transaction</p>
     */
    public void setPaymentMethod(PaymentMethod PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get <p>Transaction type</p><p>Enumeration value:</p><ul><li>sale: One-time authorization and deduction (most common)</li><li>authorize: Authorization only (frozen amount)</li><li>capture: Execute deduction (after authorization)</li><li>void: Cancel pending authorization or deduction</li><li>refund: Refund (part or all)</li><li>deposit: Deposit to account</li><li>withdrawal: Withdrawal from account</li><li>transfer: Fund transfer between accounts</li><li>buy: Purchase asset (for example, crypto currency)</li><li>sell: Sell asset</li><li>send: Send fund/asset (for example, cross-wallet transfer)</li><li>receive: Receive fund/asset</li></ul><p>Default value: sale</p> 
     * @return TransactionType <p>Transaction type</p><p>Enumeration value:</p><ul><li>sale: One-time authorization and deduction (most common)</li><li>authorize: Authorization only (frozen amount)</li><li>capture: Execute deduction (after authorization)</li><li>void: Cancel pending authorization or deduction</li><li>refund: Refund (part or all)</li><li>deposit: Deposit to account</li><li>withdrawal: Withdrawal from account</li><li>transfer: Fund transfer between accounts</li><li>buy: Purchase asset (for example, crypto currency)</li><li>sell: Sell asset</li><li>send: Send fund/asset (for example, cross-wallet transfer)</li><li>receive: Receive fund/asset</li></ul><p>Default value: sale</p>
     */
    public String getTransactionType() {
        return this.TransactionType;
    }

    /**
     * Set <p>Transaction type</p><p>Enumeration value:</p><ul><li>sale: One-time authorization and deduction (most common)</li><li>authorize: Authorization only (frozen amount)</li><li>capture: Execute deduction (after authorization)</li><li>void: Cancel pending authorization or deduction</li><li>refund: Refund (part or all)</li><li>deposit: Deposit to account</li><li>withdrawal: Withdrawal from account</li><li>transfer: Fund transfer between accounts</li><li>buy: Purchase asset (for example, crypto currency)</li><li>sell: Sell asset</li><li>send: Send fund/asset (for example, cross-wallet transfer)</li><li>receive: Receive fund/asset</li></ul><p>Default value: sale</p>
     * @param TransactionType <p>Transaction type</p><p>Enumeration value:</p><ul><li>sale: One-time authorization and deduction (most common)</li><li>authorize: Authorization only (frozen amount)</li><li>capture: Execute deduction (after authorization)</li><li>void: Cancel pending authorization or deduction</li><li>refund: Refund (part or all)</li><li>deposit: Deposit to account</li><li>withdrawal: Withdrawal from account</li><li>transfer: Fund transfer between accounts</li><li>buy: Purchase asset (for example, crypto currency)</li><li>sell: Sell asset</li><li>send: Send fund/asset (for example, cross-wallet transfer)</li><li>receive: Receive fund/asset</li></ul><p>Default value: sale</p>
     */
    public void setTransactionType(String TransactionType) {
        this.TransactionType = TransactionType;
    }

    /**
     * Get <p>Bill information</p> 
     * @return Billing <p>Bill information</p>
     */
    public Billing getBilling() {
        return this.Billing;
    }

    /**
     * Set <p>Bill information</p>
     * @param Billing <p>Bill information</p>
     */
    public void setBilling(Billing Billing) {
        this.Billing = Billing;
    }

    /**
     * Get <p>Delivery information</p> 
     * @return Delivery <p>Delivery information</p>
     */
    public Delivery getDelivery() {
        return this.Delivery;
    }

    /**
     * Set <p>Delivery information</p>
     * @param Delivery <p>Delivery information</p>
     */
    public void setDelivery(Delivery Delivery) {
        this.Delivery = Delivery;
    }

    /**
     * Get <p>Merchant information</p> 
     * @return Merchant <p>Merchant information</p>
     */
    public Merchant getMerchant() {
        return this.Merchant;
    }

    /**
     * Set <p>Merchant information</p>
     * @param Merchant <p>Merchant information</p>
     */
    public void setMerchant(Merchant Merchant) {
        this.Merchant = Merchant;
    }

    /**
     * Get <p>Payment result</p> 
     * @return PaymentResult <p>Payment result</p>
     */
    public PaymentResult getPaymentResult() {
        return this.PaymentResult;
    }

    /**
     * Set <p>Payment result</p>
     * @param PaymentResult <p>Payment result</p>
     */
    public void setPaymentResult(PaymentResult PaymentResult) {
        this.PaymentResult = PaymentResult;
    }

    /**
     * Get <p>The ID of the recipent in transfer transaction</p> 
     * @return TransferRecipientUserId <p>The ID of the recipent in transfer transaction</p>
     */
    public String getTransferRecipientUserId() {
        return this.TransferRecipientUserId;
    }

    /**
     * Set <p>The ID of the recipent in transfer transaction</p>
     * @param TransferRecipientUserId <p>The ID of the recipent in transfer transaction</p>
     */
    public void setTransferRecipientUserId(String TransferRecipientUserId) {
        this.TransferRecipientUserId = TransferRecipientUserId;
    }

    /**
     * Get <p>The address of the sender in transfer transaction</p> 
     * @return TransferSentAddress <p>The address of the sender in transfer transaction</p>
     */
    public Address getTransferSentAddress() {
        return this.TransferSentAddress;
    }

    /**
     * Set <p>The address of the sender in transfer transaction</p>
     * @param TransferSentAddress <p>The address of the sender in transfer transaction</p>
     */
    public void setTransferSentAddress(Address TransferSentAddress) {
        this.TransferSentAddress = TransferSentAddress;
    }

    /**
     * Get <p>Physical address of the recipient, applicable to the transfer transaction type.</p> 
     * @return TransferReceivedAddress <p>Physical address of the recipient, applicable to the transfer transaction type.</p>
     */
    public Address getTransferReceivedAddress() {
        return this.TransferReceivedAddress;
    }

    /**
     * Set <p>Physical address of the recipient, applicable to the transfer transaction type.</p>
     * @param TransferReceivedAddress <p>Physical address of the recipient, applicable to the transfer transaction type.</p>
     */
    public void setTransferReceivedAddress(Address TransferReceivedAddress) {
        this.TransferReceivedAddress = TransferReceivedAddress;
    }

    /**
     * Get <p>The digital order(s) associated with the transaction</p> 
     * @return DigitalOrders <p>The digital order(s) associated with the transaction</p>
     */
    public DigitalOrder [] getDigitalOrders() {
        return this.DigitalOrders;
    }

    /**
     * Set <p>The digital order(s) associated with the transaction</p>
     * @param DigitalOrders <p>The digital order(s) associated with the transaction</p>
     */
    public void setDigitalOrders(DigitalOrder [] DigitalOrders) {
        this.DigitalOrders = DigitalOrders;
    }

    /**
     * Get <p>Wallet to receive crypto currency</p> 
     * @return ReceiverWallet <p>Wallet to receive crypto currency</p>
     */
    public Wallet getReceiverWallet() {
        return this.ReceiverWallet;
    }

    /**
     * Set <p>Wallet to receive crypto currency</p>
     * @param ReceiverWallet <p>Wallet to receive crypto currency</p>
     */
    public void setReceiverWallet(Wallet ReceiverWallet) {
        this.ReceiverWallet = ReceiverWallet;
    }

    /**
     * Get <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p> 
     * @return Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     * @param Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public TransactionEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransactionEvent(TransactionEvent source) {
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String[source.OrderId.length];
            for (int i = 0; i < source.OrderId.length; i++) {
                this.OrderId[i] = new String(source.OrderId[i]);
            }
        }
        if (source.PaymentAmount != null) {
            this.PaymentAmount = new Amount(source.PaymentAmount);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new PaymentMethod(source.PaymentMethod);
        }
        if (source.TransactionType != null) {
            this.TransactionType = new String(source.TransactionType);
        }
        if (source.Billing != null) {
            this.Billing = new Billing(source.Billing);
        }
        if (source.Delivery != null) {
            this.Delivery = new Delivery(source.Delivery);
        }
        if (source.Merchant != null) {
            this.Merchant = new Merchant(source.Merchant);
        }
        if (source.PaymentResult != null) {
            this.PaymentResult = new PaymentResult(source.PaymentResult);
        }
        if (source.TransferRecipientUserId != null) {
            this.TransferRecipientUserId = new String(source.TransferRecipientUserId);
        }
        if (source.TransferSentAddress != null) {
            this.TransferSentAddress = new Address(source.TransferSentAddress);
        }
        if (source.TransferReceivedAddress != null) {
            this.TransferReceivedAddress = new Address(source.TransferReceivedAddress);
        }
        if (source.DigitalOrders != null) {
            this.DigitalOrders = new DigitalOrder[source.DigitalOrders.length];
            for (int i = 0; i < source.DigitalOrders.length; i++) {
                this.DigitalOrders[i] = new DigitalOrder(source.DigitalOrders[i]);
            }
        }
        if (source.ReceiverWallet != null) {
            this.ReceiverWallet = new Wallet(source.ReceiverWallet);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamArraySimple(map, prefix + "OrderId.", this.OrderId);
        this.setParamObj(map, prefix + "PaymentAmount.", this.PaymentAmount);
        this.setParamObj(map, prefix + "PaymentMethod.", this.PaymentMethod);
        this.setParamSimple(map, prefix + "TransactionType", this.TransactionType);
        this.setParamObj(map, prefix + "Billing.", this.Billing);
        this.setParamObj(map, prefix + "Delivery.", this.Delivery);
        this.setParamObj(map, prefix + "Merchant.", this.Merchant);
        this.setParamObj(map, prefix + "PaymentResult.", this.PaymentResult);
        this.setParamSimple(map, prefix + "TransferRecipientUserId", this.TransferRecipientUserId);
        this.setParamObj(map, prefix + "TransferSentAddress.", this.TransferSentAddress);
        this.setParamObj(map, prefix + "TransferReceivedAddress.", this.TransferReceivedAddress);
        this.setParamArrayObj(map, prefix + "DigitalOrders.", this.DigitalOrders);
        this.setParamObj(map, prefix + "ReceiverWallet.", this.ReceiverWallet);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

