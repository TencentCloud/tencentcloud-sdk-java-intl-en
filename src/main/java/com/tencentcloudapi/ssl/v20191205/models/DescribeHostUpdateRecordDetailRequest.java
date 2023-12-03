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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostUpdateRecordDetailRequest extends AbstractModel {

    /**
    * One-click update record ID
    */
    @SerializedName("DeployRecordId")
    @Expose
    private String DeployRecordId;

    /**
    * Number per page, 10 by default.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * Paging offset, starting from 0
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
     * Get One-click update record ID 
     * @return DeployRecordId One-click update record ID
     */
    public String getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set One-click update record ID
     * @param DeployRecordId One-click update record ID
     */
    public void setDeployRecordId(String DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get Number per page, 10 by default. 
     * @return Limit Number per page, 10 by default.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set Number per page, 10 by default.
     * @param Limit Number per page, 10 by default.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Paging offset, starting from 0 
     * @return Offset Paging offset, starting from 0
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset, starting from 0
     * @param Offset Paging offset, starting from 0
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    public DescribeHostUpdateRecordDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostUpdateRecordDetailRequest(DescribeHostUpdateRecordDetailRequest source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new String(source.DeployRecordId);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

