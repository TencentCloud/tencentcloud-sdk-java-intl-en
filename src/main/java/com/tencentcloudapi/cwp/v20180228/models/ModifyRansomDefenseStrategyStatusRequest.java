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

public class ModifyRansomDefenseStrategyStatusRequest extends AbstractModel {

    /**
    * Apply to all policies: 0 No, 1 Yes.
    */
    @SerializedName("IsAll")
    @Expose
    private Long IsAll;

    /**
    * 0 for Off, 1 for On, 9 for Delete
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Policy ID List
    */
    @SerializedName("IdList")
    @Expose
    private Long [] IdList;

    /**
     * Get Apply to all policies: 0 No, 1 Yes. 
     * @return IsAll Apply to all policies: 0 No, 1 Yes.
     */
    public Long getIsAll() {
        return this.IsAll;
    }

    /**
     * Set Apply to all policies: 0 No, 1 Yes.
     * @param IsAll Apply to all policies: 0 No, 1 Yes.
     */
    public void setIsAll(Long IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get 0 for Off, 1 for On, 9 for Delete 
     * @return Status 0 for Off, 1 for On, 9 for Delete
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0 for Off, 1 for On, 9 for Delete
     * @param Status 0 for Off, 1 for On, 9 for Delete
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Policy ID List 
     * @return IdList Policy ID List
     */
    public Long [] getIdList() {
        return this.IdList;
    }

    /**
     * Set Policy ID List
     * @param IdList Policy ID List
     */
    public void setIdList(Long [] IdList) {
        this.IdList = IdList;
    }

    public ModifyRansomDefenseStrategyStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRansomDefenseStrategyStatusRequest(ModifyRansomDefenseStrategyStatusRequest source) {
        if (source.IsAll != null) {
            this.IsAll = new Long(source.IsAll);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IdList != null) {
            this.IdList = new Long[source.IdList.length];
            for (int i = 0; i < source.IdList.length; i++) {
                this.IdList[i] = new Long(source.IdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "IdList.", this.IdList);

    }
}

