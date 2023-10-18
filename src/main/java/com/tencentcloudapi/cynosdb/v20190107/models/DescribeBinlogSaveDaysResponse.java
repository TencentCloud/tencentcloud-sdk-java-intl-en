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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBinlogSaveDaysResponse extends AbstractModel {

    /**
    * Binlog retention period in days
    */
    @SerializedName("BinlogSaveDays")
    @Expose
    private Long BinlogSaveDays;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Binlog retention period in days 
     * @return BinlogSaveDays Binlog retention period in days
     */
    public Long getBinlogSaveDays() {
        return this.BinlogSaveDays;
    }

    /**
     * Set Binlog retention period in days
     * @param BinlogSaveDays Binlog retention period in days
     */
    public void setBinlogSaveDays(Long BinlogSaveDays) {
        this.BinlogSaveDays = BinlogSaveDays;
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

    public DescribeBinlogSaveDaysResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBinlogSaveDaysResponse(DescribeBinlogSaveDaysResponse source) {
        if (source.BinlogSaveDays != null) {
            this.BinlogSaveDays = new Long(source.BinlogSaveDays);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BinlogSaveDays", this.BinlogSaveDays);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

