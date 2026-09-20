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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MLIDCard extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Identity card number
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Sex
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Document type
MyKad identity card
MyPR permanent residence permit
MyTentera Military ID card
MyKAS Temporary ID card
POLIS Police ID card
IKAD labor ID card
MyKid Juvenile ID card
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Date of birth (currently this field only supports IKAD labor ID card and MyKad ID card)
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Identity card number 
     * @return ID Identity card number
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Identity card number
     * @param ID Identity card number
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Sex 
     * @return Sex Sex
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Sex
     * @param Sex Sex
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Address. 
     * @return Address Address.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address.
     * @param Address Address.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Document type
MyKad identity card
MyPR permanent residence permit
MyTentera Military ID card
MyKAS Temporary ID card
POLIS Police ID card
IKAD labor ID card
MyKid Juvenile ID card 
     * @return Type Document type
MyKad identity card
MyPR permanent residence permit
MyTentera Military ID card
MyKAS Temporary ID card
POLIS Police ID card
IKAD labor ID card
MyKid Juvenile ID card
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Document type
MyKad identity card
MyPR permanent residence permit
MyTentera Military ID card
MyKAS Temporary ID card
POLIS Police ID card
IKAD labor ID card
MyKid Juvenile ID card
     * @param Type Document type
MyKad identity card
MyPR permanent residence permit
MyTentera Military ID card
MyKAS Temporary ID card
POLIS Police ID card
IKAD labor ID card
MyKid Juvenile ID card
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Date of birth (currently this field only supports IKAD labor ID card and MyKad ID card) 
     * @return Birthday Date of birth (currently this field only supports IKAD labor ID card and MyKad ID card)
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Date of birth (currently this field only supports IKAD labor ID card and MyKad ID card)
     * @param Birthday Date of birth (currently this field only supports IKAD labor ID card and MyKad ID card)
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public MLIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MLIDCard(MLIDCard source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);

    }
}

