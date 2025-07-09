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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOpsDTO extends AbstractModel {

    /**
    * Total Quantity
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Success count
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Failure count
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * Failure reason
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FailMessageList")
    @Expose
    private FailMessage [] FailMessageList;

    /**
     * Get Total Quantity
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalCount Total Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalCount Total Quantity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Success count
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SuccessCount Success count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Success count
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SuccessCount Success count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Failure count
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FailCount Failure count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set Failure count
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FailCount Failure count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get Failure reason
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FailMessageList Failure reason
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public FailMessage [] getFailMessageList() {
        return this.FailMessageList;
    }

    /**
     * Set Failure reason
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FailMessageList Failure reason
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFailMessageList(FailMessage [] FailMessageList) {
        this.FailMessageList = FailMessageList;
    }

    public BatchOpsDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOpsDTO(BatchOpsDTO source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.FailMessageList != null) {
            this.FailMessageList = new FailMessage[source.FailMessageList.length];
            for (int i = 0; i < source.FailMessageList.length; i++) {
                this.FailMessageList[i] = new FailMessage(source.FailMessageList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamArrayObj(map, prefix + "FailMessageList.", this.FailMessageList);

    }
}

