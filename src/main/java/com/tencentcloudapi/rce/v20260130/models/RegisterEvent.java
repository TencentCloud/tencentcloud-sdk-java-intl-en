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

public class RegisterEvent extends AbstractModel {

    /**
    * <p>The result of the register</p>
    */
    @SerializedName("RegisterResult")
    @Expose
    private Result RegisterResult;

    /**
    * <p>The detail information of the user</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private User UserInfo;

    /**
    * <p>The personal information of the account when registered</p>
    */
    @SerializedName("Person")
    @Expose
    private Person Person;

    /**
    * <p>The billing address the user provided when registered</p>
    */
    @SerializedName("BillingAddress")
    @Expose
    private Address BillingAddress;

    /**
    * <p>The delivery address the user provided when registered</p>
    */
    @SerializedName("DeliveryAddress")
    @Expose
    private Address DeliveryAddress;

    /**
    * <p>The detail information of the inviter who invited the user to your business</p>
    */
    @SerializedName("Inviter")
    @Expose
    private Inviter Inviter;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>The result of the register</p> 
     * @return RegisterResult <p>The result of the register</p>
     */
    public Result getRegisterResult() {
        return this.RegisterResult;
    }

    /**
     * Set <p>The result of the register</p>
     * @param RegisterResult <p>The result of the register</p>
     */
    public void setRegisterResult(Result RegisterResult) {
        this.RegisterResult = RegisterResult;
    }

    /**
     * Get <p>The detail information of the user</p> 
     * @return UserInfo <p>The detail information of the user</p>
     */
    public User getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>The detail information of the user</p>
     * @param UserInfo <p>The detail information of the user</p>
     */
    public void setUserInfo(User UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get <p>The personal information of the account when registered</p> 
     * @return Person <p>The personal information of the account when registered</p>
     */
    public Person getPerson() {
        return this.Person;
    }

    /**
     * Set <p>The personal information of the account when registered</p>
     * @param Person <p>The personal information of the account when registered</p>
     */
    public void setPerson(Person Person) {
        this.Person = Person;
    }

    /**
     * Get <p>The billing address the user provided when registered</p> 
     * @return BillingAddress <p>The billing address the user provided when registered</p>
     */
    public Address getBillingAddress() {
        return this.BillingAddress;
    }

    /**
     * Set <p>The billing address the user provided when registered</p>
     * @param BillingAddress <p>The billing address the user provided when registered</p>
     */
    public void setBillingAddress(Address BillingAddress) {
        this.BillingAddress = BillingAddress;
    }

    /**
     * Get <p>The delivery address the user provided when registered</p> 
     * @return DeliveryAddress <p>The delivery address the user provided when registered</p>
     */
    public Address getDeliveryAddress() {
        return this.DeliveryAddress;
    }

    /**
     * Set <p>The delivery address the user provided when registered</p>
     * @param DeliveryAddress <p>The delivery address the user provided when registered</p>
     */
    public void setDeliveryAddress(Address DeliveryAddress) {
        this.DeliveryAddress = DeliveryAddress;
    }

    /**
     * Get <p>The detail information of the inviter who invited the user to your business</p> 
     * @return Inviter <p>The detail information of the inviter who invited the user to your business</p>
     */
    public Inviter getInviter() {
        return this.Inviter;
    }

    /**
     * Set <p>The detail information of the inviter who invited the user to your business</p>
     * @param Inviter <p>The detail information of the inviter who invited the user to your business</p>
     */
    public void setInviter(Inviter Inviter) {
        this.Inviter = Inviter;
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

    public RegisterEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterEvent(RegisterEvent source) {
        if (source.RegisterResult != null) {
            this.RegisterResult = new Result(source.RegisterResult);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new User(source.UserInfo);
        }
        if (source.Person != null) {
            this.Person = new Person(source.Person);
        }
        if (source.BillingAddress != null) {
            this.BillingAddress = new Address(source.BillingAddress);
        }
        if (source.DeliveryAddress != null) {
            this.DeliveryAddress = new Address(source.DeliveryAddress);
        }
        if (source.Inviter != null) {
            this.Inviter = new Inviter(source.Inviter);
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
        this.setParamObj(map, prefix + "RegisterResult.", this.RegisterResult);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamObj(map, prefix + "BillingAddress.", this.BillingAddress);
        this.setParamObj(map, prefix + "DeliveryAddress.", this.DeliveryAddress);
        this.setParamObj(map, prefix + "Inviter.", this.Inviter);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

