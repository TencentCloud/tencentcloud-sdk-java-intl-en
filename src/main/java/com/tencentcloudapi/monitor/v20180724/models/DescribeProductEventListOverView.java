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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductEventListOverView extends AbstractModel{

    /**
    * Number of events whose statuses have changed.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("StatusChangeAmount")
    @Expose
    private Long StatusChangeAmount;

    /**
    * Number of events whose alarm statuses are not configured.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UnConfigAlarmAmount")
    @Expose
    private Long UnConfigAlarmAmount;

    /**
    * Number of exceptional events.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UnNormalEventAmount")
    @Expose
    private Long UnNormalEventAmount;

    /**
    * Number of events that have not been recovered.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UnRecoverAmount")
    @Expose
    private Long UnRecoverAmount;

    /**
     * Get Number of events whose statuses have changed.
Note: This field may return null, indicating that no valid value was found. 
     * @return StatusChangeAmount Number of events whose statuses have changed.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getStatusChangeAmount() {
        return this.StatusChangeAmount;
    }

    /**
     * Set Number of events whose statuses have changed.
Note: This field may return null, indicating that no valid value was found.
     * @param StatusChangeAmount Number of events whose statuses have changed.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setStatusChangeAmount(Long StatusChangeAmount) {
        this.StatusChangeAmount = StatusChangeAmount;
    }

    /**
     * Get Number of events whose alarm statuses are not configured.
Note: This field may return null, indicating that no valid value was found. 
     * @return UnConfigAlarmAmount Number of events whose alarm statuses are not configured.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getUnConfigAlarmAmount() {
        return this.UnConfigAlarmAmount;
    }

    /**
     * Set Number of events whose alarm statuses are not configured.
Note: This field may return null, indicating that no valid value was found.
     * @param UnConfigAlarmAmount Number of events whose alarm statuses are not configured.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setUnConfigAlarmAmount(Long UnConfigAlarmAmount) {
        this.UnConfigAlarmAmount = UnConfigAlarmAmount;
    }

    /**
     * Get Number of exceptional events.
Note: This field may return null, indicating that no valid value was found. 
     * @return UnNormalEventAmount Number of exceptional events.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getUnNormalEventAmount() {
        return this.UnNormalEventAmount;
    }

    /**
     * Set Number of exceptional events.
Note: This field may return null, indicating that no valid value was found.
     * @param UnNormalEventAmount Number of exceptional events.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setUnNormalEventAmount(Long UnNormalEventAmount) {
        this.UnNormalEventAmount = UnNormalEventAmount;
    }

    /**
     * Get Number of events that have not been recovered.
Note: This field may return null, indicating that no valid value was found. 
     * @return UnRecoverAmount Number of events that have not been recovered.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getUnRecoverAmount() {
        return this.UnRecoverAmount;
    }

    /**
     * Set Number of events that have not been recovered.
Note: This field may return null, indicating that no valid value was found.
     * @param UnRecoverAmount Number of events that have not been recovered.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setUnRecoverAmount(Long UnRecoverAmount) {
        this.UnRecoverAmount = UnRecoverAmount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusChangeAmount", this.StatusChangeAmount);
        this.setParamSimple(map, prefix + "UnConfigAlarmAmount", this.UnConfigAlarmAmount);
        this.setParamSimple(map, prefix + "UnNormalEventAmount", this.UnNormalEventAmount);
        this.setParamSimple(map, prefix + "UnRecoverAmount", this.UnRecoverAmount);

    }
}

