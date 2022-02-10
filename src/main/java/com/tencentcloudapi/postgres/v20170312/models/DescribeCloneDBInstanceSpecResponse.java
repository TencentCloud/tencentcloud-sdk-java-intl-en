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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloneDBInstanceSpecResponse extends AbstractModel{

    /**
    * Code of the minimum specification available for purchase.
    */
    @SerializedName("MinSpecCode")
    @Expose
    private String MinSpecCode;

    /**
    * The minimum disk capacity in GB available for purchase.
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Code of the minimum specification available for purchase. 
     * @return MinSpecCode Code of the minimum specification available for purchase.
     */
    public String getMinSpecCode() {
        return this.MinSpecCode;
    }

    /**
     * Set Code of the minimum specification available for purchase.
     * @param MinSpecCode Code of the minimum specification available for purchase.
     */
    public void setMinSpecCode(String MinSpecCode) {
        this.MinSpecCode = MinSpecCode;
    }

    /**
     * Get The minimum disk capacity in GB available for purchase. 
     * @return MinStorage The minimum disk capacity in GB available for purchase.
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set The minimum disk capacity in GB available for purchase.
     * @param MinStorage The minimum disk capacity in GB available for purchase.
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCloneDBInstanceSpecResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloneDBInstanceSpecResponse(DescribeCloneDBInstanceSpecResponse source) {
        if (source.MinSpecCode != null) {
            this.MinSpecCode = new String(source.MinSpecCode);
        }
        if (source.MinStorage != null) {
            this.MinStorage = new Long(source.MinStorage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinSpecCode", this.MinSpecCode);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

