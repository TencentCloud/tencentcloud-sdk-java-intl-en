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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDefenceOverview extends AbstractModel {

    /**
    * Defense switch: 0 - disable; 1 - enable
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Number of hosts with defense enabled
    */
    @SerializedName("DefendHostCount")
    @Expose
    private Long DefendHostCount;

    /**
    * Number of plugin exceptions
    */
    @SerializedName("ExceptionCount")
    @Expose
    private Long ExceptionCount;

    /**
    * Daily attack trends
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackCounts")
    @Expose
    private Long [] AttackCounts;

    /**
    * Daily defense trends
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefendCounts")
    @Expose
    private Long [] DefendCounts;

    /**
    * Date
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Date")
    @Expose
    private String [] Date;

    /**
     * Get Defense switch: 0 - disable; 1 - enable 
     * @return Enable Defense switch: 0 - disable; 1 - enable
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Defense switch: 0 - disable; 1 - enable
     * @param Enable Defense switch: 0 - disable; 1 - enable
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Number of hosts with defense enabled 
     * @return DefendHostCount Number of hosts with defense enabled
     */
    public Long getDefendHostCount() {
        return this.DefendHostCount;
    }

    /**
     * Set Number of hosts with defense enabled
     * @param DefendHostCount Number of hosts with defense enabled
     */
    public void setDefendHostCount(Long DefendHostCount) {
        this.DefendHostCount = DefendHostCount;
    }

    /**
     * Get Number of plugin exceptions 
     * @return ExceptionCount Number of plugin exceptions
     */
    public Long getExceptionCount() {
        return this.ExceptionCount;
    }

    /**
     * Set Number of plugin exceptions
     * @param ExceptionCount Number of plugin exceptions
     */
    public void setExceptionCount(Long ExceptionCount) {
        this.ExceptionCount = ExceptionCount;
    }

    /**
     * Get Daily attack trends
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackCounts Daily attack trends
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getAttackCounts() {
        return this.AttackCounts;
    }

    /**
     * Set Daily attack trends
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackCounts Daily attack trends
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackCounts(Long [] AttackCounts) {
        this.AttackCounts = AttackCounts;
    }

    /**
     * Get Daily defense trends
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefendCounts Daily defense trends
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getDefendCounts() {
        return this.DefendCounts;
    }

    /**
     * Set Daily defense trends
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefendCounts Daily defense trends
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefendCounts(Long [] DefendCounts) {
        this.DefendCounts = DefendCounts;
    }

    /**
     * Get Date
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Date Date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDate() {
        return this.Date;
    }

    /**
     * Set Date
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Date Date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDate(String [] Date) {
        this.Date = Date;
    }

    public VulDefenceOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceOverview(VulDefenceOverview source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.DefendHostCount != null) {
            this.DefendHostCount = new Long(source.DefendHostCount);
        }
        if (source.ExceptionCount != null) {
            this.ExceptionCount = new Long(source.ExceptionCount);
        }
        if (source.AttackCounts != null) {
            this.AttackCounts = new Long[source.AttackCounts.length];
            for (int i = 0; i < source.AttackCounts.length; i++) {
                this.AttackCounts[i] = new Long(source.AttackCounts[i]);
            }
        }
        if (source.DefendCounts != null) {
            this.DefendCounts = new Long[source.DefendCounts.length];
            for (int i = 0; i < source.DefendCounts.length; i++) {
                this.DefendCounts[i] = new Long(source.DefendCounts[i]);
            }
        }
        if (source.Date != null) {
            this.Date = new String[source.Date.length];
            for (int i = 0; i < source.Date.length; i++) {
                this.Date[i] = new String(source.Date[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "DefendHostCount", this.DefendHostCount);
        this.setParamSimple(map, prefix + "ExceptionCount", this.ExceptionCount);
        this.setParamArraySimple(map, prefix + "AttackCounts.", this.AttackCounts);
        this.setParamArraySimple(map, prefix + "DefendCounts.", this.DefendCounts);
        this.setParamArraySimple(map, prefix + "Date.", this.Date);

    }
}

