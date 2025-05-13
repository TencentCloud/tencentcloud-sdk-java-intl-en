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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchResultDs extends AbstractModel {

    /**
    * Number of successes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Success")
    @Expose
    private Long Success;

    /**
    * Failure count.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Failed")
    @Expose
    private Long Failed;

    /**
    * Total.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get Number of successes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Success Number of successes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSuccess() {
        return this.Success;
    }

    /**
     * Set Number of successes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Success Number of successes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuccess(Long Success) {
        this.Success = Success;
    }

    /**
     * Get Failure count.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Failed Failure count.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFailed() {
        return this.Failed;
    }

    /**
     * Set Failure count.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Failed Failure count.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailed(Long Failed) {
        this.Failed = Failed;
    }

    /**
     * Get Total.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total Total.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total Total.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public BatchResultDs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchResultDs(BatchResultDs source) {
        if (source.Success != null) {
            this.Success = new Long(source.Success);
        }
        if (source.Failed != null) {
            this.Failed = new Long(source.Failed);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Failed", this.Failed);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

