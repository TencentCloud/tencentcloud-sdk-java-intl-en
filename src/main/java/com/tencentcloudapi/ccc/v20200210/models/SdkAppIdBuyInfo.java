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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SdkAppIdBuyInfo extends AbstractModel {

    /**
    * Application id.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Application name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Agent purchase count (still within the validity period).
    */
    @SerializedName("StaffBuyNum")
    @Expose
    private Long StaffBuyNum;

    /**
    * Agent purchase list (still within the validity period).
    */
    @SerializedName("StaffBuyList")
    @Expose
    private StaffBuyInfo [] StaffBuyList;

    /**
    * List of numbers purchased.
    */
    @SerializedName("PhoneNumBuyList")
    @Expose
    private PhoneNumBuyInfo [] PhoneNumBuyList;

    /**
    * Number of office telephones purchased (still within the validity period).
    */
    @SerializedName("SipBuyNum")
    @Expose
    private Long SipBuyNum;

    /**
     * Get Application id. 
     * @return SdkAppId Application id.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application id.
     * @param SdkAppId Application id.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Application name. 
     * @return Name Application name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Application name.
     * @param Name Application name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Agent purchase count (still within the validity period). 
     * @return StaffBuyNum Agent purchase count (still within the validity period).
     */
    public Long getStaffBuyNum() {
        return this.StaffBuyNum;
    }

    /**
     * Set Agent purchase count (still within the validity period).
     * @param StaffBuyNum Agent purchase count (still within the validity period).
     */
    public void setStaffBuyNum(Long StaffBuyNum) {
        this.StaffBuyNum = StaffBuyNum;
    }

    /**
     * Get Agent purchase list (still within the validity period). 
     * @return StaffBuyList Agent purchase list (still within the validity period).
     */
    public StaffBuyInfo [] getStaffBuyList() {
        return this.StaffBuyList;
    }

    /**
     * Set Agent purchase list (still within the validity period).
     * @param StaffBuyList Agent purchase list (still within the validity period).
     */
    public void setStaffBuyList(StaffBuyInfo [] StaffBuyList) {
        this.StaffBuyList = StaffBuyList;
    }

    /**
     * Get List of numbers purchased. 
     * @return PhoneNumBuyList List of numbers purchased.
     */
    public PhoneNumBuyInfo [] getPhoneNumBuyList() {
        return this.PhoneNumBuyList;
    }

    /**
     * Set List of numbers purchased.
     * @param PhoneNumBuyList List of numbers purchased.
     */
    public void setPhoneNumBuyList(PhoneNumBuyInfo [] PhoneNumBuyList) {
        this.PhoneNumBuyList = PhoneNumBuyList;
    }

    /**
     * Get Number of office telephones purchased (still within the validity period). 
     * @return SipBuyNum Number of office telephones purchased (still within the validity period).
     */
    public Long getSipBuyNum() {
        return this.SipBuyNum;
    }

    /**
     * Set Number of office telephones purchased (still within the validity period).
     * @param SipBuyNum Number of office telephones purchased (still within the validity period).
     */
    public void setSipBuyNum(Long SipBuyNum) {
        this.SipBuyNum = SipBuyNum;
    }

    public SdkAppIdBuyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SdkAppIdBuyInfo(SdkAppIdBuyInfo source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StaffBuyNum != null) {
            this.StaffBuyNum = new Long(source.StaffBuyNum);
        }
        if (source.StaffBuyList != null) {
            this.StaffBuyList = new StaffBuyInfo[source.StaffBuyList.length];
            for (int i = 0; i < source.StaffBuyList.length; i++) {
                this.StaffBuyList[i] = new StaffBuyInfo(source.StaffBuyList[i]);
            }
        }
        if (source.PhoneNumBuyList != null) {
            this.PhoneNumBuyList = new PhoneNumBuyInfo[source.PhoneNumBuyList.length];
            for (int i = 0; i < source.PhoneNumBuyList.length; i++) {
                this.PhoneNumBuyList[i] = new PhoneNumBuyInfo(source.PhoneNumBuyList[i]);
            }
        }
        if (source.SipBuyNum != null) {
            this.SipBuyNum = new Long(source.SipBuyNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StaffBuyNum", this.StaffBuyNum);
        this.setParamArrayObj(map, prefix + "StaffBuyList.", this.StaffBuyList);
        this.setParamArrayObj(map, prefix + "PhoneNumBuyList.", this.PhoneNumBuyList);
        this.setParamSimple(map, prefix + "SipBuyNum", this.SipBuyNum);

    }
}

