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

public class DspmAccountCount extends AbstractModel {

    /**
    * Number of cloud accounts
    */
    @SerializedName("UinAccountCount")
    @Expose
    private Long UinAccountCount;

    /**
    * Guest account count
    */
    @SerializedName("PersonCount")
    @Expose
    private Long PersonCount;

    /**
    * Number of unmanaged accounts
    */
    @SerializedName("UncontrolledAccountCount")
    @Expose
    private Long UncontrolledAccountCount;

    /**
    * Total number of accounts
    */
    @SerializedName("TotalAccountCount")
    @Expose
    private Long TotalAccountCount;

    /**
     * Get Number of cloud accounts 
     * @return UinAccountCount Number of cloud accounts
     */
    public Long getUinAccountCount() {
        return this.UinAccountCount;
    }

    /**
     * Set Number of cloud accounts
     * @param UinAccountCount Number of cloud accounts
     */
    public void setUinAccountCount(Long UinAccountCount) {
        this.UinAccountCount = UinAccountCount;
    }

    /**
     * Get Guest account count 
     * @return PersonCount Guest account count
     */
    public Long getPersonCount() {
        return this.PersonCount;
    }

    /**
     * Set Guest account count
     * @param PersonCount Guest account count
     */
    public void setPersonCount(Long PersonCount) {
        this.PersonCount = PersonCount;
    }

    /**
     * Get Number of unmanaged accounts 
     * @return UncontrolledAccountCount Number of unmanaged accounts
     */
    public Long getUncontrolledAccountCount() {
        return this.UncontrolledAccountCount;
    }

    /**
     * Set Number of unmanaged accounts
     * @param UncontrolledAccountCount Number of unmanaged accounts
     */
    public void setUncontrolledAccountCount(Long UncontrolledAccountCount) {
        this.UncontrolledAccountCount = UncontrolledAccountCount;
    }

    /**
     * Get Total number of accounts 
     * @return TotalAccountCount Total number of accounts
     */
    public Long getTotalAccountCount() {
        return this.TotalAccountCount;
    }

    /**
     * Set Total number of accounts
     * @param TotalAccountCount Total number of accounts
     */
    public void setTotalAccountCount(Long TotalAccountCount) {
        this.TotalAccountCount = TotalAccountCount;
    }

    public DspmAccountCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAccountCount(DspmAccountCount source) {
        if (source.UinAccountCount != null) {
            this.UinAccountCount = new Long(source.UinAccountCount);
        }
        if (source.PersonCount != null) {
            this.PersonCount = new Long(source.PersonCount);
        }
        if (source.UncontrolledAccountCount != null) {
            this.UncontrolledAccountCount = new Long(source.UncontrolledAccountCount);
        }
        if (source.TotalAccountCount != null) {
            this.TotalAccountCount = new Long(source.TotalAccountCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UinAccountCount", this.UinAccountCount);
        this.setParamSimple(map, prefix + "PersonCount", this.PersonCount);
        this.setParamSimple(map, prefix + "UncontrolledAccountCount", this.UncontrolledAccountCount);
        this.setParamSimple(map, prefix + "TotalAccountCount", this.TotalAccountCount);

    }
}

