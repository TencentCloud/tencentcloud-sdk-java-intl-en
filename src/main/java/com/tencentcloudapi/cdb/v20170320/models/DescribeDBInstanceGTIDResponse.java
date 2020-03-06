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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceGTIDResponse extends AbstractModel{

    /**
    * GTID enablement flag. Value range: 0 (not enabled), 1 (enabled).
    */
    @SerializedName("IsGTIDOpen")
    @Expose
    private Long IsGTIDOpen;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get GTID enablement flag. Value range: 0 (not enabled), 1 (enabled). 
     * @return IsGTIDOpen GTID enablement flag. Value range: 0 (not enabled), 1 (enabled).
     */
    public Long getIsGTIDOpen() {
        return this.IsGTIDOpen;
    }

    /**
     * Set GTID enablement flag. Value range: 0 (not enabled), 1 (enabled).
     * @param IsGTIDOpen GTID enablement flag. Value range: 0 (not enabled), 1 (enabled).
     */
    public void setIsGTIDOpen(Long IsGTIDOpen) {
        this.IsGTIDOpen = IsGTIDOpen;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsGTIDOpen", this.IsGTIDOpen);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

