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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UebaUserSummary extends AbstractModel {

    /**
    * Quantity of all users
    */
    @SerializedName("AllUserCount")
    @Expose
    private Long AllUserCount;

    /**
    * Number of abnormal users
    */
    @SerializedName("AbnormalUserCount")
    @Expose
    private Long AbnormalUserCount;

    /**
    * Number of users for the cloud account
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * Number of sub-users
    */
    @SerializedName("SubUserCount")
    @Expose
    private Long SubUserCount;

    /**
    * Number of custom users
    */
    @SerializedName("CustomUserCount")
    @Expose
    private Long CustomUserCount;

    /**
    * Custom user sum building block
    */
    @SerializedName("Element")
    @Expose
    private UebaUserSummaryElement [] Element;

    /**
     * Get Quantity of all users 
     * @return AllUserCount Quantity of all users
     */
    public Long getAllUserCount() {
        return this.AllUserCount;
    }

    /**
     * Set Quantity of all users
     * @param AllUserCount Quantity of all users
     */
    public void setAllUserCount(Long AllUserCount) {
        this.AllUserCount = AllUserCount;
    }

    /**
     * Get Number of abnormal users 
     * @return AbnormalUserCount Number of abnormal users
     */
    public Long getAbnormalUserCount() {
        return this.AbnormalUserCount;
    }

    /**
     * Set Number of abnormal users
     * @param AbnormalUserCount Number of abnormal users
     */
    public void setAbnormalUserCount(Long AbnormalUserCount) {
        this.AbnormalUserCount = AbnormalUserCount;
    }

    /**
     * Get Number of users for the cloud account 
     * @return UserCount Number of users for the cloud account
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set Number of users for the cloud account
     * @param UserCount Number of users for the cloud account
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get Number of sub-users 
     * @return SubUserCount Number of sub-users
     */
    public Long getSubUserCount() {
        return this.SubUserCount;
    }

    /**
     * Set Number of sub-users
     * @param SubUserCount Number of sub-users
     */
    public void setSubUserCount(Long SubUserCount) {
        this.SubUserCount = SubUserCount;
    }

    /**
     * Get Number of custom users 
     * @return CustomUserCount Number of custom users
     */
    public Long getCustomUserCount() {
        return this.CustomUserCount;
    }

    /**
     * Set Number of custom users
     * @param CustomUserCount Number of custom users
     */
    public void setCustomUserCount(Long CustomUserCount) {
        this.CustomUserCount = CustomUserCount;
    }

    /**
     * Get Custom user sum building block 
     * @return Element Custom user sum building block
     */
    public UebaUserSummaryElement [] getElement() {
        return this.Element;
    }

    /**
     * Set Custom user sum building block
     * @param Element Custom user sum building block
     */
    public void setElement(UebaUserSummaryElement [] Element) {
        this.Element = Element;
    }

    public UebaUserSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UebaUserSummary(UebaUserSummary source) {
        if (source.AllUserCount != null) {
            this.AllUserCount = new Long(source.AllUserCount);
        }
        if (source.AbnormalUserCount != null) {
            this.AbnormalUserCount = new Long(source.AbnormalUserCount);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
        if (source.SubUserCount != null) {
            this.SubUserCount = new Long(source.SubUserCount);
        }
        if (source.CustomUserCount != null) {
            this.CustomUserCount = new Long(source.CustomUserCount);
        }
        if (source.Element != null) {
            this.Element = new UebaUserSummaryElement[source.Element.length];
            for (int i = 0; i < source.Element.length; i++) {
                this.Element[i] = new UebaUserSummaryElement(source.Element[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllUserCount", this.AllUserCount);
        this.setParamSimple(map, prefix + "AbnormalUserCount", this.AbnormalUserCount);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);
        this.setParamSimple(map, prefix + "SubUserCount", this.SubUserCount);
        this.setParamSimple(map, prefix + "CustomUserCount", this.CustomUserCount);
        this.setParamArrayObj(map, prefix + "Element.", this.Element);

    }
}

