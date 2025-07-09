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

public class NetAttackTrend extends AbstractModel {

    /**
    * Time Point, e.g., 2023-05-06
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DateTime")
    @Expose
    private String DateTime;

    /**
    * Number of attacks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * Attack Attempts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TryAttackCount")
    @Expose
    private Long TryAttackCount;

    /**
    * Attack Success Count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuccAttackCount")
    @Expose
    private Long SuccAttackCount;

    /**
     * Get Time Point, e.g., 2023-05-06
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DateTime Time Point, e.g., 2023-05-06
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDateTime() {
        return this.DateTime;
    }

    /**
     * Set Time Point, e.g., 2023-05-06
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DateTime Time Point, e.g., 2023-05-06
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    /**
     * Get Number of attacks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackCount Number of attacks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set Number of attacks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackCount Number of attacks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get Attack Attempts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TryAttackCount Attack Attempts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTryAttackCount() {
        return this.TryAttackCount;
    }

    /**
     * Set Attack Attempts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TryAttackCount Attack Attempts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTryAttackCount(Long TryAttackCount) {
        this.TryAttackCount = TryAttackCount;
    }

    /**
     * Get Attack Success Count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuccAttackCount Attack Success Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSuccAttackCount() {
        return this.SuccAttackCount;
    }

    /**
     * Set Attack Success Count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuccAttackCount Attack Success Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuccAttackCount(Long SuccAttackCount) {
        this.SuccAttackCount = SuccAttackCount;
    }

    public NetAttackTrend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAttackTrend(NetAttackTrend source) {
        if (source.DateTime != null) {
            this.DateTime = new String(source.DateTime);
        }
        if (source.AttackCount != null) {
            this.AttackCount = new Long(source.AttackCount);
        }
        if (source.TryAttackCount != null) {
            this.TryAttackCount = new Long(source.TryAttackCount);
        }
        if (source.SuccAttackCount != null) {
            this.SuccAttackCount = new Long(source.SuccAttackCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateTime", this.DateTime);
        this.setParamSimple(map, prefix + "AttackCount", this.AttackCount);
        this.setParamSimple(map, prefix + "TryAttackCount", this.TryAttackCount);
        this.setParamSimple(map, prefix + "SuccAttackCount", this.SuccAttackCount);

    }
}

